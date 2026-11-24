.class public final La/kp70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/sp70;


# direct methods
.method public synthetic constructor <init>(La/sp70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kp70;->i:B

    iput-object p1, p0, La/kp70;->k:La/sp70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kp70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kp70;->k:La/sp70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/kp70;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/kp70;-><init>(La/sp70;La/yje;B)V

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
    iput-boolean p0, v0, La/kp70;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/kp70;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/kp70;-><init>(La/sp70;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/kp70;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/kp70;-><init>(La/sp70;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kp70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kp70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/kp70;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/kp70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/kp70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/kp70;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/kp70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/kp70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/kp70;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/kp70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/kp70;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/kp70;->k:La/sp70;

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
    iget-boolean p0, p0, La/kp70;->j:Z

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2, v3}, La/sp70;->y(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object p0, v2, La/sp70;->r:La/vcu;

    .line 26
    .line 27
    invoke-virtual {p0}, La/vcu;->a()La/vrs;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, La/vrs;->b:La/vrs;

    .line 32
    .line 33
    if-ne p0, p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x0

    .line 37
    :goto_0
    invoke-virtual {v2, v3}, La/sp70;->y(Z)V

    .line 38
    .line 39
    .line 40
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 44
    .line 45
    iget-boolean v5, p0, La/kp70;->j:Z

    .line 46
    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    if-ne v5, v3, :cond_2

    .line 50
    .line 51
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, v2, La/sp70;->P:La/p7m0;

    .line 63
    .line 64
    iget-object v1, v2, La/sp70;->Q:La/p7m0;

    .line 65
    .line 66
    iget-object v5, v2, La/sp70;->R:La/p7m0;

    .line 67
    .line 68
    new-instance v6, La/pp70;

    .line 69
    .line 70
    invoke-direct {v6, v2, v4}, La/pp70;-><init>(La/sp70;La/yje;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v1, v5, v6}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-boolean v3, p0, La/kp70;->j:Z

    .line 78
    .line 79
    invoke-static {p1, p0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-ne p0, v0, :cond_4

    .line 84
    .line 85
    move-object v4, v0

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    :goto_3
    return-object v4

    .line 90
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 91
    .line 92
    iget-boolean v5, p0, La/kp70;->j:Z

    .line 93
    .line 94
    if-eqz v5, :cond_6

    .line 95
    .line 96
    if-ne v5, v3, :cond_5

    .line 97
    .line 98
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, v2, La/sp70;->v:La/fpx;

    .line 110
    .line 111
    iget-object v1, v2, La/sp70;->I:La/y5s;

    .line 112
    .line 113
    iget-object v1, v1, La/y5s;->a:La/s470;

    .line 114
    .line 115
    invoke-virtual {v1}, La/s470;->a()J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    iput-boolean v3, p0, La/kp70;->j:Z

    .line 120
    .line 121
    invoke-virtual {p1, v5, v6, p0}, La/fpx;->a(JLa/zje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v0, :cond_7

    .line 126
    .line 127
    move-object v4, v0

    .line 128
    goto :goto_5

    .line 129
    :cond_7
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    iget-object p1, v2, La/sp70;->u:La/tni0;

    .line 136
    .line 137
    invoke-virtual {p1, p0}, La/tni0;->a(Z)V

    .line 138
    .line 139
    .line 140
    iget-object p0, v2, La/sp70;->R:La/p7m0;

    .line 141
    .line 142
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v4, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_5
    return-object v4

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
