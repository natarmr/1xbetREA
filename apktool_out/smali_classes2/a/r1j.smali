.class public final La/r1j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/u1j;


# direct methods
.method public synthetic constructor <init>(La/u1j;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r1j;->i:B

    iput-object p1, p0, La/r1j;->k:La/u1j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r1j;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r1j;->k:La/u1j;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r1j;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r1j;-><init>(La/u1j;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/r1j;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/r1j;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/r1j;-><init>(La/u1j;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/r1j;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/r1j;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/r1j;-><init>(La/u1j;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/r1j;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r1j;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vmt0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r1j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r1j;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r1j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r1j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r1j;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r1j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/r1j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/r1j;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/r1j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/r1j;->i:B

    .line 2
    .line 3
    sget-object v1, La/y1j;->a:La/y1j;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/r1j;->k:La/u1j;

    .line 8
    .line 9
    iget-object p0, p0, La/r1j;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/vmt0;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of p1, p0, La/smt0;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    iget-object p0, v4, La/u1j;->x:La/c4m0;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget-object p0, v4, La/u1j;->r:La/mne;

    .line 40
    .line 41
    iget-object v8, p0, La/mne;->b:La/dvj;

    .line 42
    .line 43
    sget-object v6, La/s1j;->a:La/s1j;

    .line 44
    .line 45
    new-instance v9, La/t1j;

    .line 46
    .line 47
    invoke-direct {v9, v4, v3, v2}, La/t1j;-><init>(La/u1j;La/yje;B)V

    .line 48
    .line 49
    .line 50
    const/16 v10, 0xa

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    instance-of p0, p0, La/rmt0;

    .line 58
    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    sget p0, La/u1j;->z:I

    .line 62
    .line 63
    invoke-virtual {v4, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    check-cast p0, Ljava/lang/Throwable;

    .line 70
    .line 71
    sget-object v0, La/wne;->a:La/wne;

    .line 72
    .line 73
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v4, La/u1j;->q:La/duj;

    .line 77
    .line 78
    new-instance v0, La/zuh;

    .line 79
    .line 80
    const/16 v1, 0x9

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/zuh;-><init>(B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 92
    .line 93
    sget-object v0, La/wne;->a:La/wne;

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    move-object v0, p1

    .line 113
    check-cast v0, La/n85;

    .line 114
    .line 115
    iget-object v5, v0, La/n85;->g:La/wuo0;

    .line 116
    .line 117
    sget-object v6, La/wuo0;->b:La/wuo0;

    .line 118
    .line 119
    if-ne v5, v6, :cond_4

    .line 120
    .line 121
    invoke-virtual {v0}, La/ipm0;->f()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    move-object v3, p1

    .line 128
    :cond_5
    check-cast v3, La/n85;

    .line 129
    .line 130
    if-eqz v3, :cond_7

    .line 131
    .line 132
    sget p0, La/u1j;->z:I

    .line 133
    .line 134
    iget-object p0, v4, La/i3t0;->i:La/ocj;

    .line 135
    .line 136
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 137
    .line 138
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-object v0, p1

    .line 146
    check-cast v0, La/b2j;

    .line 147
    .line 148
    const/4 v5, 0x2

    .line 149
    invoke-static {v0, v3, v2, v5}, La/b2j;->a(La/b2j;La/n85;ZI)La/b2j;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    :cond_7
    if-nez v3, :cond_8

    .line 160
    .line 161
    sget p0, La/u1j;->z:I

    .line 162
    .line 163
    invoke-virtual {v4, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_8
    iget-object p0, v4, La/u1j;->p:La/h4u;

    .line 167
    .line 168
    iget-object p0, p0, La/h4u;->a:La/roi0;

    .line 169
    .line 170
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p0, La/q7d0;

    .line 173
    .line 174
    const-string p1, "DAILY_EVENTS_DIALOG_SHOWN"

    .line 175
    .line 176
    const/4 v0, 0x1

    .line 177
    invoke-virtual {p0, p1, v0}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
