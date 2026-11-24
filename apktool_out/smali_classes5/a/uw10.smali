.class public final La/uw10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/cx10;


# direct methods
.method public synthetic constructor <init>(La/cx10;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uw10;->i:B

    iput-object p1, p0, La/uw10;->j:La/cx10;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/uw10;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/uw10;->j:La/cx10;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/uw10;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/uw10;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/uw10;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/uw10;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/uw10;->i:B

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
    invoke-virtual {p0, p1, p2}, La/uw10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/uw10;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/uw10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/uw10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/uw10;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/uw10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/uw10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/uw10;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/uw10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/kmq;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/uw10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/uw10;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/uw10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uw10;->i:B

    .line 4
    .line 5
    sget-object v2, La/jw10;->a:La/jw10;

    .line 6
    .line 7
    iget-object v3, v0, La/uw10;->j:La/cx10;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v3, La/cx10;->G:La/ol60;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v3, La/cx10;->G:La/ol60;

    .line 31
    .line 32
    sget-object v1, La/mw10;->a:La/mw10;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v3, La/cx10;->G:La/ol60;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v4, v0, La/uw10;->j:La/cx10;

    .line 59
    .line 60
    iget-object v0, v4, La/cx10;->f:La/mne;

    .line 61
    .line 62
    iget-boolean v1, v4, La/cx10;->P:Z

    .line 63
    .line 64
    const/4 v10, 0x1

    .line 65
    const/4 v11, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    new-instance v2, La/pf10;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    const/16 v9, 0x18

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    const-class v5, La/cx10;

    .line 79
    .line 80
    const-string v6, "handleError"

    .line 81
    .line 82
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 83
    .line 84
    invoke-direct/range {v2 .. v9}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 85
    .line 86
    .line 87
    iget-object v15, v0, La/mne;->b:La/dvj;

    .line 88
    .line 89
    new-instance v1, La/uw10;

    .line 90
    .line 91
    invoke-direct {v1, v4, v11, v10}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 92
    .line 93
    .line 94
    const/16 v17, 0xa

    .line 95
    .line 96
    const/4 v14, 0x0

    .line 97
    move-object/from16 v16, v1

    .line 98
    .line 99
    move-object v13, v2

    .line 100
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 101
    .line 102
    .line 103
    :cond_0
    iget-boolean v1, v4, La/cx10;->Q:Z

    .line 104
    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    new-instance v2, La/pf10;

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const/16 v9, 0x19

    .line 115
    .line 116
    const/4 v3, 0x1

    .line 117
    const-class v5, La/cx10;

    .line 118
    .line 119
    const-string v6, "handleError"

    .line 120
    .line 121
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 122
    .line 123
    invoke-direct/range {v2 .. v9}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 124
    .line 125
    .line 126
    iget-object v15, v0, La/mne;->b:La/dvj;

    .line 127
    .line 128
    new-instance v1, La/uw10;

    .line 129
    .line 130
    const/4 v3, 0x2

    .line 131
    invoke-direct {v1, v4, v11, v3}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 132
    .line 133
    .line 134
    const/16 v17, 0xa

    .line 135
    .line 136
    const/4 v14, 0x0

    .line 137
    move-object/from16 v16, v1

    .line 138
    .line 139
    move-object v13, v2

    .line 140
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 141
    .line 142
    .line 143
    iget-object v1, v4, La/cx10;->b:La/vzg0;

    .line 144
    .line 145
    const-string v2, "open_bot"

    .line 146
    .line 147
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    iput-boolean v1, v4, La/cx10;->Q:Z

    .line 154
    .line 155
    :cond_1
    iget-object v1, v4, La/cx10;->t:La/kc60;

    .line 156
    .line 157
    invoke-virtual {v1}, La/kc60;->a()La/p7m0;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-instance v2, La/fw10;

    .line 162
    .line 163
    invoke-direct {v2, v4, v11, v10}, La/fw10;-><init>(La/cx10;La/yje;B)V

    .line 164
    .line 165
    .line 166
    new-instance v10, La/fnq;

    .line 167
    .line 168
    const/4 v3, 0x4

    .line 169
    invoke-direct {v10, v1, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 177
    .line 178
    invoke-static {v1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-instance v2, La/dm10;

    .line 183
    .line 184
    const/4 v8, 0x4

    .line 185
    const/16 v9, 0x14

    .line 186
    .line 187
    const/4 v3, 0x2

    .line 188
    const-class v5, La/cx10;

    .line 189
    .line 190
    const-string v6, "handleError"

    .line 191
    .line 192
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 193
    .line 194
    invoke-direct/range {v2 .. v9}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 195
    .line 196
    .line 197
    invoke-static {v10, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iput-object v0, v4, La/cx10;->K:La/c4m0;

    .line 202
    .line 203
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
