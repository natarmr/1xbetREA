.class public final La/fp2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/gp2;


# direct methods
.method public synthetic constructor <init>(La/gp2;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fp2;->i:B

    iput-object p1, p0, La/fp2;->k:La/gp2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fp2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fp2;->k:La/gp2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/fp2;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/fp2;-><init>(La/gp2;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/fp2;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/fp2;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/fp2;-><init>(La/gp2;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fp2;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/fp2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/fp2;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/fp2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/fp2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/fp2;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/fp2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
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
    iget-byte v1, v0, La/fp2;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/fp2;->k:La/gp2;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean v0, v0, La/fp2;->j:Z

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, v3, La/gp2;->h:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v1, v3, La/gp2;->e:La/mne;

    .line 30
    .line 31
    iget-object v8, v1, La/mne;->b:La/dvj;

    .line 32
    .line 33
    new-instance v6, La/m51;

    .line 34
    .line 35
    const/16 v1, 0x19

    .line 36
    .line 37
    invoke-direct {v6, v3, v1}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    new-instance v9, La/fp2;

    .line 41
    .line 42
    invoke-direct {v9, v3, v4, v2}, La/fp2;-><init>(La/gp2;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/16 v10, 0xa

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    :cond_0
    iput-boolean v0, v3, La/gp2;->h:Z

    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget-boolean v5, v0, La/fp2;->j:Z

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    if-ne v5, v6, :cond_1

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v0, p1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v5, v3, La/gp2;->c:La/fvt0;

    .line 82
    .line 83
    iget-wide v7, v3, La/gp2;->b:J

    .line 84
    .line 85
    iput-boolean v6, v0, La/fp2;->j:Z

    .line 86
    .line 87
    iget-object v5, v5, La/fvt0;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v5, La/mii0;

    .line 90
    .line 91
    invoke-virtual {v5, v7, v8, v0}, La/mii0;->q(JLa/zje;)Ljava/io/Serializable;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-ne v0, v1, :cond_3

    .line 96
    .line 97
    move-object v4, v1

    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :cond_3
    :goto_0
    check-cast v0, Ljava/util/List;

    .line 101
    .line 102
    iget-object v1, v3, La/gp2;->i:La/p7m0;

    .line 103
    .line 104
    new-instance v3, Ljava/util/ArrayList;

    .line 105
    .line 106
    const/16 v5, 0xa

    .line 107
    .line 108
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, La/so2;

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v7, La/ap2;

    .line 135
    .line 136
    iget-wide v8, v5, La/so2;->a:J

    .line 137
    .line 138
    iget-wide v10, v5, La/so2;->b:J

    .line 139
    .line 140
    iget-wide v12, v5, La/so2;->d:J

    .line 141
    .line 142
    iget-object v14, v5, La/so2;->e:Ljava/lang/String;

    .line 143
    .line 144
    iget-object v15, v5, La/so2;->f:Ljava/lang/String;

    .line 145
    .line 146
    move/from16 v32, v6

    .line 147
    .line 148
    iget-object v6, v5, La/so2;->g:Ljava/lang/String;

    .line 149
    .line 150
    move-object/from16 p0, v3

    .line 151
    .line 152
    iget-wide v2, v5, La/so2;->h:J

    .line 153
    .line 154
    iget-object v4, v5, La/so2;->i:Ljava/lang/String;

    .line 155
    .line 156
    move-object/from16 p1, v0

    .line 157
    .line 158
    iget-object v0, v5, La/so2;->j:Ljava/util/List;

    .line 159
    .line 160
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Ljava/lang/String;

    .line 165
    .line 166
    const-string v16, ""

    .line 167
    .line 168
    if-nez v0, :cond_4

    .line 169
    .line 170
    move-object/from16 v0, v16

    .line 171
    .line 172
    :cond_4
    invoke-static {v2, v3, v0}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v20

    .line 176
    move-wide/from16 v17, v2

    .line 177
    .line 178
    iget-wide v2, v5, La/so2;->k:J

    .line 179
    .line 180
    iget-object v0, v5, La/so2;->l:Ljava/lang/String;

    .line 181
    .line 182
    move-object/from16 v23, v0

    .line 183
    .line 184
    iget-object v0, v5, La/so2;->m:Ljava/util/List;

    .line 185
    .line 186
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Ljava/lang/String;

    .line 191
    .line 192
    if-nez v0, :cond_5

    .line 193
    .line 194
    move-object/from16 v0, v16

    .line 195
    .line 196
    :cond_5
    invoke-static {v2, v3, v0}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v24

    .line 200
    iget-boolean v0, v5, La/so2;->n:Z

    .line 201
    .line 202
    move/from16 v25, v0

    .line 203
    .line 204
    iget-object v0, v5, La/so2;->o:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 207
    .line 208
    .line 209
    move-result v19

    .line 210
    xor-int/lit8 v26, v19, 0x1

    .line 211
    .line 212
    move-wide/from16 v21, v2

    .line 213
    .line 214
    new-instance v2, Lkotlin/text/Regex;

    .line 215
    .line 216
    const-string v3, "(\\d+[:-]\\d+)"

    .line 217
    .line 218
    invoke-direct {v2, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v0}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    if-eqz v2, :cond_6

    .line 226
    .line 227
    invoke-virtual {v2}, La/bh30;->getValue()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    if-eqz v2, :cond_6

    .line 232
    .line 233
    const-string v3, ":"

    .line 234
    .line 235
    move-object/from16 v19, v0

    .line 236
    .line 237
    const-string v0, "-"

    .line 238
    .line 239
    move-object/from16 v27, v4

    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    invoke-static {v2, v3, v0, v4}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v16

    .line 246
    goto :goto_2

    .line 247
    :cond_6
    move-object/from16 v19, v0

    .line 248
    .line 249
    move-object/from16 v27, v4

    .line 250
    .line 251
    const/4 v4, 0x0

    .line 252
    :goto_2
    invoke-static/range {v19 .. v19}, La/xf0;->S(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v28

    .line 256
    invoke-static/range {v19 .. v19}, La/xf0;->S(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    xor-int/lit8 v29, v0, 0x1

    .line 265
    .line 266
    iget v0, v5, La/so2;->p:I

    .line 267
    .line 268
    iget v2, v5, La/so2;->q:I

    .line 269
    .line 270
    move/from16 v30, v0

    .line 271
    .line 272
    move/from16 v31, v2

    .line 273
    .line 274
    move-object/from16 v19, v27

    .line 275
    .line 276
    move-object/from16 v27, v16

    .line 277
    .line 278
    move-object/from16 v16, v6

    .line 279
    .line 280
    invoke-direct/range {v7 .. v31}, La/ap2;-><init>(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZII)V

    .line 281
    .line 282
    .line 283
    move-object/from16 v0, p0

    .line 284
    .line 285
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-object v3, v0

    .line 289
    move v2, v4

    .line 290
    move/from16 v6, v32

    .line 291
    .line 292
    const/4 v4, 0x0

    .line 293
    move-object/from16 v0, p1

    .line 294
    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :cond_7
    move-object v0, v3

    .line 298
    new-instance v2, La/bp2;

    .line 299
    .line 300
    invoke-direct {v2, v0}, La/bp2;-><init>(Ljava/util/ArrayList;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    const/4 v0, 0x0

    .line 307
    invoke-virtual {v1, v0, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    :goto_3
    return-object v4

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
