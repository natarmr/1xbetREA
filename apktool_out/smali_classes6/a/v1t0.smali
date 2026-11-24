.class public final La/v1t0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Throwable;

.field public j:B

.field public final synthetic k:La/o0x;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:La/w6k;

.field public final synthetic n:F

.field public final synthetic o:Ljava/util/LinkedHashMap;

.field public final synthetic p:I

.field public final synthetic q:La/kie0;

.field public final synthetic r:La/a4x;

.field public final synthetic s:La/pz40;

.field public final synthetic t:La/pz40;


# direct methods
.method public constructor <init>(La/o0x;Landroid/content/Context;La/w6k;FLjava/util/LinkedHashMap;ILa/kie0;La/a4x;La/pz40;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v1t0;->k:La/o0x;

    .line 2
    .line 3
    iput-object p2, p0, La/v1t0;->l:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, La/v1t0;->m:La/w6k;

    .line 6
    .line 7
    iput p4, p0, La/v1t0;->n:F

    .line 8
    .line 9
    iput-object p5, p0, La/v1t0;->o:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    iput p6, p0, La/v1t0;->p:I

    .line 12
    .line 13
    iput-object p7, p0, La/v1t0;->q:La/kie0;

    .line 14
    .line 15
    iput-object p8, p0, La/v1t0;->r:La/a4x;

    .line 16
    .line 17
    iput-object p9, p0, La/v1t0;->s:La/pz40;

    .line 18
    .line 19
    iput-object p10, p0, La/v1t0;->t:La/pz40;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/v1t0;

    .line 2
    .line 3
    iget-object v9, p0, La/v1t0;->s:La/pz40;

    .line 4
    .line 5
    iget-object v10, p0, La/v1t0;->t:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/v1t0;->k:La/o0x;

    .line 8
    .line 9
    iget-object v2, p0, La/v1t0;->l:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, La/v1t0;->m:La/w6k;

    .line 12
    .line 13
    iget v4, p0, La/v1t0;->n:F

    .line 14
    .line 15
    iget-object v5, p0, La/v1t0;->o:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    iget v6, p0, La/v1t0;->p:I

    .line 18
    .line 19
    iget-object v7, p0, La/v1t0;->q:La/kie0;

    .line 20
    .line 21
    iget-object v8, p0, La/v1t0;->r:La/a4x;

    .line 22
    .line 23
    move-object v11, p2

    .line 24
    invoke-direct/range {v0 .. v11}, La/v1t0;-><init>(La/o0x;Landroid/content/Context;La/w6k;FLjava/util/LinkedHashMap;ILa/kie0;La/a4x;La/pz40;La/pz40;La/yje;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/v1t0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v1t0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/v1t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/v1t0;->m:La/w6k;

    .line 4
    .line 5
    iget-object v2, v1, La/v1t0;->k:La/o0x;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v4, v1, La/v1t0;->j:B

    .line 10
    .line 11
    iget-object v6, v1, La/v1t0;->q:La/kie0;

    .line 12
    .line 13
    iget-object v10, v1, La/v1t0;->o:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    const/4 v13, 0x5

    .line 16
    const/4 v14, 0x4

    .line 17
    const/4 v15, 0x3

    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v7, 0x1

    .line 20
    iget-object v8, v1, La/v1t0;->l:Landroid/content/Context;

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    if-eqz v4, :cond_4

    .line 24
    .line 25
    if-eq v4, v7, :cond_3

    .line 26
    .line 27
    if-eq v4, v5, :cond_2

    .line 28
    .line 29
    if-eq v4, v15, :cond_1

    .line 30
    .line 31
    if-eq v4, v14, :cond_1

    .line 32
    .line 33
    if-eq v4, v13, :cond_0

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    return-object v0

    .line 42
    :cond_0
    iget-object v0, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_2
    iget-object v0, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :catch_0
    move-exception v0

    .line 67
    :goto_0
    move-object v4, v11

    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_3
    iget-object v0, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 71
    .line 72
    check-cast v0, Ljava/lang/String;

    .line 73
    .line 74
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    move-object/from16 v0, p1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :try_start_2
    instance-of v4, v2, La/n0x;

    .line 84
    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 88
    .line 89
    move-object v4, v2

    .line 90
    check-cast v4, La/n0x;

    .line 91
    .line 92
    iget-object v4, v4, La/n0x;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v4}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move-object v4, v11

    .line 100
    :goto_1
    new-instance v9, La/k1x;

    .line 101
    .line 102
    invoke-direct {v9, v8}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v2}, La/o0x;->a()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iput-object v2, v9, La/k1x;->c:Ljava/lang/Object;

    .line 110
    .line 111
    iget v2, v1, La/v1t0;->n:F

    .line 112
    .line 113
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    sget-object v12, La/qmk;->a:La/zcl;

    .line 118
    .line 119
    const/high16 v12, 0x433e0000    # 190.0f

    .line 120
    .line 121
    invoke-interface {v0, v12}, La/w6k;->T(F)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-virtual {v9, v2, v0}, La/k1x;->d(II)V

    .line 126
    .line 127
    .line 128
    if-eqz v4, :cond_6

    .line 129
    .line 130
    iput-object v4, v9, La/k1x;->f:Ljava/lang/String;

    .line 131
    .line 132
    iput-object v4, v9, La/k1x;->i:Ljava/lang/String;

    .line 133
    .line 134
    :cond_6
    sget-object v0, La/vi9;->c:La/vi9;

    .line 135
    .line 136
    iput-object v0, v9, La/k1x;->m:La/vi9;

    .line 137
    .line 138
    iput-object v0, v9, La/k1x;->n:La/vi9;

    .line 139
    .line 140
    invoke-virtual {v9}, La/k1x;->a()La/o1x;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v8}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    iput-object v11, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 149
    .line 150
    iput-byte v7, v1, La/v1t0;->j:B

    .line 151
    .line 152
    invoke-virtual {v2, v0, v1}, La/gbe0;->c(La/o1x;La/zje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-ne v0, v3, :cond_7

    .line 157
    .line 158
    goto/16 :goto_7

    .line 159
    .line 160
    :cond_7
    :goto_2
    check-cast v0, La/u1x;

    .line 161
    .line 162
    instance-of v2, v0, La/hhn0;

    .line 163
    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    check-cast v0, La/hhn0;

    .line 167
    .line 168
    iget-object v0, v0, La/hhn0;->a:La/dyw;

    .line 169
    .line 170
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-static {v0, v2}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    sget-object v2, La/tvk;->a:La/rwj;

    .line 182
    .line 183
    sget-object v2, La/ys10;->a:La/vs10;

    .line 184
    .line 185
    new-instance v7, La/mc0;

    .line 186
    .line 187
    iget v9, v1, La/v1t0;->p:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 188
    .line 189
    const/16 v12, 0xa

    .line 190
    .line 191
    move-object v8, v10

    .line 192
    move-object v10, v0

    .line 193
    :try_start_3
    invoke-direct/range {v7 .. v12}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    .line 195
    .line 196
    move-object v10, v8

    .line 197
    move-object v4, v11

    .line 198
    :try_start_4
    iput-object v4, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 199
    .line 200
    iput-byte v5, v1, La/v1t0;->j:B

    .line 201
    .line 202
    invoke-static {v2, v7, v1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 206
    if-ne v0, v3, :cond_9

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :catch_1
    move-exception v0

    .line 210
    goto :goto_4

    .line 211
    :catchall_1
    move-exception v0

    .line 212
    move-object v10, v8

    .line 213
    goto :goto_6

    .line 214
    :catch_2
    move-exception v0

    .line 215
    move-object v10, v8

    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_8
    :goto_3
    move-object v4, v11

    .line 219
    :cond_9
    sget-object v0, La/tvk;->a:La/rwj;

    .line 220
    .line 221
    sget-object v0, La/ys10;->a:La/vs10;

    .line 222
    .line 223
    new-instance v5, La/jv0;

    .line 224
    .line 225
    const/4 v11, 0x0

    .line 226
    const/16 v12, 0xe

    .line 227
    .line 228
    iget-object v7, v1, La/v1t0;->r:La/a4x;

    .line 229
    .line 230
    iget-object v8, v1, La/v1t0;->s:La/pz40;

    .line 231
    .line 232
    iget-object v9, v1, La/v1t0;->t:La/pz40;

    .line 233
    .line 234
    invoke-direct/range {v5 .. v12}, La/jv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 235
    .line 236
    .line 237
    iput-object v4, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 238
    .line 239
    iput-byte v15, v1, La/v1t0;->j:B

    .line 240
    .line 241
    invoke-static {v0, v5, v1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    if-ne v0, v3, :cond_a

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 249
    .line 250
    .line 251
    sget-object v0, La/tvk;->a:La/rwj;

    .line 252
    .line 253
    sget-object v0, La/ys10;->a:La/vs10;

    .line 254
    .line 255
    new-instance v5, La/jv0;

    .line 256
    .line 257
    const/4 v11, 0x0

    .line 258
    const/16 v12, 0xe

    .line 259
    .line 260
    iget-object v7, v1, La/v1t0;->r:La/a4x;

    .line 261
    .line 262
    iget-object v8, v1, La/v1t0;->s:La/pz40;

    .line 263
    .line 264
    iget-object v9, v1, La/v1t0;->t:La/pz40;

    .line 265
    .line 266
    invoke-direct/range {v5 .. v12}, La/jv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 267
    .line 268
    .line 269
    iput-object v4, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 270
    .line 271
    iput-byte v14, v1, La/v1t0;->j:B

    .line 272
    .line 273
    invoke-static {v0, v5, v1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-ne v0, v3, :cond_a

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_a
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :goto_6
    sget-object v2, La/tvk;->a:La/rwj;

    .line 284
    .line 285
    sget-object v2, La/ys10;->a:La/vs10;

    .line 286
    .line 287
    new-instance v5, La/jv0;

    .line 288
    .line 289
    const/4 v11, 0x0

    .line 290
    const/16 v12, 0xe

    .line 291
    .line 292
    iget-object v7, v1, La/v1t0;->r:La/a4x;

    .line 293
    .line 294
    iget-object v8, v1, La/v1t0;->s:La/pz40;

    .line 295
    .line 296
    iget-object v9, v1, La/v1t0;->t:La/pz40;

    .line 297
    .line 298
    invoke-direct/range {v5 .. v12}, La/jv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 299
    .line 300
    .line 301
    iput-object v0, v1, La/v1t0;->i:Ljava/lang/Throwable;

    .line 302
    .line 303
    iput-byte v13, v1, La/v1t0;->j:B

    .line 304
    .line 305
    invoke-static {v2, v5, v1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    if-ne v1, v3, :cond_b

    .line 310
    .line 311
    :goto_7
    return-object v3

    .line 312
    :cond_b
    :goto_8
    throw v0
.end method
