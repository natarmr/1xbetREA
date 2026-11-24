.class public final La/lbp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ccp;


# direct methods
.method public synthetic constructor <init>(La/ccp;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lbp;->i:B

    iput-object p1, p0, La/lbp;->k:La/ccp;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lbp;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lbp;->k:La/ccp;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/lbp;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/lbp;-><init>(La/ccp;La/yje;B)V

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
    iput-boolean p0, v0, La/lbp;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/lbp;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/lbp;-><init>(La/ccp;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/lbp;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/lbp;-><init>(La/ccp;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lbp;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lbp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/lbp;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/lbp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/lbp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/lbp;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/lbp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/lbp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/lbp;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/lbp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lbp;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/lbp;->k:La/ccp;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v15, v0, La/lbp;->j:Z

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v0, La/ccp;->u0:I

    .line 22
    .line 23
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v6, v2

    .line 35
    check-cast v6, La/dd80;

    .line 36
    .line 37
    const/4 v14, 0x0

    .line 38
    const/16 v16, 0xfff

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    invoke-static/range {v6 .. v16}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    if-eqz v15, :cond_2

    .line 58
    .line 59
    iget-object v0, v5, La/ccp;->q0:La/bby;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-ne v0, v4, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v5}, La/ccp;->S()V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    :goto_0
    if-nez v15, :cond_4

    .line 75
    .line 76
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/dd80;

    .line 81
    .line 82
    iget-object v0, v0, La/dd80;->h:La/hc80;

    .line 83
    .line 84
    instance-of v0, v0, La/gc80;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 89
    .line 90
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-object v2, v1

    .line 98
    check-cast v2, La/dd80;

    .line 99
    .line 100
    new-instance v9, La/dc80;

    .line 101
    .line 102
    new-instance v3, Ljava/net/UnknownHostException;

    .line 103
    .line 104
    invoke-direct {v3}, Ljava/net/UnknownHostException;-><init>()V

    .line 105
    .line 106
    .line 107
    sget-object v4, La/iun;->a:La/iun;

    .line 108
    .line 109
    invoke-direct {v9, v3, v4}, La/dc80;-><init>(Ljava/lang/Throwable;Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    const/4 v11, 0x0

    .line 113
    const/16 v12, 0x1f3f

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v5, 0x0

    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    const/4 v8, 0x1

    .line 121
    const/4 v10, 0x0

    .line 122
    invoke-static/range {v2 .. v12}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 136
    .line 137
    iget-boolean v6, v0, La/lbp;->j:Z

    .line 138
    .line 139
    if-eqz v6, :cond_6

    .line 140
    .line 141
    if-ne v6, v4, :cond_5

    .line 142
    .line 143
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget v2, La/ccp;->u0:I

    .line 155
    .line 156
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 157
    .line 158
    iget-object v6, v2, La/ocj;->a:La/p7m0;

    .line 159
    .line 160
    :cond_7
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-object v7, v2

    .line 168
    check-cast v7, La/dd80;

    .line 169
    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    const/16 v17, 0x1ffd

    .line 173
    .line 174
    const/4 v8, 0x1

    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v10, 0x0

    .line 177
    const/4 v11, 0x0

    .line 178
    const/4 v12, 0x0

    .line 179
    const/4 v13, 0x0

    .line 180
    const/4 v14, 0x0

    .line 181
    const/4 v15, 0x0

    .line 182
    invoke-static/range {v7 .. v17}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v6, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_7

    .line 191
    .line 192
    iget-object v2, v5, La/ccp;->B:La/kqc;

    .line 193
    .line 194
    iput-boolean v4, v0, La/lbp;->j:Z

    .line 195
    .line 196
    iget-object v2, v2, La/kqc;->b:La/pbt;

    .line 197
    .line 198
    invoke-virtual {v2, v0}, La/pbt;->b(La/zje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-ne v0, v1, :cond_8

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    :goto_2
    if-ne v0, v1, :cond_9

    .line 208
    .line 209
    move-object v2, v1

    .line 210
    goto :goto_4

    .line 211
    :cond_9
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_4
    return-object v2

    .line 214
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 215
    .line 216
    iget-boolean v6, v0, La/lbp;->j:Z

    .line 217
    .line 218
    if-eqz v6, :cond_b

    .line 219
    .line 220
    if-ne v6, v4, :cond_a

    .line 221
    .line 222
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    sget v2, La/ccp;->u0:I

    .line 234
    .line 235
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 236
    .line 237
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 238
    .line 239
    :cond_c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-object v6, v3

    .line 247
    check-cast v6, La/dd80;

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    const/16 v16, 0x1ffd

    .line 251
    .line 252
    const/4 v7, 0x1

    .line 253
    const/4 v8, 0x0

    .line 254
    const/4 v9, 0x0

    .line 255
    const/4 v10, 0x0

    .line 256
    const/4 v11, 0x0

    .line 257
    const/4 v12, 0x0

    .line 258
    const/4 v13, 0x0

    .line 259
    const/4 v14, 0x0

    .line 260
    invoke-static/range {v6 .. v16}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {v2, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_c

    .line 269
    .line 270
    iget-object v2, v5, La/ccp;->r:La/peg0;

    .line 271
    .line 272
    sget-object v3, La/a7p;->a:La/a7p;

    .line 273
    .line 274
    iput-boolean v4, v0, La/lbp;->j:Z

    .line 275
    .line 276
    invoke-virtual {v2, v0}, La/peg0;->p(La/bnn0;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-ne v0, v1, :cond_d

    .line 281
    .line 282
    move-object v2, v1

    .line 283
    goto :goto_6

    .line 284
    :cond_d
    :goto_5
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    :goto_6
    return-object v2

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
