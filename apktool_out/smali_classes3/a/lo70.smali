.class public final La/lo70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/to70;


# direct methods
.method public synthetic constructor <init>(La/to70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lo70;->i:B

    iput-object p1, p0, La/lo70;->k:La/to70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/lo70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lo70;->k:La/to70;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/lo70;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/lo70;-><init>(La/to70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/lo70;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/lo70;-><init>(La/to70;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/lo70;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/lo70;-><init>(La/to70;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lo70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lo70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lo70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lo70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lo70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lo70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lo70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/lo70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/lo70;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/lo70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lo70;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/lo70;->k:La/to70;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/lo70;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_4

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, La/to70;->J:La/ddu;

    .line 32
    .line 33
    filled-new-array {v2}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-boolean v2, p0, La/lo70;->j:Z

    .line 38
    .line 39
    invoke-virtual {p1, v1, p0}, La/ddu;->a([ILa/bnn0;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    move-object v4, v0

    .line 46
    goto :goto_4

    .line 47
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    move-object v0, p1

    .line 64
    check-cast v0, La/uq60;

    .line 65
    .line 66
    iget v0, v0, La/uq60;->a:I

    .line 67
    .line 68
    if-ne v0, v2, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    move-object p1, v4

    .line 72
    :goto_1
    check-cast p1, La/uq60;

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    iget-object v4, p1, La/uq60;->b:La/vpv0;

    .line 77
    .line 78
    :cond_5
    if-nez v4, :cond_6

    .line 79
    .line 80
    const/4 p0, -0x1

    .line 81
    goto :goto_2

    .line 82
    :cond_6
    sget-object p0, La/so70;->a:[I

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    aget p0, p0, p1

    .line 89
    .line 90
    :goto_2
    if-eq p0, v2, :cond_8

    .line 91
    .line 92
    const/4 p1, 0x2

    .line 93
    if-eq p0, p1, :cond_7

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_7
    sget-object p0, La/zn70;->a:La/zn70;

    .line 97
    .line 98
    invoke-virtual {v3, p0}, La/to70;->F(La/io70;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_8
    new-instance p0, La/yn70;

    .line 103
    .line 104
    iget-object p1, v3, La/to70;->z:La/y5s;

    .line 105
    .line 106
    iget-object p1, p1, La/y5s;->a:La/s470;

    .line 107
    .line 108
    invoke-virtual {p1}, La/s470;->a()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    invoke-direct {p0, v0, v1}, La/yn70;-><init>(J)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, p0}, La/to70;->F(La/io70;)V

    .line 116
    .line 117
    .line 118
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    :goto_4
    return-object v4

    .line 121
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 122
    .line 123
    iget-boolean v5, p0, La/lo70;->j:Z

    .line 124
    .line 125
    if-eqz v5, :cond_a

    .line 126
    .line 127
    if-ne v5, v2, :cond_9

    .line 128
    .line 129
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, v3, La/to70;->y:La/vrs0;

    .line 141
    .line 142
    iput-boolean v2, p0, La/lo70;->j:Z

    .line 143
    .line 144
    invoke-virtual {p1, p0}, La/vrs0;->a(La/zje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v0, :cond_b

    .line 149
    .line 150
    move-object v4, v0

    .line 151
    goto :goto_6

    .line 152
    :cond_b
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_6
    return-object v4

    .line 155
    :pswitch_1
    iget-object v0, v3, La/to70;->g:La/mne;

    .line 156
    .line 157
    sget-object v5, La/wne;->a:La/wne;

    .line 158
    .line 159
    iget-boolean v6, p0, La/lo70;->j:Z

    .line 160
    .line 161
    if-eqz v6, :cond_d

    .line 162
    .line 163
    if-ne v6, v2, :cond_c

    .line 164
    .line 165
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_c
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_9

    .line 173
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, v3, La/to70;->H:La/abu;

    .line 177
    .line 178
    iput-boolean v2, p0, La/lo70;->j:Z

    .line 179
    .line 180
    invoke-virtual {p1, p0}, La/abu;->w(La/zje;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-ne p1, v5, :cond_e

    .line 185
    .line 186
    move-object v4, v5

    .line 187
    goto :goto_9

    .line 188
    :cond_e
    :goto_7
    check-cast p1, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    const/16 p1, 0x1a

    .line 195
    .line 196
    const/16 v1, 0x17

    .line 197
    .line 198
    if-nez p0, :cond_f

    .line 199
    .line 200
    sget-object p0, La/sy5;->a:La/sy5;

    .line 201
    .line 202
    invoke-virtual {v3, p0}, La/to70;->w(La/zy5;)V

    .line 203
    .line 204
    .line 205
    sget-object p0, La/in70;->b:La/in70;

    .line 206
    .line 207
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    iget-object v8, v0, La/mne;->c:La/vs10;

    .line 212
    .line 213
    new-instance v6, La/wk60;

    .line 214
    .line 215
    invoke-direct {v6, v1}, La/wk60;-><init>(B)V

    .line 216
    .line 217
    .line 218
    new-instance v9, La/nf60;

    .line 219
    .line 220
    invoke-direct {v9, v3, p0, v4, p1}, La/nf60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 221
    .line 222
    .line 223
    const/16 v10, 0xa

    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_f
    iget-object p0, v3, La/to70;->I:La/j1q0;

    .line 231
    .line 232
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 233
    .line 234
    iget-object p0, p0, La/m1q0;->a:La/q7d0;

    .line 235
    .line 236
    const/4 v2, 0x0

    .line 237
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    const-string v5, "WEBVIEW_ANIMATION_ENABLE"

    .line 242
    .line 243
    invoke-interface {p0, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    if-nez p0, :cond_10

    .line 248
    .line 249
    sget-object p0, La/in70;->a:La/in70;

    .line 250
    .line 251
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    iget-object v8, v0, La/mne;->c:La/vs10;

    .line 256
    .line 257
    new-instance v6, La/wk60;

    .line 258
    .line 259
    invoke-direct {v6, v1}, La/wk60;-><init>(B)V

    .line 260
    .line 261
    .line 262
    new-instance v9, La/nf60;

    .line 263
    .line 264
    invoke-direct {v9, v3, p0, v4, p1}, La/nf60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 265
    .line 266
    .line 267
    const/16 v10, 0xa

    .line 268
    .line 269
    const/4 v7, 0x0

    .line 270
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 271
    .line 272
    .line 273
    :cond_10
    :goto_8
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    :goto_9
    return-object v4

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
