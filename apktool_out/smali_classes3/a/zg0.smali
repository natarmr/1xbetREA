.class public final La/zg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:J

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/diu0;JLa/yje;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/zg0;->i:B

    iput-object p1, p0, La/zg0;->l:Ljava/lang/Object;

    iput-wide p2, p0, La/zg0;->j:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/zg0;->i:B

    iput-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    iput-wide p2, p0, La/zg0;->j:J

    iput-object p4, p0, La/zg0;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V
    .locals 0

    .line 3
    iput-byte p6, p0, La/zg0;->i:B

    iput-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    iput-object p2, p0, La/zg0;->l:Ljava/lang/Object;

    iput-wide p3, p0, La/zg0;->j:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 4
    iput-byte p4, p0, La/zg0;->i:B

    iput-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    iput-object p2, p0, La/zg0;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/zg0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/zg0;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/zg0;

    .line 9
    .line 10
    iget-object p0, p0, La/zg0;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;

    .line 15
    .line 16
    const/16 v2, 0xd

    .line 17
    .line 18
    invoke-direct {v0, p0, v1, p2, v2}, La/zg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    iput-wide p0, v0, La/zg0;->j:J

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object v0, v1

    .line 31
    new-instance v1, La/zg0;

    .line 32
    .line 33
    iget-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v2, p1

    .line 36
    check-cast v2, La/a4x;

    .line 37
    .line 38
    move-object v3, v0

    .line 39
    check-cast v3, La/pz40;

    .line 40
    .line 41
    iget-wide v4, p0, La/zg0;->j:J

    .line 42
    .line 43
    const/16 v7, 0xc

    .line 44
    .line 45
    move-object v6, p2

    .line 46
    invoke-direct/range {v1 .. v7}, La/zg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_1
    move-object v6, p2

    .line 51
    move-object v0, v1

    .line 52
    new-instance v2, La/zg0;

    .line 53
    .line 54
    move-object v3, v0

    .line 55
    check-cast v3, La/ncl0;

    .line 56
    .line 57
    iget-wide v4, p0, La/zg0;->j:J

    .line 58
    .line 59
    const/16 v7, 0xb

    .line 60
    .line 61
    invoke-direct/range {v2 .. v7}, La/zg0;-><init>(La/diu0;JLa/yje;B)V

    .line 62
    .line 63
    .line 64
    iput-object p1, v2, La/zg0;->k:Ljava/lang/Object;

    .line 65
    .line 66
    return-object v2

    .line 67
    :pswitch_2
    move-object v6, p2

    .line 68
    move-object v0, v1

    .line 69
    new-instance v2, La/zg0;

    .line 70
    .line 71
    iget-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v3, p1

    .line 74
    check-cast v3, La/gzr0;

    .line 75
    .line 76
    move-object v4, v0

    .line 77
    check-cast v4, La/d650;

    .line 78
    .line 79
    move-object v7, v6

    .line 80
    iget-wide v5, p0, La/zg0;->j:J

    .line 81
    .line 82
    const/16 v8, 0xa

    .line 83
    .line 84
    invoke-direct/range {v2 .. v8}, La/zg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :pswitch_3
    move-object v6, p2

    .line 89
    move-object v0, v1

    .line 90
    new-instance v2, La/zg0;

    .line 91
    .line 92
    iget-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v3, p1

    .line 95
    check-cast v3, La/z4w;

    .line 96
    .line 97
    move-object v4, v0

    .line 98
    check-cast v4, La/n3w;

    .line 99
    .line 100
    move-object v7, v6

    .line 101
    iget-wide v5, p0, La/zg0;->j:J

    .line 102
    .line 103
    const/16 v8, 0x9

    .line 104
    .line 105
    invoke-direct/range {v2 .. v8}, La/zg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 106
    .line 107
    .line 108
    return-object v2

    .line 109
    :pswitch_4
    move-object v6, p2

    .line 110
    move-object v0, v1

    .line 111
    new-instance v2, La/zg0;

    .line 112
    .line 113
    move-object v3, v0

    .line 114
    check-cast v3, La/yks;

    .line 115
    .line 116
    iget-wide v4, p0, La/zg0;->j:J

    .line 117
    .line 118
    const/16 v7, 0x8

    .line 119
    .line 120
    invoke-direct/range {v2 .. v7}, La/zg0;-><init>(La/diu0;JLa/yje;B)V

    .line 121
    .line 122
    .line 123
    iput-object p1, v2, La/zg0;->k:Ljava/lang/Object;

    .line 124
    .line 125
    return-object v2

    .line 126
    :pswitch_5
    move-object v6, p2

    .line 127
    move-object v0, v1

    .line 128
    new-instance v2, La/zg0;

    .line 129
    .line 130
    move-object v3, v0

    .line 131
    check-cast v3, La/g9s;

    .line 132
    .line 133
    iget-wide v4, p0, La/zg0;->j:J

    .line 134
    .line 135
    const/4 v7, 0x7

    .line 136
    invoke-direct/range {v2 .. v7}, La/zg0;-><init>(La/diu0;JLa/yje;B)V

    .line 137
    .line 138
    .line 139
    iput-object p1, v2, La/zg0;->k:Ljava/lang/Object;

    .line 140
    .line 141
    return-object v2

    .line 142
    :pswitch_6
    move-object v6, p2

    .line 143
    move-object v0, v1

    .line 144
    new-instance v2, La/zg0;

    .line 145
    .line 146
    move-object v3, v0

    .line 147
    check-cast v3, La/k4s;

    .line 148
    .line 149
    iget-wide v4, p0, La/zg0;->j:J

    .line 150
    .line 151
    const/4 v7, 0x6

    .line 152
    invoke-direct/range {v2 .. v7}, La/zg0;-><init>(La/diu0;JLa/yje;B)V

    .line 153
    .line 154
    .line 155
    iput-object p1, v2, La/zg0;->k:Ljava/lang/Object;

    .line 156
    .line 157
    return-object v2

    .line 158
    :pswitch_7
    move-object v6, p2

    .line 159
    move-object v0, v1

    .line 160
    new-instance v2, La/zg0;

    .line 161
    .line 162
    move-object v3, v0

    .line 163
    check-cast v3, La/spr;

    .line 164
    .line 165
    iget-wide v4, p0, La/zg0;->j:J

    .line 166
    .line 167
    const/4 v7, 0x5

    .line 168
    invoke-direct/range {v2 .. v7}, La/zg0;-><init>(La/diu0;JLa/yje;B)V

    .line 169
    .line 170
    .line 171
    iput-object p1, v2, La/zg0;->k:Ljava/lang/Object;

    .line 172
    .line 173
    return-object v2

    .line 174
    :pswitch_8
    move-object v6, p2

    .line 175
    move-object v0, v1

    .line 176
    new-instance v2, La/zg0;

    .line 177
    .line 178
    iget-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v3, p1

    .line 181
    check-cast v3, La/d4o;

    .line 182
    .line 183
    move-object v4, v0

    .line 184
    check-cast v4, Ljava/lang/String;

    .line 185
    .line 186
    move-object v7, v6

    .line 187
    iget-wide v5, p0, La/zg0;->j:J

    .line 188
    .line 189
    const/4 v8, 0x4

    .line 190
    invoke-direct/range {v2 .. v8}, La/zg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 191
    .line 192
    .line 193
    return-object v2

    .line 194
    :pswitch_9
    move-object v6, p2

    .line 195
    move-object v0, v1

    .line 196
    new-instance v2, La/zg0;

    .line 197
    .line 198
    iget-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    .line 199
    .line 200
    move-object v3, p1

    .line 201
    check-cast v3, La/egk0;

    .line 202
    .line 203
    iget-wide v4, p0, La/zg0;->j:J

    .line 204
    .line 205
    move-object v1, v0

    .line 206
    check-cast v1, Ljava/lang/Long;

    .line 207
    .line 208
    const/4 v8, 0x3

    .line 209
    move-object v7, v6

    .line 210
    move-object v6, v1

    .line 211
    invoke-direct/range {v2 .. v8}, La/zg0;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 212
    .line 213
    .line 214
    return-object v2

    .line 215
    :pswitch_a
    move-object v6, p2

    .line 216
    move-object v0, v1

    .line 217
    new-instance p2, La/zg0;

    .line 218
    .line 219
    iget-object p0, p0, La/zg0;->k:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, La/v9k0;

    .line 222
    .line 223
    move-object v1, v0

    .line 224
    check-cast v1, La/fae;

    .line 225
    .line 226
    const/4 v0, 0x2

    .line 227
    invoke-direct {p2, p0, v1, v6, v0}, La/zg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 228
    .line 229
    .line 230
    check-cast p1, Ljava/lang/Number;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 233
    .line 234
    .line 235
    move-result-wide p0

    .line 236
    iput-wide p0, p2, La/zg0;->j:J

    .line 237
    .line 238
    return-object p2

    .line 239
    :pswitch_b
    move-object v6, p2

    .line 240
    move-object v0, v1

    .line 241
    new-instance v2, La/zg0;

    .line 242
    .line 243
    move-object v3, v0

    .line 244
    check-cast v3, La/dk6;

    .line 245
    .line 246
    iget-wide v4, p0, La/zg0;->j:J

    .line 247
    .line 248
    const/4 v7, 0x1

    .line 249
    invoke-direct/range {v2 .. v7}, La/zg0;-><init>(La/diu0;JLa/yje;B)V

    .line 250
    .line 251
    .line 252
    iput-object p1, v2, La/zg0;->k:Ljava/lang/Object;

    .line 253
    .line 254
    return-object v2

    .line 255
    :pswitch_c
    move-object v6, p2

    .line 256
    move-object v0, v1

    .line 257
    new-instance v2, La/zg0;

    .line 258
    .line 259
    iget-object p1, p0, La/zg0;->k:Ljava/lang/Object;

    .line 260
    .line 261
    move-object v3, p1

    .line 262
    check-cast v3, La/eh0;

    .line 263
    .line 264
    iget-wide v4, p0, La/zg0;->j:J

    .line 265
    .line 266
    move-object v1, v0

    .line 267
    check-cast v1, Ljava/util/List;

    .line 268
    .line 269
    const/4 v8, 0x0

    .line 270
    move-object v7, v6

    .line 271
    move-object v6, v1

    .line 272
    invoke-direct/range {v2 .. v8}, La/zg0;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 273
    .line 274
    .line 275
    return-object v2

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zg0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/zg0;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/zg0;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/q5z;

    .line 49
    .line 50
    check-cast p2, La/yje;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/zg0;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/zg0;

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_3
    check-cast p1, La/vne;

    .line 83
    .line 84
    check-cast p2, La/yje;

    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/zg0;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_4
    check-cast p1, La/q5z;

    .line 100
    .line 101
    check-cast p2, La/yje;

    .line 102
    .line 103
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, La/zg0;

    .line 108
    .line 109
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_5
    check-cast p1, La/q5z;

    .line 117
    .line 118
    check-cast p2, La/yje;

    .line 119
    .line 120
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, La/zg0;

    .line 125
    .line 126
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_6
    check-cast p1, La/q5z;

    .line 134
    .line 135
    check-cast p2, La/yje;

    .line 136
    .line 137
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    check-cast p0, La/zg0;

    .line 142
    .line 143
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :pswitch_7
    check-cast p1, La/q5z;

    .line 151
    .line 152
    check-cast p2, La/yje;

    .line 153
    .line 154
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, La/zg0;

    .line 159
    .line 160
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :pswitch_8
    check-cast p1, La/vne;

    .line 168
    .line 169
    check-cast p2, La/yje;

    .line 170
    .line 171
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, La/zg0;

    .line 176
    .line 177
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :pswitch_9
    check-cast p1, La/vne;

    .line 185
    .line 186
    check-cast p2, La/yje;

    .line 187
    .line 188
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    check-cast p0, La/zg0;

    .line 193
    .line 194
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v0

    .line 207
    check-cast p2, La/yje;

    .line 208
    .line 209
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    check-cast p0, La/zg0;

    .line 218
    .line 219
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 227
    .line 228
    check-cast p2, La/yje;

    .line 229
    .line 230
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, La/zg0;

    .line 235
    .line 236
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :pswitch_c
    check-cast p1, La/vne;

    .line 244
    .line 245
    check-cast p2, La/yje;

    .line 246
    .line 247
    invoke-virtual {p0, p1, p2}, La/zg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    check-cast p0, La/zg0;

    .line 252
    .line 253
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    invoke-virtual {p0, p1}, La/zg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    return-object p0

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zg0;->i:B

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, v0, La/zg0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-wide v1, v0, La/zg0;->j:J

    .line 13
    .line 14
    sget-object v3, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v6, 0x0

    .line 20
    .line 21
    cmp-long v1, v1, v6

    .line 22
    .line 23
    if-gtz v1, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, La/zg0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 28
    .line 29
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;

    .line 33
    .line 34
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->x:I

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->w(Z)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, La/a4x;

    .line 50
    .line 51
    iget-wide v6, v0, La/zg0;->j:J

    .line 52
    .line 53
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v8, 0xa

    .line 56
    .line 57
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eqz v8, :cond_2

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    check-cast v8, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;

    .line 79
    .line 80
    new-instance v9, La/y8p0;

    .line 81
    .line 82
    iget-wide v10, v8, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;->a:J

    .line 83
    .line 84
    new-instance v14, La/oui0;

    .line 85
    .line 86
    new-instance v13, Ljava/lang/Integer;

    .line 87
    .line 88
    const v12, 0x7f0808bd

    .line 89
    .line 90
    .line 91
    invoke-direct {v13, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 92
    .line 93
    .line 94
    new-instance v15, La/n0x;

    .line 95
    .line 96
    iget-object v12, v8, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;->b:Ljava/lang/String;

    .line 97
    .line 98
    invoke-direct {v15, v12}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const/16 v16, 0x0

    .line 102
    .line 103
    const/16 v17, 0x1a

    .line 104
    .line 105
    move-object v12, v14

    .line 106
    const/4 v14, 0x0

    .line 107
    invoke-direct/range {v12 .. v17}, La/oui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;I)V

    .line 108
    .line 109
    .line 110
    new-instance v13, La/tui0;

    .line 111
    .line 112
    iget-object v14, v8, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;->c:Ljava/lang/String;

    .line 113
    .line 114
    invoke-direct {v13, v14, v3}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 115
    .line 116
    .line 117
    new-instance v15, La/nvi0;

    .line 118
    .line 119
    iget-wide v2, v8, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;->a:J

    .line 120
    .line 121
    cmp-long v2, v2, v6

    .line 122
    .line 123
    if-nez v2, :cond_1

    .line 124
    .line 125
    move v2, v4

    .line 126
    goto :goto_1

    .line 127
    :cond_1
    const/4 v2, 0x0

    .line 128
    :goto_1
    invoke-direct {v15, v2}, La/nvi0;-><init>(Z)V

    .line 129
    .line 130
    .line 131
    move-object v14, v12

    .line 132
    new-instance v12, La/rqm;

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    const/16 v21, 0x1f8

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const/16 v19, 0x0

    .line 145
    .line 146
    invoke-direct/range {v12 .. v21}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 147
    .line 148
    .line 149
    invoke-direct {v9, v10, v11, v12}, La/y8p0;-><init>(JLa/rqm;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    goto :goto_0

    .line 157
    :cond_2
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v5, La/pz40;

    .line 162
    .line 163
    new-instance v1, La/v8p0;

    .line 164
    .line 165
    invoke-direct {v1, v0}, La/v8p0;-><init>(La/a4x;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v5, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_1
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 175
    .line 176
    move-object v10, v1

    .line 177
    check-cast v10, La/q5z;

    .line 178
    .line 179
    sget-object v1, La/wne;->a:La/wne;

    .line 180
    .line 181
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    move-object v7, v5

    .line 185
    check-cast v7, La/ncl0;

    .line 186
    .line 187
    iget-wide v8, v0, La/zg0;->j:J

    .line 188
    .line 189
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    sget-object v1, La/rbl0;->a:La/rbl0;

    .line 194
    .line 195
    iget-object v2, v7, La/ncl0;->o:La/mne;

    .line 196
    .line 197
    iget-object v3, v2, La/mne;->c:La/vs10;

    .line 198
    .line 199
    new-instance v4, La/ir;

    .line 200
    .line 201
    const/4 v11, 0x0

    .line 202
    const/16 v12, 0x1d

    .line 203
    .line 204
    move-object v6, v4

    .line 205
    invoke-direct/range {v6 .. v12}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 206
    .line 207
    .line 208
    const/16 v5, 0xa

    .line 209
    .line 210
    const/4 v2, 0x0

    .line 211
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 212
    .line 213
    .line 214
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_2
    iget-wide v1, v0, La/zg0;->j:J

    .line 218
    .line 219
    check-cast v5, La/d650;

    .line 220
    .line 221
    sget-object v3, La/wne;->a:La/wne;

    .line 222
    .line 223
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v0, La/zg0;->k:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, La/gzr0;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_8

    .line 235
    .line 236
    if-ne v0, v4, :cond_7

    .line 237
    .line 238
    iget-object v0, v5, La/d650;->a0:La/qu;

    .line 239
    .line 240
    iget-object v0, v0, La/qu;->a:La/kt2;

    .line 241
    .line 242
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    new-instance v6, Lkotlin/Pair;

    .line 247
    .line 248
    const-string v7, "tournament_id"

    .line 249
    .line 250
    invoke-direct {v6, v7, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    new-instance v3, Lkotlin/Pair;

    .line 254
    .line 255
    const-string v7, "screen"

    .line 256
    .line 257
    const-string v8, "my_aggregator"

    .line 258
    .line 259
    invoke-direct {v3, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    filled-new-array {v6, v3}, [Lkotlin/Pair;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    const-string v6, "tournament_call"

    .line 271
    .line 272
    invoke-interface {v0, v6, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 273
    .line 274
    .line 275
    iget-object v0, v5, La/d650;->K:La/gg5;

    .line 276
    .line 277
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v0, v0, La/gg5;->a:La/s1p;

    .line 288
    .line 289
    new-instance v6, La/j1p;

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    invoke-direct {v6, v8, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 293
    .line 294
    .line 295
    new-instance v8, La/j1p;

    .line 296
    .line 297
    invoke-direct {v8, v3, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 298
    .line 299
    .line 300
    const/4 v3, 0x2

    .line 301
    new-array v3, v3, [La/k1p;

    .line 302
    .line 303
    aput-object v6, v3, v7

    .line 304
    .line 305
    aput-object v8, v3, v4

    .line 306
    .line 307
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    const-wide/16 v6, 0xc17

    .line 312
    .line 313
    invoke-virtual {v0, v3, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v5, La/d650;->g1:La/p7m0;

    .line 317
    .line 318
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, Ljava/lang/Iterable;

    .line 323
    .line 324
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_4

    .line 333
    .line 334
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    move-object v4, v3

    .line 339
    check-cast v4, La/ef40;

    .line 340
    .line 341
    instance-of v4, v4, La/af40;

    .line 342
    .line 343
    if-eqz v4, :cond_3

    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_4
    const/4 v3, 0x0

    .line 347
    :goto_2
    check-cast v3, La/ef40;

    .line 348
    .line 349
    if-eqz v3, :cond_d

    .line 350
    .line 351
    instance-of v0, v3, La/af40;

    .line 352
    .line 353
    if-eqz v0, :cond_d

    .line 354
    .line 355
    check-cast v3, La/af40;

    .line 356
    .line 357
    iget-object v0, v3, La/af40;->a:La/vbj;

    .line 358
    .line 359
    instance-of v3, v0, La/qbj;

    .line 360
    .line 361
    if-eqz v3, :cond_d

    .line 362
    .line 363
    check-cast v0, La/qbj;

    .line 364
    .line 365
    iget-object v0, v0, La/qbj;->a:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Ljava/lang/Iterable;

    .line 368
    .line 369
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    if-eqz v3, :cond_6

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    move-object v4, v3

    .line 384
    check-cast v4, La/myr0;

    .line 385
    .line 386
    iget-wide v6, v4, La/myr0;->a:J

    .line 387
    .line 388
    cmp-long v4, v6, v1

    .line 389
    .line 390
    if-nez v4, :cond_5

    .line 391
    .line 392
    goto :goto_3

    .line 393
    :cond_6
    const/4 v3, 0x0

    .line 394
    :goto_3
    check-cast v3, La/myr0;

    .line 395
    .line 396
    if-eqz v3, :cond_d

    .line 397
    .line 398
    invoke-virtual {v5, v3}, La/d650;->Y(La/myr0;)V

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 403
    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    goto :goto_7

    .line 407
    :cond_8
    iget-object v0, v5, La/d650;->g1:La/p7m0;

    .line 408
    .line 409
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    check-cast v0, Ljava/lang/Iterable;

    .line 414
    .line 415
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-eqz v3, :cond_a

    .line 424
    .line 425
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    move-object v4, v3

    .line 430
    check-cast v4, La/ef40;

    .line 431
    .line 432
    instance-of v4, v4, La/cf40;

    .line 433
    .line 434
    if-eqz v4, :cond_9

    .line 435
    .line 436
    goto :goto_4

    .line 437
    :cond_a
    const/4 v3, 0x0

    .line 438
    :goto_4
    check-cast v3, La/ef40;

    .line 439
    .line 440
    if-eqz v3, :cond_d

    .line 441
    .line 442
    instance-of v0, v3, La/cf40;

    .line 443
    .line 444
    if-eqz v0, :cond_d

    .line 445
    .line 446
    check-cast v3, La/cf40;

    .line 447
    .line 448
    iget-object v0, v3, La/cf40;->a:La/vbj;

    .line 449
    .line 450
    instance-of v3, v0, La/qbj;

    .line 451
    .line 452
    if-eqz v3, :cond_d

    .line 453
    .line 454
    check-cast v0, La/qbj;

    .line 455
    .line 456
    iget-object v0, v0, La/qbj;->a:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, Ljava/lang/Iterable;

    .line 459
    .line 460
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    if-eqz v3, :cond_c

    .line 469
    .line 470
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    move-object v4, v3

    .line 475
    check-cast v4, La/myr0;

    .line 476
    .line 477
    iget-wide v6, v4, La/myr0;->a:J

    .line 478
    .line 479
    cmp-long v4, v6, v1

    .line 480
    .line 481
    if-nez v4, :cond_b

    .line 482
    .line 483
    goto :goto_5

    .line 484
    :cond_c
    const/4 v3, 0x0

    .line 485
    :goto_5
    check-cast v3, La/myr0;

    .line 486
    .line 487
    if-eqz v3, :cond_d

    .line 488
    .line 489
    invoke-virtual {v5, v3}, La/d650;->Y(La/myr0;)V

    .line 490
    .line 491
    .line 492
    :cond_d
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    :goto_7
    return-object v3

    .line 495
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 496
    .line 497
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v1, La/z4w;

    .line 503
    .line 504
    const/4 v7, 0x0

    .line 505
    invoke-virtual {v1, v7}, La/z4w;->C(Z)V

    .line 506
    .line 507
    .line 508
    iget-object v1, v1, La/z4w;->m:La/i1w0;

    .line 509
    .line 510
    move-object v7, v5

    .line 511
    check-cast v7, La/n3w;

    .line 512
    .line 513
    iget-wide v9, v0, La/zg0;->j:J

    .line 514
    .line 515
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 516
    .line 517
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 518
    .line 519
    .line 520
    new-instance v6, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;

    .line 521
    .line 522
    const/4 v8, 0x1

    .line 523
    const/4 v11, 0x0

    .line 524
    invoke-direct/range {v6 .. v11}, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;-><init>(La/n3w;ZJZ)V

    .line 525
    .line 526
    .line 527
    instance-of v2, v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 528
    .line 529
    if-eqz v2, :cond_e

    .line 530
    .line 531
    new-instance v2, La/e1w0;

    .line 532
    .line 533
    check-cast v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 534
    .line 535
    invoke-direct {v2, v6}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 536
    .line 537
    .line 538
    new-instance v3, La/c8d;

    .line 539
    .line 540
    sget-object v4, La/y7d;->a:La/v7d;

    .line 541
    .line 542
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    :goto_8
    const/4 v7, 0x0

    .line 549
    goto :goto_9

    .line 550
    :cond_e
    new-instance v2, La/w0w0;

    .line 551
    .line 552
    invoke-direct {v2, v6}, La/w0w0;-><init>(La/m7h0;)V

    .line 553
    .line 554
    .line 555
    new-instance v3, La/c8d;

    .line 556
    .line 557
    sget-object v4, La/y7d;->a:La/v7d;

    .line 558
    .line 559
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    goto :goto_8

    .line 566
    :goto_9
    invoke-static {v1, v0, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    :goto_a
    move-object v2, v0

    .line 571
    check-cast v2, La/paw;

    .line 572
    .line 573
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    if-eqz v3, :cond_f

    .line 578
    .line 579
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    check-cast v2, La/oe50;

    .line 584
    .line 585
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 586
    .line 587
    .line 588
    goto :goto_a

    .line 589
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 590
    .line 591
    return-object v0

    .line 592
    :pswitch_4
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 593
    .line 594
    move-object v10, v1

    .line 595
    check-cast v10, La/q5z;

    .line 596
    .line 597
    sget-object v1, La/wne;->a:La/wne;

    .line 598
    .line 599
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    move-object v7, v5

    .line 603
    check-cast v7, La/yks;

    .line 604
    .line 605
    iget-wide v8, v0, La/zg0;->j:J

    .line 606
    .line 607
    sget v0, La/yks;->m0:I

    .line 608
    .line 609
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    sget-object v2, La/zjs;->a:La/zjs;

    .line 614
    .line 615
    iget-object v0, v7, La/yks;->q:La/mne;

    .line 616
    .line 617
    iget-object v4, v0, La/mne;->c:La/vs10;

    .line 618
    .line 619
    new-instance v5, La/ir;

    .line 620
    .line 621
    const/4 v11, 0x0

    .line 622
    const/16 v12, 0xd

    .line 623
    .line 624
    move-object v6, v5

    .line 625
    invoke-direct/range {v6 .. v12}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 626
    .line 627
    .line 628
    const/16 v6, 0xa

    .line 629
    .line 630
    const/4 v3, 0x0

    .line 631
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 632
    .line 633
    .line 634
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    return-object v0

    .line 637
    :pswitch_5
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 638
    .line 639
    move-object v10, v1

    .line 640
    check-cast v10, La/q5z;

    .line 641
    .line 642
    sget-object v1, La/wne;->a:La/wne;

    .line 643
    .line 644
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    move-object v7, v5

    .line 648
    check-cast v7, La/g9s;

    .line 649
    .line 650
    iget-wide v8, v0, La/zg0;->j:J

    .line 651
    .line 652
    sget v0, La/g9s;->n0:I

    .line 653
    .line 654
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    sget-object v2, La/h8s;->a:La/h8s;

    .line 659
    .line 660
    iget-object v0, v7, La/g9s;->q:La/mne;

    .line 661
    .line 662
    iget-object v4, v0, La/mne;->c:La/vs10;

    .line 663
    .line 664
    new-instance v5, La/ir;

    .line 665
    .line 666
    const/4 v11, 0x0

    .line 667
    const/16 v12, 0xc

    .line 668
    .line 669
    move-object v6, v5

    .line 670
    invoke-direct/range {v6 .. v12}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 671
    .line 672
    .line 673
    const/16 v6, 0xa

    .line 674
    .line 675
    const/4 v3, 0x0

    .line 676
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 677
    .line 678
    .line 679
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 680
    .line 681
    return-object v0

    .line 682
    :pswitch_6
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 683
    .line 684
    move-object v10, v1

    .line 685
    check-cast v10, La/q5z;

    .line 686
    .line 687
    sget-object v1, La/wne;->a:La/wne;

    .line 688
    .line 689
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    move-object v7, v5

    .line 693
    check-cast v7, La/k4s;

    .line 694
    .line 695
    iget-wide v8, v0, La/zg0;->j:J

    .line 696
    .line 697
    sget v0, La/k4s;->c0:I

    .line 698
    .line 699
    iget-object v0, v7, La/k4s;->p:La/mne;

    .line 700
    .line 701
    iget-object v0, v0, La/mne;->c:La/vs10;

    .line 702
    .line 703
    sget-object v1, La/m3s;->a:La/m3s;

    .line 704
    .line 705
    new-instance v6, La/sr;

    .line 706
    .line 707
    const/4 v11, 0x0

    .line 708
    const/16 v12, 0x8

    .line 709
    .line 710
    invoke-direct/range {v6 .. v12}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v7, v0, v1, v6}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 714
    .line 715
    .line 716
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 717
    .line 718
    return-object v0

    .line 719
    :pswitch_7
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 720
    .line 721
    move-object v7, v1

    .line 722
    check-cast v7, La/q5z;

    .line 723
    .line 724
    sget-object v1, La/wne;->a:La/wne;

    .line 725
    .line 726
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    move-object v8, v5

    .line 730
    check-cast v8, La/spr;

    .line 731
    .line 732
    iget-wide v9, v0, La/zg0;->j:J

    .line 733
    .line 734
    sget v0, La/spr;->j0:I

    .line 735
    .line 736
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    sget-object v2, La/ior;->a:La/ior;

    .line 741
    .line 742
    iget-object v0, v8, La/spr;->q:La/mne;

    .line 743
    .line 744
    iget-object v4, v0, La/mne;->c:La/vs10;

    .line 745
    .line 746
    new-instance v5, La/ir;

    .line 747
    .line 748
    const/4 v11, 0x0

    .line 749
    const/16 v12, 0xb

    .line 750
    .line 751
    move-object v6, v5

    .line 752
    invoke-direct/range {v6 .. v12}, La/ir;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 753
    .line 754
    .line 755
    const/16 v6, 0xa

    .line 756
    .line 757
    const/4 v3, 0x0

    .line 758
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 759
    .line 760
    .line 761
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 762
    .line 763
    return-object v0

    .line 764
    :pswitch_8
    sget-object v1, La/wne;->a:La/wne;

    .line 765
    .line 766
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 770
    .line 771
    move-object v10, v1

    .line 772
    check-cast v10, La/d4o;

    .line 773
    .line 774
    iget-object v1, v10, La/d4o;->s:La/vqc;

    .line 775
    .line 776
    move-object v7, v5

    .line 777
    check-cast v7, Ljava/lang/String;

    .line 778
    .line 779
    iget-wide v8, v0, La/zg0;->j:J

    .line 780
    .line 781
    new-instance v6, La/mz0;

    .line 782
    .line 783
    const/16 v11, 0x10

    .line 784
    .line 785
    invoke-direct/range {v6 .. v11}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 786
    .line 787
    .line 788
    invoke-static {v6}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {v1, v0}, La/vqc;->k(La/m1g;)V

    .line 793
    .line 794
    .line 795
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 796
    .line 797
    return-object v0

    .line 798
    :pswitch_9
    sget-object v1, La/wne;->a:La/wne;

    .line 799
    .line 800
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 801
    .line 802
    .line 803
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v1, La/egk0;

    .line 806
    .line 807
    iget-wide v2, v0, La/zg0;->j:J

    .line 808
    .line 809
    check-cast v5, Ljava/lang/Long;

    .line 810
    .line 811
    invoke-static {v5, v2, v3}, La/v7n;->f(Ljava/lang/Long;J)J

    .line 812
    .line 813
    .line 814
    move-result-wide v2

    .line 815
    invoke-virtual {v1, v2, v3}, La/egk0;->m(J)V

    .line 816
    .line 817
    .line 818
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 819
    .line 820
    return-object v0

    .line 821
    :pswitch_a
    iget-wide v1, v0, La/zg0;->j:J

    .line 822
    .line 823
    sget-object v3, La/wne;->a:La/wne;

    .line 824
    .line 825
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 826
    .line 827
    .line 828
    iget-object v0, v0, La/zg0;->k:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v0, La/v9k0;

    .line 831
    .line 832
    iget-wide v3, v0, La/v9k0;->a:J

    .line 833
    .line 834
    sub-long v6, v3, v1

    .line 835
    .line 836
    const-wide/16 v8, 0x64

    .line 837
    .line 838
    mul-long/2addr v6, v8

    .line 839
    div-long/2addr v6, v3

    .line 840
    check-cast v5, La/fae;

    .line 841
    .line 842
    iget-object v0, v5, La/fae;->M:La/p7m0;

    .line 843
    .line 844
    new-instance v3, La/q9e;

    .line 845
    .line 846
    long-to-int v4, v6

    .line 847
    invoke-direct {v3, v4, v1, v2}, La/q9e;-><init>(IJ)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    const/4 v1, 0x0

    .line 854
    invoke-virtual {v0, v1, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 858
    .line 859
    return-object v0

    .line 860
    :pswitch_b
    iget-object v1, v0, La/zg0;->k:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v1, Ljava/lang/Throwable;

    .line 863
    .line 864
    sget-object v2, La/wne;->a:La/wne;

    .line 865
    .line 866
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    move-object v2, v5

    .line 870
    check-cast v2, La/dk6;

    .line 871
    .line 872
    iget-wide v3, v0, La/zg0;->j:J

    .line 873
    .line 874
    sget v0, La/dk6;->K:I

    .line 875
    .line 876
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 877
    .line 878
    .line 879
    iget-object v0, v2, La/dk6;->w:La/owp0;

    .line 880
    .line 881
    sget-object v1, La/idf0;->a:La/idf0;

    .line 882
    .line 883
    invoke-virtual {v0, v1}, La/owp0;->g(La/ldf0;)V

    .line 884
    .line 885
    .line 886
    iget-object v0, v2, La/dk6;->x:La/ikt0;

    .line 887
    .line 888
    sget-object v1, La/lx7;->a:La/lx7;

    .line 889
    .line 890
    invoke-virtual {v0, v1}, La/ikt0;->b(La/px7;)V

    .line 891
    .line 892
    .line 893
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 894
    .line 895
    iget-object v6, v0, La/ocj;->a:La/p7m0;

    .line 896
    .line 897
    :cond_10
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 905
    .line 906
    move-object v7, v0

    .line 907
    check-cast v7, La/hj6;

    .line 908
    .line 909
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    new-instance v9, La/ii6;

    .line 913
    .line 914
    invoke-direct {v9, v3, v4}, La/ii6;-><init>(J)V

    .line 915
    .line 916
    .line 917
    const/4 v15, 0x0

    .line 918
    const/16 v16, 0x1ffd

    .line 919
    .line 920
    const/4 v8, 0x0

    .line 921
    const/4 v10, 0x0

    .line 922
    const/4 v11, 0x0

    .line 923
    const/4 v12, 0x0

    .line 924
    const/4 v13, 0x0

    .line 925
    const/4 v14, 0x0

    .line 926
    invoke-static/range {v7 .. v16}, La/hj6;->a(La/hj6;ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLjava/util/List;I)La/hj6;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    invoke-virtual {v6, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-eqz v0, :cond_10

    .line 935
    .line 936
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 937
    .line 938
    return-object v0

    .line 939
    :pswitch_c
    move-object v1, v3

    .line 940
    sget-object v2, La/wne;->a:La/wne;

    .line 941
    .line 942
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    iget-object v2, v0, La/zg0;->k:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v2, La/eh0;

    .line 948
    .line 949
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v3

    .line 953
    check-cast v3, La/hg0;

    .line 954
    .line 955
    iget-object v3, v3, La/hg0;->c:La/a4x;

    .line 956
    .line 957
    iget-wide v6, v0, La/zg0;->j:J

    .line 958
    .line 959
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 964
    .line 965
    .line 966
    move-result v3

    .line 967
    if-eqz v3, :cond_12

    .line 968
    .line 969
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    move-object v4, v3

    .line 974
    check-cast v4, La/vh0;

    .line 975
    .line 976
    iget-wide v8, v4, La/vh0;->a:J

    .line 977
    .line 978
    cmp-long v4, v8, v6

    .line 979
    .line 980
    if-nez v4, :cond_11

    .line 981
    .line 982
    goto :goto_b

    .line 983
    :cond_12
    move-object v3, v1

    .line 984
    :goto_b
    check-cast v3, La/vh0;

    .line 985
    .line 986
    if-eqz v3, :cond_13

    .line 987
    .line 988
    check-cast v5, Ljava/util/List;

    .line 989
    .line 990
    sget-object v0, La/q91;->a:La/q91;

    .line 991
    .line 992
    sget-object v1, La/iun;->a:La/iun;

    .line 993
    .line 994
    invoke-virtual {v2, v3, v5, v0, v1}, La/eh0;->R(La/vh0;Ljava/util/List;La/q91;Ljava/util/List;)V

    .line 995
    .line 996
    .line 997
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 998
    .line 999
    return-object v0

    .line 1000
    nop

    .line 1001
    :pswitch_data_0
    .packed-switch 0x0
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
