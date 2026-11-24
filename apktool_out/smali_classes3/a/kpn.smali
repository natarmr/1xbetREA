.class public final La/kpn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/mpn;


# direct methods
.method public synthetic constructor <init>(La/mpn;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kpn;->i:B

    iput-object p1, p0, La/kpn;->k:La/mpn;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kpn;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kpn;->k:La/mpn;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/kpn;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/kpn;-><init>(La/mpn;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/kpn;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/kpn;-><init>(La/mpn;La/yje;B)V

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
    iget-byte v0, p0, La/kpn;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/kpn;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/kpn;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/kpn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/kpn;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/kpn;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/kpn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/kpn;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/kpn;->k:La/mpn;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/kpn;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    iput-boolean v3, p0, La/kpn;->j:Z

    .line 32
    .line 33
    const-wide/16 v2, 0x12c

    .line 34
    .line 35
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v4, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget p0, La/mpn;->K:I

    .line 44
    .line 45
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 46
    .line 47
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-object p1, p0

    .line 57
    check-cast p1, La/ipn;

    .line 58
    .line 59
    sget-object v1, La/non;->a:La/non;

    .line 60
    .line 61
    invoke-static {p1, v1}, La/ipn;->a(La/ipn;La/oon;)La/ipn;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_1
    return-object v4

    .line 74
    :pswitch_0
    iget-object v0, v1, La/mpn;->B:La/m1e;

    .line 75
    .line 76
    sget-object v5, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v6, p0, La/kpn;->j:Z

    .line 79
    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    if-ne v6, v3, :cond_4

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-boolean v3, p0, La/kpn;->j:Z

    .line 100
    .line 101
    invoke-static {p1, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v5, :cond_6

    .line 106
    .line 107
    move-object v4, v5

    .line 108
    goto :goto_3

    .line 109
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-nez p0, :cond_8

    .line 116
    .line 117
    sget p0, La/mpn;->K:I

    .line 118
    .line 119
    invoke-virtual {v1}, La/mpn;->M()V

    .line 120
    .line 121
    .line 122
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 123
    .line 124
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 125
    .line 126
    :cond_7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v2, v1, La/i3t0;->f:La/oyg0;

    .line 134
    .line 135
    move-object v3, p1

    .line 136
    check-cast v3, La/ipn;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sget-object v2, La/lon;->a:La/lon;

    .line 142
    .line 143
    invoke-static {v3, v2}, La/ipn;->a(La/ipn;La/oon;)La/ipn;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {p0, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_7

    .line 152
    .line 153
    :cond_8
    sget p0, La/mpn;->K:I

    .line 154
    .line 155
    iget-object p0, v1, La/mpn;->I:La/c4m0;

    .line 156
    .line 157
    if-eqz p0, :cond_9

    .line 158
    .line 159
    invoke-virtual {p0, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 160
    .line 161
    .line 162
    :cond_9
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    new-instance p1, La/hij;

    .line 167
    .line 168
    const/16 v0, 0x8

    .line 169
    .line 170
    invoke-direct {p1, v1, v4, v0}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 171
    .line 172
    .line 173
    new-instance v0, La/fnq;

    .line 174
    .line 175
    const/4 v2, 0x4

    .line 176
    invoke-direct {v0, p0, p1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 177
    .line 178
    .line 179
    const/4 p0, 0x3

    .line 180
    invoke-static {v1, v0, v4, v4, p0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    iput-object p0, v1, La/mpn;->I:La/c4m0;

    .line 185
    .line 186
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    :goto_3
    return-object v4

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
