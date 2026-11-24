.class public final synthetic La/tht0;
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
    iput-byte p1, p0, La/tht0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/tht0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, La/inv;

    .line 8
    .line 9
    sget-object v0, La/okx;->a:La/okx;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {p0, v0, v0, v1}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, La/zw3;

    .line 17
    .line 18
    sget-object v1, La/yxt0;->a:La/yxt0;

    .line 19
    .line 20
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    new-instance p0, La/zw3;

    .line 25
    .line 26
    sget-object v1, La/c1u0;->a:La/c1u0;

    .line 27
    .line 28
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    new-instance p0, La/zw3;

    .line 33
    .line 34
    sget-object v1, La/w1u0;->a:La/w1u0;

    .line 35
    .line 36
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_3
    new-instance p0, La/zw3;

    .line 41
    .line 42
    sget-object v1, La/l0u0;->a:La/l0u0;

    .line 43
    .line 44
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_4
    new-instance p0, La/zw3;

    .line 49
    .line 50
    sget-object v1, La/q0u0;->a:La/q0u0;

    .line 51
    .line 52
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_5
    new-instance p0, La/zw3;

    .line 57
    .line 58
    sget-object v1, La/h0u0;->a:La/h0u0;

    .line 59
    .line 60
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_6
    new-instance p0, La/zw3;

    .line 65
    .line 66
    sget-object v1, La/nrh;->a:La/nrh;

    .line 67
    .line 68
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_7
    new-instance p0, La/zw3;

    .line 73
    .line 74
    sget-object v1, La/srh;->a:La/srh;

    .line 75
    .line 76
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_8
    new-instance p0, La/zw3;

    .line 81
    .line 82
    sget-object v1, La/yvt0;->a:La/yvt0;

    .line 83
    .line 84
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_9
    sget-object v6, La/yzp;->a:La/ggy;

    .line 89
    .line 90
    sget-object v7, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 91
    .line 92
    sget-object p0, La/yzp;->b:La/y190;

    .line 93
    .line 94
    const-string v0, "coil3_disk_cache"

    .line 95
    .line 96
    invoke-virtual {p0, v0}, La/y190;->e(Ljava/lang/String;)La/y190;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    const-wide/32 v10, 0xa00000

    .line 101
    .line 102
    .line 103
    :try_start_0
    invoke-virtual {v5}, La/y190;->toFile()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Ljava/io/File;->mkdir()Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    new-instance v0, Landroid/os/StatFs;

    .line 115
    .line 116
    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    mul-long/2addr v3, v1

    .line 128
    long-to-double v0, v3

    .line 129
    const-wide v2, 0x3f947ae147ae147bL    # 0.02

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    mul-double/2addr v2, v0

    .line 135
    double-to-long v8, v2

    .line 136
    const-wide/32 v12, 0xfa00000

    .line 137
    .line 138
    .line 139
    invoke-static/range {v8 .. v13}, La/l1e0;->f(JJJ)J

    .line 140
    .line 141
    .line 142
    move-result-wide v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :catch_0
    move-wide v3, v10

    .line 144
    new-instance v2, La/bbe0;

    .line 145
    .line 146
    invoke-direct/range {v2 .. v7}, La/bbe0;-><init>(JLa/y190;La/yzp;Lkotlin/coroutines/g;)V

    .line 147
    .line 148
    .line 149
    return-object v2

    .line 150
    :pswitch_a
    new-instance p0, La/zw3;

    .line 151
    .line 152
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 153
    .line 154
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_b
    new-instance p0, La/zw3;

    .line 159
    .line 160
    sget-object v1, La/xst0;->a:La/xst0;

    .line 161
    .line 162
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_c
    new-instance p0, La/zw3;

    .line 167
    .line 168
    sget-object v1, La/rst0;->a:La/rst0;

    .line 169
    .line 170
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 171
    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_d
    new-instance p0, La/zw3;

    .line 175
    .line 176
    sget-object v1, La/s710;->a:La/s710;

    .line 177
    .line 178
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 179
    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_e
    new-instance p0, La/zw3;

    .line 183
    .line 184
    sget-object v1, La/drt0;->a:La/drt0;

    .line 185
    .line 186
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 187
    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_f
    new-instance p0, La/zw3;

    .line 191
    .line 192
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 193
    .line 194
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_10
    new-instance p0, La/zw3;

    .line 203
    .line 204
    sget-object v1, La/ist0;->a:La/ist0;

    .line 205
    .line 206
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 207
    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_11
    new-instance p0, La/zw3;

    .line 211
    .line 212
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 213
    .line 214
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 215
    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_13
    new-instance p0, La/zw3;

    .line 222
    .line 223
    sget-object v1, La/ffc0;->a:La/ffc0;

    .line 224
    .line 225
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 226
    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_14
    new-instance p0, La/zw3;

    .line 230
    .line 231
    sget-object v1, La/okx;->a:La/okx;

    .line 232
    .line 233
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 234
    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_15
    new-instance p0, La/zw3;

    .line 238
    .line 239
    sget-object v1, La/ln7;->a:La/ln7;

    .line 240
    .line 241
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 242
    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_16
    new-instance p0, La/zw3;

    .line 246
    .line 247
    new-instance v1, La/zw3;

    .line 248
    .line 249
    sget-object v2, La/okx;->a:La/okx;

    .line 250
    .line 251
    invoke-direct {v1, v2, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 252
    .line 253
    .line 254
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 255
    .line 256
    .line 257
    return-object p0

    .line 258
    :pswitch_17
    new-instance p0, La/zw3;

    .line 259
    .line 260
    sget-object v1, La/tbl;->a:La/tbl;

    .line 261
    .line 262
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 263
    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_18
    new-instance p0, La/zw3;

    .line 267
    .line 268
    sget-object v1, La/jq7;->a:La/jq7;

    .line 269
    .line 270
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 271
    .line 272
    .line 273
    return-object p0

    .line 274
    :pswitch_19
    new-instance p0, La/zw3;

    .line 275
    .line 276
    new-instance v1, La/zw3;

    .line 277
    .line 278
    sget-object v2, La/okx;->a:La/okx;

    .line 279
    .line 280
    invoke-direct {v1, v2, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 281
    .line 282
    .line 283
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 284
    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 288
    .line 289
    sget-object v1, La/gdy;->a:La/gdy;

    .line 290
    .line 291
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 292
    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 296
    .line 297
    sget-object v1, La/git0;->a:La/git0;

    .line 298
    .line 299
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 300
    .line 301
    .line 302
    return-object p0

    .line 303
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 304
    .line 305
    sget-object v1, La/tbl;->a:La/tbl;

    .line 306
    .line 307
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 308
    .line 309
    .line 310
    return-object p0

    .line 311
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
