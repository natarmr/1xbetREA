.class public final La/n6d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/k6k0;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/n6d;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/n6d;->b:I

    .line 8
    .line 9
    iput-object p2, p0, La/n6d;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/n6d;->a:B

    iput-object p1, p0, La/n6d;->c:Ljava/lang/Object;

    iput p2, p0, La/n6d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/n6d;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x0

    .line 8
    iget v6, p0, La/n6d;->b:I

    .line 9
    .line 10
    iget-object v7, p0, La/n6d;->c:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    check-cast v7, La/xk80;

    .line 22
    .line 23
    invoke-virtual {v7}, La/xk80;->k()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    rem-int v0, p1, v6

    .line 28
    .line 29
    sub-int/2addr p1, v0

    .line 30
    add-int/2addr p1, p0

    .line 31
    const/4 p0, 0x6

    .line 32
    invoke-static {v7, p1, v5, p2, p0}, La/xk80;->g(La/xk80;ILa/uts0;La/yje;I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, La/wne;->a:La/wne;

    .line 37
    .line 38
    if-ne p0, p1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    :goto_0
    return-object p0

    .line 44
    :pswitch_0
    move-object v8, p1

    .line 45
    check-cast v8, La/x6k0;

    .line 46
    .line 47
    check-cast v7, La/k6k0;

    .line 48
    .line 49
    iget-object p0, v7, La/k6k0;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 50
    .line 51
    iget-object p1, v7, La/k6k0;->c:La/x5k0;

    .line 52
    .line 53
    iget-object p2, v7, La/k6k0;->l:La/sje;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eq v6, p0, :cond_1

    .line 60
    .line 61
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_1
    instance-of p0, v8, La/v6k0;

    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    move-object p0, v8

    .line 71
    check-cast p0, La/v6k0;

    .line 72
    .line 73
    move-object v6, v7

    .line 74
    iget-object v7, p0, La/v6k0;->a:Ljava/lang/String;

    .line 75
    .line 76
    iget-object p1, v6, La/k6k0;->g:La/tn30;

    .line 77
    .line 78
    iget p0, p0, La/v6k0;->c:I

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    if-eq p0, v4, :cond_2

    .line 84
    .line 85
    if-nez p0, :cond_3

    .line 86
    .line 87
    :cond_2
    iget-object v0, p1, La/tn30;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 88
    .line 89
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, La/tn30;->b:La/skg0;

    .line 93
    .line 94
    int-to-byte p0, p0

    .line 95
    iget-object p1, p1, La/skg0;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 98
    .line 99
    .line 100
    :cond_3
    new-instance v5, La/myj0;

    .line 101
    .line 102
    const/4 v10, 0x4

    .line 103
    invoke-direct/range {v5 .. v10}, La/myj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2, v9, v9, v5, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iput-object p0, v6, La/k6k0;->q:La/c4m0;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move-object v6, v7

    .line 114
    sget-object p0, La/u6k0;->a:La/u6k0;

    .line 115
    .line 116
    invoke-static {v8, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_6

    .line 121
    .line 122
    new-instance p0, La/h6k0;

    .line 123
    .line 124
    invoke-direct {p0, v6, v9, v3}, La/h6k0;-><init>(La/k6k0;La/yje;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2, v9, v9, p0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    iput-object p0, v6, La/k6k0;->n:La/c4m0;

    .line 132
    .line 133
    iget-object p0, p1, La/x5k0;->g:La/c4m0;

    .line 134
    .line 135
    if-eqz p0, :cond_5

    .line 136
    .line 137
    invoke-virtual {p0, v9}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    iput-object v9, p1, La/x5k0;->g:La/c4m0;

    .line 141
    .line 142
    sget-object p0, La/b6k0;->a:La/b6k0;

    .line 143
    .line 144
    invoke-virtual {v6, p0}, La/k6k0;->b(La/g6k0;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_6
    instance-of p0, v8, La/w6k0;

    .line 149
    .line 150
    if-eqz p0, :cond_8

    .line 151
    .line 152
    iget-object p0, v6, La/k6k0;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 153
    .line 154
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 155
    .line 156
    .line 157
    new-instance p0, La/h6k0;

    .line 158
    .line 159
    invoke-direct {p0, v6, v9, v4}, La/h6k0;-><init>(La/k6k0;La/yje;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {p2, v9, v9, p0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    iput-object p0, v6, La/k6k0;->n:La/c4m0;

    .line 167
    .line 168
    iget-object p0, p1, La/x5k0;->g:La/c4m0;

    .line 169
    .line 170
    if-eqz p0, :cond_7

    .line 171
    .line 172
    invoke-virtual {p0, v9}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    iput-object v9, p1, La/x5k0;->g:La/c4m0;

    .line 176
    .line 177
    sget-object p0, La/d6k0;->a:La/d6k0;

    .line 178
    .line 179
    invoke-virtual {v6, p0}, La/k6k0;->b(La/g6k0;)V

    .line 180
    .line 181
    .line 182
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 186
    .line 187
    .line 188
    :goto_2
    return-object v5

    .line 189
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    move-object v8, v7

    .line 196
    check-cast v8, La/qf70;

    .line 197
    .line 198
    iget-object v9, v8, La/qf70;->J:La/p7m0;

    .line 199
    .line 200
    :cond_9
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    move-object p1, p0

    .line 205
    check-cast p1, La/qe70;

    .line 206
    .line 207
    if-eqz v0, :cond_a

    .line 208
    .line 209
    iget-object p2, v8, La/qf70;->l:La/spx;

    .line 210
    .line 211
    invoke-virtual {p2}, La/spx;->a()Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-nez p2, :cond_a

    .line 216
    .line 217
    move p2, v1

    .line 218
    goto :goto_3

    .line 219
    :cond_a
    move p2, v2

    .line 220
    :goto_3
    iget-object v7, v8, La/qf70;->E:La/y5s;

    .line 221
    .line 222
    iget-object v7, v7, La/y5s;->a:La/s470;

    .line 223
    .line 224
    sget-object v10, La/s470;->p:La/s470;

    .line 225
    .line 226
    if-eq v7, v10, :cond_b

    .line 227
    .line 228
    if-lt v6, v3, :cond_b

    .line 229
    .line 230
    move v7, v1

    .line 231
    goto :goto_4

    .line 232
    :cond_b
    move v7, v2

    .line 233
    :goto_4
    invoke-static {p1, v5, p2, v7, v4}, La/qe70;->a(La/qe70;La/ql5;ZZI)La/qe70;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {v9, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-eqz p0, :cond_9

    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_2
    instance-of v0, p2, La/m6d;

    .line 247
    .line 248
    if-eqz v0, :cond_c

    .line 249
    .line 250
    move-object v0, p2

    .line 251
    check-cast v0, La/m6d;

    .line 252
    .line 253
    iget v2, v0, La/m6d;->k:I

    .line 254
    .line 255
    const/high16 v4, -0x80000000

    .line 256
    .line 257
    and-int v8, v2, v4

    .line 258
    .line 259
    if-eqz v8, :cond_c

    .line 260
    .line 261
    sub-int/2addr v2, v4

    .line 262
    iput v2, v0, La/m6d;->k:I

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_c
    new-instance v0, La/m6d;

    .line 266
    .line 267
    invoke-direct {v0, p0, p2}, La/m6d;-><init>(La/n6d;La/yje;)V

    .line 268
    .line 269
    .line 270
    :goto_5
    iget-object p0, v0, La/m6d;->i:Ljava/lang/Object;

    .line 271
    .line 272
    sget-object p2, La/wne;->a:La/wne;

    .line 273
    .line 274
    iget v2, v0, La/m6d;->k:I

    .line 275
    .line 276
    if-eqz v2, :cond_f

    .line 277
    .line 278
    if-eq v2, v1, :cond_e

    .line 279
    .line 280
    if-ne v2, v3, :cond_d

    .line 281
    .line 282
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_d
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 287
    .line 288
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    goto :goto_9

    .line 292
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_f
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    check-cast v7, La/q99;

    .line 300
    .line 301
    new-instance p0, Lkotlin/collections/IndexedValue;

    .line 302
    .line 303
    invoke-direct {p0, v6, p1}, Lkotlin/collections/IndexedValue;-><init>(ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iput v1, v0, La/m6d;->k:I

    .line 307
    .line 308
    invoke-interface {v7, v0, p0}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    if-ne p0, p2, :cond_10

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_10
    :goto_6
    iput v3, v0, La/m6d;->k:I

    .line 316
    .line 317
    invoke-static {v0}, La/o5n0;->v(La/zje;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    if-ne p0, p2, :cond_11

    .line 322
    .line 323
    :goto_7
    move-object v5, p2

    .line 324
    goto :goto_9

    .line 325
    :cond_11
    :goto_8
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    :goto_9
    return-object v5

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
