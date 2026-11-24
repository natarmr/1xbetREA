.class public final synthetic La/ev10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hv10;


# direct methods
.method public synthetic constructor <init>(La/hv10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ev10;->a:B

    iput-object p1, p0, La/ev10;->b:La/hv10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ev10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "option"

    .line 5
    .line 6
    const-string v3, "bet_placed_success_click"

    .line 7
    .line 8
    iget-object p0, p0, La/ev10;->b:La/hv10;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/clz;

    .line 14
    .line 15
    check-cast p2, La/blz;

    .line 16
    .line 17
    sget-object v0, La/hv10;->X1:La/atz;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/hv10;->I0()La/w220;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object v0, p0, La/w220;->c1:La/sff0;

    .line 30
    .line 31
    iget-object v0, v0, La/sff0;->b:La/hl1;

    .line 32
    .line 33
    iget-object v0, v0, La/hl1;->a:La/f61;

    .line 34
    .line 35
    iget-boolean v0, v0, La/f61;->j:Z

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, La/t220;->a:La/t220;

    .line 44
    .line 45
    new-instance v6, La/q120;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-direct {v6, p0, v1, v0}, La/q120;-><init>(La/w220;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/16 v7, 0xe

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0, p2}, La/glz;->f(La/blz;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast p2, Ljava/lang/String;

    .line 74
    .line 75
    sget-object p1, La/hv10;->X1:La/atz;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/hv10;->I0()La/w220;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    iget-object p0, v6, La/w220;->R0:La/mii0;

    .line 85
    .line 86
    iget-object p0, p0, La/mii0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, La/kt2;

    .line 89
    .line 90
    const-string p1, "share"

    .line 91
    .line 92
    invoke-static {v2, p1, p0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object p0, v6, La/w220;->Q0:La/x20;

    .line 96
    .line 97
    sget-object p1, La/zm7;->d:La/zm7;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, La/x20;->i(La/zm7;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance v4, La/yw10;

    .line 107
    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v11, 0x5

    .line 110
    const/4 v5, 0x1

    .line 111
    const-class v7, La/w220;

    .line 112
    .line 113
    const-string v8, "processSaveBetError"

    .line 114
    .line 115
    const-string v9, "processSaveBetError(Ljava/lang/Throwable;)V"

    .line 116
    .line 117
    invoke-direct/range {v4 .. v11}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 118
    .line 119
    .line 120
    new-instance v11, La/o120;

    .line 121
    .line 122
    const/16 p1, 0xe

    .line 123
    .line 124
    invoke-direct {v11, v6, v1, p1}, La/o120;-><init>(La/w220;La/yje;B)V

    .line 125
    .line 126
    .line 127
    const/16 v12, 0xe

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v10, 0x0

    .line 131
    move-object v7, p0

    .line 132
    move-object v8, v4

    .line 133
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    check-cast p2, Ljava/lang/String;

    .line 145
    .line 146
    sget-object p1, La/hv10;->X1:La/atz;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, La/hv10;->I0()La/w220;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    iget-object p1, p0, La/w220;->R0:La/mii0;

    .line 156
    .line 157
    iget-object p1, p1, La/mii0;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, La/kt2;

    .line 160
    .line 161
    const-string p2, "continue"

    .line 162
    .line 163
    invoke-static {v2, p2, p1, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object p1, p0, La/w220;->Q0:La/x20;

    .line 167
    .line 168
    sget-object p2, La/zm7;->c:La/zm7;

    .line 169
    .line 170
    invoke-virtual {p1, p2}, La/x20;->i(La/zm7;)V

    .line 171
    .line 172
    .line 173
    iget-object p0, p0, La/w220;->Y0:La/pmi0;

    .line 174
    .line 175
    invoke-static {p0}, La/pmi0;->i(La/pmi0;)V

    .line 176
    .line 177
    .line 178
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v7

    .line 187
    check-cast p2, Ljava/lang/String;

    .line 188
    .line 189
    sget-object p1, La/hv10;->X1:La/atz;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, La/hv10;->I0()La/w220;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    iget-object p1, p0, La/w220;->R0:La/mii0;

    .line 199
    .line 200
    iget-object p1, p1, La/mii0;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p1, La/kt2;

    .line 203
    .line 204
    const-string v0, "history"

    .line 205
    .line 206
    invoke-static {v2, v0, p1, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, La/w220;->Q0:La/x20;

    .line 210
    .line 211
    sget-object v0, La/zm7;->b:La/zm7;

    .line 212
    .line 213
    invoke-virtual {p1, v0}, La/x20;->i(La/zm7;)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p0, La/w220;->J0:La/c5k;

    .line 217
    .line 218
    invoke-virtual {p1}, La/c5k;->q()V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, La/w220;->Y0:La/pmi0;

    .line 222
    .line 223
    invoke-static {p1}, La/pmi0;->i(La/pmi0;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    const v0, -0x42b46a0a

    .line 231
    .line 232
    .line 233
    if-eq p1, v0, :cond_5

    .line 234
    .line 235
    const v0, 0x1ed5af

    .line 236
    .line 237
    .line 238
    if-eq p1, v0, :cond_3

    .line 239
    .line 240
    const v0, 0x276236

    .line 241
    .line 242
    .line 243
    if-eq p1, v0, :cond_1

    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_1
    const-string p1, "TOTO"

    .line 247
    .line 248
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-nez p1, :cond_2

    .line 253
    .line 254
    goto :goto_0

    .line 255
    :cond_2
    new-instance v4, La/za50;

    .line 256
    .line 257
    sget-object p1, La/s77;->b:La/bj5;

    .line 258
    .line 259
    const-wide/16 v9, 0x0

    .line 260
    .line 261
    const/4 v6, 0x4

    .line 262
    const/4 v5, 0x1

    .line 263
    invoke-direct/range {v4 .. v10}, La/za50;-><init>(IIJJ)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, v4}, La/w220;->F(La/za50;)V

    .line 267
    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_3
    const-string p1, "AUTO"

    .line 271
    .line 272
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-nez p1, :cond_4

    .line 277
    .line 278
    goto :goto_0

    .line 279
    :cond_4
    new-instance v4, La/za50;

    .line 280
    .line 281
    sget-object p1, La/s77;->b:La/bj5;

    .line 282
    .line 283
    const-wide/16 v9, 0x0

    .line 284
    .line 285
    const/4 v6, 0x4

    .line 286
    const/4 v5, 0x2

    .line 287
    invoke-direct/range {v4 .. v10}, La/za50;-><init>(IIJJ)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, v4}, La/w220;->F(La/za50;)V

    .line 291
    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_5
    const-string p1, "JACKPOT"

    .line 295
    .line 296
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-nez p1, :cond_6

    .line 301
    .line 302
    :goto_0
    new-instance v4, La/za50;

    .line 303
    .line 304
    sget-object p1, La/s77;->b:La/bj5;

    .line 305
    .line 306
    const-wide/16 v9, 0x0

    .line 307
    .line 308
    const/4 v6, 0x4

    .line 309
    const/4 v5, 0x0

    .line 310
    invoke-direct/range {v4 .. v10}, La/za50;-><init>(IIJJ)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0, v4}, La/w220;->F(La/za50;)V

    .line 314
    .line 315
    .line 316
    goto :goto_1

    .line 317
    :cond_6
    new-instance v4, La/za50;

    .line 318
    .line 319
    sget-object p1, La/s77;->b:La/bj5;

    .line 320
    .line 321
    const-wide/16 v9, 0x0

    .line 322
    .line 323
    const/4 v6, 0x4

    .line 324
    const/4 v5, 0x6

    .line 325
    invoke-direct/range {v4 .. v10}, La/za50;-><init>(IIJJ)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v4}, La/w220;->F(La/za50;)V

    .line 329
    .line 330
    .line 331
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object p0

    .line 334
    nop

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
