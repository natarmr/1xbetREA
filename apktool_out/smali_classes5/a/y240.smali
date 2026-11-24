.class public final La/y240;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/j340;


# direct methods
.method public synthetic constructor <init>(La/j340;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/y240;->i:B

    iput-object p1, p0, La/y240;->k:La/j340;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/y240;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/y240;->k:La/j340;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/y240;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/y240;-><init>(La/j340;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/y240;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/y240;-><init>(La/j340;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/y240;->i:B

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
    invoke-virtual {p0, p1, p2}, La/y240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/y240;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/y240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/y240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/y240;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/y240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/y240;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/y240;->k:La/j340;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v3, La/j340;->a0:La/uf3;

    .line 14
    .line 15
    iget-object v6, v3, La/j340;->q:La/i1w0;

    .line 16
    .line 17
    sget-object v7, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v8, p0, La/y240;->j:B

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    if-eqz v8, :cond_2

    .line 23
    .line 24
    if-eq v8, v5, :cond_1

    .line 25
    .line 26
    if-ne v8, v4, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v3, La/j340;->T:La/iqt;

    .line 45
    .line 46
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 47
    .line 48
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    iget-object p1, v3, La/j340;->C:La/rou;

    .line 55
    .line 56
    iput-byte v5, p0, La/y240;->j:B

    .line 57
    .line 58
    invoke-virtual {p1, v9, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v7, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    check-cast p1, La/m2c0;

    .line 66
    .line 67
    iget-boolean p1, p1, La/m2c0;->n0:Z

    .line 68
    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    iget-object p1, v3, La/j340;->P0:La/gxu;

    .line 72
    .line 73
    iput-byte v4, p0, La/y240;->j:B

    .line 74
    .line 75
    invoke-virtual {p1, p0}, La/gxu;->n(La/yje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v7, :cond_4

    .line 80
    .line 81
    :goto_1
    move-object v1, v7

    .line 82
    goto :goto_5

    .line 83
    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    invoke-static {v6, v6}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v0}, La/uf3;->c()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 103
    .line 104
    invoke-static {v6, p0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :goto_3
    move-object p1, p0

    .line 109
    check-cast p1, La/paw;

    .line 110
    .line 111
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, La/oe50;

    .line 122
    .line 123
    invoke-virtual {v6, p1}, La/i1w0;->a(La/oe50;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    invoke-static {v6, v6}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {v0}, La/uf3;->b()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 136
    .line 137
    .line 138
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 139
    .line 140
    invoke-static {v6, p0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    :goto_4
    move-object p1, p0

    .line 145
    check-cast p1, La/paw;

    .line 146
    .line 147
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, La/oe50;

    .line 158
    .line 159
    invoke-virtual {v6, p1}, La/i1w0;->a(La/oe50;)V

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_6
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_5
    return-object v1

    .line 166
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 167
    .line 168
    iget-byte v6, p0, La/y240;->j:B

    .line 169
    .line 170
    if-eqz v6, :cond_9

    .line 171
    .line 172
    if-eq v6, v5, :cond_8

    .line 173
    .line 174
    if-ne v6, v4, :cond_7

    .line 175
    .line 176
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, v3, La/j340;->Q:La/nlu;

    .line 192
    .line 193
    iput-byte v5, p0, La/y240;->j:B

    .line 194
    .line 195
    invoke-virtual {p1, v5, p0}, La/nlu;->d(ZLa/zje;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    if-ne p1, v0, :cond_a

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_a
    :goto_6
    check-cast p1, La/gmq;

    .line 203
    .line 204
    new-instance v1, La/wk30;

    .line 205
    .line 206
    invoke-direct {v1, p1, v5}, La/wk30;-><init>(La/gmq;B)V

    .line 207
    .line 208
    .line 209
    new-instance p1, La/h820;

    .line 210
    .line 211
    const/16 v2, 0x1c

    .line 212
    .line 213
    invoke-direct {p1, v3, v2}, La/h820;-><init>(Ljava/lang/Object;B)V

    .line 214
    .line 215
    .line 216
    iput-byte v4, p0, La/y240;->j:B

    .line 217
    .line 218
    invoke-virtual {v1, p1, p0}, La/wk30;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-ne p0, v0, :cond_b

    .line 223
    .line 224
    :goto_7
    move-object v1, v0

    .line 225
    goto :goto_9

    .line 226
    :cond_b
    :goto_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    :goto_9
    return-object v1

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
