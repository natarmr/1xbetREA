.class public final synthetic La/nr10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qr10;


# direct methods
.method public synthetic constructor <init>(La/qr10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nr10;->a:B

    iput-object p1, p0, La/nr10;->b:La/qr10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/nr10;->a:B

    .line 2
    .line 3
    const-string v1, "Cannot create dependency "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/nr10;->b:La/qr10;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/qr10;->V1:La/evz;

    .line 12
    .line 13
    invoke-virtual {p0}, La/qr10;->I0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, La/e780;->a:La/e780;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    sget-object v0, La/qr10;->V1:La/evz;

    .line 26
    .line 27
    new-instance v0, La/q0h0;

    .line 28
    .line 29
    iget-object p0, p0, La/qr10;->M1:La/a8z;

    .line 30
    .line 31
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/cni;

    .line 36
    .line 37
    iget-object p0, p0, La/cni;->y:La/n5d0;

    .line 38
    .line 39
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/bni;

    .line 44
    .line 45
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_1
    sget-object v0, La/qr10;->V1:La/evz;

    .line 50
    .line 51
    new-instance v0, La/q0h0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/qr10;->H0()La/bbi;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p0, p0, La/bbi;->p:La/n5d0;

    .line 58
    .line 59
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/abi;

    .line 64
    .line 65
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_2
    new-instance v0, La/q0h0;

    .line 70
    .line 71
    iget-object p0, p0, La/qr10;->K1:La/a8z;

    .line 72
    .line 73
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/zai;

    .line 78
    .line 79
    iget-object p0, p0, La/zai;->i:La/n5d0;

    .line 80
    .line 81
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/yai;

    .line 86
    .line 87
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_3
    sget-object v0, La/qr10;->V1:La/evz;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    instance-of v0, p0, La/af3;

    .line 105
    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    check-cast p0, La/af3;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    move-object p0, v2

    .line 112
    :goto_0
    const-class v0, La/o880;

    .line 113
    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, La/o5d0;

    .line 125
    .line 126
    if-eqz p0, :cond_1

    .line 127
    .line 128
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, La/ze3;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    move-object p0, v2

    .line 136
    :goto_1
    instance-of v3, p0, La/o880;

    .line 137
    .line 138
    if-nez v3, :cond_2

    .line 139
    .line 140
    move-object p0, v2

    .line 141
    :cond_2
    check-cast p0, La/o880;

    .line 142
    .line 143
    if-eqz p0, :cond_3

    .line 144
    .line 145
    invoke-virtual {p0}, La/o880;->a()La/cni;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    goto :goto_2

    .line 150
    :cond_3
    invoke-static {v0, v1}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :goto_2
    return-object v2

    .line 158
    :pswitch_4
    sget-object v0, La/qr10;->V1:La/evz;

    .line 159
    .line 160
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    instance-of v3, v0, La/af3;

    .line 172
    .line 173
    if-eqz v3, :cond_4

    .line 174
    .line 175
    check-cast v0, La/af3;

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_4
    move-object v0, v2

    .line 179
    :goto_3
    const-class v3, La/oq9;

    .line 180
    .line 181
    if-eqz v0, :cond_7

    .line 182
    .line 183
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, La/o5d0;

    .line 192
    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, La/ze3;

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_5
    move-object v0, v2

    .line 203
    :goto_4
    instance-of v4, v0, La/oq9;

    .line 204
    .line 205
    if-nez v4, :cond_6

    .line 206
    .line 207
    move-object v0, v2

    .line 208
    :cond_6
    check-cast v0, La/oq9;

    .line 209
    .line 210
    if-eqz v0, :cond_7

    .line 211
    .line 212
    iget-object v1, p0, La/qr10;->S1:La/r34;

    .line 213
    .line 214
    sget-object v2, La/qr10;->W1:[La/iiy;

    .line 215
    .line 216
    const/4 v3, 0x2

    .line 217
    aget-object v2, v2, v3

    .line 218
    .line 219
    invoke-virtual {v1, p0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 224
    .line 225
    .line 226
    move-result-wide v1

    .line 227
    invoke-virtual {v0, v1, v2}, La/oq9;->a(J)La/bbi;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    goto :goto_5

    .line 232
    :cond_7
    invoke-static {v3, v1}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_5
    return-object v2

    .line 240
    :pswitch_5
    sget-object v0, La/qr10;->V1:La/evz;

    .line 241
    .line 242
    invoke-virtual {p0}, La/qr10;->G0()La/k3t0;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    sget-object v0, La/eq9;->a:La/eq9;

    .line 247
    .line 248
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_6
    sget-object v0, La/qr10;->V1:La/evz;

    .line 255
    .line 256
    invoke-virtual {p0}, La/qr10;->G0()La/k3t0;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    sget-object v0, La/fq9;->a:La/fq9;

    .line 261
    .line 262
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_7
    sget-object v0, La/qr10;->V1:La/evz;

    .line 269
    .line 270
    invoke-virtual {p0}, La/qr10;->G0()La/k3t0;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    sget-object v0, La/hq9;->a:La/hq9;

    .line 275
    .line 276
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_8
    sget-object v0, La/qr10;->V1:La/evz;

    .line 283
    .line 284
    invoke-virtual {p0}, La/qr10;->G0()La/k3t0;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    sget-object v0, La/gq9;->a:La/gq9;

    .line 289
    .line 290
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_9
    sget-object v0, La/qr10;->V1:La/evz;

    .line 297
    .line 298
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    instance-of v3, v0, La/af3;

    .line 310
    .line 311
    if-eqz v3, :cond_8

    .line 312
    .line 313
    check-cast v0, La/af3;

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_8
    move-object v0, v2

    .line 317
    :goto_6
    const-class v3, La/rp9;

    .line 318
    .line 319
    if-eqz v0, :cond_b

    .line 320
    .line 321
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    check-cast v0, La/o5d0;

    .line 330
    .line 331
    if-eqz v0, :cond_9

    .line 332
    .line 333
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    check-cast v0, La/ze3;

    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_9
    move-object v0, v2

    .line 341
    :goto_7
    instance-of v4, v0, La/rp9;

    .line 342
    .line 343
    if-nez v4, :cond_a

    .line 344
    .line 345
    move-object v0, v2

    .line 346
    :cond_a
    check-cast v0, La/rp9;

    .line 347
    .line 348
    if-eqz v0, :cond_b

    .line 349
    .line 350
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-virtual {v0, p0}, La/rp9;->a(La/i1w0;)La/zai;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    goto :goto_8

    .line 359
    :cond_b
    invoke-static {v3, v1}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    :goto_8
    return-object v2

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
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
