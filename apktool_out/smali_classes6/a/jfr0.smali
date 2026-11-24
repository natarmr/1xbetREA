.class public final La/jfr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ofr0;


# direct methods
.method public synthetic constructor <init>(La/ofr0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jfr0;->i:B

    iput-object p1, p0, La/jfr0;->k:La/ofr0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jfr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jfr0;->k:La/ofr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/jfr0;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/jfr0;-><init>(La/ofr0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/jfr0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/jfr0;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/jfr0;-><init>(La/ofr0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/jfr0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/jfr0;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/jfr0;-><init>(La/ofr0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/jfr0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/jfr0;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/jfr0;-><init>(La/ofr0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/jfr0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/jfr0;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/jfr0;-><init>(La/ofr0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/jfr0;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jfr0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/dip;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/jfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jfr0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/dip;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/jfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/jfr0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/jfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/jfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/jfr0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/jfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/dip;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/jfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/jfr0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/jfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/dip;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/jfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/jfr0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/jfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/jfr0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/c1r0;->a:La/c1r0;

    .line 5
    .line 6
    sget-object v3, La/b1r0;->a:La/b1r0;

    .line 7
    .line 8
    iget-object v4, p0, La/jfr0;->k:La/ofr0;

    .line 9
    .line 10
    sget-object v5, La/f1r0;->a:La/f1r0;

    .line 11
    .line 12
    sget-object v6, La/g1r0;->a:La/g1r0;

    .line 13
    .line 14
    iget-object p0, p0, La/jfr0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, La/dip;

    .line 20
    .line 21
    sget-object v0, La/wne;->a:La/wne;

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    instance-of p1, p0, La/zhp;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    new-instance p0, La/x0r0;

    .line 33
    .line 34
    sget-object p1, La/iun;->a:La/iun;

    .line 35
    .line 36
    invoke-direct {p0, v3, p1}, La/x0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    instance-of p1, p0, La/aip;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    new-instance p1, La/x0r0;

    .line 45
    .line 46
    check-cast p0, La/aip;

    .line 47
    .line 48
    iget-object p0, p0, La/aip;->b:Ljava/util/List;

    .line 49
    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    sget-object p0, La/iun;->a:La/iun;

    .line 53
    .line 54
    :cond_1
    invoke-direct {p1, v2, p0}, La/x0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    move-object p0, p1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    instance-of p1, p0, La/cip;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    new-instance p0, La/x0r0;

    .line 64
    .line 65
    sget-object p1, La/iun;->a:La/iun;

    .line 66
    .line 67
    invoke-direct {p0, v6, p1}, La/x0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    instance-of p1, p0, La/bip;

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    new-instance p1, La/x0r0;

    .line 76
    .line 77
    check-cast p0, La/bip;

    .line 78
    .line 79
    iget-object p0, p0, La/bip;->a:Ljava/util/List;

    .line 80
    .line 81
    invoke-direct {p1, v5, p0}, La/x0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :goto_1
    sget p1, La/ofr0;->U0:I

    .line 86
    .line 87
    invoke-virtual {v4, p0}, La/ofr0;->V(La/a1r0;)V

    .line 88
    .line 89
    .line 90
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 94
    .line 95
    .line 96
    :goto_2
    return-object v1

    .line 97
    :pswitch_0
    check-cast p0, La/dip;

    .line 98
    .line 99
    sget-object v0, La/wne;->a:La/wne;

    .line 100
    .line 101
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    if-eqz p0, :cond_9

    .line 105
    .line 106
    instance-of p1, p0, La/zhp;

    .line 107
    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    new-instance p0, La/w0r0;

    .line 111
    .line 112
    sget-object p1, La/iun;->a:La/iun;

    .line 113
    .line 114
    invoke-direct {p0, v3, p1}, La/w0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    instance-of p1, p0, La/aip;

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    new-instance p1, La/w0r0;

    .line 123
    .line 124
    check-cast p0, La/aip;

    .line 125
    .line 126
    iget-object p0, p0, La/aip;->b:Ljava/util/List;

    .line 127
    .line 128
    if-nez p0, :cond_6

    .line 129
    .line 130
    sget-object p0, La/iun;->a:La/iun;

    .line 131
    .line 132
    :cond_6
    invoke-direct {p1, v2, p0}, La/w0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 133
    .line 134
    .line 135
    :goto_3
    move-object p0, p1

    .line 136
    goto :goto_4

    .line 137
    :cond_7
    instance-of p1, p0, La/cip;

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    new-instance p0, La/w0r0;

    .line 142
    .line 143
    sget-object p1, La/iun;->a:La/iun;

    .line 144
    .line 145
    invoke-direct {p0, v6, p1}, La/w0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    instance-of p1, p0, La/bip;

    .line 150
    .line 151
    if-eqz p1, :cond_9

    .line 152
    .line 153
    new-instance p1, La/w0r0;

    .line 154
    .line 155
    check-cast p0, La/bip;

    .line 156
    .line 157
    iget-object p0, p0, La/bip;->a:Ljava/util/List;

    .line 158
    .line 159
    invoke-direct {p1, v5, p0}, La/w0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :goto_4
    sget p1, La/ofr0;->U0:I

    .line 164
    .line 165
    invoke-virtual {v4, p0}, La/ofr0;->V(La/a1r0;)V

    .line 166
    .line 167
    .line 168
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 172
    .line 173
    .line 174
    :goto_5
    return-object v1

    .line 175
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 176
    .line 177
    sget-object v0, La/wne;->a:La/wne;

    .line 178
    .line 179
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-nez p1, :cond_a

    .line 187
    .line 188
    new-instance p1, La/v0r0;

    .line 189
    .line 190
    invoke-direct {p1, v5, p0}, La/v0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_a
    new-instance p1, La/v0r0;

    .line 195
    .line 196
    sget-object p0, La/iun;->a:La/iun;

    .line 197
    .line 198
    invoke-direct {p1, v6, p0}, La/v0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 199
    .line 200
    .line 201
    :goto_6
    sget p0, La/ofr0;->U0:I

    .line 202
    .line 203
    invoke-virtual {v4, p1}, La/ofr0;->V(La/a1r0;)V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_2
    check-cast p0, La/dip;

    .line 210
    .line 211
    sget-object v0, La/wne;->a:La/wne;

    .line 212
    .line 213
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    if-eqz p0, :cond_f

    .line 217
    .line 218
    instance-of p1, p0, La/zhp;

    .line 219
    .line 220
    if-eqz p1, :cond_b

    .line 221
    .line 222
    new-instance p0, La/p0r0;

    .line 223
    .line 224
    sget-object p1, La/iun;->a:La/iun;

    .line 225
    .line 226
    invoke-direct {p0, v3, p1}, La/p0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_b
    instance-of p1, p0, La/aip;

    .line 231
    .line 232
    if-eqz p1, :cond_d

    .line 233
    .line 234
    new-instance p1, La/p0r0;

    .line 235
    .line 236
    check-cast p0, La/aip;

    .line 237
    .line 238
    iget-object p0, p0, La/aip;->b:Ljava/util/List;

    .line 239
    .line 240
    if-nez p0, :cond_c

    .line 241
    .line 242
    sget-object p0, La/iun;->a:La/iun;

    .line 243
    .line 244
    :cond_c
    invoke-direct {p1, v2, p0}, La/p0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 245
    .line 246
    .line 247
    :goto_7
    move-object p0, p1

    .line 248
    goto :goto_8

    .line 249
    :cond_d
    instance-of p1, p0, La/cip;

    .line 250
    .line 251
    if-eqz p1, :cond_e

    .line 252
    .line 253
    new-instance p0, La/p0r0;

    .line 254
    .line 255
    sget-object p1, La/iun;->a:La/iun;

    .line 256
    .line 257
    invoke-direct {p0, v6, p1}, La/p0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_e
    instance-of p1, p0, La/bip;

    .line 262
    .line 263
    if-eqz p1, :cond_f

    .line 264
    .line 265
    new-instance p1, La/p0r0;

    .line 266
    .line 267
    check-cast p0, La/bip;

    .line 268
    .line 269
    iget-object p0, p0, La/bip;->a:Ljava/util/List;

    .line 270
    .line 271
    invoke-direct {p1, v5, p0}, La/p0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :goto_8
    sget p1, La/ofr0;->U0:I

    .line 276
    .line 277
    invoke-virtual {v4, p0}, La/ofr0;->V(La/a1r0;)V

    .line 278
    .line 279
    .line 280
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 284
    .line 285
    .line 286
    :goto_9
    return-object v1

    .line 287
    :pswitch_3
    check-cast p0, La/dip;

    .line 288
    .line 289
    sget-object v0, La/wne;->a:La/wne;

    .line 290
    .line 291
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    if-eqz p0, :cond_14

    .line 295
    .line 296
    instance-of p1, p0, La/zhp;

    .line 297
    .line 298
    if-eqz p1, :cond_10

    .line 299
    .line 300
    new-instance p0, La/o0r0;

    .line 301
    .line 302
    sget-object p1, La/iun;->a:La/iun;

    .line 303
    .line 304
    invoke-direct {p0, v3, p1}, La/o0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    goto :goto_b

    .line 308
    :cond_10
    instance-of p1, p0, La/aip;

    .line 309
    .line 310
    if-eqz p1, :cond_12

    .line 311
    .line 312
    new-instance p1, La/o0r0;

    .line 313
    .line 314
    check-cast p0, La/aip;

    .line 315
    .line 316
    iget-object p0, p0, La/aip;->b:Ljava/util/List;

    .line 317
    .line 318
    if-nez p0, :cond_11

    .line 319
    .line 320
    sget-object p0, La/iun;->a:La/iun;

    .line 321
    .line 322
    :cond_11
    invoke-direct {p1, v2, p0}, La/o0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    :goto_a
    move-object p0, p1

    .line 326
    goto :goto_b

    .line 327
    :cond_12
    instance-of p1, p0, La/cip;

    .line 328
    .line 329
    if-eqz p1, :cond_13

    .line 330
    .line 331
    new-instance p0, La/o0r0;

    .line 332
    .line 333
    sget-object p1, La/iun;->a:La/iun;

    .line 334
    .line 335
    invoke-direct {p0, v6, p1}, La/o0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 336
    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_13
    instance-of p1, p0, La/bip;

    .line 340
    .line 341
    if-eqz p1, :cond_14

    .line 342
    .line 343
    new-instance p1, La/o0r0;

    .line 344
    .line 345
    check-cast p0, La/bip;

    .line 346
    .line 347
    iget-object p0, p0, La/bip;->a:Ljava/util/List;

    .line 348
    .line 349
    invoke-direct {p1, v5, p0}, La/o0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 350
    .line 351
    .line 352
    goto :goto_a

    .line 353
    :goto_b
    sget p1, La/ofr0;->U0:I

    .line 354
    .line 355
    invoke-virtual {v4, p0}, La/ofr0;->V(La/a1r0;)V

    .line 356
    .line 357
    .line 358
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    goto :goto_c

    .line 361
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 362
    .line 363
    .line 364
    :goto_c
    return-object v1

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
