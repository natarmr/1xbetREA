.class public final La/cdm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/kmq;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 25
    iput-byte p4, p0, La/cdm0;->a:B

    iput-object p1, p0, La/cdm0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/cdm0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/cdm0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/kmq;Lkotlin/coroutines/CoroutineContext;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/cdm0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/cdm0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, La/ecq0;->b(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, La/cdm0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, La/n7t0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p2, p1, v0, v1}, La/n7t0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, La/cdm0;->d:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/cdm0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x7f13115a

    .line 5
    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    iget-object v7, p0, La/cdm0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, p0, La/cdm0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v9, p0, La/cdm0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v9, Lkotlin/coroutines/CoroutineContext;

    .line 23
    .line 24
    check-cast v7, La/n7t0;

    .line 25
    .line 26
    invoke-static {v9, p1, v8, v7, p2}, La/ntb;->d0(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, La/wne;->a:La/wne;

    .line 31
    .line 32
    if-ne p0, p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    :goto_0
    return-object p0

    .line 38
    :pswitch_0
    instance-of v0, p2, La/ryn0;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    move-object v0, p2

    .line 43
    check-cast v0, La/ryn0;

    .line 44
    .line 45
    iget v10, v0, La/ryn0;->j:I

    .line 46
    .line 47
    and-int v11, v10, v5

    .line 48
    .line 49
    if-eqz v11, :cond_1

    .line 50
    .line 51
    sub-int/2addr v10, v5

    .line 52
    iput v10, v0, La/ryn0;->j:I

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance v0, La/ryn0;

    .line 56
    .line 57
    invoke-direct {v0, p0, p2}, La/ryn0;-><init>(La/cdm0;La/yje;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    iget-object p0, v0, La/ryn0;->i:Ljava/lang/Object;

    .line 61
    .line 62
    sget-object p2, La/wne;->a:La/wne;

    .line 63
    .line 64
    iget v5, v0, La/ryn0;->j:I

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    if-ne v5, v6, :cond_2

    .line 69
    .line 70
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    check-cast v9, La/kmq;

    .line 82
    .line 83
    check-cast p1, La/ql5;

    .line 84
    .line 85
    new-instance p0, La/ksn0;

    .line 86
    .line 87
    sget-object v3, La/pn40;->a:La/pn40;

    .line 88
    .line 89
    check-cast v8, La/jsn0;

    .line 90
    .line 91
    iget-wide v3, v8, La/jsn0;->a:D

    .line 92
    .line 93
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 94
    .line 95
    invoke-static {v3, v4, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    iget-wide v10, p1, La/ql5;->b:D

    .line 100
    .line 101
    invoke-static {v10, v11, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-object p1, p1, La/ql5;->f:Ljava/lang/String;

    .line 106
    .line 107
    check-cast v7, La/zyn0;

    .line 108
    .line 109
    iget-object v5, v7, La/zyn0;->K:La/ctf0;

    .line 110
    .line 111
    new-array v7, v1, [Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 114
    .line 115
    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v5, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {p0, v3, v4, p1, v1}, La/ksn0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iput v6, v0, La/ryn0;->j:I

    .line 127
    .line 128
    invoke-interface {v9, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-ne p0, p2, :cond_4

    .line 133
    .line 134
    move-object v3, p2

    .line 135
    goto :goto_3

    .line 136
    :cond_4
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_3
    return-object v3

    .line 139
    :pswitch_1
    instance-of v0, p2, La/wqn0;

    .line 140
    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    move-object v0, p2

    .line 144
    check-cast v0, La/wqn0;

    .line 145
    .line 146
    iget v10, v0, La/wqn0;->j:I

    .line 147
    .line 148
    and-int v11, v10, v5

    .line 149
    .line 150
    if-eqz v11, :cond_5

    .line 151
    .line 152
    sub-int/2addr v10, v5

    .line 153
    iput v10, v0, La/wqn0;->j:I

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_5
    new-instance v0, La/wqn0;

    .line 157
    .line 158
    invoke-direct {v0, p0, p2}, La/wqn0;-><init>(La/cdm0;La/yje;)V

    .line 159
    .line 160
    .line 161
    :goto_4
    iget-object p0, v0, La/wqn0;->i:Ljava/lang/Object;

    .line 162
    .line 163
    sget-object p2, La/wne;->a:La/wne;

    .line 164
    .line 165
    iget v5, v0, La/wqn0;->j:I

    .line 166
    .line 167
    if-eqz v5, :cond_7

    .line 168
    .line 169
    if-ne v5, v6, :cond_6

    .line 170
    .line 171
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_7
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    check-cast v9, La/kmq;

    .line 183
    .line 184
    check-cast p1, La/ql5;

    .line 185
    .line 186
    new-instance p0, La/ksn0;

    .line 187
    .line 188
    sget-object v3, La/pn40;->a:La/pn40;

    .line 189
    .line 190
    check-cast v8, La/jsn0;

    .line 191
    .line 192
    iget-wide v3, v8, La/jsn0;->a:D

    .line 193
    .line 194
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 195
    .line 196
    invoke-static {v3, v4, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    iget-wide v10, p1, La/ql5;->b:D

    .line 201
    .line 202
    invoke-static {v10, v11, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    iget-object p1, p1, La/ql5;->f:Ljava/lang/String;

    .line 207
    .line 208
    check-cast v7, La/arn0;

    .line 209
    .line 210
    iget-object v5, v7, La/arn0;->c:La/ctf0;

    .line 211
    .line 212
    new-array v7, v1, [Ljava/lang/Object;

    .line 213
    .line 214
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 215
    .line 216
    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v5, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-direct {p0, v3, v4, p1, v1}, La/ksn0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    iput v6, v0, La/wqn0;->j:I

    .line 228
    .line 229
    invoke-interface {v9, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    if-ne p0, p2, :cond_8

    .line 234
    .line 235
    move-object v3, p2

    .line 236
    goto :goto_6

    .line 237
    :cond_8
    :goto_5
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    :goto_6
    return-object v3

    .line 240
    :pswitch_2
    instance-of v0, p2, La/bdm0;

    .line 241
    .line 242
    if-eqz v0, :cond_9

    .line 243
    .line 244
    move-object v0, p2

    .line 245
    check-cast v0, La/bdm0;

    .line 246
    .line 247
    iget v1, v0, La/bdm0;->j:I

    .line 248
    .line 249
    and-int v2, v1, v5

    .line 250
    .line 251
    if-eqz v2, :cond_9

    .line 252
    .line 253
    sub-int/2addr v1, v5

    .line 254
    iput v1, v0, La/bdm0;->j:I

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_9
    new-instance v0, La/bdm0;

    .line 258
    .line 259
    invoke-direct {v0, p0, p2}, La/bdm0;-><init>(La/cdm0;La/yje;)V

    .line 260
    .line 261
    .line 262
    :goto_7
    iget-object p0, v0, La/bdm0;->i:Ljava/lang/Object;

    .line 263
    .line 264
    sget-object p2, La/wne;->a:La/wne;

    .line 265
    .line 266
    iget v1, v0, La/bdm0;->j:I

    .line 267
    .line 268
    if-eqz v1, :cond_b

    .line 269
    .line 270
    if-ne v1, v6, :cond_a

    .line 271
    .line 272
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_b
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    check-cast v9, La/kmq;

    .line 284
    .line 285
    check-cast p1, Lkotlin/Unit;

    .line 286
    .line 287
    check-cast v8, La/ddm0;

    .line 288
    .line 289
    iget-object p0, v8, La/ddm0;->a:Ljava/util/LinkedHashMap;

    .line 290
    .line 291
    check-cast v7, Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {p0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    check-cast p0, La/xqj0;

    .line 298
    .line 299
    if-nez p0, :cond_c

    .line 300
    .line 301
    sget-object p0, La/xqj0;->v:La/xqj0;

    .line 302
    .line 303
    :cond_c
    iput v6, v0, La/bdm0;->j:I

    .line 304
    .line 305
    invoke-interface {v9, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    if-ne p0, p2, :cond_d

    .line 310
    .line 311
    move-object v3, p2

    .line 312
    goto :goto_9

    .line 313
    :cond_d
    :goto_8
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    :goto_9
    return-object v3

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
