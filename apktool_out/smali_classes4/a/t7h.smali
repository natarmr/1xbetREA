.class public final La/t7h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/gmq;


# direct methods
.method public synthetic constructor <init>(La/gmq;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/t7h;->a:B

    iput-object p1, p0, La/t7h;->c:La/gmq;

    iput-wide p2, p0, La/t7h;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/t7h;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/t7h;->b:J

    .line 4
    .line 5
    iget-object v3, p0, La/t7h;->c:La/gmq;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v6, -0x80000000

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/x2z;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/x2z;

    .line 22
    .line 23
    iget v8, v0, La/x2z;->j:I

    .line 24
    .line 25
    and-int v9, v8, v6

    .line 26
    .line 27
    if-eqz v9, :cond_0

    .line 28
    .line 29
    sub-int/2addr v8, v6

    .line 30
    iput v8, v0, La/x2z;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/x2z;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/x2z;-><init>(La/t7h;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/x2z;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v6, v0, La/x2z;->j:I

    .line 43
    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

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
    check-cast v3, La/c00;

    .line 60
    .line 61
    new-instance p0, La/s7h;

    .line 62
    .line 63
    const/4 v4, 0x6

    .line 64
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 65
    .line 66
    .line 67
    iput v7, v0, La/x2z;->j:I

    .line 68
    .line 69
    invoke-virtual {v3, p0, v0}, La/c00;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, p2, :cond_3

    .line 74
    .line 75
    move-object v4, p2

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_2
    return-object v4

    .line 80
    :pswitch_0
    instance-of v0, p2, La/krt;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    move-object v0, p2

    .line 85
    check-cast v0, La/krt;

    .line 86
    .line 87
    iget v8, v0, La/krt;->j:I

    .line 88
    .line 89
    and-int v9, v8, v6

    .line 90
    .line 91
    if-eqz v9, :cond_4

    .line 92
    .line 93
    sub-int/2addr v8, v6

    .line 94
    iput v8, v0, La/krt;->j:I

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    new-instance v0, La/krt;

    .line 98
    .line 99
    invoke-direct {v0, p0, p2}, La/krt;-><init>(La/t7h;La/yje;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    iget-object p0, v0, La/krt;->i:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object p2, La/wne;->a:La/wne;

    .line 105
    .line 106
    iget v6, v0, La/krt;->j:I

    .line 107
    .line 108
    if-eqz v6, :cond_6

    .line 109
    .line 110
    if-ne v6, v7, :cond_5

    .line 111
    .line 112
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    check-cast v3, La/qoj0;

    .line 126
    .line 127
    new-instance p0, La/s7h;

    .line 128
    .line 129
    const/4 v4, 0x5

    .line 130
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 131
    .line 132
    .line 133
    iput v7, v0, La/krt;->j:I

    .line 134
    .line 135
    invoke-virtual {v3, p0, v0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-object v4, p2

    .line 139
    :goto_4
    return-object v4

    .line 140
    :pswitch_1
    instance-of v0, p2, La/w7h;

    .line 141
    .line 142
    if-eqz v0, :cond_7

    .line 143
    .line 144
    move-object v0, p2

    .line 145
    check-cast v0, La/w7h;

    .line 146
    .line 147
    iget v8, v0, La/w7h;->j:I

    .line 148
    .line 149
    and-int v9, v8, v6

    .line 150
    .line 151
    if-eqz v9, :cond_7

    .line 152
    .line 153
    sub-int/2addr v8, v6

    .line 154
    iput v8, v0, La/w7h;->j:I

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_7
    new-instance v0, La/w7h;

    .line 158
    .line 159
    invoke-direct {v0, p0, p2}, La/w7h;-><init>(La/t7h;La/yje;)V

    .line 160
    .line 161
    .line 162
    :goto_5
    iget-object p0, v0, La/w7h;->i:Ljava/lang/Object;

    .line 163
    .line 164
    sget-object p2, La/wne;->a:La/wne;

    .line 165
    .line 166
    iget v6, v0, La/w7h;->j:I

    .line 167
    .line 168
    if-eqz v6, :cond_9

    .line 169
    .line 170
    if-ne v6, v7, :cond_8

    .line 171
    .line 172
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_8
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    check-cast v3, La/a1g;

    .line 184
    .line 185
    new-instance p0, La/s7h;

    .line 186
    .line 187
    const/4 v4, 0x2

    .line 188
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 189
    .line 190
    .line 191
    iput v7, v0, La/w7h;->j:I

    .line 192
    .line 193
    invoke-virtual {v3, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-ne p0, p2, :cond_a

    .line 198
    .line 199
    move-object v4, p2

    .line 200
    goto :goto_7

    .line 201
    :cond_a
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_7
    return-object v4

    .line 204
    :pswitch_2
    instance-of v0, p2, La/u7h;

    .line 205
    .line 206
    if-eqz v0, :cond_b

    .line 207
    .line 208
    move-object v0, p2

    .line 209
    check-cast v0, La/u7h;

    .line 210
    .line 211
    iget v8, v0, La/u7h;->j:I

    .line 212
    .line 213
    and-int v9, v8, v6

    .line 214
    .line 215
    if-eqz v9, :cond_b

    .line 216
    .line 217
    sub-int/2addr v8, v6

    .line 218
    iput v8, v0, La/u7h;->j:I

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_b
    new-instance v0, La/u7h;

    .line 222
    .line 223
    invoke-direct {v0, p0, p2}, La/u7h;-><init>(La/t7h;La/yje;)V

    .line 224
    .line 225
    .line 226
    :goto_8
    iget-object p0, v0, La/u7h;->i:Ljava/lang/Object;

    .line 227
    .line 228
    sget-object p2, La/wne;->a:La/wne;

    .line 229
    .line 230
    iget v6, v0, La/u7h;->j:I

    .line 231
    .line 232
    if-eqz v6, :cond_d

    .line 233
    .line 234
    if-ne v6, v7, :cond_c

    .line 235
    .line 236
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_c
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_d
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    check-cast v3, La/rno;

    .line 248
    .line 249
    new-instance p0, La/s7h;

    .line 250
    .line 251
    invoke-direct {p0, p1, v1, v2, v7}, La/s7h;-><init>(La/kmq;JB)V

    .line 252
    .line 253
    .line 254
    iput v7, v0, La/u7h;->j:I

    .line 255
    .line 256
    invoke-virtual {v3, p0, v0}, La/rno;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    if-ne p0, p2, :cond_e

    .line 261
    .line 262
    move-object v4, p2

    .line 263
    goto :goto_a

    .line 264
    :cond_e
    :goto_9
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    :goto_a
    return-object v4

    .line 267
    :pswitch_3
    instance-of v0, p2, La/q7h;

    .line 268
    .line 269
    if-eqz v0, :cond_f

    .line 270
    .line 271
    move-object v0, p2

    .line 272
    check-cast v0, La/q7h;

    .line 273
    .line 274
    iget v8, v0, La/q7h;->j:I

    .line 275
    .line 276
    and-int v9, v8, v6

    .line 277
    .line 278
    if-eqz v9, :cond_f

    .line 279
    .line 280
    sub-int/2addr v8, v6

    .line 281
    iput v8, v0, La/q7h;->j:I

    .line 282
    .line 283
    goto :goto_b

    .line 284
    :cond_f
    new-instance v0, La/q7h;

    .line 285
    .line 286
    invoke-direct {v0, p0, p2}, La/q7h;-><init>(La/t7h;La/yje;)V

    .line 287
    .line 288
    .line 289
    :goto_b
    iget-object p0, v0, La/q7h;->i:Ljava/lang/Object;

    .line 290
    .line 291
    sget-object p2, La/wne;->a:La/wne;

    .line 292
    .line 293
    iget v6, v0, La/q7h;->j:I

    .line 294
    .line 295
    if-eqz v6, :cond_11

    .line 296
    .line 297
    if-ne v6, v7, :cond_10

    .line 298
    .line 299
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    goto :goto_c

    .line 303
    :cond_10
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_11
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    new-instance p0, La/s7h;

    .line 311
    .line 312
    const/4 v4, 0x0

    .line 313
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 314
    .line 315
    .line 316
    iput v7, v0, La/q7h;->j:I

    .line 317
    .line 318
    invoke-interface {v3, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    if-ne p0, p2, :cond_12

    .line 323
    .line 324
    move-object v4, p2

    .line 325
    goto :goto_d

    .line 326
    :cond_12
    :goto_c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    :goto_d
    return-object v4

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
