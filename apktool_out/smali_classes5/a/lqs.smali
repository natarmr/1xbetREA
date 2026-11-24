.class public final La/lqs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:I

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/ffd;

.field public final synthetic n:La/adw;

.field public final synthetic o:La/y2x;

.field public final synthetic p:La/djx;


# direct methods
.method public constructor <init>(La/ffd;La/adw;La/y2x;La/djx;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lqs;->m:La/ffd;

    .line 2
    .line 3
    iput-object p2, p0, La/lqs;->n:La/adw;

    .line 4
    .line 5
    iput-object p3, p0, La/lqs;->o:La/y2x;

    .line 6
    .line 7
    iput-object p4, p0, La/lqs;->p:La/djx;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/lqs;

    .line 2
    .line 3
    iget-object v3, p0, La/lqs;->o:La/y2x;

    .line 4
    .line 5
    iget-object v4, p0, La/lqs;->p:La/djx;

    .line 6
    .line 7
    iget-object v1, p0, La/lqs;->m:La/ffd;

    .line 8
    .line 9
    iget-object v2, p0, La/lqs;->n:La/adw;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/lqs;-><init>(La/ffd;La/adw;La/y2x;La/djx;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/lqs;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/lqs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/lqs;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/lqs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/lqs;->n:La/adw;

    .line 4
    .line 5
    iget-object v1, v1, La/adw;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/k4z;

    .line 8
    .line 9
    iget-object v2, v0, La/lqs;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/kmq;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v4, v0, La/lqs;->k:B

    .line 16
    .line 17
    const-wide/16 v6, 0x1

    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    const-wide/16 v9, 0x0

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    packed-switch v4, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v11

    .line 32
    :pswitch_0
    iget v4, v0, La/lqs;->j:I

    .line 33
    .line 34
    iget-wide v12, v0, La/lqs;->i:J

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-wide/from16 v17, v6

    .line 40
    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :pswitch_1
    iget-wide v12, v0, La/lqs;->i:J

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-wide/from16 v17, v6

    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :pswitch_2
    iget v4, v0, La/lqs;->j:I

    .line 53
    .line 54
    iget-wide v12, v0, La/lqs;->i:J

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :pswitch_3
    iget-wide v12, v0, La/lqs;->i:J

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v4, p1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-wide/16 v12, 0xb4

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    :goto_0
    invoke-static {v12, v13, v9, v10}, Lkotlin/jvm/internal/Intrinsics;->f(JJ)I

    .line 76
    .line 77
    .line 78
    move-result v14

    .line 79
    if-ltz v14, :cond_c

    .line 80
    .line 81
    if-nez v4, :cond_c

    .line 82
    .line 83
    invoke-static {v12, v13}, La/znq0;->g(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v14

    .line 87
    const-wide/16 v16, 0x8

    .line 88
    .line 89
    invoke-static/range {v16 .. v17}, La/znq0;->g(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v16

    .line 93
    rem-long v14, v14, v16

    .line 94
    .line 95
    cmp-long v14, v14, v9

    .line 96
    .line 97
    if-nez v14, :cond_9

    .line 98
    .line 99
    iput-object v2, v0, La/lqs;->l:Ljava/lang/Object;

    .line 100
    .line 101
    iput-wide v12, v0, La/lqs;->i:J

    .line 102
    .line 103
    iput v4, v0, La/lqs;->j:I

    .line 104
    .line 105
    iput-byte v8, v0, La/lqs;->k:B

    .line 106
    .line 107
    iget-object v4, v0, La/lqs;->m:La/ffd;

    .line 108
    .line 109
    invoke-virtual {v4, v0}, La/ffd;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    if-ne v4, v3, :cond_0

    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_0
    :goto_1
    check-cast v4, La/j0g0;

    .line 118
    .line 119
    iget-object v4, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 120
    .line 121
    instance-of v14, v4, La/g0g0;

    .line 122
    .line 123
    if-eqz v14, :cond_1

    .line 124
    .line 125
    move-object v4, v11

    .line 126
    :cond_1
    check-cast v4, La/fns0;

    .line 127
    .line 128
    if-eqz v4, :cond_2

    .line 129
    .line 130
    iget-wide v14, v4, La/fns0;->a:J

    .line 131
    .line 132
    cmp-long v14, v14, v9

    .line 133
    .line 134
    if-eqz v14, :cond_2

    .line 135
    .line 136
    move v14, v8

    .line 137
    goto :goto_2

    .line 138
    :cond_2
    const/4 v14, 0x0

    .line 139
    :goto_2
    if-eqz v14, :cond_6

    .line 140
    .line 141
    if-eqz v4, :cond_4

    .line 142
    .line 143
    iget-object v15, v0, La/lqs;->p:La/djx;

    .line 144
    .line 145
    invoke-virtual {v15, v4}, La/djx;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    iput-object v2, v0, La/lqs;->l:Ljava/lang/Object;

    .line 150
    .line 151
    iput-wide v12, v0, La/lqs;->i:J

    .line 152
    .line 153
    iput v14, v0, La/lqs;->j:I

    .line 154
    .line 155
    const/4 v15, 0x2

    .line 156
    iput-byte v15, v0, La/lqs;->k:B

    .line 157
    .line 158
    invoke-interface {v2, v4, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-ne v4, v3, :cond_3

    .line 163
    .line 164
    goto/16 :goto_6

    .line 165
    .line 166
    :cond_3
    move v4, v14

    .line 167
    :goto_3
    move-wide/from16 v17, v6

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_4
    move-wide/from16 v17, v6

    .line 171
    .line 172
    :cond_5
    move v4, v14

    .line 173
    goto :goto_5

    .line 174
    :cond_6
    invoke-static {v12, v13, v9, v10}, Lkotlin/jvm/internal/Intrinsics;->f(JJ)I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-lez v4, :cond_7

    .line 179
    .line 180
    sub-long/2addr v12, v6

    .line 181
    new-instance v4, La/c4z;

    .line 182
    .line 183
    iget-object v15, v1, La/k4z;->a:La/h4z;

    .line 184
    .line 185
    move-wide/from16 v17, v6

    .line 186
    .line 187
    iget-wide v5, v15, La/h4z;->a:J

    .line 188
    .line 189
    invoke-direct {v4, v5, v6, v12, v13}, La/c4z;-><init>(JJ)V

    .line 190
    .line 191
    .line 192
    iput-object v2, v0, La/lqs;->l:Ljava/lang/Object;

    .line 193
    .line 194
    iput-wide v12, v0, La/lqs;->i:J

    .line 195
    .line 196
    iput v14, v0, La/lqs;->j:I

    .line 197
    .line 198
    const/4 v5, 0x3

    .line 199
    iput-byte v5, v0, La/lqs;->k:B

    .line 200
    .line 201
    invoke-interface {v2, v4, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-ne v4, v3, :cond_5

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_7
    move-wide/from16 v17, v6

    .line 209
    .line 210
    iget-object v4, v0, La/lqs;->o:La/y2x;

    .line 211
    .line 212
    invoke-virtual {v4}, La/y2x;->invoke()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    iput-object v2, v0, La/lqs;->l:Ljava/lang/Object;

    .line 217
    .line 218
    iput-wide v12, v0, La/lqs;->i:J

    .line 219
    .line 220
    iput v14, v0, La/lqs;->j:I

    .line 221
    .line 222
    const/4 v5, 0x4

    .line 223
    iput-byte v5, v0, La/lqs;->k:B

    .line 224
    .line 225
    invoke-interface {v2, v4, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-ne v4, v3, :cond_8

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_8
    :goto_4
    move v4, v8

    .line 233
    goto :goto_5

    .line 234
    :cond_9
    move-wide/from16 v17, v6

    .line 235
    .line 236
    sub-long v12, v12, v17

    .line 237
    .line 238
    new-instance v5, La/c4z;

    .line 239
    .line 240
    iget-object v6, v1, La/k4z;->a:La/h4z;

    .line 241
    .line 242
    iget-wide v6, v6, La/h4z;->a:J

    .line 243
    .line 244
    invoke-direct {v5, v6, v7, v12, v13}, La/c4z;-><init>(JJ)V

    .line 245
    .line 246
    .line 247
    iput-object v2, v0, La/lqs;->l:Ljava/lang/Object;

    .line 248
    .line 249
    iput-wide v12, v0, La/lqs;->i:J

    .line 250
    .line 251
    iput v4, v0, La/lqs;->j:I

    .line 252
    .line 253
    const/4 v6, 0x5

    .line 254
    iput-byte v6, v0, La/lqs;->k:B

    .line 255
    .line 256
    invoke-interface {v2, v5, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    if-ne v5, v3, :cond_a

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_a
    :goto_5
    invoke-static/range {v17 .. v18}, La/znq0;->f(J)J

    .line 264
    .line 265
    .line 266
    move-result-wide v5

    .line 267
    iput-object v2, v0, La/lqs;->l:Ljava/lang/Object;

    .line 268
    .line 269
    iput-wide v12, v0, La/lqs;->i:J

    .line 270
    .line 271
    iput v4, v0, La/lqs;->j:I

    .line 272
    .line 273
    const/4 v7, 0x6

    .line 274
    iput-byte v7, v0, La/lqs;->k:B

    .line 275
    .line 276
    invoke-static {v5, v6, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    if-ne v5, v3, :cond_b

    .line 281
    .line 282
    :goto_6
    return-object v3

    .line 283
    :cond_b
    :goto_7
    move-wide/from16 v6, v17

    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object v0

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
