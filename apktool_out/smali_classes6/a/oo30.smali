.class public final synthetic La/oo30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vcd;


# direct methods
.method public synthetic constructor <init>(La/vcd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oo30;->a:B

    iput-object p1, p0, La/oo30;->b:La/vcd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/oo30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x12

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v6, p1

    .line 13
    check-cast v6, La/mm40;

    .line 14
    .line 15
    move-object v9, p2

    .line 16
    check-cast v9, La/fet;

    .line 17
    .line 18
    check-cast p3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 p2, p1, 0x6

    .line 28
    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    move v3, v4

    .line 38
    :cond_0
    or-int/2addr p1, v3

    .line 39
    :cond_1
    and-int/lit8 p2, p1, 0x13

    .line 40
    .line 41
    if-eq p2, v2, :cond_2

    .line 42
    .line 43
    move v1, v5

    .line 44
    :cond_2
    and-int/lit8 p2, p1, 0x1

    .line 45
    .line 46
    invoke-virtual {v9, p2, v1}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    sget-object v8, La/gqw0;->h:La/zx7;

    .line 53
    .line 54
    and-int/lit8 p1, p1, 0xe

    .line 55
    .line 56
    or-int/lit16 v10, p1, 0x180

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    iget-object v7, p0, La/oo30;->b:La/vcd;

    .line 60
    .line 61
    invoke-static/range {v6 .. v11}, La/x4d0;->s(La/mm40;La/vcd;La/u12;La/fet;II)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 66
    .line 67
    .line 68
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_0
    move-object v0, p1

    .line 72
    check-cast v0, La/mm40;

    .line 73
    .line 74
    check-cast p2, La/fet;

    .line 75
    .line 76
    check-cast p3, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    and-int/lit8 p3, p1, 0x6

    .line 86
    .line 87
    if-nez p3, :cond_5

    .line 88
    .line 89
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eqz p3, :cond_4

    .line 94
    .line 95
    move v3, v4

    .line 96
    :cond_4
    or-int/2addr p1, v3

    .line 97
    :cond_5
    and-int/lit8 p3, p1, 0x13

    .line 98
    .line 99
    if-eq p3, v2, :cond_6

    .line 100
    .line 101
    move v1, v5

    .line 102
    :cond_6
    and-int/lit8 p3, p1, 0x1

    .line 103
    .line 104
    invoke-virtual {p2, p3, v1}, La/fet;->U(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    if-eqz p3, :cond_7

    .line 109
    .line 110
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 111
    .line 112
    and-int/lit8 p1, p1, 0xe

    .line 113
    .line 114
    or-int/lit16 v4, p1, 0x180

    .line 115
    .line 116
    const/4 v5, 0x0

    .line 117
    iget-object v1, p0, La/oo30;->b:La/vcd;

    .line 118
    .line 119
    move-object v3, p2

    .line 120
    invoke-static/range {v0 .. v5}, La/x4d0;->s(La/mm40;La/vcd;La/u12;La/fet;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    move-object v3, p2

    .line 125
    invoke-virtual {v3}, La/fet;->X()V

    .line 126
    .line 127
    .line 128
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_1
    move-object v0, p1

    .line 132
    check-cast v0, La/mm40;

    .line 133
    .line 134
    check-cast p2, La/fet;

    .line 135
    .line 136
    check-cast p3, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    and-int/lit8 p3, p1, 0x6

    .line 146
    .line 147
    if-nez p3, :cond_9

    .line 148
    .line 149
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    if-eqz p3, :cond_8

    .line 154
    .line 155
    move v3, v4

    .line 156
    :cond_8
    or-int/2addr p1, v3

    .line 157
    :cond_9
    and-int/lit8 p3, p1, 0x13

    .line 158
    .line 159
    if-eq p3, v2, :cond_a

    .line 160
    .line 161
    move v1, v5

    .line 162
    :cond_a
    and-int/lit8 p3, p1, 0x1

    .line 163
    .line 164
    invoke-virtual {p2, p3, v1}, La/fet;->U(IZ)Z

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    if-eqz p3, :cond_b

    .line 169
    .line 170
    sget-object v2, La/gqw0;->b:La/zx7;

    .line 171
    .line 172
    and-int/lit8 p1, p1, 0xe

    .line 173
    .line 174
    or-int/lit16 v4, p1, 0x180

    .line 175
    .line 176
    const/4 v5, 0x0

    .line 177
    iget-object v1, p0, La/oo30;->b:La/vcd;

    .line 178
    .line 179
    move-object v3, p2

    .line 180
    invoke-static/range {v0 .. v5}, La/x4d0;->s(La/mm40;La/vcd;La/u12;La/fet;II)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_b
    move-object v3, p2

    .line 185
    invoke-virtual {v3}, La/fet;->X()V

    .line 186
    .line 187
    .line 188
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_2
    move-object v0, p1

    .line 192
    check-cast v0, La/mm40;

    .line 193
    .line 194
    check-cast p2, La/fet;

    .line 195
    .line 196
    check-cast p3, Ljava/lang/Integer;

    .line 197
    .line 198
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    and-int/lit8 p3, p1, 0x6

    .line 206
    .line 207
    if-nez p3, :cond_d

    .line 208
    .line 209
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p3

    .line 213
    if-eqz p3, :cond_c

    .line 214
    .line 215
    move v3, v4

    .line 216
    :cond_c
    or-int/2addr p1, v3

    .line 217
    :cond_d
    and-int/lit8 p3, p1, 0x13

    .line 218
    .line 219
    if-eq p3, v2, :cond_e

    .line 220
    .line 221
    move v1, v5

    .line 222
    :cond_e
    and-int/lit8 p3, p1, 0x1

    .line 223
    .line 224
    invoke-virtual {p2, p3, v1}, La/fet;->U(IZ)Z

    .line 225
    .line 226
    .line 227
    move-result p3

    .line 228
    if-eqz p3, :cond_f

    .line 229
    .line 230
    and-int/lit8 v4, p1, 0xe

    .line 231
    .line 232
    const/4 v5, 0x4

    .line 233
    iget-object v1, p0, La/oo30;->b:La/vcd;

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    move-object v3, p2

    .line 237
    invoke-static/range {v0 .. v5}, La/x4d0;->s(La/mm40;La/vcd;La/u12;La/fet;II)V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_f
    move-object v3, p2

    .line 242
    invoke-virtual {v3}, La/fet;->X()V

    .line 243
    .line 244
    .line 245
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_3
    move-object v0, p1

    .line 249
    check-cast v0, La/mm40;

    .line 250
    .line 251
    check-cast p2, La/fet;

    .line 252
    .line 253
    check-cast p3, Ljava/lang/Integer;

    .line 254
    .line 255
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    and-int/lit8 p3, p1, 0x6

    .line 263
    .line 264
    if-nez p3, :cond_11

    .line 265
    .line 266
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p3

    .line 270
    if-eqz p3, :cond_10

    .line 271
    .line 272
    move v3, v4

    .line 273
    :cond_10
    or-int/2addr p1, v3

    .line 274
    :cond_11
    and-int/lit8 p3, p1, 0x13

    .line 275
    .line 276
    if-eq p3, v2, :cond_12

    .line 277
    .line 278
    move v1, v5

    .line 279
    :cond_12
    and-int/lit8 p3, p1, 0x1

    .line 280
    .line 281
    invoke-virtual {p2, p3, v1}, La/fet;->U(IZ)Z

    .line 282
    .line 283
    .line 284
    move-result p3

    .line 285
    if-eqz p3, :cond_13

    .line 286
    .line 287
    sget-object v2, La/gqw0;->b:La/zx7;

    .line 288
    .line 289
    and-int/lit8 p1, p1, 0xe

    .line 290
    .line 291
    or-int/lit16 v4, p1, 0x180

    .line 292
    .line 293
    const/4 v5, 0x0

    .line 294
    iget-object v1, p0, La/oo30;->b:La/vcd;

    .line 295
    .line 296
    move-object v3, p2

    .line 297
    invoke-static/range {v0 .. v5}, La/x4d0;->s(La/mm40;La/vcd;La/u12;La/fet;II)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_13
    move-object v3, p2

    .line 302
    invoke-virtual {v3}, La/fet;->X()V

    .line 303
    .line 304
    .line 305
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object p0

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
