.class public final La/ql20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/on20;


# direct methods
.method public synthetic constructor <init>(La/on20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ql20;->i:B

    iput-object p1, p0, La/ql20;->l:La/on20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ql20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ql20;->l:La/on20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ql20;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ql20;-><init>(La/on20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ql20;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ql20;-><init>(La/on20;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ql20;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ql20;-><init>(La/on20;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/ql20;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/ql20;-><init>(La/on20;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
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
    iget-byte v0, p0, La/ql20;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/q4f;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ql20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ql20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ql20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ql20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ql20;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ql20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vf7;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ql20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ql20;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ql20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/ql5;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ql20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ql20;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ql20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ql20;->i:B

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    const-string v5, ""

    .line 11
    .line 12
    iget-object v6, v0, La/ql20;->l:La/on20;

    .line 13
    .line 14
    const/4 v7, 0x6

    .line 15
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v14, v1

    .line 26
    check-cast v14, La/q4f;

    .line 27
    .line 28
    sget-object v1, La/wne;->a:La/wne;

    .line 29
    .line 30
    iget-boolean v6, v0, La/ql20;->j:Z

    .line 31
    .line 32
    iget-object v13, v0, La/ql20;->l:La/on20;

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    if-ne v6, v10, :cond_0

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object v14, v0, La/ql20;->k:Ljava/lang/Object;

    .line 51
    .line 52
    iput-boolean v10, v0, La/ql20;->j:Z

    .line 53
    .line 54
    sget v6, La/on20;->m1:I

    .line 55
    .line 56
    invoke-virtual {v13, v14, v0}, La/on20;->Q0(La/q4f;La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v1, :cond_2

    .line 61
    .line 62
    move-object v11, v1

    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_2
    :goto_0
    sget v0, La/on20;->m1:I

    .line 66
    .line 67
    invoke-virtual {v13}, La/i3t0;->D()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/a820;

    .line 72
    .line 73
    iget-object v0, v0, La/a820;->f:La/dzc0;

    .line 74
    .line 75
    iget-object v0, v0, La/dzc0;->a:La/syc0;

    .line 76
    .line 77
    iget-object v0, v0, La/syc0;->a:La/pz40;

    .line 78
    .line 79
    invoke-interface {v0, v5}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, La/yh20;

    .line 83
    .line 84
    invoke-direct {v0, v5, v9}, La/yh20;-><init>(Ljava/lang/String;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v13, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v13, La/on20;->g1:La/bby;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-interface {v0, v11}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    new-instance v0, La/lh20;

    .line 98
    .line 99
    invoke-direct {v0, v13, v4}, La/lh20;-><init>(La/on20;B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v13, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, La/b120;

    .line 106
    .line 107
    invoke-direct {v0, v14, v7}, La/b120;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v13, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v13}, La/on20;->p0()V

    .line 114
    .line 115
    .line 116
    sget-object v0, La/q4f;->m:La/q4f;

    .line 117
    .line 118
    sget-object v1, La/q4f;->h:La/q4f;

    .line 119
    .line 120
    filled-new-array {v0, v1}, [La/q4f;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {v1, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const/4 v4, 0x3

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    new-instance v1, La/ei20;

    .line 136
    .line 137
    invoke-direct {v1, v10}, La/ei20;-><init>(B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    iget-object v1, v13, La/on20;->k1:La/c4m0;

    .line 144
    .line 145
    if-eqz v1, :cond_4

    .line 146
    .line 147
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    iget-object v1, v13, La/on20;->q0:La/pv00;

    .line 151
    .line 152
    iget-object v1, v1, La/pv00;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, La/oif0;

    .line 155
    .line 156
    iget-object v1, v1, La/oif0;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, La/lye;

    .line 159
    .line 160
    iget-object v1, v1, La/lye;->m:La/qoj0;

    .line 161
    .line 162
    new-instance v5, La/tl20;

    .line 163
    .line 164
    invoke-direct {v5, v13, v14, v11, v9}, La/tl20;-><init>(La/on20;La/q4f;La/yje;B)V

    .line 165
    .line 166
    .line 167
    new-instance v6, La/fnq;

    .line 168
    .line 169
    invoke-direct {v6, v1, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 170
    .line 171
    .line 172
    new-instance v1, La/tl20;

    .line 173
    .line 174
    invoke-direct {v1, v13, v14, v11, v10}, La/tl20;-><init>(La/on20;La/q4f;La/yje;B)V

    .line 175
    .line 176
    .line 177
    new-instance v5, La/fnq;

    .line 178
    .line 179
    const/4 v7, 0x4

    .line 180
    invoke-direct {v5, v6, v1, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {v13, v5, v11, v11, v4}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, v13, La/on20;->k1:La/c4m0;

    .line 188
    .line 189
    iget-object v1, v13, La/on20;->l1:La/c4m0;

    .line 190
    .line 191
    if-eqz v1, :cond_5

    .line 192
    .line 193
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 194
    .line 195
    .line 196
    :cond_5
    iget-object v1, v13, La/on20;->r0:La/ymv;

    .line 197
    .line 198
    iget-object v1, v1, La/ymv;->a:La/oif0;

    .line 199
    .line 200
    iget-object v1, v1, La/oif0;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, La/lye;

    .line 203
    .line 204
    iget-object v1, v1, La/lye;->l:La/qoj0;

    .line 205
    .line 206
    new-instance v5, La/tl20;

    .line 207
    .line 208
    invoke-direct {v5, v13, v14, v11, v3}, La/tl20;-><init>(La/on20;La/q4f;La/yje;B)V

    .line 209
    .line 210
    .line 211
    new-instance v3, La/fnq;

    .line 212
    .line 213
    invoke-direct {v3, v1, v5, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 214
    .line 215
    .line 216
    invoke-static {v13, v3, v11, v11, v4}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iput-object v1, v13, La/on20;->l1:La/c4m0;

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_6
    iget-object v1, v13, La/on20;->k1:La/c4m0;

    .line 224
    .line 225
    if-eqz v1, :cond_7

    .line 226
    .line 227
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 228
    .line 229
    .line 230
    :cond_7
    iget-object v1, v13, La/on20;->l1:La/c4m0;

    .line 231
    .line 232
    if-eqz v1, :cond_8

    .line 233
    .line 234
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 235
    .line 236
    .line 237
    :cond_8
    new-instance v1, La/ei20;

    .line 238
    .line 239
    invoke-direct {v1, v7}, La/ei20;-><init>(B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v13, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 243
    .line 244
    .line 245
    :goto_1
    new-instance v1, La/k110;

    .line 246
    .line 247
    const/16 v3, 0x15

    .line 248
    .line 249
    invoke-direct {v1, v13, v14, v3}, La/k110;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v13, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 253
    .line 254
    .line 255
    new-instance v1, La/hj20;

    .line 256
    .line 257
    invoke-direct {v1, v13, v11, v9}, La/hj20;-><init>(La/on20;La/yje;B)V

    .line 258
    .line 259
    .line 260
    invoke-static {v13, v11, v11, v1, v4}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 261
    .line 262
    .line 263
    iget-object v1, v13, La/on20;->Z0:La/j9c;

    .line 264
    .line 265
    invoke-virtual {v1}, La/j9c;->c()La/cit0;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iget-boolean v1, v1, La/cit0;->f0:Z

    .line 270
    .line 271
    invoke-virtual {v13, v1}, La/on20;->L0(Z)V

    .line 272
    .line 273
    .line 274
    if-ne v14, v0, :cond_9

    .line 275
    .line 276
    invoke-virtual {v13}, La/i3t0;->D()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, La/a820;

    .line 281
    .line 282
    iget-object v0, v0, La/a820;->e:La/pvj0;

    .line 283
    .line 284
    iget-object v0, v0, La/pvj0;->a:La/bx6;

    .line 285
    .line 286
    iget-object v0, v0, La/bx6;->b:La/tw6;

    .line 287
    .line 288
    iget-wide v0, v0, La/tw6;->b:D

    .line 289
    .line 290
    invoke-virtual {v13, v0, v1}, La/on20;->O0(D)V

    .line 291
    .line 292
    .line 293
    new-instance v3, La/ks6;

    .line 294
    .line 295
    const/16 v5, 0xa

    .line 296
    .line 297
    invoke-direct {v3, v0, v1, v5}, La/ks6;-><init>(DB)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v13, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 301
    .line 302
    .line 303
    new-instance v12, La/dn20;

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    move-wide v15, v0

    .line 308
    invoke-direct/range {v12 .. v17}, La/dn20;-><init>(La/on20;La/q4f;DLa/yje;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v13, v11, v11, v12, v4}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 312
    .line 313
    .line 314
    :cond_9
    new-instance v0, La/fd20;

    .line 315
    .line 316
    invoke-direct {v0, v2}, La/fd20;-><init>(B)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v13, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v13}, La/on20;->R0()V

    .line 323
    .line 324
    .line 325
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    :goto_2
    return-object v11

    .line 328
    :pswitch_0
    iget-object v1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, La/kmq;

    .line 331
    .line 332
    sget-object v2, La/wne;->a:La/wne;

    .line 333
    .line 334
    iget-boolean v3, v0, La/ql20;->j:Z

    .line 335
    .line 336
    if-eqz v3, :cond_b

    .line 337
    .line 338
    if-ne v3, v10, :cond_a

    .line 339
    .line 340
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    goto :goto_3

    .line 344
    :cond_a
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    iget-object v3, v6, La/on20;->b0:La/j9c;

    .line 352
    .line 353
    invoke-virtual {v3}, La/j9c;->a()La/q4f;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    iput-object v11, v0, La/ql20;->k:Ljava/lang/Object;

    .line 358
    .line 359
    iput-boolean v10, v0, La/ql20;->j:Z

    .line 360
    .line 361
    invoke-interface {v1, v3, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    if-ne v0, v2, :cond_c

    .line 366
    .line 367
    move-object v11, v2

    .line 368
    goto :goto_4

    .line 369
    :cond_c
    :goto_3
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    :goto_4
    return-object v11

    .line 372
    :pswitch_1
    iget-object v1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v1, La/vf7;

    .line 375
    .line 376
    sget-object v2, La/wne;->a:La/wne;

    .line 377
    .line 378
    iget-boolean v3, v0, La/ql20;->j:Z

    .line 379
    .line 380
    if-eqz v3, :cond_e

    .line 381
    .line 382
    if-ne v3, v10, :cond_d

    .line 383
    .line 384
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    goto :goto_5

    .line 388
    :cond_d
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    sget v3, La/on20;->m1:I

    .line 396
    .line 397
    new-instance v3, La/bi20;

    .line 398
    .line 399
    invoke-direct {v3, v1, v9}, La/bi20;-><init>(La/vf7;B)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v6, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 403
    .line 404
    .line 405
    new-instance v3, La/bi20;

    .line 406
    .line 407
    invoke-direct {v3, v1, v10}, La/bi20;-><init>(La/vf7;B)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v6, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 411
    .line 412
    .line 413
    iget-object v3, v6, La/on20;->Q:La/pyu;

    .line 414
    .line 415
    invoke-virtual {v3}, La/pyu;->k()Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    iput-object v11, v0, La/ql20;->k:Ljava/lang/Object;

    .line 420
    .line 421
    iput-boolean v10, v0, La/ql20;->j:Z

    .line 422
    .line 423
    invoke-virtual {v6, v1, v3, v0}, La/on20;->M0(La/vf7;ZLa/zje;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    if-ne v0, v2, :cond_f

    .line 428
    .line 429
    move-object v11, v2

    .line 430
    goto :goto_6

    .line 431
    :cond_f
    :goto_5
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    :goto_6
    return-object v11

    .line 434
    :pswitch_2
    iget-object v1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v1, La/ql5;

    .line 437
    .line 438
    sget-object v12, La/wne;->a:La/wne;

    .line 439
    .line 440
    iget-boolean v13, v0, La/ql20;->j:Z

    .line 441
    .line 442
    if-eqz v13, :cond_11

    .line 443
    .line 444
    if-ne v13, v10, :cond_10

    .line 445
    .line 446
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    goto :goto_7

    .line 450
    :cond_10
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    goto/16 :goto_8

    .line 454
    .line 455
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    sget v8, La/on20;->m1:I

    .line 459
    .line 460
    sget-object v8, La/ab20;->a:La/ab20;

    .line 461
    .line 462
    invoke-virtual {v6, v8}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v8

    .line 469
    check-cast v8, La/a820;

    .line 470
    .line 471
    iget-object v8, v8, La/a820;->d:La/xm5;

    .line 472
    .line 473
    iget-object v8, v8, La/xm5;->c:La/ql5;

    .line 474
    .line 475
    iget-wide v13, v8, La/ql5;->a:J

    .line 476
    .line 477
    iget-wide v3, v1, La/ql5;->a:J

    .line 478
    .line 479
    cmp-long v3, v13, v3

    .line 480
    .line 481
    if-eqz v3, :cond_12

    .line 482
    .line 483
    new-instance v3, La/a8q0;

    .line 484
    .line 485
    const-wide/16 v13, 0x0

    .line 486
    .line 487
    invoke-direct {v3, v5, v13, v14, v7}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 488
    .line 489
    .line 490
    new-instance v4, La/xh20;

    .line 491
    .line 492
    invoke-direct {v4, v3, v9, v10}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v6, v4}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 496
    .line 497
    .line 498
    new-instance v3, La/a8q0;

    .line 499
    .line 500
    invoke-direct {v3, v5, v13, v14, v7}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v6, v3, v9}, La/on20;->G0(La/a8q0;Z)V

    .line 504
    .line 505
    .line 506
    :cond_12
    new-instance v3, La/fd20;

    .line 507
    .line 508
    invoke-direct {v3, v2}, La/fd20;-><init>(B)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v6, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    check-cast v2, La/a820;

    .line 519
    .line 520
    iget-object v2, v2, La/a820;->d:La/xm5;

    .line 521
    .line 522
    iget-object v2, v2, La/xm5;->c:La/ql5;

    .line 523
    .line 524
    iget-wide v2, v2, La/ql5;->a:J

    .line 525
    .line 526
    iget-wide v4, v1, La/ql5;->a:J

    .line 527
    .line 528
    cmp-long v2, v2, v4

    .line 529
    .line 530
    if-eqz v2, :cond_13

    .line 531
    .line 532
    new-instance v2, La/lh20;

    .line 533
    .line 534
    const/4 v3, 0x7

    .line 535
    invoke-direct {v2, v6, v3}, La/lh20;-><init>(La/on20;B)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v6, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 539
    .line 540
    .line 541
    :cond_13
    iput-object v1, v0, La/ql20;->k:Ljava/lang/Object;

    .line 542
    .line 543
    iput-boolean v10, v0, La/ql20;->j:Z

    .line 544
    .line 545
    invoke-virtual {v6, v1, v0}, La/on20;->I0(La/ql5;La/zje;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    if-ne v0, v12, :cond_14

    .line 550
    .line 551
    move-object v11, v12

    .line 552
    goto :goto_8

    .line 553
    :cond_14
    :goto_7
    iget-object v0, v1, La/ql5;->f:Ljava/lang/String;

    .line 554
    .line 555
    sget v1, La/on20;->m1:I

    .line 556
    .line 557
    new-instance v1, La/yh20;

    .line 558
    .line 559
    const/4 v15, 0x2

    .line 560
    invoke-direct {v1, v0, v15}, La/yh20;-><init>(Ljava/lang/String;B)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v6, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 564
    .line 565
    .line 566
    iget-object v0, v6, La/on20;->g1:La/bby;

    .line 567
    .line 568
    if-eqz v0, :cond_15

    .line 569
    .line 570
    invoke-interface {v0, v11}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 571
    .line 572
    .line 573
    :cond_15
    new-instance v0, La/lh20;

    .line 574
    .line 575
    const/16 v8, 0x8

    .line 576
    .line 577
    invoke-direct {v0, v6, v8}, La/lh20;-><init>(La/on20;B)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v6, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v6}, La/on20;->p0()V

    .line 584
    .line 585
    .line 586
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    :goto_8
    return-object v11

    .line 589
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
