.class public final La/c7r0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/g7r0;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(La/g7r0;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/c7r0;->i:B

    iput-object p1, p0, La/c7r0;->k:La/g7r0;

    iput-boolean p2, p0, La/c7r0;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/c7r0;->i:B

    .line 2
    .line 3
    iget-boolean v0, p0, La/c7r0;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/c7r0;->k:La/g7r0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/c7r0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/c7r0;-><init>(La/g7r0;ZLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/c7r0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/c7r0;-><init>(La/g7r0;ZLa/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/c7r0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/c7r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/c7r0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/c7r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/c7r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/c7r0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/c7r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c7r0;->i:B

    .line 4
    .line 5
    iget-boolean v2, v0, La/c7r0;->l:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, v0, La/c7r0;->k:La/g7r0;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v8, v0, La/c7r0;->j:Z

    .line 20
    .line 21
    if-eqz v8, :cond_1

    .line 22
    .line 23
    if-ne v8, v7, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, La/w6r0;

    .line 43
    .line 44
    iget-boolean v3, v3, La/w6r0;->w:Z

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v11, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    :goto_0
    move v11, v7

    .line 54
    :goto_1
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 55
    .line 56
    iget-object v8, v2, La/ocj;->a:La/p7m0;

    .line 57
    .line 58
    :cond_4
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-object v12, v2

    .line 66
    check-cast v12, La/w6r0;

    .line 67
    .line 68
    const/16 v31, 0x0

    .line 69
    .line 70
    const v32, 0x3fffff

    .line 71
    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v14, 0x0

    .line 75
    const/4 v15, 0x0

    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    const/16 v19, 0x0

    .line 83
    .line 84
    const/16 v20, 0x0

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const/16 v22, 0x0

    .line 89
    .line 90
    const/16 v23, 0x0

    .line 91
    .line 92
    const/16 v24, 0x0

    .line 93
    .line 94
    const/16 v25, 0x0

    .line 95
    .line 96
    const/16 v26, 0x0

    .line 97
    .line 98
    const/16 v27, 0x0

    .line 99
    .line 100
    const/16 v28, 0x0

    .line 101
    .line 102
    const/16 v29, 0x0

    .line 103
    .line 104
    const/16 v30, 0x0

    .line 105
    .line 106
    invoke-static/range {v12 .. v32}, La/w6r0;->a(La/w6r0;ZZLa/m7r0;La/h8l0;La/g8l0;La/v5l0;La/wcb;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZZLa/hn00;La/odt;La/odt;ZZZI)La/w6r0;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v8, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    iget-object v10, v5, La/g7r0;->t:La/zpu;

    .line 117
    .line 118
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, La/w6r0;

    .line 123
    .line 124
    iget-object v2, v2, La/w6r0;->l:Ljava/lang/Boolean;

    .line 125
    .line 126
    if-eqz v2, :cond_5

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    :goto_2
    move v13, v2

    .line 133
    goto :goto_3

    .line 134
    :cond_5
    iget-object v2, v5, La/g7r0;->s:La/pru;

    .line 135
    .line 136
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iget-boolean v2, v2, La/sff0;->J1:Z

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :goto_3
    iget-object v2, v10, La/zpu;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, La/xsu;

    .line 146
    .line 147
    iget-object v2, v2, La/xsu;->a:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, La/lef0;

    .line 150
    .line 151
    iget-object v2, v2, La/lef0;->a:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, La/m8l0;

    .line 154
    .line 155
    iget-object v2, v2, La/m8l0;->a:La/p7m0;

    .line 156
    .line 157
    new-instance v8, La/d2v;

    .line 158
    .line 159
    const/4 v9, 0x0

    .line 160
    move v12, v11

    .line 161
    invoke-direct/range {v8 .. v13}, La/d2v;-><init>(La/yje;La/zpu;ZZZ)V

    .line 162
    .line 163
    .line 164
    invoke-static {v2, v8}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    new-instance v3, La/b7r0;

    .line 169
    .line 170
    invoke-direct {v3, v5, v7}, La/b7r0;-><init>(La/g7r0;B)V

    .line 171
    .line 172
    .line 173
    iput-boolean v7, v0, La/c7r0;->j:Z

    .line 174
    .line 175
    invoke-virtual {v2, v3, v0}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v1, :cond_6

    .line 180
    .line 181
    move-object v3, v1

    .line 182
    goto :goto_5

    .line 183
    :cond_6
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    :goto_5
    return-object v3

    .line 186
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 187
    .line 188
    iget-boolean v8, v0, La/c7r0;->j:Z

    .line 189
    .line 190
    if-eqz v8, :cond_8

    .line 191
    .line 192
    if-ne v8, v7, :cond_7

    .line 193
    .line 194
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_9

    .line 198
    .line 199
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_a

    .line 203
    .line 204
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, La/w6r0;

    .line 212
    .line 213
    iget-boolean v3, v3, La/w6r0;->w:Z

    .line 214
    .line 215
    if-nez v3, :cond_a

    .line 216
    .line 217
    if-eqz v2, :cond_9

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_9
    move v2, v6

    .line 221
    goto :goto_7

    .line 222
    :cond_a
    :goto_6
    move v2, v7

    .line 223
    :goto_7
    iget-object v3, v5, La/i3t0;->i:La/ocj;

    .line 224
    .line 225
    iget-object v3, v3, La/ocj;->a:La/p7m0;

    .line 226
    .line 227
    :cond_b
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-object v8, v4

    .line 235
    check-cast v8, La/w6r0;

    .line 236
    .line 237
    const/16 v27, 0x0

    .line 238
    .line 239
    const v28, 0x3fffff

    .line 240
    .line 241
    .line 242
    const/4 v9, 0x0

    .line 243
    const/4 v10, 0x0

    .line 244
    const/4 v11, 0x0

    .line 245
    const/4 v12, 0x0

    .line 246
    const/4 v13, 0x0

    .line 247
    const/4 v14, 0x0

    .line 248
    const/4 v15, 0x0

    .line 249
    const/16 v16, 0x0

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    const/16 v18, 0x0

    .line 254
    .line 255
    const/16 v19, 0x0

    .line 256
    .line 257
    const/16 v20, 0x0

    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    const/16 v22, 0x0

    .line 262
    .line 263
    const/16 v23, 0x0

    .line 264
    .line 265
    const/16 v24, 0x0

    .line 266
    .line 267
    const/16 v25, 0x0

    .line 268
    .line 269
    const/16 v26, 0x0

    .line 270
    .line 271
    invoke-static/range {v8 .. v28}, La/w6r0;->a(La/w6r0;ZZLa/m7r0;La/h8l0;La/g8l0;La/v5l0;La/wcb;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZZLa/hn00;La/odt;La/odt;ZZZI)La/w6r0;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-virtual {v3, v4, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_b

    .line 280
    .line 281
    iget-object v3, v5, La/g7r0;->u:La/wdu;

    .line 282
    .line 283
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    check-cast v4, La/w6r0;

    .line 288
    .line 289
    iget-object v4, v4, La/w6r0;->l:Ljava/lang/Boolean;

    .line 290
    .line 291
    if-eqz v4, :cond_c

    .line 292
    .line 293
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    goto :goto_8

    .line 298
    :cond_c
    iget-object v4, v5, La/g7r0;->s:La/pru;

    .line 299
    .line 300
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    iget-boolean v4, v4, La/sff0;->J1:Z

    .line 305
    .line 306
    :goto_8
    invoke-static {v3, v2, v2, v4}, La/wdu;->y(La/wdu;ZZZ)La/utb;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    new-instance v3, La/b7r0;

    .line 311
    .line 312
    invoke-direct {v3, v5, v6}, La/b7r0;-><init>(La/g7r0;B)V

    .line 313
    .line 314
    .line 315
    iput-boolean v7, v0, La/c7r0;->j:Z

    .line 316
    .line 317
    invoke-virtual {v2, v3, v0}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    if-ne v0, v1, :cond_d

    .line 322
    .line 323
    move-object v3, v1

    .line 324
    goto :goto_a

    .line 325
    :cond_d
    :goto_9
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    :goto_a
    return-object v3

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
