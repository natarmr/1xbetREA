.class public final synthetic La/isr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e1t;


# direct methods
.method public synthetic constructor <init>(La/e1t;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/isr;->a:B

    iput-object p1, p0, La/isr;->b:La/e1t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget-byte p1, p0, La/isr;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, La/isr;->b:La/e1t;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v2, La/p39;->d:La/p39;

    .line 15
    .line 16
    sget-object v3, La/v39;->c:La/v39;

    .line 17
    .line 18
    iget-object v1, p0, La/e1t;->m:La/xex;

    .line 19
    .line 20
    iget-object p1, p0, La/e1t;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 21
    .line 22
    iget-wide v4, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 23
    .line 24
    iget-wide v6, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 25
    .line 26
    iget-wide v8, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 27
    .line 28
    invoke-virtual/range {v1 .. v9}, La/xex;->N(La/p39;La/v39;JJJ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La/e1t;->n:La/p7m0;

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, La/s0t;

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/16 v10, 0x5fff

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-static/range {v2 .. v10}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    iget-object p1, p0, La/e1t;->o:La/p7m0;

    .line 60
    .line 61
    new-instance v1, La/l0t;

    .line 62
    .line 63
    new-instance v2, La/jcs;

    .line 64
    .line 65
    const/16 v3, 0xb

    .line 66
    .line 67
    invoke-direct {v2, p0, v3}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v2}, La/l0t;-><init>(La/jcs;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_0
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 81
    .line 82
    iget-object p0, p0, La/e1t;->n:La/p7m0;

    .line 83
    .line 84
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, La/s0t;

    .line 89
    .line 90
    iget-boolean p1, p1, La/s0t;->m:Z

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    move-object v0, p1

    .line 99
    check-cast v0, La/s0t;

    .line 100
    .line 101
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/s0t;

    .line 106
    .line 107
    iget-object v1, v1, La/s0t;->l:La/w3w0;

    .line 108
    .line 109
    sget-object v2, La/w3w0;->b:La/w3w0;

    .line 110
    .line 111
    if-ne v1, v2, :cond_2

    .line 112
    .line 113
    sget-object v2, La/w3w0;->a:La/w3w0;

    .line 114
    .line 115
    :cond_2
    move-object v5, v2

    .line 116
    const/4 v7, 0x0

    .line 117
    const/16 v8, 0x77ff

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    const/4 v2, 0x0

    .line 121
    const/4 v3, 0x0

    .line 122
    const/4 v4, 0x0

    .line 123
    const/4 v6, 0x0

    .line 124
    invoke-static/range {v0 .. v8}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_1

    .line 133
    .line 134
    :cond_3
    return-void

    .line 135
    :pswitch_1
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    sget-object v2, La/p39;->c:La/p39;

    .line 141
    .line 142
    sget-object v3, La/v39;->c:La/v39;

    .line 143
    .line 144
    iget-object v1, p0, La/e1t;->m:La/xex;

    .line 145
    .line 146
    iget-object p1, p0, La/e1t;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 147
    .line 148
    iget-wide v4, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 149
    .line 150
    iget-wide v6, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 151
    .line 152
    iget-wide v8, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 153
    .line 154
    invoke-virtual/range {v1 .. v9}, La/xex;->N(La/p39;La/v39;JJJ)V

    .line 155
    .line 156
    .line 157
    iget-object v1, p0, La/e1t;->n:La/p7m0;

    .line 158
    .line 159
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    move-object v3, v2

    .line 164
    check-cast v3, La/s0t;

    .line 165
    .line 166
    const/4 v10, 0x0

    .line 167
    const/16 v11, 0x5fff

    .line 168
    .line 169
    const/4 v4, 0x0

    .line 170
    const/4 v5, 0x0

    .line 171
    const/4 v6, 0x0

    .line 172
    const/4 v7, 0x0

    .line 173
    const/4 v8, 0x0

    .line 174
    const/4 v9, 0x0

    .line 175
    invoke-static/range {v3 .. v11}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_4

    .line 184
    .line 185
    iget-object v1, p0, La/e1t;->o:La/p7m0;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    sget-object v2, La/k0t;->a:La/k0t;

    .line 191
    .line 192
    invoke-virtual {v1, v0, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    iget-object v1, p0, La/e1t;->e:La/yqc;

    .line 196
    .line 197
    invoke-virtual {v1}, La/yqc;->v()V

    .line 198
    .line 199
    .line 200
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    sget-object v3, La/c1t;->a:La/c1t;

    .line 205
    .line 206
    iget-object v1, p0, La/e1t;->i:La/mne;

    .line 207
    .line 208
    iget-object v5, v1, La/mne;->a:La/rwj;

    .line 209
    .line 210
    new-instance v6, La/b1t;

    .line 211
    .line 212
    const/4 v1, 0x1

    .line 213
    invoke-direct {v6, p0, v0, v1}, La/b1t;-><init>(La/e1t;La/yje;B)V

    .line 214
    .line 215
    .line 216
    const/16 v7, 0xa

    .line 217
    .line 218
    const/4 v4, 0x0

    .line 219
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 220
    .line 221
    .line 222
    iget-object p0, p0, La/e1t;->c:La/ali;

    .line 223
    .line 224
    new-instance v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 225
    .line 226
    iget-wide v1, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 227
    .line 228
    iget-wide v3, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 229
    .line 230
    iget v5, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->e:I

    .line 231
    .line 232
    iget-wide v6, p1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 233
    .line 234
    const/4 v8, 0x0

    .line 235
    invoke-direct/range {v0 .. v8}, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;-><init>(JJIJZ)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, v0}, La/ali;->C(Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_2
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 243
    .line 244
    iget-object p1, p0, La/e1t;->n:La/p7m0;

    .line 245
    .line 246
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, La/s0t;

    .line 251
    .line 252
    iget-boolean v0, v0, La/s0t;->f:Z

    .line 253
    .line 254
    if-eqz v0, :cond_6

    .line 255
    .line 256
    sget-object v2, La/p39;->b:La/p39;

    .line 257
    .line 258
    sget-object v3, La/v39;->c:La/v39;

    .line 259
    .line 260
    iget-object v1, p0, La/e1t;->m:La/xex;

    .line 261
    .line 262
    iget-object v0, p0, La/e1t;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 263
    .line 264
    iget-wide v4, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 265
    .line 266
    iget-wide v6, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 267
    .line 268
    iget-wide v8, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 269
    .line 270
    invoke-virtual/range {v1 .. v9}, La/xex;->N(La/p39;La/v39;JJJ)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, La/e1t;->y()V

    .line 274
    .line 275
    .line 276
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    move-object v0, p0

    .line 281
    check-cast v0, La/s0t;

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    const/16 v8, 0x7f5f

    .line 285
    .line 286
    const/4 v1, 0x0

    .line 287
    const/4 v2, 0x0

    .line 288
    const/4 v3, 0x0

    .line 289
    const/4 v4, 0x0

    .line 290
    const/4 v5, 0x0

    .line 291
    const/4 v6, 0x0

    .line 292
    invoke-static/range {v0 .. v8}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {p1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    if-eqz p0, :cond_5

    .line 301
    .line 302
    goto :goto_0

    .line 303
    :cond_6
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    move-object v1, v0

    .line 308
    check-cast v1, La/s0t;

    .line 309
    .line 310
    const/4 v8, 0x0

    .line 311
    const/16 v9, 0x7fdf

    .line 312
    .line 313
    const/4 v2, 0x1

    .line 314
    const/4 v3, 0x0

    .line 315
    const/4 v4, 0x0

    .line 316
    const/4 v5, 0x0

    .line 317
    const/4 v6, 0x0

    .line 318
    const/4 v7, 0x0

    .line 319
    invoke-static/range {v1 .. v9}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_6

    .line 328
    .line 329
    invoke-virtual {p0}, La/e1t;->z()V

    .line 330
    .line 331
    .line 332
    :goto_0
    return-void

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
