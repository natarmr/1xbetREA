.class public final La/eir0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/fir0;


# direct methods
.method public synthetic constructor <init>(La/fir0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/eir0;->i:B

    iput-object p1, p0, La/eir0;->k:La/fir0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/eir0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/eir0;->k:La/fir0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/eir0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/eir0;-><init>(La/fir0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/eir0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/eir0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/eir0;-><init>(La/fir0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/eir0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/eir0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/eir0;-><init>(La/fir0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/eir0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/eir0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/lmr0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/eir0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/eir0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/eir0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/okr0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/eir0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/eir0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/eir0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/Map;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/eir0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/eir0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/eir0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eir0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/eir0;->k:La/fir0;

    .line 6
    .line 7
    iget-object v0, v0, La/eir0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v5, v0

    .line 13
    check-cast v5, La/lmr0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/uaq0;->a:La/s9m0;

    .line 21
    .line 22
    iget-object v1, v2, La/fir0;->O:La/wyu;

    .line 23
    .line 24
    invoke-virtual {v1}, La/wyu;->a()La/uaq0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, La/s9m0;->k(La/uaq0;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 36
    .line 37
    iget-object v15, v0, La/ocj;->a:La/p7m0;

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v15}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-object v3, v0

    .line 47
    check-cast v3, La/yhr0;

    .line 48
    .line 49
    iget-object v2, v5, La/lmr0;->c:La/ulr0;

    .line 50
    .line 51
    invoke-static {v2}, La/hfm0;->F(La/ulr0;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    invoke-static {v1, v6, v7}, La/p7x;->z(ZJ)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    const/16 v14, 0xfd

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const-wide/16 v9, 0x0

    .line 66
    .line 67
    const-wide/16 v11, 0x0

    .line 68
    .line 69
    invoke-static/range {v3 .. v14}, La/yhr0;->a(La/yhr0;La/lhr0;La/lmr0;Ljava/util/Map;ZZJJLjava/lang/String;I)La/yhr0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v15, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_0
    move-object v1, v0

    .line 83
    check-cast v1, La/okr0;

    .line 84
    .line 85
    sget-object v0, La/wne;->a:La/wne;

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v2, La/fir0;->W:La/c4m0;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    invoke-virtual {v0, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    iget-object v0, v2, La/fir0;->y:La/btu;

    .line 99
    .line 100
    iget-object v0, v0, La/btu;->a:La/g090;

    .line 101
    .line 102
    invoke-virtual {v0}, La/g090;->m()La/okr0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-wide v4, v0, La/okr0;->d:J

    .line 107
    .line 108
    const-wide/16 v6, 0x0

    .line 109
    .line 110
    cmp-long v0, v4, v6

    .line 111
    .line 112
    const/4 v6, 0x3

    .line 113
    if-nez v0, :cond_2

    .line 114
    .line 115
    sget-object v0, La/dun;->a:La/dun;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    new-instance v0, La/c4v;

    .line 119
    .line 120
    invoke-direct {v0, v4, v5, v3}, La/c4v;-><init>(JLa/yje;)V

    .line 121
    .line 122
    .line 123
    const-wide/16 v4, 0x1

    .line 124
    .line 125
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 126
    .line 127
    invoke-static {v4, v5, v7, v0}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v4, La/yau;

    .line 132
    .line 133
    invoke-direct {v4, v6, v3}, La/yau;-><init>(ILa/yje;)V

    .line 134
    .line 135
    .line 136
    new-instance v5, La/wmq;

    .line 137
    .line 138
    const/4 v7, 0x1

    .line 139
    invoke-direct {v5, v0, v4, v3, v7}, La/wmq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 140
    .line 141
    .line 142
    new-instance v0, La/vsg0;

    .line 143
    .line 144
    invoke-direct {v0, v5}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    :goto_0
    new-instance v4, La/b6o0;

    .line 148
    .line 149
    const/4 v5, 0x2

    .line 150
    invoke-direct {v4, v2, v3, v5}, La/b6o0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 151
    .line 152
    .line 153
    new-instance v5, La/fnq;

    .line 154
    .line 155
    const/4 v7, 0x4

    .line 156
    invoke-direct {v5, v0, v4, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 157
    .line 158
    .line 159
    invoke-static {v2, v5, v3, v3, v6}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iput-object v0, v2, La/fir0;->W:La/c4m0;

    .line 164
    .line 165
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 166
    .line 167
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 168
    .line 169
    :cond_3
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-object v4, v0

    .line 177
    check-cast v4, La/yhr0;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v5, La/hhr0;

    .line 183
    .line 184
    invoke-direct {v5, v1}, La/hhr0;-><init>(La/okr0;)V

    .line 185
    .line 186
    .line 187
    const/4 v14, 0x0

    .line 188
    const/16 v15, 0x1fe

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    const/4 v9, 0x0

    .line 194
    const-wide/16 v10, 0x0

    .line 195
    .line 196
    const-wide/16 v12, 0x0

    .line 197
    .line 198
    invoke-static/range {v4 .. v15}, La/yhr0;->a(La/yhr0;La/lhr0;La/lmr0;Ljava/util/Map;ZZJJLjava/lang/String;I)La/yhr0;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_3

    .line 207
    .line 208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_1
    move-object v6, v0

    .line 212
    check-cast v6, Ljava/util/Map;

    .line 213
    .line 214
    sget-object v0, La/wne;->a:La/wne;

    .line 215
    .line 216
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget v0, La/fir0;->X:I

    .line 220
    .line 221
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 222
    .line 223
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 224
    .line 225
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-object v3, v1

    .line 233
    check-cast v3, La/yhr0;

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const/16 v14, 0x1fb

    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    const/4 v5, 0x0

    .line 240
    const/4 v7, 0x0

    .line 241
    const/4 v8, 0x0

    .line 242
    const-wide/16 v9, 0x0

    .line 243
    .line 244
    const-wide/16 v11, 0x0

    .line 245
    .line 246
    invoke-static/range {v3 .. v14}, La/yhr0;->a(La/yhr0;La/lhr0;La/lmr0;Ljava/util/Map;ZZJJLjava/lang/String;I)La/yhr0;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_4

    .line 255
    .line 256
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
