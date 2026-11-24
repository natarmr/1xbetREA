.class public final synthetic La/ih70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mh70;


# direct methods
.method public synthetic constructor <init>(La/mh70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ih70;->a:B

    iput-object p1, p0, La/ih70;->b:La/mh70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ih70;->a:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/ih70;->b:La/mh70;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Landroid/view/View;

    .line 12
    .line 13
    sget-object v0, La/mh70;->Q1:La/jh70;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, La/mh70;->G0(La/mh70;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/mh70;->I0()La/ji70;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    :cond_0
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v3, La/cf70;

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/16 v10, 0x18

    .line 57
    .line 58
    move-object v5, v4

    .line 59
    const/4 v4, 0x1

    .line 60
    const-class v6, La/ji70;

    .line 61
    .line 62
    const-string v7, "handleGameError"

    .line 63
    .line 64
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 65
    .line 66
    invoke-direct/range {v3 .. v10}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 67
    .line 68
    .line 69
    move-object p1, v3

    .line 70
    iget-object v0, v5, La/ji70;->l:La/mne;

    .line 71
    .line 72
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 73
    .line 74
    new-instance v3, La/ah70;

    .line 75
    .line 76
    const/4 v8, 0x1

    .line 77
    const/4 v7, 0x0

    .line 78
    move-object v4, v5

    .line 79
    move-wide v5, v1

    .line 80
    invoke-direct/range {v3 .. v8}, La/ah70;-><init>(La/w46;DLa/yje;B)V

    .line 81
    .line 82
    .line 83
    const/16 v10, 0xa

    .line 84
    .line 85
    move-object v5, p0

    .line 86
    move-object v6, p1

    .line 87
    move-object v8, v0

    .line 88
    move-object v9, v3

    .line 89
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 96
    .line 97
    sget-object v0, La/mh70;->Q1:La/jh70;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, La/mh70;->G0(La/mh70;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, La/mh70;->I0()La/ji70;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget-object p0, p0, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 114
    .line 115
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-eqz p0, :cond_1

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 130
    .line 131
    .line 132
    move-result-wide v1

    .line 133
    :cond_1
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    new-instance v3, La/cf70;

    .line 138
    .line 139
    const/4 v9, 0x0

    .line 140
    const/16 v10, 0x17

    .line 141
    .line 142
    move-object v5, v4

    .line 143
    const/4 v4, 0x1

    .line 144
    const-class v6, La/ji70;

    .line 145
    .line 146
    const-string v7, "handleGameError"

    .line 147
    .line 148
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 149
    .line 150
    invoke-direct/range {v3 .. v10}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 151
    .line 152
    .line 153
    move-object p1, v3

    .line 154
    iget-object v0, v5, La/ji70;->l:La/mne;

    .line 155
    .line 156
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 157
    .line 158
    new-instance v3, La/xg70;

    .line 159
    .line 160
    const/4 v8, 0x1

    .line 161
    const/4 v7, 0x0

    .line 162
    move-object v4, v5

    .line 163
    move-wide v5, v1

    .line 164
    invoke-direct/range {v3 .. v8}, La/xg70;-><init>(La/w46;DLa/yje;B)V

    .line 165
    .line 166
    .line 167
    const/16 v10, 0xa

    .line 168
    .line 169
    move-object v5, p0

    .line 170
    move-object v6, p1

    .line 171
    move-object v8, v0

    .line 172
    move-object v9, v3

    .line 173
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 174
    .line 175
    .line 176
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 180
    .line 181
    sget-object v0, La/mh70;->Q1:La/jh70;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {p0}, La/mh70;->G0(La/mh70;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, La/mh70;->I0()La/ji70;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    new-instance v4, La/cf70;

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    const/16 v11, 0x1a

    .line 201
    .line 202
    const/4 v5, 0x1

    .line 203
    const-class v7, La/ji70;

    .line 204
    .line 205
    const-string v8, "handleGameError"

    .line 206
    .line 207
    const-string v9, "handleGameError(Ljava/lang/Throwable;)V"

    .line 208
    .line 209
    invoke-direct/range {v4 .. v11}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 210
    .line 211
    .line 212
    iget-object p1, v6, La/ji70;->l:La/mne;

    .line 213
    .line 214
    iget-object v10, p1, La/mne;->b:La/dvj;

    .line 215
    .line 216
    new-instance v11, La/ts6;

    .line 217
    .line 218
    const/4 p1, 0x2

    .line 219
    invoke-direct {v11, v6, v3, p1}, La/ts6;-><init>(La/diu0;La/yje;B)V

    .line 220
    .line 221
    .line 222
    const/16 v12, 0xa

    .line 223
    .line 224
    const/4 v9, 0x0

    .line 225
    move-object v7, p0

    .line 226
    move-object v8, v4

    .line 227
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 228
    .line 229
    .line 230
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 234
    .line 235
    sget-object v0, La/mh70;->Q1:La/jh70;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {p0}, La/mh70;->G0(La/mh70;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, La/mh70;->I0()La/ji70;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    new-instance v4, La/cf70;

    .line 252
    .line 253
    const/4 v10, 0x0

    .line 254
    const/16 v11, 0x1b

    .line 255
    .line 256
    const/4 v5, 0x1

    .line 257
    const-class v7, La/ji70;

    .line 258
    .line 259
    const-string v8, "handleGameError"

    .line 260
    .line 261
    const-string v9, "handleGameError(Ljava/lang/Throwable;)V"

    .line 262
    .line 263
    invoke-direct/range {v4 .. v11}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 264
    .line 265
    .line 266
    iget-object p1, v6, La/ji70;->l:La/mne;

    .line 267
    .line 268
    iget-object v10, p1, La/mne;->b:La/dvj;

    .line 269
    .line 270
    new-instance v11, La/z8t;

    .line 271
    .line 272
    const/4 p1, 0x6

    .line 273
    invoke-direct {v11, v6, v3, p1}, La/z8t;-><init>(La/w46;La/yje;B)V

    .line 274
    .line 275
    .line 276
    const/16 v12, 0xa

    .line 277
    .line 278
    const/4 v9, 0x0

    .line 279
    move-object v7, p0

    .line 280
    move-object v8, v4

    .line 281
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 282
    .line 283
    .line 284
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_3
    check-cast p1, Landroid/text/Editable;

    .line 288
    .line 289
    sget-object v0, La/mh70;->Q1:La/jh70;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0}, La/mh70;->I0()La/ji70;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    new-instance v4, La/cf70;

    .line 310
    .line 311
    const/4 v10, 0x0

    .line 312
    const/16 v11, 0x15

    .line 313
    .line 314
    const/4 v5, 0x1

    .line 315
    const-class v7, La/ji70;

    .line 316
    .line 317
    const-string v8, "handleGameError"

    .line 318
    .line 319
    const-string v9, "handleGameError(Ljava/lang/Throwable;)V"

    .line 320
    .line 321
    invoke-direct/range {v4 .. v11}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 322
    .line 323
    .line 324
    iget-object v0, v6, La/ji70;->l:La/mne;

    .line 325
    .line 326
    iget-object v10, v0, La/mne;->a:La/rwj;

    .line 327
    .line 328
    new-instance v11, La/er60;

    .line 329
    .line 330
    const/16 v0, 0x8

    .line 331
    .line 332
    invoke-direct {v11, v6, p0, v3, v0}, La/er60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 333
    .line 334
    .line 335
    const/16 v12, 0xa

    .line 336
    .line 337
    const/4 v9, 0x0

    .line 338
    move-object v7, p1

    .line 339
    move-object v8, v4

    .line 340
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 341
    .line 342
    .line 343
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object p0

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
