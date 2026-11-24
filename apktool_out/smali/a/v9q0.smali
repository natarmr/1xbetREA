.class public final synthetic La/v9q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x9q0;


# direct methods
.method public synthetic constructor <init>(La/x9q0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v9q0;->a:B

    iput-object p1, p0, La/v9q0;->b:La/x9q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/v9q0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, La/v9q0;->b:La/x9q0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v4, v0, La/x9q0;->z:La/w9q0;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-boolean v1, v4, La/w9q0;->c:Z

    .line 27
    .line 28
    invoke-static {v0}, La/s0x;->S(La/qai0;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, La/n7x;->I(La/v6z;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, La/vfc;->J(La/ehl;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, La/j83;

    .line 45
    .line 46
    iget-object v3, v1, La/j83;->b:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, v0, La/x9q0;->z:La/w9q0;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget-object v2, v1, La/w9q0;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iput-object v3, v1, La/w9q0;->b:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, v1, La/w9q0;->d:La/bo80;

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    iget-object v2, v0, La/x9q0;->p:La/y9q0;

    .line 68
    .line 69
    iget-object v4, v0, La/x9q0;->q:La/mrq;

    .line 70
    .line 71
    iget v5, v0, La/x9q0;->r:I

    .line 72
    .line 73
    iget-boolean v6, v0, La/x9q0;->s:Z

    .line 74
    .line 75
    iget v7, v0, La/x9q0;->t:I

    .line 76
    .line 77
    iget v8, v0, La/x9q0;->u:I

    .line 78
    .line 79
    iput-object v3, v1, La/bo80;->a:Ljava/lang/String;

    .line 80
    .line 81
    iput-object v2, v1, La/bo80;->b:La/y9q0;

    .line 82
    .line 83
    iput-object v4, v1, La/bo80;->c:La/mrq;

    .line 84
    .line 85
    iput v5, v1, La/bo80;->d:I

    .line 86
    .line 87
    iput-boolean v6, v1, La/bo80;->e:Z

    .line 88
    .line 89
    iput v7, v1, La/bo80;->f:I

    .line 90
    .line 91
    iput v8, v1, La/bo80;->g:I

    .line 92
    .line 93
    iget-wide v2, v1, La/bo80;->s:J

    .line 94
    .line 95
    const/4 v4, 0x2

    .line 96
    shl-long/2addr v2, v4

    .line 97
    const-wide/16 v4, 0x2

    .line 98
    .line 99
    or-long/2addr v2, v4

    .line 100
    iput-wide v2, v1, La/bo80;->s:J

    .line 101
    .line 102
    invoke-virtual {v1}, La/bo80;->c()V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance v1, La/w9q0;

    .line 107
    .line 108
    iget-object v2, v0, La/x9q0;->o:Ljava/lang/String;

    .line 109
    .line 110
    invoke-direct {v1, v2, v3}, La/w9q0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v2, La/bo80;

    .line 114
    .line 115
    iget-object v4, v0, La/x9q0;->p:La/y9q0;

    .line 116
    .line 117
    iget-object v5, v0, La/x9q0;->q:La/mrq;

    .line 118
    .line 119
    iget v6, v0, La/x9q0;->r:I

    .line 120
    .line 121
    iget-boolean v7, v0, La/x9q0;->s:Z

    .line 122
    .line 123
    iget v8, v0, La/x9q0;->t:I

    .line 124
    .line 125
    iget v9, v0, La/x9q0;->u:I

    .line 126
    .line 127
    invoke-direct/range {v2 .. v9}, La/bo80;-><init>(Ljava/lang/String;La/y9q0;La/mrq;IZII)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, La/x9q0;->Z0()La/bo80;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-object v3, v3, La/bo80;->i:La/w6k;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, La/bo80;->d(La/w6k;)V

    .line 137
    .line 138
    .line 139
    iput-object v2, v1, La/w9q0;->d:La/bo80;

    .line 140
    .line 141
    iput-object v1, v0, La/x9q0;->z:La/w9q0;

    .line 142
    .line 143
    :cond_3
    :goto_1
    invoke-static {v0}, La/s0x;->S(La/qai0;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, La/n7x;->I(La/v6z;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v0}, La/vfc;->J(La/ehl;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_1
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v0}, La/x9q0;->Z0()La/bo80;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    iget-object v5, v0, La/x9q0;->p:La/y9q0;

    .line 164
    .line 165
    iget-object v0, v0, La/x9q0;->v:La/n4d;

    .line 166
    .line 167
    if-eqz v0, :cond_4

    .line 168
    .line 169
    invoke-interface {v0}, La/n4d;->a()J

    .line 170
    .line 171
    .line 172
    move-result-wide v6

    .line 173
    goto :goto_2

    .line 174
    :cond_4
    sget-wide v6, La/y3d;->g:J

    .line 175
    .line 176
    :goto_2
    const-wide/16 v16, 0x0

    .line 177
    .line 178
    const v18, 0xfffffe

    .line 179
    .line 180
    .line 181
    const-wide/16 v8, 0x0

    .line 182
    .line 183
    const/4 v10, 0x0

    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v12, 0x0

    .line 186
    const-wide/16 v13, 0x0

    .line 187
    .line 188
    const/4 v15, 0x0

    .line 189
    invoke-static/range {v5 .. v18}, La/y9q0;->e(La/y9q0;JJLa/psq;La/lsq;La/nrq;JIJI)La/y9q0;

    .line 190
    .line 191
    .line 192
    move-result-object v21

    .line 193
    iget-object v0, v4, La/bo80;->o:La/k6z;

    .line 194
    .line 195
    const/4 v5, 0x0

    .line 196
    if-nez v0, :cond_5

    .line 197
    .line 198
    :goto_3
    move-object v8, v5

    .line 199
    goto/16 :goto_4

    .line 200
    .line 201
    :cond_5
    iget-object v6, v4, La/bo80;->i:La/w6k;

    .line 202
    .line 203
    if-nez v6, :cond_6

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_6
    new-instance v7, La/j83;

    .line 207
    .line 208
    iget-object v8, v4, La/bo80;->a:Ljava/lang/String;

    .line 209
    .line 210
    invoke-direct {v7, v8}, La/j83;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-object v8, v4, La/bo80;->j:La/s03;

    .line 214
    .line 215
    if-nez v8, :cond_7

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_7
    iget-object v8, v4, La/bo80;->n:La/ao80;

    .line 219
    .line 220
    if-nez v8, :cond_8

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_8
    iget-wide v8, v4, La/bo80;->p:J

    .line 224
    .line 225
    const-wide v10, -0x1fffffffdL

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    and-long v14, v8, v10

    .line 231
    .line 232
    new-instance v8, La/a9q0;

    .line 233
    .line 234
    new-instance v19, La/z8q0;

    .line 235
    .line 236
    sget-object v22, La/iun;->a:La/iun;

    .line 237
    .line 238
    iget v9, v4, La/bo80;->f:I

    .line 239
    .line 240
    iget-boolean v10, v4, La/bo80;->e:Z

    .line 241
    .line 242
    iget v11, v4, La/bo80;->d:I

    .line 243
    .line 244
    iget-object v12, v4, La/bo80;->c:La/mrq;

    .line 245
    .line 246
    move-object/from16 v27, v0

    .line 247
    .line 248
    move-object/from16 v26, v6

    .line 249
    .line 250
    move-object/from16 v20, v7

    .line 251
    .line 252
    move/from16 v23, v9

    .line 253
    .line 254
    move/from16 v24, v10

    .line 255
    .line 256
    move/from16 v25, v11

    .line 257
    .line 258
    move-object/from16 v28, v12

    .line 259
    .line 260
    move-wide/from16 v29, v14

    .line 261
    .line 262
    invoke-direct/range {v19 .. v30}, La/z8q0;-><init>(La/j83;La/y9q0;Ljava/util/List;IZILa/w6k;La/k6z;La/mrq;J)V

    .line 263
    .line 264
    .line 265
    move-object/from16 v0, v19

    .line 266
    .line 267
    new-instance v12, La/bw40;

    .line 268
    .line 269
    new-instance v19, La/w5z;

    .line 270
    .line 271
    move-object/from16 v23, v21

    .line 272
    .line 273
    move/from16 v25, v24

    .line 274
    .line 275
    move-object/from16 v21, v26

    .line 276
    .line 277
    move-object/from16 v24, v22

    .line 278
    .line 279
    move-object/from16 v22, v28

    .line 280
    .line 281
    invoke-direct/range {v19 .. v25}, La/w5z;-><init>(La/j83;La/w6k;La/mrq;La/y9q0;Ljava/util/List;Z)V

    .line 282
    .line 283
    .line 284
    iget v6, v4, La/bo80;->f:I

    .line 285
    .line 286
    iget v7, v4, La/bo80;->d:I

    .line 287
    .line 288
    move/from16 v16, v6

    .line 289
    .line 290
    move/from16 v17, v7

    .line 291
    .line 292
    move-object/from16 v13, v19

    .line 293
    .line 294
    invoke-direct/range {v12 .. v17}, La/bw40;-><init>(La/w5z;JII)V

    .line 295
    .line 296
    .line 297
    iget-wide v6, v4, La/bo80;->l:J

    .line 298
    .line 299
    invoke-direct {v8, v0, v12, v6, v7}, La/a9q0;-><init>(La/z8q0;La/bw40;J)V

    .line 300
    .line 301
    .line 302
    :goto_4
    if-eqz v8, :cond_9

    .line 303
    .line 304
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-object v5, v8

    .line 308
    :cond_9
    if-eqz v5, :cond_a

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_a
    move v2, v3

    .line 312
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    return-object v0

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
