.class public final La/lo6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/po6;


# direct methods
.method public synthetic constructor <init>(La/po6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lo6;->i:B

    iput-object p1, p0, La/lo6;->k:La/po6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lo6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lo6;->k:La/po6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/lo6;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/lo6;-><init>(La/po6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/lo6;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/lo6;-><init>(La/po6;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/lo6;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/lo6;-><init>(La/po6;La/yje;B)V

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
    iput-boolean p0, v0, La/lo6;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance v0, La/lo6;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, p2, v1}, La/lo6;-><init>(La/po6;La/yje;B)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput-boolean p0, v0, La/lo6;->j:Z

    .line 50
    .line 51
    return-object v0

    .line 52
    nop

    .line 53
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
    iget-byte v0, p0, La/lo6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lo6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lo6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lo6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/lo6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/lo6;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/lo6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/lo6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/lo6;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/lo6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    check-cast p2, La/yje;

    .line 66
    .line 67
    invoke-virtual {p0, p1, p2}, La/lo6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/lo6;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/lo6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lo6;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/lo6;->k:La/po6;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v1, p0, La/lo6;->j:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    if-ne v1, v5, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v3, La/po6;->w:La/buo0;

    .line 33
    .line 34
    sget-object v1, La/hae0;->c:La/hae0;

    .line 35
    .line 36
    iput-boolean v5, p0, La/lo6;->j:Z

    .line 37
    .line 38
    invoke-virtual {p1, v1, p0}, La/buo0;->a(La/hae0;La/zje;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-ne p0, v0, :cond_2

    .line 43
    .line 44
    move-object v4, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    :goto_1
    return-object v4

    .line 49
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 50
    .line 51
    iget-boolean v6, p0, La/lo6;->j:Z

    .line 52
    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    if-ne v6, v5, :cond_3

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, v3, La/po6;->q:La/yk50;

    .line 69
    .line 70
    invoke-virtual {p1}, La/yk50;->g()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    iget-object p1, v3, La/po6;->t:La/vpu;

    .line 77
    .line 78
    iput-boolean v5, p0, La/lo6;->j:Z

    .line 79
    .line 80
    invoke-virtual {p1, v1, p0}, La/vpu;->b(ZLa/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, v0, :cond_5

    .line 85
    .line 86
    move-object v4, v0

    .line 87
    goto :goto_5

    .line 88
    :cond_5
    :goto_2
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p1, La/ko6;

    .line 93
    .line 94
    invoke-direct {p1, v3, v4, v5}, La/ko6;-><init>(La/po6;La/yje;B)V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x3

    .line 98
    invoke-static {p0, v4, v4, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 99
    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget-object p0, v3, La/po6;->E:La/i1w0;

    .line 103
    .line 104
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v0, La/io6;

    .line 109
    .line 110
    invoke-direct {v0, v3, v5}, La/io6;-><init>(La/po6;B)V

    .line 111
    .line 112
    .line 113
    new-instance v2, La/a1w0;

    .line 114
    .line 115
    invoke-direct {v2, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, La/c8d;

    .line 119
    .line 120
    sget-object v4, La/y7d;->a:La/v7d;

    .line 121
    .line 122
    invoke-direct {v0, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    :goto_3
    move-object v0, p1

    .line 130
    check-cast v0, La/paw;

    .line 131
    .line 132
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_7

    .line 137
    .line 138
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, La/oe50;

    .line 143
    .line 144
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    :goto_4
    iput-boolean v1, v3, La/po6;->M:Z

    .line 149
    .line 150
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_5
    return-object v4

    .line 153
    :pswitch_1
    iget-boolean p0, p0, La/lo6;->j:Z

    .line 154
    .line 155
    sget-object v0, La/wne;->a:La/wne;

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, p0}, La/po6;->B(Z)V

    .line 161
    .line 162
    .line 163
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_2
    iget-boolean p0, p0, La/lo6;->j:Z

    .line 167
    .line 168
    sget-object v0, La/wne;->a:La/wne;

    .line 169
    .line 170
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    if-eqz p0, :cond_8

    .line 174
    .line 175
    new-instance p1, La/no6;

    .line 176
    .line 177
    invoke-direct {p1, v3, v4}, La/no6;-><init>(La/po6;La/yje;)V

    .line 178
    .line 179
    .line 180
    const-wide/16 v0, 0x1e

    .line 181
    .line 182
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 183
    .line 184
    invoke-static {v0, v1, v2, p1}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    new-instance v1, La/mo6;

    .line 193
    .line 194
    const/4 v2, 0x4

    .line 195
    invoke-direct {v1, v3, v4, v2}, La/mo6;-><init>(La/po6;La/yje;B)V

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iput-object p1, v3, La/po6;->O:La/c4m0;

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_8
    iget-object p1, v3, La/po6;->O:La/c4m0;

    .line 206
    .line 207
    invoke-static {p1}, La/v3c;->N(La/bby;)V

    .line 208
    .line 209
    .line 210
    iget-object p1, v3, La/po6;->R:La/p7m0;

    .line 211
    .line 212
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    sget-object v2, La/wv7;->a:La/wv7;

    .line 217
    .line 218
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_9

    .line 223
    .line 224
    iget-object v0, v3, La/po6;->c:La/yk50;

    .line 225
    .line 226
    invoke-virtual {v0}, La/yk50;->g()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    new-instance v0, La/yv7;

    .line 233
    .line 234
    invoke-virtual {v3}, La/po6;->x()Ljava/util/ArrayList;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-direct {v0, v2, v1}, La/yv7;-><init>(Ljava/util/ArrayList;Z)V

    .line 239
    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_9
    new-instance v0, La/uv7;

    .line 243
    .line 244
    iget-object v5, v3, La/po6;->C:La/sa10;

    .line 245
    .line 246
    sget-object v6, La/pb10;->g:La/pb10;

    .line 247
    .line 248
    const/4 v9, 0x0

    .line 249
    const/16 v10, 0x1c

    .line 250
    .line 251
    const v7, 0x7f13138d

    .line 252
    .line 253
    .line 254
    const/4 v8, 0x0

    .line 255
    invoke-static/range {v5 .. v10}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v0, v1}, La/uv7;-><init>(La/ra10;)V

    .line 260
    .line 261
    .line 262
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v4, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    :goto_7
    iput-boolean p0, v3, La/po6;->N:Z

    .line 269
    .line 270
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
