.class public final synthetic La/b3b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v3b0;


# direct methods
.method public synthetic constructor <init>(La/v3b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b3b0;->a:B

    iput-object p1, p0, La/b3b0;->b:La/v3b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/b3b0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const v2, 0x7f130e5d

    .line 5
    .line 6
    .line 7
    const v3, 0x7f1303d7

    .line 8
    .line 9
    .line 10
    const v4, 0x7f1307bb

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    iget-object p0, p0, La/b3b0;->b:La/v3b0;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    instance-of v0, p1, La/jfp;

    .line 25
    .line 26
    iget-object v1, p0, La/v3b0;->s:La/ctf0;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    new-instance p1, La/r2b0;

    .line 31
    .line 32
    new-array v0, v5, [Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 35
    .line 36
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v6, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-array v4, v5, [Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 47
    .line 48
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v6, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    new-array v4, v5, [Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 59
    .line 60
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v1, v2, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {p1, v0, v3, v1}, La/r2b0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance v0, La/q2b0;

    .line 76
    .line 77
    invoke-static {p1, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {v0, p1}, La/q2b0;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, La/v3b0;->t:La/peg0;

    .line 96
    .line 97
    new-instance v0, La/hr1;

    .line 98
    .line 99
    const-wide/16 v2, 0x0

    .line 100
    .line 101
    invoke-direct {v0, v2, v3, v1}, La/hr1;-><init>(JI)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object p0, p0, La/v3b0;->v:La/duj;

    .line 120
    .line 121
    new-instance v0, La/jfa0;

    .line 122
    .line 123
    const/16 v1, 0x17

    .line 124
    .line 125
    invoke-direct {v0, v1}, La/jfa0;-><init>(B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, La/v3b0;->t:La/peg0;

    .line 140
    .line 141
    new-instance v0, La/fr1;

    .line 142
    .line 143
    const/4 v2, 0x0

    .line 144
    invoke-direct {v0, v2, v2, v1}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 152
    .line 153
    .line 154
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    instance-of v0, p1, La/jfp;

    .line 163
    .line 164
    iget-object v1, p0, La/v3b0;->s:La/ctf0;

    .line 165
    .line 166
    if-eqz v0, :cond_1

    .line 167
    .line 168
    new-instance p1, La/r2b0;

    .line 169
    .line 170
    new-array v0, v5, [Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 173
    .line 174
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v6, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-array v4, v5, [Ljava/lang/Object;

    .line 183
    .line 184
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 185
    .line 186
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v6, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    new-array v4, v5, [Ljava/lang/Object;

    .line 195
    .line 196
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 197
    .line 198
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v1, v2, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-direct {p1, v0, v3, v1}, La/r2b0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_1
    new-instance v0, La/q2b0;

    .line 214
    .line 215
    invoke-static {p1, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-direct {v0, p1}, La/q2b0;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget-object p0, p0, La/v3b0;->v:La/duj;

    .line 234
    .line 235
    new-instance v0, La/jfa0;

    .line 236
    .line 237
    const/16 v1, 0x18

    .line 238
    .line 239
    invoke-direct {v0, v1}, La/jfa0;-><init>(B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 243
    .line 244
    .line 245
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    new-instance p1, La/jfa0;

    .line 254
    .line 255
    const/16 v0, 0x1b

    .line 256
    .line 257
    invoke-direct {p1, v0}, La/jfa0;-><init>(B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v0, La/jfa0;

    .line 272
    .line 273
    const/16 v1, 0x1a

    .line 274
    .line 275
    invoke-direct {v0, v1}, La/jfa0;-><init>(B)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 282
    .line 283
    .line 284
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v0, La/jfa0;

    .line 293
    .line 294
    const/16 v1, 0x19

    .line 295
    .line 296
    invoke-direct {v0, v1}, La/jfa0;-><init>(B)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 303
    .line 304
    .line 305
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object p0

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
