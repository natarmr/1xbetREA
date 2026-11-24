.class public final La/xpr;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final synthetic h:B

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/uyn;La/a1d;La/eu90;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, La/xpr;->h:B

    .line 24
    new-instance v0, La/sv10;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, La/sv10;-><init>(B)V

    .line 25
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 26
    iput-object p1, p0, La/xpr;->i:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, La/xpr;->j:Ljava/lang/Object;

    .line 28
    iput-object p3, p0, La/xpr;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ypr;La/vqc;La/je;La/bn6;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/xpr;->h:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/yip;

    .line 8
    .line 9
    const/16 v1, 0x18

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/xpr;->i:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p3, p0, La/xpr;->j:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p4, p0, La/xpr;->k:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/xpr;->h:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/lv20;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/xpr;->i(La/lv20;La/zje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p1, La/wpr;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    if-eqz p1, :cond_4

    .line 17
    .line 18
    instance-of v0, p1, La/upr;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/zpr;

    .line 27
    .line 28
    iget-object p1, p1, La/zpr;->a:La/ypr;

    .line 29
    .line 30
    iget-object p0, p0, La/xpr;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/vqc;

    .line 33
    .line 34
    new-instance p2, La/g7p;

    .line 35
    .line 36
    const/16 v0, 0x11

    .line 37
    .line 38
    invoke-direct {p2, p1, v0}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, La/vqc;->k(La/m1g;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    instance-of v0, p1, La/tpr;

    .line 50
    .line 51
    iget-object v1, p0, La/xpr;->j:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v2, p0, La/xpr;->k:Ljava/lang/Object;

    .line 54
    .line 55
    const-wide/16 v3, 0x28

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/zpr;

    .line 64
    .line 65
    iget-object p0, p0, La/zpr;->a:La/ypr;

    .line 66
    .line 67
    iget-wide v5, p0, La/ypr;->b:J

    .line 68
    .line 69
    cmp-long p1, v5, v3

    .line 70
    .line 71
    if-nez p1, :cond_1

    .line 72
    .line 73
    iget-wide p0, p0, La/ypr;->c:J

    .line 74
    .line 75
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    :cond_1
    check-cast v2, La/bn6;

    .line 80
    .line 81
    invoke-virtual {v2, p2, v5, v6}, La/bn6;->b(Ljava/lang/Long;J)V

    .line 82
    .line 83
    .line 84
    check-cast v1, La/je;

    .line 85
    .line 86
    invoke-virtual {v1, p2, v5, v6}, La/je;->a(Ljava/lang/Long;J)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    instance-of v0, p1, La/vpr;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    check-cast p1, La/vpr;

    .line 95
    .line 96
    iget-boolean v11, p1, La/vpr;->a:Z

    .line 97
    .line 98
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/zpr;

    .line 103
    .line 104
    iget-object p0, p0, La/zpr;->a:La/ypr;

    .line 105
    .line 106
    iget-wide v5, p0, La/ypr;->b:J

    .line 107
    .line 108
    cmp-long p1, v5, v3

    .line 109
    .line 110
    if-nez p1, :cond_3

    .line 111
    .line 112
    iget-wide p1, p0, La/ypr;->c:J

    .line 113
    .line 114
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    :cond_3
    move-object v10, p2

    .line 119
    move-object v5, v2

    .line 120
    check-cast v5, La/bn6;

    .line 121
    .line 122
    iget-wide v8, p0, La/ypr;->b:J

    .line 123
    .line 124
    iget-wide v6, p0, La/ypr;->a:J

    .line 125
    .line 126
    invoke-virtual/range {v5 .. v11}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 127
    .line 128
    .line 129
    move-object v5, v1

    .line 130
    check-cast v5, La/je;

    .line 131
    .line 132
    iget-wide v8, p0, La/ypr;->b:J

    .line 133
    .line 134
    iget-wide v6, p0, La/ypr;->a:J

    .line 135
    .line 136
    invoke-virtual/range {v5 .. v11}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 137
    .line 138
    .line 139
    :goto_0
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 143
    .line 144
    .line 145
    :goto_1
    return-object p2

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(La/lv20;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, La/xpr;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/a1d;

    .line 10
    .line 11
    instance-of v4, v2, La/gv20;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    move-object v4, v2

    .line 16
    check-cast v4, La/gv20;

    .line 17
    .line 18
    iget v5, v4, La/gv20;->l:I

    .line 19
    .line 20
    const/high16 v6, -0x80000000

    .line 21
    .line 22
    and-int v7, v5, v6

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    sub-int/2addr v5, v6

    .line 27
    iput v5, v4, La/gv20;->l:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v4, La/gv20;

    .line 31
    .line 32
    invoke-direct {v4, v0, v2}, La/gv20;-><init>(La/xpr;La/zje;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v2, v4, La/gv20;->j:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v5, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v6, v4, La/gv20;->l:I

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x2

    .line 43
    const/4 v9, 0x1

    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    if-eq v6, v9, :cond_2

    .line 47
    .line 48
    if-ne v6, v8, :cond_1

    .line 49
    .line 50
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v7

    .line 61
    :cond_2
    iget-object v1, v4, La/gv20;->i:La/lv20;

    .line 62
    .line 63
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, v4, La/gv20;->i:La/lv20;

    .line 71
    .line 72
    iput v9, v4, La/gv20;->l:I

    .line 73
    .line 74
    invoke-static {v0, v1, v4}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v2, v5, :cond_4

    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_4
    :goto_1
    if-eqz v1, :cond_e

    .line 83
    .line 84
    instance-of v2, v1, La/iv20;

    .line 85
    .line 86
    if-eqz v2, :cond_a

    .line 87
    .line 88
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, La/mv20;

    .line 93
    .line 94
    iget-object v2, v2, La/mv20;->a:La/xvm0;

    .line 95
    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_5
    instance-of v4, v2, La/rvm0;

    .line 101
    .line 102
    if-eqz v4, :cond_6

    .line 103
    .line 104
    check-cast v1, La/iv20;

    .line 105
    .line 106
    iget-wide v11, v1, La/iv20;->a:J

    .line 107
    .line 108
    check-cast v2, La/rvm0;

    .line 109
    .line 110
    iget-wide v13, v2, La/rvm0;->a:J

    .line 111
    .line 112
    iget-boolean v0, v1, La/iv20;->c:Z

    .line 113
    .line 114
    xor-int/lit8 v15, v0, 0x1

    .line 115
    .line 116
    iget-object v0, v3, La/a1d;->b:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v10, v0

    .line 119
    check-cast v10, La/goo;

    .line 120
    .line 121
    const/16 v16, 0x1

    .line 122
    .line 123
    invoke-virtual/range {v10 .. v16}, La/goo;->c(JJZZ)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :cond_6
    instance-of v4, v2, La/svm0;

    .line 129
    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    iget-object v0, v0, La/xpr;->i:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, La/uyn;

    .line 135
    .line 136
    check-cast v1, La/iv20;

    .line 137
    .line 138
    iget-wide v2, v1, La/iv20;->a:J

    .line 139
    .line 140
    iget-object v4, v1, La/iv20;->b:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v2, v3, v4}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iget-boolean v1, v1, La/iv20;->c:Z

    .line 147
    .line 148
    xor-int/2addr v1, v9

    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v0, v0, La/uyn;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, La/ino;

    .line 155
    .line 156
    iget-object v0, v0, La/ino;->a:La/pmo;

    .line 157
    .line 158
    iput-boolean v9, v0, La/pmo;->b:Z

    .line 159
    .line 160
    invoke-virtual {v0, v2, v1}, La/pmo;->a(Ljava/lang/String;Z)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_4

    .line 164
    .line 165
    :cond_7
    instance-of v0, v2, La/tvm0;

    .line 166
    .line 167
    if-eqz v0, :cond_8

    .line 168
    .line 169
    check-cast v1, La/iv20;

    .line 170
    .line 171
    iget-wide v11, v1, La/iv20;->a:J

    .line 172
    .line 173
    check-cast v2, La/tvm0;

    .line 174
    .line 175
    iget-wide v13, v2, La/tvm0;->a:J

    .line 176
    .line 177
    iget-boolean v0, v1, La/iv20;->c:Z

    .line 178
    .line 179
    xor-int/lit8 v15, v0, 0x1

    .line 180
    .line 181
    iget-object v0, v3, La/a1d;->b:Ljava/lang/Object;

    .line 182
    .line 183
    move-object v10, v0

    .line 184
    check-cast v10, La/goo;

    .line 185
    .line 186
    const/16 v16, 0x1

    .line 187
    .line 188
    invoke-virtual/range {v10 .. v16}, La/goo;->c(JJZZ)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_8
    instance-of v0, v2, La/wvm0;

    .line 193
    .line 194
    if-eqz v0, :cond_9

    .line 195
    .line 196
    check-cast v1, La/iv20;

    .line 197
    .line 198
    iget-wide v11, v1, La/iv20;->a:J

    .line 199
    .line 200
    check-cast v2, La/wvm0;

    .line 201
    .line 202
    invoke-interface {v2}, La/xvm0;->getId()J

    .line 203
    .line 204
    .line 205
    move-result-wide v13

    .line 206
    iget-boolean v0, v1, La/iv20;->c:Z

    .line 207
    .line 208
    xor-int/lit8 v15, v0, 0x1

    .line 209
    .line 210
    iget-object v0, v3, La/a1d;->b:Ljava/lang/Object;

    .line 211
    .line 212
    move-object v10, v0

    .line 213
    check-cast v10, La/goo;

    .line 214
    .line 215
    const/16 v16, 0x1

    .line 216
    .line 217
    invoke-virtual/range {v10 .. v16}, La/goo;->c(JJZZ)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 222
    .line 223
    .line 224
    return-object v7

    .line 225
    :cond_a
    instance-of v2, v1, La/jv20;

    .line 226
    .line 227
    if-eqz v2, :cond_c

    .line 228
    .line 229
    iget-object v0, v0, La/xpr;->k:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, La/eu90;

    .line 232
    .line 233
    new-instance v9, La/vt20;

    .line 234
    .line 235
    check-cast v1, La/jv20;

    .line 236
    .line 237
    iget-wide v11, v1, La/jv20;->a:J

    .line 238
    .line 239
    iget-object v13, v1, La/jv20;->b:Ljava/lang/String;

    .line 240
    .line 241
    const/4 v10, 0x0

    .line 242
    const/4 v14, 0x0

    .line 243
    invoke-direct/range {v9 .. v14}, La/vt20;-><init>(IJLjava/lang/String;Z)V

    .line 244
    .line 245
    .line 246
    iput-object v7, v4, La/gv20;->i:La/lv20;

    .line 247
    .line 248
    iput v8, v4, La/gv20;->l:I

    .line 249
    .line 250
    invoke-virtual {v0, v9, v4}, La/eu90;->a(La/vt20;La/zje;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-ne v0, v5, :cond_b

    .line 255
    .line 256
    :goto_2
    return-object v5

    .line 257
    :cond_b
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :cond_c
    instance-of v2, v1, La/hv20;

    .line 261
    .line 262
    if-eqz v2, :cond_e

    .line 263
    .line 264
    iget-object v0, v0, La/x2t0;->b:La/ocj;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 270
    .line 271
    :cond_d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    move-object v3, v2

    .line 276
    check-cast v3, La/mv20;

    .line 277
    .line 278
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-object v3, v1

    .line 282
    check-cast v3, La/hv20;

    .line 283
    .line 284
    iget-object v3, v3, La/hv20;->a:La/xvm0;

    .line 285
    .line 286
    new-instance v4, La/mv20;

    .line 287
    .line 288
    invoke-direct {v4, v3}, La/mv20;-><init>(La/xvm0;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_d

    .line 296
    .line 297
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 301
    .line 302
    .line 303
    return-object v7
.end method
