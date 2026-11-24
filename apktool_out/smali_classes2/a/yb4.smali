.class public final La/yb4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:La/kc4;

.field public k:Z

.field public final synthetic l:La/kc4;


# direct methods
.method public synthetic constructor <init>(La/kc4;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yb4;->i:B

    iput-object p1, p0, La/yb4;->l:La/kc4;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yb4;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yb4;->l:La/kc4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yb4;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/yb4;-><init>(La/kc4;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/yb4;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/yb4;-><init>(La/kc4;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yb4;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/yb4;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/yb4;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/yb4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/yb4;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/yb4;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/yb4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/yb4;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/yb4;->l:La/kc4;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v6, p0, La/yb4;->k:Z

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    if-ne v6, v4, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, La/yb4;->j:La/kc4;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 37
    .line 38
    iget-object p1, v2, La/kc4;->w:La/rpt;

    .line 39
    .line 40
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, La/mb4;

    .line 45
    .line 46
    iget v3, v3, La/mb4;->h:I

    .line 47
    .line 48
    iput-object v2, p0, La/yb4;->j:La/kc4;

    .line 49
    .line 50
    iput-boolean v4, p0, La/yb4;->k:Z

    .line 51
    .line 52
    invoke-virtual {p1, v3, p0}, La/rpt;->h(ILa/yje;)Ljava/io/Serializable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    move-object v5, v0

    .line 59
    goto :goto_4

    .line 60
    :cond_2
    :goto_0
    check-cast p1, La/qkt;

    .line 61
    .line 62
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :goto_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 66
    .line 67
    new-instance p1, La/g0g0;

    .line 68
    .line 69
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    instance-of p0, p1, La/g0g0;

    .line 73
    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move-object v5, p1

    .line 78
    :goto_3
    check-cast v5, La/qkt;

    .line 79
    .line 80
    sget p0, La/kc4;->Y:I

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance p0, La/wb4;

    .line 86
    .line 87
    invoke-direct {p0, v5, v1}, La/wb4;-><init>(La/qkt;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    :goto_4
    return-object v5

    .line 96
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-boolean v6, p0, La/yb4;->k:Z

    .line 99
    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    if-ne v6, v4, :cond_4

    .line 103
    .line 104
    iget-object v2, p0, La/yb4;->j:La/kc4;

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, v2, La/kc4;->C:La/ieu;

    .line 118
    .line 119
    iput-object v2, p0, La/yb4;->j:La/kc4;

    .line 120
    .line 121
    iput-boolean v4, p0, La/yb4;->k:Z

    .line 122
    .line 123
    invoke-virtual {p1, p0}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v0, :cond_6

    .line 128
    .line 129
    move-object v5, v0

    .line 130
    goto :goto_6

    .line 131
    :cond_6
    :goto_5
    check-cast p1, La/elt;

    .line 132
    .line 133
    iget p0, p1, La/elt;->e:I

    .line 134
    .line 135
    int-to-long p0, p0

    .line 136
    sget v0, La/kc4;->Y:I

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v0, La/ub4;

    .line 142
    .line 143
    invoke-direct {v0, v2, p0, p1, v1}, La/ub4;-><init>(Ljava/lang/Object;JB)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    :goto_6
    return-object v5

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
