.class public final La/tnn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wnn;


# direct methods
.method public synthetic constructor <init>(La/wnn;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tnn;->i:B

    iput-object p1, p0, La/tnn;->k:La/wnn;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tnn;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tnn;->k:La/wnn;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tnn;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/tnn;-><init>(La/wnn;La/yje;B)V

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
    iput-boolean p0, v0, La/tnn;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/tnn;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/tnn;-><init>(La/wnn;La/yje;B)V

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
    iget-byte v0, p0, La/tnn;->i:B

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
    invoke-virtual {p0, p1, p2}, La/tnn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/tnn;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/tnn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/tnn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/tnn;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/tnn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/tnn;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/tnn;->k:La/wnn;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/tnn;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_b

    .line 18
    .line 19
    sget p0, La/wnn;->g0:I

    .line 20
    .line 21
    iget-object p0, v2, La/wnn;->e0:La/c4m0;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p0, v2, La/wnn;->C:La/rxu;

    .line 29
    .line 30
    invoke-virtual {p0}, La/rxu;->a()La/xae0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p1, v2, La/wnn;->P:La/p4u;

    .line 35
    .line 36
    iget-object p1, p1, La/p4u;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, La/lrc;

    .line 39
    .line 40
    iget-object p1, p1, La/lrc;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, La/jnn;

    .line 43
    .line 44
    iget-object p1, p1, La/jnn;->a:La/p7m0;

    .line 45
    .line 46
    new-instance v0, La/i89;

    .line 47
    .line 48
    const/16 v4, 0x16

    .line 49
    .line 50
    invoke-direct {v0, p1, v4}, La/i89;-><init>(La/gmq;B)V

    .line 51
    .line 52
    .line 53
    new-instance p1, La/e00;

    .line 54
    .line 55
    const/16 v4, 0x1a

    .line 56
    .line 57
    invoke-direct {p1, v2, v3, v4}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/p6d;

    .line 61
    .line 62
    invoke-direct {v4, p0, v0, p1, v1}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x3

    .line 66
    invoke-static {v2, v4, v3, v3, p0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iput-object p0, v2, La/wnn;->e0:La/c4m0;

    .line 71
    .line 72
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, La/inn;

    .line 77
    .line 78
    iget-object p0, p0, La/inn;->g:La/amn;

    .line 79
    .line 80
    sget-object p1, La/yln;->a:La/yln;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_8

    .line 87
    .line 88
    sget-object p1, La/zln;->a:La/zln;

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    instance-of p1, p0, La/xln;

    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v2}, La/wnn;->O()Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_2

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    iget-object p0, v2, La/wnn;->U:La/n4u;

    .line 109
    .line 110
    iget-object p0, p0, La/n4u;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, La/es;

    .line 113
    .line 114
    iget-object p0, p0, La/es;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, La/sln;

    .line 117
    .line 118
    iget-object p0, p0, La/sln;->a:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_3

    .line 125
    .line 126
    invoke-virtual {v2}, La/wnn;->Q()V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    invoke-virtual {v2}, La/wnn;->R()V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    instance-of p1, p0, La/vln;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    invoke-virtual {v2}, La/wnn;->O()Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p0, :cond_5

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_5
    invoke-virtual {v2}, La/wnn;->R()V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    sget-object p1, La/wln;->a:La/wln;

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-eqz p0, :cond_7

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_8
    :goto_0
    iget-object p0, v2, La/wnn;->b0:La/bby;

    .line 163
    .line 164
    if-eqz p0, :cond_9

    .line 165
    .line 166
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    goto :goto_1

    .line 171
    :cond_9
    const/4 p0, 0x0

    .line 172
    :goto_1
    if-eqz p0, :cond_a

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_a
    invoke-virtual {v2}, La/wnn;->Q()V

    .line 176
    .line 177
    .line 178
    :cond_b
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    :goto_3
    return-object v3

    .line 181
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 182
    .line 183
    iget-boolean v4, p0, La/tnn;->j:Z

    .line 184
    .line 185
    if-eqz v4, :cond_d

    .line 186
    .line 187
    if-ne v4, v1, :cond_c

    .line 188
    .line 189
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_c
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 194
    .line 195
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object p1, v2, La/wnn;->f0:La/bby;

    .line 203
    .line 204
    if-eqz p1, :cond_e

    .line 205
    .line 206
    invoke-interface {p1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 207
    .line 208
    .line 209
    :cond_e
    iget-object p1, v2, La/wnn;->Z:La/bby;

    .line 210
    .line 211
    if-eqz p1, :cond_f

    .line 212
    .line 213
    invoke-interface {p1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 214
    .line 215
    .line 216
    :cond_f
    iget-object p1, v2, La/wnn;->F:La/qv2;

    .line 217
    .line 218
    iget-wide v4, v2, La/wnn;->o:J

    .line 219
    .line 220
    iput-boolean v1, p0, La/tnn;->j:Z

    .line 221
    .line 222
    invoke-virtual {p1, v4, v5, p0}, La/qv2;->s(JLa/zje;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    if-ne p0, v0, :cond_10

    .line 227
    .line 228
    move-object v3, v0

    .line 229
    goto :goto_5

    .line 230
    :cond_10
    :goto_4
    sget p0, La/wnn;->g0:I

    .line 231
    .line 232
    invoke-virtual {v2}, La/wnn;->P()V

    .line 233
    .line 234
    .line 235
    iget-object p0, v2, La/wnn;->c0:La/bby;

    .line 236
    .line 237
    if-eqz p0, :cond_11

    .line 238
    .line 239
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 240
    .line 241
    .line 242
    :cond_11
    invoke-virtual {v2}, La/wnn;->P()V

    .line 243
    .line 244
    .line 245
    new-instance p0, La/qnn;

    .line 246
    .line 247
    const/4 p1, 0x2

    .line 248
    invoke-direct {p0, v2, p1}, La/qnn;-><init>(La/wnn;B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 252
    .line 253
    .line 254
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    :goto_5
    return-object v3

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
