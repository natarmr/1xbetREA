.class public final La/sya;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/uya;


# direct methods
.method public synthetic constructor <init>(La/uya;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sya;->i:B

    iput-object p1, p0, La/sya;->k:La/uya;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sya;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/sya;->k:La/uya;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/sya;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/sya;-><init>(La/uya;La/yje;B)V

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
    iput-boolean p0, v0, La/sya;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/sya;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/sya;-><init>(La/uya;La/yje;B)V

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
    iget-byte v0, p0, La/sya;->i:B

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
    invoke-virtual {p0, p1, p2}, La/sya;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/sya;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/sya;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/sya;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/sya;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/sya;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sya;->i:B

    .line 4
    .line 5
    iget-object v3, v0, La/sya;->k:La/uya;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean v9, v0, La/sya;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v3, La/i3t0;->f:La/oyg0;

    .line 18
    .line 19
    sget v0, La/uya;->D:I

    .line 20
    .line 21
    iget-object v15, v3, La/i3t0;->i:La/ocj;

    .line 22
    .line 23
    iget-object v0, v15, La/ocj;->a:La/p7m0;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v5, v4

    .line 33
    move-object v4, v5

    .line 34
    check-cast v4, La/kya;

    .line 35
    .line 36
    const/4 v13, 0x0

    .line 37
    const/16 v14, 0x3bf

    .line 38
    .line 39
    move-object v6, v5

    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v7, v6

    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v8, v7

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v10, v8

    .line 46
    const/4 v8, 0x0

    .line 47
    move-object v11, v10

    .line 48
    const/4 v10, 0x0

    .line 49
    move-object/from16 v16, v11

    .line 50
    .line 51
    const-wide/16 v11, 0x0

    .line 52
    .line 53
    move-object/from16 v2, v16

    .line 54
    .line 55
    invoke-static/range {v4 .. v14}, La/kya;->a(La/kya;La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZJLjava/lang/Throwable;I)La/kya;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/kya;

    .line 70
    .line 71
    iget-object v0, v0, La/kya;->d:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, La/kya;

    .line 78
    .line 79
    iget-boolean v2, v2, La/kya;->f:Z

    .line 80
    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/kya;

    .line 88
    .line 89
    iget-object v2, v2, La/kya;->a:La/a4x;

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_1

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const/4 v2, 0x0

    .line 100
    :goto_0
    if-nez v9, :cond_3

    .line 101
    .line 102
    if-nez v2, :cond_7

    .line 103
    .line 104
    iget-object v0, v15, La/ocj;->a:La/p7m0;

    .line 105
    .line 106
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-object v3, v2

    .line 114
    check-cast v3, La/kya;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v12, Ljava/net/UnknownHostException;

    .line 120
    .line 121
    invoke-direct {v12}, Ljava/net/UnknownHostException;-><init>()V

    .line 122
    .line 123
    .line 124
    const/16 v13, 0x1ff

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v5, 0x0

    .line 128
    const/4 v6, 0x0

    .line 129
    const/4 v7, 0x0

    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    const-wide/16 v10, 0x0

    .line 133
    .line 134
    invoke-static/range {v3 .. v13}, La/kya;->a(La/kya;La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZJLjava/lang/Throwable;I)La/kya;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    if-eqz v9, :cond_4

    .line 146
    .line 147
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, La/kya;

    .line 152
    .line 153
    iget-boolean v1, v1, La/kya;->f:Z

    .line 154
    .line 155
    if-nez v1, :cond_4

    .line 156
    .line 157
    invoke-virtual {v3}, La/uya;->N()V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    if-eqz v9, :cond_5

    .line 162
    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    invoke-virtual {v3, v0}, La/uya;->O(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    if-eqz v9, :cond_7

    .line 170
    .line 171
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, La/kya;

    .line 176
    .line 177
    iget-boolean v0, v0, La/kya;->f:Z

    .line 178
    .line 179
    if-eqz v0, :cond_7

    .line 180
    .line 181
    iget-object v0, v15, La/ocj;->a:La/p7m0;

    .line 182
    .line 183
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-object v2, v1

    .line 191
    check-cast v2, La/kya;

    .line 192
    .line 193
    const/4 v11, 0x0

    .line 194
    const/16 v12, 0x1ff

    .line 195
    .line 196
    const/4 v3, 0x0

    .line 197
    const/4 v4, 0x0

    .line 198
    const/4 v5, 0x0

    .line 199
    const/4 v6, 0x0

    .line 200
    const/4 v7, 0x0

    .line 201
    const/4 v8, 0x0

    .line 202
    const-wide/16 v9, 0x0

    .line 203
    .line 204
    invoke-static/range {v2 .. v12}, La/kya;->a(La/kya;La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZJLjava/lang/Throwable;I)La/kya;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_6

    .line 213
    .line 214
    :cond_7
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 218
    .line 219
    iget-boolean v2, v0, La/sya;->j:Z

    .line 220
    .line 221
    if-eqz v2, :cond_9

    .line 222
    .line 223
    const/4 v4, 0x1

    .line 224
    if-ne v2, v4, :cond_8

    .line 225
    .line 226
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v0, p1

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_8
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 233
    .line 234
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    goto :goto_3

    .line 239
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v2, v3, La/uya;->s:La/cu;

    .line 243
    .line 244
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    check-cast v4, La/kya;

    .line 249
    .line 250
    iget-wide v4, v4, La/kya;->i:J

    .line 251
    .line 252
    const/4 v6, 0x1

    .line 253
    iput-boolean v6, v0, La/sya;->j:Z

    .line 254
    .line 255
    invoke-virtual {v2, v4, v5, v0}, La/cu;->k(JLa/zje;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-ne v0, v1, :cond_a

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_a
    :goto_2
    check-cast v0, Ljava/util/List;

    .line 263
    .line 264
    sget v1, La/uya;->D:I

    .line 265
    .line 266
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 267
    .line 268
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 269
    .line 270
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-object v3, v2

    .line 278
    check-cast v3, La/kya;

    .line 279
    .line 280
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    const/4 v12, 0x0

    .line 293
    const/16 v13, 0x15c

    .line 294
    .line 295
    const/4 v6, 0x0

    .line 296
    const/4 v7, 0x0

    .line 297
    const/4 v8, 0x0

    .line 298
    const-wide/16 v10, 0x0

    .line 299
    .line 300
    invoke-static/range {v3 .. v13}, La/kya;->a(La/kya;La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZJLjava/lang/Throwable;I)La/kya;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_b

    .line 309
    .line 310
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    :goto_3
    return-object v1

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
