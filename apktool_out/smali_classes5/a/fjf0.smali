.class public final La/fjf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/gjf0;


# direct methods
.method public synthetic constructor <init>(La/gjf0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fjf0;->i:B

    iput-object p1, p0, La/fjf0;->k:La/gjf0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fjf0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fjf0;->k:La/gjf0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/fjf0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/fjf0;-><init>(La/gjf0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/fjf0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/fjf0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/fjf0;-><init>(La/gjf0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fjf0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/fjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/fjf0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/fjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/fjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/fjf0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/fjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/fjf0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/fjf0;->k:La/gjf0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v6, p0, La/fjf0;->j:Z

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, La/gjf0;->i:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v2, p0

    .line 22
    check-cast v2, La/ejf0;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v7, 0x7

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static/range {v2 .. v7}, La/ejf0;->a(La/ejf0;ZLjava/lang/String;ZZI)La/ejf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iget-object v0, v1, La/gjf0;->j:La/ol60;

    .line 42
    .line 43
    iget-object v2, v1, La/gjf0;->i:La/p7m0;

    .line 44
    .line 45
    sget-object v3, La/wne;->a:La/wne;

    .line 46
    .line 47
    iget-boolean v4, p0, La/fjf0;->j:Z

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    if-ne v4, v5, :cond_1

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    move-object v6, p1

    .line 74
    check-cast v6, La/ejf0;

    .line 75
    .line 76
    const/4 v10, 0x0

    .line 77
    const/16 v11, 0xe

    .line 78
    .line 79
    const/4 v7, 0x1

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    invoke-static/range {v6 .. v11}, La/ejf0;->a(La/ejf0;ZLjava/lang/String;ZZI)La/ejf0;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v2, p1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    sget-object p1, La/yif0;->a:La/yif0;

    .line 93
    .line 94
    invoke-virtual {v0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, La/ejf0;

    .line 102
    .line 103
    iget-object p1, p1, La/ejf0;->b:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v2, v1, La/gjf0;->c:La/zn00;

    .line 106
    .line 107
    iput-boolean v5, p0, La/fjf0;->j:Z

    .line 108
    .line 109
    invoke-virtual {v2, p1, p0}, La/zn00;->Q0(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-ne p0, v3, :cond_4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    :goto_0
    new-instance p0, La/bjf0;

    .line 117
    .line 118
    iget-object p1, v1, La/gjf0;->f:La/ctf0;

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    new-array v3, v2, [Ljava/lang/Object;

    .line 122
    .line 123
    const v4, 0x7f13157e

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {p0, p1}, La/bjf0;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-boolean p0, v1, La/gjf0;->h:Z

    .line 137
    .line 138
    iget-object p1, v1, La/gjf0;->g:La/i1w0;

    .line 139
    .line 140
    if-eqz p0, :cond_5

    .line 141
    .line 142
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    new-instance v0, Lorg/xplatform/security/impl/presentation/otp_authenticator/OtpScreens$AddTwoFactoryAuthenticationScreen;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v1, La/d1w0;

    .line 152
    .line 153
    invoke-direct {v1, v0}, La/d1w0;-><init>(La/m7h0;)V

    .line 154
    .line 155
    .line 156
    new-instance v0, La/c8d;

    .line 157
    .line 158
    sget-object v3, La/y7d;->a:La/v7d;

    .line 159
    .line 160
    invoke-direct {v0, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 161
    .line 162
    .line 163
    invoke-static {p0, v0, p1, p0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_1
    move-object v0, p0

    .line 168
    check-cast v0, La/paw;

    .line 169
    .line 170
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_6

    .line 175
    .line 176
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, La/oe50;

    .line 181
    .line 182
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_5
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance v0, La/c8d;

    .line 191
    .line 192
    sget-object v1, La/y7d;->a:La/v7d;

    .line 193
    .line 194
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 195
    .line 196
    invoke-direct {v0, v1, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 197
    .line 198
    .line 199
    invoke-static {p0, v0, p1, p0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    :goto_2
    move-object v0, p0

    .line 204
    check-cast v0, La/paw;

    .line 205
    .line 206
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_6

    .line 211
    .line 212
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, La/oe50;

    .line 217
    .line 218
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    :goto_3
    return-object v3

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
