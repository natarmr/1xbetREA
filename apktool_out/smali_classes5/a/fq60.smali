.class public final synthetic La/fq60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/fq60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte p0, p0, La/fq60;->a:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    sget-object v1, La/vm60;->a:La/vm60;

    .line 5
    .line 6
    const-string v2, ""

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    new-instance p0, La/us70;

    .line 19
    .line 20
    invoke-direct {p0, v2, v3, v3}, La/us70;-><init>(Ljava/lang/String;IZ)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_2
    new-instance p0, La/zw3;

    .line 25
    .line 26
    sget-object v0, La/rr70;->a:La/rr70;

    .line 27
    .line 28
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p0, v0, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_3
    sget p0, Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;->A:I

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_4
    sget p0, Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;->A:I

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_5
    new-instance p0, La/qc70;

    .line 47
    .line 48
    invoke-direct {p0, v3}, La/qc70;-><init>(Z)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_6
    new-instance p0, La/q970;

    .line 53
    .line 54
    invoke-direct {p0, v2, v2, v3}, La/q970;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_7
    new-instance p0, La/n470;

    .line 59
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_8
    new-instance v0, La/c270;

    .line 65
    .line 66
    move p0, v3

    .line 67
    sget-object v3, La/d270;->j:La/d270;

    .line 68
    .line 69
    sget-object v6, La/m170;->a:La/m170;

    .line 70
    .line 71
    new-instance v7, La/k170;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v7, p0, v1, v1}, La/k170;-><init>(ZLa/kg;La/ql5;)V

    .line 75
    .line 76
    .line 77
    sget-object v8, La/iun;->a:La/iun;

    .line 78
    .line 79
    const-string v1, ""

    .line 80
    .line 81
    const-string v2, ""

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    const/4 v5, 0x1

    .line 85
    invoke-direct/range {v0 .. v8}, La/c270;-><init>(Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_9
    move p0, v3

    .line 90
    new-instance v0, La/zw3;

    .line 91
    .line 92
    sget-object v1, La/d8b;->a:La/d8b;

    .line 93
    .line 94
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_a
    move p0, v3

    .line 99
    new-instance v0, La/zw3;

    .line 100
    .line 101
    sget-object v1, La/nbv;->a:La/nbv;

    .line 102
    .line 103
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_b
    move p0, v3

    .line 108
    new-instance v0, La/zw3;

    .line 109
    .line 110
    sget-object v1, La/okx;->a:La/okx;

    .line 111
    .line 112
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_c
    move p0, v3

    .line 117
    new-instance v0, La/zw3;

    .line 118
    .line 119
    sget-object v1, La/j070;->a:La/j070;

    .line 120
    .line 121
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_d
    move p0, v3

    .line 130
    new-instance v0, La/zw3;

    .line 131
    .line 132
    sget-object v1, La/c070;->a:La/c070;

    .line 133
    .line 134
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_e
    move p0, v3

    .line 143
    new-instance v0, La/zw3;

    .line 144
    .line 145
    sget-object v1, La/g070;->a:La/g070;

    .line 146
    .line 147
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_f
    move p0, v3

    .line 156
    new-instance v0, La/zw3;

    .line 157
    .line 158
    sget-object v1, La/okx;->a:La/okx;

    .line 159
    .line 160
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_10
    move p0, v3

    .line 165
    new-instance v0, La/zw3;

    .line 166
    .line 167
    sget-object v1, La/qz60;->a:La/qz60;

    .line 168
    .line 169
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_11
    move p0, v3

    .line 174
    new-instance v0, La/zw3;

    .line 175
    .line 176
    sget-object v1, La/xz60;->a:La/xz60;

    .line 177
    .line 178
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_12
    move p0, v3

    .line 183
    new-instance v0, La/zw3;

    .line 184
    .line 185
    sget-object v1, La/uz60;->a:La/uz60;

    .line 186
    .line 187
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 188
    .line 189
    .line 190
    return-object v0

    .line 191
    :pswitch_13
    sget p0, La/dy60;->S:I

    .line 192
    .line 193
    return-object v1

    .line 194
    :pswitch_14
    move p0, v3

    .line 195
    new-instance v0, La/zw3;

    .line 196
    .line 197
    sget-object v1, La/g8p;->a:La/g8p;

    .line 198
    .line 199
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 200
    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_16
    new-instance p0, La/zw3;

    .line 207
    .line 208
    sget-object v1, La/s710;->a:La/s710;

    .line 209
    .line 210
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 211
    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_17
    move p0, v3

    .line 215
    new-instance v0, La/zw3;

    .line 216
    .line 217
    sget-object v1, La/okx;->a:La/okx;

    .line 218
    .line 219
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 220
    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_18
    new-instance p0, La/zw3;

    .line 224
    .line 225
    sget-object v1, La/s710;->a:La/s710;

    .line 226
    .line 227
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 228
    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_19
    sget p0, La/bs60;->h0:I

    .line 232
    .line 233
    return-object v1

    .line 234
    :pswitch_1a
    move p0, v3

    .line 235
    new-instance v0, La/zw3;

    .line 236
    .line 237
    sget-object v1, La/nuo;->a:La/nuo;

    .line 238
    .line 239
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 240
    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_1b
    move p0, v3

    .line 244
    new-instance v0, La/zw3;

    .line 245
    .line 246
    sget-object v1, La/kq60;->a:La/kq60;

    .line 247
    .line 248
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_1c
    move p0, v3

    .line 257
    new-instance v0, La/zw3;

    .line 258
    .line 259
    sget-object v1, La/iq60;->a:La/iq60;

    .line 260
    .line 261
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-direct {v0, v1, p0}, La/zw3;-><init>(La/jiy;B)V

    .line 266
    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
