.class public final synthetic La/xm70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bn70;


# direct methods
.method public synthetic constructor <init>(La/bn70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xm70;->a:B

    iput-object p1, p0, La/xm70;->b:La/bn70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/xm70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/xm70;->b:La/bn70;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 11
    .line 12
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p0, La/to70;->b0:La/p7m0;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    move-object v1, p0

    .line 23
    check-cast v1, La/jn70;

    .line 24
    .line 25
    iget-object v1, v1, La/jn70;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v3, La/jn70;

    .line 31
    .line 32
    invoke-direct {v3, v1, v2}, La/jn70;-><init>(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 45
    .line 46
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object v0, La/uy5;->a:La/uy5;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/to70;->w(La/zy5;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 59
    .line 60
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0, v2}, La/to70;->z(Z)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 71
    .line 72
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const/4 v0, 0x1

    .line 77
    invoke-virtual {p0, v0}, La/to70;->z(Z)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_3
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 84
    .line 85
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object v0, p0, La/to70;->g:La/mne;

    .line 97
    .line 98
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 99
    .line 100
    new-instance v6, La/lo70;

    .line 101
    .line 102
    const/4 v0, 0x2

    .line 103
    invoke-direct {v6, p0, v1, v0}, La/lo70;-><init>(La/to70;La/yje;B)V

    .line 104
    .line 105
    .line 106
    new-instance v8, La/cd60;

    .line 107
    .line 108
    const/16 v0, 0x13

    .line 109
    .line 110
    invoke-direct {v8, p0, v0}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    new-instance v9, La/cn70;

    .line 114
    .line 115
    invoke-direct {v9, p0, v2}, La/cn70;-><init>(La/to70;B)V

    .line 116
    .line 117
    .line 118
    const/16 v10, 0x14

    .line 119
    .line 120
    const-string v4, "OnexGamesHolderViewModel.onTechnicalDialogGameClick"

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    invoke-static/range {v3 .. v10}, La/sac;->h0(La/bvc;Ljava/lang/String;ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_4
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 130
    .line 131
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object v0, p0, La/to70;->l:La/vcu;

    .line 136
    .line 137
    iget-object v1, p0, La/to70;->E:La/hsj0;

    .line 138
    .line 139
    iget-object v1, v1, La/hsj0;->a:La/pbt;

    .line 140
    .line 141
    iget-object v1, v1, La/pbt;->a:La/j5t;

    .line 142
    .line 143
    iget-boolean v1, v1, La/j5t;->A:Z

    .line 144
    .line 145
    if-eqz v1, :cond_1

    .line 146
    .line 147
    invoke-virtual {v0}, La/vcu;->a()La/vrs;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, La/vrs;->a()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_5

    .line 156
    .line 157
    :cond_1
    iget-object v1, p0, La/to70;->u:La/fqx;

    .line 158
    .line 159
    invoke-virtual {v1}, La/fqx;->a()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_2

    .line 164
    .line 165
    invoke-virtual {v0}, La/vcu;->a()La/vrs;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, La/vrs;->a()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_2

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_2
    invoke-virtual {p0}, La/to70;->x()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_3

    .line 181
    .line 182
    new-instance v0, La/co70;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, v0}, La/to70;->F(La/io70;)V

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_3
    iget-object v0, p0, La/to70;->P:La/khf0;

    .line 192
    .line 193
    invoke-virtual {v0}, La/khf0;->F()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-nez v0, :cond_4

    .line 198
    .line 199
    new-instance v0, La/sle;

    .line 200
    .line 201
    iget-object v1, p0, La/to70;->n:La/ztt;

    .line 202
    .line 203
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-direct {v0, v1}, La/sle;-><init>(La/csr;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v0}, La/to70;->w(La/zy5;)V

    .line 211
    .line 212
    .line 213
    :cond_4
    new-instance v0, La/iy5;

    .line 214
    .line 215
    sget-object v1, La/csr;->e:La/csr;

    .line 216
    .line 217
    invoke-direct {v0, v1}, La/iy5;-><init>(La/csr;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v0}, La/to70;->w(La/zy5;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, La/to70;->A()V

    .line 224
    .line 225
    .line 226
    :cond_5
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_5
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 230
    .line 231
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    iget-object v0, p0, La/to70;->I:La/j1q0;

    .line 236
    .line 237
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 238
    .line 239
    iget-object v0, v0, La/m1q0;->a:La/q7d0;

    .line 240
    .line 241
    const-string v3, "WEBVIEW_ANIMATION_ENABLE"

    .line 242
    .line 243
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_6

    .line 252
    .line 253
    sget-object v0, La/in70;->a:La/in70;

    .line 254
    .line 255
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    iget-object v3, p0, La/to70;->g:La/mne;

    .line 260
    .line 261
    iget-object v5, v3, La/mne;->c:La/vs10;

    .line 262
    .line 263
    new-instance v3, La/wk60;

    .line 264
    .line 265
    const/16 v4, 0x17

    .line 266
    .line 267
    invoke-direct {v3, v4}, La/wk60;-><init>(B)V

    .line 268
    .line 269
    .line 270
    new-instance v6, La/nf60;

    .line 271
    .line 272
    const/16 v4, 0x1a

    .line 273
    .line 274
    invoke-direct {v6, p0, v0, v1, v4}, La/nf60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 275
    .line 276
    .line 277
    const/16 v7, 0xa

    .line 278
    .line 279
    const/4 v4, 0x0

    .line 280
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 281
    .line 282
    .line 283
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object p0

    .line 286
    :pswitch_6
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 287
    .line 288
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p0, v2}, La/to70;->z(Z)V

    .line 293
    .line 294
    .line 295
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_7
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 299
    .line 300
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-virtual {p0}, La/to70;->A()V

    .line 305
    .line 306
    .line 307
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_8
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 311
    .line 312
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    sget-object v0, La/wn70;->a:La/wn70;

    .line 317
    .line 318
    invoke-virtual {p0, v0}, La/to70;->F(La/io70;)V

    .line 319
    .line 320
    .line 321
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object p0

    .line 324
    :pswitch_9
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 325
    .line 326
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    sget-object v0, La/kle;->a:La/kle;

    .line 331
    .line 332
    invoke-virtual {p0, v0}, La/to70;->w(La/zy5;)V

    .line 333
    .line 334
    .line 335
    new-instance v0, La/iy5;

    .line 336
    .line 337
    iget-object v1, p0, La/to70;->Q:La/csr;

    .line 338
    .line 339
    invoke-direct {v0, v1}, La/iy5;-><init>(La/csr;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0, v0}, La/to70;->w(La/zy5;)V

    .line 343
    .line 344
    .line 345
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object p0

    .line 348
    nop

    .line 349
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
