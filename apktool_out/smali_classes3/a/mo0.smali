.class public final La/mo0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:Z

.field public final synthetic m:J

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/f7u;ZJJLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/mo0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/mo0;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, La/mo0;->l:Z

    .line 7
    .line 8
    iput-wide p3, p0, La/mo0;->k:J

    .line 9
    .line 10
    iput-wide p5, p0, La/mo0;->m:J

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(La/i3t0;JZJLa/yje;B)V
    .locals 0

    .line 17
    iput-byte p8, p0, La/mo0;->i:B

    iput-object p1, p0, La/mo0;->n:Ljava/lang/Object;

    iput-wide p2, p0, La/mo0;->k:J

    iput-boolean p4, p0, La/mo0;->l:Z

    iput-wide p5, p0, La/mo0;->m:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZJJLa/t33;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/mo0;->i:B

    .line 18
    iput-boolean p1, p0, La/mo0;->l:Z

    iput-wide p2, p0, La/mo0;->k:J

    iput-wide p4, p0, La/mo0;->m:J

    iput-object p6, p0, La/mo0;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte p1, p0, La/mo0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/mo0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/mo0;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/f7u;

    .line 12
    .line 13
    iget-wide v4, p0, La/mo0;->k:J

    .line 14
    .line 15
    iget-wide v6, p0, La/mo0;->m:J

    .line 16
    .line 17
    iget-boolean v3, p0, La/mo0;->l:Z

    .line 18
    .line 19
    move-object v8, p2

    .line 20
    invoke-direct/range {v1 .. v8}, La/mo0;-><init>(La/f7u;ZJJLa/yje;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_0
    move-object v9, p2

    .line 25
    new-instance v2, La/mo0;

    .line 26
    .line 27
    iget-wide v6, p0, La/mo0;->m:J

    .line 28
    .line 29
    move-object v8, v0

    .line 30
    check-cast v8, La/t33;

    .line 31
    .line 32
    iget-boolean v3, p0, La/mo0;->l:Z

    .line 33
    .line 34
    iget-wide v4, p0, La/mo0;->k:J

    .line 35
    .line 36
    invoke-direct/range {v2 .. v9}, La/mo0;-><init>(ZJJLa/t33;La/yje;)V

    .line 37
    .line 38
    .line 39
    return-object v2

    .line 40
    :pswitch_1
    move-object v9, p2

    .line 41
    new-instance v2, La/mo0;

    .line 42
    .line 43
    move-object v3, v0

    .line 44
    check-cast v3, La/dp1;

    .line 45
    .line 46
    iget-wide v7, p0, La/mo0;->m:J

    .line 47
    .line 48
    const/4 v10, 0x1

    .line 49
    iget-wide v4, p0, La/mo0;->k:J

    .line 50
    .line 51
    iget-boolean v6, p0, La/mo0;->l:Z

    .line 52
    .line 53
    invoke-direct/range {v2 .. v10}, La/mo0;-><init>(La/i3t0;JZJLa/yje;B)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :pswitch_2
    move-object v9, p2

    .line 58
    new-instance v2, La/mo0;

    .line 59
    .line 60
    move-object v3, v0

    .line 61
    check-cast v3, La/qo0;

    .line 62
    .line 63
    iget-wide v7, p0, La/mo0;->m:J

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    iget-wide v4, p0, La/mo0;->k:J

    .line 67
    .line 68
    iget-boolean v6, p0, La/mo0;->l:Z

    .line 69
    .line 70
    invoke-direct/range {v2 .. v10}, La/mo0;-><init>(La/i3t0;JZJLa/yje;B)V

    .line 71
    .line 72
    .line 73
    return-object v2

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mo0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/mo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/mo0;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/mo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/vne;

    .line 32
    .line 33
    check-cast p2, La/yje;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, La/mo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/mo0;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/mo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/vne;

    .line 49
    .line 50
    check-cast p2, La/yje;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, La/mo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/mo0;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/mo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/vne;

    .line 66
    .line 67
    check-cast p2, La/yje;

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, La/mo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/mo0;

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, La/mo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/mo0;->i:B

    .line 2
    .line 3
    iget-wide v1, p0, La/mo0;->m:J

    .line 4
    .line 5
    iget-wide v3, p0, La/mo0;->k:J

    .line 6
    .line 7
    iget-boolean v6, p0, La/mo0;->l:Z

    .line 8
    .line 9
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    iget-object v10, p0, La/mo0;->n:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v10, La/f7u;

    .line 19
    .line 20
    sget-object v11, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v0, p0, La/mo0;->j:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-ne v0, v8, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v0, p1

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v9

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v10, La/f7u;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/gst0;

    .line 44
    .line 45
    iget-object v0, v0, La/gst0;->a:La/rrt0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/rrt0;->a()La/krt0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-boolean v1, p0, La/mo0;->l:Z

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iget-boolean v2, v0, La/krt0;->c:Z

    .line 56
    .line 57
    :goto_0
    move v6, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-boolean v2, v0, La/krt0;->b:Z

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :goto_1
    iget-object v2, v10, La/f7u;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, La/wdu;

    .line 65
    .line 66
    iget-wide v3, v0, La/krt0;->a:J

    .line 67
    .line 68
    iget-object v0, v10, La/f7u;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/uzc;

    .line 71
    .line 72
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iput-boolean v8, p0, La/mo0;->j:Z

    .line 77
    .line 78
    move-object v0, v2

    .line 79
    move-wide v8, v3

    .line 80
    iget-wide v2, p0, La/mo0;->k:J

    .line 81
    .line 82
    move-wide v12, v8

    .line 83
    iget-wide v8, p0, La/mo0;->m:J

    .line 84
    .line 85
    move-object v10, p0

    .line 86
    move-wide v4, v12

    .line 87
    invoke-virtual/range {v0 .. v10}, La/wdu;->g(ZJJZLa/jvn;JLa/zje;)Ljava/io/Serializable;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-ne v0, v11, :cond_3

    .line 92
    .line 93
    move-object v0, v11

    .line 94
    :cond_3
    :goto_2
    return-object v0

    .line 95
    :pswitch_0
    sget-object v11, La/wne;->a:La/wne;

    .line 96
    .line 97
    iget-boolean v0, p0, La/mo0;->j:Z

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    if-ne v0, v8, :cond_4

    .line 102
    .line 103
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    if-eqz v6, :cond_6

    .line 115
    .line 116
    move-wide v1, v3

    .line 117
    :cond_6
    move-object v0, v10

    .line 118
    check-cast v0, La/t33;

    .line 119
    .line 120
    iget-object v0, v0, La/t33;->e:La/pz40;

    .line 121
    .line 122
    check-cast v0, La/hgk0;

    .line 123
    .line 124
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/y3d;

    .line 129
    .line 130
    iget-wide v3, v0, La/y3d;->a:J

    .line 131
    .line 132
    invoke-static {v3, v4, v1, v2}, La/h2t0;->a(JJ)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_7

    .line 137
    .line 138
    move-object v0, v10

    .line 139
    check-cast v0, La/t33;

    .line 140
    .line 141
    new-instance v3, La/y3d;

    .line 142
    .line 143
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 144
    .line 145
    .line 146
    sget-object v1, La/ihn;->a:La/zsf;

    .line 147
    .line 148
    const/4 v2, 0x2

    .line 149
    const/16 v4, 0x2bc

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    invoke-static {v4, v6, v1, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iput-boolean v8, p0, La/mo0;->j:Z

    .line 157
    .line 158
    move-object v1, v3

    .line 159
    const/4 v3, 0x0

    .line 160
    const/4 v4, 0x0

    .line 161
    const/16 v6, 0xc

    .line 162
    .line 163
    move-object v5, p0

    .line 164
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-ne v0, v11, :cond_7

    .line 169
    .line 170
    move-object v9, v11

    .line 171
    goto :goto_4

    .line 172
    :cond_7
    :goto_3
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_4
    return-object v9

    .line 175
    :pswitch_1
    check-cast v10, La/dp1;

    .line 176
    .line 177
    sget-object v11, La/wne;->a:La/wne;

    .line 178
    .line 179
    iget-boolean v0, p0, La/mo0;->j:Z

    .line 180
    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    if-ne v0, v8, :cond_8

    .line 184
    .line 185
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_8
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, La/bo1;

    .line 201
    .line 202
    iget-object v0, v0, La/bo1;->g:Ljava/util/Map;

    .line 203
    .line 204
    new-instance v7, Ljava/lang/Long;

    .line 205
    .line 206
    invoke-direct {v7, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, La/mlr;

    .line 214
    .line 215
    if-eqz v0, :cond_a

    .line 216
    .line 217
    iget-object v3, v10, La/dp1;->z:La/xr;

    .line 218
    .line 219
    xor-int/lit8 v4, v6, 0x1

    .line 220
    .line 221
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    check-cast v6, La/bo1;

    .line 226
    .line 227
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10, v0, v1, v2}, La/dp1;->N(La/mlr;J)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iput-boolean v8, p0, La/mo0;->j:Z

    .line 235
    .line 236
    move v2, v4

    .line 237
    move-object v4, v1

    .line 238
    move-object v1, v0

    .line 239
    move-object v0, v3

    .line 240
    const/4 v3, 0x0

    .line 241
    move-object v5, p0

    .line 242
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-ne v0, v11, :cond_a

    .line 247
    .line 248
    move-object v9, v11

    .line 249
    goto :goto_6

    .line 250
    :cond_a
    :goto_5
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    :goto_6
    return-object v9

    .line 253
    :pswitch_2
    check-cast v10, La/qo0;

    .line 254
    .line 255
    sget-object v11, La/wne;->a:La/wne;

    .line 256
    .line 257
    iget-boolean v0, p0, La/mo0;->j:Z

    .line 258
    .line 259
    if-eqz v0, :cond_c

    .line 260
    .line 261
    if-ne v0, v8, :cond_b

    .line 262
    .line 263
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_b
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, La/ln0;

    .line 279
    .line 280
    iget-object v0, v0, La/ln0;->j:Ljava/util/Map;

    .line 281
    .line 282
    new-instance v7, Ljava/lang/Long;

    .line 283
    .line 284
    invoke-direct {v7, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, La/mlr;

    .line 292
    .line 293
    if-eqz v0, :cond_f

    .line 294
    .line 295
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    check-cast v3, La/ln0;

    .line 300
    .line 301
    iget-object v3, v3, La/ln0;->a:La/yk0;

    .line 302
    .line 303
    iget-object v4, v10, La/qo0;->G:La/xr;

    .line 304
    .line 305
    xor-int/2addr v6, v8

    .line 306
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-eqz v7, :cond_e

    .line 311
    .line 312
    if-ne v7, v8, :cond_d

    .line 313
    .line 314
    const/16 v7, 0x1fb5

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 318
    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_e
    const/16 v7, 0x1fbb

    .line 322
    .line 323
    :goto_7
    invoke-virtual {v10, v0, v1, v2, v3}, La/qo0;->P(La/mlr;JLa/yk0;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    iput-boolean v8, p0, La/mo0;->j:Z

    .line 328
    .line 329
    move-object v2, v1

    .line 330
    move-object v1, v0

    .line 331
    move-object v0, v4

    .line 332
    move-object v4, v2

    .line 333
    move-object v5, p0

    .line 334
    move v2, v6

    .line 335
    move v3, v7

    .line 336
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-ne v0, v11, :cond_f

    .line 341
    .line 342
    move-object v9, v11

    .line 343
    goto :goto_9

    .line 344
    :cond_f
    :goto_8
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    :goto_9
    return-object v9

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
