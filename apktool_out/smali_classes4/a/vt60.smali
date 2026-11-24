.class public final synthetic La/vt60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xt60;


# direct methods
.method public synthetic constructor <init>(La/xt60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vt60;->a:B

    iput-object p1, p0, La/vt60;->b:La/xt60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vt60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    sget-object v3, La/xt60;->V1:La/xuz;

    .line 18
    .line 19
    iget-object v0, v0, La/vt60;->b:La/xt60;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, v0, La/xt60;->K1:La/phf0;

    .line 26
    .line 27
    sget-object v5, La/xt60;->W1:[La/iiy;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    aget-object v5, v5, v6

    .line 31
    .line 32
    invoke-virtual {v4, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v3, v1, v2, v4}, La/o2t;->b(Landroidx/fragment/app/e;JLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, La/xt60;->G0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v3, La/zs60;

    .line 44
    .line 45
    invoke-direct {v3, v1, v2}, La/zs60;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_0
    iget-object v3, v0, La/vt60;->b:La/xt60;

    .line 55
    .line 56
    iget-object v0, v3, La/xt60;->Q1:La/kiu0;

    .line 57
    .line 58
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, La/qu60;

    .line 61
    .line 62
    sget-object v4, La/xt60;->V1:La/xuz;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    instance-of v4, v1, La/nu60;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    iget-object v0, v3, La/xt60;->P1:La/peg0;

    .line 73
    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La/yzn0;

    .line 79
    .line 80
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    sget-object v5, La/bm5;->d:La/bm5;

    .line 85
    .line 86
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const-string v9, "SELECT_BALANCE_REQUEST_KEY"

    .line 94
    .line 95
    const/16 v10, 0x1ee

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v8, 0x0

    .line 99
    invoke-static/range {v4 .. v10}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v1, La/viq;

    .line 107
    .line 108
    const/16 v2, 0x1d

    .line 109
    .line 110
    invoke-direct {v1, v3, v2}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    const-string v2, "SELECT_BALANCE_REQUEST_KEY"

    .line 114
    .line 115
    invoke-virtual {v0, v2, v3, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_0
    const-string v0, "changeBalanceDialogProvider"

    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v5

    .line 126
    :cond_1
    instance-of v4, v1, La/ou60;

    .line 127
    .line 128
    if-eqz v4, :cond_3

    .line 129
    .line 130
    iget-object v0, v3, La/xt60;->N1:La/ii;

    .line 131
    .line 132
    if-eqz v0, :cond_2

    .line 133
    .line 134
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 135
    .line 136
    const v1, 0x7f1304e0

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const v1, 0x7f130c24

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    const v1, 0x7f130e5c

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    sget-object v15, La/n12;->c:La/n12;

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    const/16 v17, 0x5d8

    .line 165
    .line 166
    const/4 v10, 0x0

    .line 167
    const/4 v11, 0x0

    .line 168
    const-string v12, "REQUEST_FREE_SPIN"

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const/4 v14, 0x0

    .line 172
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v6, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_2
    const-string v0, "actionDialogManager"

    .line 187
    .line 188
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v5

    .line 192
    :cond_3
    instance-of v4, v1, La/pu60;

    .line 193
    .line 194
    if-eqz v4, :cond_5

    .line 195
    .line 196
    check-cast v1, La/pu60;

    .line 197
    .line 198
    iget-object v8, v1, La/pu60;->a:Ljava/lang/String;

    .line 199
    .line 200
    iget-object v1, v3, La/xt60;->O1:La/wdk0;

    .line 201
    .line 202
    if-eqz v1, :cond_4

    .line 203
    .line 204
    new-instance v2, La/xdk0;

    .line 205
    .line 206
    sget-object v7, La/rek0;->b:La/rek0;

    .line 207
    .line 208
    const/4 v12, 0x0

    .line 209
    const/16 v13, 0x7c

    .line 210
    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x0

    .line 213
    const/4 v11, 0x0

    .line 214
    move-object v6, v2

    .line 215
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 216
    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/16 v8, 0x3fc

    .line 220
    .line 221
    const/4 v4, 0x0

    .line 222
    const/4 v5, 0x0

    .line 223
    const/4 v6, 0x0

    .line 224
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 225
    .line 226
    .line 227
    goto :goto_0

    .line 228
    :cond_4
    const-string v0, "snackbarManager"

    .line 229
    .line 230
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v5

    .line 234
    :cond_5
    instance-of v4, v1, La/lu60;

    .line 235
    .line 236
    if-eqz v4, :cond_6

    .line 237
    .line 238
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, La/k370;

    .line 243
    .line 244
    sget-object v1, La/y270;->a:La/y270;

    .line 245
    .line 246
    invoke-virtual {v0, v1}, La/k370;->y(La/a370;)V

    .line 247
    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_6
    instance-of v1, v1, La/mu60;

    .line 251
    .line 252
    if-eqz v1, :cond_7

    .line 253
    .line 254
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, La/k370;

    .line 259
    .line 260
    new-instance v1, La/z270;

    .line 261
    .line 262
    invoke-direct {v1, v2}, La/z270;-><init>(Z)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v1}, La/k370;->y(La/a370;)V

    .line 266
    .line 267
    .line 268
    :goto_0
    invoke-virtual {v3}, La/xt60;->G0()La/k3t0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    sget-object v1, La/xs60;->a:La/xs60;

    .line 273
    .line 274
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 281
    .line 282
    .line 283
    :goto_1
    return-object v5

    .line 284
    :pswitch_1
    move-object/from16 v1, p1

    .line 285
    .line 286
    check-cast v1, La/lwk;

    .line 287
    .line 288
    sget-object v3, La/xt60;->V1:La/xuz;

    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    iget-object v5, v0, La/vt60;->b:La/xt60;

    .line 294
    .line 295
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    new-instance v6, La/vt60;

    .line 300
    .line 301
    const/4 v0, 0x2

    .line 302
    invoke-direct {v6, v5, v0}, La/vt60;-><init>(La/xt60;B)V

    .line 303
    .line 304
    .line 305
    new-instance v7, La/ut60;

    .line 306
    .line 307
    invoke-direct {v7, v5, v2}, La/ut60;-><init>(La/xt60;B)V

    .line 308
    .line 309
    .line 310
    const/4 v8, 0x0

    .line 311
    const/16 v9, 0x12

    .line 312
    .line 313
    invoke-static/range {v4 .. v9}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 314
    .line 315
    .line 316
    new-instance v0, La/ty2;

    .line 317
    .line 318
    const/16 v1, 0x11

    .line 319
    .line 320
    invoke-direct {v0, v5, v1}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
