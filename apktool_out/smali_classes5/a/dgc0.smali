.class public final synthetic La/dgc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/igc0;

.field public final synthetic c:La/a8z;


# direct methods
.method public synthetic constructor <init>(La/igc0;La/a8z;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dgc0;->a:B

    iput-object p1, p0, La/dgc0;->b:La/igc0;

    iput-object p2, p0, La/dgc0;->c:La/a8z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dgc0;->a:B

    .line 4
    .line 5
    const-string v2, "actionDialogManager"

    .line 6
    .line 7
    const v3, 0x7f130e5c

    .line 8
    .line 9
    .line 10
    const-string v4, "snackbarManager"

    .line 11
    .line 12
    iget-object v5, v0, La/dgc0;->c:La/a8z;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/qsc0;

    .line 21
    .line 22
    sget-object v7, La/igc0;->V1:La/fl70;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v7, La/nsc0;->a:La/nsc0;

    .line 28
    .line 29
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    iget-object v10, v0, La/dgc0;->b:La/igc0;

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    invoke-virtual {v10}, La/igc0;->I0()V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_0
    instance-of v0, v1, La/osc0;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v8, v10, La/igc0;->O1:La/wdk0;

    .line 47
    .line 48
    if-eqz v8, :cond_1

    .line 49
    .line 50
    new-instance v9, La/xdk0;

    .line 51
    .line 52
    sget-object v12, La/qek0;->a:La/qek0;

    .line 53
    .line 54
    check-cast v1, La/osc0;

    .line 55
    .line 56
    iget-object v13, v1, La/osc0;->a:Ljava/lang/String;

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    const/16 v18, 0x7c

    .line 61
    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v15, 0x0

    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    move-object v11, v9

    .line 67
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 68
    .line 69
    .line 70
    const/16 v15, 0x3fc

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v6

    .line 83
    :cond_2
    instance-of v0, v1, La/msc0;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iget-object v0, v10, La/igc0;->N1:La/ii;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 92
    .line 93
    check-cast v1, La/msc0;

    .line 94
    .line 95
    iget-object v12, v1, La/msc0;->a:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v13, v1, La/msc0;->b:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v10, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v14

    .line 103
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object v20, La/n12;->b:La/n12;

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const/16 v22, 0x5f8

    .line 111
    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const/16 v19, 0x0

    .line 120
    .line 121
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v6

    .line 139
    :cond_4
    instance-of v0, v1, La/psc0;

    .line 140
    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    iget-object v0, v10, La/igc0;->S1:La/a8z;

    .line 144
    .line 145
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/k3t0;

    .line 150
    .line 151
    new-instance v2, La/sgc0;

    .line 152
    .line 153
    check-cast v1, La/psc0;

    .line 154
    .line 155
    iget-object v1, v1, La/psc0;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-direct {v2, v1}, La/sgc0;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :goto_0
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, La/k3t0;

    .line 168
    .line 169
    sget-object v1, La/uoc0;->a:La/uoc0;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 178
    .line 179
    .line 180
    :goto_1
    return-object v6

    .line 181
    :pswitch_0
    move-object/from16 v1, p1

    .line 182
    .line 183
    check-cast v1, La/jec0;

    .line 184
    .line 185
    sget-object v7, La/igc0;->V1:La/fl70;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    sget-object v7, La/hec0;->a:La/hec0;

    .line 191
    .line 192
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    iget-object v8, v0, La/dgc0;->b:La/igc0;

    .line 197
    .line 198
    if-eqz v7, :cond_6

    .line 199
    .line 200
    invoke-virtual {v8}, La/igc0;->I0()V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_2

    .line 204
    .line 205
    :cond_6
    instance-of v0, v1, La/gec0;

    .line 206
    .line 207
    if-eqz v0, :cond_8

    .line 208
    .line 209
    iget-object v0, v8, La/igc0;->N1:La/ii;

    .line 210
    .line 211
    if-eqz v0, :cond_7

    .line 212
    .line 213
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 214
    .line 215
    check-cast v1, La/gec0;

    .line 216
    .line 217
    iget-object v10, v1, La/gec0;->a:Ljava/lang/String;

    .line 218
    .line 219
    iget-object v11, v1, La/gec0;->b:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    sget-object v18, La/n12;->b:La/n12;

    .line 229
    .line 230
    const/16 v19, 0x0

    .line 231
    .line 232
    const/16 v20, 0x5f8

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const/4 v14, 0x0

    .line 236
    const/4 v15, 0x0

    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v6

    .line 259
    :cond_8
    instance-of v0, v1, La/fec0;

    .line 260
    .line 261
    if-eqz v0, :cond_a

    .line 262
    .line 263
    iget-object v9, v8, La/igc0;->O1:La/wdk0;

    .line 264
    .line 265
    if-eqz v9, :cond_9

    .line 266
    .line 267
    check-cast v1, La/fec0;

    .line 268
    .line 269
    iget-object v11, v1, La/fec0;->a:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v12, v1, La/fec0;->b:Ljava/lang/String;

    .line 272
    .line 273
    const v0, 0x7f080467

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    const/4 v15, 0x0

    .line 281
    const/16 v16, 0x50

    .line 282
    .line 283
    const-string v10, "promoCode"

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    invoke-static/range {v8 .. v16}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v6

    .line 294
    :cond_a
    instance-of v0, v1, La/iec0;

    .line 295
    .line 296
    if-eqz v0, :cond_c

    .line 297
    .line 298
    check-cast v1, La/iec0;

    .line 299
    .line 300
    iget-object v11, v1, La/iec0;->a:Ljava/lang/String;

    .line 301
    .line 302
    move-object v0, v8

    .line 303
    iget-object v8, v0, La/igc0;->O1:La/wdk0;

    .line 304
    .line 305
    if-eqz v8, :cond_b

    .line 306
    .line 307
    new-instance v9, La/xdk0;

    .line 308
    .line 309
    sget-object v10, La/qek0;->a:La/qek0;

    .line 310
    .line 311
    const/4 v15, 0x0

    .line 312
    const/16 v16, 0x7c

    .line 313
    .line 314
    const/4 v12, 0x0

    .line 315
    const/4 v13, 0x0

    .line 316
    const/4 v14, 0x0

    .line 317
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 318
    .line 319
    .line 320
    const/16 v15, 0x3fc

    .line 321
    .line 322
    const/4 v11, 0x0

    .line 323
    const/4 v13, 0x0

    .line 324
    move-object v10, v0

    .line 325
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 326
    .line 327
    .line 328
    :goto_2
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    check-cast v0, La/k3t0;

    .line 333
    .line 334
    sget-object v1, La/mdc0;->a:La/mdc0;

    .line 335
    .line 336
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    goto :goto_3

    .line 342
    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw v6

    .line 346
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 347
    .line 348
    .line 349
    :goto_3
    return-object v6

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
