.class public final La/ifr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/ofr0;


# direct methods
.method public synthetic constructor <init>(La/ofr0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ifr0;->i:B

    iput-object p1, p0, La/ifr0;->l:La/ofr0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ifr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ifr0;->l:La/ofr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ifr0;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ifr0;-><init>(La/ofr0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ifr0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ifr0;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ifr0;-><init>(La/ofr0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ifr0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ifr0;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ifr0;-><init>(La/ofr0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ifr0;->k:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/ifr0;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/ifr0;-><init>(La/ofr0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/ifr0;->k:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/ifr0;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/ifr0;-><init>(La/ofr0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/ifr0;->k:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/ifr0;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/ifr0;-><init>(La/ofr0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/ifr0;->k:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ifr0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ifr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ifr0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ifr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/jkg;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ifr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ifr0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ifr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/jkg;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ifr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ifr0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ifr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ifr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ifr0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ifr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/ifr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/ifr0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/ifr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/cic0;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/ifr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/ifr0;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/ifr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ifr0;->i:B

    .line 2
    .line 3
    sget-object v1, La/c1r0;->a:La/c1r0;

    .line 4
    .line 5
    sget-object v2, La/b1r0;->a:La/b1r0;

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    sget-object v4, La/g1r0;->a:La/g1r0;

    .line 10
    .line 11
    sget-object v5, La/f1r0;->a:La/f1r0;

    .line 12
    .line 13
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    iget-object v8, p0, La/ifr0;->l:La/ofr0;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/List;

    .line 25
    .line 26
    sget-object v1, La/wne;->a:La/wne;

    .line 27
    .line 28
    iget-boolean v2, p0, La/ifr0;->j:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    if-ne v2, v7, :cond_0

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 47
    .line 48
    iput-boolean v7, p0, La/ifr0;->j:Z

    .line 49
    .line 50
    sget p1, La/ofr0;->U0:I

    .line 51
    .line 52
    iget-object p1, v8, La/ofr0;->u:La/kb0;

    .line 53
    .line 54
    new-instance v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, La/gza0;

    .line 78
    .line 79
    iget-object v7, v7, La/gza0;->c:Ljava/util/List;

    .line 80
    .line 81
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-static {v2}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v6, La/sj0;

    .line 90
    .line 91
    invoke-direct {v6, v2}, La/sj0;-><init>(Ljava/util/ArrayList;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v6, p0}, La/kb0;->p(La/jk0;La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    sget-object p1, La/wne;->a:La/wne;

    .line 102
    .line 103
    if-ne p0, p1, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    :goto_1
    if-ne p0, v1, :cond_4

    .line 109
    .line 110
    move-object v9, v1

    .line 111
    goto :goto_5

    .line 112
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_6

    .line 117
    .line 118
    new-instance p0, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, La/gza0;

    .line 142
    .line 143
    invoke-static {v0}, La/zsm0;->v(La/gza0;)La/vh0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    new-instance p1, La/z0r0;

    .line 152
    .line 153
    invoke-direct {p1, v5, p0}, La/z0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    new-instance p1, La/z0r0;

    .line 158
    .line 159
    sget-object p0, La/iun;->a:La/iun;

    .line 160
    .line 161
    invoke-direct {p1, v4, p0}, La/z0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    :goto_4
    sget p0, La/ofr0;->U0:I

    .line 165
    .line 166
    invoke-virtual {v8, p1}, La/ofr0;->V(La/a1r0;)V

    .line 167
    .line 168
    .line 169
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    :goto_5
    return-object v9

    .line 172
    :pswitch_0
    iget-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, La/jkg;

    .line 175
    .line 176
    sget-object v3, La/wne;->a:La/wne;

    .line 177
    .line 178
    iget-boolean v10, p0, La/ifr0;->j:Z

    .line 179
    .line 180
    if-eqz v10, :cond_8

    .line 181
    .line 182
    if-ne v10, v7, :cond_7

    .line 183
    .line 184
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_7

    .line 188
    .line 189
    :cond_7
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_9

    .line 193
    .line 194
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    if-eqz v0, :cond_f

    .line 198
    .line 199
    instance-of p1, v0, La/gkg;

    .line 200
    .line 201
    if-eqz p1, :cond_c

    .line 202
    .line 203
    sget p0, La/ofr0;->U0:I

    .line 204
    .line 205
    iget-object p0, v8, La/ofr0;->q0:La/c4m0;

    .line 206
    .line 207
    if-eqz p0, :cond_9

    .line 208
    .line 209
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    if-ne p0, v7, :cond_9

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_9
    iget-object p0, v8, La/ofr0;->r0:La/c4m0;

    .line 217
    .line 218
    if-eqz p0, :cond_a

    .line 219
    .line 220
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-ne p0, v7, :cond_a

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_a
    new-instance p0, La/cfr0;

    .line 228
    .line 229
    const/4 p1, 0x2

    .line 230
    invoke-direct {p0, v8, p1}, La/cfr0;-><init>(La/ofr0;B)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8, p0}, La/ofr0;->P(Lkotlin/jvm/functions/Function0;)La/c4m0;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    iput-object p0, v8, La/ofr0;->r0:La/c4m0;

    .line 238
    .line 239
    :goto_6
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, La/ser0;

    .line 244
    .line 245
    iget-object p0, p0, La/ser0;->q:La/n2r0;

    .line 246
    .line 247
    iget-object p0, p0, La/n2r0;->c:Ljava/util/List;

    .line 248
    .line 249
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    if-eqz p0, :cond_b

    .line 254
    .line 255
    new-instance p0, La/q0r0;

    .line 256
    .line 257
    sget-object p1, La/iun;->a:La/iun;

    .line 258
    .line 259
    invoke-direct {p0, v2, p1}, La/q0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 260
    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_b
    new-instance p0, La/q0r0;

    .line 264
    .line 265
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    check-cast p1, La/ser0;

    .line 270
    .line 271
    iget-object p1, p1, La/ser0;->q:La/n2r0;

    .line 272
    .line 273
    iget-object p1, p1, La/n2r0;->c:Ljava/util/List;

    .line 274
    .line 275
    invoke-direct {p0, v1, p1}, La/q0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 276
    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_c
    instance-of p1, v0, La/ikg;

    .line 280
    .line 281
    if-eqz p1, :cond_d

    .line 282
    .line 283
    new-instance p0, La/q0r0;

    .line 284
    .line 285
    sget-object p1, La/iun;->a:La/iun;

    .line 286
    .line 287
    invoke-direct {p0, v4, p1}, La/q0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_d
    instance-of p1, v0, La/hkg;

    .line 292
    .line 293
    if-eqz p1, :cond_f

    .line 294
    .line 295
    iget-object p1, v8, La/ofr0;->r0:La/c4m0;

    .line 296
    .line 297
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 298
    .line 299
    .line 300
    iget-object p1, v8, La/ofr0;->t:La/alg;

    .line 301
    .line 302
    new-instance v1, La/dlg;

    .line 303
    .line 304
    move-object v2, v0

    .line 305
    check-cast v2, La/hkg;

    .line 306
    .line 307
    iget-object v2, v2, La/hkg;->a:Ljava/util/List;

    .line 308
    .line 309
    invoke-direct {v1, v2}, La/dlg;-><init>(Ljava/util/List;)V

    .line 310
    .line 311
    .line 312
    iput-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 313
    .line 314
    iput-boolean v7, p0, La/ifr0;->j:Z

    .line 315
    .line 316
    check-cast p1, La/ulg;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, v1, p0}, La/ulg;->i(La/qlg;La/zje;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    if-ne p0, v3, :cond_e

    .line 326
    .line 327
    move-object v9, v3

    .line 328
    goto :goto_9

    .line 329
    :cond_e
    :goto_7
    new-instance p0, La/q0r0;

    .line 330
    .line 331
    check-cast v0, La/hkg;

    .line 332
    .line 333
    iget-object p1, v0, La/hkg;->a:Ljava/util/List;

    .line 334
    .line 335
    invoke-direct {p0, v5, p1}, La/q0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 336
    .line 337
    .line 338
    :goto_8
    sget p1, La/ofr0;->U0:I

    .line 339
    .line 340
    invoke-virtual {v8, p0}, La/ofr0;->V(La/a1r0;)V

    .line 341
    .line 342
    .line 343
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 347
    .line 348
    .line 349
    :goto_9
    return-object v9

    .line 350
    :pswitch_1
    iget-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, La/jkg;

    .line 353
    .line 354
    sget-object v3, La/wne;->a:La/wne;

    .line 355
    .line 356
    iget-boolean v10, p0, La/ifr0;->j:Z

    .line 357
    .line 358
    if-eqz v10, :cond_11

    .line 359
    .line 360
    if-ne v10, v7, :cond_10

    .line 361
    .line 362
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_d

    .line 366
    .line 367
    :cond_10
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_12

    .line 371
    .line 372
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    if-eqz v0, :cond_1e

    .line 376
    .line 377
    instance-of p1, v0, La/gkg;

    .line 378
    .line 379
    if-eqz p1, :cond_17

    .line 380
    .line 381
    iget-object p0, v8, La/ofr0;->q0:La/c4m0;

    .line 382
    .line 383
    if-eqz p0, :cond_12

    .line 384
    .line 385
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 386
    .line 387
    .line 388
    move-result p0

    .line 389
    if-ne p0, v7, :cond_12

    .line 390
    .line 391
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    goto/16 :goto_12

    .line 394
    .line 395
    :cond_12
    iget-object p0, v8, La/ofr0;->q0:La/c4m0;

    .line 396
    .line 397
    if-eqz p0, :cond_13

    .line 398
    .line 399
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    if-ne p0, v7, :cond_13

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_13
    iget-object p0, v8, La/ofr0;->s0:La/c4m0;

    .line 407
    .line 408
    if-eqz p0, :cond_14

    .line 409
    .line 410
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    if-ne p0, v7, :cond_14

    .line 415
    .line 416
    goto :goto_a

    .line 417
    :cond_14
    new-instance p0, La/cfr0;

    .line 418
    .line 419
    const/4 p1, 0x3

    .line 420
    invoke-direct {p0, v8, p1}, La/cfr0;-><init>(La/ofr0;B)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v8, p0}, La/ofr0;->P(Lkotlin/jvm/functions/Function0;)La/c4m0;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    iput-object p0, v8, La/ofr0;->s0:La/c4m0;

    .line 428
    .line 429
    :goto_a
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    check-cast p0, La/ser0;

    .line 434
    .line 435
    iget-object p0, p0, La/ser0;->t:La/j2r0;

    .line 436
    .line 437
    iget-object p0, p0, La/j2r0;->c:Ljava/util/List;

    .line 438
    .line 439
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 440
    .line 441
    .line 442
    move-result p0

    .line 443
    if-eqz p0, :cond_15

    .line 444
    .line 445
    new-instance p0, La/n0r0;

    .line 446
    .line 447
    sget-object p1, La/iun;->a:La/iun;

    .line 448
    .line 449
    invoke-direct {p0, v2, p1}, La/n0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 450
    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_15
    new-instance p0, La/n0r0;

    .line 454
    .line 455
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    check-cast p1, La/ser0;

    .line 460
    .line 461
    iget-object p1, p1, La/ser0;->t:La/j2r0;

    .line 462
    .line 463
    iget-object p1, p1, La/j2r0;->c:Ljava/util/List;

    .line 464
    .line 465
    invoke-direct {p0, v1, p1}, La/n0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 466
    .line 467
    .line 468
    :goto_b
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    check-cast p1, La/ser0;

    .line 473
    .line 474
    iget-object p1, p1, La/ser0;->u:La/h2r0;

    .line 475
    .line 476
    iget-object p1, p1, La/h2r0;->c:Ljava/util/List;

    .line 477
    .line 478
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 479
    .line 480
    .line 481
    move-result p1

    .line 482
    if-eqz p1, :cond_16

    .line 483
    .line 484
    new-instance p1, La/m0r0;

    .line 485
    .line 486
    sget-object v0, La/iun;->a:La/iun;

    .line 487
    .line 488
    invoke-direct {p1, v2, v0}, La/m0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 489
    .line 490
    .line 491
    goto :goto_c

    .line 492
    :cond_16
    new-instance p1, La/m0r0;

    .line 493
    .line 494
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    check-cast v0, La/ser0;

    .line 499
    .line 500
    iget-object v0, v0, La/ser0;->u:La/h2r0;

    .line 501
    .line 502
    iget-object v0, v0, La/h2r0;->c:Ljava/util/List;

    .line 503
    .line 504
    invoke-direct {p1, v1, v0}, La/m0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 505
    .line 506
    .line 507
    :goto_c
    invoke-virtual {v8, p0}, La/ofr0;->V(La/a1r0;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v8, p1}, La/ofr0;->V(La/a1r0;)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_11

    .line 514
    .line 515
    :cond_17
    instance-of p1, v0, La/ikg;

    .line 516
    .line 517
    if-eqz p1, :cond_18

    .line 518
    .line 519
    new-instance p0, La/n0r0;

    .line 520
    .line 521
    sget-object p1, La/iun;->a:La/iun;

    .line 522
    .line 523
    invoke-direct {p0, v4, p1}, La/n0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 524
    .line 525
    .line 526
    sget v0, La/ofr0;->U0:I

    .line 527
    .line 528
    invoke-virtual {v8, p0}, La/ofr0;->V(La/a1r0;)V

    .line 529
    .line 530
    .line 531
    new-instance p0, La/m0r0;

    .line 532
    .line 533
    invoke-direct {p0, v4, p1}, La/m0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v8, p0}, La/ofr0;->V(La/a1r0;)V

    .line 537
    .line 538
    .line 539
    goto/16 :goto_11

    .line 540
    .line 541
    :cond_18
    instance-of p1, v0, La/hkg;

    .line 542
    .line 543
    if-eqz p1, :cond_1e

    .line 544
    .line 545
    iget-object p1, v8, La/ofr0;->s0:La/c4m0;

    .line 546
    .line 547
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 548
    .line 549
    .line 550
    iget-object p1, v8, La/ofr0;->t:La/alg;

    .line 551
    .line 552
    new-instance v1, La/clg;

    .line 553
    .line 554
    move-object v2, v0

    .line 555
    check-cast v2, La/hkg;

    .line 556
    .line 557
    iget-object v2, v2, La/hkg;->a:Ljava/util/List;

    .line 558
    .line 559
    invoke-direct {v1, v2}, La/clg;-><init>(Ljava/util/List;)V

    .line 560
    .line 561
    .line 562
    iput-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 563
    .line 564
    iput-boolean v7, p0, La/ifr0;->j:Z

    .line 565
    .line 566
    check-cast p1, La/ulg;

    .line 567
    .line 568
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-virtual {p1, v1, p0}, La/ulg;->i(La/qlg;La/zje;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    if-ne p0, v3, :cond_19

    .line 576
    .line 577
    move-object v9, v3

    .line 578
    goto :goto_12

    .line 579
    :cond_19
    :goto_d
    check-cast v0, La/hkg;

    .line 580
    .line 581
    iget-object p0, v0, La/hkg;->a:Ljava/util/List;

    .line 582
    .line 583
    new-instance p1, Ljava/util/ArrayList;

    .line 584
    .line 585
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 586
    .line 587
    .line 588
    new-instance v0, Ljava/util/ArrayList;

    .line 589
    .line 590
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 591
    .line 592
    .line 593
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    if-eqz v1, :cond_1b

    .line 602
    .line 603
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    move-object v2, v1

    .line 608
    check-cast v2, La/xah;

    .line 609
    .line 610
    iget-boolean v2, v2, La/xah;->n:Z

    .line 611
    .line 612
    if-eqz v2, :cond_1a

    .line 613
    .line 614
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    goto :goto_e

    .line 618
    :cond_1a
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    goto :goto_e

    .line 622
    :cond_1b
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 623
    .line 624
    .line 625
    move-result p0

    .line 626
    if-eqz p0, :cond_1c

    .line 627
    .line 628
    new-instance p0, La/n0r0;

    .line 629
    .line 630
    sget-object p1, La/iun;->a:La/iun;

    .line 631
    .line 632
    invoke-direct {p0, v4, p1}, La/n0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 633
    .line 634
    .line 635
    goto :goto_f

    .line 636
    :cond_1c
    new-instance p0, La/n0r0;

    .line 637
    .line 638
    invoke-direct {p0, v5, p1}, La/n0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 639
    .line 640
    .line 641
    :goto_f
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 642
    .line 643
    .line 644
    move-result p1

    .line 645
    if-eqz p1, :cond_1d

    .line 646
    .line 647
    new-instance p1, La/m0r0;

    .line 648
    .line 649
    sget-object v0, La/iun;->a:La/iun;

    .line 650
    .line 651
    invoke-direct {p1, v4, v0}, La/m0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 652
    .line 653
    .line 654
    goto :goto_10

    .line 655
    :cond_1d
    new-instance p1, La/m0r0;

    .line 656
    .line 657
    invoke-direct {p1, v5, v0}, La/m0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 658
    .line 659
    .line 660
    :goto_10
    sget v0, La/ofr0;->U0:I

    .line 661
    .line 662
    invoke-virtual {v8, p0}, La/ofr0;->V(La/a1r0;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v8, p1}, La/ofr0;->V(La/a1r0;)V

    .line 666
    .line 667
    .line 668
    :goto_11
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 669
    .line 670
    goto :goto_12

    .line 671
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 672
    .line 673
    .line 674
    :goto_12
    return-object v9

    .line 675
    :pswitch_2
    iget-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v0, Ljava/util/List;

    .line 678
    .line 679
    sget-object v1, La/wne;->a:La/wne;

    .line 680
    .line 681
    iget-boolean v2, p0, La/ifr0;->j:Z

    .line 682
    .line 683
    if-eqz v2, :cond_20

    .line 684
    .line 685
    if-ne v2, v7, :cond_1f

    .line 686
    .line 687
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    goto :goto_14

    .line 691
    :cond_1f
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    goto :goto_16

    .line 695
    :cond_20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    iput-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 699
    .line 700
    iput-boolean v7, p0, La/ifr0;->j:Z

    .line 701
    .line 702
    sget p1, La/ofr0;->U0:I

    .line 703
    .line 704
    iget-object p1, v8, La/ofr0;->u:La/kb0;

    .line 705
    .line 706
    new-instance v2, La/rj0;

    .line 707
    .line 708
    invoke-direct {v2, v0}, La/rj0;-><init>(Ljava/util/List;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    invoke-virtual {p1, v2, p0}, La/kb0;->p(La/jk0;La/yje;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object p0

    .line 718
    if-ne p0, v1, :cond_21

    .line 719
    .line 720
    goto :goto_13

    .line 721
    :cond_21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 722
    .line 723
    :goto_13
    if-ne p0, v1, :cond_22

    .line 724
    .line 725
    move-object v9, v1

    .line 726
    goto :goto_16

    .line 727
    :cond_22
    :goto_14
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 728
    .line 729
    .line 730
    move-result p0

    .line 731
    if-nez p0, :cond_23

    .line 732
    .line 733
    new-instance p0, La/k0r0;

    .line 734
    .line 735
    invoke-direct {p0, v5, v0}, La/k0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 736
    .line 737
    .line 738
    goto :goto_15

    .line 739
    :cond_23
    new-instance p0, La/k0r0;

    .line 740
    .line 741
    sget-object p1, La/iun;->a:La/iun;

    .line 742
    .line 743
    invoke-direct {p0, v4, p1}, La/k0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 744
    .line 745
    .line 746
    :goto_15
    sget p1, La/ofr0;->U0:I

    .line 747
    .line 748
    invoke-virtual {v8, p0}, La/ofr0;->V(La/a1r0;)V

    .line 749
    .line 750
    .line 751
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 752
    .line 753
    :goto_16
    return-object v9

    .line 754
    :pswitch_3
    iget-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v0, Ljava/util/List;

    .line 757
    .line 758
    sget-object v1, La/wne;->a:La/wne;

    .line 759
    .line 760
    iget-boolean v2, p0, La/ifr0;->j:Z

    .line 761
    .line 762
    if-eqz v2, :cond_25

    .line 763
    .line 764
    if-ne v2, v7, :cond_24

    .line 765
    .line 766
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    goto :goto_19

    .line 770
    :cond_24
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    goto/16 :goto_1c

    .line 774
    .line 775
    :cond_25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    iput-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 779
    .line 780
    iput-boolean v7, p0, La/ifr0;->j:Z

    .line 781
    .line 782
    sget p1, La/ofr0;->U0:I

    .line 783
    .line 784
    iget-object p1, v8, La/ofr0;->u:La/kb0;

    .line 785
    .line 786
    new-instance v2, Ljava/util/ArrayList;

    .line 787
    .line 788
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 789
    .line 790
    .line 791
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 792
    .line 793
    .line 794
    move-result-object v6

    .line 795
    :goto_17
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 796
    .line 797
    .line 798
    move-result v7

    .line 799
    if-eqz v7, :cond_26

    .line 800
    .line 801
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v7

    .line 805
    check-cast v7, La/gza0;

    .line 806
    .line 807
    iget-object v7, v7, La/gza0;->c:Ljava/util/List;

    .line 808
    .line 809
    invoke-static {v2, v7}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 810
    .line 811
    .line 812
    goto :goto_17

    .line 813
    :cond_26
    new-instance v6, La/qj0;

    .line 814
    .line 815
    invoke-direct {v6, v2}, La/qj0;-><init>(Ljava/util/ArrayList;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    invoke-virtual {p1, v6, p0}, La/kb0;->p(La/jk0;La/yje;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object p0

    .line 825
    sget-object p1, La/wne;->a:La/wne;

    .line 826
    .line 827
    if-ne p0, p1, :cond_27

    .line 828
    .line 829
    goto :goto_18

    .line 830
    :cond_27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 831
    .line 832
    :goto_18
    if-ne p0, v1, :cond_28

    .line 833
    .line 834
    move-object v9, v1

    .line 835
    goto :goto_1c

    .line 836
    :cond_28
    :goto_19
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 837
    .line 838
    .line 839
    move-result p0

    .line 840
    if-nez p0, :cond_2a

    .line 841
    .line 842
    new-instance p0, Ljava/util/ArrayList;

    .line 843
    .line 844
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 845
    .line 846
    .line 847
    move-result p1

    .line 848
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 849
    .line 850
    .line 851
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 852
    .line 853
    .line 854
    move-result-object p1

    .line 855
    :goto_1a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 856
    .line 857
    .line 858
    move-result v0

    .line 859
    if-eqz v0, :cond_29

    .line 860
    .line 861
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    check-cast v0, La/gza0;

    .line 866
    .line 867
    invoke-static {v0}, La/zsm0;->v(La/gza0;)La/vh0;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    goto :goto_1a

    .line 875
    :cond_29
    new-instance p1, La/j0r0;

    .line 876
    .line 877
    invoke-direct {p1, v5, p0}, La/j0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 878
    .line 879
    .line 880
    goto :goto_1b

    .line 881
    :cond_2a
    new-instance p1, La/j0r0;

    .line 882
    .line 883
    sget-object p0, La/iun;->a:La/iun;

    .line 884
    .line 885
    invoke-direct {p1, v4, p0}, La/j0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 886
    .line 887
    .line 888
    :goto_1b
    sget p0, La/ofr0;->U0:I

    .line 889
    .line 890
    invoke-virtual {v8, p1}, La/ofr0;->V(La/a1r0;)V

    .line 891
    .line 892
    .line 893
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 894
    .line 895
    :goto_1c
    return-object v9

    .line 896
    :pswitch_4
    iget-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v0, La/cic0;

    .line 899
    .line 900
    sget-object v1, La/wne;->a:La/wne;

    .line 901
    .line 902
    iget-boolean v2, p0, La/ifr0;->j:Z

    .line 903
    .line 904
    if-eqz v2, :cond_2c

    .line 905
    .line 906
    if-ne v2, v7, :cond_2b

    .line 907
    .line 908
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 909
    .line 910
    .line 911
    goto :goto_1e

    .line 912
    :cond_2b
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    goto :goto_20

    .line 916
    :cond_2c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    if-eqz v0, :cond_2d

    .line 920
    .line 921
    iget-object v9, v0, La/cic0;->a:La/uhc0;

    .line 922
    .line 923
    :cond_2d
    iput-object v0, p0, La/ifr0;->k:Ljava/lang/Object;

    .line 924
    .line 925
    iput-boolean v7, p0, La/ifr0;->j:Z

    .line 926
    .line 927
    sget p1, La/ofr0;->U0:I

    .line 928
    .line 929
    iget-object p1, v8, La/ofr0;->u:La/kb0;

    .line 930
    .line 931
    new-instance v2, La/pj0;

    .line 932
    .line 933
    invoke-direct {v2, v9}, La/pj0;-><init>(La/uhc0;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    invoke-virtual {p1, v2, p0}, La/kb0;->p(La/jk0;La/yje;)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object p0

    .line 943
    if-ne p0, v1, :cond_2e

    .line 944
    .line 945
    goto :goto_1d

    .line 946
    :cond_2e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 947
    .line 948
    :goto_1d
    if-ne p0, v1, :cond_2f

    .line 949
    .line 950
    move-object v9, v1

    .line 951
    goto :goto_20

    .line 952
    :cond_2f
    :goto_1e
    if-eqz v0, :cond_30

    .line 953
    .line 954
    new-instance p0, La/i0r0;

    .line 955
    .line 956
    invoke-direct {p0, v5, v0}, La/i0r0;-><init>(La/h1r0;La/cic0;)V

    .line 957
    .line 958
    .line 959
    goto :goto_1f

    .line 960
    :cond_30
    new-instance p0, La/i0r0;

    .line 961
    .line 962
    invoke-direct {p0, v4}, La/i0r0;-><init>(La/h1r0;)V

    .line 963
    .line 964
    .line 965
    :goto_1f
    sget p1, La/ofr0;->U0:I

    .line 966
    .line 967
    invoke-virtual {v8, p0}, La/ofr0;->V(La/a1r0;)V

    .line 968
    .line 969
    .line 970
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 971
    .line 972
    :goto_20
    return-object v9

    .line 973
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
