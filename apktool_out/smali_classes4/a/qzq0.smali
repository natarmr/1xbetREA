.class public final La/qzq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/cyu;

.field public final synthetic d:La/hie0;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/cyu;La/hie0;Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/qzq0;->a:B

    iput-object p1, p0, La/qzq0;->b:La/kmq;

    iput-object p2, p0, La/qzq0;->c:La/cyu;

    iput-object p3, p0, La/qzq0;->d:La/hie0;

    iput-object p4, p0, La/qzq0;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/qzq0;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/qzq0;->e:Ljava/util/List;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    iget-object v6, v0, La/qzq0;->b:La/kmq;

    .line 13
    .line 14
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    iget-object v8, v0, La/qzq0;->c:La/cyu;

    .line 17
    .line 18
    const/high16 v9, -0x80000000

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x2

    .line 22
    iget-object v12, v0, La/qzq0;->d:La/hie0;

    .line 23
    .line 24
    const/4 v13, 0x0

    .line 25
    packed-switch v2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    instance-of v2, v1, La/uzq0;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    move-object v2, v1

    .line 33
    check-cast v2, La/uzq0;

    .line 34
    .line 35
    iget v14, v2, La/uzq0;->j:I

    .line 36
    .line 37
    and-int v15, v14, v9

    .line 38
    .line 39
    if-eqz v15, :cond_0

    .line 40
    .line 41
    sub-int/2addr v14, v9

    .line 42
    iput v14, v2, La/uzq0;->j:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v2, La/uzq0;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1}, La/uzq0;-><init>(La/qzq0;La/yje;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object v0, v2, La/uzq0;->i:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object v1, La/wne;->a:La/wne;

    .line 53
    .line 54
    iget v9, v2, La/uzq0;->j:I

    .line 55
    .line 56
    if-eqz v9, :cond_3

    .line 57
    .line 58
    if-eq v9, v10, :cond_2

    .line 59
    .line 60
    if-ne v9, v11, :cond_1

    .line 61
    .line 62
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_1
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_2
    iget-object v5, v2, La/uzq0;->n:Ljava/util/ArrayList;

    .line 73
    .line 74
    iget-object v6, v2, La/uzq0;->m:Ljava/util/List;

    .line 75
    .line 76
    iget-object v7, v2, La/uzq0;->l:La/kmq;

    .line 77
    .line 78
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    check-cast v0, La/j0g0;

    .line 82
    .line 83
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object/from16 v0, p1

    .line 90
    .line 91
    check-cast v0, Ljava/util/List;

    .line 92
    .line 93
    new-instance v7, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_4

    .line 111
    .line 112
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    check-cast v9, La/xah;

    .line 117
    .line 118
    iget-wide v14, v9, La/xah;->g:J

    .line 119
    .line 120
    invoke-static {v14, v15, v7}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    iget-boolean v5, v12, La/hie0;->a:Z

    .line 125
    .line 126
    iput-object v6, v2, La/uzq0;->l:La/kmq;

    .line 127
    .line 128
    iput-object v0, v2, La/uzq0;->m:Ljava/util/List;

    .line 129
    .line 130
    iput-object v7, v2, La/uzq0;->n:Ljava/util/ArrayList;

    .line 131
    .line 132
    iput v10, v2, La/uzq0;->j:I

    .line 133
    .line 134
    invoke-virtual {v8, v5, v7, v2}, La/cyu;->j(ZLjava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    if-ne v5, v1, :cond_5

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_5
    move-object/from16 v16, v6

    .line 142
    .line 143
    move-object v6, v0

    .line 144
    move-object v0, v5

    .line 145
    move-object v5, v7

    .line 146
    move-object/from16 v7, v16

    .line 147
    .line 148
    :goto_2
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    if-nez v9, :cond_6

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    iput-boolean v4, v12, La/hie0;->a:Z

    .line 156
    .line 157
    iget-object v0, v8, La/cyu;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/n660;

    .line 160
    .line 161
    invoke-virtual {v0, v5}, La/n660;->o(Ljava/util/List;)Ljava/util/ArrayList;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 166
    .line 167
    invoke-static {v6, v0, v3}, La/cyu;->R(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v13, v2, La/uzq0;->l:La/kmq;

    .line 172
    .line 173
    iput-object v13, v2, La/uzq0;->m:Ljava/util/List;

    .line 174
    .line 175
    iput-object v13, v2, La/uzq0;->n:Ljava/util/ArrayList;

    .line 176
    .line 177
    iput v11, v2, La/uzq0;->j:I

    .line 178
    .line 179
    invoke-interface {v7, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-ne v0, v1, :cond_7

    .line 184
    .line 185
    :goto_4
    move-object v13, v1

    .line 186
    goto :goto_6

    .line 187
    :cond_7
    :goto_5
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    :goto_6
    return-object v13

    .line 190
    :pswitch_0
    instance-of v2, v1, La/pzq0;

    .line 191
    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    move-object v2, v1

    .line 195
    check-cast v2, La/pzq0;

    .line 196
    .line 197
    iget v14, v2, La/pzq0;->j:I

    .line 198
    .line 199
    and-int v15, v14, v9

    .line 200
    .line 201
    if-eqz v15, :cond_8

    .line 202
    .line 203
    sub-int/2addr v14, v9

    .line 204
    iput v14, v2, La/pzq0;->j:I

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_8
    new-instance v2, La/pzq0;

    .line 208
    .line 209
    invoke-direct {v2, v0, v1}, La/pzq0;-><init>(La/qzq0;La/yje;)V

    .line 210
    .line 211
    .line 212
    :goto_7
    iget-object v0, v2, La/pzq0;->i:Ljava/lang/Object;

    .line 213
    .line 214
    sget-object v1, La/wne;->a:La/wne;

    .line 215
    .line 216
    iget v9, v2, La/pzq0;->j:I

    .line 217
    .line 218
    if-eqz v9, :cond_b

    .line 219
    .line 220
    if-eq v9, v10, :cond_a

    .line 221
    .line 222
    if-ne v9, v11, :cond_9

    .line 223
    .line 224
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_c

    .line 228
    .line 229
    :cond_9
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_d

    .line 233
    .line 234
    :cond_a
    iget-object v5, v2, La/pzq0;->n:Ljava/util/ArrayList;

    .line 235
    .line 236
    iget-object v6, v2, La/pzq0;->m:Ljava/util/List;

    .line 237
    .line 238
    iget-object v7, v2, La/pzq0;->l:La/kmq;

    .line 239
    .line 240
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    check-cast v0, La/j0g0;

    .line 244
    .line 245
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_b
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v0, p1

    .line 252
    .line 253
    check-cast v0, Ljava/util/List;

    .line 254
    .line 255
    new-instance v7, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-eqz v9, :cond_c

    .line 273
    .line 274
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    check-cast v9, La/xah;

    .line 279
    .line 280
    iget-wide v14, v9, La/xah;->g:J

    .line 281
    .line 282
    invoke-static {v14, v15, v7}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_c
    iget-boolean v5, v12, La/hie0;->a:Z

    .line 287
    .line 288
    iput-object v6, v2, La/pzq0;->l:La/kmq;

    .line 289
    .line 290
    iput-object v0, v2, La/pzq0;->m:Ljava/util/List;

    .line 291
    .line 292
    iput-object v7, v2, La/pzq0;->n:Ljava/util/ArrayList;

    .line 293
    .line 294
    iput v10, v2, La/pzq0;->j:I

    .line 295
    .line 296
    invoke-virtual {v8, v5, v7, v2}, La/cyu;->j(ZLjava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    if-ne v5, v1, :cond_d

    .line 301
    .line 302
    goto :goto_b

    .line 303
    :cond_d
    move-object/from16 v16, v6

    .line 304
    .line 305
    move-object v6, v0

    .line 306
    move-object v0, v5

    .line 307
    move-object v5, v7

    .line 308
    move-object/from16 v7, v16

    .line 309
    .line 310
    :goto_9
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    if-nez v9, :cond_e

    .line 315
    .line 316
    goto :goto_a

    .line 317
    :cond_e
    iput-boolean v4, v12, La/hie0;->a:Z

    .line 318
    .line 319
    iget-object v0, v8, La/cyu;->c:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, La/n660;

    .line 322
    .line 323
    invoke-virtual {v0, v5}, La/n660;->o(Ljava/util/List;)Ljava/util/ArrayList;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    :goto_a
    check-cast v0, Ljava/util/List;

    .line 328
    .line 329
    invoke-static {v6, v0, v3}, La/cyu;->R(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    iput-object v13, v2, La/pzq0;->l:La/kmq;

    .line 334
    .line 335
    iput-object v13, v2, La/pzq0;->m:Ljava/util/List;

    .line 336
    .line 337
    iput-object v13, v2, La/pzq0;->n:Ljava/util/ArrayList;

    .line 338
    .line 339
    iput v11, v2, La/pzq0;->j:I

    .line 340
    .line 341
    invoke-interface {v7, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    if-ne v0, v1, :cond_f

    .line 346
    .line 347
    :goto_b
    move-object v13, v1

    .line 348
    goto :goto_d

    .line 349
    :cond_f
    :goto_c
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    :goto_d
    return-object v13

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
