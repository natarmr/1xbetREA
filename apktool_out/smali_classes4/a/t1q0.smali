.class public final La/t1q0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/x1q0;


# direct methods
.method public synthetic constructor <init>(La/x1q0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t1q0;->i:B

    iput-object p1, p0, La/t1q0;->k:La/x1q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/t1q0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/t1q0;

    .line 7
    .line 8
    iget-object p0, p0, La/t1q0;->k:La/x1q0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/t1q0;-><init>(La/x1q0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/t1q0;

    .line 16
    .line 17
    iget-object p0, p0, La/t1q0;->k:La/x1q0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p1, p0, p2, v0}, La/t1q0;-><init>(La/x1q0;La/yje;B)V

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
    iget-byte v0, p0, La/t1q0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/t1q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/t1q0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/t1q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/t1q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/t1q0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/t1q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/t1q0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, p0, La/t1q0;->k:La/x1q0;

    .line 8
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
    iget-byte v6, p0, La/t1q0;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v2, :cond_1

    .line 20
    .line 21
    if-ne v6, v3, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v4, La/x1q0;->j:La/ntu;

    .line 39
    .line 40
    iput-byte v2, p0, La/t1q0;->j:B

    .line 41
    .line 42
    iget-object p1, p1, La/ntu;->a:La/j1q0;

    .line 43
    .line 44
    iget-object p1, p1, La/j1q0;->a:La/m1q0;

    .line 45
    .line 46
    iget-object p1, p1, La/m1q0;->a:La/q7d0;

    .line 47
    .line 48
    const-string v1, "OVERRIDE_UPDATE"

    .line 49
    .line 50
    invoke-virtual {p1, v1, v2}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    iget-object p1, v4, La/x1q0;->u:La/p7m0;

    .line 59
    .line 60
    sget-object v1, La/vd9;->b:La/vd9;

    .line 61
    .line 62
    iput-byte v3, p0, La/t1q0;->j:B

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    if-ne p0, v0, :cond_4

    .line 73
    .line 74
    :goto_1
    move-object v5, v0

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_3
    return-object v5

    .line 79
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 80
    .line 81
    iget-byte v6, p0, La/t1q0;->j:B

    .line 82
    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    if-eq v6, v2, :cond_6

    .line 86
    .line 87
    if-ne v6, v3, :cond_5

    .line 88
    .line 89
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_7

    .line 93
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_8

    .line 97
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, v4, La/x1q0;->d:La/dgk;

    .line 105
    .line 106
    iput-byte v2, p0, La/t1q0;->j:B

    .line 107
    .line 108
    invoke-virtual {p1, v2, p0}, La/dgk;->a(ZLa/bnn0;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v0, :cond_8

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_8
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    const/4 v1, 0x0

    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    iget-object p1, v4, La/x1q0;->k:La/ctf0;

    .line 125
    .line 126
    new-array v2, v1, [Ljava/lang/Object;

    .line 127
    .line 128
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 129
    .line 130
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const v2, 0x7f13153f

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    goto :goto_5

    .line 142
    :cond_9
    iget-object p1, v4, La/x1q0;->k:La/ctf0;

    .line 143
    .line 144
    new-array v2, v1, [Ljava/lang/Object;

    .line 145
    .line 146
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 147
    .line 148
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const v2, 0x7f131551

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    :goto_5
    iget-object v1, v4, La/x1q0;->u:La/p7m0;

    .line 160
    .line 161
    new-instance v2, La/wd9;

    .line 162
    .line 163
    invoke-direct {v2, p1}, La/wd9;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iput-byte v3, p0, La/t1q0;->j:B

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v5, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    if-ne p0, v0, :cond_a

    .line 177
    .line 178
    :goto_6
    move-object v5, v0

    .line 179
    goto :goto_8

    .line 180
    :cond_a
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_8
    return-object v5

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
