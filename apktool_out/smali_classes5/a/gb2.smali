.class public final La/gb2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Ljava/lang/Object;

.field public k:B

.field public l:I

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/bk9;Landroid/content/Context;La/qa10;La/pz40;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/gb2;->i:B

    .line 19
    iput-object p1, p0, La/gb2;->m:Ljava/lang/Object;

    iput-object p2, p0, La/gb2;->n:Ljava/lang/Object;

    iput-object p3, p0, La/gb2;->o:Ljava/lang/Object;

    iput-object p4, p0, La/gb2;->p:Ljava/lang/Object;

    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/hb2;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/gb2;->i:B

    .line 20
    iput-object p1, p0, La/gb2;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/w5z;La/ygq0;Lkotlin/Pair;ILjava/util/Set;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/gb2;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/gb2;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/gb2;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/gb2;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput p4, p0, La/gb2;->l:I

    .line 11
    .line 12
    iput-object p5, p0, La/gb2;->p:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/gb2;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/gb2;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/gb2;

    .line 9
    .line 10
    iget-object p1, p0, La/gb2;->m:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, La/bk9;

    .line 14
    .line 15
    iget-object p1, p0, La/gb2;->n:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, p1

    .line 18
    check-cast v4, Landroid/content/Context;

    .line 19
    .line 20
    iget-object p0, p0, La/gb2;->o:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, p0

    .line 23
    check-cast v5, La/qa10;

    .line 24
    .line 25
    move-object v6, v1

    .line 26
    check-cast v6, La/pz40;

    .line 27
    .line 28
    move-object v7, p2

    .line 29
    invoke-direct/range {v2 .. v7}, La/gb2;-><init>(La/bk9;Landroid/content/Context;La/qa10;La/pz40;La/yje;)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :pswitch_0
    move-object v7, p2

    .line 34
    new-instance v3, La/gb2;

    .line 35
    .line 36
    iget-object p1, p0, La/gb2;->m:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v4, p1

    .line 39
    check-cast v4, La/w5z;

    .line 40
    .line 41
    iget-object p1, p0, La/gb2;->n:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v5, p1

    .line 44
    check-cast v5, La/ygq0;

    .line 45
    .line 46
    iget-object p1, p0, La/gb2;->o:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v6, p1

    .line 49
    check-cast v6, Lkotlin/Pair;

    .line 50
    .line 51
    iget p0, p0, La/gb2;->l:I

    .line 52
    .line 53
    move-object v8, v1

    .line 54
    check-cast v8, Ljava/util/Set;

    .line 55
    .line 56
    move-object v9, v7

    .line 57
    move v7, p0

    .line 58
    invoke-direct/range {v3 .. v9}, La/gb2;-><init>(La/w5z;La/ygq0;Lkotlin/Pair;ILjava/util/Set;La/yje;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :pswitch_1
    move-object v7, p2

    .line 63
    new-instance p0, La/gb2;

    .line 64
    .line 65
    check-cast v1, La/hb2;

    .line 66
    .line 67
    invoke-direct {p0, v1, v7}, La/gb2;-><init>(La/hb2;La/yje;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, La/gb2;->o:Ljava/lang/Object;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gb2;->i:B

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
    invoke-virtual {p0, p1, p2}, La/gb2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gb2;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gb2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/gb2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/gb2;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/gb2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/gb2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/gb2;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/gb2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/gb2;->i:B

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    const/4 v8, 0x2

    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v10, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v11, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-byte v0, v6, La/gb2;->k:B

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    if-eq v0, v7, :cond_1

    .line 19
    .line 20
    if-ne v0, v8, :cond_0

    .line 21
    .line 22
    iget v1, v6, La/gb2;->l:I

    .line 23
    .line 24
    iget-object v0, v6, La/gb2;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Throwable;

    .line 27
    .line 28
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    move-object v12, v0

    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :catchall_0
    move-exception v0

    .line 37
    move v13, v1

    .line 38
    :goto_0
    move-object v1, v0

    .line 39
    goto/16 :goto_a

    .line 40
    .line 41
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_c

    .line 47
    .line 48
    :cond_1
    iget v0, v6, La/gb2;->l:I

    .line 49
    .line 50
    iget-object v1, v6, La/gb2;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v2, p1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move v0, v9

    .line 64
    move-object v1, v10

    .line 65
    :goto_1
    iget-object v2, v6, La/gb2;->p:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, La/pz40;

    .line 68
    .line 69
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, La/na10;

    .line 74
    .line 75
    iget-object v2, v2, La/na10;->e:La/zbk;

    .line 76
    .line 77
    invoke-virtual {v2}, La/zbk;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_b

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    iget-object v2, v6, La/gb2;->m:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, La/bk9;

    .line 94
    .line 95
    new-instance v3, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iput-object v1, v6, La/gb2;->j:Ljava/lang/Object;

    .line 104
    .line 105
    iput v0, v6, La/gb2;->l:I

    .line 106
    .line 107
    iput-byte v7, v6, La/gb2;->k:B

    .line 108
    .line 109
    invoke-virtual {v2, v3, v1, v6}, La/bk9;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 113
    .line 114
    if-ne v2, v11, :cond_3

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_3
    :goto_2
    check-cast v2, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_b

    .line 124
    .line 125
    :cond_4
    move v13, v0

    .line 126
    move-object v12, v1

    .line 127
    :try_start_1
    iget-object v0, v6, La/gb2;->n:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Landroid/content/Context;

    .line 130
    .line 131
    iget-object v1, v6, La/gb2;->o:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, La/qa10;

    .line 134
    .line 135
    const-string v2, "fonts/"

    .line 136
    .line 137
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    move-object v3, v10

    .line 144
    goto :goto_4

    .line 145
    :cond_5
    const/16 v3, 0x2f

    .line 146
    .line 147
    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->R(Ljava/lang/CharSequence;C)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_6

    .line 152
    .line 153
    :goto_3
    move-object v3, v2

    .line 154
    goto :goto_4

    .line 155
    :cond_6
    const-string v3, "/"

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    goto :goto_3

    .line 162
    :goto_4
    const-string v2, ".ttf"

    .line 163
    .line 164
    const-string v4, "."

    .line 165
    .line 166
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_7

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_7
    invoke-static {v2, v4, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_8

    .line 178
    .line 179
    :goto_5
    move-object v4, v2

    .line 180
    goto :goto_6

    .line 181
    :cond_8
    const-string v2, "..ttf"

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :goto_6
    const-string v5, "__LottieInternalDefaultCacheKey__"

    .line 185
    .line 186
    iput-object v12, v6, La/gb2;->j:Ljava/lang/Object;

    .line 187
    .line 188
    iput v13, v6, La/gb2;->l:I

    .line 189
    .line 190
    iput-byte v8, v6, La/gb2;->k:B

    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    invoke-static/range {v0 .. v6}, La/x8x;->r(Landroid/content/Context;La/qa10;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 197
    if-ne v0, v11, :cond_9

    .line 198
    .line 199
    :goto_7
    move-object v10, v11

    .line 200
    goto/16 :goto_c

    .line 201
    .line 202
    :cond_9
    move v1, v13

    .line 203
    :goto_8
    :try_start_2
    check-cast v0, La/fa10;

    .line 204
    .line 205
    iget-object v2, v6, La/gb2;->p:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v2, La/pz40;

    .line 208
    .line 209
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, La/na10;

    .line 214
    .line 215
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 216
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v3, v2, La/na10;->d:La/zbk;

    .line 220
    .line 221
    invoke-virtual {v3}, La/zbk;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 228
    .line 229
    .line 230
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 231
    if-eqz v3, :cond_a

    .line 232
    .line 233
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 234
    goto :goto_9

    .line 235
    :cond_a
    :try_start_5
    iget-object v3, v2, La/na10;->b:La/pz40;

    .line 236
    .line 237
    check-cast v3, La/hgk0;

    .line 238
    .line 239
    invoke-virtual {v3, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v3, v2, La/na10;->a:La/odd;

    .line 243
    .line 244
    invoke-virtual {v3, v0}, La/pby;->N(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 245
    .line 246
    .line 247
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 248
    :goto_9
    move v0, v1

    .line 249
    move-object v1, v12

    .line 250
    goto/16 :goto_1

    .line 251
    .line 252
    :catchall_1
    move-exception v0

    .line 253
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 254
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 255
    :catchall_2
    move-exception v0

    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :goto_a
    add-int/lit8 v0, v13, 0x1

    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_b
    iget-object v0, v6, La/gb2;->p:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, La/pz40;

    .line 265
    .line 266
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, La/na10;

    .line 271
    .line 272
    iget-object v0, v0, La/na10;->d:La/zbk;

    .line 273
    .line 274
    invoke-virtual {v0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-nez v0, :cond_d

    .line 285
    .line 286
    if-eqz v1, :cond_d

    .line 287
    .line 288
    iget-object v0, v6, La/gb2;->p:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, La/pz40;

    .line 291
    .line 292
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    move-object v2, v0

    .line 297
    check-cast v2, La/na10;

    .line 298
    .line 299
    monitor-enter v2

    .line 300
    :try_start_9
    iget-object v0, v2, La/na10;->d:La/zbk;

    .line 301
    .line 302
    invoke-virtual {v0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 312
    if-eqz v0, :cond_c

    .line 313
    .line 314
    monitor-exit v2

    .line 315
    goto :goto_b

    .line 316
    :cond_c
    :try_start_a
    iget-object v0, v2, La/na10;->c:La/pz40;

    .line 317
    .line 318
    check-cast v0, La/hgk0;

    .line 319
    .line 320
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object v0, v2, La/na10;->a:La/odd;

    .line 324
    .line 325
    invoke-virtual {v0, v1}, La/odd;->b0(Ljava/lang/Throwable;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 326
    .line 327
    .line 328
    monitor-exit v2

    .line 329
    goto :goto_b

    .line 330
    :catchall_3
    move-exception v0

    .line 331
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 332
    throw v0

    .line 333
    :cond_d
    :goto_b
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    :goto_c
    return-object v10

    .line 336
    :pswitch_0
    iget-object v0, v6, La/gb2;->m:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, La/w5z;

    .line 339
    .line 340
    iget-object v1, v0, La/w5z;->c:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v1, La/knf0;

    .line 343
    .line 344
    sget-object v2, La/wne;->a:La/wne;

    .line 345
    .line 346
    iget-byte v3, v6, La/gb2;->k:B

    .line 347
    .line 348
    if-eqz v3, :cond_10

    .line 349
    .line 350
    if-eq v3, v7, :cond_f

    .line 351
    .line 352
    if-ne v3, v8, :cond_e

    .line 353
    .line 354
    iget-object v0, v6, La/gb2;->j:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Ljava/util/List;

    .line 357
    .line 358
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    move-object v3, v0

    .line 362
    move-object/from16 v0, p1

    .line 363
    .line 364
    goto/16 :goto_f

    .line 365
    .line 366
    :cond_e
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 367
    .line 368
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_18

    .line 372
    .line 373
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    move-object/from16 v3, p1

    .line 377
    .line 378
    goto :goto_d

    .line 379
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    iget-object v3, v0, La/w5z;->d:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v3, La/sjl0;

    .line 385
    .line 386
    iput-byte v7, v6, La/gb2;->k:B

    .line 387
    .line 388
    invoke-virtual {v3, v6}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    if-ne v3, v2, :cond_11

    .line 393
    .line 394
    goto/16 :goto_e

    .line 395
    .line 396
    :cond_11
    :goto_d
    check-cast v3, Ljava/util/List;

    .line 397
    .line 398
    iget-object v0, v0, La/w5z;->a:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, La/ljf0;

    .line 401
    .line 402
    iget-object v4, v6, La/gb2;->n:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v4, La/ygq0;

    .line 405
    .line 406
    iget-object v5, v6, La/gb2;->o:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v5, Lkotlin/Pair;

    .line 409
    .line 410
    iget v7, v6, La/gb2;->l:I

    .line 411
    .line 412
    invoke-virtual {v1}, La/knf0;->b()I

    .line 413
    .line 414
    .line 415
    move-result v11

    .line 416
    iget-object v12, v6, La/gb2;->p:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v12, Ljava/util/Set;

    .line 419
    .line 420
    check-cast v12, Ljava/lang/Iterable;

    .line 421
    .line 422
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v13

    .line 426
    const-string v14, ","

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const/16 v18, 0x3e

    .line 431
    .line 432
    const/4 v15, 0x0

    .line 433
    const/16 v16, 0x0

    .line 434
    .line 435
    invoke-static/range {v13 .. v18}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 456
    .line 457
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 458
    .line 459
    .line 460
    const-string v14, "country"

    .line 461
    .line 462
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    invoke-virtual {v1, v14, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    if-lez v7, :cond_12

    .line 474
    .line 475
    const-string v7, "countryIds"

    .line 476
    .line 477
    invoke-virtual {v1, v7, v12}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    :cond_12
    sget-object v7, La/ygq0;->p:La/ygq0;

    .line 481
    .line 482
    if-ne v4, v7, :cond_14

    .line 483
    .line 484
    iget-object v12, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 485
    .line 486
    move-object v14, v12

    .line 487
    check-cast v14, Ljava/lang/Number;

    .line 488
    .line 489
    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    .line 490
    .line 491
    .line 492
    move-result-wide v14

    .line 493
    const-wide/16 v16, -0x1

    .line 494
    .line 495
    cmp-long v14, v14, v16

    .line 496
    .line 497
    if-eqz v14, :cond_13

    .line 498
    .line 499
    const-string v14, "dateFrom"

    .line 500
    .line 501
    invoke-virtual {v1, v14, v12}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    :cond_13
    const-string v12, "dateTo"

    .line 505
    .line 506
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 507
    .line 508
    invoke-virtual {v1, v12, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    :cond_14
    const-string v5, "fcountry"

    .line 512
    .line 513
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    invoke-virtual {v1, v5, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    const-string v5, "gr"

    .line 521
    .line 522
    const/16 v11, 0x54d

    .line 523
    .line 524
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v11

    .line 528
    invoke-virtual {v1, v5, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    const-string v5, "lng"

    .line 532
    .line 533
    invoke-virtual {v1, v5, v13}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    sget-object v5, La/ygq0;->c:La/ygq0;

    .line 537
    .line 538
    if-eq v4, v5, :cond_15

    .line 539
    .line 540
    if-eq v4, v7, :cond_15

    .line 541
    .line 542
    const-string v5, "minOffset"

    .line 543
    .line 544
    invoke-static {v4}, La/jpm0;->p(La/ygq0;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-virtual {v1, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    :cond_15
    invoke-static {v1}, La/tlb;->a0(Ljava/util/LinkedHashMap;)V

    .line 552
    .line 553
    .line 554
    const/16 v4, 0x16

    .line 555
    .line 556
    invoke-static {v4, v1}, La/tlb;->m0(ILjava/util/Map;)V

    .line 557
    .line 558
    .line 559
    iput-object v3, v6, La/gb2;->j:Ljava/lang/Object;

    .line 560
    .line 561
    iput-byte v8, v6, La/gb2;->k:B

    .line 562
    .line 563
    iget-object v0, v0, La/ljf0;->a:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, La/enj0;

    .line 566
    .line 567
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    check-cast v0, La/zsl0;

    .line 572
    .line 573
    invoke-interface {v0, v1, v6}, La/zsl0;->a(Ljava/util/LinkedHashMap;La/yje;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    if-ne v0, v2, :cond_16

    .line 578
    .line 579
    :goto_e
    move-object v10, v2

    .line 580
    goto/16 :goto_18

    .line 581
    .line 582
    :cond_16
    :goto_f
    check-cast v0, La/dx5;

    .line 583
    .line 584
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    check-cast v0, Ljava/lang/Iterable;

    .line 589
    .line 590
    new-instance v1, Ljava/util/ArrayList;

    .line 591
    .line 592
    const/16 v2, 0xa

    .line 593
    .line 594
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 599
    .line 600
    .line 601
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    if-eqz v2, :cond_1e

    .line 610
    .line 611
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    check-cast v2, La/vu10;

    .line 616
    .line 617
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    iget-object v4, v2, La/vu10;->a:Ljava/lang/Long;

    .line 621
    .line 622
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    if-eqz v4, :cond_1d

    .line 626
    .line 627
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 628
    .line 629
    .line 630
    move-result-wide v13

    .line 631
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 632
    .line 633
    .line 634
    move-result-object v5

    .line 635
    :cond_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 636
    .line 637
    .line 638
    move-result v6

    .line 639
    if-eqz v6, :cond_18

    .line 640
    .line 641
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v6

    .line 645
    move-object v7, v6

    .line 646
    check-cast v7, La/ril0;

    .line 647
    .line 648
    iget-wide v7, v7, La/ril0;->a:J

    .line 649
    .line 650
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 651
    .line 652
    .line 653
    move-result-wide v11

    .line 654
    cmp-long v7, v7, v11

    .line 655
    .line 656
    if-nez v7, :cond_17

    .line 657
    .line 658
    goto :goto_11

    .line 659
    :cond_18
    move-object v6, v10

    .line 660
    :goto_11
    check-cast v6, La/ril0;

    .line 661
    .line 662
    if-eqz v6, :cond_1a

    .line 663
    .line 664
    iget-object v4, v6, La/ril0;->b:Ljava/lang/String;

    .line 665
    .line 666
    if-nez v4, :cond_19

    .line 667
    .line 668
    goto :goto_13

    .line 669
    :cond_19
    :goto_12
    move-object/from16 v17, v4

    .line 670
    .line 671
    goto :goto_14

    .line 672
    :cond_1a
    :goto_13
    const-string v4, "-"

    .line 673
    .line 674
    goto :goto_12

    .line 675
    :goto_14
    iget-object v4, v2, La/vu10;->h:Ljava/lang/Long;

    .line 676
    .line 677
    if-eqz v4, :cond_1b

    .line 678
    .line 679
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 680
    .line 681
    .line 682
    move-result-wide v4

    .line 683
    :goto_15
    move-wide v15, v4

    .line 684
    goto :goto_16

    .line 685
    :cond_1b
    const-wide/16 v4, 0x0

    .line 686
    .line 687
    goto :goto_15

    .line 688
    :goto_16
    iget-object v2, v2, La/vu10;->e:Ljava/lang/Boolean;

    .line 689
    .line 690
    if-eqz v2, :cond_1c

    .line 691
    .line 692
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 693
    .line 694
    .line 695
    move-result v2

    .line 696
    move/from16 v19, v2

    .line 697
    .line 698
    goto :goto_17

    .line 699
    :cond_1c
    move/from16 v19, v9

    .line 700
    .line 701
    :goto_17
    new-instance v11, La/jkp;

    .line 702
    .line 703
    const/16 v12, 0x30

    .line 704
    .line 705
    const/16 v18, 0x0

    .line 706
    .line 707
    invoke-direct/range {v11 .. v19}, La/jkp;-><init>(IJJLjava/lang/String;Ljava/util/List;Z)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    goto :goto_10

    .line 714
    :cond_1d
    invoke-static {v10}, La/jf4;->k(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    goto :goto_18

    .line 718
    :cond_1e
    move-object v10, v1

    .line 719
    :goto_18
    return-object v10

    .line 720
    :pswitch_1
    iget-object v0, v6, La/gb2;->p:Ljava/lang/Object;

    .line 721
    .line 722
    move-object v11, v0

    .line 723
    check-cast v11, La/hb2;

    .line 724
    .line 725
    iget-object v1, v11, La/hb2;->p:Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;

    .line 726
    .line 727
    iget-object v0, v6, La/gb2;->o:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v0, La/vne;

    .line 730
    .line 731
    sget-object v12, La/wne;->a:La/wne;

    .line 732
    .line 733
    iget-byte v0, v6, La/gb2;->k:B

    .line 734
    .line 735
    const/4 v13, 0x3

    .line 736
    if-eqz v0, :cond_22

    .line 737
    .line 738
    if-eq v0, v7, :cond_21

    .line 739
    .line 740
    if-eq v0, v8, :cond_20

    .line 741
    .line 742
    if-ne v0, v13, :cond_1f

    .line 743
    .line 744
    iget-object v0, v6, La/gb2;->m:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v0, Ljava/util/List;

    .line 747
    .line 748
    iget-object v1, v6, La/gb2;->n:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v1, Ljava/util/Date;

    .line 751
    .line 752
    iget-object v2, v6, La/gb2;->j:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v2, Ljava/util/List;

    .line 755
    .line 756
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    move-object/from16 v20, v2

    .line 760
    .line 761
    goto/16 :goto_20

    .line 762
    .line 763
    :cond_1f
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 764
    .line 765
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_21

    .line 769
    .line 770
    :cond_20
    iget v0, v6, La/gb2;->l:I

    .line 771
    .line 772
    iget-object v1, v6, La/gb2;->n:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v1, Ljava/util/Date;

    .line 775
    .line 776
    iget-object v2, v6, La/gb2;->j:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v2, Ljava/util/List;

    .line 779
    .line 780
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    move-object v14, v2

    .line 784
    move v2, v0

    .line 785
    move-object/from16 v0, p1

    .line 786
    .line 787
    goto/16 :goto_1e

    .line 788
    .line 789
    :cond_21
    iget-object v0, v6, La/gb2;->n:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v0, Ljava/util/Date;

    .line 792
    .line 793
    check-cast v0, La/vne;

    .line 794
    .line 795
    iget-object v0, v6, La/gb2;->j:Ljava/lang/Object;

    .line 796
    .line 797
    move-object v2, v0

    .line 798
    check-cast v2, Ljava/util/List;

    .line 799
    .line 800
    :try_start_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 801
    .line 802
    .line 803
    move-object/from16 v0, p1

    .line 804
    .line 805
    goto :goto_19

    .line 806
    :catchall_4
    move-exception v0

    .line 807
    goto :goto_1b

    .line 808
    :cond_22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    iget-object v0, v11, La/hb2;->q:La/luu;

    .line 812
    .line 813
    iget-object v0, v0, La/luu;->a:La/nok0;

    .line 814
    .line 815
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    :try_start_d
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 820
    .line 821
    iget-object v0, v11, La/hb2;->z:La/reu;

    .line 822
    .line 823
    iput-object v10, v6, La/gb2;->o:Ljava/lang/Object;

    .line 824
    .line 825
    iput-object v2, v6, La/gb2;->j:Ljava/lang/Object;

    .line 826
    .line 827
    iput-object v10, v6, La/gb2;->n:Ljava/lang/Object;

    .line 828
    .line 829
    iput-byte v7, v6, La/gb2;->k:B

    .line 830
    .line 831
    iget-object v0, v0, La/reu;->b:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v0, La/b3c0;

    .line 834
    .line 835
    invoke-virtual {v0, v9, v6}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    if-ne v0, v12, :cond_23

    .line 840
    .line 841
    goto/16 :goto_1f

    .line 842
    .line 843
    :cond_23
    :goto_19
    check-cast v0, La/m2c0;

    .line 844
    .line 845
    iget-object v0, v0, La/m2c0;->c:Ljava/lang/String;

    .line 846
    .line 847
    sget-object v3, La/j0g0;->b:La/e0g0;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 848
    .line 849
    :goto_1a
    move-object v14, v2

    .line 850
    goto :goto_1c

    .line 851
    :goto_1b
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 852
    .line 853
    new-instance v3, La/g0g0;

    .line 854
    .line 855
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 856
    .line 857
    .line 858
    move-object v0, v3

    .line 859
    goto :goto_1a

    .line 860
    :goto_1c
    const-string v2, "0"

    .line 861
    .line 862
    instance-of v3, v0, La/g0g0;

    .line 863
    .line 864
    if-eqz v3, :cond_24

    .line 865
    .line 866
    move-object v0, v2

    .line 867
    :cond_24
    check-cast v0, Ljava/lang/String;

    .line 868
    .line 869
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 870
    .line 871
    .line 872
    move-result v2

    .line 873
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    check-cast v0, La/ab2;

    .line 878
    .line 879
    iget-object v0, v0, La/ab2;->b:Ljava/util/Date;

    .line 880
    .line 881
    if-nez v0, :cond_25

    .line 882
    .line 883
    new-instance v0, Ljava/util/Date;

    .line 884
    .line 885
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 886
    .line 887
    .line 888
    :cond_25
    move-object v3, v0

    .line 889
    iget-object v0, v11, La/hb2;->t:La/cmt;

    .line 890
    .line 891
    iget-object v4, v1, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;->b:Ljava/util/List;

    .line 892
    .line 893
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 894
    .line 895
    .line 896
    move-result-object v4

    .line 897
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v5

    .line 901
    check-cast v5, La/ab2;

    .line 902
    .line 903
    iget-object v5, v5, La/ab2;->b:Ljava/util/Date;

    .line 904
    .line 905
    if-eqz v5, :cond_26

    .line 906
    .line 907
    invoke-static {v5}, La/ntb;->W(Ljava/util/Date;)Z

    .line 908
    .line 909
    .line 910
    move-result v5

    .line 911
    if-nez v5, :cond_26

    .line 912
    .line 913
    goto :goto_1d

    .line 914
    :cond_26
    move v7, v9

    .line 915
    :goto_1d
    iget v5, v1, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;->d:I

    .line 916
    .line 917
    iput-object v10, v6, La/gb2;->o:Ljava/lang/Object;

    .line 918
    .line 919
    iput-object v14, v6, La/gb2;->j:Ljava/lang/Object;

    .line 920
    .line 921
    iput-object v3, v6, La/gb2;->n:Ljava/lang/Object;

    .line 922
    .line 923
    iput v2, v6, La/gb2;->l:I

    .line 924
    .line 925
    iput-byte v8, v6, La/gb2;->k:B

    .line 926
    .line 927
    move-object v1, v4

    .line 928
    move v4, v7

    .line 929
    invoke-virtual/range {v0 .. v6}, La/cmt;->f(Ljava/util/Set;ILjava/util/Date;ZILa/zje;)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    if-ne v0, v12, :cond_27

    .line 934
    .line 935
    goto :goto_1f

    .line 936
    :cond_27
    move-object v1, v3

    .line 937
    :goto_1e
    check-cast v0, Ljava/util/List;

    .line 938
    .line 939
    iget-object v3, v11, La/hb2;->y:La/g2g0;

    .line 940
    .line 941
    new-instance v4, La/w1g0;

    .line 942
    .line 943
    invoke-direct {v4, v0}, La/w1g0;-><init>(Ljava/util/List;)V

    .line 944
    .line 945
    .line 946
    iput-object v10, v6, La/gb2;->o:Ljava/lang/Object;

    .line 947
    .line 948
    iput-object v14, v6, La/gb2;->j:Ljava/lang/Object;

    .line 949
    .line 950
    iput-object v1, v6, La/gb2;->n:Ljava/lang/Object;

    .line 951
    .line 952
    iput-object v0, v6, La/gb2;->m:Ljava/lang/Object;

    .line 953
    .line 954
    iput v2, v6, La/gb2;->l:I

    .line 955
    .line 956
    iput-byte v13, v6, La/gb2;->k:B

    .line 957
    .line 958
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    invoke-virtual {v3, v4, v6}, La/g2g0;->i(La/d2g0;La/zje;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    if-ne v2, v12, :cond_28

    .line 966
    .line 967
    :goto_1f
    move-object v10, v12

    .line 968
    goto :goto_21

    .line 969
    :cond_28
    move-object/from16 v20, v14

    .line 970
    .line 971
    :goto_20
    sget v2, La/hb2;->E:I

    .line 972
    .line 973
    iget-object v2, v11, La/i3t0;->i:La/ocj;

    .line 974
    .line 975
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 976
    .line 977
    :cond_29
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    move-object v12, v3

    .line 985
    check-cast v12, La/ab2;

    .line 986
    .line 987
    new-instance v4, La/xa2;

    .line 988
    .line 989
    invoke-direct {v4, v1, v0}, La/xa2;-><init>(Ljava/util/Date;Ljava/util/List;)V

    .line 990
    .line 991
    .line 992
    const/16 v22, 0x0

    .line 993
    .line 994
    const v23, 0xf1ef

    .line 995
    .line 996
    .line 997
    const/4 v13, 0x0

    .line 998
    const/4 v14, 0x0

    .line 999
    const/4 v15, 0x0

    .line 1000
    const/16 v17, 0x0

    .line 1001
    .line 1002
    const/16 v18, 0x0

    .line 1003
    .line 1004
    const/16 v19, 0x1

    .line 1005
    .line 1006
    const/16 v21, 0x0

    .line 1007
    .line 1008
    move-object/from16 v16, v4

    .line 1009
    .line 1010
    invoke-static/range {v12 .. v23}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v4

    .line 1014
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    if-eqz v3, :cond_29

    .line 1019
    .line 1020
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1021
    .line 1022
    :goto_21
    return-object v10

    .line 1023
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
