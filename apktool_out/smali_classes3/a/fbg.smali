.class public final La/fbg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/hbg;


# direct methods
.method public synthetic constructor <init>(La/hbg;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fbg;->i:B

    iput-object p1, p0, La/fbg;->k:La/hbg;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fbg;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fbg;->k:La/hbg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/fbg;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/fbg;-><init>(La/hbg;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/fbg;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/fbg;-><init>(La/hbg;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/fbg;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/fbg;-><init>(La/hbg;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/fbg;->j:Z

    .line 35
    .line 36
    return-object v0

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
    iget-byte v0, p0, La/fbg;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/fbg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fbg;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fbg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/fbg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/fbg;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/fbg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/fbg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/fbg;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/fbg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/fbg;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/fbg;->k:La/hbg;

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
    iget-boolean v5, p0, La/fbg;->j:Z

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
    goto :goto_2

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v2, La/hbg;->m:La/uoc;

    .line 32
    .line 33
    iput-boolean v3, p0, La/fbg;->j:Z

    .line 34
    .line 35
    iget-object p1, p1, La/uoc;->a:La/ul9;

    .line 36
    .line 37
    iget-byte v1, p1, La/ul9;->a:B

    .line 38
    .line 39
    packed-switch v1, :pswitch_data_1

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, La/ul9;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, La/s3t0;

    .line 45
    .line 46
    invoke-virtual {p1, p0}, La/s3t0;->a(La/zje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object p1, La/wne;->a:La/wne;

    .line 51
    .line 52
    if-ne p0, p1, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_0
    iget-object p1, p1, La/ul9;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, La/hl9;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, La/hl9;->a(La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, La/wne;->a:La/wne;

    .line 67
    .line 68
    if-ne p0, p1, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_0
    if-ne p0, v0, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_1
    if-ne p0, v0, :cond_5

    .line 79
    .line 80
    move-object v4, v0

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_3
    return-object v4

    .line 85
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 86
    .line 87
    iget-boolean v5, p0, La/fbg;->j:Z

    .line 88
    .line 89
    if-eqz v5, :cond_7

    .line 90
    .line 91
    if-ne v5, v3, :cond_6

    .line 92
    .line 93
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, v2, La/hbg;->g:La/nmo;

    .line 107
    .line 108
    iget-object p1, p1, La/nmo;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, La/ul9;

    .line 111
    .line 112
    iget-byte v1, p1, La/ul9;->a:B

    .line 113
    .line 114
    packed-switch v1, :pswitch_data_2

    .line 115
    .line 116
    .line 117
    iget-object p1, p1, La/ul9;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, La/s3t0;

    .line 120
    .line 121
    iget-object p1, p1, La/s3t0;->f:La/ol60;

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :pswitch_2
    iget-object p1, p1, La/ul9;->d:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, La/hl9;

    .line 127
    .line 128
    iget-object p1, p1, La/hl9;->f:La/ol60;

    .line 129
    .line 130
    :goto_4
    new-instance v1, La/b1f;

    .line 131
    .line 132
    const/16 v5, 0xa

    .line 133
    .line 134
    invoke-direct {v1, v2, v4, v5}, La/b1f;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 135
    .line 136
    .line 137
    iput-boolean v3, p0, La/fbg;->j:Z

    .line 138
    .line 139
    new-instance v2, La/vnq;

    .line 140
    .line 141
    const/4 v3, 0x2

    .line 142
    sget-object v4, La/h660;->a:La/h660;

    .line 143
    .line 144
    invoke-direct {v2, v4, v1, v3}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v2, p0}, La/ol60;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-object v4, v0

    .line 151
    :goto_5
    return-object v4

    .line 152
    :pswitch_3
    iget-boolean p0, p0, La/fbg;->j:Z

    .line 153
    .line 154
    sget-object v0, La/wne;->a:La/wne;

    .line 155
    .line 156
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    if-eqz p0, :cond_9

    .line 160
    .line 161
    iget-object p0, v2, La/hbg;->x:La/bby;

    .line 162
    .line 163
    if-eqz p0, :cond_8

    .line 164
    .line 165
    invoke-interface {p0, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 166
    .line 167
    .line 168
    :cond_8
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget-object p0, v2, La/hbg;->e:La/mne;

    .line 173
    .line 174
    iget-object v8, p0, La/mne;->a:La/rwj;

    .line 175
    .line 176
    new-instance v6, La/aag;

    .line 177
    .line 178
    invoke-direct {v6, v2, v3}, La/aag;-><init>(La/hbg;B)V

    .line 179
    .line 180
    .line 181
    new-instance v9, La/ya;

    .line 182
    .line 183
    const/16 p0, 0x13

    .line 184
    .line 185
    invoke-direct {v9, v2, v4, p0}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 186
    .line 187
    .line 188
    const/16 v10, 0xa

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iput-object p0, v2, La/hbg;->x:La/bby;

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_9
    if-nez p0, :cond_a

    .line 199
    .line 200
    iget-object p0, v2, La/hbg;->u:La/p7m0;

    .line 201
    .line 202
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    instance-of p0, p0, La/u9g;

    .line 207
    .line 208
    if-nez p0, :cond_a

    .line 209
    .line 210
    invoke-virtual {v2}, La/hbg;->A()V

    .line 211
    .line 212
    .line 213
    :cond_a
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
