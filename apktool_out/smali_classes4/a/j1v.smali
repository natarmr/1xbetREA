.class public final La/j1v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:La/kmq;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/j1v;->i:B

    iput-object p1, p0, La/j1v;->l:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j1v;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/j1v;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Throwable;

    .line 8
    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p2, La/j1v;

    .line 15
    .line 16
    check-cast p0, La/rrd;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p2, p0, p3, v0}, La/j1v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p2, La/j1v;->k:La/kmq;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p2, p0}, La/j1v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance p2, La/j1v;

    .line 32
    .line 33
    check-cast p0, La/wdu;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p2, p0, p3, v0}, La/j1v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p2, La/j1v;->k:La/kmq;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p2, p0}, La/j1v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/j1v;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/j1v;->l:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/j1v;->k:La/kmq;

    .line 14
    .line 15
    sget-object v6, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v7, p0, La/j1v;->j:B

    .line 18
    .line 19
    if-eqz v7, :cond_2

    .line 20
    .line 21
    if-eq v7, v3, :cond_1

    .line 22
    .line 23
    if-ne v7, v4, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    check-cast v1, La/rrd;

    .line 41
    .line 42
    iget-object p1, v1, La/rrd;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, La/ivn;

    .line 45
    .line 46
    sget-object v1, La/y9s;->b:La/y9s;

    .line 47
    .line 48
    iget-object p1, p1, La/ivn;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, La/w5z;

    .line 51
    .line 52
    invoke-virtual {p1, v1}, La/w5z;->r(La/y9s;)La/gmq;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object v0, p0, La/j1v;->k:La/kmq;

    .line 57
    .line 58
    iput-byte v3, p0, La/j1v;->j:B

    .line 59
    .line 60
    invoke-static {p1, p0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v6, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/Collection;

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    :cond_4
    sget-object p1, La/iun;->a:La/iun;

    .line 78
    .line 79
    iput-object v5, p0, La/j1v;->k:La/kmq;

    .line 80
    .line 81
    iput-byte v4, p0, La/j1v;->j:B

    .line 82
    .line 83
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v6, :cond_5

    .line 88
    .line 89
    :goto_1
    move-object v5, v6

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    :goto_3
    return-object v5

    .line 94
    :pswitch_0
    iget-object v0, p0, La/j1v;->k:La/kmq;

    .line 95
    .line 96
    sget-object v6, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-byte v7, p0, La/j1v;->j:B

    .line 99
    .line 100
    if-eqz v7, :cond_8

    .line 101
    .line 102
    if-eq v7, v3, :cond_7

    .line 103
    .line 104
    if-ne v7, v4, :cond_6

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    check-cast v1, La/wdu;

    .line 122
    .line 123
    iget-object p1, v1, La/wdu;->e:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, La/ivn;

    .line 126
    .line 127
    sget-object v1, La/y9s;->a:La/y9s;

    .line 128
    .line 129
    iget-object p1, p1, La/ivn;->a:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, La/w5z;

    .line 132
    .line 133
    invoke-virtual {p1, v1}, La/w5z;->r(La/y9s;)La/gmq;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iput-object v0, p0, La/j1v;->k:La/kmq;

    .line 138
    .line 139
    iput-byte v3, p0, La/j1v;->j:B

    .line 140
    .line 141
    invoke-static {p1, p0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-ne p1, v6, :cond_9

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_9
    :goto_4
    check-cast p1, Ljava/util/Collection;

    .line 149
    .line 150
    if-eqz p1, :cond_a

    .line 151
    .line 152
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_b

    .line 157
    .line 158
    :cond_a
    sget-object p1, La/iun;->a:La/iun;

    .line 159
    .line 160
    iput-object v5, p0, La/j1v;->k:La/kmq;

    .line 161
    .line 162
    iput-byte v4, p0, La/j1v;->j:B

    .line 163
    .line 164
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-ne p0, v6, :cond_b

    .line 169
    .line 170
    :goto_5
    move-object v5, v6

    .line 171
    goto :goto_7

    .line 172
    :cond_b
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_7
    return-object v5

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
