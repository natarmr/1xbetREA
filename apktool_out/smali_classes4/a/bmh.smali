.class public final synthetic La/bmh;
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
    iput-byte p1, p0, La/bmh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p0, p0, La/bmh;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/zw3;

    .line 9
    .line 10
    sget-object v0, La/ygj;->a:La/ygj;

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object p0, La/ngj;->n2:La/usd;

    .line 17
    .line 18
    new-instance p0, La/igj;

    .line 19
    .line 20
    invoke-direct {p0}, La/qv5;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/x2i;

    .line 24
    .line 25
    const/16 v1, 0x10

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/x2i;-><init>(B)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/zuh;

    .line 31
    .line 32
    const/16 v2, 0xe

    .line 33
    .line 34
    invoke-direct {v1, v2}, La/zuh;-><init>(B)V

    .line 35
    .line 36
    .line 37
    new-instance v2, La/e3j;

    .line 38
    .line 39
    const/4 v3, 0x5

    .line 40
    invoke-direct {v2, v0, v3}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    new-instance v0, La/pue;

    .line 44
    .line 45
    const/16 v3, 0x1a

    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    invoke-direct {v0, v4, v3}, La/pue;-><init>(IB)V

    .line 49
    .line 50
    .line 51
    sget-object v3, La/zdh;->i:La/zdh;

    .line 52
    .line 53
    new-instance v5, La/gbn;

    .line 54
    .line 55
    invoke-direct {v5, v1, v0, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, La/zz3;->d:La/dp;

    .line 59
    .line 60
    invoke-virtual {v0, v5}, La/dp;->b(La/gbn;)V

    .line 61
    .line 62
    .line 63
    new-instance v1, La/zuh;

    .line 64
    .line 65
    const/16 v2, 0xd

    .line 66
    .line 67
    invoke-direct {v1, v2}, La/zuh;-><init>(B)V

    .line 68
    .line 69
    .line 70
    new-instance v2, La/x2i;

    .line 71
    .line 72
    const/16 v3, 0xf

    .line 73
    .line 74
    invoke-direct {v2, v3}, La/x2i;-><init>(B)V

    .line 75
    .line 76
    .line 77
    new-instance v3, La/pue;

    .line 78
    .line 79
    const/16 v5, 0x19

    .line 80
    .line 81
    invoke-direct {v3, v4, v5}, La/pue;-><init>(IB)V

    .line 82
    .line 83
    .line 84
    sget-object v4, La/zdh;->h:La/zdh;

    .line 85
    .line 86
    new-instance v5, La/gbn;

    .line 87
    .line 88
    invoke-direct {v5, v1, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v5}, La/dp;->b(La/gbn;)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_1
    new-instance p0, La/hgj;

    .line 96
    .line 97
    sget-object v0, La/iun;->a:La/iun;

    .line 98
    .line 99
    invoke-direct {p0, v0, v0}, La/hgj;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_2
    sget-object p0, La/ifj;->a:La/ifj;

    .line 104
    .line 105
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_3
    sget-object p0, La/am;->a:La/am;

    .line 111
    .line 112
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_5
    sget-object p0, La/bej;->i2:La/qud;

    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_6
    sget-object p0, La/bej;->i2:La/qud;

    .line 126
    .line 127
    const-string p0, "UTC"

    .line 128
    .line 129
    invoke-static {p0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_7
    new-instance p0, La/zw3;

    .line 139
    .line 140
    sget-object v0, La/b8j;->a:La/b8j;

    .line 141
    .line 142
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_a
    new-instance p0, La/b2j;

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    invoke-direct {p0, v0, v1}, La/b2j;-><init>(La/n85;Z)V

    .line 156
    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_b
    new-instance p0, La/z0j;

    .line 160
    .line 161
    const-wide/16 v2, 0x0

    .line 162
    .line 163
    const/4 v0, -0x1

    .line 164
    invoke-direct {p0, v0, v1, v2, v3}, La/z0j;-><init>(IIJ)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_c
    new-instance p0, La/zw3;

    .line 169
    .line 170
    sget-object v0, La/b0j;->a:La/b0j;

    .line 171
    .line 172
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_10
    sget p0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 186
    .line 187
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_11
    new-instance p0, Landroid/text/TextPaint;

    .line 191
    .line 192
    invoke-direct {p0}, Landroid/text/TextPaint;-><init>()V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_12
    new-instance p0, La/zw3;

    .line 197
    .line 198
    sget-object v0, La/d040;->a:La/d040;

    .line 199
    .line 200
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 201
    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_13
    new-instance p0, La/zw3;

    .line 205
    .line 206
    sget-object v0, La/mcm0;->a:La/mcm0;

    .line 207
    .line 208
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 209
    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_14
    new-instance p0, La/zw3;

    .line 213
    .line 214
    sget-object v0, La/c4a0;->a:La/c4a0;

    .line 215
    .line 216
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 217
    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_15
    new-instance p0, La/zw3;

    .line 221
    .line 222
    sget-object v0, La/ncc;->a:La/ncc;

    .line 223
    .line 224
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 225
    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_16
    new-instance p0, La/zw3;

    .line 229
    .line 230
    sget-object v0, La/o9a0;->a:La/o9a0;

    .line 231
    .line 232
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 233
    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_17
    new-instance p0, La/zw3;

    .line 237
    .line 238
    sget-object v0, La/idg;->a:La/idg;

    .line 239
    .line 240
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 241
    .line 242
    .line 243
    return-object p0

    .line 244
    :pswitch_18
    new-instance p0, La/zw3;

    .line 245
    .line 246
    sget-object v0, La/jsh;->a:La/jsh;

    .line 247
    .line 248
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 249
    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_19
    new-instance p0, La/zw3;

    .line 253
    .line 254
    sget-object v0, La/jsh;->a:La/jsh;

    .line 255
    .line 256
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 257
    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_1a
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :pswitch_1b
    new-instance p0, La/qlh;

    .line 266
    .line 267
    invoke-direct {p0, v0, v0}, La/qlh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    new-instance v1, La/bqr;

    .line 271
    .line 272
    const-wide/16 v4, 0x0

    .line 273
    .line 274
    const-string v6, ""

    .line 275
    .line 276
    const-wide/16 v2, 0x0

    .line 277
    .line 278
    invoke-direct/range {v1 .. v6}, La/bqr;-><init>(JJLjava/lang/String;)V

    .line 279
    .line 280
    .line 281
    new-instance v2, La/fmh;

    .line 282
    .line 283
    invoke-direct {v2, v1, v0, p0, v0}, La/fmh;-><init>(La/bqr;La/j0g0;La/qlh;Ljava/lang/Integer;)V

    .line 284
    .line 285
    .line 286
    return-object v2

    .line 287
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 288
    .line 289
    sget-object v0, La/djh;->a:La/djh;

    .line 290
    .line 291
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 292
    .line 293
    .line 294
    return-object p0

    .line 295
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
