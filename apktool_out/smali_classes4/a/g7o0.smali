.class public final synthetic La/g7o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g7o0;->a:B

    iput-object p1, p0, La/g7o0;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/g7o0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/g7o0;->b:La/l7m0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/jjr0;

    .line 14
    .line 15
    iget-object p0, p0, La/jjr0;->b:La/mtr0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/cjr0;

    .line 23
    .line 24
    iget-object p0, p0, La/cjr0;->a:La/jjr0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    sget-object v0, La/v9r0;->O1:La/j6m0;

    .line 28
    .line 29
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/cdr0;

    .line 34
    .line 35
    invoke-interface {p0}, La/cdr0;->a()La/imm;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_2
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/v6n;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/CharSequence;

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_0

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_4
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, La/x6r0;

    .line 70
    .line 71
    iget-boolean p0, p0, La/x6r0;->b:Z

    .line 72
    .line 73
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :pswitch_5
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/t3r0;

    .line 83
    .line 84
    iget p0, p0, La/t3r0;->b:I

    .line 85
    .line 86
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_6
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    const/high16 v0, 0x3f800000    # 1.0f

    .line 102
    .line 103
    cmpg-float p0, p0, v0

    .line 104
    .line 105
    if-nez p0, :cond_1

    .line 106
    .line 107
    move p0, v1

    .line 108
    goto :goto_0

    .line 109
    :cond_1
    const/4 p0, 0x0

    .line 110
    :goto_0
    xor-int/2addr p0, v1

    .line 111
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_7
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, La/gbp0;

    .line 121
    .line 122
    iget-object p0, p0, La/gbp0;->a:La/fbp0;

    .line 123
    .line 124
    iget-boolean p0, p0, La/fbp0;->a:Z

    .line 125
    .line 126
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :pswitch_8
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, La/sbp0;

    .line 136
    .line 137
    iget-object p0, p0, La/sbp0;->c:La/l7m0;

    .line 138
    .line 139
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, La/bbp0;

    .line 144
    .line 145
    iget-boolean p0, p0, La/bbp0;->c:Z

    .line 146
    .line 147
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :pswitch_9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, La/sbp0;

    .line 157
    .line 158
    iget-object p0, p0, La/sbp0;->c:La/l7m0;

    .line 159
    .line 160
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, La/bbp0;

    .line 165
    .line 166
    iget-object p0, p0, La/bbp0;->b:La/a4x;

    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, La/sbp0;

    .line 174
    .line 175
    iget-object p0, p0, La/sbp0;->b:La/l7m0;

    .line 176
    .line 177
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, La/gbp0;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, La/sbp0;

    .line 189
    .line 190
    iget-object p0, p0, La/sbp0;->c:La/l7m0;

    .line 191
    .line 192
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, La/bbp0;

    .line 197
    .line 198
    iget-object p0, p0, La/bbp0;->a:La/u8p0;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    check-cast p0, La/xap0;

    .line 206
    .line 207
    iget-boolean p0, p0, La/xap0;->e:Z

    .line 208
    .line 209
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :pswitch_d
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, La/xap0;

    .line 219
    .line 220
    iget-object p0, p0, La/xap0;->d:La/a4x;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_e
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    check-cast p0, La/xap0;

    .line 228
    .line 229
    iget-object p0, p0, La/xap0;->c:La/qap0;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_f
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, La/xap0;

    .line 237
    .line 238
    iget-object p0, p0, La/xap0;->b:La/r8p0;

    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_10
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    check-cast p0, La/xap0;

    .line 246
    .line 247
    iget-object p0, p0, La/xap0;->a:La/p9p0;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_11
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    check-cast p0, La/r7p0;

    .line 255
    .line 256
    iget-boolean p0, p0, La/r7p0;->d:Z

    .line 257
    .line 258
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0

    .line 263
    :pswitch_12
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    check-cast p0, La/r7p0;

    .line 268
    .line 269
    iget-object p0, p0, La/r7p0;->c:La/a4x;

    .line 270
    .line 271
    return-object p0

    .line 272
    :pswitch_13
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    check-cast p0, La/r7p0;

    .line 277
    .line 278
    iget-object p0, p0, La/r7p0;->b:La/j7p0;

    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_14
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, La/c3p0;

    .line 286
    .line 287
    iget-boolean p0, p0, La/c3p0;->a:Z

    .line 288
    .line 289
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :pswitch_15
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    check-cast p0, La/c3p0;

    .line 299
    .line 300
    iget-object p0, p0, La/c3p0;->b:La/t2p0;

    .line 301
    .line 302
    return-object p0

    .line 303
    :pswitch_16
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    check-cast p0, La/wzo0;

    .line 308
    .line 309
    iget-boolean p0, p0, La/wzo0;->a:Z

    .line 310
    .line 311
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0

    .line 316
    :pswitch_17
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, La/wzo0;

    .line 321
    .line 322
    iget-object p0, p0, La/wzo0;->b:La/hzo0;

    .line 323
    .line 324
    return-object p0

    .line 325
    :pswitch_18
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    check-cast p0, Ljava/lang/Boolean;

    .line 330
    .line 331
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_19
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    check-cast p0, La/j7o0;

    .line 340
    .line 341
    iget-boolean p0, p0, La/j7o0;->d:Z

    .line 342
    .line 343
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    return-object p0

    .line 348
    :pswitch_1a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    check-cast p0, La/j7o0;

    .line 353
    .line 354
    iget-object p0, p0, La/j7o0;->c:La/a4x;

    .line 355
    .line 356
    return-object p0

    .line 357
    :pswitch_1b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    check-cast p0, La/j7o0;

    .line 362
    .line 363
    iget-object p0, p0, La/j7o0;->b:La/b7o0;

    .line 364
    .line 365
    return-object p0

    .line 366
    :pswitch_1c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    check-cast p0, La/j7o0;

    .line 371
    .line 372
    iget-object p0, p0, La/j7o0;->a:La/y6o0;

    .line 373
    .line 374
    return-object p0

    .line 375
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
