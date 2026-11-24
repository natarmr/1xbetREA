.class public final La/h3p0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/i3p0;


# direct methods
.method public synthetic constructor <init>(La/i3p0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h3p0;->i:B

    iput-object p1, p0, La/h3p0;->l:La/i3p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/h3p0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h3p0;->l:La/i3p0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/h3p0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/h3p0;-><init>(La/i3p0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/h3p0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/h3p0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/h3p0;-><init>(La/i3p0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/h3p0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h3p0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/h3p0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h3p0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h3p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/h3p0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/h3p0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/h3p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/h3p0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/h3p0;->l:La/i3p0;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/h3p0;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/vne;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v5, p0, La/h3p0;->j:Z

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    if-ne v5, v3, :cond_0

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 36
    .line 37
    iget-object p1, v1, La/i3p0;->p:La/dyu;

    .line 38
    .line 39
    iget-object v1, v1, La/i3p0;->o:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 40
    .line 41
    iget-object v1, v1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v4, p0, La/h3p0;->k:Ljava/lang/Object;

    .line 44
    .line 45
    iput-boolean v3, p0, La/h3p0;->j:Z

    .line 46
    .line 47
    iget-object p1, p1, La/dyu;->a:La/ywu;

    .line 48
    .line 49
    invoke-virtual {p1, v1, p0}, La/ywu;->s(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_0
    check-cast p1, La/t1p0;

    .line 58
    .line 59
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 64
    .line 65
    new-instance p1, La/g0g0;

    .line 66
    .line 67
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    new-instance v4, La/j0g0;

    .line 71
    .line 72
    invoke-direct {v4, p1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    return-object v4

    .line 76
    :pswitch_0
    iget-object v0, p0, La/h3p0;->k:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La/vne;

    .line 79
    .line 80
    sget-object v0, La/wne;->a:La/wne;

    .line 81
    .line 82
    iget-boolean v5, p0, La/h3p0;->j:Z

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    if-ne v5, v3, :cond_3

    .line 87
    .line 88
    :try_start_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :try_start_3
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 100
    .line 101
    iget-object p1, v1, La/i3p0;->q:La/dyu;

    .line 102
    .line 103
    iget-object v1, v1, La/i3p0;->o:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 104
    .line 105
    iget-object v1, v1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v4, p0, La/h3p0;->k:Ljava/lang/Object;

    .line 108
    .line 109
    iput-boolean v3, p0, La/h3p0;->j:Z

    .line 110
    .line 111
    iget-object p1, p1, La/dyu;->a:La/ywu;

    .line 112
    .line 113
    invoke-virtual {p1, v1, p0}, La/ywu;->t(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v0, :cond_5

    .line 118
    .line 119
    move-object v4, v0

    .line 120
    goto :goto_5

    .line 121
    :cond_5
    :goto_3
    check-cast p1, La/nfp0;

    .line 122
    .line 123
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 128
    .line 129
    new-instance p1, La/g0g0;

    .line 130
    .line 131
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :goto_4
    new-instance v4, La/j0g0;

    .line 135
    .line 136
    invoke-direct {v4, p1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :goto_5
    return-object v4

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
