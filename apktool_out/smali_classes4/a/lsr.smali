.class public final synthetic La/lsr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x1t;


# direct methods
.method public synthetic constructor <init>(La/x1t;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lsr;->a:B

    iput-object p1, p0, La/lsr;->b:La/x1t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lsr;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/lsr;->b:La/x1t;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 12
    .line 13
    iget-object v0, v0, La/x1t;->m:La/p7m0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/j1t;

    .line 20
    .line 21
    iget-boolean v1, v1, La/j1t;->m:Z

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move-object v2, v1

    .line 30
    check-cast v2, La/j1t;

    .line 31
    .line 32
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, La/j1t;

    .line 37
    .line 38
    iget-object v3, v3, La/j1t;->l:La/w3w0;

    .line 39
    .line 40
    sget-object v4, La/w3w0;->b:La/w3w0;

    .line 41
    .line 42
    if-ne v3, v4, :cond_1

    .line 43
    .line 44
    sget-object v4, La/w3w0;->a:La/w3w0;

    .line 45
    .line 46
    :cond_1
    move-object v14, v4

    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/16 v17, 0x77ff

    .line 50
    .line 51
    const-wide/16 v3, 0x0

    .line 52
    .line 53
    const-wide/16 v5, 0x0

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    const-wide/16 v8, 0x0

    .line 57
    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v12, 0x0

    .line 61
    const/4 v13, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    invoke-static/range {v2 .. v17}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    :cond_2
    return-void

    .line 74
    :pswitch_0
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sget-object v4, La/u1t;->a:La/u1t;

    .line 84
    .line 85
    iget-object v1, v0, La/x1t;->g:La/mne;

    .line 86
    .line 87
    iget-object v6, v1, La/mne;->c:La/vs10;

    .line 88
    .line 89
    new-instance v7, La/r1t;

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    invoke-direct {v7, v0, v2, v1}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 93
    .line 94
    .line 95
    const/16 v8, 0xa

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_1
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 103
    .line 104
    iget-object v1, v0, La/x1t;->m:La/p7m0;

    .line 105
    .line 106
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    move-object v4, v3

    .line 111
    check-cast v4, La/j1t;

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    const/16 v19, 0x5fff

    .line 116
    .line 117
    const-wide/16 v5, 0x0

    .line 118
    .line 119
    const-wide/16 v7, 0x0

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    const-wide/16 v10, 0x0

    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    const/4 v13, 0x0

    .line 126
    const/4 v14, 0x0

    .line 127
    const/4 v15, 0x0

    .line 128
    const/16 v16, 0x0

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    invoke-static/range {v4 .. v19}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_3

    .line 141
    .line 142
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    sget-object v5, La/t1t;->a:La/t1t;

    .line 147
    .line 148
    iget-object v1, v0, La/x1t;->g:La/mne;

    .line 149
    .line 150
    iget-object v7, v1, La/mne;->c:La/vs10;

    .line 151
    .line 152
    new-instance v8, La/r1t;

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    invoke-direct {v8, v0, v2, v1}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 156
    .line 157
    .line 158
    const/16 v9, 0xa

    .line 159
    .line 160
    const/4 v6, 0x0

    .line 161
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_2
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 166
    .line 167
    iget-object v1, v0, La/x1t;->m:La/p7m0;

    .line 168
    .line 169
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, La/j1t;

    .line 174
    .line 175
    iget-boolean v2, v2, La/j1t;->f:Z

    .line 176
    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    move-object v3, v2

    .line 184
    check-cast v3, La/j1t;

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const/16 v18, 0x7f5f

    .line 189
    .line 190
    const-wide/16 v4, 0x0

    .line 191
    .line 192
    const-wide/16 v6, 0x0

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const-wide/16 v9, 0x0

    .line 196
    .line 197
    const/4 v11, 0x0

    .line 198
    const/4 v12, 0x0

    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    const/16 v16, 0x0

    .line 203
    .line 204
    invoke-static/range {v3 .. v18}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_4

    .line 213
    .line 214
    invoke-virtual {v0}, La/x1t;->x()V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move-object v3, v2

    .line 223
    check-cast v3, La/j1t;

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    const/16 v18, 0x7fdf

    .line 228
    .line 229
    const-wide/16 v4, 0x0

    .line 230
    .line 231
    const-wide/16 v6, 0x0

    .line 232
    .line 233
    const/4 v8, 0x0

    .line 234
    const-wide/16 v9, 0x0

    .line 235
    .line 236
    const/4 v11, 0x0

    .line 237
    const/4 v12, 0x1

    .line 238
    const/4 v13, 0x0

    .line 239
    const/4 v14, 0x0

    .line 240
    const/4 v15, 0x0

    .line 241
    const/16 v16, 0x0

    .line 242
    .line 243
    invoke-static/range {v3 .. v18}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_5

    .line 252
    .line 253
    invoke-virtual {v0}, La/x1t;->y()V

    .line 254
    .line 255
    .line 256
    :goto_0
    return-void

    .line 257
    :pswitch_3
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 258
    .line 259
    iget-object v1, v0, La/x1t;->m:La/p7m0;

    .line 260
    .line 261
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    move-object v4, v3

    .line 266
    check-cast v4, La/j1t;

    .line 267
    .line 268
    const/16 v18, 0x0

    .line 269
    .line 270
    const/16 v19, 0x5fff

    .line 271
    .line 272
    const-wide/16 v5, 0x0

    .line 273
    .line 274
    const-wide/16 v7, 0x0

    .line 275
    .line 276
    const/4 v9, 0x0

    .line 277
    const-wide/16 v10, 0x0

    .line 278
    .line 279
    const/4 v12, 0x0

    .line 280
    const/4 v13, 0x0

    .line 281
    const/4 v14, 0x0

    .line 282
    const/4 v15, 0x0

    .line 283
    const/16 v16, 0x0

    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    invoke-static/range {v4 .. v19}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_6

    .line 296
    .line 297
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    sget-object v5, La/w1t;->a:La/w1t;

    .line 302
    .line 303
    iget-object v1, v0, La/x1t;->g:La/mne;

    .line 304
    .line 305
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 306
    .line 307
    new-instance v8, La/r1t;

    .line 308
    .line 309
    const/4 v1, 0x4

    .line 310
    invoke-direct {v8, v0, v2, v1}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 311
    .line 312
    .line 313
    const/16 v9, 0xa

    .line 314
    .line 315
    const/4 v6, 0x0

    .line 316
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
