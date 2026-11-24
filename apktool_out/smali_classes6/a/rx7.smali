.class public final synthetic La/rx7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BFILjava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/rx7;->a:B

    iput-object p4, p0, La/rx7;->c:Ljava/lang/Object;

    iput p2, p0, La/rx7;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(FLa/fqj0;I)V
    .locals 0

    .line 1
    const/16 p3, 0x8

    iput-byte p3, p0, La/rx7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/rx7;->b:F

    iput-object p2, p0, La/rx7;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/xpj0;F)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/rx7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rx7;->c:Ljava/lang/Object;

    iput p2, p0, La/rx7;->b:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/rx7;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/rx7;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget p0, p0, La/rx7;->b:F

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, La/fqj0;

    .line 12
    .line 13
    check-cast p1, La/fet;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, v2, p1, p2}, La/q5x;->d(FLa/fqj0;La/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast v2, La/mch0;

    .line 31
    .line 32
    check-cast p1, La/fet;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, La/x8x;->L(I)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-static {v2, p0, p1, p2}, La/pzw;->f(La/mch0;FLa/fet;I)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast v2, La/mjg0;

    .line 50
    .line 51
    check-cast p1, La/fet;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, La/x8x;->L(I)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-static {v2, p0, p1, p2}, La/ljg0;->a(La/mjg0;FLa/fet;I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    check-cast v2, La/r30;

    .line 69
    .line 70
    check-cast p1, La/fet;

    .line 71
    .line 72
    check-cast p2, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, La/x8x;->L(I)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-static {v2, p0, p1, p2}, La/k7x;->o(La/r30;FLa/fet;I)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_3
    check-cast v2, La/ji40;

    .line 88
    .line 89
    check-cast p1, La/fet;

    .line 90
    .line 91
    check-cast p2, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, La/x8x;->L(I)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-static {v2, p0, p1, p2}, La/x9x;->k(La/ji40;FLa/fet;I)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_4
    check-cast v2, La/di40;

    .line 107
    .line 108
    check-cast p1, La/fet;

    .line 109
    .line 110
    check-cast p2, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, La/x8x;->L(I)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-static {v2, p0, p1, p2}, La/x9x;->c(La/di40;FLa/fet;I)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_5
    check-cast v2, La/q7m;

    .line 126
    .line 127
    check-cast p1, La/fet;

    .line 128
    .line 129
    check-cast p2, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, La/x8x;->L(I)I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    invoke-static {v2, p0, p1, p2}, La/dub;->Y(La/q7m;FLa/fet;I)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_6
    check-cast v2, La/xpj0;

    .line 145
    .line 146
    check-cast p1, La/qkx;

    .line 147
    .line 148
    check-cast p2, La/p4e;

    .line 149
    .line 150
    iget-wide v3, p2, La/p4e;->a:J

    .line 151
    .line 152
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    int-to-float p2, p2

    .line 157
    iget-wide v3, p1, La/qkx;->a:J

    .line 158
    .line 159
    const-wide v5, 0xffffffffL

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    and-long/2addr v3, v5

    .line 165
    long-to-int p1, v3

    .line 166
    int-to-float p1, p1

    .line 167
    new-instance v0, La/no20;

    .line 168
    .line 169
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 170
    .line 171
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 172
    .line 173
    .line 174
    iget-boolean v4, v2, La/xpj0;->a:Z

    .line 175
    .line 176
    if-nez v4, :cond_0

    .line 177
    .line 178
    sget-object v4, La/ypj0;->c:La/ypj0;

    .line 179
    .line 180
    sub-float v5, p2, p0

    .line 181
    .line 182
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    :cond_0
    cmpg-float p0, p1, p0

    .line 190
    .line 191
    if-nez p0, :cond_1

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_1
    sget-object p0, La/ypj0;->b:La/ypj0;

    .line 195
    .line 196
    sub-float p1, p2, p1

    .line 197
    .line 198
    const/4 v4, 0x0

    .line 199
    invoke-static {p1, v4}, Ljava/lang/Math;->max(FF)F

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {v3, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    :goto_0
    iget-boolean p0, v2, La/xpj0;->c:Z

    .line 211
    .line 212
    if-nez p0, :cond_2

    .line 213
    .line 214
    sget-object p0, La/ypj0;->a:La/ypj0;

    .line 215
    .line 216
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-interface {v3, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    :cond_2
    invoke-direct {v0, v3}, La/no20;-><init>(Ljava/util/Map;)V

    .line 224
    .line 225
    .line 226
    iget-object p0, v2, La/xpj0;->e:La/qv2;

    .line 227
    .line 228
    iget-object p0, p0, La/qv2;->k:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p0, La/zbk;

    .line 231
    .line 232
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, La/ypj0;

    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-eqz p1, :cond_9

    .line 243
    .line 244
    if-eq p1, v1, :cond_6

    .line 245
    .line 246
    const/4 p2, 0x2

    .line 247
    if-ne p1, p2, :cond_5

    .line 248
    .line 249
    sget-object p1, La/ypj0;->c:La/ypj0;

    .line 250
    .line 251
    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    if-eqz p2, :cond_3

    .line 256
    .line 257
    :goto_1
    move-object p0, p1

    .line 258
    goto :goto_2

    .line 259
    :cond_3
    sget-object p1, La/ypj0;->b:La/ypj0;

    .line 260
    .line 261
    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    if-eqz p2, :cond_4

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_4
    sget-object p1, La/ypj0;->a:La/ypj0;

    .line 269
    .line 270
    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-eqz p2, :cond_a

    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 278
    .line 279
    .line 280
    const/4 p0, 0x0

    .line 281
    goto :goto_3

    .line 282
    :cond_6
    sget-object p1, La/ypj0;->b:La/ypj0;

    .line 283
    .line 284
    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p2

    .line 288
    if-eqz p2, :cond_7

    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_7
    sget-object p1, La/ypj0;->c:La/ypj0;

    .line 292
    .line 293
    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    if-eqz p2, :cond_8

    .line 298
    .line 299
    goto :goto_1

    .line 300
    :cond_8
    sget-object p1, La/ypj0;->a:La/ypj0;

    .line 301
    .line 302
    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    if-eqz p2, :cond_a

    .line 307
    .line 308
    goto :goto_1

    .line 309
    :cond_9
    sget-object p1, La/ypj0;->a:La/ypj0;

    .line 310
    .line 311
    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result p2

    .line 315
    if-eqz p2, :cond_a

    .line 316
    .line 317
    goto :goto_1

    .line 318
    :cond_a
    :goto_2
    new-instance p1, Lkotlin/Pair;

    .line 319
    .line 320
    invoke-direct {p1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    move-object p0, p1

    .line 324
    :goto_3
    return-object p0

    .line 325
    :pswitch_7
    check-cast v2, La/k9q;

    .line 326
    .line 327
    check-cast p1, La/fet;

    .line 328
    .line 329
    check-cast p2, Ljava/lang/Integer;

    .line 330
    .line 331
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {v1}, La/x8x;->L(I)I

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    invoke-static {v2, p0, p1, p2}, La/bsr0;->r(La/k9q;FLa/fet;I)V

    .line 339
    .line 340
    .line 341
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object p0

    .line 344
    nop

    .line 345
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
