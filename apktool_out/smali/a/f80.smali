.class public final La/f80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f80;->a:B

    iput-object p1, p0, La/f80;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/f80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/f80;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/f80;

    .line 9
    .line 10
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/riu0;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p0, La/f80;

    .line 18
    .line 19
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/riu0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast p0, La/qk4;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_2
    check-cast p0, La/pk4;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_3
    check-cast p0, La/f80;

    .line 33
    .line 34
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/riu0;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_4
    check-cast p0, La/a64;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_5
    check-cast p0, La/f80;

    .line 45
    .line 46
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, La/riu0;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_6
    check-cast p0, La/wp3;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_7
    check-cast p0, La/f80;

    .line 57
    .line 58
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/riu0;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_8
    check-cast p0, La/rp3;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_9
    check-cast p0, La/f80;

    .line 69
    .line 70
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/riu0;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_a
    check-cast p0, La/tn3;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_b
    check-cast p0, La/f80;

    .line 81
    .line 82
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, La/riu0;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_c
    check-cast p0, La/dm3;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_d
    check-cast p0, La/f80;

    .line 93
    .line 94
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, La/riu0;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_e
    check-cast p0, La/vg3;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_f
    check-cast p0, Ljava/util/Map;

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/lang/Iterable;

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    const/4 v0, 0x0

    .line 117
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/util/Map$Entry;

    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Ljava/lang/String;

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    instance-of v3, v1, [Z

    .line 140
    .line 141
    if-eqz v3, :cond_0

    .line 142
    .line 143
    check-cast v1, [Z

    .line 144
    .line 145
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Z)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    goto :goto_1

    .line 150
    :cond_0
    instance-of v3, v1, [C

    .line 151
    .line 152
    if-eqz v3, :cond_1

    .line 153
    .line 154
    check-cast v1, [C

    .line 155
    .line 156
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([C)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    goto :goto_1

    .line 161
    :cond_1
    instance-of v3, v1, [B

    .line 162
    .line 163
    if-eqz v3, :cond_2

    .line 164
    .line 165
    check-cast v1, [B

    .line 166
    .line 167
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    goto :goto_1

    .line 172
    :cond_2
    instance-of v3, v1, [S

    .line 173
    .line 174
    if-eqz v3, :cond_3

    .line 175
    .line 176
    check-cast v1, [S

    .line 177
    .line 178
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([S)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    goto :goto_1

    .line 183
    :cond_3
    instance-of v3, v1, [I

    .line 184
    .line 185
    if-eqz v3, :cond_4

    .line 186
    .line 187
    check-cast v1, [I

    .line 188
    .line 189
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    goto :goto_1

    .line 194
    :cond_4
    instance-of v3, v1, [F

    .line 195
    .line 196
    if-eqz v3, :cond_5

    .line 197
    .line 198
    check-cast v1, [F

    .line 199
    .line 200
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    goto :goto_1

    .line 205
    :cond_5
    instance-of v3, v1, [J

    .line 206
    .line 207
    if-eqz v3, :cond_6

    .line 208
    .line 209
    check-cast v1, [J

    .line 210
    .line 211
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    goto :goto_1

    .line 216
    :cond_6
    instance-of v3, v1, [D

    .line 217
    .line 218
    if-eqz v3, :cond_7

    .line 219
    .line 220
    check-cast v1, [D

    .line 221
    .line 222
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([D)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    goto :goto_1

    .line 227
    :cond_7
    instance-of v3, v1, [Ljava/lang/Object;

    .line 228
    .line 229
    if-eqz v3, :cond_8

    .line 230
    .line 231
    check-cast v1, [Ljava/lang/Object;

    .line 232
    .line 233
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    goto :goto_1

    .line 238
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    mul-int/lit8 v2, v2, 0x7f

    .line 247
    .line 248
    xor-int/2addr v1, v2

    .line 249
    add-int/2addr v0, v1

    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :cond_9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :pswitch_10
    check-cast p0, La/f80;

    .line 258
    .line 259
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, La/riu0;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_11
    check-cast p0, La/qo2;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_12
    check-cast p0, La/t42;

    .line 270
    .line 271
    sget-object v0, La/t42;->p2:La/jdk0;

    .line 272
    .line 273
    invoke-virtual {p0}, La/t42;->Q0()La/k3t0;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    sget-object v0, La/m42;->a:La/m42;

    .line 278
    .line 279
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_13
    check-cast p0, La/f80;

    .line 286
    .line 287
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    check-cast p0, La/riu0;

    .line 292
    .line 293
    return-object p0

    .line 294
    :pswitch_14
    check-cast p0, La/qj1;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_15
    check-cast p0, La/s51;

    .line 298
    .line 299
    invoke-virtual {p0}, La/s51;->invoke()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    check-cast p0, La/riu0;

    .line 304
    .line 305
    return-object p0

    .line 306
    :pswitch_16
    check-cast p0, La/s51;

    .line 307
    .line 308
    invoke-virtual {p0}, La/s51;->invoke()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    check-cast p0, La/riu0;

    .line 313
    .line 314
    return-object p0

    .line 315
    :pswitch_17
    check-cast p0, La/f8;

    .line 316
    .line 317
    invoke-virtual {p0}, La/f8;->invoke()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    check-cast p0, La/riu0;

    .line 322
    .line 323
    return-object p0

    .line 324
    :pswitch_18
    check-cast p0, La/f80;

    .line 325
    .line 326
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    check-cast p0, La/riu0;

    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_19
    check-cast p0, La/jq0;

    .line 334
    .line 335
    return-object p0

    .line 336
    :pswitch_1a
    check-cast p0, La/f80;

    .line 337
    .line 338
    invoke-virtual {p0}, La/f80;->invoke()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    check-cast p0, La/riu0;

    .line 343
    .line 344
    return-object p0

    .line 345
    :pswitch_1b
    check-cast p0, La/n80;

    .line 346
    .line 347
    return-object p0

    .line 348
    :pswitch_1c
    check-cast p0, La/uzv0;

    .line 349
    .line 350
    invoke-virtual {p0}, La/uzv0;->invoke()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    check-cast p0, La/riu0;

    .line 355
    .line 356
    return-object p0

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
