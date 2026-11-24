.class public final La/vsa0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ata0;

.field public final synthetic l:La/xgl0;


# direct methods
.method public synthetic constructor <init>(La/ata0;La/xgl0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/vsa0;->i:B

    iput-object p1, p0, La/vsa0;->k:La/ata0;

    iput-object p2, p0, La/vsa0;->l:La/xgl0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/vsa0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/vsa0;->l:La/xgl0;

    .line 4
    .line 5
    iget-object p0, p0, La/vsa0;->k:La/ata0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/vsa0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p1, v2}, La/vsa0;-><init>(La/ata0;La/xgl0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/vsa0;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, p0, v1, p1, v2}, La/vsa0;-><init>(La/ata0;La/xgl0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vsa0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/vsa0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/vsa0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/vsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/vsa0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/vsa0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/vsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vsa0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/vsa0;->k:La/ata0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/vsa0;->l:La/xgl0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, v0, La/vsa0;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v5, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/nsa0;

    .line 40
    .line 41
    invoke-static {v2}, La/rsa0;->a(La/nsa0;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2, v6}, La/wdx;->O(Ljava/util/List;La/xgl0;)La/hao;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, La/nsa0;

    .line 59
    .line 60
    invoke-static {v3}, La/rsa0;->b(La/nsa0;)La/l9s;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    iget-boolean v6, v6, La/xgl0;->i:Z

    .line 70
    .line 71
    invoke-static {v3, v6}, La/wdx;->i0(La/l9s;Z)La/m0k0;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sget-object v6, La/ctc;->b:La/ctc;

    .line 76
    .line 77
    iput-boolean v5, v0, La/vsa0;->j:Z

    .line 78
    .line 79
    invoke-virtual {v4, v3, v2, v6, v0}, La/ata0;->M(La/m0k0;La/hao;La/ctc;La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v1, :cond_4

    .line 84
    .line 85
    move-object v2, v1

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    :goto_1
    return-object v2

    .line 90
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 91
    .line 92
    iget-boolean v7, v0, La/vsa0;->j:Z

    .line 93
    .line 94
    if-eqz v7, :cond_6

    .line 95
    .line 96
    if-ne v7, v5, :cond_5

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_2

    .line 102
    .line 103
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, La/nsa0;

    .line 116
    .line 117
    invoke-static {v2}, La/rsa0;->a(La/nsa0;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2, v6}, La/wdx;->O(Ljava/util/List;La/xgl0;)La/hao;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-nez v2, :cond_7

    .line 126
    .line 127
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    goto/16 :goto_3

    .line 130
    .line 131
    :cond_7
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, La/nsa0;

    .line 136
    .line 137
    invoke-static {v3}, La/rsa0;->b(La/nsa0;)La/l9s;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-nez v3, :cond_8

    .line 142
    .line 143
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    goto/16 :goto_3

    .line 146
    .line 147
    :cond_8
    iget-wide v8, v2, La/hao;->c:J

    .line 148
    .line 149
    iget-boolean v12, v2, La/hao;->h:Z

    .line 150
    .line 151
    iget-object v7, v2, La/hao;->m:La/rh7;

    .line 152
    .line 153
    iget-wide v14, v7, La/rh7;->a:J

    .line 154
    .line 155
    iget-object v7, v7, La/rh7;->b:Ljava/lang/String;

    .line 156
    .line 157
    iget-wide v10, v2, La/hao;->b:J

    .line 158
    .line 159
    move-object/from16 v43, v6

    .line 160
    .line 161
    iget-wide v5, v2, La/hao;->e:J

    .line 162
    .line 163
    move-wide/from16 v19, v5

    .line 164
    .line 165
    iget-wide v5, v2, La/hao;->f:D

    .line 166
    .line 167
    move-wide/from16 v21, v5

    .line 168
    .line 169
    iget-wide v5, v2, La/hao;->d:D

    .line 170
    .line 171
    iget-object v13, v2, La/hao;->i:Ljava/lang/String;

    .line 172
    .line 173
    move-wide/from16 v25, v5

    .line 174
    .line 175
    iget-object v5, v2, La/hao;->q:La/uoy;

    .line 176
    .line 177
    iget-byte v5, v5, La/uoy;->a:B

    .line 178
    .line 179
    iget-object v6, v2, La/hao;->l:Ljava/lang/String;

    .line 180
    .line 181
    move/from16 v16, v5

    .line 182
    .line 183
    iget-object v5, v2, La/hao;->k:Ljava/lang/String;

    .line 184
    .line 185
    move-object/from16 v30, v5

    .line 186
    .line 187
    iget-boolean v5, v2, La/hao;->p:Z

    .line 188
    .line 189
    move/from16 v32, v5

    .line 190
    .line 191
    iget-object v5, v2, La/hao;->j:Ljava/lang/String;

    .line 192
    .line 193
    move-object/from16 v28, v5

    .line 194
    .line 195
    iget-object v5, v2, La/hao;->t:La/zfa0;

    .line 196
    .line 197
    move-wide/from16 v17, v10

    .line 198
    .line 199
    move/from16 v10, v16

    .line 200
    .line 201
    move-object/from16 v16, v7

    .line 202
    .line 203
    new-instance v7, La/m97;

    .line 204
    .line 205
    const/16 v41, 0x0

    .line 206
    .line 207
    const v42, 0x3bd0014

    .line 208
    .line 209
    .line 210
    const/4 v11, 0x0

    .line 211
    move-object/from16 v27, v13

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const/16 v31, 0x0

    .line 215
    .line 216
    const/16 v33, 0x0

    .line 217
    .line 218
    const-wide/16 v34, 0x0

    .line 219
    .line 220
    const/16 v36, 0x0

    .line 221
    .line 222
    const/16 v38, 0x0

    .line 223
    .line 224
    const-wide/16 v39, 0x0

    .line 225
    .line 226
    move-wide/from16 v23, v21

    .line 227
    .line 228
    move-object/from16 v37, v5

    .line 229
    .line 230
    move-object/from16 v29, v6

    .line 231
    .line 232
    invoke-direct/range {v7 .. v42}, La/m97;-><init>(JILa/izc;ZZJLjava/lang/String;JJDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZJZLa/zfa0;ZDLjava/lang/String;I)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v5, v43

    .line 236
    .line 237
    iget-boolean v5, v5, La/xgl0;->i:Z

    .line 238
    .line 239
    invoke-static {v3, v5}, La/wdx;->i0(La/l9s;Z)La/m0k0;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    iget-object v5, v4, La/ata0;->v:La/pru;

    .line 244
    .line 245
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    iget-object v5, v5, La/sff0;->a:La/gx7;

    .line 250
    .line 251
    iget-boolean v5, v5, La/gx7;->g:Z

    .line 252
    .line 253
    if-eqz v5, :cond_9

    .line 254
    .line 255
    sget-object v5, La/ctc;->a:La/ctc;

    .line 256
    .line 257
    const/4 v6, 0x1

    .line 258
    iput-boolean v6, v0, La/vsa0;->j:Z

    .line 259
    .line 260
    invoke-virtual {v4, v3, v2, v5, v0}, La/ata0;->M(La/m0k0;La/hao;La/ctc;La/zje;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-ne v0, v1, :cond_a

    .line 265
    .line 266
    move-object v2, v1

    .line 267
    goto :goto_3

    .line 268
    :cond_9
    new-instance v0, La/isa0;

    .line 269
    .line 270
    sget-object v1, La/ojd;->a:La/ojd;

    .line 271
    .line 272
    invoke-direct {v0, v1}, La/isa0;-><init>(La/sjd;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    new-instance v0, La/isa0;

    .line 279
    .line 280
    new-instance v1, La/pjd;

    .line 281
    .line 282
    iget-object v2, v4, La/ata0;->R:La/ls2;

    .line 283
    .line 284
    invoke-direct {v1, v2, v7, v3}, La/pjd;-><init>(La/ms2;La/m97;La/m0k0;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {v0, v1}, La/isa0;-><init>(La/sjd;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_a
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    :goto_3
    return-object v2

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
