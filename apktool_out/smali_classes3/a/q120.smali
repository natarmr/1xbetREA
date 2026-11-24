.class public final La/q120;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/w220;


# direct methods
.method public synthetic constructor <init>(La/w220;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q120;->i:B

    iput-object p1, p0, La/q120;->k:La/w220;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/q120;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q120;->k:La/w220;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/q120;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/q120;-><init>(La/w220;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/q120;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/q120;-><init>(La/w220;La/yje;B)V

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
    iget-byte v0, p0, La/q120;->i:B

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
    invoke-virtual {p0, p1, p2}, La/q120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q120;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/q120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/q120;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/q120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/q120;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/q120;->k:La/w220;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/q120;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v3, :cond_1

    .line 20
    .line 21
    if-ne v6, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    iput-byte v3, p0, La/q120;->j:B

    .line 39
    .line 40
    const-wide/16 v2, 0x1f4

    .line 41
    .line 42
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    iget-object p1, v1, La/w220;->j0:La/urt;

    .line 50
    .line 51
    sget-object v1, La/tl5;->a:La/tl5;

    .line 52
    .line 53
    iput-byte v4, p0, La/q120;->j:B

    .line 54
    .line 55
    iget-object p1, p1, La/urt;->a:La/rrd;

    .line 56
    .line 57
    invoke-virtual {p1, v1, p0}, La/rrd;->i(La/tl5;La/zje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-ne p0, v0, :cond_4

    .line 62
    .line 63
    :goto_1
    move-object v5, v0

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_3
    return-object v5

    .line 68
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 69
    .line 70
    iget-byte v6, p0, La/q120;->j:B

    .line 71
    .line 72
    if-eqz v6, :cond_7

    .line 73
    .line 74
    if-eq v6, v3, :cond_6

    .line 75
    .line 76
    if-ne v6, v4, :cond_5

    .line 77
    .line 78
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_8

    .line 82
    .line 83
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_b

    .line 87
    .line 88
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v1, La/w220;->R:La/vkr0;

    .line 96
    .line 97
    iput-byte v3, p0, La/q120;->j:B

    .line 98
    .line 99
    invoke-virtual {p1, p0}, La/vkr0;->t(La/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v0, :cond_8

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_8
    :goto_4
    iget-object p1, v1, La/w220;->S:La/u8u;

    .line 107
    .line 108
    iput-byte v4, p0, La/q120;->j:B

    .line 109
    .line 110
    iget-object p0, p1, La/u8u;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, La/xfu;

    .line 113
    .line 114
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, La/twz;

    .line 117
    .line 118
    iget-object v2, p0, La/twz;->c:La/kwz;

    .line 119
    .line 120
    iget-wide v6, v2, La/kwz;->e:J

    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v8

    .line 126
    iget-object p0, p0, La/twz;->c:La/kwz;

    .line 127
    .line 128
    iget-wide v10, p0, La/kwz;->f:J

    .line 129
    .line 130
    sub-long/2addr v8, v10

    .line 131
    sub-long/2addr v6, v8

    .line 132
    const-wide/16 v8, 0x0

    .line 133
    .line 134
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 135
    .line 136
    .line 137
    move-result-wide v6

    .line 138
    cmp-long p0, v6, v8

    .line 139
    .line 140
    if-nez p0, :cond_9

    .line 141
    .line 142
    iget-object p0, p1, La/u8u;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, La/pmi0;

    .line 145
    .line 146
    iget-object p0, p0, La/pmi0;->a:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p0, La/twz;

    .line 149
    .line 150
    iget-object p0, p0, La/twz;->c:La/kwz;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    sget-object p1, La/wen;->b:La/uen;

    .line 156
    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    iget-wide v8, p0, La/kwz;->f:J

    .line 162
    .line 163
    sub-long/2addr v6, v8

    .line 164
    sget-object p1, La/bfn;->d:La/bfn;

    .line 165
    .line 166
    invoke-static {v6, v7, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 167
    .line 168
    .line 169
    move-result-wide v6

    .line 170
    sget-object p1, La/bfn;->f:La/bfn;

    .line 171
    .line 172
    invoke-static {v6, v7, p1}, La/wen;->l(JLa/bfn;)J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    long-to-int p1, v6

    .line 177
    iput p1, p0, La/kwz;->g:I

    .line 178
    .line 179
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 180
    .line 181
    .line 182
    move-result-wide v6

    .line 183
    iput-wide v6, p0, La/kwz;->f:J

    .line 184
    .line 185
    iput-boolean v3, p0, La/kwz;->i:Z

    .line 186
    .line 187
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 188
    .line 189
    :goto_5
    move-object p1, p0

    .line 190
    goto :goto_6

    .line 191
    :cond_9
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :goto_6
    if-ne p1, v0, :cond_a

    .line 195
    .line 196
    :goto_7
    move-object v5, v0

    .line 197
    goto :goto_b

    .line 198
    :cond_a
    :goto_8
    check-cast p1, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-eqz p0, :cond_c

    .line 205
    .line 206
    iget-object p0, v1, La/w220;->s:La/ouu;

    .line 207
    .line 208
    invoke-virtual {p0}, La/ouu;->s()La/i1w0;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    new-instance p1, La/k0w0;

    .line 213
    .line 214
    invoke-direct {p1, p0}, La/k0w0;-><init>(La/i1w0;)V

    .line 215
    .line 216
    .line 217
    iget-object v0, v1, La/w220;->M0:La/uuz;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    new-instance v0, Lorg/xplatform/limits/ie/impl/navigation/LimitsIeScreens$RealityLimitLockScreenFragmentScreen;

    .line 223
    .line 224
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 228
    .line 229
    .line 230
    iget-object p1, p1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    invoke-static {p0, p1, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    :goto_9
    move-object v0, p1

    .line 238
    check-cast v0, La/paw;

    .line 239
    .line 240
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_b

    .line 245
    .line 246
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, La/oe50;

    .line 251
    .line 252
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 253
    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_b
    iget-object p0, v1, La/w220;->p1:La/bby;

    .line 257
    .line 258
    if-eqz p0, :cond_d

    .line 259
    .line 260
    invoke-interface {p0, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 261
    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_c
    invoke-virtual {v1}, La/w220;->A()V

    .line 265
    .line 266
    .line 267
    :cond_d
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    :goto_b
    return-object v5

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
