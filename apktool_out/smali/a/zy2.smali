.class public final La/zy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zy2;->a:B

    iput-object p1, p0, La/zy2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-byte v3, v0, La/zy2;->a:B

    .line 8
    .line 9
    const/16 v4, 0xd

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x7

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    iget-object v0, v0, La/zy2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v3, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v0, La/p5q0;

    .line 22
    .line 23
    new-instance v3, La/khx;

    .line 24
    .line 25
    invoke-direct {v3, v1, v0, v9, v6}, La/khx;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, La/wne;->a:La/wne;

    .line 33
    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    :goto_0
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    :goto_1
    return-object v0

    .line 45
    :pswitch_0
    check-cast v0, La/k7q0;

    .line 46
    .line 47
    iget-object v3, v0, La/k7q0;->A:La/cgx0;

    .line 48
    .line 49
    iget-object v0, v0, La/k7q0;->z:La/i7q0;

    .line 50
    .line 51
    new-instance v4, La/zz2;

    .line 52
    .line 53
    move-object v5, v1

    .line 54
    check-cast v5, La/jnn0;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v5}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iget-object v5, v5, La/e7z;->B:La/wgu0;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v5, v4, La/zz2;->b:Ljava/lang/Object;

    .line 69
    .line 70
    new-instance v5, La/obz;

    .line 71
    .line 72
    invoke-direct {v5, v4, v3, v0, v9}, La/obz;-><init>(La/zz2;La/cgx0;La/p5q0;La/yje;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v5, v2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, La/wne;->a:La/wne;

    .line 80
    .line 81
    if-ne v0, v1, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_2
    sget-object v1, La/wne;->a:La/wne;

    .line 87
    .line 88
    if-ne v0, v1, :cond_3

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    :goto_3
    return-object v0

    .line 94
    :pswitch_1
    new-instance v10, La/g0p0;

    .line 95
    .line 96
    move-object v12, v0

    .line 97
    check-cast v12, La/z4q0;

    .line 98
    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const/16 v17, 0x1c

    .line 102
    .line 103
    const/4 v11, 0x1

    .line 104
    const-class v13, La/z4q0;

    .line 105
    .line 106
    const-string v14, "tryShowContextMenu"

    .line 107
    .line 108
    const-string v15, "tryShowContextMenu-k-4lQ0M(J)V"

    .line 109
    .line 110
    invoke-direct/range {v10 .. v17}, La/g0p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 111
    .line 112
    .line 113
    new-instance v0, La/yy2;

    .line 114
    .line 115
    invoke-direct {v0, v10, v9, v8}, La/yy2;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v0, v2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sget-object v1, La/wne;->a:La/wne;

    .line 123
    .line 124
    if-ne v0, v1, :cond_4

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    :goto_4
    if-ne v0, v1, :cond_5

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    :goto_5
    return-object v0

    .line 135
    :pswitch_2
    new-instance v3, La/obz;

    .line 136
    .line 137
    check-cast v0, La/oum0;

    .line 138
    .line 139
    invoke-direct {v3, v0, v9, v5}, La/obz;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v3, v2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, La/wne;->a:La/wne;

    .line 147
    .line 148
    if-ne v0, v1, :cond_6

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    :goto_6
    return-object v0

    .line 154
    :pswitch_3
    new-instance v3, La/ma6;

    .line 155
    .line 156
    check-cast v0, La/ome;

    .line 157
    .line 158
    invoke-direct {v3, v0, v9, v5}, La/ma6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 159
    .line 160
    .line 161
    move-object v0, v1

    .line 162
    check-cast v0, La/jnn0;

    .line 163
    .line 164
    invoke-virtual {v0, v2, v3}, La/jnn0;->Z0(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sget-object v1, La/wne;->a:La/wne;

    .line 169
    .line 170
    if-ne v0, v1, :cond_7

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    :goto_7
    return-object v0

    .line 176
    :pswitch_4
    new-instance v3, La/ma6;

    .line 177
    .line 178
    check-cast v0, La/ep90;

    .line 179
    .line 180
    invoke-direct {v3, v0, v9, v8}, La/ma6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 181
    .line 182
    .line 183
    move-object v0, v1

    .line 184
    check-cast v0, La/jnn0;

    .line 185
    .line 186
    invoke-virtual {v0, v2, v3}, La/jnn0;->Z0(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    sget-object v1, La/wne;->a:La/wne;

    .line 191
    .line 192
    if-ne v0, v1, :cond_8

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    :goto_8
    return-object v0

    .line 198
    :pswitch_5
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 199
    .line 200
    new-instance v3, La/r3w;

    .line 201
    .line 202
    invoke-direct {v3, v0, v4}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 203
    .line 204
    .line 205
    invoke-static {v1, v3, v2, v6}, La/tto0;->d(La/hpa0;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sget-object v1, La/wne;->a:La/wne;

    .line 210
    .line 211
    if-ne v0, v1, :cond_9

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    :goto_9
    return-object v0

    .line 217
    :pswitch_6
    check-cast v0, La/ppj0;

    .line 218
    .line 219
    new-instance v10, La/ebz;

    .line 220
    .line 221
    const/16 v3, 0x19

    .line 222
    .line 223
    invoke-direct {v10, v0, v3}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 224
    .line 225
    .line 226
    new-instance v12, La/da00;

    .line 227
    .line 228
    invoke-direct {v12, v0, v7}, La/da00;-><init>(La/ppj0;B)V

    .line 229
    .line 230
    .line 231
    new-instance v13, La/da00;

    .line 232
    .line 233
    invoke-direct {v13, v0, v8}, La/da00;-><init>(La/ppj0;B)V

    .line 234
    .line 235
    .line 236
    new-instance v11, La/g2z;

    .line 237
    .line 238
    invoke-direct {v11, v0, v4}, La/g2z;-><init>(Ljava/lang/Object;B)V

    .line 239
    .line 240
    .line 241
    sget v0, La/bel;->a:F

    .line 242
    .line 243
    new-instance v9, La/xdl;

    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/4 v15, 0x1

    .line 247
    invoke-direct/range {v9 .. v15}, La/xdl;-><init>(Ljava/lang/Object;La/wdr;La/wdr;Ljava/lang/Object;La/yje;B)V

    .line 248
    .line 249
    .line 250
    invoke-static {v1, v9, v2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget-object v1, La/wne;->a:La/wne;

    .line 255
    .line 256
    if-ne v0, v1, :cond_a

    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    :goto_a
    if-ne v0, v1, :cond_b

    .line 262
    .line 263
    goto :goto_b

    .line 264
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    :goto_b
    return-object v0

    .line 267
    :pswitch_7
    new-instance v3, La/juy;

    .line 268
    .line 269
    check-cast v0, La/xk80;

    .line 270
    .line 271
    const/4 v4, 0x4

    .line 272
    invoke-direct {v3, v1, v0, v9, v4}, La/juy;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 273
    .line 274
    .line 275
    invoke-static {v2, v3}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sget-object v1, La/wne;->a:La/wne;

    .line 280
    .line 281
    if-ne v0, v1, :cond_c

    .line 282
    .line 283
    goto :goto_c

    .line 284
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    :goto_c
    return-object v0

    .line 287
    :pswitch_8
    new-instance v3, La/wij;

    .line 288
    .line 289
    check-cast v0, La/xij;

    .line 290
    .line 291
    invoke-direct {v3, v0, v9, v7}, La/wij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 292
    .line 293
    .line 294
    invoke-static {v1, v3, v2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    sget-object v1, La/wne;->a:La/wne;

    .line 299
    .line 300
    if-ne v0, v1, :cond_d

    .line 301
    .line 302
    goto :goto_d

    .line 303
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    :goto_d
    return-object v0

    .line 306
    :pswitch_9
    new-instance v3, La/yy2;

    .line 307
    .line 308
    check-cast v0, La/az2;

    .line 309
    .line 310
    invoke-direct {v3, v0, v9, v7}, La/yy2;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 311
    .line 312
    .line 313
    invoke-static {v1, v3, v2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    sget-object v1, La/wne;->a:La/wne;

    .line 318
    .line 319
    if-ne v0, v1, :cond_e

    .line 320
    .line 321
    goto :goto_e

    .line 322
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    :goto_e
    return-object v0

    .line 325
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
