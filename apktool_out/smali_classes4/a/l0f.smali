.class public final La/l0f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xae0;


# direct methods
.method public synthetic constructor <init>(La/xae0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l0f;->a:B

    iput-object p1, p0, La/l0f;->b:La/xae0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/l0f;->a:B

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    iget-object v2, p0, La/l0f;->b:La/xae0;

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
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/vco0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/vco0;

    .line 22
    .line 23
    iget v7, v0, La/vco0;->j:I

    .line 24
    .line 25
    and-int v8, v7, v5

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v5

    .line 30
    iput v7, v0, La/vco0;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/vco0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/vco0;-><init>(La/l0f;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/vco0;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/vco0;->j:I

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/d8n0;

    .line 60
    .line 61
    invoke-direct {p0, p1, v1}, La/d8n0;-><init>(La/kmq;B)V

    .line 62
    .line 63
    .line 64
    iput v6, v0, La/vco0;->j:I

    .line 65
    .line 66
    iget-object p1, v2, La/xae0;->a:La/n7m0;

    .line 67
    .line 68
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, p2, :cond_3

    .line 73
    .line 74
    move-object v3, p2

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_2
    return-object v3

    .line 79
    :pswitch_0
    instance-of v0, p2, La/mwj0;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    move-object v0, p2

    .line 84
    check-cast v0, La/mwj0;

    .line 85
    .line 86
    iget v7, v0, La/mwj0;->j:I

    .line 87
    .line 88
    and-int v8, v7, v5

    .line 89
    .line 90
    if-eqz v8, :cond_4

    .line 91
    .line 92
    sub-int/2addr v7, v5

    .line 93
    iput v7, v0, La/mwj0;->j:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    new-instance v0, La/mwj0;

    .line 97
    .line 98
    invoke-direct {v0, p0, p2}, La/mwj0;-><init>(La/l0f;La/yje;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    iget-object p0, v0, La/mwj0;->i:Ljava/lang/Object;

    .line 102
    .line 103
    sget-object p2, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget v5, v0, La/mwj0;->j:I

    .line 106
    .line 107
    if-eqz v5, :cond_6

    .line 108
    .line 109
    if-ne v5, v6, :cond_5

    .line 110
    .line 111
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance p0, La/r5j0;

    .line 123
    .line 124
    invoke-direct {p0, p1, v1}, La/r5j0;-><init>(La/kmq;B)V

    .line 125
    .line 126
    .line 127
    iput v6, v0, La/mwj0;->j:I

    .line 128
    .line 129
    iget-object p1, v2, La/xae0;->a:La/n7m0;

    .line 130
    .line 131
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, p2, :cond_7

    .line 136
    .line 137
    move-object v3, p2

    .line 138
    goto :goto_5

    .line 139
    :cond_7
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_5
    return-object v3

    .line 142
    :pswitch_1
    instance-of v0, p2, La/kmb0;

    .line 143
    .line 144
    if-eqz v0, :cond_8

    .line 145
    .line 146
    move-object v0, p2

    .line 147
    check-cast v0, La/kmb0;

    .line 148
    .line 149
    iget v1, v0, La/kmb0;->j:I

    .line 150
    .line 151
    and-int v7, v1, v5

    .line 152
    .line 153
    if-eqz v7, :cond_8

    .line 154
    .line 155
    sub-int/2addr v1, v5

    .line 156
    iput v1, v0, La/kmb0;->j:I

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_8
    new-instance v0, La/kmb0;

    .line 160
    .line 161
    invoke-direct {v0, p0, p2}, La/kmb0;-><init>(La/l0f;La/yje;)V

    .line 162
    .line 163
    .line 164
    :goto_6
    iget-object p0, v0, La/kmb0;->i:Ljava/lang/Object;

    .line 165
    .line 166
    sget-object p2, La/wne;->a:La/wne;

    .line 167
    .line 168
    iget v1, v0, La/kmb0;->j:I

    .line 169
    .line 170
    if-eqz v1, :cond_a

    .line 171
    .line 172
    if-ne v1, v6, :cond_9

    .line 173
    .line 174
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    new-instance p0, La/hbb0;

    .line 186
    .line 187
    const/4 v1, 0x3

    .line 188
    invoke-direct {p0, p1, v1}, La/hbb0;-><init>(La/kmq;B)V

    .line 189
    .line 190
    .line 191
    iput v6, v0, La/kmb0;->j:I

    .line 192
    .line 193
    iget-object p1, v2, La/xae0;->a:La/n7m0;

    .line 194
    .line 195
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-ne p0, p2, :cond_b

    .line 200
    .line 201
    move-object v3, p2

    .line 202
    goto :goto_8

    .line 203
    :cond_b
    :goto_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    :goto_8
    return-object v3

    .line 206
    :pswitch_2
    instance-of v0, p2, La/cm20;

    .line 207
    .line 208
    if-eqz v0, :cond_c

    .line 209
    .line 210
    move-object v0, p2

    .line 211
    check-cast v0, La/cm20;

    .line 212
    .line 213
    iget v1, v0, La/cm20;->j:I

    .line 214
    .line 215
    and-int v7, v1, v5

    .line 216
    .line 217
    if-eqz v7, :cond_c

    .line 218
    .line 219
    sub-int/2addr v1, v5

    .line 220
    iput v1, v0, La/cm20;->j:I

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_c
    new-instance v0, La/cm20;

    .line 224
    .line 225
    invoke-direct {v0, p0, p2}, La/cm20;-><init>(La/l0f;La/yje;)V

    .line 226
    .line 227
    .line 228
    :goto_9
    iget-object p0, v0, La/cm20;->i:Ljava/lang/Object;

    .line 229
    .line 230
    sget-object p2, La/wne;->a:La/wne;

    .line 231
    .line 232
    iget v1, v0, La/cm20;->j:I

    .line 233
    .line 234
    if-eqz v1, :cond_e

    .line 235
    .line 236
    if-ne v1, v6, :cond_d

    .line 237
    .line 238
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    goto :goto_a

    .line 242
    :cond_d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    new-instance p0, La/b4v;

    .line 250
    .line 251
    const/16 v1, 0x1c

    .line 252
    .line 253
    invoke-direct {p0, p1, v1}, La/b4v;-><init>(La/kmq;B)V

    .line 254
    .line 255
    .line 256
    iput v6, v0, La/cm20;->j:I

    .line 257
    .line 258
    iget-object p1, v2, La/xae0;->a:La/n7m0;

    .line 259
    .line 260
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    if-ne p0, p2, :cond_f

    .line 265
    .line 266
    move-object v3, p2

    .line 267
    goto :goto_b

    .line 268
    :cond_f
    :goto_a
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    :goto_b
    return-object v3

    .line 271
    :pswitch_3
    instance-of v0, p2, La/i0f;

    .line 272
    .line 273
    if-eqz v0, :cond_10

    .line 274
    .line 275
    move-object v0, p2

    .line 276
    check-cast v0, La/i0f;

    .line 277
    .line 278
    iget v1, v0, La/i0f;->j:I

    .line 279
    .line 280
    and-int v7, v1, v5

    .line 281
    .line 282
    if-eqz v7, :cond_10

    .line 283
    .line 284
    sub-int/2addr v1, v5

    .line 285
    iput v1, v0, La/i0f;->j:I

    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_10
    new-instance v0, La/i0f;

    .line 289
    .line 290
    invoke-direct {v0, p0, p2}, La/i0f;-><init>(La/l0f;La/yje;)V

    .line 291
    .line 292
    .line 293
    :goto_c
    iget-object p0, v0, La/i0f;->i:Ljava/lang/Object;

    .line 294
    .line 295
    sget-object p2, La/wne;->a:La/wne;

    .line 296
    .line 297
    iget v1, v0, La/i0f;->j:I

    .line 298
    .line 299
    if-eqz v1, :cond_12

    .line 300
    .line 301
    if-ne v1, v6, :cond_11

    .line 302
    .line 303
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_11
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto :goto_e

    .line 311
    :cond_12
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    new-instance p0, La/k0f;

    .line 315
    .line 316
    const/4 v1, 0x0

    .line 317
    invoke-direct {p0, p1, v1}, La/k0f;-><init>(La/kmq;B)V

    .line 318
    .line 319
    .line 320
    iput v6, v0, La/i0f;->j:I

    .line 321
    .line 322
    iget-object p1, v2, La/xae0;->a:La/n7m0;

    .line 323
    .line 324
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    if-ne p0, p2, :cond_13

    .line 329
    .line 330
    move-object v3, p2

    .line 331
    goto :goto_e

    .line 332
    :cond_13
    :goto_d
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    :goto_e
    return-object v3

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
