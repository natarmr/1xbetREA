.class public final synthetic La/ag70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dg70;


# direct methods
.method public synthetic constructor <init>(La/dg70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ag70;->a:B

    iput-object p1, p0, La/ag70;->b:La/dg70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ag70;->a:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/ag70;->b:La/dg70;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Landroid/text/Editable;

    .line 12
    .line 13
    sget-object v0, La/dg70;->Q1:La/xuz;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/dg70;->J0()La/eh70;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v4, La/cf70;

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    const/16 v11, 0xc

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    const-class v7, La/eh70;

    .line 40
    .line 41
    const-string v8, "handleGameError"

    .line 42
    .line 43
    const-string v9, "handleGameError(Ljava/lang/Throwable;)V"

    .line 44
    .line 45
    invoke-direct/range {v4 .. v11}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v6, La/eh70;->l:La/mne;

    .line 49
    .line 50
    iget-object v10, v0, La/mne;->a:La/rwj;

    .line 51
    .line 52
    new-instance v11, La/er60;

    .line 53
    .line 54
    const/4 v0, 0x7

    .line 55
    invoke-direct {v11, v6, p0, v3, v0}, La/er60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    const/16 v12, 0xa

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    move-object v7, p1

    .line 62
    move-object v8, v4

    .line 63
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 70
    .line 71
    sget-object v0, La/dg70;->Q1:La/xuz;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, La/dg70;->H0(La/dg70;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, La/dg70;->J0()La/eh70;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget-object p0, p0, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-eqz p0, :cond_0

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 104
    .line 105
    .line 106
    move-result-wide v1

    .line 107
    :cond_0
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance v3, La/cf70;

    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    const/16 v10, 0xf

    .line 115
    .line 116
    move-object v5, v4

    .line 117
    const/4 v4, 0x1

    .line 118
    const-class v6, La/eh70;

    .line 119
    .line 120
    const-string v7, "handleGameError"

    .line 121
    .line 122
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 123
    .line 124
    invoke-direct/range {v3 .. v10}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 125
    .line 126
    .line 127
    move-object p1, v3

    .line 128
    iget-object v0, v5, La/eh70;->l:La/mne;

    .line 129
    .line 130
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 131
    .line 132
    new-instance v3, La/ah70;

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    move-object v4, v5

    .line 137
    move-wide v5, v1

    .line 138
    invoke-direct/range {v3 .. v8}, La/ah70;-><init>(La/w46;DLa/yje;B)V

    .line 139
    .line 140
    .line 141
    const/16 v10, 0xa

    .line 142
    .line 143
    move-object v5, p0

    .line 144
    move-object v6, p1

    .line 145
    move-object v8, v0

    .line 146
    move-object v9, v3

    .line 147
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 154
    .line 155
    sget-object v0, La/dg70;->Q1:La/xuz;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {p0}, La/dg70;->H0(La/dg70;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, La/dg70;->J0()La/eh70;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    iget-object p0, p0, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 172
    .line 173
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-eqz p0, :cond_1

    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    :cond_1
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    new-instance v3, La/cf70;

    .line 196
    .line 197
    const/4 v9, 0x0

    .line 198
    const/16 v10, 0xe

    .line 199
    .line 200
    move-object v5, v4

    .line 201
    const/4 v4, 0x1

    .line 202
    const-class v6, La/eh70;

    .line 203
    .line 204
    const-string v7, "handleGameError"

    .line 205
    .line 206
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 207
    .line 208
    invoke-direct/range {v3 .. v10}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 209
    .line 210
    .line 211
    move-object p1, v3

    .line 212
    iget-object v0, v5, La/eh70;->l:La/mne;

    .line 213
    .line 214
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 215
    .line 216
    new-instance v3, La/xg70;

    .line 217
    .line 218
    const/4 v8, 0x0

    .line 219
    const/4 v7, 0x0

    .line 220
    move-object v4, v5

    .line 221
    move-wide v5, v1

    .line 222
    invoke-direct/range {v3 .. v8}, La/xg70;-><init>(La/w46;DLa/yje;B)V

    .line 223
    .line 224
    .line 225
    const/16 v10, 0xa

    .line 226
    .line 227
    move-object v5, p0

    .line 228
    move-object v6, p1

    .line 229
    move-object v8, v0

    .line 230
    move-object v9, v3

    .line 231
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 232
    .line 233
    .line 234
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 238
    .line 239
    sget-object v0, La/dg70;->Q1:La/xuz;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-static {p0}, La/dg70;->H0(La/dg70;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, La/dg70;->J0()La/eh70;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    new-instance v4, La/cf70;

    .line 256
    .line 257
    const/4 v10, 0x0

    .line 258
    const/16 v11, 0x12

    .line 259
    .line 260
    const/4 v5, 0x1

    .line 261
    const-class v7, La/eh70;

    .line 262
    .line 263
    const-string v8, "handleGameError"

    .line 264
    .line 265
    const-string v9, "handleGameError(Ljava/lang/Throwable;)V"

    .line 266
    .line 267
    invoke-direct/range {v4 .. v11}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 268
    .line 269
    .line 270
    iget-object p1, v6, La/eh70;->l:La/mne;

    .line 271
    .line 272
    iget-object v10, p1, La/mne;->a:La/rwj;

    .line 273
    .line 274
    new-instance v11, La/ts6;

    .line 275
    .line 276
    const/4 p1, 0x1

    .line 277
    invoke-direct {v11, v6, v3, p1}, La/ts6;-><init>(La/diu0;La/yje;B)V

    .line 278
    .line 279
    .line 280
    const/16 v12, 0xa

    .line 281
    .line 282
    const/4 v9, 0x0

    .line 283
    move-object v7, p0

    .line 284
    move-object v8, v4

    .line 285
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 286
    .line 287
    .line 288
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 292
    .line 293
    sget-object v0, La/dg70;->Q1:La/xuz;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {p0}, La/dg70;->H0(La/dg70;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, La/dg70;->J0()La/eh70;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    new-instance v4, La/cf70;

    .line 310
    .line 311
    const/4 v10, 0x0

    .line 312
    const/16 v11, 0x13

    .line 313
    .line 314
    const/4 v5, 0x1

    .line 315
    const-class v7, La/eh70;

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
    iget-object p1, v6, La/eh70;->l:La/mne;

    .line 325
    .line 326
    iget-object v10, p1, La/mne;->a:La/rwj;

    .line 327
    .line 328
    new-instance v11, La/z8t;

    .line 329
    .line 330
    const/4 p1, 0x5

    .line 331
    invoke-direct {v11, v6, v3, p1}, La/z8t;-><init>(La/w46;La/yje;B)V

    .line 332
    .line 333
    .line 334
    const/16 v12, 0xa

    .line 335
    .line 336
    const/4 v9, 0x0

    .line 337
    move-object v7, p0

    .line 338
    move-object v8, v4

    .line 339
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 340
    .line 341
    .line 342
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object p0

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
