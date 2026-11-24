.class public final La/yl20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ln20;


# direct methods
.method public synthetic constructor <init>(La/ln20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yl20;->i:B

    iput-object p1, p0, La/yl20;->k:La/ln20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yl20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yl20;->k:La/ln20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yl20;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/yl20;-><init>(La/ln20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/yl20;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/yl20;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/yl20;-><init>(La/ln20;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/yl20;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/yl20;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/yl20;-><init>(La/ln20;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/yl20;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/yl20;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yl20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/sw00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/yl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/yl20;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/yl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/yl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/yl20;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/yl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/yl20;->i:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    iget-object v3, v0, La/yl20;->k:La/ln20;

    .line 8
    .line 9
    iget-object v0, v0, La/yl20;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, Ljava/lang/Throwable;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v3, La/ln20;->V:La/duj;

    .line 22
    .line 23
    new-instance v3, La/ei20;

    .line 24
    .line 25
    invoke-direct {v3, v2}, La/ei20;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object v1, v0

    .line 35
    check-cast v1, La/sw00;

    .line 36
    .line 37
    sget-object v0, La/wne;->a:La/wne;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget v0, La/ln20;->o0:I

    .line 43
    .line 44
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 45
    .line 46
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 47
    .line 48
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-object v5, v0

    .line 56
    check-cast v5, La/sg20;

    .line 57
    .line 58
    iget-boolean v13, v1, La/sw00;->a:Z

    .line 59
    .line 60
    const/4 v14, 0x0

    .line 61
    const/16 v15, 0x5ff

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v10, 0x0

    .line 68
    const/4 v11, 0x0

    .line 69
    const/4 v12, 0x0

    .line 70
    invoke-static/range {v5 .. v15}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v4, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    iget-boolean v0, v1, La/sw00;->a:Z

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget-object v0, v3, La/ln20;->X:La/mne;

    .line 89
    .line 90
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 91
    .line 92
    new-instance v5, La/mh20;

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    invoke-direct {v5, v3, v0}, La/mh20;-><init>(La/ln20;B)V

    .line 96
    .line 97
    .line 98
    new-instance v8, La/tk20;

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-direct {v8, v3, v0, v1}, La/tk20;-><init>(La/ln20;La/yje;B)V

    .line 103
    .line 104
    .line 105
    const/16 v9, 0xa

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 109
    .line 110
    .line 111
    iget-object v4, v3, La/ln20;->R:La/b8u;

    .line 112
    .line 113
    iget-object v5, v3, La/ln20;->i0:La/bm5;

    .line 114
    .line 115
    invoke-virtual {v4, v5}, La/b8u;->a(La/bm5;)La/i89;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    new-instance v5, La/mq10;

    .line 120
    .line 121
    invoke-direct {v5, v3, v0, v2}, La/mq10;-><init>(La/diu0;La/yje;B)V

    .line 122
    .line 123
    .line 124
    new-instance v2, La/fnq;

    .line 125
    .line 126
    const/4 v6, 0x4

    .line 127
    invoke-direct {v2, v4, v5, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    sget-object v5, La/sl20;->h:La/sl20;

    .line 135
    .line 136
    invoke-static {v2, v4, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 137
    .line 138
    .line 139
    iget-object v2, v3, La/ln20;->Q:La/m1e;

    .line 140
    .line 141
    invoke-interface {v2}, La/m1e;->b()La/gmq;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    new-instance v4, La/tk20;

    .line 146
    .line 147
    const/4 v5, 0x3

    .line 148
    invoke-direct {v4, v3, v0, v5}, La/tk20;-><init>(La/ln20;La/yje;B)V

    .line 149
    .line 150
    .line 151
    new-instance v5, La/fnq;

    .line 152
    .line 153
    invoke-direct {v5, v2, v4, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v4, v3, La/ln20;->E:La/mne;

    .line 161
    .line 162
    iget-object v4, v4, La/mne;->a:La/rwj;

    .line 163
    .line 164
    invoke-static {v2, v4}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    new-instance v4, La/sax;

    .line 169
    .line 170
    const/4 v7, 0x2

    .line 171
    const/16 v8, 0x1a

    .line 172
    .line 173
    invoke-direct {v4, v7, v0, v8}, La/sax;-><init>(ILa/yje;B)V

    .line 174
    .line 175
    .line 176
    invoke-static {v5, v2, v4}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 177
    .line 178
    .line 179
    iget-object v2, v3, La/ln20;->P:La/rxu;

    .line 180
    .line 181
    invoke-virtual {v2}, La/rxu;->a()La/xae0;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    new-instance v4, La/l0f;

    .line 186
    .line 187
    invoke-direct {v4, v2, v1}, La/l0f;-><init>(La/xae0;B)V

    .line 188
    .line 189
    .line 190
    new-instance v1, La/tk20;

    .line 191
    .line 192
    invoke-direct {v1, v3, v0, v6}, La/tk20;-><init>(La/ln20;La/yje;B)V

    .line 193
    .line 194
    .line 195
    new-instance v0, La/fnq;

    .line 196
    .line 197
    invoke-direct {v0, v4, v1, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 198
    .line 199
    .line 200
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    sget-object v2, La/em20;->h:La/em20;

    .line 205
    .line 206
    invoke-static {v0, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 207
    .line 208
    .line 209
    iget-object v0, v3, La/ln20;->o:La/ua20;

    .line 210
    .line 211
    sget-object v1, La/ua20;->e:La/ua20;

    .line 212
    .line 213
    if-ne v0, v1, :cond_1

    .line 214
    .line 215
    iget-object v0, v3, La/ln20;->M:La/reu;

    .line 216
    .line 217
    invoke-virtual {v0}, La/reu;->c()La/nwo0;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-boolean v0, v0, La/nwo0;->a:Z

    .line 222
    .line 223
    new-instance v1, La/jv1;

    .line 224
    .line 225
    const/16 v2, 0x1d

    .line 226
    .line 227
    invoke-direct {v1, v0, v3, v2}, La/jv1;-><init>(ZLjava/lang/Object;B)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 231
    .line 232
    .line 233
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    .line 237
    .line 238
    sget-object v1, La/wne;->a:La/wne;

    .line 239
    .line 240
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iget-object v1, v3, La/ln20;->n0:La/k820;

    .line 244
    .line 245
    invoke-virtual {v1, v0}, La/k820;->a(Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
