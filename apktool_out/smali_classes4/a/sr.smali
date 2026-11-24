.class public final La/sr;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:J

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/sr;->i:B

    iput-object p1, p0, La/sr;->k:Ljava/lang/Object;

    iput-object p2, p0, La/sr;->m:Ljava/lang/Object;

    iput-wide p3, p0, La/sr;->l:J

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/sr;->i:B

    iput-object p1, p0, La/sr;->k:Ljava/lang/Object;

    iput-wide p2, p0, La/sr;->l:J

    iput-object p4, p0, La/sr;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/sr;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/sr;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/sr;->k:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/sr;

    .line 11
    .line 12
    move-object v4, v2

    .line 13
    check-cast v4, La/f2u0;

    .line 14
    .line 15
    move-object v5, v1

    .line 16
    check-cast v5, La/szj0;

    .line 17
    .line 18
    iget-wide v6, p0, La/sr;->l:J

    .line 19
    .line 20
    const/16 v9, 0x10

    .line 21
    .line 22
    move-object v8, p1

    .line 23
    invoke-direct/range {v3 .. v9}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 24
    .line 25
    .line 26
    return-object v3

    .line 27
    :pswitch_0
    move-object v9, p1

    .line 28
    new-instance v4, La/sr;

    .line 29
    .line 30
    move-object v5, v2

    .line 31
    check-cast v5, La/m5r0;

    .line 32
    .line 33
    move-object v6, v1

    .line 34
    check-cast v6, Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v7, p0, La/sr;->l:J

    .line 37
    .line 38
    const/16 v10, 0xf

    .line 39
    .line 40
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object v4

    .line 44
    :pswitch_1
    move-object v9, p1

    .line 45
    new-instance v4, La/sr;

    .line 46
    .line 47
    move-object v5, v2

    .line 48
    check-cast v5, La/lhf0;

    .line 49
    .line 50
    move-object v8, v1

    .line 51
    check-cast v8, La/h9n0;

    .line 52
    .line 53
    const/16 v10, 0xe

    .line 54
    .line 55
    iget-wide v6, p0, La/sr;->l:J

    .line 56
    .line 57
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    return-object v4

    .line 61
    :pswitch_2
    move-object v9, p1

    .line 62
    new-instance v4, La/sr;

    .line 63
    .line 64
    move-object v5, v2

    .line 65
    check-cast v5, La/lhf0;

    .line 66
    .line 67
    move-object v8, v1

    .line 68
    check-cast v8, La/xvs;

    .line 69
    .line 70
    const/16 v10, 0xd

    .line 71
    .line 72
    iget-wide v6, p0, La/sr;->l:J

    .line 73
    .line 74
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 75
    .line 76
    .line 77
    return-object v4

    .line 78
    :pswitch_3
    move-object v9, p1

    .line 79
    new-instance v4, La/sr;

    .line 80
    .line 81
    move-object v5, v2

    .line 82
    check-cast v5, La/d1e0;

    .line 83
    .line 84
    move-object v6, v1

    .line 85
    check-cast v6, La/szj0;

    .line 86
    .line 87
    iget-wide v7, p0, La/sr;->l:J

    .line 88
    .line 89
    const/16 v10, 0xc

    .line 90
    .line 91
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 92
    .line 93
    .line 94
    return-object v4

    .line 95
    :pswitch_4
    move-object v9, p1

    .line 96
    new-instance v4, La/sr;

    .line 97
    .line 98
    move-object v5, v2

    .line 99
    check-cast v5, La/g7a0;

    .line 100
    .line 101
    move-object v8, v1

    .line 102
    check-cast v8, Ljava/lang/String;

    .line 103
    .line 104
    const/16 v10, 0xb

    .line 105
    .line 106
    iget-wide v6, p0, La/sr;->l:J

    .line 107
    .line 108
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 109
    .line 110
    .line 111
    return-object v4

    .line 112
    :pswitch_5
    move-object v9, p1

    .line 113
    new-instance v4, La/sr;

    .line 114
    .line 115
    move-object v5, v2

    .line 116
    check-cast v5, La/nl40;

    .line 117
    .line 118
    move-object v6, v1

    .line 119
    check-cast v6, La/szj0;

    .line 120
    .line 121
    iget-wide v7, p0, La/sr;->l:J

    .line 122
    .line 123
    const/16 v10, 0xa

    .line 124
    .line 125
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 126
    .line 127
    .line 128
    return-object v4

    .line 129
    :pswitch_6
    move-object v9, p1

    .line 130
    new-instance v4, La/sr;

    .line 131
    .line 132
    move-object v5, v2

    .line 133
    check-cast v5, La/u610;

    .line 134
    .line 135
    move-object v6, v1

    .line 136
    check-cast v6, La/szj0;

    .line 137
    .line 138
    iget-wide v7, p0, La/sr;->l:J

    .line 139
    .line 140
    const/16 v10, 0x9

    .line 141
    .line 142
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 143
    .line 144
    .line 145
    return-object v4

    .line 146
    :pswitch_7
    move-object v9, p1

    .line 147
    new-instance v4, La/sr;

    .line 148
    .line 149
    move-object v5, v2

    .line 150
    check-cast v5, La/k4s;

    .line 151
    .line 152
    move-object v8, v1

    .line 153
    check-cast v8, La/q5z;

    .line 154
    .line 155
    const/16 v10, 0x8

    .line 156
    .line 157
    iget-wide v6, p0, La/sr;->l:J

    .line 158
    .line 159
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 160
    .line 161
    .line 162
    return-object v4

    .line 163
    :pswitch_8
    move-object v9, p1

    .line 164
    new-instance v4, La/sr;

    .line 165
    .line 166
    move-object v5, v2

    .line 167
    check-cast v5, La/b7o;

    .line 168
    .line 169
    move-object v6, v1

    .line 170
    check-cast v6, La/szj0;

    .line 171
    .line 172
    iget-wide v7, p0, La/sr;->l:J

    .line 173
    .line 174
    const/4 v10, 0x7

    .line 175
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 176
    .line 177
    .line 178
    return-object v4

    .line 179
    :pswitch_9
    move-object v9, p1

    .line 180
    new-instance v4, La/sr;

    .line 181
    .line 182
    move-object v5, v2

    .line 183
    check-cast v5, La/ebl;

    .line 184
    .line 185
    move-object v6, v1

    .line 186
    check-cast v6, La/szj0;

    .line 187
    .line 188
    iget-wide v7, p0, La/sr;->l:J

    .line 189
    .line 190
    const/4 v10, 0x6

    .line 191
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 192
    .line 193
    .line 194
    return-object v4

    .line 195
    :pswitch_a
    move-object v9, p1

    .line 196
    new-instance v4, La/sr;

    .line 197
    .line 198
    move-object v5, v2

    .line 199
    check-cast v5, La/xig;

    .line 200
    .line 201
    move-object v8, v1

    .line 202
    check-cast v8, La/npn;

    .line 203
    .line 204
    const/4 v10, 0x5

    .line 205
    iget-wide v6, p0, La/sr;->l:J

    .line 206
    .line 207
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 208
    .line 209
    .line 210
    return-object v4

    .line 211
    :pswitch_b
    move-object v9, p1

    .line 212
    new-instance v4, La/sr;

    .line 213
    .line 214
    move-object v5, v2

    .line 215
    check-cast v5, La/rnf;

    .line 216
    .line 217
    move-object v6, v1

    .line 218
    check-cast v6, La/szj0;

    .line 219
    .line 220
    iget-wide v7, p0, La/sr;->l:J

    .line 221
    .line 222
    const/4 v10, 0x4

    .line 223
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 224
    .line 225
    .line 226
    return-object v4

    .line 227
    :pswitch_c
    move-object v9, p1

    .line 228
    new-instance v4, La/sr;

    .line 229
    .line 230
    move-object v5, v2

    .line 231
    check-cast v5, La/dp1;

    .line 232
    .line 233
    move-object v6, v1

    .line 234
    check-cast v6, La/mlr;

    .line 235
    .line 236
    iget-wide v7, p0, La/sr;->l:J

    .line 237
    .line 238
    const/4 v10, 0x3

    .line 239
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 240
    .line 241
    .line 242
    return-object v4

    .line 243
    :pswitch_d
    move-object v9, p1

    .line 244
    new-instance v4, La/sr;

    .line 245
    .line 246
    move-object v5, v2

    .line 247
    check-cast v5, La/n21;

    .line 248
    .line 249
    move-object v6, v1

    .line 250
    check-cast v6, La/js0;

    .line 251
    .line 252
    iget-wide v7, p0, La/sr;->l:J

    .line 253
    .line 254
    const/4 v10, 0x2

    .line 255
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(La/i3t0;Ljava/lang/Object;JLa/yje;B)V

    .line 256
    .line 257
    .line 258
    return-object v4

    .line 259
    :pswitch_e
    move-object v9, p1

    .line 260
    new-instance v4, La/sr;

    .line 261
    .line 262
    move-object v5, v2

    .line 263
    check-cast v5, La/xr;

    .line 264
    .line 265
    move-object v8, v1

    .line 266
    check-cast v8, La/h9n0;

    .line 267
    .line 268
    const/4 v10, 0x1

    .line 269
    iget-wide v6, p0, La/sr;->l:J

    .line 270
    .line 271
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 272
    .line 273
    .line 274
    return-object v4

    .line 275
    :pswitch_f
    move-object v9, p1

    .line 276
    new-instance v4, La/sr;

    .line 277
    .line 278
    move-object v5, v2

    .line 279
    check-cast v5, La/xr;

    .line 280
    .line 281
    move-object v8, v1

    .line 282
    check-cast v8, La/xvs;

    .line 283
    .line 284
    const/4 v10, 0x0

    .line 285
    iget-wide v6, p0, La/sr;->l:J

    .line 286
    .line 287
    invoke-direct/range {v4 .. v10}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 288
    .line 289
    .line 290
    return-object v4

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sr;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/sr;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/sr;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/sr;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/sr;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/sr;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/sr;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/sr;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/sr;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_7
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/sr;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_8
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/sr;

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_9
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/sr;

    .line 143
    .line 144
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_a
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, La/sr;

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_b
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/sr;

    .line 169
    .line 170
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_c
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, La/sr;

    .line 182
    .line 183
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_d
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, La/sr;

    .line 195
    .line 196
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_e
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, La/sr;

    .line 208
    .line 209
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_f
    invoke-virtual {p0, p1}, La/sr;->create(La/yje;)La/yje;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, La/sr;

    .line 221
    .line 222
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    invoke-virtual {p0, p1}, La/sr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/sr;->i:B

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    iget-wide v2, v5, La/sr;->l:J

    .line 8
    .line 9
    const-wide/16 v6, 0x0

    .line 10
    .line 11
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v8, v5, La/sr;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v9, v5, La/sr;->m:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v9, La/szj0;

    .line 22
    .line 23
    check-cast v8, La/f2u0;

    .line 24
    .line 25
    sget-object v0, La/wne;->a:La/wne;

    .line 26
    .line 27
    iget-boolean v1, v5, La/sr;->j:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-ne v1, v10, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v8, La/f2u0;->S:La/h3c;

    .line 48
    .line 49
    iget-wide v2, v9, La/szj0;->c:J

    .line 50
    .line 51
    iput-boolean v10, v5, La/sr;->j:Z

    .line 52
    .line 53
    invoke-virtual {v1, v2, v3, v5}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-ne v1, v0, :cond_2

    .line 58
    .line 59
    move-object v11, v0

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v19

    .line 67
    iget-object v0, v8, La/f2u0;->T:La/qv2;

    .line 68
    .line 69
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 70
    .line 71
    sget-object v24, La/grs;->b:La/grs;

    .line 72
    .line 73
    sget-object v27, La/ors;->a:La/ors;

    .line 74
    .line 75
    sget-object v30, La/k1g;->h:La/k1g;

    .line 76
    .line 77
    iget-wide v1, v9, La/szj0;->c:J

    .line 78
    .line 79
    iget-object v3, v9, La/szj0;->d:Ljava/lang/Long;

    .line 80
    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v6

    .line 87
    :cond_3
    move-wide/from16 v17, v6

    .line 88
    .line 89
    iget-object v3, v9, La/szj0;->b:La/sip;

    .line 90
    .line 91
    invoke-static {v3}, La/kpb;->u(La/sip;)Z

    .line 92
    .line 93
    .line 94
    move-result v22

    .line 95
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 96
    .line 97
    iget-wide v11, v5, La/sr;->l:J

    .line 98
    .line 99
    const-wide/16 v13, 0x0

    .line 100
    .line 101
    const-wide/16 v20, 0x0

    .line 102
    .line 103
    const-string v25, "main_screen"

    .line 104
    .line 105
    const-string v26, ""

    .line 106
    .line 107
    const/16 v28, 0x0

    .line 108
    .line 109
    const/16 v29, 0x0

    .line 110
    .line 111
    move-wide v15, v1

    .line 112
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v1, v8, La/f2u0;->P:La/oeg0;

    .line 120
    .line 121
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v2, La/m8s0;

    .line 126
    .line 127
    const/4 v3, 0x6

    .line 128
    invoke-direct {v2, v9, v8, v0, v3}, La/m8s0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 132
    .line 133
    .line 134
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    :goto_1
    return-object v11

    .line 137
    :pswitch_0
    check-cast v8, La/m5r0;

    .line 138
    .line 139
    sget-object v0, La/wne;->a:La/wne;

    .line 140
    .line 141
    iget-boolean v1, v5, La/sr;->j:Z

    .line 142
    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    if-ne v1, v10, :cond_4

    .line 146
    .line 147
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/4 v11, 0x0

    .line 155
    goto :goto_3

    .line 156
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v8, La/m5r0;->q:La/hjd;

    .line 160
    .line 161
    new-instance v4, La/cid;

    .line 162
    .line 163
    check-cast v9, Ljava/lang/String;

    .line 164
    .line 165
    new-instance v6, La/ks2;

    .line 166
    .line 167
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-direct {v4, v9, v6}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 171
    .line 172
    .line 173
    iput-boolean v10, v5, La/sr;->j:Z

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v4, v5}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-ne v1, v0, :cond_6

    .line 183
    .line 184
    move-object v11, v0

    .line 185
    goto :goto_3

    .line 186
    :cond_6
    :goto_2
    new-instance v0, La/pid;

    .line 187
    .line 188
    invoke-direct {v0, v2, v3}, La/pid;-><init>(J)V

    .line 189
    .line 190
    .line 191
    sget v1, La/m5r0;->E:I

    .line 192
    .line 193
    invoke-virtual {v8, v0}, La/m5r0;->N(La/uid;)V

    .line 194
    .line 195
    .line 196
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    :goto_3
    return-object v11

    .line 199
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 200
    .line 201
    iget-boolean v1, v5, La/sr;->j:Z

    .line 202
    .line 203
    if-eqz v1, :cond_8

    .line 204
    .line 205
    if-ne v1, v10, :cond_7

    .line 206
    .line 207
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/4 v11, 0x0

    .line 215
    goto :goto_5

    .line 216
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    check-cast v8, La/lhf0;

    .line 220
    .line 221
    iget-object v1, v8, La/lhf0;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v1, La/kki;

    .line 224
    .line 225
    invoke-static {v2, v3}, La/cs0;->u(J)Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    check-cast v9, La/h9n0;

    .line 230
    .line 231
    iput-boolean v10, v5, La/sr;->j:Z

    .line 232
    .line 233
    invoke-virtual {v1, v2, v9, v5}, La/kki;->c(Ljava/util/List;La/h9n0;La/zje;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    if-ne v1, v0, :cond_9

    .line 238
    .line 239
    move-object v11, v0

    .line 240
    goto :goto_5

    .line 241
    :cond_9
    :goto_4
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    :goto_5
    return-object v11

    .line 244
    :pswitch_2
    sget-object v6, La/wne;->a:La/wne;

    .line 245
    .line 246
    iget-boolean v0, v5, La/sr;->j:Z

    .line 247
    .line 248
    if-eqz v0, :cond_b

    .line 249
    .line 250
    if-ne v0, v10, :cond_a

    .line 251
    .line 252
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v0, p1

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const/4 v0, 0x0

    .line 262
    goto :goto_6

    .line 263
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    check-cast v8, La/lhf0;

    .line 267
    .line 268
    iget-object v0, v8, La/lhf0;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, La/m0o0;

    .line 271
    .line 272
    move-object v4, v9

    .line 273
    check-cast v4, La/xvs;

    .line 274
    .line 275
    iput-boolean v10, v5, La/sr;->j:Z

    .line 276
    .line 277
    iget-object v0, v0, La/m0o0;->b:La/abp;

    .line 278
    .line 279
    iget-wide v1, v5, La/sr;->l:J

    .line 280
    .line 281
    const/4 v3, 0x0

    .line 282
    invoke-virtual/range {v0 .. v5}, La/abp;->b(JZLa/xvs;La/zje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-ne v0, v6, :cond_c

    .line 287
    .line 288
    move-object v0, v6

    .line 289
    :cond_c
    :goto_6
    return-object v0

    .line 290
    :pswitch_3
    check-cast v9, La/szj0;

    .line 291
    .line 292
    check-cast v8, La/d1e0;

    .line 293
    .line 294
    sget-object v0, La/wne;->a:La/wne;

    .line 295
    .line 296
    iget-boolean v1, v5, La/sr;->j:Z

    .line 297
    .line 298
    if-eqz v1, :cond_e

    .line 299
    .line 300
    if-ne v1, v10, :cond_d

    .line 301
    .line 302
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v1, p1

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const/4 v11, 0x0

    .line 312
    goto :goto_8

    .line 313
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iget-object v1, v8, La/d1e0;->S:La/h3c;

    .line 317
    .line 318
    iget-wide v2, v9, La/szj0;->c:J

    .line 319
    .line 320
    iput-boolean v10, v5, La/sr;->j:Z

    .line 321
    .line 322
    invoke-virtual {v1, v2, v3, v5}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    if-ne v1, v0, :cond_f

    .line 327
    .line 328
    move-object v11, v0

    .line 329
    goto :goto_8

    .line 330
    :cond_f
    :goto_7
    check-cast v1, Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 333
    .line 334
    .line 335
    move-result v19

    .line 336
    iget-object v0, v8, La/d1e0;->T:La/qv2;

    .line 337
    .line 338
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 339
    .line 340
    sget-object v24, La/grs;->b:La/grs;

    .line 341
    .line 342
    sget-object v27, La/ors;->a:La/ors;

    .line 343
    .line 344
    sget-object v30, La/k1g;->h:La/k1g;

    .line 345
    .line 346
    iget-wide v1, v9, La/szj0;->c:J

    .line 347
    .line 348
    iget-object v3, v9, La/szj0;->d:Ljava/lang/Long;

    .line 349
    .line 350
    if-eqz v3, :cond_10

    .line 351
    .line 352
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 353
    .line 354
    .line 355
    move-result-wide v6

    .line 356
    :cond_10
    move-wide/from16 v17, v6

    .line 357
    .line 358
    iget-object v3, v9, La/szj0;->b:La/sip;

    .line 359
    .line 360
    invoke-static {v3}, La/kpb;->u(La/sip;)Z

    .line 361
    .line 362
    .line 363
    move-result v22

    .line 364
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 365
    .line 366
    iget-wide v11, v5, La/sr;->l:J

    .line 367
    .line 368
    const-wide/16 v13, 0x0

    .line 369
    .line 370
    const-wide/16 v20, 0x0

    .line 371
    .line 372
    const-string v25, "main_screen"

    .line 373
    .line 374
    const-string v26, ""

    .line 375
    .line 376
    const/16 v28, 0x0

    .line 377
    .line 378
    const/16 v29, 0x0

    .line 379
    .line 380
    move-wide v15, v1

    .line 381
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    iget-object v1, v8, La/d1e0;->P:La/oeg0;

    .line 389
    .line 390
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    new-instance v2, La/zlb0;

    .line 395
    .line 396
    const/16 v3, 0x9

    .line 397
    .line 398
    invoke-direct {v2, v9, v8, v0, v3}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 402
    .line 403
    .line 404
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    :goto_8
    return-object v11

    .line 407
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 408
    .line 409
    iget-boolean v1, v5, La/sr;->j:Z

    .line 410
    .line 411
    if-eqz v1, :cond_12

    .line 412
    .line 413
    if-ne v1, v10, :cond_11

    .line 414
    .line 415
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_11
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    const/4 v11, 0x0

    .line 423
    goto :goto_a

    .line 424
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    check-cast v8, La/g7a0;

    .line 428
    .line 429
    iget-object v1, v8, La/g7a0;->r:La/eu90;

    .line 430
    .line 431
    new-instance v11, La/vt20;

    .line 432
    .line 433
    move-object v15, v9

    .line 434
    check-cast v15, Ljava/lang/String;

    .line 435
    .line 436
    const/4 v12, 0x0

    .line 437
    const/16 v16, 0x0

    .line 438
    .line 439
    iget-wide v13, v5, La/sr;->l:J

    .line 440
    .line 441
    invoke-direct/range {v11 .. v16}, La/vt20;-><init>(IJLjava/lang/String;Z)V

    .line 442
    .line 443
    .line 444
    iput-boolean v10, v5, La/sr;->j:Z

    .line 445
    .line 446
    invoke-virtual {v1, v11, v5}, La/eu90;->a(La/vt20;La/zje;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    if-ne v1, v0, :cond_13

    .line 451
    .line 452
    move-object v11, v0

    .line 453
    goto :goto_a

    .line 454
    :cond_13
    :goto_9
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    :goto_a
    return-object v11

    .line 457
    :pswitch_5
    check-cast v9, La/szj0;

    .line 458
    .line 459
    check-cast v8, La/nl40;

    .line 460
    .line 461
    sget-object v0, La/wne;->a:La/wne;

    .line 462
    .line 463
    iget-boolean v1, v5, La/sr;->j:Z

    .line 464
    .line 465
    if-eqz v1, :cond_15

    .line 466
    .line 467
    if-ne v1, v10, :cond_14

    .line 468
    .line 469
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    move-object/from16 v1, p1

    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_14
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    const/4 v11, 0x0

    .line 479
    goto :goto_c

    .line 480
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    iget-object v1, v8, La/nl40;->N:La/h3c;

    .line 484
    .line 485
    iget-wide v2, v9, La/szj0;->c:J

    .line 486
    .line 487
    iput-boolean v10, v5, La/sr;->j:Z

    .line 488
    .line 489
    invoke-virtual {v1, v2, v3, v5}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    if-ne v1, v0, :cond_16

    .line 494
    .line 495
    move-object v11, v0

    .line 496
    goto :goto_c

    .line 497
    :cond_16
    :goto_b
    check-cast v1, Ljava/lang/Boolean;

    .line 498
    .line 499
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 500
    .line 501
    .line 502
    move-result v19

    .line 503
    iget-object v0, v8, La/nl40;->O:La/qv2;

    .line 504
    .line 505
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 506
    .line 507
    sget-object v24, La/grs;->b:La/grs;

    .line 508
    .line 509
    sget-object v27, La/ors;->a:La/ors;

    .line 510
    .line 511
    sget-object v30, La/k1g;->h:La/k1g;

    .line 512
    .line 513
    iget-wide v1, v9, La/szj0;->c:J

    .line 514
    .line 515
    iget-object v3, v9, La/szj0;->d:Ljava/lang/Long;

    .line 516
    .line 517
    if-eqz v3, :cond_17

    .line 518
    .line 519
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 520
    .line 521
    .line 522
    move-result-wide v6

    .line 523
    :cond_17
    move-wide/from16 v17, v6

    .line 524
    .line 525
    iget-object v3, v9, La/szj0;->b:La/sip;

    .line 526
    .line 527
    invoke-static {v3}, La/kpb;->u(La/sip;)Z

    .line 528
    .line 529
    .line 530
    move-result v22

    .line 531
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 532
    .line 533
    iget-wide v11, v5, La/sr;->l:J

    .line 534
    .line 535
    const-wide/16 v13, 0x0

    .line 536
    .line 537
    const-wide/16 v20, 0x0

    .line 538
    .line 539
    const-string v25, "main_screen"

    .line 540
    .line 541
    const-string v26, ""

    .line 542
    .line 543
    const/16 v28, 0x0

    .line 544
    .line 545
    const/16 v29, 0x0

    .line 546
    .line 547
    move-wide v15, v1

    .line 548
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    iget-object v1, v8, La/nl40;->L:La/oeg0;

    .line 556
    .line 557
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    new-instance v2, La/jl40;

    .line 562
    .line 563
    const/4 v3, 0x0

    .line 564
    invoke-direct {v2, v9, v8, v0, v3}, La/jl40;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 568
    .line 569
    .line 570
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    :goto_c
    return-object v11

    .line 573
    :pswitch_6
    check-cast v9, La/szj0;

    .line 574
    .line 575
    check-cast v8, La/u610;

    .line 576
    .line 577
    sget-object v0, La/wne;->a:La/wne;

    .line 578
    .line 579
    iget-boolean v1, v5, La/sr;->j:Z

    .line 580
    .line 581
    if-eqz v1, :cond_19

    .line 582
    .line 583
    if-ne v1, v10, :cond_18

    .line 584
    .line 585
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    move-object/from16 v1, p1

    .line 589
    .line 590
    goto :goto_d

    .line 591
    :cond_18
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    const/4 v11, 0x0

    .line 595
    goto :goto_e

    .line 596
    :cond_19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    iget-object v1, v8, La/u610;->S:La/h3c;

    .line 600
    .line 601
    iget-wide v2, v9, La/szj0;->c:J

    .line 602
    .line 603
    iput-boolean v10, v5, La/sr;->j:Z

    .line 604
    .line 605
    invoke-virtual {v1, v2, v3, v5}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    if-ne v1, v0, :cond_1a

    .line 610
    .line 611
    move-object v11, v0

    .line 612
    goto :goto_e

    .line 613
    :cond_1a
    :goto_d
    check-cast v1, Ljava/lang/Boolean;

    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 616
    .line 617
    .line 618
    move-result v19

    .line 619
    iget-object v0, v8, La/u610;->T:La/qv2;

    .line 620
    .line 621
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 622
    .line 623
    sget-object v24, La/grs;->b:La/grs;

    .line 624
    .line 625
    sget-object v27, La/ors;->a:La/ors;

    .line 626
    .line 627
    sget-object v30, La/k1g;->h:La/k1g;

    .line 628
    .line 629
    iget-wide v1, v9, La/szj0;->c:J

    .line 630
    .line 631
    iget-object v3, v9, La/szj0;->d:Ljava/lang/Long;

    .line 632
    .line 633
    if-eqz v3, :cond_1b

    .line 634
    .line 635
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 636
    .line 637
    .line 638
    move-result-wide v6

    .line 639
    :cond_1b
    move-wide/from16 v17, v6

    .line 640
    .line 641
    iget-object v3, v9, La/szj0;->b:La/sip;

    .line 642
    .line 643
    invoke-static {v3}, La/kpb;->u(La/sip;)Z

    .line 644
    .line 645
    .line 646
    move-result v22

    .line 647
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 648
    .line 649
    iget-wide v11, v5, La/sr;->l:J

    .line 650
    .line 651
    const-wide/16 v13, 0x0

    .line 652
    .line 653
    const-wide/16 v20, 0x0

    .line 654
    .line 655
    const-string v25, "main_screen"

    .line 656
    .line 657
    const-string v26, ""

    .line 658
    .line 659
    const/16 v28, 0x0

    .line 660
    .line 661
    const/16 v29, 0x0

    .line 662
    .line 663
    move-wide v15, v1

    .line 664
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    iget-object v1, v8, La/u610;->P:La/oeg0;

    .line 672
    .line 673
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    new-instance v2, La/k9v;

    .line 678
    .line 679
    const/16 v3, 0x15

    .line 680
    .line 681
    invoke-direct {v2, v9, v8, v0, v3}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 685
    .line 686
    .line 687
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 688
    .line 689
    :goto_e
    return-object v11

    .line 690
    :pswitch_7
    sget-object v0, La/wne;->a:La/wne;

    .line 691
    .line 692
    iget-boolean v1, v5, La/sr;->j:Z

    .line 693
    .line 694
    if-eqz v1, :cond_1d

    .line 695
    .line 696
    if-ne v1, v10, :cond_1c

    .line 697
    .line 698
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    goto :goto_f

    .line 702
    :cond_1c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    const/4 v11, 0x0

    .line 706
    goto :goto_10

    .line 707
    :cond_1d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    check-cast v8, La/k4s;

    .line 711
    .line 712
    iget-object v1, v8, La/k4s;->B:La/nc0;

    .line 713
    .line 714
    check-cast v9, La/q5z;

    .line 715
    .line 716
    iput-boolean v10, v5, La/sr;->j:Z

    .line 717
    .line 718
    invoke-virtual {v1, v2, v3, v9, v5}, La/nc0;->w(JLa/q5z;La/zje;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    if-ne v1, v0, :cond_1e

    .line 723
    .line 724
    move-object v11, v0

    .line 725
    goto :goto_10

    .line 726
    :cond_1e
    :goto_f
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 727
    .line 728
    :goto_10
    return-object v11

    .line 729
    :pswitch_8
    check-cast v9, La/szj0;

    .line 730
    .line 731
    check-cast v8, La/b7o;

    .line 732
    .line 733
    sget-object v0, La/wne;->a:La/wne;

    .line 734
    .line 735
    iget-boolean v2, v5, La/sr;->j:Z

    .line 736
    .line 737
    if-eqz v2, :cond_20

    .line 738
    .line 739
    if-ne v2, v10, :cond_1f

    .line 740
    .line 741
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    move-object/from16 v2, p1

    .line 745
    .line 746
    goto :goto_11

    .line 747
    :cond_1f
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    const/4 v11, 0x0

    .line 751
    goto :goto_12

    .line 752
    :cond_20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    iget-object v2, v8, La/b7o;->M:La/h3c;

    .line 756
    .line 757
    iget-wide v3, v9, La/szj0;->c:J

    .line 758
    .line 759
    iput-boolean v10, v5, La/sr;->j:Z

    .line 760
    .line 761
    invoke-virtual {v2, v3, v4, v5}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    if-ne v2, v0, :cond_21

    .line 766
    .line 767
    move-object v11, v0

    .line 768
    goto :goto_12

    .line 769
    :cond_21
    :goto_11
    check-cast v2, Ljava/lang/Boolean;

    .line 770
    .line 771
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 772
    .line 773
    .line 774
    move-result v19

    .line 775
    iget-object v0, v8, La/b7o;->N:La/qv2;

    .line 776
    .line 777
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 778
    .line 779
    sget-object v24, La/grs;->b:La/grs;

    .line 780
    .line 781
    sget-object v27, La/ors;->a:La/ors;

    .line 782
    .line 783
    sget-object v30, La/k1g;->h:La/k1g;

    .line 784
    .line 785
    iget-wide v2, v9, La/szj0;->c:J

    .line 786
    .line 787
    iget-object v4, v9, La/szj0;->d:Ljava/lang/Long;

    .line 788
    .line 789
    if-eqz v4, :cond_22

    .line 790
    .line 791
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 792
    .line 793
    .line 794
    move-result-wide v6

    .line 795
    :cond_22
    move-wide/from16 v17, v6

    .line 796
    .line 797
    iget-object v4, v9, La/szj0;->b:La/sip;

    .line 798
    .line 799
    invoke-static {v4}, La/kpb;->u(La/sip;)Z

    .line 800
    .line 801
    .line 802
    move-result v22

    .line 803
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 804
    .line 805
    iget-wide v11, v5, La/sr;->l:J

    .line 806
    .line 807
    const-wide/16 v13, 0x0

    .line 808
    .line 809
    const-wide/16 v20, 0x0

    .line 810
    .line 811
    const-string v25, "main_screen"

    .line 812
    .line 813
    const-string v26, ""

    .line 814
    .line 815
    const/16 v28, 0x0

    .line 816
    .line 817
    const/16 v29, 0x0

    .line 818
    .line 819
    move-wide v15, v2

    .line 820
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    iget-object v2, v8, La/b7o;->L:La/oeg0;

    .line 828
    .line 829
    invoke-virtual {v2}, La/oeg0;->c()La/i1w0;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    new-instance v3, La/f8m;

    .line 834
    .line 835
    invoke-direct {v3, v9, v8, v0, v1}, La/f8m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 839
    .line 840
    .line 841
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 842
    .line 843
    :goto_12
    return-object v11

    .line 844
    :pswitch_9
    check-cast v9, La/szj0;

    .line 845
    .line 846
    check-cast v8, La/ebl;

    .line 847
    .line 848
    sget-object v0, La/wne;->a:La/wne;

    .line 849
    .line 850
    iget-boolean v1, v5, La/sr;->j:Z

    .line 851
    .line 852
    if-eqz v1, :cond_24

    .line 853
    .line 854
    if-ne v1, v10, :cond_23

    .line 855
    .line 856
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 857
    .line 858
    .line 859
    move-object/from16 v1, p1

    .line 860
    .line 861
    goto :goto_13

    .line 862
    :cond_23
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    const/4 v11, 0x0

    .line 866
    goto :goto_14

    .line 867
    :cond_24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    iget-object v1, v8, La/ebl;->S:La/h3c;

    .line 871
    .line 872
    iget-wide v2, v9, La/szj0;->c:J

    .line 873
    .line 874
    iput-boolean v10, v5, La/sr;->j:Z

    .line 875
    .line 876
    invoke-virtual {v1, v2, v3, v5}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    if-ne v1, v0, :cond_25

    .line 881
    .line 882
    move-object v11, v0

    .line 883
    goto :goto_14

    .line 884
    :cond_25
    :goto_13
    check-cast v1, Ljava/lang/Boolean;

    .line 885
    .line 886
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 887
    .line 888
    .line 889
    move-result v19

    .line 890
    iget-object v0, v8, La/ebl;->U:La/qv2;

    .line 891
    .line 892
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 893
    .line 894
    sget-object v24, La/grs;->b:La/grs;

    .line 895
    .line 896
    sget-object v27, La/ors;->a:La/ors;

    .line 897
    .line 898
    sget-object v30, La/k1g;->h:La/k1g;

    .line 899
    .line 900
    iget-wide v1, v9, La/szj0;->c:J

    .line 901
    .line 902
    iget-object v3, v9, La/szj0;->d:Ljava/lang/Long;

    .line 903
    .line 904
    if-eqz v3, :cond_26

    .line 905
    .line 906
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 907
    .line 908
    .line 909
    move-result-wide v6

    .line 910
    :cond_26
    move-wide/from16 v17, v6

    .line 911
    .line 912
    iget-object v3, v9, La/szj0;->b:La/sip;

    .line 913
    .line 914
    invoke-static {v3}, La/kpb;->u(La/sip;)Z

    .line 915
    .line 916
    .line 917
    move-result v22

    .line 918
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 919
    .line 920
    iget-wide v11, v5, La/sr;->l:J

    .line 921
    .line 922
    const-wide/16 v13, 0x0

    .line 923
    .line 924
    const-wide/16 v20, 0x0

    .line 925
    .line 926
    const-string v25, "main_screen"

    .line 927
    .line 928
    const-string v26, ""

    .line 929
    .line 930
    const/16 v28, 0x0

    .line 931
    .line 932
    const/16 v29, 0x0

    .line 933
    .line 934
    move-wide v15, v1

    .line 935
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    iget-object v1, v8, La/ebl;->P:La/oeg0;

    .line 943
    .line 944
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    new-instance v2, La/sw8;

    .line 949
    .line 950
    const/16 v3, 0x19

    .line 951
    .line 952
    invoke-direct {v2, v9, v8, v0, v3}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 956
    .line 957
    .line 958
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 959
    .line 960
    :goto_14
    return-object v11

    .line 961
    :pswitch_a
    check-cast v8, La/xig;

    .line 962
    .line 963
    sget-object v0, La/wne;->a:La/wne;

    .line 964
    .line 965
    iget-boolean v1, v5, La/sr;->j:Z

    .line 966
    .line 967
    if-eqz v1, :cond_28

    .line 968
    .line 969
    if-ne v1, v10, :cond_27

    .line 970
    .line 971
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    goto :goto_15

    .line 975
    :cond_27
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    const/4 v11, 0x0

    .line 979
    goto :goto_16

    .line 980
    :cond_28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    check-cast v1, La/sig;

    .line 988
    .line 989
    iget-object v1, v1, La/sig;->j:Ljava/util/List;

    .line 990
    .line 991
    invoke-static {v2, v3, v1}, La/axq;->y(JLjava/util/List;)Z

    .line 992
    .line 993
    .line 994
    move-result v1

    .line 995
    check-cast v9, La/npn;

    .line 996
    .line 997
    iput-boolean v10, v5, La/sr;->j:Z

    .line 998
    .line 999
    invoke-virtual {v8, v9, v1, v5}, La/xig;->O(La/npn;ZLa/zje;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v1

    .line 1003
    if-ne v1, v0, :cond_29

    .line 1004
    .line 1005
    move-object v11, v0

    .line 1006
    goto :goto_16

    .line 1007
    :cond_29
    :goto_15
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    :goto_16
    return-object v11

    .line 1010
    :pswitch_b
    check-cast v9, La/szj0;

    .line 1011
    .line 1012
    check-cast v8, La/rnf;

    .line 1013
    .line 1014
    sget-object v0, La/wne;->a:La/wne;

    .line 1015
    .line 1016
    iget-boolean v2, v5, La/sr;->j:Z

    .line 1017
    .line 1018
    if-eqz v2, :cond_2b

    .line 1019
    .line 1020
    if-ne v2, v10, :cond_2a

    .line 1021
    .line 1022
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    move-object/from16 v2, p1

    .line 1026
    .line 1027
    goto :goto_17

    .line 1028
    :cond_2a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    const/4 v11, 0x0

    .line 1032
    goto :goto_18

    .line 1033
    :cond_2b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    iget-object v2, v8, La/rnf;->Q:La/h3c;

    .line 1037
    .line 1038
    iget-wide v3, v9, La/szj0;->c:J

    .line 1039
    .line 1040
    iput-boolean v10, v5, La/sr;->j:Z

    .line 1041
    .line 1042
    invoke-virtual {v2, v3, v4, v5}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v2

    .line 1046
    if-ne v2, v0, :cond_2c

    .line 1047
    .line 1048
    move-object v11, v0

    .line 1049
    goto :goto_18

    .line 1050
    :cond_2c
    :goto_17
    check-cast v2, Ljava/lang/Boolean;

    .line 1051
    .line 1052
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1053
    .line 1054
    .line 1055
    move-result v19

    .line 1056
    iget-object v0, v8, La/rnf;->R:La/qv2;

    .line 1057
    .line 1058
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1059
    .line 1060
    sget-object v24, La/grs;->b:La/grs;

    .line 1061
    .line 1062
    sget-object v27, La/ors;->a:La/ors;

    .line 1063
    .line 1064
    sget-object v30, La/k1g;->h:La/k1g;

    .line 1065
    .line 1066
    iget-wide v2, v9, La/szj0;->c:J

    .line 1067
    .line 1068
    iget-object v4, v9, La/szj0;->d:Ljava/lang/Long;

    .line 1069
    .line 1070
    if-eqz v4, :cond_2d

    .line 1071
    .line 1072
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 1073
    .line 1074
    .line 1075
    move-result-wide v6

    .line 1076
    :cond_2d
    move-wide/from16 v17, v6

    .line 1077
    .line 1078
    iget-object v4, v9, La/szj0;->b:La/sip;

    .line 1079
    .line 1080
    invoke-static {v4}, La/kpb;->u(La/sip;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v22

    .line 1084
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 1085
    .line 1086
    iget-wide v11, v5, La/sr;->l:J

    .line 1087
    .line 1088
    const-wide/16 v13, 0x0

    .line 1089
    .line 1090
    const-wide/16 v20, 0x0

    .line 1091
    .line 1092
    const-string v25, "main_screen"

    .line 1093
    .line 1094
    const-string v26, ""

    .line 1095
    .line 1096
    const/16 v28, 0x0

    .line 1097
    .line 1098
    const/16 v29, 0x0

    .line 1099
    .line 1100
    move-wide v15, v2

    .line 1101
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    iget-object v2, v8, La/rnf;->O:La/oeg0;

    .line 1109
    .line 1110
    invoke-virtual {v2}, La/oeg0;->c()La/i1w0;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    new-instance v3, La/sw8;

    .line 1115
    .line 1116
    invoke-direct {v3, v9, v8, v0, v1}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1120
    .line 1121
    .line 1122
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1123
    .line 1124
    :goto_18
    return-object v11

    .line 1125
    :pswitch_c
    move-object v1, v9

    .line 1126
    check-cast v1, La/mlr;

    .line 1127
    .line 1128
    check-cast v8, La/dp1;

    .line 1129
    .line 1130
    sget-object v9, La/wne;->a:La/wne;

    .line 1131
    .line 1132
    iget-boolean v0, v5, La/sr;->j:Z

    .line 1133
    .line 1134
    if-eqz v0, :cond_2f

    .line 1135
    .line 1136
    if-ne v0, v10, :cond_2e

    .line 1137
    .line 1138
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1139
    .line 1140
    .line 1141
    goto :goto_19

    .line 1142
    :cond_2e
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 1143
    .line 1144
    .line 1145
    const/4 v11, 0x0

    .line 1146
    goto :goto_1a

    .line 1147
    :cond_2f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1148
    .line 1149
    .line 1150
    iget-object v0, v8, La/dp1;->s:La/pw70;

    .line 1151
    .line 1152
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v4

    .line 1156
    check-cast v4, La/bo1;

    .line 1157
    .line 1158
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v8, v1, v2, v3}, La/dp1;->N(La/mlr;J)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    iput-boolean v10, v5, La/sr;->j:Z

    .line 1166
    .line 1167
    const/4 v3, 0x0

    .line 1168
    const/4 v4, 0x0

    .line 1169
    const/4 v5, 0x0

    .line 1170
    const/16 v7, 0x72

    .line 1171
    .line 1172
    move-object/from16 v6, p0

    .line 1173
    .line 1174
    invoke-static/range {v0 .. v7}, La/pw70;->b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    if-ne v0, v9, :cond_30

    .line 1179
    .line 1180
    move-object v11, v9

    .line 1181
    goto :goto_1a

    .line 1182
    :cond_30
    :goto_19
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1183
    .line 1184
    :goto_1a
    return-object v11

    .line 1185
    :pswitch_d
    check-cast v8, La/n21;

    .line 1186
    .line 1187
    sget-object v12, La/wne;->a:La/wne;

    .line 1188
    .line 1189
    iget-boolean v0, v5, La/sr;->j:Z

    .line 1190
    .line 1191
    if-eqz v0, :cond_32

    .line 1192
    .line 1193
    if-ne v0, v10, :cond_31

    .line 1194
    .line 1195
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1196
    .line 1197
    .line 1198
    goto/16 :goto_1f

    .line 1199
    .line 1200
    :cond_31
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    :goto_1b
    const/4 v11, 0x0

    .line 1204
    goto/16 :goto_20

    .line 1205
    .line 1206
    :cond_32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v0, v8, La/n21;->s:La/pw70;

    .line 1210
    .line 1211
    check-cast v9, La/js0;

    .line 1212
    .line 1213
    sget-object v33, La/iun;->a:La/iun;

    .line 1214
    .line 1215
    new-instance v13, La/mlr;

    .line 1216
    .line 1217
    const/16 v34, 0x0

    .line 1218
    .line 1219
    const v35, 0x20080

    .line 1220
    .line 1221
    .line 1222
    const-wide/16 v14, 0x0

    .line 1223
    .line 1224
    const-wide/16 v16, 0x0

    .line 1225
    .line 1226
    const-wide/16 v18, 0x0

    .line 1227
    .line 1228
    const-wide/16 v20, 0x0

    .line 1229
    .line 1230
    const-string v22, ""

    .line 1231
    .line 1232
    const-string v23, ""

    .line 1233
    .line 1234
    const-string v24, ""

    .line 1235
    .line 1236
    const/16 v25, 0x0

    .line 1237
    .line 1238
    const/16 v26, 0x0

    .line 1239
    .line 1240
    const/16 v27, 0x0

    .line 1241
    .line 1242
    const/16 v28, 0x0

    .line 1243
    .line 1244
    const/16 v29, 0x0

    .line 1245
    .line 1246
    const/16 v30, 0x0

    .line 1247
    .line 1248
    const/16 v31, 0x0

    .line 1249
    .line 1250
    const/16 v32, 0x0

    .line 1251
    .line 1252
    invoke-direct/range {v13 .. v35}, La/mlr;-><init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZI)V

    .line 1253
    .line 1254
    .line 1255
    iget-wide v14, v9, La/js0;->a:J

    .line 1256
    .line 1257
    iget-wide v6, v9, La/js0;->e:J

    .line 1258
    .line 1259
    iget-boolean v1, v9, La/js0;->g:Z

    .line 1260
    .line 1261
    move-object/from16 v26, v12

    .line 1262
    .line 1263
    iget-wide v11, v9, La/js0;->f:J

    .line 1264
    .line 1265
    iget-boolean v4, v9, La/js0;->h:Z

    .line 1266
    .line 1267
    const/16 v23, 0x0

    .line 1268
    .line 1269
    const v24, 0x3e7f8

    .line 1270
    .line 1271
    .line 1272
    const/16 v20, 0x0

    .line 1273
    .line 1274
    move/from16 v21, v1

    .line 1275
    .line 1276
    move/from16 v22, v4

    .line 1277
    .line 1278
    move-wide/from16 v18, v6

    .line 1279
    .line 1280
    move-wide/from16 v16, v11

    .line 1281
    .line 1282
    invoke-static/range {v13 .. v24}, La/mlr;->a(La/mlr;JJJLjava/lang/String;ZZZI)La/mlr;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    iget-object v4, v8, La/n21;->I:La/eyg0;

    .line 1287
    .line 1288
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v6

    .line 1292
    check-cast v6, La/q11;

    .line 1293
    .line 1294
    iget-object v6, v6, La/q11;->b:La/d7v;

    .line 1295
    .line 1296
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 1297
    .line 1298
    .line 1299
    move-result v6

    .line 1300
    if-eqz v6, :cond_35

    .line 1301
    .line 1302
    if-eq v6, v10, :cond_34

    .line 1303
    .line 1304
    const/4 v7, 0x2

    .line 1305
    if-ne v6, v7, :cond_33

    .line 1306
    .line 1307
    const-string v6, "aggregator_gifts_freespins"

    .line 1308
    .line 1309
    :goto_1c
    move-object v15, v6

    .line 1310
    goto :goto_1d

    .line 1311
    :cond_33
    invoke-static {}, La/t9f;->b()V

    .line 1312
    .line 1313
    .line 1314
    goto :goto_1b

    .line 1315
    :cond_34
    const-string v6, "aggregator_gifts_bonuses"

    .line 1316
    .line 1317
    goto :goto_1c

    .line 1318
    :cond_35
    const-string v6, "aggregator_gifts_all"

    .line 1319
    .line 1320
    goto :goto_1c

    .line 1321
    :goto_1d
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v6

    .line 1325
    check-cast v6, La/q11;

    .line 1326
    .line 1327
    iget-object v6, v6, La/q11;->w:Ljava/util/List;

    .line 1328
    .line 1329
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v6

    .line 1333
    :cond_36
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1334
    .line 1335
    .line 1336
    move-result v7

    .line 1337
    if-eqz v7, :cond_37

    .line 1338
    .line 1339
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v7

    .line 1343
    move-object v8, v7

    .line 1344
    check-cast v8, La/g3z;

    .line 1345
    .line 1346
    iget-wide v8, v8, La/g3z;->a:J

    .line 1347
    .line 1348
    cmp-long v8, v8, v2

    .line 1349
    .line 1350
    if-nez v8, :cond_36

    .line 1351
    .line 1352
    move-object v11, v7

    .line 1353
    goto :goto_1e

    .line 1354
    :cond_37
    const/4 v11, 0x0

    .line 1355
    :goto_1e
    check-cast v11, La/g3z;

    .line 1356
    .line 1357
    move-object v2, v11

    .line 1358
    new-instance v11, La/lu0;

    .line 1359
    .line 1360
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v14

    .line 1364
    invoke-static {v2}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v16

    .line 1368
    const-wide/16 v12, 0x0

    .line 1369
    .line 1370
    invoke-direct/range {v11 .. v16}, La/lu0;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v4, v11}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    iput-boolean v10, v5, La/sr;->j:Z

    .line 1378
    .line 1379
    const/4 v3, 0x0

    .line 1380
    const/4 v4, 0x1

    .line 1381
    const/4 v5, 0x0

    .line 1382
    const/16 v7, 0x52

    .line 1383
    .line 1384
    move-object/from16 v6, p0

    .line 1385
    .line 1386
    invoke-static/range {v0 .. v7}, La/pw70;->b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    move-object/from16 v1, v26

    .line 1391
    .line 1392
    if-ne v0, v1, :cond_38

    .line 1393
    .line 1394
    move-object v11, v1

    .line 1395
    goto :goto_20

    .line 1396
    :cond_38
    :goto_1f
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1397
    .line 1398
    :goto_20
    return-object v11

    .line 1399
    :pswitch_e
    sget-object v0, La/wne;->a:La/wne;

    .line 1400
    .line 1401
    iget-boolean v1, v5, La/sr;->j:Z

    .line 1402
    .line 1403
    if-eqz v1, :cond_3a

    .line 1404
    .line 1405
    if-ne v1, v10, :cond_39

    .line 1406
    .line 1407
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1408
    .line 1409
    .line 1410
    move-object/from16 v0, p1

    .line 1411
    .line 1412
    check-cast v0, La/j0g0;

    .line 1413
    .line 1414
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1415
    .line 1416
    goto :goto_21

    .line 1417
    :cond_39
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    const/4 v11, 0x0

    .line 1421
    goto :goto_22

    .line 1422
    :cond_3a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1423
    .line 1424
    .line 1425
    check-cast v8, La/xr;

    .line 1426
    .line 1427
    iget-object v1, v8, La/xr;->b:Ljava/lang/Object;

    .line 1428
    .line 1429
    check-cast v1, La/kki;

    .line 1430
    .line 1431
    check-cast v9, La/h9n0;

    .line 1432
    .line 1433
    iput-boolean v10, v5, La/sr;->j:Z

    .line 1434
    .line 1435
    invoke-virtual {v1, v2, v3, v9, v5}, La/kki;->a(JLa/h9n0;La/zje;)Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v1

    .line 1439
    if-ne v1, v0, :cond_3b

    .line 1440
    .line 1441
    move-object v11, v0

    .line 1442
    goto :goto_22

    .line 1443
    :cond_3b
    :goto_21
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1444
    .line 1445
    :goto_22
    return-object v11

    .line 1446
    :pswitch_f
    sget-object v6, La/wne;->a:La/wne;

    .line 1447
    .line 1448
    iget-boolean v0, v5, La/sr;->j:Z

    .line 1449
    .line 1450
    if-eqz v0, :cond_3d

    .line 1451
    .line 1452
    if-ne v0, v10, :cond_3c

    .line 1453
    .line 1454
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1455
    .line 1456
    .line 1457
    move-object/from16 v0, p1

    .line 1458
    .line 1459
    goto :goto_23

    .line 1460
    :cond_3c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 1461
    .line 1462
    .line 1463
    const/4 v0, 0x0

    .line 1464
    goto :goto_23

    .line 1465
    :cond_3d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1466
    .line 1467
    .line 1468
    check-cast v8, La/xr;

    .line 1469
    .line 1470
    iget-object v0, v8, La/xr;->a:Ljava/lang/Object;

    .line 1471
    .line 1472
    check-cast v0, La/m0o0;

    .line 1473
    .line 1474
    move-object v4, v9

    .line 1475
    check-cast v4, La/xvs;

    .line 1476
    .line 1477
    iput-boolean v10, v5, La/sr;->j:Z

    .line 1478
    .line 1479
    iget-object v0, v0, La/m0o0;->b:La/abp;

    .line 1480
    .line 1481
    iget-wide v1, v5, La/sr;->l:J

    .line 1482
    .line 1483
    const/4 v3, 0x1

    .line 1484
    invoke-virtual/range {v0 .. v5}, La/abp;->b(JZLa/xvs;La/zje;)Ljava/lang/Object;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    if-ne v0, v6, :cond_3e

    .line 1489
    .line 1490
    move-object v0, v6

    .line 1491
    :cond_3e
    :goto_23
    return-object v0

    .line 1492
    nop

    .line 1493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
