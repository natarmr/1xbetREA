.class public final La/erx;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/tzi;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/yje;La/tzi;ZLjava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/erx;->i:B

    iput-object p2, p0, La/erx;->m:La/tzi;

    iput-boolean p3, p0, La/erx;->n:Z

    iput-object p4, p0, La/erx;->o:Ljava/util/List;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/erx;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    move-object v1, p3

    .line 6
    check-cast v1, La/yje;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, La/erx;

    .line 12
    .line 13
    iget-object v4, p0, La/erx;->o:Ljava/util/List;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    iget-object v2, p0, La/erx;->m:La/tzi;

    .line 17
    .line 18
    iget-boolean v3, p0, La/erx;->n:Z

    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, La/erx;-><init>(La/yje;La/tzi;ZLjava/util/List;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/erx;->k:La/kmq;

    .line 24
    .line 25
    iput-object p2, v0, La/erx;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/erx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    new-instance v0, La/erx;

    .line 35
    .line 36
    iget-object v4, p0, La/erx;->o:Ljava/util/List;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    iget-object v2, p0, La/erx;->m:La/tzi;

    .line 40
    .line 41
    iget-boolean v3, p0, La/erx;->n:Z

    .line 42
    .line 43
    invoke-direct/range {v0 .. v5}, La/erx;-><init>(La/yje;La/tzi;ZLjava/util/List;B)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v0, La/erx;->k:La/kmq;

    .line 47
    .line 48
    iput-object p2, v0, La/erx;->l:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, La/erx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/erx;->i:B

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v8, v0, La/erx;->j:Z

    .line 19
    .line 20
    if-eqz v8, :cond_1

    .line 21
    .line 22
    if-ne v8, v7, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v4, v0, La/erx;->k:La/kmq;

    .line 38
    .line 39
    iget-object v5, v0, La/erx;->l:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v12, 0x0

    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    new-instance v2, La/hie0;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-boolean v7, v2, La/hie0;->a:Z

    .line 56
    .line 57
    iget-boolean v10, v0, La/erx;->n:Z

    .line 58
    .line 59
    if-eqz v10, :cond_2

    .line 60
    .line 61
    const-wide/16 v8, 0x8

    .line 62
    .line 63
    :goto_0
    move-wide v15, v8

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const-wide/16 v8, 0x1e

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    new-instance v8, La/tu3;

    .line 69
    .line 70
    const/4 v13, 0x7

    .line 71
    iget-object v9, v0, La/erx;->m:La/tzi;

    .line 72
    .line 73
    iget-object v11, v0, La/erx;->o:Ljava/util/List;

    .line 74
    .line 75
    invoke-direct/range {v8 .. v13}, La/tu3;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance v5, La/vsg0;

    .line 79
    .line 80
    invoke-direct {v5, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 81
    .line 82
    .line 83
    new-instance v13, La/qqu;

    .line 84
    .line 85
    const/16 v8, 0xd

    .line 86
    .line 87
    invoke-direct {v13, v5, v2, v8}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 88
    .line 89
    .line 90
    new-instance v14, La/lqu;

    .line 91
    .line 92
    const/16 v5, 0xe

    .line 93
    .line 94
    invoke-direct {v14, v2, v5}, La/lqu;-><init>(La/hie0;B)V

    .line 95
    .line 96
    .line 97
    new-instance v2, La/brx;

    .line 98
    .line 99
    invoke-direct {v2, v7, v12, v6}, La/brx;-><init>(ILa/yje;B)V

    .line 100
    .line 101
    .line 102
    new-instance v5, La/x9;

    .line 103
    .line 104
    const/16 v6, 0x1a

    .line 105
    .line 106
    invoke-direct {v5, v9, v10, v6}, La/x9;-><init>(Ljava/lang/Object;ZB)V

    .line 107
    .line 108
    .line 109
    const/16 v20, 0x18

    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    move-object/from16 v17, v2

    .line 114
    .line 115
    move-object/from16 v19, v5

    .line 116
    .line 117
    invoke-static/range {v13 .. v20}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v5, La/i89;

    .line 122
    .line 123
    const/16 v6, 0x16

    .line 124
    .line 125
    invoke-direct {v5, v2, v6}, La/i89;-><init>(La/gmq;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {v5, v7}, La/dtb;->U(La/gmq;I)La/qnq;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    new-instance v5, La/eu4;

    .line 133
    .line 134
    const/16 v6, 0x10

    .line 135
    .line 136
    invoke-direct {v5, v2, v6}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    new-instance v2, La/eu4;

    .line 140
    .line 141
    const/16 v6, 0x11

    .line 142
    .line 143
    invoke-direct {v2, v5, v6}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    new-instance v5, La/oz0;

    .line 147
    .line 148
    const/16 v6, 0x17

    .line 149
    .line 150
    invoke-direct {v5, v3, v12, v6}, La/oz0;-><init>(ILa/yje;B)V

    .line 151
    .line 152
    .line 153
    new-instance v3, La/dnq;

    .line 154
    .line 155
    invoke-direct {v3, v2, v5, v7}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    new-instance v3, La/x5r0;

    .line 160
    .line 161
    invoke-direct {v3, v6, v12}, La/x5r0;-><init>(ZLa/nas;)V

    .line 162
    .line 163
    .line 164
    new-instance v5, La/eu4;

    .line 165
    .line 166
    invoke-direct {v5, v3, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    move-object v3, v5

    .line 170
    :goto_2
    iput-object v12, v0, La/erx;->k:La/kmq;

    .line 171
    .line 172
    iput-object v12, v0, La/erx;->l:Ljava/lang/Object;

    .line 173
    .line 174
    iput-boolean v7, v0, La/erx;->j:Z

    .line 175
    .line 176
    invoke-static {v4, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-ne v0, v1, :cond_4

    .line 181
    .line 182
    move-object v4, v1

    .line 183
    goto :goto_4

    .line 184
    :cond_4
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    :goto_4
    return-object v4

    .line 187
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 188
    .line 189
    iget-boolean v8, v0, La/erx;->j:Z

    .line 190
    .line 191
    if-eqz v8, :cond_6

    .line 192
    .line 193
    if-ne v8, v7, :cond_5

    .line 194
    .line 195
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_6

    .line 199
    .line 200
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_7

    .line 204
    .line 205
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object v4, v0, La/erx;->k:La/kmq;

    .line 209
    .line 210
    iget-object v5, v0, La/erx;->l:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v5, Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    const/4 v9, 0x0

    .line 219
    if-eqz v5, :cond_7

    .line 220
    .line 221
    iget-object v10, v0, La/erx;->m:La/tzi;

    .line 222
    .line 223
    iget-object v2, v10, La/tzi;->i:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v2, La/rdd;

    .line 226
    .line 227
    iget-object v2, v2, La/rdd;->a:La/nv20;

    .line 228
    .line 229
    iget-object v2, v2, La/nv20;->a:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v2, La/tj60;

    .line 232
    .line 233
    iget-object v2, v2, La/tj60;->b:La/p7m0;

    .line 234
    .line 235
    invoke-static {v2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    iget-object v5, v10, La/tzi;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v5, La/xsu;

    .line 242
    .line 243
    iget-object v5, v5, La/xsu;->a:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v5, La/h0q0;

    .line 246
    .line 247
    iget-object v5, v5, La/h0q0;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v5, La/s5r0;

    .line 250
    .line 251
    iget-object v6, v5, La/s5r0;->c:La/p7m0;

    .line 252
    .line 253
    new-instance v8, La/za60;

    .line 254
    .line 255
    const/16 v11, 0x12

    .line 256
    .line 257
    invoke-direct {v8, v9, v5, v11}, La/za60;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 258
    .line 259
    .line 260
    invoke-static {v6, v8}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-static {v5}, La/i120;->W(La/gmq;)La/gmq;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    new-instance v6, La/y0g;

    .line 269
    .line 270
    const/4 v8, 0x6

    .line 271
    invoke-direct {v6, v3, v9, v8}, La/y0g;-><init>(ILa/yje;B)V

    .line 272
    .line 273
    .line 274
    new-instance v3, La/p6d;

    .line 275
    .line 276
    invoke-direct {v3, v2, v5, v6, v7}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 277
    .line 278
    .line 279
    new-instance v8, La/erx;

    .line 280
    .line 281
    const/4 v13, 0x1

    .line 282
    iget-boolean v11, v0, La/erx;->n:Z

    .line 283
    .line 284
    iget-object v12, v0, La/erx;->o:Ljava/util/List;

    .line 285
    .line 286
    invoke-direct/range {v8 .. v13}, La/erx;-><init>(La/yje;La/tzi;ZLjava/util/List;B)V

    .line 287
    .line 288
    .line 289
    invoke-static {v3, v8}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    goto :goto_5

    .line 294
    :cond_7
    new-instance v3, La/x5r0;

    .line 295
    .line 296
    invoke-direct {v3, v6, v9}, La/x5r0;-><init>(ZLa/nas;)V

    .line 297
    .line 298
    .line 299
    new-instance v5, La/eu4;

    .line 300
    .line 301
    invoke-direct {v5, v3, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 302
    .line 303
    .line 304
    move-object v2, v5

    .line 305
    :goto_5
    iput-object v9, v0, La/erx;->k:La/kmq;

    .line 306
    .line 307
    iput-object v9, v0, La/erx;->l:Ljava/lang/Object;

    .line 308
    .line 309
    iput-boolean v7, v0, La/erx;->j:Z

    .line 310
    .line 311
    invoke-static {v4, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-ne v0, v1, :cond_8

    .line 316
    .line 317
    move-object v4, v1

    .line 318
    goto :goto_7

    .line 319
    :cond_8
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    :goto_7
    return-object v4

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
