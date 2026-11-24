.class public final La/zt4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ku4;

.field public final synthetic l:La/xo4;


# direct methods
.method public synthetic constructor <init>(La/ku4;La/xo4;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zt4;->i:B

    iput-object p1, p0, La/zt4;->k:La/ku4;

    iput-object p2, p0, La/zt4;->l:La/xo4;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/zt4;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/zt4;->l:La/xo4;

    .line 4
    .line 5
    iget-object p0, p0, La/zt4;->k:La/ku4;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/zt4;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/zt4;-><init>(La/ku4;La/xo4;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/zt4;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/zt4;-><init>(La/ku4;La/xo4;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zt4;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zt4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zt4;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zt4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zt4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zt4;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zt4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/zt4;->i:B

    .line 2
    .line 3
    sget-object v1, La/vt4;->a:La/vt4;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, p0, La/zt4;->k:La/ku4;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, p0, La/zt4;->l:La/xo4;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v6, La/xo4;->j:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v7, p0, La/zt4;->j:Z

    .line 21
    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-ne v7, v5, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p1, La/ku4;->J:La/qq4;

    .line 38
    .line 39
    invoke-virtual {v4, v1}, La/ku4;->G(La/xt4;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, v4, La/ku4;->e:La/dkj;

    .line 43
    .line 44
    iput-boolean v5, p0, La/zt4;->j:Z

    .line 45
    .line 46
    iget-object p1, p1, La/dkj;->a:La/ts4;

    .line 47
    .line 48
    iget-object v1, p1, La/ts4;->m:La/zo4;

    .line 49
    .line 50
    invoke-virtual {v1}, La/zo4;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, La/ws4;

    .line 55
    .line 56
    iget-object p1, p1, La/ts4;->h:La/btt0;

    .line 57
    .line 58
    invoke-virtual {p1}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v2, "application/vnd.xenvelop+json"

    .line 63
    .line 64
    invoke-interface {v1, p1, v0, v2, p0}, La/ws4;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-ne p0, v6, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_0
    if-ne p0, v6, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_1
    if-ne p0, v6, :cond_4

    .line 79
    .line 80
    move-object v2, v6

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    iget-object p0, v4, La/ku4;->v:La/ol60;

    .line 83
    .line 84
    new-instance p1, La/mt4;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-direct {p1, v0}, La/mt4;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v5}, La/ku4;->A(Z)V

    .line 97
    .line 98
    .line 99
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    :goto_3
    return-object v2

    .line 102
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 103
    .line 104
    iget-boolean v7, p0, La/zt4;->j:Z

    .line 105
    .line 106
    if-eqz v7, :cond_6

    .line 107
    .line 108
    if-ne v7, v5, :cond_5

    .line 109
    .line 110
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sget-object p1, La/ku4;->J:La/qq4;

    .line 122
    .line 123
    invoke-virtual {v4, v1}, La/ku4;->G(La/xt4;)V

    .line 124
    .line 125
    .line 126
    iget-object p1, v4, La/ku4;->d:La/oif0;

    .line 127
    .line 128
    iget-object v1, v6, La/xo4;->j:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v2, v6, La/xo4;->l:Ljava/lang/String;

    .line 131
    .line 132
    iput-boolean v5, p0, La/zt4;->j:Z

    .line 133
    .line 134
    invoke-virtual {p1, v1, v2, p0}, La/oif0;->B(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-ne p0, v0, :cond_7

    .line 139
    .line 140
    move-object v2, v0

    .line 141
    goto :goto_5

    .line 142
    :cond_7
    :goto_4
    sget-object p0, La/ku4;->J:La/qq4;

    .line 143
    .line 144
    invoke-virtual {v4, v5}, La/ku4;->A(Z)V

    .line 145
    .line 146
    .line 147
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_5
    return-object v2

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
