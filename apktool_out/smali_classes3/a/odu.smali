.class public final La/odu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Z

.field public final synthetic p:Z


# direct methods
.method public synthetic constructor <init>(La/wdu;ZLjava/lang/String;Ljava/lang/String;ZZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/odu;->i:B

    iput-object p1, p0, La/odu;->k:Ljava/lang/Object;

    iput-boolean p2, p0, La/odu;->l:Z

    iput-object p3, p0, La/odu;->m:Ljava/lang/Object;

    iput-object p4, p0, La/odu;->n:Ljava/lang/Object;

    iput-boolean p5, p0, La/odu;->o:Z

    iput-boolean p6, p0, La/odu;->p:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/daf;ZLjava/util/List;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/odu;->i:B

    .line 2
    iput-boolean p1, p0, La/odu;->l:Z

    iput-object p2, p0, La/odu;->m:Ljava/lang/Object;

    iput-boolean p3, p0, La/odu;->o:Z

    iput-object p4, p0, La/odu;->n:Ljava/lang/Object;

    iput-boolean p5, p0, La/odu;->p:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    iget-byte v0, p0, La/odu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/odu;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/odu;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/odu;

    .line 11
    .line 12
    move-object v5, v2

    .line 13
    check-cast v5, La/daf;

    .line 14
    .line 15
    move-object v7, v1

    .line 16
    check-cast v7, Ljava/util/List;

    .line 17
    .line 18
    iget-boolean v8, p0, La/odu;->p:Z

    .line 19
    .line 20
    iget-boolean v4, p0, La/odu;->l:Z

    .line 21
    .line 22
    iget-boolean v6, p0, La/odu;->o:Z

    .line 23
    .line 24
    move-object v9, p2

    .line 25
    invoke-direct/range {v3 .. v9}, La/odu;-><init>(ZLa/daf;ZLjava/util/List;ZLa/yje;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v3, La/odu;->k:Ljava/lang/Object;

    .line 29
    .line 30
    return-object v3

    .line 31
    :pswitch_0
    move-object v11, p2

    .line 32
    new-instance v4, La/odu;

    .line 33
    .line 34
    iget-object p1, p0, La/odu;->k:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    check-cast v5, La/wdu;

    .line 38
    .line 39
    move-object v7, v2

    .line 40
    check-cast v7, Ljava/lang/String;

    .line 41
    .line 42
    move-object v8, v1

    .line 43
    check-cast v8, Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v10, p0, La/odu;->p:Z

    .line 46
    .line 47
    const/4 v12, 0x1

    .line 48
    iget-boolean v6, p0, La/odu;->l:Z

    .line 49
    .line 50
    iget-boolean v9, p0, La/odu;->o:Z

    .line 51
    .line 52
    invoke-direct/range {v4 .. v12}, La/odu;-><init>(La/wdu;ZLjava/lang/String;Ljava/lang/String;ZZLa/yje;B)V

    .line 53
    .line 54
    .line 55
    return-object v4

    .line 56
    :pswitch_1
    move-object v11, p2

    .line 57
    new-instance v4, La/odu;

    .line 58
    .line 59
    iget-object p1, p0, La/odu;->k:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v5, p1

    .line 62
    check-cast v5, La/wdu;

    .line 63
    .line 64
    move-object v7, v2

    .line 65
    check-cast v7, Ljava/lang/String;

    .line 66
    .line 67
    move-object v8, v1

    .line 68
    check-cast v8, Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v10, p0, La/odu;->p:Z

    .line 71
    .line 72
    const/4 v12, 0x0

    .line 73
    iget-boolean v6, p0, La/odu;->l:Z

    .line 74
    .line 75
    iget-boolean v9, p0, La/odu;->o:Z

    .line 76
    .line 77
    invoke-direct/range {v4 .. v12}, La/odu;-><init>(La/wdu;ZLjava/lang/String;Ljava/lang/String;ZZLa/yje;B)V

    .line 78
    .line 79
    .line 80
    return-object v4

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/odu;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/odu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/odu;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/odu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/odu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/odu;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/odu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/odu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/odu;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/odu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/odu;->i:B

    .line 4
    .line 5
    iget-object v1, v6, La/odu;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v3, v6, La/odu;->m:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v11, v3

    .line 17
    check-cast v11, La/daf;

    .line 18
    .line 19
    iget-object v0, v6, La/odu;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/kmq;

    .line 22
    .line 23
    sget-object v3, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-boolean v7, v6, La/odu;->j:Z

    .line 26
    .line 27
    if-eqz v7, :cond_1

    .line 28
    .line 29
    if-ne v7, v5, :cond_0

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-boolean v2, v6, La/odu;->o:Z

    .line 45
    .line 46
    iget-boolean v7, v6, La/odu;->l:Z

    .line 47
    .line 48
    if-eqz v7, :cond_3

    .line 49
    .line 50
    iget-object v8, v11, La/daf;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v8, La/spc;

    .line 53
    .line 54
    iget-object v8, v8, La/spc;->a:La/h0q0;

    .line 55
    .line 56
    iget-object v8, v8, La/h0q0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v8, La/s5r0;

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    iget-object v8, v8, La/s5r0;->a:La/ir30;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v8, v8, La/s5r0;->b:La/ir30;

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v8}, La/ir30;->a()V

    .line 68
    .line 69
    .line 70
    :cond_3
    iget-object v8, v11, La/daf;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v8, La/h0q0;

    .line 73
    .line 74
    iget-object v8, v8, La/h0q0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, La/s5r0;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    iget-object v8, v8, La/s5r0;->a:La/ir30;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    iget-object v8, v8, La/s5r0;->b:La/ir30;

    .line 84
    .line 85
    :goto_1
    invoke-virtual {v8}, La/ir30;->c()La/p6d;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    new-instance v9, La/i89;

    .line 90
    .line 91
    const/16 v15, 0x16

    .line 92
    .line 93
    invoke-direct {v9, v8, v15}, La/i89;-><init>(La/gmq;B)V

    .line 94
    .line 95
    .line 96
    new-instance v8, La/r0v;

    .line 97
    .line 98
    const/4 v10, 0x0

    .line 99
    invoke-direct {v8, v11, v2, v4, v10}, La/r0v;-><init>(La/daf;ZLa/yje;B)V

    .line 100
    .line 101
    .line 102
    new-instance v12, La/xpp;

    .line 103
    .line 104
    const/16 v13, 0xb

    .line 105
    .line 106
    invoke-direct {v12, v11, v2, v4, v13}, La/xpp;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v9, v8, v12}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v13, v1

    .line 114
    check-cast v13, Ljava/util/List;

    .line 115
    .line 116
    new-instance v1, La/hie0;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-boolean v7, v1, La/hie0;->a:Z

    .line 122
    .line 123
    new-instance v8, La/hie0;

    .line 124
    .line 125
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    iget-boolean v7, v6, La/odu;->p:Z

    .line 129
    .line 130
    iput-boolean v7, v8, La/hie0;->a:Z

    .line 131
    .line 132
    iget-boolean v12, v6, La/odu;->o:Z

    .line 133
    .line 134
    if-eqz v12, :cond_5

    .line 135
    .line 136
    const-wide/16 v16, 0x8

    .line 137
    .line 138
    :goto_2
    move-wide/from16 v20, v16

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    const-wide/16 v16, 0x1e

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :goto_3
    new-instance v7, La/al6;

    .line 145
    .line 146
    const/4 v14, 0x0

    .line 147
    move/from16 v16, v10

    .line 148
    .line 149
    move-wide/from16 v9, v20

    .line 150
    .line 151
    invoke-direct/range {v7 .. v14}, La/al6;-><init>(La/hie0;JLa/daf;ZLjava/util/List;La/yje;)V

    .line 152
    .line 153
    .line 154
    new-instance v8, La/vsg0;

    .line 155
    .line 156
    invoke-direct {v8, v7}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    new-instance v7, La/qqu;

    .line 160
    .line 161
    const/16 v9, 0xa

    .line 162
    .line 163
    invoke-direct {v7, v8, v1, v9}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 164
    .line 165
    .line 166
    new-instance v8, La/lqu;

    .line 167
    .line 168
    const/16 v9, 0xd

    .line 169
    .line 170
    invoke-direct {v8, v1, v9}, La/lqu;-><init>(La/hie0;B)V

    .line 171
    .line 172
    .line 173
    new-instance v1, La/r0v;

    .line 174
    .line 175
    invoke-direct {v1, v11, v12, v4, v5}, La/r0v;-><init>(La/daf;ZLa/yje;B)V

    .line 176
    .line 177
    .line 178
    new-instance v9, La/x9;

    .line 179
    .line 180
    const/16 v10, 0x18

    .line 181
    .line 182
    invoke-direct {v9, v11, v12, v10}, La/x9;-><init>(Ljava/lang/Object;ZB)V

    .line 183
    .line 184
    .line 185
    const/16 v25, 0x18

    .line 186
    .line 187
    const/16 v23, 0x0

    .line 188
    .line 189
    move-object/from16 v22, v1

    .line 190
    .line 191
    move-object/from16 v18, v7

    .line 192
    .line 193
    move-object/from16 v19, v8

    .line 194
    .line 195
    move-object/from16 v24, v9

    .line 196
    .line 197
    invoke-static/range {v18 .. v25}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    new-instance v7, La/i89;

    .line 202
    .line 203
    invoke-direct {v7, v1, v15}, La/i89;-><init>(La/gmq;B)V

    .line 204
    .line 205
    .line 206
    const/4 v1, 0x2

    .line 207
    new-array v1, v1, [La/gmq;

    .line 208
    .line 209
    aput-object v2, v1, v16

    .line 210
    .line 211
    aput-object v7, v1, v5

    .line 212
    .line 213
    invoke-static {v1}, La/aoq;->b([La/gmq;)La/ltb;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    new-instance v2, La/sot;

    .line 218
    .line 219
    const/16 v7, 0xe

    .line 220
    .line 221
    invoke-direct {v2, v4, v11, v7}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 222
    .line 223
    .line 224
    invoke-static {v1, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    new-instance v2, La/lsa;

    .line 229
    .line 230
    const/4 v7, 0x5

    .line 231
    invoke-direct {v2, v1, v7}, La/lsa;-><init>(La/utb;B)V

    .line 232
    .line 233
    .line 234
    iput-object v4, v6, La/odu;->k:Ljava/lang/Object;

    .line 235
    .line 236
    iput-boolean v5, v6, La/odu;->j:Z

    .line 237
    .line 238
    invoke-static {v0, v2, v6}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-ne v0, v3, :cond_6

    .line 243
    .line 244
    move-object v4, v3

    .line 245
    goto :goto_5

    .line 246
    :cond_6
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    :goto_5
    return-object v4

    .line 249
    :pswitch_0
    sget-object v7, La/wne;->a:La/wne;

    .line 250
    .line 251
    iget-boolean v0, v6, La/odu;->j:Z

    .line 252
    .line 253
    if-eqz v0, :cond_8

    .line 254
    .line 255
    if-ne v0, v5, :cond_7

    .line 256
    .line 257
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    move-object/from16 v0, p1

    .line 261
    .line 262
    check-cast v0, La/j0g0;

    .line 263
    .line 264
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object v0, v6, La/odu;->k:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, La/wdu;

    .line 277
    .line 278
    move-object v2, v3

    .line 279
    check-cast v2, Ljava/lang/String;

    .line 280
    .line 281
    move-object v3, v1

    .line 282
    check-cast v3, Ljava/lang/String;

    .line 283
    .line 284
    iput-boolean v5, v6, La/odu;->j:Z

    .line 285
    .line 286
    iget-boolean v1, v6, La/odu;->l:Z

    .line 287
    .line 288
    iget-boolean v4, v6, La/odu;->o:Z

    .line 289
    .line 290
    iget-boolean v5, v6, La/odu;->p:Z

    .line 291
    .line 292
    invoke-virtual/range {v0 .. v6}, La/wdu;->C(ZLjava/lang/String;Ljava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-ne v0, v7, :cond_9

    .line 297
    .line 298
    move-object v4, v7

    .line 299
    goto :goto_7

    .line 300
    :cond_9
    :goto_6
    new-instance v4, La/j0g0;

    .line 301
    .line 302
    invoke-direct {v4, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :goto_7
    return-object v4

    .line 306
    :pswitch_1
    sget-object v7, La/wne;->a:La/wne;

    .line 307
    .line 308
    iget-boolean v0, v6, La/odu;->j:Z

    .line 309
    .line 310
    if-eqz v0, :cond_b

    .line 311
    .line 312
    if-ne v0, v5, :cond_a

    .line 313
    .line 314
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    move-object/from16 v0, p1

    .line 318
    .line 319
    check-cast v0, La/j0g0;

    .line 320
    .line 321
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    iget-object v0, v6, La/odu;->k:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, La/wdu;

    .line 334
    .line 335
    move-object v2, v3

    .line 336
    check-cast v2, Ljava/lang/String;

    .line 337
    .line 338
    move-object v3, v1

    .line 339
    check-cast v3, Ljava/lang/String;

    .line 340
    .line 341
    iput-boolean v5, v6, La/odu;->j:Z

    .line 342
    .line 343
    iget-boolean v1, v6, La/odu;->l:Z

    .line 344
    .line 345
    iget-boolean v4, v6, La/odu;->o:Z

    .line 346
    .line 347
    iget-boolean v5, v6, La/odu;->p:Z

    .line 348
    .line 349
    invoke-virtual/range {v0 .. v6}, La/wdu;->E(ZLjava/lang/String;Ljava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    if-ne v0, v7, :cond_c

    .line 354
    .line 355
    move-object v4, v7

    .line 356
    goto :goto_9

    .line 357
    :cond_c
    :goto_8
    new-instance v4, La/j0g0;

    .line 358
    .line 359
    invoke-direct {v4, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :goto_9
    return-object v4

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
