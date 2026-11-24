.class public final synthetic La/zzb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/personal/impl/presentation/edit/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zzb0;->a:B

    iput-object p1, p0, La/zzb0;->b:Lorg/xplatform/personal/impl/presentation/edit/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zzb0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/zzb0;->b:Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, v0, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/n;->B()Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget v2, v0, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 30
    .line 31
    if-eq v1, v2, :cond_0

    .line 32
    .line 33
    sget-object v1, La/h2c0;->a:La/h2c0;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lorg/xplatform/personal/impl/presentation/edit/n;->D(La/k2c0;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/n;->C()V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_0
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 46
    .line 47
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Lorg/xplatform/personal/impl/presentation/edit/n;->B()Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    instance-of v1, v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v3, v5, Lorg/xplatform/personal/impl/presentation/edit/n;->k:La/mne;

    .line 68
    .line 69
    iget-object v11, v3, La/mne;->b:La/dvj;

    .line 70
    .line 71
    new-instance v3, La/e9b0;

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    const/16 v10, 0x19

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    const-class v6, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 78
    .line 79
    const-string v7, "handleOnSaveClickedError"

    .line 80
    .line 81
    const-string v8, "handleOnSaveClickedError(Ljava/lang/Throwable;)V"

    .line 82
    .line 83
    invoke-direct/range {v3 .. v10}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 84
    .line 85
    .line 86
    new-instance v8, La/d2c0;

    .line 87
    .line 88
    invoke-direct {v8, v5, v4}, La/d2c0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;B)V

    .line 89
    .line 90
    .line 91
    new-instance v10, Lorg/xplatform/personal/impl/presentation/edit/l;

    .line 92
    .line 93
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 94
    .line 95
    invoke-direct {v10, v5, v0, v2}, Lorg/xplatform/personal/impl/presentation/edit/l;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/yje;)V

    .line 96
    .line 97
    .line 98
    move-object v9, v11

    .line 99
    const/16 v11, 0x8

    .line 100
    .line 101
    move-object v6, v1

    .line 102
    move-object v7, v3

    .line 103
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_1
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 110
    .line 111
    new-instance v1, La/vzb0;

    .line 112
    .line 113
    new-instance v2, La/e9b0;

    .line 114
    .line 115
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    const/4 v8, 0x0

    .line 120
    const/16 v9, 0x10

    .line 121
    .line 122
    const/4 v3, 0x1

    .line 123
    const-class v5, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 124
    .line 125
    const-string v6, "onItemClicked"

    .line 126
    .line 127
    const-string v7, "onItemClicked(Lorg/xplatform/personal/impl/domain/model/ProfileItemEnum;)V"

    .line 128
    .line 129
    invoke-direct/range {v2 .. v9}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 130
    .line 131
    .line 132
    new-instance v10, La/yn90;

    .line 133
    .line 134
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x11

    .line 141
    .line 142
    const/4 v11, 0x2

    .line 143
    const-string v14, "onTextChanged"

    .line 144
    .line 145
    const-string v15, "onTextChanged(Lorg/xplatform/personal/impl/domain/model/ProfileItemEnum;Ljava/lang/String;)V"

    .line 146
    .line 147
    move-object v13, v5

    .line 148
    invoke-direct/range {v10 .. v17}, La/yn90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 149
    .line 150
    .line 151
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 152
    .line 153
    .line 154
    new-instance v0, La/j3b0;

    .line 155
    .line 156
    const/16 v3, 0x14

    .line 157
    .line 158
    invoke-direct {v0, v3}, La/j3b0;-><init>(B)V

    .line 159
    .line 160
    .line 161
    new-instance v3, La/wyb0;

    .line 162
    .line 163
    const/4 v4, 0x4

    .line 164
    invoke-direct {v3, v4}, La/wyb0;-><init>(B)V

    .line 165
    .line 166
    .line 167
    new-instance v5, La/iv60;

    .line 168
    .line 169
    const/16 v6, 0x17

    .line 170
    .line 171
    const/4 v7, 0x3

    .line 172
    invoke-direct {v5, v7, v6}, La/iv60;-><init>(IB)V

    .line 173
    .line 174
    .line 175
    sget-object v6, La/xk60;->z:La/xk60;

    .line 176
    .line 177
    new-instance v8, La/gbn;

    .line 178
    .line 179
    invoke-direct {v8, v0, v5, v3, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 180
    .line 181
    .line 182
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 183
    .line 184
    invoke-virtual {v0, v8}, La/dp;->b(La/gbn;)V

    .line 185
    .line 186
    .line 187
    new-instance v3, La/j3b0;

    .line 188
    .line 189
    const/16 v5, 0x13

    .line 190
    .line 191
    invoke-direct {v3, v5}, La/j3b0;-><init>(B)V

    .line 192
    .line 193
    .line 194
    new-instance v5, La/ppb0;

    .line 195
    .line 196
    invoke-direct {v5, v10, v4}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    new-instance v4, La/iv60;

    .line 200
    .line 201
    const/16 v6, 0x16

    .line 202
    .line 203
    invoke-direct {v4, v7, v6}, La/iv60;-><init>(IB)V

    .line 204
    .line 205
    .line 206
    sget-object v6, La/xk60;->y:La/xk60;

    .line 207
    .line 208
    new-instance v8, La/gbn;

    .line 209
    .line 210
    invoke-direct {v8, v3, v4, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v8}, La/dp;->b(La/gbn;)V

    .line 214
    .line 215
    .line 216
    new-instance v3, La/j3b0;

    .line 217
    .line 218
    const/16 v4, 0x12

    .line 219
    .line 220
    invoke-direct {v3, v4}, La/j3b0;-><init>(B)V

    .line 221
    .line 222
    .line 223
    new-instance v4, La/ppb0;

    .line 224
    .line 225
    invoke-direct {v4, v2, v7}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 226
    .line 227
    .line 228
    new-instance v2, La/iv60;

    .line 229
    .line 230
    const/16 v5, 0x15

    .line 231
    .line 232
    invoke-direct {v2, v7, v5}, La/iv60;-><init>(IB)V

    .line 233
    .line 234
    .line 235
    sget-object v5, La/xk60;->x:La/xk60;

    .line 236
    .line 237
    new-instance v6, La/gbn;

    .line 238
    .line 239
    invoke-direct {v6, v3, v2, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 243
    .line 244
    .line 245
    return-object v1

    .line 246
    :pswitch_2
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 247
    .line 248
    new-instance v1, La/q0h0;

    .line 249
    .line 250
    iget-object v0, v0, Lorg/xplatform/personal/impl/presentation/edit/a;->R1:La/n0o0;

    .line 251
    .line 252
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, La/mpi;

    .line 257
    .line 258
    iget-object v0, v0, La/mpi;->z:La/n5d0;

    .line 259
    .line 260
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, La/kpi;

    .line 265
    .line 266
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 267
    .line 268
    .line 269
    return-object v1

    .line 270
    :pswitch_3
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    instance-of v3, v1, La/af3;

    .line 284
    .line 285
    if-eqz v3, :cond_2

    .line 286
    .line 287
    check-cast v1, La/af3;

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_2
    move-object v1, v2

    .line 291
    :goto_2
    const-class v3, La/yzb0;

    .line 292
    .line 293
    if-eqz v1, :cond_5

    .line 294
    .line 295
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, La/o5d0;

    .line 304
    .line 305
    if-eqz v1, :cond_3

    .line 306
    .line 307
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, La/ze3;

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_3
    move-object v1, v2

    .line 315
    :goto_3
    instance-of v4, v1, La/yzb0;

    .line 316
    .line 317
    if-nez v4, :cond_4

    .line 318
    .line 319
    move-object v1, v2

    .line 320
    :cond_4
    check-cast v1, La/yzb0;

    .line 321
    .line 322
    if-eqz v1, :cond_5

    .line 323
    .line 324
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const-class v2, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-virtual {v1, v0, v2}, La/yzb0;->a(La/i1w0;Ljava/lang/String;)La/mpi;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    goto :goto_4

    .line 339
    :cond_5
    const-string v0, "Cannot create dependency "

    .line 340
    .line 341
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :goto_4
    return-object v2

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
