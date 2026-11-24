.class public final synthetic La/dkc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;
.implements La/fer;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gkc0;


# direct methods
.method public synthetic constructor <init>(La/gkc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dkc0;->a:B

    iput-object p1, p0, La/dkc0;->b:La/gkc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p2, p0, La/dkc0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, La/dkc0;->b:La/gkc0;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    new-instance p2, La/w06;

    .line 17
    .line 18
    invoke-direct {p2, p1}, La/w06;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, La/gkc0;->i:La/mne;

    .line 26
    .line 27
    iget-object v5, v3, La/mne;->a:La/rwj;

    .line 28
    .line 29
    sget-object v3, La/ckc0;->a:La/ckc0;

    .line 30
    .line 31
    new-instance v6, La/o690;

    .line 32
    .line 33
    const/16 v4, 0x14

    .line 34
    .line 35
    invoke-direct {v6, p0, p2, v1, v4}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 36
    .line 37
    .line 38
    const/16 v7, 0xa

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 42
    .line 43
    .line 44
    iget-boolean p2, p0, La/gkc0;->r:Z

    .line 45
    .line 46
    if-nez p2, :cond_0

    .line 47
    .line 48
    iput-boolean v0, p0, La/gkc0;->r:Z

    .line 49
    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0}, La/gkc0;->z()V

    .line 53
    .line 54
    .line 55
    :cond_0
    if-eqz p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p0, La/gkc0;->o:La/p7m0;

    .line 58
    .line 59
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    instance-of p1, p1, La/njc0;

    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0}, La/gkc0;->x()V

    .line 68
    .line 69
    .line 70
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    check-cast p1, La/i16;

    .line 74
    .line 75
    iget-object p2, p0, La/gkc0;->g:La/trm0;

    .line 76
    .line 77
    iget-object v2, p0, La/gkc0;->n:La/p7m0;

    .line 78
    .line 79
    iget-object v3, p0, La/gkc0;->p:La/p7m0;

    .line 80
    .line 81
    if-nez p1, :cond_2

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_2
    instance-of v4, p1, La/a16;

    .line 86
    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    check-cast p1, La/a16;

    .line 90
    .line 91
    iget-object p0, p1, La/a16;->a:La/le8;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget-object p1, La/vjc0;->a:La/vjc0;

    .line 97
    .line 98
    invoke-virtual {v2, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    iget p0, p0, La/le8;->c:I

    .line 102
    .line 103
    invoke-virtual {p2, p0}, La/trm0;->k(I)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_1

    .line 107
    .line 108
    :cond_3
    instance-of v4, p1, La/b16;

    .line 109
    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    instance-of v4, p1, La/f16;

    .line 114
    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    :goto_0
    iget-object p0, p0, La/gkc0;->j:La/ljf0;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, La/ljf0;->d(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object p0, La/wjc0;->a:La/wjc0;

    .line 126
    .line 127
    invoke-virtual {v2, v1, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_5
    instance-of v0, p1, La/x06;

    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    check-cast p1, La/x06;

    .line 137
    .line 138
    iget-boolean p1, p1, La/x06;->a:Z

    .line 139
    .line 140
    iget-object p2, p0, La/gkc0;->e:La/m1e;

    .line 141
    .line 142
    invoke-interface {p2}, La/m1e;->c()Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-nez p2, :cond_6

    .line 147
    .line 148
    invoke-virtual {p0}, La/gkc0;->z()V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_6
    new-instance p0, La/qjc0;

    .line 153
    .line 154
    invoke-direct {p0, p1}, La/qjc0;-><init>(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v1, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    instance-of v0, p1, La/y06;

    .line 165
    .line 166
    if-eqz v0, :cond_8

    .line 167
    .line 168
    check-cast p1, La/y06;

    .line 169
    .line 170
    iget-object p0, p1, La/y06;->a:Ljava/lang/String;

    .line 171
    .line 172
    new-instance p1, La/rjc0;

    .line 173
    .line 174
    invoke-direct {p1, p0}, La/rjc0;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_8
    instance-of v0, p1, La/d16;

    .line 185
    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    invoke-virtual {p0}, La/gkc0;->z()V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_9
    instance-of v0, p1, La/h16;

    .line 193
    .line 194
    if-eqz v0, :cond_a

    .line 195
    .line 196
    iget-object p1, p0, La/gkc0;->d:La/ikt0;

    .line 197
    .line 198
    sget-object p2, La/vpv0;->b:La/vpv0;

    .line 199
    .line 200
    iget-object p0, p0, La/gkc0;->k:La/s470;

    .line 201
    .line 202
    invoke-virtual {p0}, La/s470;->a()J

    .line 203
    .line 204
    .line 205
    move-result-wide v4

    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object p0, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p0, La/tnc0;

    .line 212
    .line 213
    new-instance p1, La/no60;

    .line 214
    .line 215
    invoke-direct {p1, v4, v5, p2}, La/no60;-><init>(JLa/vpv0;)V

    .line 216
    .line 217
    .line 218
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p0, p1}, La/tnc0;->a(Ljava/util/List;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    sget-object p0, La/sjc0;->a:La/sjc0;

    .line 229
    .line 230
    invoke-virtual {v3, v1, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_a
    instance-of v0, p1, La/e16;

    .line 235
    .line 236
    if-eqz v0, :cond_b

    .line 237
    .line 238
    check-cast p1, La/e16;

    .line 239
    .line 240
    iget-object p1, p1, La/e16;->a:La/k390;

    .line 241
    .line 242
    iget v0, p1, La/k390;->d:I

    .line 243
    .line 244
    invoke-virtual {p2, v0}, La/trm0;->k(I)V

    .line 245
    .line 246
    .line 247
    iget-object p0, p0, La/gkc0;->h:La/ilt0;

    .line 248
    .line 249
    iget-wide v0, p1, La/k390;->b:J

    .line 250
    .line 251
    iget-wide p1, p1, La/k390;->c:D

    .line 252
    .line 253
    invoke-virtual {p0, p1, p2, v0, v1}, La/ilt0;->a(DJ)V

    .line 254
    .line 255
    .line 256
    :cond_b
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()La/wdr;
    .locals 9

    .line 1
    iget-byte v0, p0, La/dkc0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/xo;

    .line 7
    .line 8
    const-string v6, "handleConnected(Z)V"

    .line 9
    .line 10
    const/4 v7, 0x4

    .line 11
    const/4 v2, 0x2

    .line 12
    iget-object v3, p0, La/dkc0;->b:La/gkc0;

    .line 13
    .line 14
    const-class v4, La/gkc0;

    .line 15
    .line 16
    const-string v5, "handleConnected"

    .line 17
    .line 18
    invoke-direct/range {v1 .. v7}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    new-instance v2, La/xo;

    .line 23
    .line 24
    const-string v7, "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V"

    .line 25
    .line 26
    const/4 v8, 0x4

    .line 27
    const/4 v3, 0x2

    .line 28
    iget-object v4, p0, La/dkc0;->b:La/gkc0;

    .line 29
    .line 30
    const-class v5, La/gkc0;

    .line 31
    .line 32
    const-string v6, "handleCommand"

    .line 33
    .line 34
    invoke-direct/range {v2 .. v8}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-byte v0, p0, La/dkc0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, La/kmq;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    instance-of v0, p1, La/fer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/dkc0;->b()La/wdr;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p1, La/fer;

    .line 20
    .line 21
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :cond_0
    return v1

    .line 30
    :pswitch_0
    instance-of v0, p1, La/kmq;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    instance-of v0, p1, La/fer;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, La/dkc0;->b()La/wdr;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p1, La/fer;

    .line 43
    .line 44
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_1
    return v1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/dkc0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/dkc0;->b()La/wdr;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, La/dkc0;->b()La/wdr;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
