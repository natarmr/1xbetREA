.class public final La/p4m;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Z

.field public l:I

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/bs60;Ljava/lang/String;ZILa/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/p4m;->i:B

    .line 17
    iput-object p1, p0, La/p4m;->n:Ljava/lang/Object;

    iput-object p2, p0, La/p4m;->o:Ljava/lang/Object;

    iput-boolean p3, p0, La/p4m;->k:Z

    iput p4, p0, La/p4m;->l:I

    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/j700;La/ouu;ILjava/util/Set;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/p4m;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/p4m;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/p4m;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/p4m;->l:I

    .line 9
    .line 10
    iput-object p4, p0, La/p4m;->o:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(ZLa/rah0;La/pz40;La/pz40;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/p4m;->i:B

    .line 18
    iput-boolean p1, p0, La/p4m;->k:Z

    iput-object p2, p0, La/p4m;->m:Ljava/lang/Object;

    iput-object p3, p0, La/p4m;->n:Ljava/lang/Object;

    iput-object p4, p0, La/p4m;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/p4m;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/p4m;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/p4m;->n:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/p4m;

    .line 11
    .line 12
    move-object v4, v2

    .line 13
    check-cast v4, La/bs60;

    .line 14
    .line 15
    move-object v5, v1

    .line 16
    check-cast v5, Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v6, p0, La/p4m;->k:Z

    .line 19
    .line 20
    iget v7, p0, La/p4m;->l:I

    .line 21
    .line 22
    move-object v8, p2

    .line 23
    invoke-direct/range {v3 .. v8}, La/p4m;-><init>(La/bs60;Ljava/lang/String;ZILa/yje;)V

    .line 24
    .line 25
    .line 26
    return-object v3

    .line 27
    :pswitch_0
    move-object v9, p2

    .line 28
    new-instance v4, La/p4m;

    .line 29
    .line 30
    iget-object p2, p0, La/p4m;->m:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v5, p2

    .line 33
    check-cast v5, La/j700;

    .line 34
    .line 35
    move-object v6, v2

    .line 36
    check-cast v6, La/ouu;

    .line 37
    .line 38
    iget v7, p0, La/p4m;->l:I

    .line 39
    .line 40
    move-object v8, v1

    .line 41
    check-cast v8, Ljava/util/Set;

    .line 42
    .line 43
    invoke-direct/range {v4 .. v9}, La/p4m;-><init>(La/j700;La/ouu;ILjava/util/Set;La/yje;)V

    .line 44
    .line 45
    .line 46
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    iput-boolean p0, v4, La/p4m;->k:Z

    .line 53
    .line 54
    return-object v4

    .line 55
    :pswitch_1
    move-object v9, p2

    .line 56
    new-instance v4, La/p4m;

    .line 57
    .line 58
    iget-boolean v5, p0, La/p4m;->k:Z

    .line 59
    .line 60
    iget-object p0, p0, La/p4m;->m:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v6, p0

    .line 63
    check-cast v6, La/rah0;

    .line 64
    .line 65
    move-object v7, v2

    .line 66
    check-cast v7, La/pz40;

    .line 67
    .line 68
    move-object v8, v1

    .line 69
    check-cast v8, La/pz40;

    .line 70
    .line 71
    invoke-direct/range {v4 .. v9}, La/p4m;-><init>(ZLa/rah0;La/pz40;La/pz40;La/yje;)V

    .line 72
    .line 73
    .line 74
    return-object v4

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/p4m;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lkotlin/Pair;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/p4m;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/p4m;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/p4m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/p4m;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/p4m;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/p4m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/p4m;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/p4m;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/p4m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p4m;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/p4m;->n:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, v0, La/p4m;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v7, Ljava/lang/String;

    .line 19
    .line 20
    check-cast v3, La/bs60;

    .line 21
    .line 22
    iget-object v1, v3, La/bs60;->g0:La/p7m0;

    .line 23
    .line 24
    iget-object v9, v3, La/bs60;->f0:La/p7m0;

    .line 25
    .line 26
    iget-object v10, v3, La/i3t0;->f:La/oyg0;

    .line 27
    .line 28
    iget-object v11, v3, La/i3t0;->i:La/ocj;

    .line 29
    .line 30
    sget-object v12, La/wne;->a:La/wne;

    .line 31
    .line 32
    iget-byte v13, v0, La/p4m;->j:B

    .line 33
    .line 34
    if-eqz v13, :cond_2

    .line 35
    .line 36
    if-eq v13, v8, :cond_1

    .line 37
    .line 38
    if-ne v13, v4, :cond_0

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v0, p1

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_b

    .line 51
    .line 52
    :cond_1
    iget-object v0, v0, La/p4m;->m:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v2, v0

    .line 60
    move-object/from16 v0, p1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget v2, La/bs60;->h0:I

    .line 67
    .line 68
    invoke-virtual {v3, v7}, La/bs60;->X(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_8

    .line 73
    .line 74
    iget-boolean v2, v0, La/p4m;->k:Z

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    iget-object v2, v3, La/bs60;->e0:La/u270;

    .line 79
    .line 80
    invoke-virtual {v3, v7}, La/bs60;->M(Ljava/lang/String;)La/u270;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    iget-object v2, v11, La/ocj;->a:La/p7m0;

    .line 91
    .line 92
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-object v3, v0

    .line 100
    check-cast v3, La/w370;

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/16 v15, 0x3ffe

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v12, 0x0

    .line 114
    const/4 v13, 0x0

    .line 115
    invoke-static/range {v3 .. v15}, La/w370;->a(La/w370;ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;ZZZZI)La/w370;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    goto/16 :goto_a

    .line 126
    .line 127
    :cond_4
    invoke-virtual {v3, v7}, La/bs60;->M(Ljava/lang/String;)La/u270;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, v3, La/bs60;->e0:La/u270;

    .line 132
    .line 133
    invoke-static {v7}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v4, v3, La/bs60;->O:La/yuu;

    .line 142
    .line 143
    invoke-virtual {v3, v7}, La/bs60;->M(Ljava/lang/String;)La/u270;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    iput-object v2, v0, La/p4m;->m:Ljava/lang/Object;

    .line 148
    .line 149
    iput-byte v8, v0, La/p4m;->j:B

    .line 150
    .line 151
    invoke-virtual {v4, v6, v0}, La/yuu;->o(La/u270;La/zje;)Ljava/io/Serializable;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v12, :cond_5

    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :cond_5
    :goto_0
    move-object v13, v0

    .line 160
    check-cast v13, Ljava/util/List;

    .line 161
    .line 162
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, La/w370;

    .line 167
    .line 168
    iget-object v0, v0, La/w370;->d:La/rc50;

    .line 169
    .line 170
    iget-object v0, v0, La/rc50;->e:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_1c

    .line 185
    .line 186
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_6

    .line 191
    .line 192
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, La/pat;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    instance-of v0, v0, La/oat;

    .line 202
    .line 203
    if-nez v0, :cond_6

    .line 204
    .line 205
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, La/pat;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    instance-of v0, v0, La/oat;

    .line 215
    .line 216
    if-nez v0, :cond_6

    .line 217
    .line 218
    move v5, v8

    .line 219
    :cond_6
    invoke-virtual {v3, v5}, La/bs60;->W(Z)V

    .line 220
    .line 221
    .line 222
    iget-object v0, v11, La/ocj;->a:La/p7m0;

    .line 223
    .line 224
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-object v2, v1

    .line 232
    check-cast v2, La/w370;

    .line 233
    .line 234
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    iget-object v12, v2, La/w370;->f:La/tdt;

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x1e

    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const/16 v16, 0x0

    .line 246
    .line 247
    invoke-static/range {v12 .. v18}, La/tdt;->a(La/tdt;Ljava/util/List;Ljava/util/List;Ljava/util/List;III)La/tdt;

    .line 248
    .line 249
    .line 250
    move-result-object v20

    .line 251
    const/16 v25, 0x0

    .line 252
    .line 253
    const/16 v26, 0x3bde

    .line 254
    .line 255
    const/4 v15, 0x0

    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const/16 v18, 0x0

    .line 259
    .line 260
    const/16 v19, 0x0

    .line 261
    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    const/16 v22, 0x0

    .line 265
    .line 266
    const/16 v23, 0x0

    .line 267
    .line 268
    const/16 v24, 0x1

    .line 269
    .line 270
    move-object v14, v2

    .line 271
    invoke-static/range {v14 .. v26}, La/w370;->a(La/w370;ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;ZZZZI)La/w370;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_7

    .line 280
    .line 281
    goto/16 :goto_a

    .line 282
    .line 283
    :cond_8
    iget-object v2, v3, La/bs60;->N:La/nr;

    .line 284
    .line 285
    iget v13, v0, La/p4m;->l:I

    .line 286
    .line 287
    iput-byte v4, v0, La/p4m;->j:B

    .line 288
    .line 289
    invoke-virtual {v2, v13, v0}, La/nr;->r(ILa/zje;)Ljava/io/Serializable;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    if-ne v0, v12, :cond_9

    .line 294
    .line 295
    :goto_1
    move-object v6, v12

    .line 296
    goto/16 :goto_b

    .line 297
    .line 298
    :cond_9
    :goto_2
    check-cast v0, Ljava/util/List;

    .line 299
    .line 300
    sget v2, La/bs60;->h0:I

    .line 301
    .line 302
    new-instance v2, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    :cond_a
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    if-eqz v12, :cond_b

    .line 316
    .line 317
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    move-object v13, v12

    .line 322
    check-cast v13, La/pbv;

    .line 323
    .line 324
    iget-boolean v13, v13, La/pbv;->q:Z

    .line 325
    .line 326
    if-eqz v13, :cond_a

    .line 327
    .line 328
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v12

    .line 341
    :cond_c
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v13

    .line 345
    if-eqz v13, :cond_e

    .line 346
    .line 347
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v13

    .line 351
    move-object v14, v13

    .line 352
    check-cast v14, La/pbv;

    .line 353
    .line 354
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 355
    .line 356
    .line 357
    move-result v15

    .line 358
    if-nez v15, :cond_d

    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_d
    iget-object v14, v14, La/pbv;->c:Ljava/lang/String;

    .line 362
    .line 363
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 364
    .line 365
    .line 366
    move-result-object v15

    .line 367
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v14, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v14

    .line 374
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 378
    .line 379
    .line 380
    move-result-object v15

    .line 381
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v15

    .line 388
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-static {v14, v15, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 392
    .line 393
    .line 394
    move-result v14

    .line 395
    if-eqz v14, :cond_c

    .line 396
    .line 397
    :goto_5
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto :goto_4

    .line 401
    :cond_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-nez v7, :cond_f

    .line 406
    .line 407
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    check-cast v7, La/pat;

    .line 412
    .line 413
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    instance-of v7, v7, La/oat;

    .line 417
    .line 418
    if-nez v7, :cond_f

    .line 419
    .line 420
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, La/pat;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    instance-of v1, v1, La/oat;

    .line 430
    .line 431
    if-nez v1, :cond_f

    .line 432
    .line 433
    move v1, v8

    .line 434
    goto :goto_6

    .line 435
    :cond_f
    move v1, v5

    .line 436
    :goto_6
    invoke-virtual {v3, v1}, La/bs60;->W(Z)V

    .line 437
    .line 438
    .line 439
    new-instance v1, La/jt50;

    .line 440
    .line 441
    const/16 v7, 0xc

    .line 442
    .line 443
    invoke-direct {v1, v4, v2, v7}, La/jt50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    check-cast v1, La/w370;

    .line 454
    .line 455
    iget-wide v12, v1, La/w370;->h:J

    .line 456
    .line 457
    const-wide/16 v14, 0x0

    .line 458
    .line 459
    cmp-long v1, v12, v14

    .line 460
    .line 461
    if-lez v1, :cond_17

    .line 462
    .line 463
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_11

    .line 472
    .line 473
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    move-object v4, v2

    .line 478
    check-cast v4, La/pbv;

    .line 479
    .line 480
    iget-wide v14, v4, La/pbv;->a:J

    .line 481
    .line 482
    cmp-long v4, v14, v12

    .line 483
    .line 484
    if-nez v4, :cond_10

    .line 485
    .line 486
    goto :goto_7

    .line 487
    :cond_11
    move-object v2, v6

    .line 488
    :goto_7
    check-cast v2, La/pbv;

    .line 489
    .line 490
    if-eqz v2, :cond_17

    .line 491
    .line 492
    iget-object v1, v3, La/bs60;->x:La/nn60;

    .line 493
    .line 494
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    check-cast v4, La/w370;

    .line 499
    .line 500
    iget-object v4, v4, La/w370;->f:La/tdt;

    .line 501
    .line 502
    iget-object v4, v4, La/tdt;->a:Ljava/util/List;

    .line 503
    .line 504
    if-eqz v4, :cond_17

    .line 505
    .line 506
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v7

    .line 514
    if-eqz v7, :cond_13

    .line 515
    .line 516
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v7

    .line 520
    move-object v9, v7

    .line 521
    check-cast v9, La/pbv;

    .line 522
    .line 523
    iget-wide v12, v9, La/pbv;->a:J

    .line 524
    .line 525
    iget-wide v14, v2, La/pbv;->a:J

    .line 526
    .line 527
    cmp-long v9, v12, v14

    .line 528
    .line 529
    if-nez v9, :cond_12

    .line 530
    .line 531
    move-object v6, v7

    .line 532
    :cond_13
    check-cast v6, La/pbv;

    .line 533
    .line 534
    if-eqz v6, :cond_17

    .line 535
    .line 536
    iget-object v2, v3, La/bs60;->o:Landroid/os/Bundle;

    .line 537
    .line 538
    if-eqz v2, :cond_14

    .line 539
    .line 540
    const-string v4, "WEB_GAME_SESSION_ID"

    .line 541
    .line 542
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    if-nez v2, :cond_15

    .line 547
    .line 548
    :cond_14
    invoke-static {}, La/axq;->g()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    :cond_15
    new-instance v4, La/cn60;

    .line 553
    .line 554
    invoke-direct {v4, v6, v2}, La/cn60;-><init>(La/pbv;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    new-array v2, v8, [La/en60;

    .line 558
    .line 559
    aput-object v4, v2, v5

    .line 560
    .line 561
    invoke-static {v3, v1, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 562
    .line 563
    .line 564
    iget-object v1, v11, La/ocj;->a:La/p7m0;

    .line 565
    .line 566
    :cond_16
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-object v11, v2

    .line 574
    check-cast v11, La/w370;

    .line 575
    .line 576
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    const/16 v22, 0x0

    .line 580
    .line 581
    const/16 v23, 0x3f7f

    .line 582
    .line 583
    const/4 v12, 0x0

    .line 584
    const/4 v13, 0x0

    .line 585
    const/4 v14, 0x0

    .line 586
    const/4 v15, 0x0

    .line 587
    const/16 v16, 0x0

    .line 588
    .line 589
    const/16 v17, 0x0

    .line 590
    .line 591
    const/16 v18, 0x0

    .line 592
    .line 593
    const/16 v19, 0x0

    .line 594
    .line 595
    const/16 v20, 0x0

    .line 596
    .line 597
    const/16 v21, 0x0

    .line 598
    .line 599
    invoke-static/range {v11 .. v23}, La/w370;->a(La/w370;ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;ZZZZI)La/w370;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    if-eqz v2, :cond_16

    .line 608
    .line 609
    :cond_17
    new-instance v1, Ljava/util/ArrayList;

    .line 610
    .line 611
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    :cond_18
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-eqz v2, :cond_1a

    .line 623
    .line 624
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    move-object v4, v2

    .line 629
    check-cast v4, La/pbv;

    .line 630
    .line 631
    iget-boolean v5, v4, La/pbv;->p:Z

    .line 632
    .line 633
    if-nez v5, :cond_19

    .line 634
    .line 635
    iget-boolean v4, v4, La/pbv;->q:Z

    .line 636
    .line 637
    if-nez v4, :cond_18

    .line 638
    .line 639
    :cond_19
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    goto :goto_8

    .line 643
    :cond_1a
    new-instance v0, Ljava/util/ArrayList;

    .line 644
    .line 645
    const/16 v2, 0xa

    .line 646
    .line 647
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    if-eqz v2, :cond_1b

    .line 663
    .line 664
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    check-cast v2, La/pbv;

    .line 669
    .line 670
    iget-wide v4, v2, La/pbv;->a:J

    .line 671
    .line 672
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    goto :goto_9

    .line 680
    :cond_1b
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 681
    .line 682
    .line 683
    move-result v1

    .line 684
    if-nez v1, :cond_1c

    .line 685
    .line 686
    iget-object v1, v3, La/bs60;->R:La/l570;

    .line 687
    .line 688
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    new-instance v4, La/br60;

    .line 693
    .line 694
    invoke-direct {v4, v3, v8}, La/br60;-><init>(La/bs60;B)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    const-string v3, "OneXGamesAllGameViewModel.updateGamesWorkStatus"

    .line 701
    .line 702
    invoke-virtual {v1, v2, v0, v3, v4}, La/l570;->v(La/bvc;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 703
    .line 704
    .line 705
    :cond_1c
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 706
    .line 707
    :goto_b
    return-object v6

    .line 708
    :pswitch_0
    check-cast v3, La/ouu;

    .line 709
    .line 710
    iget-boolean v1, v0, La/p4m;->k:Z

    .line 711
    .line 712
    sget-object v9, La/wne;->a:La/wne;

    .line 713
    .line 714
    iget-byte v10, v0, La/p4m;->j:B

    .line 715
    .line 716
    if-eqz v10, :cond_1f

    .line 717
    .line 718
    if-eq v10, v8, :cond_1e

    .line 719
    .line 720
    if-ne v10, v4, :cond_1d

    .line 721
    .line 722
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    move-object/from16 v0, p1

    .line 726
    .line 727
    goto/16 :goto_10

    .line 728
    .line 729
    :cond_1d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    goto/16 :goto_11

    .line 733
    .line 734
    :cond_1e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    move-object/from16 v0, p1

    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_1f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    if-nez v1, :cond_21

    .line 744
    .line 745
    iget-object v2, v0, La/p4m;->m:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v2, La/j700;

    .line 748
    .line 749
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    sget-object v6, La/j700;->c:La/j700;

    .line 753
    .line 754
    if-ne v2, v6, :cond_20

    .line 755
    .line 756
    goto :goto_c

    .line 757
    :cond_20
    move v12, v5

    .line 758
    goto :goto_d

    .line 759
    :cond_21
    :goto_c
    move v12, v8

    .line 760
    :goto_d
    if-eqz v12, :cond_23

    .line 761
    .line 762
    iget-object v2, v3, La/ouu;->b:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v2, La/fsd;

    .line 765
    .line 766
    invoke-virtual {v2}, La/fsd;->a()La/v8d;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    iget v2, v2, La/v8d;->a:I

    .line 771
    .line 772
    const/16 v5, 0x3e7

    .line 773
    .line 774
    if-ne v2, v5, :cond_23

    .line 775
    .line 776
    iget-object v2, v0, La/p4m;->m:Ljava/lang/Object;

    .line 777
    .line 778
    move-object v13, v2

    .line 779
    check-cast v13, La/j700;

    .line 780
    .line 781
    iget v14, v0, La/p4m;->l:I

    .line 782
    .line 783
    move-object v15, v7

    .line 784
    check-cast v15, Ljava/util/Set;

    .line 785
    .line 786
    iput-boolean v1, v0, La/p4m;->k:Z

    .line 787
    .line 788
    iput-byte v8, v0, La/p4m;->j:B

    .line 789
    .line 790
    iget-object v1, v3, La/ouu;->d:Ljava/lang/Object;

    .line 791
    .line 792
    move-object v11, v1

    .line 793
    check-cast v11, La/w5z;

    .line 794
    .line 795
    iget-object v1, v11, La/w5z;->e:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v1, La/mne;

    .line 798
    .line 799
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 800
    .line 801
    new-instance v10, La/k700;

    .line 802
    .line 803
    const/16 v16, 0x0

    .line 804
    .line 805
    invoke-direct/range {v10 .. v16}, La/k700;-><init>(La/w5z;ZLa/j700;ILjava/util/Set;La/yje;)V

    .line 806
    .line 807
    .line 808
    invoke-static {v1, v10, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    if-ne v0, v9, :cond_22

    .line 813
    .line 814
    goto :goto_f

    .line 815
    :cond_22
    :goto_e
    move-object v6, v0

    .line 816
    check-cast v6, Ljava/util/List;

    .line 817
    .line 818
    goto :goto_11

    .line 819
    :cond_23
    iget-object v2, v0, La/p4m;->m:Ljava/lang/Object;

    .line 820
    .line 821
    move-object v13, v2

    .line 822
    check-cast v13, La/j700;

    .line 823
    .line 824
    iget v14, v0, La/p4m;->l:I

    .line 825
    .line 826
    move-object v15, v7

    .line 827
    check-cast v15, Ljava/util/Set;

    .line 828
    .line 829
    iput-boolean v1, v0, La/p4m;->k:Z

    .line 830
    .line 831
    iput-byte v4, v0, La/p4m;->j:B

    .line 832
    .line 833
    iget-object v1, v3, La/ouu;->d:Ljava/lang/Object;

    .line 834
    .line 835
    move-object v11, v1

    .line 836
    check-cast v11, La/w5z;

    .line 837
    .line 838
    iget-object v1, v11, La/w5z;->e:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v1, La/mne;

    .line 841
    .line 842
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 843
    .line 844
    new-instance v10, La/k700;

    .line 845
    .line 846
    const/16 v16, 0x0

    .line 847
    .line 848
    invoke-direct/range {v10 .. v16}, La/k700;-><init>(La/w5z;ZLa/j700;ILjava/util/Set;La/yje;)V

    .line 849
    .line 850
    .line 851
    invoke-static {v1, v10, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    if-ne v0, v9, :cond_24

    .line 856
    .line 857
    :goto_f
    move-object v6, v9

    .line 858
    goto :goto_11

    .line 859
    :cond_24
    :goto_10
    move-object v6, v0

    .line 860
    check-cast v6, Ljava/util/List;

    .line 861
    .line 862
    :goto_11
    return-object v6

    .line 863
    :pswitch_1
    check-cast v7, La/pz40;

    .line 864
    .line 865
    iget-object v1, v0, La/p4m;->m:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v1, La/rah0;

    .line 868
    .line 869
    sget-object v5, La/wne;->a:La/wne;

    .line 870
    .line 871
    iget-byte v9, v0, La/p4m;->j:B

    .line 872
    .line 873
    const/4 v10, 0x4

    .line 874
    const/4 v11, 0x3

    .line 875
    if-eqz v9, :cond_29

    .line 876
    .line 877
    if-eq v9, v8, :cond_28

    .line 878
    .line 879
    if-eq v9, v4, :cond_27

    .line 880
    .line 881
    if-eq v9, v11, :cond_26

    .line 882
    .line 883
    if-ne v9, v10, :cond_25

    .line 884
    .line 885
    goto :goto_12

    .line 886
    :cond_25
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    goto/16 :goto_19

    .line 890
    .line 891
    :cond_26
    :goto_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 892
    .line 893
    .line 894
    goto/16 :goto_17

    .line 895
    .line 896
    :cond_27
    iget v2, v0, La/p4m;->l:I

    .line 897
    .line 898
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    goto :goto_15

    .line 902
    :cond_28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    goto :goto_13

    .line 906
    :cond_29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    iget-boolean v2, v0, La/p4m;->k:Z

    .line 910
    .line 911
    if-eqz v2, :cond_31

    .line 912
    .line 913
    check-cast v3, La/pz40;

    .line 914
    .line 915
    sget v2, La/q4m;->a:F

    .line 916
    .line 917
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    check-cast v2, Ljava/lang/Boolean;

    .line 922
    .line 923
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    if-nez v2, :cond_2a

    .line 928
    .line 929
    goto/16 :goto_18

    .line 930
    .line 931
    :cond_2a
    new-instance v2, La/xjl;

    .line 932
    .line 933
    const/16 v3, 0x12

    .line 934
    .line 935
    invoke-direct {v2, v3}, La/xjl;-><init>(B)V

    .line 936
    .line 937
    .line 938
    iput-byte v8, v0, La/p4m;->j:B

    .line 939
    .line 940
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    invoke-static {v3}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    invoke-interface {v3, v2, v0}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    if-ne v2, v5, :cond_2b

    .line 953
    .line 954
    goto/16 :goto_16

    .line 955
    .line 956
    :cond_2b
    :goto_13
    iget-object v2, v1, La/rah0;->f:La/cgk0;

    .line 957
    .line 958
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 959
    .line 960
    .line 961
    move-result v2

    .line 962
    :goto_14
    new-instance v3, La/xjl;

    .line 963
    .line 964
    const/16 v6, 0x13

    .line 965
    .line 966
    invoke-direct {v3, v6}, La/xjl;-><init>(B)V

    .line 967
    .line 968
    .line 969
    iput v2, v0, La/p4m;->l:I

    .line 970
    .line 971
    iput-byte v4, v0, La/p4m;->j:B

    .line 972
    .line 973
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    invoke-static {v6}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 978
    .line 979
    .line 980
    move-result-object v6

    .line 981
    invoke-interface {v6, v3, v0}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    if-ne v3, v5, :cond_2c

    .line 986
    .line 987
    goto :goto_16

    .line 988
    :cond_2c
    :goto_15
    iget-object v3, v1, La/rah0;->f:La/cgk0;

    .line 989
    .line 990
    invoke-virtual {v3}, La/cgk0;->l()I

    .line 991
    .line 992
    .line 993
    move-result v3

    .line 994
    if-eq v3, v2, :cond_2d

    .line 995
    .line 996
    move v2, v3

    .line 997
    goto :goto_14

    .line 998
    :cond_2d
    iget-object v3, v1, La/rah0;->h:La/ywj;

    .line 999
    .line 1000
    invoke-virtual {v3}, La/ywj;->a()Z

    .line 1001
    .line 1002
    .line 1003
    move-result v3

    .line 1004
    if-eqz v3, :cond_2e

    .line 1005
    .line 1006
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1007
    .line 1008
    goto :goto_19

    .line 1009
    :cond_2e
    sget v3, La/q4m;->a:F

    .line 1010
    .line 1011
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v3

    .line 1015
    check-cast v3, Ljava/lang/Boolean;

    .line 1016
    .line 1017
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    if-eqz v3, :cond_2f

    .line 1022
    .line 1023
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1024
    .line 1025
    invoke-interface {v7, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    iget-object v3, v1, La/rah0;->f:La/cgk0;

    .line 1029
    .line 1030
    invoke-virtual {v3}, La/cgk0;->l()I

    .line 1031
    .line 1032
    .line 1033
    move-result v3

    .line 1034
    iput v2, v0, La/p4m;->l:I

    .line 1035
    .line 1036
    iput-byte v11, v0, La/p4m;->j:B

    .line 1037
    .line 1038
    iget-object v2, v1, La/rah0;->a:La/cgk0;

    .line 1039
    .line 1040
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 1041
    .line 1042
    .line 1043
    move-result v2

    .line 1044
    sub-int/2addr v3, v2

    .line 1045
    int-to-float v2, v3

    .line 1046
    invoke-static {v1, v2, v0}, La/bww;->T(La/bch0;FLa/zje;)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    if-ne v0, v5, :cond_30

    .line 1051
    .line 1052
    goto :goto_16

    .line 1053
    :cond_2f
    iget-object v3, v1, La/rah0;->f:La/cgk0;

    .line 1054
    .line 1055
    invoke-virtual {v3}, La/cgk0;->l()I

    .line 1056
    .line 1057
    .line 1058
    move-result v3

    .line 1059
    iput v2, v0, La/p4m;->l:I

    .line 1060
    .line 1061
    iput-byte v10, v0, La/p4m;->j:B

    .line 1062
    .line 1063
    invoke-static {v1, v3, v0}, La/rah0;->g(La/rah0;ILa/bnn0;)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    if-ne v0, v5, :cond_30

    .line 1068
    .line 1069
    :goto_16
    move-object v6, v5

    .line 1070
    goto :goto_19

    .line 1071
    :cond_30
    :goto_17
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    goto :goto_19

    .line 1074
    :cond_31
    :goto_18
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1075
    .line 1076
    :goto_19
    return-object v6

    .line 1077
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
