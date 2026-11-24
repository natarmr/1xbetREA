.class public final La/tj3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tj3;->i:B

    iput-object p1, p0, La/tj3;->k:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tj3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tj3;->k:Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tj3;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/tj3;-><init>(Ljava/lang/String;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/tj3;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/tj3;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/tj3;-><init>(Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/tj3;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/tj3;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/tj3;-><init>(Ljava/lang/String;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/tj3;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/tj3;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/tj3;-><init>(Ljava/lang/String;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/tj3;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tj3;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vb6;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/tj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tj3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hfp;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/tj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/tj3;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/tj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/qpg0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/tj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/tj3;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/tj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/qpg0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/tj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/tj3;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/tj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tj3;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v4, v0, La/tj3;->k:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, v0, La/tj3;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/vb6;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/vb6;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_0
    check-cast v0, La/hfp;

    .line 32
    .line 33
    sget-object v1, La/wne;->a:La/wne;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, La/hfp;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_1
    check-cast v0, La/qpg0;

    .line 50
    .line 51
    sget-object v1, La/wne;->a:La/wne;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const-string v1, "select * from currencies where code = ?"

    .line 57
    .line 58
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :try_start_0
    invoke-interface {v1, v2, v4}, La/xpg0;->z(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v0, "id"

    .line 66
    .line 67
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const-string v4, "code"

    .line 72
    .line 73
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    const-string v5, "name"

    .line 78
    .line 79
    invoke-static {v1, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const-string v6, "top"

    .line 84
    .line 85
    invoke-static {v1, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    const-string v7, "ruble_to_currency_rate"

    .line 90
    .line 91
    invoke-static {v1, v7}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    const-string v8, "symbol"

    .line 96
    .line 97
    invoke-static {v1, v8}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    const-string v9, "min_out_deposit"

    .line 102
    .line 103
    invoke-static {v1, v9}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    const-string v10, "min_out_deposit_electron"

    .line 108
    .line 109
    invoke-static {v1, v10}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    const-string v11, "min_sum_bets"

    .line 114
    .line 115
    invoke-static {v1, v11}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    const-string v12, "round"

    .line 120
    .line 121
    invoke-static {v1, v12}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v12

    .line 125
    const-string v13, "registration_hidden"

    .line 126
    .line 127
    invoke-static {v1, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    const-string v14, "crypto"

    .line 132
    .line 133
    invoke-static {v1, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    const-string v15, "initialBet"

    .line 138
    .line 139
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    const-string v3, "betStep"

    .line 144
    .line 145
    invoke-static {v1, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 150
    .line 151
    .line 152
    move-result v16

    .line 153
    if-eqz v16, :cond_3

    .line 154
    .line 155
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 156
    .line 157
    .line 158
    move-result-wide v18

    .line 159
    invoke-interface {v1, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v20

    .line 163
    invoke-interface {v1, v5}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v21

    .line 167
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    long-to-int v0, v4

    .line 172
    if-eqz v0, :cond_0

    .line 173
    .line 174
    move/from16 v22, v2

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_0
    const/16 v22, 0x0

    .line 178
    .line 179
    :goto_0
    invoke-interface {v1, v7}, La/xpg0;->getDouble(I)D

    .line 180
    .line 181
    .line 182
    move-result-wide v23

    .line 183
    invoke-interface {v1, v8}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v25

    .line 187
    invoke-interface {v1, v9}, La/xpg0;->getDouble(I)D

    .line 188
    .line 189
    .line 190
    move-result-wide v26

    .line 191
    invoke-interface {v1, v10}, La/xpg0;->getDouble(I)D

    .line 192
    .line 193
    .line 194
    move-result-wide v28

    .line 195
    invoke-interface {v1, v11}, La/xpg0;->getDouble(I)D

    .line 196
    .line 197
    .line 198
    move-result-wide v30

    .line 199
    invoke-interface {v1, v12}, La/xpg0;->getLong(I)J

    .line 200
    .line 201
    .line 202
    move-result-wide v4

    .line 203
    long-to-int v0, v4

    .line 204
    invoke-interface {v1, v13}, La/xpg0;->getLong(I)J

    .line 205
    .line 206
    .line 207
    move-result-wide v4

    .line 208
    long-to-int v4, v4

    .line 209
    if-eqz v4, :cond_1

    .line 210
    .line 211
    move/from16 v33, v2

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_1
    const/16 v33, 0x0

    .line 215
    .line 216
    :goto_1
    invoke-interface {v1, v14}, La/xpg0;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v4

    .line 220
    long-to-int v4, v4

    .line 221
    if-eqz v4, :cond_2

    .line 222
    .line 223
    move/from16 v34, v2

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_2
    const/16 v34, 0x0

    .line 227
    .line 228
    :goto_2
    invoke-interface {v1, v15}, La/xpg0;->getDouble(I)D

    .line 229
    .line 230
    .line 231
    move-result-wide v35

    .line 232
    invoke-interface {v1, v3}, La/xpg0;->getDouble(I)D

    .line 233
    .line 234
    .line 235
    move-result-wide v37

    .line 236
    new-instance v17, La/tuf;

    .line 237
    .line 238
    move/from16 v32, v0

    .line 239
    .line 240
    invoke-direct/range {v17 .. v38}, La/tuf;-><init>(JLjava/lang/String;Ljava/lang/String;ZDLjava/lang/String;DDDIZZDD)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    .line 242
    .line 243
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 244
    .line 245
    .line 246
    return-object v17

    .line 247
    :catchall_0
    move-exception v0

    .line 248
    goto :goto_3

    .line 249
    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 250
    .line 251
    const-string v2, "The query result was empty, but expected a single row to return a NON-NULL object of type \'org.xplatform.onexdatabase.entity.CurrencyEntity\'."

    .line 252
    .line 253
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    :goto_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 258
    .line 259
    .line 260
    throw v0

    .line 261
    :pswitch_2
    check-cast v0, La/qpg0;

    .line 262
    .line 263
    sget-object v1, La/wne;->a:La/wne;

    .line 264
    .line 265
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    const-string v1, "select `key`, value from strings where locale = ?"

    .line 269
    .line 270
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    :try_start_2
    invoke-interface {v1, v2, v4}, La/xpg0;->z(ILjava/lang/String;)V

    .line 275
    .line 276
    .line 277
    new-instance v0, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    :goto_4
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-eqz v3, :cond_4

    .line 287
    .line 288
    const/4 v3, 0x0

    .line 289
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    new-instance v6, La/pj3;

    .line 298
    .line 299
    invoke-direct {v6, v4, v5}, La/pj3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :catchall_1
    move-exception v0

    .line 307
    goto :goto_5

    .line 308
    :cond_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 309
    .line 310
    .line 311
    return-object v0

    .line 312
    :goto_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 313
    .line 314
    .line 315
    throw v0

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
