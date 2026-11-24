.class public final La/r4j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/io/Serializable;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/agk0;Lkotlin/Pair;La/agk0;ILa/pz40;La/t33;La/t33;La/pz40;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/r4j;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/r4j;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/r4j;->m:Ljava/io/Serializable;

    .line 7
    .line 8
    iput-object p3, p0, La/r4j;->n:Ljava/lang/Object;

    .line 9
    .line 10
    iput p4, p0, La/r4j;->k:I

    .line 11
    .line 12
    iput-object p5, p0, La/r4j;->o:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, La/r4j;->p:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p7, p0, La/r4j;->q:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p8, p0, La/r4j;->r:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(La/hie0;La/cr;Ljava/util/Set;Ljava/lang/String;ILkotlin/jvm/functions/Function0;La/bmh;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/r4j;->i:B

    .line 25
    iput-object p1, p0, La/r4j;->m:Ljava/io/Serializable;

    iput-object p2, p0, La/r4j;->n:Ljava/lang/Object;

    iput-object p3, p0, La/r4j;->o:Ljava/lang/Object;

    iput-object p4, p0, La/r4j;->p:Ljava/lang/Object;

    iput p5, p0, La/r4j;->k:I

    iput-object p6, p0, La/r4j;->q:Ljava/lang/Object;

    iput-object p7, p0, La/r4j;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r4j;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/r4j;->r:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/r4j;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/r4j;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/r4j;->o:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/r4j;->n:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/r4j;->m:Ljava/io/Serializable;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v8, La/r4j;

    .line 21
    .line 22
    iget-object v1, v0, La/r4j;->l:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v9, v1

    .line 25
    check-cast v9, La/agk0;

    .line 26
    .line 27
    move-object v10, v7

    .line 28
    check-cast v10, Lkotlin/Pair;

    .line 29
    .line 30
    move-object v11, v6

    .line 31
    check-cast v11, La/agk0;

    .line 32
    .line 33
    move-object v13, v5

    .line 34
    check-cast v13, La/pz40;

    .line 35
    .line 36
    move-object v14, v4

    .line 37
    check-cast v14, La/t33;

    .line 38
    .line 39
    move-object v15, v3

    .line 40
    check-cast v15, La/t33;

    .line 41
    .line 42
    move-object/from16 v16, v2

    .line 43
    .line 44
    check-cast v16, La/pz40;

    .line 45
    .line 46
    iget v12, v0, La/r4j;->k:I

    .line 47
    .line 48
    move-object/from16 v17, p2

    .line 49
    .line 50
    invoke-direct/range {v8 .. v17}, La/r4j;-><init>(La/agk0;Lkotlin/Pair;La/agk0;ILa/pz40;La/t33;La/t33;La/pz40;La/yje;)V

    .line 51
    .line 52
    .line 53
    return-object v8

    .line 54
    :pswitch_0
    new-instance v9, La/r4j;

    .line 55
    .line 56
    move-object v10, v7

    .line 57
    check-cast v10, La/hie0;

    .line 58
    .line 59
    move-object v11, v6

    .line 60
    check-cast v11, La/cr;

    .line 61
    .line 62
    move-object v12, v5

    .line 63
    check-cast v12, Ljava/util/Set;

    .line 64
    .line 65
    move-object v13, v4

    .line 66
    check-cast v13, Ljava/lang/String;

    .line 67
    .line 68
    move-object v15, v3

    .line 69
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 70
    .line 71
    move-object/from16 v16, v2

    .line 72
    .line 73
    check-cast v16, La/bmh;

    .line 74
    .line 75
    iget v14, v0, La/r4j;->k:I

    .line 76
    .line 77
    move-object/from16 v17, p2

    .line 78
    .line 79
    invoke-direct/range {v9 .. v17}, La/r4j;-><init>(La/hie0;La/cr;Ljava/util/Set;Ljava/lang/String;ILkotlin/jvm/functions/Function0;La/bmh;La/yje;)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v0, p1

    .line 83
    .line 84
    iput-object v0, v9, La/r4j;->l:Ljava/lang/Object;

    .line 85
    .line 86
    return-object v9

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r4j;->i:B

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
    invoke-virtual {p0, p1, p2}, La/r4j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r4j;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r4j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/r4j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/r4j;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/r4j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r4j;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/r4j;->r:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/r4j;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/r4j;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/r4j;->o:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    iget-object v7, v0, La/r4j;->m:Ljava/io/Serializable;

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x2

    .line 19
    iget-object v10, v0, La/r4j;->n:Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v10, La/agk0;

    .line 26
    .line 27
    iget-object v1, v0, La/r4j;->l:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, La/agk0;

    .line 30
    .line 31
    check-cast v7, Lkotlin/Pair;

    .line 32
    .line 33
    iget-object v12, v7, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v7, v7, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v13, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget-byte v14, v0, La/r4j;->j:B

    .line 40
    .line 41
    if-eqz v14, :cond_2

    .line 42
    .line 43
    if-eq v14, v8, :cond_1

    .line 44
    .line 45
    if-ne v14, v9, :cond_0

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_2

    .line 51
    .line 52
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, La/agk0;->l()F

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    move-object v14, v7

    .line 69
    check-cast v14, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result v14

    .line 75
    cmpg-float v6, v6, v14

    .line 76
    .line 77
    if-nez v6, :cond_4

    .line 78
    .line 79
    invoke-virtual {v10}, La/agk0;->l()F

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    move-object v14, v12

    .line 84
    check-cast v14, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    cmpg-float v6, v6, v14

    .line 91
    .line 92
    if-nez v6, :cond_3

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iget v6, v0, La/r4j;->k:I

    .line 96
    .line 97
    if-nez v6, :cond_7

    .line 98
    .line 99
    check-cast v5, La/pz40;

    .line 100
    .line 101
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, La/q9v;

    .line 106
    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    iget-object v5, v5, La/q9v;->a:La/s9v;

    .line 110
    .line 111
    iget v5, v5, La/s9v;->a:I

    .line 112
    .line 113
    const/16 v6, 0x14

    .line 114
    .line 115
    if-ne v5, v6, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move-object v5, v7

    .line 119
    check-cast v5, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-virtual {v1, v5}, La/agk0;->m(F)V

    .line 126
    .line 127
    .line 128
    move-object v1, v12

    .line 129
    check-cast v1, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {v10, v1}, La/agk0;->m(F)V

    .line 136
    .line 137
    .line 138
    check-cast v4, La/t33;

    .line 139
    .line 140
    iput-byte v8, v0, La/r4j;->j:B

    .line 141
    .line 142
    invoke-virtual {v4, v0, v7}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    if-ne v1, v13, :cond_5

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    :goto_0
    check-cast v3, La/t33;

    .line 150
    .line 151
    iput-byte v9, v0, La/r4j;->j:B

    .line 152
    .line 153
    invoke-virtual {v3, v0, v12}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-ne v0, v13, :cond_6

    .line 158
    .line 159
    :goto_1
    move-object v11, v13

    .line 160
    goto :goto_4

    .line 161
    :cond_6
    :goto_2
    check-cast v2, La/pz40;

    .line 162
    .line 163
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 168
    .line 169
    invoke-interface {v0, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    :cond_7
    :goto_3
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_4
    return-object v11

    .line 175
    :pswitch_0
    check-cast v7, La/hie0;

    .line 176
    .line 177
    move-object v1, v10

    .line 178
    check-cast v1, La/cr;

    .line 179
    .line 180
    iget-object v12, v0, La/r4j;->l:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v12, La/vne;

    .line 183
    .line 184
    sget-object v13, La/wne;->a:La/wne;

    .line 185
    .line 186
    iget-byte v14, v0, La/r4j;->j:B

    .line 187
    .line 188
    if-eqz v14, :cond_b

    .line 189
    .line 190
    if-eq v14, v8, :cond_a

    .line 191
    .line 192
    if-ne v14, v9, :cond_9

    .line 193
    .line 194
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v19, v7

    .line 198
    .line 199
    move-object v7, v13

    .line 200
    :cond_8
    move-object/from16 v20, v12

    .line 201
    .line 202
    goto/16 :goto_9

    .line 203
    .line 204
    :cond_9
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_a

    .line 208
    .line 209
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    move-object/from16 v19, v7

    .line 213
    .line 214
    move-object v7, v13

    .line 215
    goto/16 :goto_7

    .line 216
    .line 217
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    move-object/from16 v20, v12

    .line 221
    .line 222
    :goto_5
    iget-boolean v6, v7, La/hie0;->a:Z

    .line 223
    .line 224
    if-nez v6, :cond_10

    .line 225
    .line 226
    invoke-static/range {v20 .. v20}, La/d5c;->R(La/vne;)Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_10

    .line 231
    .line 232
    iget-object v6, v1, La/cr;->i:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v6, La/jvq;

    .line 235
    .line 236
    iget-object v6, v6, La/jvq;->b:Ljava/lang/ref/WeakReference;

    .line 237
    .line 238
    if-eqz v6, :cond_c

    .line 239
    .line 240
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    check-cast v6, La/kxq;

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_c
    move-object v6, v11

    .line 248
    :goto_6
    iget-object v12, v1, La/cr;->l:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v12, La/iqt;

    .line 251
    .line 252
    iget-object v12, v12, La/iqt;->a:La/gst0;

    .line 253
    .line 254
    invoke-virtual {v12}, La/gst0;->a()Z

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    if-eqz v12, :cond_f

    .line 259
    .line 260
    instance-of v12, v6, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 261
    .line 262
    if-eqz v12, :cond_d

    .line 263
    .line 264
    move-object v12, v5

    .line 265
    check-cast v12, Ljava/util/Set;

    .line 266
    .line 267
    move-object v14, v6

    .line 268
    check-cast v14, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 269
    .line 270
    invoke-virtual {v14}, La/kxq;->r()La/v1r;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-static {v12, v6}, La/piz;->B(Ljava/util/Set;Landroidx/fragment/app/e;)Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_d

    .line 279
    .line 280
    sget-object v6, La/tvk;->a:La/rwj;

    .line 281
    .line 282
    sget-object v6, La/ys10;->a:La/vs10;

    .line 283
    .line 284
    invoke-virtual {v6}, La/vs10;->x()La/vs10;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    new-instance v12, La/q4j;

    .line 289
    .line 290
    move-object v15, v13

    .line 291
    move-object v13, v10

    .line 292
    check-cast v13, La/cr;

    .line 293
    .line 294
    move-object/from16 v16, v15

    .line 295
    .line 296
    move-object v15, v4

    .line 297
    check-cast v15, Ljava/lang/String;

    .line 298
    .line 299
    move-object/from16 v17, v3

    .line 300
    .line 301
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 302
    .line 303
    move-object/from16 v18, v2

    .line 304
    .line 305
    check-cast v18, La/bmh;

    .line 306
    .line 307
    const/16 v21, 0x0

    .line 308
    .line 309
    iget v11, v0, La/r4j;->k:I

    .line 310
    .line 311
    move-object/from16 v19, v7

    .line 312
    .line 313
    move-object/from16 v7, v16

    .line 314
    .line 315
    move/from16 v16, v11

    .line 316
    .line 317
    invoke-direct/range {v12 .. v21}, La/q4j;-><init>(La/cr;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;Ljava/lang/String;ILkotlin/jvm/functions/Function0;La/bmh;La/hie0;La/vne;La/yje;)V

    .line 318
    .line 319
    .line 320
    move-object v11, v12

    .line 321
    move-object/from16 v12, v20

    .line 322
    .line 323
    iput-object v12, v0, La/r4j;->l:Ljava/lang/Object;

    .line 324
    .line 325
    iput-byte v8, v0, La/r4j;->j:B

    .line 326
    .line 327
    invoke-static {v6, v11, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    if-ne v6, v7, :cond_e

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_d
    move-object/from16 v19, v7

    .line 335
    .line 336
    move-object v7, v13

    .line 337
    move-object/from16 v12, v20

    .line 338
    .line 339
    :cond_e
    :goto_7
    iput-object v12, v0, La/r4j;->l:Ljava/lang/Object;

    .line 340
    .line 341
    iput-byte v9, v0, La/r4j;->j:B

    .line 342
    .line 343
    const-wide/16 v13, 0x1388

    .line 344
    .line 345
    invoke-static {v13, v14, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    if-ne v6, v7, :cond_8

    .line 350
    .line 351
    :goto_8
    move-object v11, v7

    .line 352
    goto :goto_a

    .line 353
    :goto_9
    move-object v13, v7

    .line 354
    move-object/from16 v7, v19

    .line 355
    .line 356
    const/4 v11, 0x0

    .line 357
    goto/16 :goto_5

    .line 358
    .line 359
    :cond_f
    move-object/from16 v19, v7

    .line 360
    .line 361
    move-object v6, v11

    .line 362
    move-object v7, v13

    .line 363
    move-object/from16 v12, v20

    .line 364
    .line 365
    invoke-static {v12, v6}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 366
    .line 367
    .line 368
    move-object/from16 v7, v19

    .line 369
    .line 370
    goto/16 :goto_5

    .line 371
    .line 372
    :cond_10
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    :goto_a
    return-object v11

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
