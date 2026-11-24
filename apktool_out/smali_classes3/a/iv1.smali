.class public final synthetic La/iv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uv1;


# direct methods
.method public synthetic constructor <init>(La/uv1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iv1;->a:B

    iput-object p1, p0, La/iv1;->b:La/uv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iv1;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/iv1;->b:La/uv1;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 29
    .line 30
    move-object v5, v3

    .line 31
    check-cast v5, La/yu1;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/16 v22, 0x0

    .line 37
    .line 38
    const v23, 0x1f7ffff

    .line 39
    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    const/16 v18, 0x0

    .line 56
    .line 57
    const/16 v19, 0x0

    .line 58
    .line 59
    const/16 v20, 0x0

    .line 60
    .line 61
    const/16 v21, 0x0

    .line 62
    .line 63
    invoke-static/range {v5 .. v23}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    invoke-virtual {v0, v1}, La/uv1;->T(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_0
    move-object/from16 v1, p1

    .line 80
    .line 81
    check-cast v1, La/pb0;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 87
    .line 88
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 89
    .line 90
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 98
    .line 99
    move-object v5, v3

    .line 100
    check-cast v5, La/yu1;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v8, v1, La/pb0;->a:La/ql5;

    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    const v23, 0x1ffffdf

    .line 110
    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v9, 0x0

    .line 115
    const/4 v10, 0x0

    .line 116
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x0

    .line 118
    const/4 v13, 0x0

    .line 119
    const/4 v14, 0x0

    .line 120
    const/4 v15, 0x0

    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const/16 v20, 0x0

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    invoke-static/range {v5 .. v23}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_1

    .line 142
    .line 143
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_1
    move-object/from16 v1, p1

    .line 147
    .line 148
    check-cast v1, Ljava/lang/Throwable;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    instance-of v2, v1, La/jfp;

    .line 154
    .line 155
    iget-object v3, v0, La/uv1;->A:La/ctf0;

    .line 156
    .line 157
    if-eqz v2, :cond_2

    .line 158
    .line 159
    new-instance v1, La/uu1;

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    new-array v4, v2, [Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v5, v3, La/ctf0;->b:La/lsm0;

    .line 165
    .line 166
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    const v6, 0x7f1307bb

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    new-array v5, v2, [Ljava/lang/Object;

    .line 178
    .line 179
    iget-object v6, v3, La/ctf0;->b:La/lsm0;

    .line 180
    .line 181
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    const v7, 0x7f1303d7

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    new-array v6, v2, [Ljava/lang/Object;

    .line 193
    .line 194
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 195
    .line 196
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const v6, 0x7f130e5d

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    sget-object v3, La/n12;->a:La/n12;

    .line 208
    .line 209
    invoke-direct {v1, v4, v5, v2}, La/uu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    goto :goto_0

    .line 216
    :cond_2
    new-instance v2, La/vu1;

    .line 217
    .line 218
    invoke-static {v1, v3}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-direct {v2, v1}, La/vu1;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_2
    move-object/from16 v1, p1

    .line 232
    .line 233
    check-cast v1, La/k0w0;

    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    new-instance v2, La/nc;

    .line 239
    .line 240
    const/16 v3, 0x1a

    .line 241
    .line 242
    invoke-direct {v2, v0, v3}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 243
    .line 244
    .line 245
    new-instance v0, La/a1w0;

    .line 246
    .line 247
    invoke-direct {v0, v2}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, La/c8d;

    .line 257
    .line 258
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 259
    .line 260
    new-instance v2, La/v7d;

    .line 261
    .line 262
    const/4 v3, 0x1

    .line 263
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 264
    .line 265
    .line 266
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 267
    .line 268
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_3
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, Ljava/lang/Throwable;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 279
    .line 280
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 281
    .line 282
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 290
    .line 291
    move-object v5, v3

    .line 292
    check-cast v5, La/yu1;

    .line 293
    .line 294
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    const/16 v22, 0x0

    .line 298
    .line 299
    const v23, 0x1fffbff

    .line 300
    .line 301
    .line 302
    const/4 v6, 0x0

    .line 303
    const/4 v7, 0x0

    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v9, 0x0

    .line 306
    const/4 v10, 0x0

    .line 307
    const/4 v11, 0x0

    .line 308
    sget-object v12, La/bt1;->a:La/bt1;

    .line 309
    .line 310
    const/4 v13, 0x0

    .line 311
    const/4 v14, 0x0

    .line 312
    const/4 v15, 0x0

    .line 313
    const/16 v16, 0x0

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const/16 v18, 0x0

    .line 318
    .line 319
    const/16 v19, 0x0

    .line 320
    .line 321
    const/16 v20, 0x0

    .line 322
    .line 323
    const/16 v21, 0x0

    .line 324
    .line 325
    invoke-static/range {v5 .. v23}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_3

    .line 334
    .line 335
    iget-object v0, v0, La/uv1;->r:La/duj;

    .line 336
    .line 337
    new-instance v2, La/xg1;

    .line 338
    .line 339
    const/16 v3, 0xb

    .line 340
    .line 341
    invoke-direct {v2, v3}, La/xg1;-><init>(B)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 345
    .line 346
    .line 347
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object v0

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
