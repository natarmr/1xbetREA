.class public final La/xwk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Throwable;

.field public final synthetic l:La/yhi;


# direct methods
.method public synthetic constructor <init>(La/yhi;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xwk0;->i:B

    iput-object p1, p0, La/xwk0;->l:La/yhi;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xwk0;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p3, La/yje;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, La/xwk0;

    .line 13
    .line 14
    iget-object p0, p0, La/xwk0;->l:La/yhi;

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-direct {p1, p0, p3, v0}, La/xwk0;-><init>(La/yhi;La/yje;B)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p1, La/xwk0;->k:Ljava/lang/Throwable;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, La/xwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance p1, La/xwk0;

    .line 30
    .line 31
    iget-object p0, p0, La/xwk0;->l:La/yhi;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-direct {p1, p0, p3, v0}, La/xwk0;-><init>(La/yhi;La/yje;B)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p1, La/xwk0;->k:Ljava/lang/Throwable;

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, La/xwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    new-instance p1, La/xwk0;

    .line 47
    .line 48
    iget-object p0, p0, La/xwk0;->l:La/yhi;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-direct {p1, p0, p3, v0}, La/xwk0;-><init>(La/yhi;La/yje;B)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p1, La/xwk0;->k:Ljava/lang/Throwable;

    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, La/xwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/xwk0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/xwk0;->l:La/yhi;

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
    iget-object v0, p0, La/xwk0;->k:Ljava/lang/Throwable;

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/xwk0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v1, La/yhi;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/bqx;

    .line 36
    .line 37
    new-instance v1, La/bqk0;

    .line 38
    .line 39
    invoke-direct {v1, v0}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    iput-object v4, p0, La/xwk0;->k:Ljava/lang/Throwable;

    .line 43
    .line 44
    iput-boolean v3, p0, La/xwk0;->j:Z

    .line 45
    .line 46
    invoke-virtual {p1, v1, p0}, La/bqx;->a(La/dqk0;La/bnn0;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-ne p0, v5, :cond_2

    .line 51
    .line 52
    move-object v4, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_1
    return-object v4

    .line 57
    :pswitch_0
    iget-object v0, p0, La/xwk0;->k:Ljava/lang/Throwable;

    .line 58
    .line 59
    sget-object v5, La/wne;->a:La/wne;

    .line 60
    .line 61
    iget-boolean v6, p0, La/xwk0;->j:Z

    .line 62
    .line 63
    if-eqz v6, :cond_4

    .line 64
    .line 65
    if-ne v6, v3, :cond_3

    .line 66
    .line 67
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v1, La/yhi;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, La/aqx;

    .line 81
    .line 82
    new-instance v1, La/bqk0;

    .line 83
    .line 84
    invoke-direct {v1, v0}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    iput-object v4, p0, La/xwk0;->k:Ljava/lang/Throwable;

    .line 88
    .line 89
    iput-boolean v3, p0, La/xwk0;->j:Z

    .line 90
    .line 91
    invoke-virtual {p1, v1, p0}, La/aqx;->a(La/dqk0;La/bnn0;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-ne p0, v5, :cond_5

    .line 96
    .line 97
    move-object v4, v5

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    :goto_3
    return-object v4

    .line 102
    :pswitch_1
    iget-object v0, p0, La/xwk0;->k:Ljava/lang/Throwable;

    .line 103
    .line 104
    sget-object v5, La/wne;->a:La/wne;

    .line 105
    .line 106
    iget-boolean v6, p0, La/xwk0;->j:Z

    .line 107
    .line 108
    if-eqz v6, :cond_7

    .line 109
    .line 110
    if-ne v6, v3, :cond_6

    .line 111
    .line 112
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v1, La/yhi;->j:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, La/zpx;

    .line 126
    .line 127
    new-instance v2, La/bqk0;

    .line 128
    .line 129
    invoke-direct {v2, v0}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v1, La/yhi;->v:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, La/n0w;

    .line 135
    .line 136
    iput-object v4, p0, La/xwk0;->k:Ljava/lang/Throwable;

    .line 137
    .line 138
    iput-boolean v3, p0, La/xwk0;->j:Z

    .line 139
    .line 140
    invoke-virtual {p1, v2, v0, p0}, La/zpx;->a(La/dqk0;La/n0w;La/bnn0;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-ne p0, v5, :cond_8

    .line 145
    .line 146
    move-object v4, v5

    .line 147
    goto :goto_5

    .line 148
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    :goto_5
    return-object v4

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
