.class public final La/vj5;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dk5;


# direct methods
.method public synthetic constructor <init>(La/dk5;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vj5;->i:B

    iput-object p1, p0, La/vj5;->k:La/dk5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vj5;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vj5;->k:La/dk5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/vj5;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/vj5;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/vj5;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/vj5;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/vj5;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/vj5;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/vj5;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/vj5;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/vj5;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/vj5;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vj5;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/fl80;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/vj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vj5;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/w9h0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/vj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/vj5;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/vj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/ql5;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/vj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/vj5;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/vj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/fl80;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/vj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/vj5;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/vj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/w9h0;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/vj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/vj5;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/vj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vj5;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/vj5;->k:La/dk5;

    .line 8
    .line 9
    iget-object v0, v0, La/vj5;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v8, v0

    .line 15
    check-cast v8, La/fl80;

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v4, La/dk5;->i0:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {v0, v8}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v4, La/dk5;->h0:La/p7m0;

    .line 28
    .line 29
    iget-object v1, v4, La/dk5;->B:La/ctf0;

    .line 30
    .line 31
    invoke-virtual {v1}, La/ctf0;->h()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v4}, La/dk5;->S()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    iget-object v11, v4, La/dk5;->i0:La/p7m0;

    .line 40
    .line 41
    iget-object v12, v4, La/dk5;->t:La/g2v;

    .line 42
    .line 43
    sget-object v14, La/pb10;->g:La/pb10;

    .line 44
    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    const/16 v19, 0x15e

    .line 48
    .line 49
    move-object v13, v14

    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const v16, 0x7f130677

    .line 53
    .line 54
    .line 55
    const v17, 0x7f131690

    .line 56
    .line 57
    .line 58
    invoke-static/range {v12 .. v19}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    iget-object v1, v4, La/dk5;->u:La/ocl;

    .line 63
    .line 64
    const-wide/16 v22, 0x0

    .line 65
    .line 66
    const/16 v24, 0x25e

    .line 67
    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const v18, 0x7f130677

    .line 73
    .line 74
    .line 75
    const v19, 0x7f131690

    .line 76
    .line 77
    .line 78
    const-wide/16 v20, 0x2710

    .line 79
    .line 80
    move-object v14, v13

    .line 81
    move-object v13, v1

    .line 82
    invoke-static/range {v13 .. v24}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    new-instance v5, La/mk5;

    .line 87
    .line 88
    invoke-direct/range {v5 .. v11}, La/mk5;-><init>(ZZLa/fl80;La/jkm;La/mdm;La/p7m0;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_0
    check-cast v0, La/w9h0;

    .line 101
    .line 102
    sget-object v1, La/wne;->a:La/wne;

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v0}, La/dk5;->R(La/w9h0;)La/vk5;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    instance-of v1, v0, La/ues0;

    .line 112
    .line 113
    if-eqz v1, :cond_0

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_0
    instance-of v1, v0, La/tds0;

    .line 117
    .line 118
    if-eqz v1, :cond_1

    .line 119
    .line 120
    :goto_0
    iget-object v1, v4, La/dk5;->a0:La/p7m0;

    .line 121
    .line 122
    new-instance v5, La/oi5;

    .line 123
    .line 124
    iget-object v4, v4, La/dk5;->B:La/ctf0;

    .line 125
    .line 126
    new-array v2, v2, [Ljava/lang/Object;

    .line 127
    .line 128
    const v6, 0x7f130156

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v6, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-direct {v5, v2}, La/oi5;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v3, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_1
    return-object v0

    .line 145
    :pswitch_1
    check-cast v0, La/ql5;

    .line 146
    .line 147
    sget-object v1, La/wne;->a:La/wne;

    .line 148
    .line 149
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v4, La/dk5;->Q:La/ql5;

    .line 153
    .line 154
    if-eqz v1, :cond_2

    .line 155
    .line 156
    iget-wide v5, v1, La/ql5;->a:J

    .line 157
    .line 158
    iget-wide v0, v0, La/ql5;->a:J

    .line 159
    .line 160
    cmp-long v0, v5, v0

    .line 161
    .line 162
    if-eqz v0, :cond_2

    .line 163
    .line 164
    iget-object v0, v4, La/dk5;->o:La/vqc;

    .line 165
    .line 166
    iget-object v0, v0, La/vqc;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, La/nhf0;

    .line 169
    .line 170
    iget-object v0, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/vi5;

    .line 173
    .line 174
    sget-object v1, La/iun;->a:La/iun;

    .line 175
    .line 176
    iput-object v1, v0, La/vi5;->b:Ljava/util/List;

    .line 177
    .line 178
    iput-boolean v2, v0, La/vi5;->c:Z

    .line 179
    .line 180
    invoke-virtual {v4}, La/dk5;->z()V

    .line 181
    .line 182
    .line 183
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_2
    move-object v8, v0

    .line 187
    check-cast v8, La/fl80;

    .line 188
    .line 189
    sget-object v0, La/wne;->a:La/wne;

    .line 190
    .line 191
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, v4, La/dk5;->i0:La/p7m0;

    .line 195
    .line 196
    invoke-virtual {v0, v8}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, v4, La/dk5;->h0:La/p7m0;

    .line 200
    .line 201
    iget-object v1, v4, La/dk5;->B:La/ctf0;

    .line 202
    .line 203
    invoke-virtual {v1}, La/ctf0;->h()Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-virtual {v4}, La/dk5;->S()Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    iget-object v11, v4, La/dk5;->i0:La/p7m0;

    .line 212
    .line 213
    iget-object v12, v4, La/dk5;->t:La/g2v;

    .line 214
    .line 215
    sget-object v14, La/pb10;->g:La/pb10;

    .line 216
    .line 217
    const/16 v18, 0x0

    .line 218
    .line 219
    const/16 v19, 0x15e

    .line 220
    .line 221
    move-object v13, v14

    .line 222
    const/4 v14, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    const v16, 0x7f130677

    .line 225
    .line 226
    .line 227
    const v17, 0x7f131690

    .line 228
    .line 229
    .line 230
    invoke-static/range {v12 .. v19}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    iget-object v1, v4, La/dk5;->u:La/ocl;

    .line 235
    .line 236
    const-wide/16 v22, 0x0

    .line 237
    .line 238
    const/16 v24, 0x25e

    .line 239
    .line 240
    const/16 v16, 0x0

    .line 241
    .line 242
    const/16 v17, 0x0

    .line 243
    .line 244
    const v18, 0x7f130677

    .line 245
    .line 246
    .line 247
    const v19, 0x7f131690

    .line 248
    .line 249
    .line 250
    const-wide/16 v20, 0x2710

    .line 251
    .line 252
    move-object v14, v13

    .line 253
    move-object v13, v1

    .line 254
    invoke-static/range {v13 .. v24}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    new-instance v5, La/mk5;

    .line 259
    .line 260
    invoke-direct/range {v5 .. v11}, La/mk5;-><init>(ZZLa/fl80;La/jkm;La/mdm;La/p7m0;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v3, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_3
    check-cast v0, La/w9h0;

    .line 273
    .line 274
    sget-object v1, La/wne;->a:La/wne;

    .line 275
    .line 276
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v0}, La/dk5;->R(La/w9h0;)La/vk5;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    return-object v0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
