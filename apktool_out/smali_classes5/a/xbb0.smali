.class public final synthetic La/xbb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ccb0;


# direct methods
.method public synthetic constructor <init>(La/ccb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xbb0;->a:B

    iput-object p1, p0, La/xbb0;->b:La/ccb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/xbb0;->a:B

    .line 2
    .line 3
    const-string v1, "TAX_INFO_DIALOG_RESULT_KEY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/xbb0;->b:La/ccb0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 13
    .line 14
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, La/nxa0;->a:La/nxa0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 27
    .line 28
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object v0, La/gya0;->a:La/gya0;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 41
    .line 42
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const-string v0, "sensor"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object p0, v3

    .line 56
    :goto_0
    instance-of v0, p0, Landroid/hardware/SensorManager;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    move-object v3, p0

    .line 61
    check-cast v3, Landroid/hardware/SensorManager;

    .line 62
    .line 63
    :cond_1
    return-object v3

    .line 64
    :pswitch_2
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 65
    .line 66
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object v0, La/bya0;->a:La/bya0;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_3
    sget-object v0, La/ccb0;->X1:La/mi70;

    .line 79
    .line 80
    iget-object v3, p0, La/xbb0;->b:La/ccb0;

    .line 81
    .line 82
    iget-object p0, v3, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 83
    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    const-string v0, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 87
    .line 88
    const-string v1, ""

    .line 89
    .line 90
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-nez v5, :cond_2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v3}, La/ccb0;->H0()La/wdk0;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const p0, 0x7f130671

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const p0, 0x7f080467

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    iget-object p0, v3, La/ccb0;->W1:La/s0r;

    .line 119
    .line 120
    sget-object v0, La/ccb0;->Y1:[La/iiy;

    .line 121
    .line 122
    aget-object v0, v0, v2

    .line 123
    .line 124
    invoke-virtual {p0, v0, v3}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    check-cast p0, La/aid;

    .line 132
    .line 133
    iget-object v10, p0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 134
    .line 135
    const/16 v11, 0x10

    .line 136
    .line 137
    const/4 v8, 0x0

    .line 138
    move-object v6, v5

    .line 139
    invoke-static/range {v3 .. v11}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_2
    return-object p0

    .line 148
    :pswitch_4
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 149
    .line 150
    new-instance p0, La/gkv;

    .line 151
    .line 152
    new-instance v0, La/xbb0;

    .line 153
    .line 154
    const/16 v1, 0xe

    .line 155
    .line 156
    invoke-direct {v0, v4, v1}, La/xbb0;-><init>(La/ccb0;B)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, v0}, La/gkv;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_5
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 164
    .line 165
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    sget-object v0, La/wxa0;->a:La/wxa0;

    .line 170
    .line 171
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_6
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 178
    .line 179
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    sget-object v0, La/vxa0;->a:La/vxa0;

    .line 184
    .line 185
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_7
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 192
    .line 193
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    sget-object v0, La/txa0;->a:La/txa0;

    .line 198
    .line 199
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_8
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 206
    .line 207
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    sget-object v0, La/uxa0;->a:La/uxa0;

    .line 212
    .line 213
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_9
    new-instance p0, La/q0h0;

    .line 220
    .line 221
    iget-object v0, v4, La/ccb0;->K1:La/hpi;

    .line 222
    .line 223
    if-eqz v0, :cond_4

    .line 224
    .line 225
    invoke-direct {p0, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 226
    .line 227
    .line 228
    return-object p0

    .line 229
    :cond_4
    const-string p0, "viewModelFactory"

    .line 230
    .line 231
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v3

    .line 235
    :pswitch_a
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 236
    .line 237
    iget-object p0, v4, La/ccb0;->V1:La/a8z;

    .line 238
    .line 239
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, Landroid/hardware/SensorManager;

    .line 244
    .line 245
    if-eqz p0, :cond_5

    .line 246
    .line 247
    iget-object v0, v4, La/ccb0;->U1:La/a8z;

    .line 248
    .line 249
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, La/gkv;

    .line 254
    .line 255
    invoke-virtual {p0, v0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 256
    .line 257
    .line 258
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_b
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 262
    .line 263
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    sget-object v0, La/ixa0;->a:La/ixa0;

    .line 268
    .line 269
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    sget-object v0, La/rxa0;->a:La/rxa0;

    .line 277
    .line 278
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_c
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 285
    .line 286
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-virtual {p0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    sget-object v0, La/pxa0;->a:La/pxa0;

    .line 298
    .line 299
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_d
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 306
    .line 307
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    new-instance v0, La/zbb0;

    .line 312
    .line 313
    invoke-direct {v0, v4, v2}, La/zbb0;-><init>(La/ccb0;B)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0, v1, v4, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    sget-object v0, La/oxa0;->a:La/oxa0;

    .line 324
    .line 325
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_e
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 332
    .line 333
    invoke-virtual {v4}, La/ccb0;->I0()La/k3t0;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    sget-object v0, La/jxa0;->a:La/jxa0;

    .line 338
    .line 339
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

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
