.class public final synthetic La/brw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;JLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/brw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/brw;->b:J

    iput-object p3, p0, La/brw;->c:Ljava/lang/String;

    iput-wide p4, p0, La/brw;->d:J

    iput-object p6, p0, La/brw;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/brw;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    iget-object v5, v0, La/brw;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fet;

    .line 18
    .line 19
    move-object/from16 v7, p2

    .line 20
    .line 21
    check-cast v7, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    and-int/lit8 v8, v7, 0x3

    .line 28
    .line 29
    if-eq v8, v6, :cond_0

    .line 30
    .line 31
    move v2, v3

    .line 32
    :cond_0
    and-int/2addr v3, v7

    .line 33
    invoke-virtual {v1, v3, v2}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_5

    .line 38
    .line 39
    sget-object v2, La/zwp0;->a:La/zfn;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v10, v2

    .line 46
    check-cast v10, La/gmm;

    .line 47
    .line 48
    new-instance v7, La/imm;

    .line 49
    .line 50
    new-instance v8, La/ilm;

    .line 51
    .line 52
    iget-wide v14, v0, La/brw;->b:J

    .line 53
    .line 54
    invoke-direct {v8, v14, v15}, La/ilm;-><init>(J)V

    .line 55
    .line 56
    .line 57
    new-instance v9, La/plm;

    .line 58
    .line 59
    sget-object v13, La/ha50;->b:La/ha50;

    .line 60
    .line 61
    sget-object v16, La/fa50;->a:La/fa50;

    .line 62
    .line 63
    iget-object v12, v0, La/brw;->c:Ljava/lang/String;

    .line 64
    .line 65
    move-object v11, v9

    .line 66
    invoke-direct/range {v11 .. v16}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 67
    .line 68
    .line 69
    const/4 v13, 0x1

    .line 70
    const/4 v14, 0x0

    .line 71
    iget-wide v11, v0, La/brw;->d:J

    .line 72
    .line 73
    invoke-direct/range {v7 .. v14}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    if-ne v2, v4, :cond_2

    .line 87
    .line 88
    :cond_1
    new-instance v2, La/o0q0;

    .line 89
    .line 90
    invoke-direct {v2, v5, v6}, La/o0q0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    move-object v10, v2

    .line 97
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 98
    .line 99
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    if-ne v2, v4, :cond_4

    .line 110
    .line 111
    :cond_3
    new-instance v2, La/coo0;

    .line 112
    .line 113
    const/16 v0, 0x15

    .line 114
    .line 115
    invoke-direct {v2, v5, v0}, La/coo0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    move-object v12, v2

    .line 122
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0xfd4

    .line 127
    .line 128
    move-object v8, v7

    .line 129
    sget-object v7, La/jm40;->b:La/jm40;

    .line 130
    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v13, 0x0

    .line 134
    const/4 v14, 0x0

    .line 135
    const/4 v15, 0x0

    .line 136
    const/16 v16, 0x0

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    move-object/from16 v19, v1

    .line 145
    .line 146
    invoke-static/range {v7 .. v22}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_5
    move-object/from16 v19, v1

    .line 151
    .line 152
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 153
    .line 154
    .line 155
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_0
    move-object/from16 v13, p1

    .line 159
    .line 160
    check-cast v13, La/fet;

    .line 161
    .line 162
    move-object/from16 v1, p2

    .line 163
    .line 164
    check-cast v1, Ljava/lang/Integer;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    and-int/lit8 v7, v1, 0x3

    .line 171
    .line 172
    if-eq v7, v6, :cond_6

    .line 173
    .line 174
    move v2, v3

    .line 175
    :cond_6
    and-int/2addr v1, v3

    .line 176
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_b

    .line 181
    .line 182
    sget-object v1, La/gpw;->a:La/zfn;

    .line 183
    .line 184
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    move-object/from16 v17, v1

    .line 189
    .line 190
    check-cast v17, La/gmm;

    .line 191
    .line 192
    new-instance v14, La/imm;

    .line 193
    .line 194
    new-instance v15, La/ilm;

    .line 195
    .line 196
    iget-wide v9, v0, La/brw;->b:J

    .line 197
    .line 198
    invoke-direct {v15, v9, v10}, La/ilm;-><init>(J)V

    .line 199
    .line 200
    .line 201
    new-instance v16, La/plm;

    .line 202
    .line 203
    sget-object v8, La/ha50;->b:La/ha50;

    .line 204
    .line 205
    sget-object v11, La/fa50;->a:La/fa50;

    .line 206
    .line 207
    iget-object v7, v0, La/brw;->c:Ljava/lang/String;

    .line 208
    .line 209
    move-object/from16 v6, v16

    .line 210
    .line 211
    invoke-direct/range {v6 .. v11}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 212
    .line 213
    .line 214
    const/16 v20, 0x1

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    iget-wide v0, v0, La/brw;->d:J

    .line 219
    .line 220
    move-wide/from16 v18, v0

    .line 221
    .line 222
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-nez v0, :cond_7

    .line 234
    .line 235
    if-ne v1, v4, :cond_8

    .line 236
    .line 237
    :cond_7
    new-instance v1, La/i8v;

    .line 238
    .line 239
    const/16 v0, 0x1b

    .line 240
    .line 241
    invoke-direct {v1, v5, v0}, La/i8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_8
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 248
    .line 249
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    if-nez v0, :cond_9

    .line 258
    .line 259
    if-ne v2, v4, :cond_a

    .line 260
    .line 261
    :cond_9
    new-instance v2, La/dht;

    .line 262
    .line 263
    const/16 v0, 0x17

    .line 264
    .line 265
    invoke-direct {v2, v5, v0}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :cond_a
    move-object v6, v2

    .line 272
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 273
    .line 274
    const/4 v15, 0x0

    .line 275
    const/16 v16, 0xfd4

    .line 276
    .line 277
    move-object v4, v1

    .line 278
    sget-object v1, La/jm40;->b:La/jm40;

    .line 279
    .line 280
    const/4 v3, 0x0

    .line 281
    const/4 v5, 0x0

    .line 282
    const/4 v7, 0x0

    .line 283
    const/4 v8, 0x0

    .line 284
    const/4 v9, 0x0

    .line 285
    const/4 v10, 0x0

    .line 286
    const/4 v11, 0x0

    .line 287
    const/4 v12, 0x0

    .line 288
    move-object v2, v14

    .line 289
    const/4 v14, 0x0

    .line 290
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 291
    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_b
    invoke-virtual {v13}, La/fet;->X()V

    .line 295
    .line 296
    .line 297
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
