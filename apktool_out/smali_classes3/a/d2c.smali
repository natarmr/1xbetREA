.class public final La/d2c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:La/gmq;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/gmq;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 16
    iput-byte p5, p0, La/d2c;->a:B

    iput-object p1, p0, La/d2c;->c:La/gmq;

    iput-object p2, p0, La/d2c;->d:Ljava/lang/Object;

    iput-object p3, p0, La/d2c;->b:Ljava/lang/Object;

    iput-object p4, p0, La/d2c;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/p6d;Lorg/xplatform/favorites/impl/presentation/category/f;La/wcb;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/d2c;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/d2c;->c:La/gmq;

    .line 8
    .line 9
    iput-object p2, p0, La/d2c;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/d2c;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/d2c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/d2c;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/d2c;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/d2c;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/d2c;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/d2c;->c:La/gmq;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    const/high16 v9, -0x80000000

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    instance-of v2, v1, La/q1v;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, La/q1v;

    .line 30
    .line 31
    iget v11, v2, La/q1v;->j:I

    .line 32
    .line 33
    and-int v12, v11, v9

    .line 34
    .line 35
    if-eqz v12, :cond_0

    .line 36
    .line 37
    sub-int/2addr v11, v9

    .line 38
    iput v11, v2, La/q1v;->j:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v2, La/q1v;

    .line 42
    .line 43
    invoke-direct {v2, v0, v1}, La/q1v;-><init>(La/d2c;La/yje;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object v0, v2, La/q1v;->i:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object v1, La/wne;->a:La/wne;

    .line 49
    .line 50
    iget v9, v2, La/q1v;->j:I

    .line 51
    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    if-ne v9, v10, :cond_1

    .line 55
    .line 56
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    check-cast v6, La/p6d;

    .line 68
    .line 69
    new-instance v11, La/y38;

    .line 70
    .line 71
    move-object v15, v5

    .line 72
    check-cast v15, La/lie0;

    .line 73
    .line 74
    move-object v14, v4

    .line 75
    check-cast v14, La/hie0;

    .line 76
    .line 77
    move-object/from16 v16, v3

    .line 78
    .line 79
    check-cast v16, La/a6u;

    .line 80
    .line 81
    const/16 v12, 0x8

    .line 82
    .line 83
    move-object/from16 v13, p1

    .line 84
    .line 85
    invoke-direct/range {v11 .. v16}, La/y38;-><init>(BLa/kmq;La/hie0;La/lie0;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iput v10, v2, La/q1v;->j:I

    .line 89
    .line 90
    invoke-virtual {v6, v11, v2}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v1, :cond_3

    .line 95
    .line 96
    move-object v7, v1

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    :goto_1
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_2
    return-object v7

    .line 101
    :pswitch_0
    instance-of v2, v1, La/y0v;

    .line 102
    .line 103
    if-eqz v2, :cond_4

    .line 104
    .line 105
    move-object v2, v1

    .line 106
    check-cast v2, La/y0v;

    .line 107
    .line 108
    iget v11, v2, La/y0v;->j:I

    .line 109
    .line 110
    and-int v12, v11, v9

    .line 111
    .line 112
    if-eqz v12, :cond_4

    .line 113
    .line 114
    sub-int/2addr v11, v9

    .line 115
    iput v11, v2, La/y0v;->j:I

    .line 116
    .line 117
    :goto_3
    move-object v9, v2

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    new-instance v2, La/y0v;

    .line 120
    .line 121
    invoke-direct {v2, v0, v1}, La/y0v;-><init>(La/d2c;La/yje;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :goto_4
    iget-object v0, v9, La/y0v;->i:Ljava/lang/Object;

    .line 126
    .line 127
    sget-object v11, La/wne;->a:La/wne;

    .line 128
    .line 129
    iget v1, v9, La/y0v;->j:I

    .line 130
    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    if-ne v1, v10, :cond_5

    .line 134
    .line 135
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_5
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_6
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    check-cast v6, La/p6d;

    .line 147
    .line 148
    new-instance v0, La/y38;

    .line 149
    .line 150
    check-cast v5, La/lie0;

    .line 151
    .line 152
    check-cast v4, La/hie0;

    .line 153
    .line 154
    check-cast v3, La/f7u;

    .line 155
    .line 156
    const/4 v1, 0x7

    .line 157
    move-object v2, v5

    .line 158
    move-object v5, v3

    .line 159
    move-object v3, v4

    .line 160
    move-object v4, v2

    .line 161
    move-object/from16 v2, p1

    .line 162
    .line 163
    invoke-direct/range {v0 .. v5}, La/y38;-><init>(BLa/kmq;La/hie0;La/lie0;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iput v10, v9, La/y0v;->j:I

    .line 167
    .line 168
    invoke-virtual {v6, v0, v9}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v11, :cond_7

    .line 173
    .line 174
    move-object v7, v11

    .line 175
    goto :goto_6

    .line 176
    :cond_7
    :goto_5
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    :goto_6
    return-object v7

    .line 179
    :pswitch_1
    instance-of v2, v1, La/tep;

    .line 180
    .line 181
    if-eqz v2, :cond_8

    .line 182
    .line 183
    move-object v2, v1

    .line 184
    check-cast v2, La/tep;

    .line 185
    .line 186
    iget v11, v2, La/tep;->j:I

    .line 187
    .line 188
    and-int v12, v11, v9

    .line 189
    .line 190
    if-eqz v12, :cond_8

    .line 191
    .line 192
    sub-int/2addr v11, v9

    .line 193
    iput v11, v2, La/tep;->j:I

    .line 194
    .line 195
    :goto_7
    move-object v9, v2

    .line 196
    goto :goto_8

    .line 197
    :cond_8
    new-instance v2, La/tep;

    .line 198
    .line 199
    invoke-direct {v2, v0, v1}, La/tep;-><init>(La/d2c;La/yje;)V

    .line 200
    .line 201
    .line 202
    goto :goto_7

    .line 203
    :goto_8
    iget-object v0, v9, La/tep;->i:Ljava/lang/Object;

    .line 204
    .line 205
    sget-object v11, La/wne;->a:La/wne;

    .line 206
    .line 207
    iget v1, v9, La/tep;->j:I

    .line 208
    .line 209
    if-eqz v1, :cond_a

    .line 210
    .line 211
    if-ne v1, v10, :cond_9

    .line 212
    .line 213
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_9
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_a
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    check-cast v6, La/p6d;

    .line 225
    .line 226
    new-instance v0, La/y38;

    .line 227
    .line 228
    move-object v2, v5

    .line 229
    check-cast v2, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 230
    .line 231
    check-cast v3, La/wcb;

    .line 232
    .line 233
    check-cast v4, Ljava/util/List;

    .line 234
    .line 235
    const/4 v5, 0x6

    .line 236
    move-object/from16 v1, p1

    .line 237
    .line 238
    invoke-direct/range {v0 .. v5}, La/y38;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 239
    .line 240
    .line 241
    iput v10, v9, La/tep;->j:I

    .line 242
    .line 243
    invoke-virtual {v6, v0, v9}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-ne v0, v11, :cond_b

    .line 248
    .line 249
    move-object v7, v11

    .line 250
    goto :goto_a

    .line 251
    :cond_b
    :goto_9
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    :goto_a
    return-object v7

    .line 254
    :pswitch_2
    instance-of v2, v1, La/b2c;

    .line 255
    .line 256
    if-eqz v2, :cond_c

    .line 257
    .line 258
    move-object v2, v1

    .line 259
    check-cast v2, La/b2c;

    .line 260
    .line 261
    iget v11, v2, La/b2c;->j:I

    .line 262
    .line 263
    and-int v12, v11, v9

    .line 264
    .line 265
    if-eqz v12, :cond_c

    .line 266
    .line 267
    sub-int/2addr v11, v9

    .line 268
    iput v11, v2, La/b2c;->j:I

    .line 269
    .line 270
    :goto_b
    move-object v9, v2

    .line 271
    goto :goto_c

    .line 272
    :cond_c
    new-instance v2, La/b2c;

    .line 273
    .line 274
    invoke-direct {v2, v0, v1}, La/b2c;-><init>(La/d2c;La/yje;)V

    .line 275
    .line 276
    .line 277
    goto :goto_b

    .line 278
    :goto_c
    iget-object v0, v9, La/b2c;->i:Ljava/lang/Object;

    .line 279
    .line 280
    sget-object v11, La/wne;->a:La/wne;

    .line 281
    .line 282
    iget v1, v9, La/b2c;->j:I

    .line 283
    .line 284
    if-eqz v1, :cond_e

    .line 285
    .line 286
    if-ne v1, v10, :cond_d

    .line 287
    .line 288
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    goto :goto_d

    .line 292
    :cond_d
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    goto :goto_e

    .line 296
    :cond_e
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    check-cast v6, La/qnq;

    .line 300
    .line 301
    new-instance v0, La/y38;

    .line 302
    .line 303
    move-object v2, v5

    .line 304
    check-cast v2, La/h03;

    .line 305
    .line 306
    check-cast v4, Ljava/util/List;

    .line 307
    .line 308
    check-cast v3, Ljava/util/List;

    .line 309
    .line 310
    const/4 v5, 0x3

    .line 311
    move-object v1, v4

    .line 312
    move-object v4, v3

    .line 313
    move-object v3, v1

    .line 314
    move-object/from16 v1, p1

    .line 315
    .line 316
    invoke-direct/range {v0 .. v5}, La/y38;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 317
    .line 318
    .line 319
    iput v10, v9, La/b2c;->j:I

    .line 320
    .line 321
    invoke-virtual {v6, v0, v9}, La/qnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    if-ne v0, v11, :cond_f

    .line 326
    .line 327
    move-object v7, v11

    .line 328
    goto :goto_e

    .line 329
    :cond_f
    :goto_d
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    :goto_e
    return-object v7

    .line 332
    nop

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
