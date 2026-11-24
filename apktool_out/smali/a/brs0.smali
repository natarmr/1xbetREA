.class public final La/brs0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/krs0;


# direct methods
.method public synthetic constructor <init>(La/krs0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/brs0;->i:B

    iput-object p1, p0, La/brs0;->l:La/krs0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/brs0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/brs0;->l:La/krs0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/brs0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/brs0;-><init>(La/krs0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/brs0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/brs0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/brs0;-><init>(La/krs0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/brs0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/brs0;->i:B

    .line 2
    .line 3
    check-cast p1, La/ghs0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/brs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/brs0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/brs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/brs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/brs0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/brs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/brs0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v5, v0, La/brs0;->l:La/krs0;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v7, v0, La/brs0;->j:B

    .line 18
    .line 19
    if-eqz v7, :cond_2

    .line 20
    .line 21
    if-eq v7, v3, :cond_1

    .line 22
    .line 23
    if-ne v7, v4, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_8

    .line 29
    .line 30
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_9

    .line 34
    .line 35
    :cond_1
    iget-object v2, v0, La/brs0;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, La/ghs0;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v7, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, La/brs0;->k:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, La/ghs0;

    .line 51
    .line 52
    iput-object v2, v0, La/brs0;->k:Ljava/lang/Object;

    .line 53
    .line 54
    iput-byte v3, v0, La/brs0;->j:B

    .line 55
    .line 56
    invoke-interface {v2, v0}, La/ghs0;->c(La/bnn0;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    if-ne v7, v1, :cond_3

    .line 61
    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_3
    :goto_0
    check-cast v7, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_4

    .line 71
    .line 72
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :cond_4
    iget-object v7, v5, La/krs0;->h:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, La/o24;

    .line 79
    .line 80
    iget-object v8, v7, La/o24;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v8, [J

    .line 83
    .line 84
    iget-object v9, v7, La/o24;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v9, Ljava/util/concurrent/locks/ReentrantLock;

    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 89
    .line 90
    .line 91
    :try_start_0
    iget-boolean v10, v7, La/o24;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    if-nez v10, :cond_5

    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 96
    .line 97
    .line 98
    move-object v12, v6

    .line 99
    goto :goto_6

    .line 100
    :cond_5
    const/4 v10, 0x0

    .line 101
    :try_start_1
    iput-boolean v10, v7, La/o24;->a:Z

    .line 102
    .line 103
    array-length v11, v8

    .line 104
    new-array v12, v11, [La/ae60;

    .line 105
    .line 106
    move v13, v10

    .line 107
    move v14, v13

    .line 108
    :goto_1
    if-ge v13, v11, :cond_9

    .line 109
    .line 110
    aget-wide v15, v8, v13

    .line 111
    .line 112
    const-wide/16 v17, 0x0

    .line 113
    .line 114
    cmp-long v15, v15, v17

    .line 115
    .line 116
    if-lez v15, :cond_6

    .line 117
    .line 118
    move v15, v3

    .line 119
    goto :goto_2

    .line 120
    :cond_6
    move v15, v10

    .line 121
    :goto_2
    iget-object v10, v7, La/o24;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v10, [Z

    .line 124
    .line 125
    aget-boolean v3, v10, v13

    .line 126
    .line 127
    if-eq v15, v3, :cond_8

    .line 128
    .line 129
    aput-boolean v15, v10, v13

    .line 130
    .line 131
    if-eqz v15, :cond_7

    .line 132
    .line 133
    sget-object v3, La/ae60;->b:La/ae60;

    .line 134
    .line 135
    :goto_3
    const/4 v14, 0x1

    .line 136
    goto :goto_4

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    goto :goto_a

    .line 139
    :cond_7
    sget-object v3, La/ae60;->c:La/ae60;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    sget-object v3, La/ae60;->a:La/ae60;

    .line 143
    .line 144
    :goto_4
    aput-object v3, v12, v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    add-int/lit8 v13, v13, 0x1

    .line 147
    .line 148
    const/4 v3, 0x1

    .line 149
    const/4 v10, 0x0

    .line 150
    goto :goto_1

    .line 151
    :cond_9
    if-eqz v14, :cond_a

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_a
    move-object v12, v6

    .line 155
    :goto_5
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 156
    .line 157
    .line 158
    :goto_6
    if-eqz v12, :cond_b

    .line 159
    .line 160
    sget-object v3, La/ehs0;->b:La/ehs0;

    .line 161
    .line 162
    new-instance v7, La/irs0;

    .line 163
    .line 164
    invoke-direct {v7, v12, v5, v2, v6}, La/irs0;-><init>([La/ae60;La/krs0;La/ghs0;La/yje;)V

    .line 165
    .line 166
    .line 167
    iput-object v6, v0, La/brs0;->k:Ljava/lang/Object;

    .line 168
    .line 169
    iput-byte v4, v0, La/brs0;->j:B

    .line 170
    .line 171
    invoke-interface {v2, v3, v7, v0}, La/ghs0;->a(La/ehs0;Lkotlin/jvm/functions/Function2;La/bnn0;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-ne v0, v1, :cond_b

    .line 176
    .line 177
    :goto_7
    move-object v6, v1

    .line 178
    goto :goto_9

    .line 179
    :cond_b
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    :goto_9
    return-object v6

    .line 182
    :goto_a
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 187
    .line 188
    iget-byte v3, v0, La/brs0;->j:B

    .line 189
    .line 190
    if-eqz v3, :cond_e

    .line 191
    .line 192
    const/4 v7, 0x1

    .line 193
    if-eq v3, v7, :cond_d

    .line 194
    .line 195
    if-ne v3, v4, :cond_c

    .line 196
    .line 197
    :try_start_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 198
    .line 199
    .line 200
    move-object/from16 v0, p1

    .line 201
    .line 202
    goto :goto_d

    .line 203
    :cond_c
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    goto :goto_e

    .line 207
    :cond_d
    iget-object v2, v0, La/brs0;->k:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v2, La/ghs0;

    .line 210
    .line 211
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    move-object/from16 v3, p1

    .line 215
    .line 216
    goto :goto_b

    .line 217
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iget-object v2, v0, La/brs0;->k:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v2, La/ghs0;

    .line 223
    .line 224
    iput-object v2, v0, La/brs0;->k:Ljava/lang/Object;

    .line 225
    .line 226
    const/4 v7, 0x1

    .line 227
    iput-byte v7, v0, La/brs0;->j:B

    .line 228
    .line 229
    invoke-interface {v2, v0}, La/ghs0;->c(La/bnn0;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    if-ne v3, v1, :cond_f

    .line 234
    .line 235
    goto :goto_c

    .line 236
    :cond_f
    :goto_b
    check-cast v3, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    if-eqz v3, :cond_10

    .line 243
    .line 244
    sget-object v6, La/xun;->a:La/xun;

    .line 245
    .line 246
    goto :goto_e

    .line 247
    :cond_10
    :try_start_3
    sget-object v3, La/ehs0;->b:La/ehs0;

    .line 248
    .line 249
    new-instance v7, La/meq0;

    .line 250
    .line 251
    const/16 v8, 0x17

    .line 252
    .line 253
    invoke-direct {v7, v5, v6, v8}, La/meq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 254
    .line 255
    .line 256
    iput-object v6, v0, La/brs0;->k:Ljava/lang/Object;

    .line 257
    .line 258
    iput-byte v4, v0, La/brs0;->j:B

    .line 259
    .line 260
    invoke-interface {v2, v3, v7, v0}, La/ghs0;->a(La/ehs0;Lkotlin/jvm/functions/Function2;La/bnn0;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-ne v0, v1, :cond_11

    .line 265
    .line 266
    :goto_c
    move-object v6, v1

    .line 267
    goto :goto_e

    .line 268
    :cond_11
    :goto_d
    move-object v6, v0

    .line 269
    check-cast v6, Ljava/util/Set;
    :try_end_3
    .catch Landroid/database/SQLException; {:try_start_3 .. :try_end_3} :catch_0

    .line 270
    .line 271
    goto :goto_e

    .line 272
    :catch_0
    sget-object v6, La/xun;->a:La/xun;

    .line 273
    .line 274
    :goto_e
    return-object v6

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
