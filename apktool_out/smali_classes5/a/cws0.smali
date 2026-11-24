.class public final La/cws0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/dws0;


# direct methods
.method public synthetic constructor <init>(La/dws0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cws0;->i:B

    iput-object p1, p0, La/cws0;->k:La/dws0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cws0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/cws0;->k:La/dws0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/cws0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/cws0;-><init>(La/dws0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/cws0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/cws0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/cws0;-><init>(La/dws0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cws0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/cws0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/cws0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/cws0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/cws0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/cws0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/cws0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/cws0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/cws0;->k:La/dws0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v8, p0, La/cws0;->j:Z

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, La/dws0;->i:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v2, p0

    .line 22
    check-cast v2, La/bws0;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/16 v9, 0x1f

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-static/range {v2 .. v9}, La/bws0;->a(La/bws0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)La/bws0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    iget-object v0, v1, La/dws0;->i:La/p7m0;

    .line 45
    .line 46
    sget-object v2, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget-boolean v3, p0, La/cws0;->j:Z

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    if-ne v3, v4, :cond_1

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    move-object v5, p1

    .line 74
    check-cast v5, La/bws0;

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/16 v12, 0x3e

    .line 78
    .line 79
    const/4 v6, 0x1

    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v10, 0x0

    .line 84
    invoke-static/range {v5 .. v12}, La/bws0;->a(La/bws0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)La/bws0;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v0, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    iget-object p1, v1, La/dws0;->h:La/im4;

    .line 95
    .line 96
    new-instance v3, La/wl4;

    .line 97
    .line 98
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/bws0;

    .line 103
    .line 104
    iget-object v0, v0, La/bws0;->c:Ljava/lang/String;

    .line 105
    .line 106
    invoke-direct {v3, v0}, La/wl4;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iput-boolean v4, p0, La/cws0;->j:Z

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v3, p0}, La/im4;->j(La/xl4;La/yje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, v2, :cond_4

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    :goto_0
    iget-object p0, v1, La/dws0;->j:La/ol60;

    .line 122
    .line 123
    new-instance p1, La/xvs0;

    .line 124
    .line 125
    sget-object v0, La/qvs0;->a:La/qvs0;

    .line 126
    .line 127
    invoke-direct {p1, v0}, La/xvs0;-><init>(La/rvs0;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    :goto_1
    return-object v2

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
