.class public final synthetic La/it4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ku4;


# direct methods
.method public synthetic constructor <init>(La/ku4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/it4;->a:B

    iput-object p1, p0, La/it4;->b:La/ku4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/it4;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/it4;->b:La/ku4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/k0w0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/ku4;->b:La/rek0;

    .line 16
    .line 17
    iget-object p0, p0, La/ku4;->o:La/mq4;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorAuthHistoryScreen$1;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorAuthHistoryScreen$1;-><init>(La/mq4;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, La/ku4;->s:La/duj;

    .line 42
    .line 43
    new-instance v2, La/jt4;

    .line 44
    .line 45
    invoke-direct {v2, p0, p1, v1}, La/jt4;-><init>(La/ku4;Ljava/lang/Throwable;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    iget-object v0, p0, La/ku4;->s:La/duj;

    .line 66
    .line 67
    new-instance v1, La/jt4;

    .line 68
    .line 69
    const/4 v2, 0x3

    .line 70
    invoke-direct {v1, p0, p1, v2}, La/jt4;-><init>(La/ku4;Ljava/lang/Throwable;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, La/ku4;->s:La/duj;

    .line 85
    .line 86
    new-instance v1, La/jt4;

    .line 87
    .line 88
    invoke-direct {v1, p0, p1, v2}, La/jt4;-><init>(La/ku4;Ljava/lang/Throwable;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, La/ku4;->s:La/duj;

    .line 103
    .line 104
    new-instance v3, La/jt4;

    .line 105
    .line 106
    invoke-direct {v3, p1, p0}, La/jt4;-><init>(Ljava/lang/Throwable;La/ku4;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, La/ku4;->y:La/p7m0;

    .line 113
    .line 114
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual {v0, v4, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    sget-object v0, La/ut4;->a:La/ut4;

    .line 124
    .line 125
    invoke-virtual {p0, v0}, La/ku4;->G(La/xt4;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, La/ku4;->w:La/p7m0;

    .line 129
    .line 130
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object v5, v3

    .line 135
    check-cast v5, La/qq4;

    .line 136
    .line 137
    sget-object v5, La/ku4;->J:La/qq4;

    .line 138
    .line 139
    invoke-virtual {v0, v3, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_1

    .line 144
    .line 145
    iget-object v3, p0, La/ku4;->z:La/p7m0;

    .line 146
    .line 147
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object v5, v0

    .line 152
    check-cast v5, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-virtual {v3, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_2

    .line 164
    .line 165
    instance-of v0, p1, La/zhi0;

    .line 166
    .line 167
    if-eqz v0, :cond_3

    .line 168
    .line 169
    check-cast p1, La/zhi0;

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_3
    move-object p1, v4

    .line 173
    :goto_0
    if-eqz p1, :cond_4

    .line 174
    .line 175
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 176
    .line 177
    if-eqz p1, :cond_4

    .line 178
    .line 179
    invoke-interface {p1}, La/kuw;->getErrorCode()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    const/16 v0, 0x25

    .line 184
    .line 185
    if-ne p1, v0, :cond_4

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_4
    iget-object p1, p0, La/ku4;->E:La/c4m0;

    .line 189
    .line 190
    invoke-static {p1}, La/v3c;->N(La/bby;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, La/ku4;->i:La/m1e;

    .line 194
    .line 195
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {p1, v1}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    new-instance v0, La/eu4;

    .line 204
    .line 205
    invoke-direct {v0, p1, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v1}, La/dtb;->U(La/gmq;I)La/qnq;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    new-instance v0, La/fu4;

    .line 213
    .line 214
    invoke-direct {v0, p0, v4, v2}, La/fu4;-><init>(La/ku4;La/yje;B)V

    .line 215
    .line 216
    .line 217
    new-instance v1, La/fnq;

    .line 218
    .line 219
    const/4 v2, 0x4

    .line 220
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    sget-object v0, La/gu4;->h:La/gu4;

    .line 228
    .line 229
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    iput-object p1, p0, La/ku4;->E:La/c4m0;

    .line 234
    .line 235
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
