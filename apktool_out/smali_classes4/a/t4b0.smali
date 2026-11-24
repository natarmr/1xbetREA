.class public final synthetic La/t4b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w4b0;


# direct methods
.method public synthetic constructor <init>(La/w4b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t4b0;->a:B

    iput-object p1, p0, La/t4b0;->b:La/w4b0;

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
    iget-byte v1, v0, La/t4b0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/t4b0;->b:La/w4b0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/w4b0;->Q1:La/nh70;

    .line 11
    .line 12
    iget-object v1, v0, La/w4b0;->K1:La/a8z;

    .line 13
    .line 14
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/voi;

    .line 19
    .line 20
    iget-object v1, v1, La/voi;->f:La/yqc;

    .line 21
    .line 22
    new-instance v2, La/wma0;

    .line 23
    .line 24
    iget-object v0, v0, La/w4b0;->M1:La/kiu0;

    .line 25
    .line 26
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v4, v1

    .line 31
    check-cast v4, La/j5b0;

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/16 v9, 0x14

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    const-class v13, La/j5b0;

    .line 38
    .line 39
    const-string v6, "onClickAllDayExpress"

    .line 40
    .line 41
    const-string v7, "onClickAllDayExpress(Lorg/xplatform/feed/popularclassic/dayexpress/models/DayExpressHeaderUiItem;)V"

    .line 42
    .line 43
    move-object v5, v13

    .line 44
    invoke-direct/range {v2 .. v9}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    new-instance v10, La/wma0;

    .line 48
    .line 49
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v12, v1

    .line 54
    check-cast v12, La/j5b0;

    .line 55
    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const/16 v17, 0x15

    .line 59
    .line 60
    const/4 v11, 0x1

    .line 61
    const-string v14, "onAddExpressEventsToCouponClick"

    .line 62
    .line 63
    const-string v15, "onAddExpressEventsToCouponClick(J)V"

    .line 64
    .line 65
    invoke-direct/range {v10 .. v17}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    move-object v1, v10

    .line 69
    new-instance v10, La/wma0;

    .line 70
    .line 71
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v12, v0

    .line 76
    check-cast v12, La/j5b0;

    .line 77
    .line 78
    const/16 v17, 0x16

    .line 79
    .line 80
    const-string v14, "onOpenBottomSheetDayExpressCardClick"

    .line 81
    .line 82
    const-string v15, "onOpenBottomSheetDayExpressCardClick(J)V"

    .line 83
    .line 84
    invoke-direct/range {v10 .. v17}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 85
    .line 86
    .line 87
    new-instance v0, La/s4b0;

    .line 88
    .line 89
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v3, La/x6o;

    .line 93
    .line 94
    const/16 v4, 0xc

    .line 95
    .line 96
    invoke-direct {v3, v4}, La/x6o;-><init>(B)V

    .line 97
    .line 98
    .line 99
    new-instance v4, La/qzn;

    .line 100
    .line 101
    const/16 v5, 0x18

    .line 102
    .line 103
    invoke-direct {v4, v10, v1, v5}, La/qzn;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    new-instance v1, La/e9k;

    .line 107
    .line 108
    const/4 v5, 0x3

    .line 109
    const/16 v6, 0x13

    .line 110
    .line 111
    invoke-direct {v1, v5, v6}, La/e9k;-><init>(IB)V

    .line 112
    .line 113
    .line 114
    sget-object v7, La/gzn;->m:La/gzn;

    .line 115
    .line 116
    new-instance v8, La/gbn;

    .line 117
    .line 118
    invoke-direct {v8, v3, v1, v4, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, La/zz3;->d:La/dp;

    .line 122
    .line 123
    invoke-virtual {v1, v8}, La/dp;->b(La/gbn;)V

    .line 124
    .line 125
    .line 126
    new-instance v3, La/j3b0;

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    invoke-direct {v3, v4}, La/j3b0;-><init>(B)V

    .line 130
    .line 131
    .line 132
    new-instance v4, La/yr80;

    .line 133
    .line 134
    const/16 v7, 0x16

    .line 135
    .line 136
    invoke-direct {v4, v2, v7}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    new-instance v2, La/iv60;

    .line 140
    .line 141
    invoke-direct {v2, v5, v6}, La/iv60;-><init>(IB)V

    .line 142
    .line 143
    .line 144
    sget-object v5, La/xk60;->v:La/xk60;

    .line 145
    .line 146
    new-instance v6, La/gbn;

    .line 147
    .line 148
    invoke-direct {v6, v3, v2, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v6}, La/dp;->b(La/gbn;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_0
    sget-object v1, La/w4b0;->Q1:La/nh70;

    .line 156
    .line 157
    new-instance v1, La/q0h0;

    .line 158
    .line 159
    iget-object v0, v0, La/w4b0;->K1:La/a8z;

    .line 160
    .line 161
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, La/voi;

    .line 166
    .line 167
    iget-object v0, v0, La/voi;->n:La/n5d0;

    .line 168
    .line 169
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, La/uoi;

    .line 174
    .line 175
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 176
    .line 177
    .line 178
    return-object v1

    .line 179
    :pswitch_1
    sget-object v1, La/w4b0;->Q1:La/nh70;

    .line 180
    .line 181
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    instance-of v2, v1, La/af3;

    .line 193
    .line 194
    const/4 v3, 0x0

    .line 195
    if-eqz v2, :cond_0

    .line 196
    .line 197
    check-cast v1, La/af3;

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_0
    move-object v1, v3

    .line 201
    :goto_0
    const-class v2, La/x4b0;

    .line 202
    .line 203
    if-eqz v1, :cond_3

    .line 204
    .line 205
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    check-cast v1, La/o5d0;

    .line 214
    .line 215
    if-eqz v1, :cond_1

    .line 216
    .line 217
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, La/ze3;

    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_1
    move-object v1, v3

    .line 225
    :goto_1
    instance-of v4, v1, La/x4b0;

    .line 226
    .line 227
    if-nez v4, :cond_2

    .line 228
    .line 229
    move-object v1, v3

    .line 230
    :cond_2
    check-cast v1, La/x4b0;

    .line 231
    .line 232
    if-eqz v1, :cond_3

    .line 233
    .line 234
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-object v7, v1, La/x4b0;->a:La/mne;

    .line 242
    .line 243
    iget-object v5, v1, La/x4b0;->c:La/yqc;

    .line 244
    .line 245
    iget-object v6, v1, La/x4b0;->b:La/jw20;

    .line 246
    .line 247
    iget-object v11, v1, La/x4b0;->d:La/ctf0;

    .line 248
    .line 249
    iget-object v12, v1, La/x4b0;->g:La/lbu;

    .line 250
    .line 251
    iget-object v13, v1, La/x4b0;->h:La/pru;

    .line 252
    .line 253
    iget-object v10, v1, La/x4b0;->e:La/g2v;

    .line 254
    .line 255
    iget-object v9, v1, La/x4b0;->f:La/m1e;

    .line 256
    .line 257
    iget-object v14, v1, La/x4b0;->i:La/ieu;

    .line 258
    .line 259
    iget-object v15, v1, La/x4b0;->j:La/j1q0;

    .line 260
    .line 261
    iget-object v0, v1, La/x4b0;->k:La/gst0;

    .line 262
    .line 263
    iget-object v1, v1, La/x4b0;->l:La/b3c0;

    .line 264
    .line 265
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    new-instance v4, La/voi;

    .line 281
    .line 282
    move-object/from16 v16, v0

    .line 283
    .line 284
    move-object/from16 v17, v1

    .line 285
    .line 286
    invoke-direct/range {v4 .. v17}, La/voi;-><init>(La/yqc;La/jw20;La/mne;La/i1w0;La/m1e;La/g2v;La/ctf0;La/lbu;La/pru;La/ieu;La/j1q0;La/gst0;La/b3c0;)V

    .line 287
    .line 288
    .line 289
    move-object v3, v4

    .line 290
    goto :goto_2

    .line 291
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 292
    .line 293
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :goto_2
    return-object v3

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
