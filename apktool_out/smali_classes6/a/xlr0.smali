.class public final La/xlr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xlr0;->a:B

    iput-object p1, p0, La/xlr0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/xlr0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/xlr0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/xlr0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/xlr0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    check-cast p0, La/rkt0;

    .line 13
    .line 14
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroid/hardware/SensorManager;

    .line 17
    .line 18
    check-cast v1, La/o4w0;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 27
    .line 28
    instance-of v0, p1, La/eqv0;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    check-cast p0, La/og00;

    .line 33
    .line 34
    check-cast p1, La/eqv0;

    .line 35
    .line 36
    iget p1, p1, La/eqv0;->a:I

    .line 37
    .line 38
    iget-object p0, p0, La/og00;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    .line 40
    const/16 v0, -0x100

    .line 41
    .line 42
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    check-cast v1, La/ig00;

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    invoke-interface {v1, p0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Ljava/lang/Void;

    .line 55
    .line 56
    check-cast p0, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 57
    .line 58
    iget-object p0, p0, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;->b:La/f7v0;

    .line 59
    .line 60
    check-cast v1, La/s7p0;

    .line 61
    .line 62
    iget-object p1, v1, La/s7p0;->b:La/ctf0;

    .line 63
    .line 64
    invoke-static {p0, p1}, La/tnq0;->r(La/f7v0;La/ctf0;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, La/a8v0;

    .line 69
    .line 70
    new-instance v0, La/imm;

    .line 71
    .line 72
    new-instance v1, La/ilm;

    .line 73
    .line 74
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 75
    .line 76
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 81
    .line 82
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    invoke-direct {v1, v2, v3}, La/ilm;-><init>(J)V

    .line 87
    .line 88
    .line 89
    new-instance v2, La/plm;

    .line 90
    .line 91
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 96
    .line 97
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    sget-object v5, La/fa50;->a:La/fa50;

    .line 102
    .line 103
    invoke-direct {v2, p0, v3, v4, v5}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 104
    .line 105
    .line 106
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 111
    .line 112
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    sget-object v3, La/fmm;->a:La/fmm;

    .line 119
    .line 120
    invoke-direct/range {v0 .. v7}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {p1, v0}, La/a8v0;-><init>(La/imm;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_2
    check-cast p1, La/bem;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    instance-of p1, p1, La/wdm;

    .line 133
    .line 134
    if-eqz p1, :cond_1

    .line 135
    .line 136
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 137
    .line 138
    new-instance p1, La/cgt0;

    .line 139
    .line 140
    check-cast v1, La/agt0;

    .line 141
    .line 142
    invoke-direct {p1, v1}, La/cgt0;-><init>(La/agt0;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    check-cast p0, La/efr0;

    .line 158
    .line 159
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v1, Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0, v0, p1}, La/efr0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    check-cast p0, La/g4s0;

    .line 181
    .line 182
    check-cast v1, Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p0, p1}, La/g4s0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    check-cast p0, La/g4s0;

    .line 200
    .line 201
    check-cast v1, La/i4;

    .line 202
    .line 203
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p0, p1}, La/g4s0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    check-cast p0, La/g4s0;

    .line 219
    .line 220
    check-cast v1, La/i4;

    .line 221
    .line 222
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-virtual {p0, p1}, La/g4s0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    check-cast p0, La/efr0;

    .line 238
    .line 239
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v1, Ljava/util/List;

    .line 244
    .line 245
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p0, v0, p1}, La/efr0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    check-cast p0, La/g4s0;

    .line 261
    .line 262
    check-cast v1, Ljava/util/List;

    .line 263
    .line 264
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {p0, p1}, La/g4s0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    return-object p0

    .line 273
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    check-cast p0, La/g4s0;

    .line 280
    .line 281
    check-cast v1, Ljava/util/List;

    .line 282
    .line 283
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-virtual {p0, p1}, La/g4s0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    check-cast p0, La/t9r0;

    .line 299
    .line 300
    check-cast v1, Ljava/util/List;

    .line 301
    .line 302
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p0, p1}, La/t9r0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    return-object p0

    .line 311
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    check-cast p0, La/t9r0;

    .line 318
    .line 319
    check-cast v1, Ljava/util/List;

    .line 320
    .line 321
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {p0, p1}, La/t9r0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0

    .line 330
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    check-cast p0, La/efr0;

    .line 337
    .line 338
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    check-cast v1, La/a4x;

    .line 343
    .line 344
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    invoke-virtual {p0, v0, p1}, La/efr0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    return-object p0

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
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
