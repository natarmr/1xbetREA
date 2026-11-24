.class public final synthetic La/w650;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p92;


# direct methods
.method public synthetic constructor <init>(La/p92;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w650;->a:B

    iput-object p1, p0, La/w650;->b:La/p92;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/w650;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/w650;->b:La/p92;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/p92;->b:La/ctf0;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_7

    .line 19
    .line 20
    iget-object p1, p0, La/p92;->k:La/n0o0;

    .line 21
    .line 22
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/fee;

    .line 27
    .line 28
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/ql5;

    .line 33
    .line 34
    iget-object p0, p0, La/p92;->e:La/n0o0;

    .line 35
    .line 36
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/fee;

    .line 41
    .line 42
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/ijl;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-string v3, ""

    .line 55
    .line 56
    if-nez p1, :cond_0

    .line 57
    .line 58
    move-object v4, v3

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iget-object v4, p1, La/ql5;->j:Ljava/lang/String;

    .line 61
    .line 62
    sget-object v5, La/ijl;->b:La/ijl;

    .line 63
    .line 64
    if-ne p0, v5, :cond_1

    .line 65
    .line 66
    new-array v4, v2, [Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 69
    .line 70
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const v6, 0x7f1300e5

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-lez v5, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    iget-object v4, p1, La/ql5;->k:Ljava/lang/String;

    .line 90
    .line 91
    :goto_0
    if-eqz p1, :cond_3

    .line 92
    .line 93
    iget-wide v5, p1, La/ql5;->b:D

    .line 94
    .line 95
    sget-object v7, La/pn40;->a:La/pn40;

    .line 96
    .line 97
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 98
    .line 99
    invoke-static {v5, v6, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move-object v5, v1

    .line 105
    :goto_1
    if-nez v5, :cond_4

    .line 106
    .line 107
    move-object v5, v3

    .line 108
    :cond_4
    if-eqz p1, :cond_5

    .line 109
    .line 110
    iget-object v1, p1, La/ql5;->f:Ljava/lang/String;

    .line 111
    .line 112
    :cond_5
    if-nez v1, :cond_6

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    move-object v3, v1

    .line 116
    :goto_2
    new-array p1, v2, [Ljava/lang/Object;

    .line 117
    .line 118
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 119
    .line 120
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const v1, 0x7f1315e0

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v0, La/jjl;

    .line 132
    .line 133
    invoke-direct {v0, v5, v3, p1, v4}, La/jjl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    new-instance p1, La/x250;

    .line 137
    .line 138
    invoke-direct {p1, p0, v0}, La/x250;-><init>(La/ijl;La/jjl;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    new-instance p1, La/y250;

    .line 146
    .line 147
    new-array p0, v2, [Ljava/lang/Object;

    .line 148
    .line 149
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 150
    .line 151
    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    const v1, 0x7f1302fa

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1, p0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    new-array v1, v2, [Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    const v2, 0x7f13112e

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-direct {p1, p0, v0}, La/y250;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :goto_3
    return-object p1

    .line 179
    :pswitch_0
    check-cast p1, La/mi0;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, La/p92;->b:La/ctf0;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    const v0, 0x7f130db2

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sget-object v3, La/mi0;->b:La/mi0;

    .line 197
    .line 198
    if-ne p1, v3, :cond_8

    .line 199
    .line 200
    move-object v1, v0

    .line 201
    :cond_8
    if-eqz v1, :cond_9

    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    goto :goto_4

    .line 208
    :cond_9
    const p1, 0x7f130dba

    .line 209
    .line 210
    .line 211
    :goto_4
    new-array v0, v2, [Ljava/lang/Object;

    .line 212
    .line 213
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 214
    .line 215
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {p0, p1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    new-instance v0, La/imm;

    .line 224
    .line 225
    new-instance v1, La/ilm;

    .line 226
    .line 227
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 228
    .line 229
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 234
    .line 235
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v2

    .line 239
    invoke-direct {v1, v2, v3}, La/ilm;-><init>(J)V

    .line 240
    .line 241
    .line 242
    new-instance v2, La/plm;

    .line 243
    .line 244
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 249
    .line 250
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    sget-object p1, La/fa50;->a:La/fa50;

    .line 255
    .line 256
    invoke-direct {v2, p0, v3, v4, p1}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 257
    .line 258
    .line 259
    new-instance v3, La/dmm;

    .line 260
    .line 261
    new-instance p0, La/ta50;

    .line 262
    .line 263
    new-instance v4, La/wkm;

    .line 264
    .line 265
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 270
    .line 271
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v9

    .line 275
    const/4 v5, 0x0

    .line 276
    const v6, 0x7f0809ee

    .line 277
    .line 278
    .line 279
    const/4 v7, 0x1

    .line 280
    sget-object v8, La/ra50;->a:La/ra50;

    .line 281
    .line 282
    invoke-direct/range {v4 .. v10}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 283
    .line 284
    .line 285
    invoke-direct {p0, v4}, La/ta50;-><init>(La/wkm;)V

    .line 286
    .line 287
    .line 288
    invoke-direct {v3, p0}, La/dmm;-><init>(La/wa50;)V

    .line 289
    .line 290
    .line 291
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 296
    .line 297
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 298
    .line 299
    .line 300
    move-result-wide v4

    .line 301
    const/4 v6, 0x0

    .line 302
    const/4 v7, 0x0

    .line 303
    invoke-direct/range {v0 .. v7}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 304
    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_1
    check-cast p1, La/h650;

    .line 308
    .line 309
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    iget-object p0, p0, La/p92;->c:La/n0o0;

    .line 313
    .line 314
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    check-cast p0, La/fee;

    .line 319
    .line 320
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    check-cast p0, Ljava/lang/Boolean;

    .line 325
    .line 326
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    if-eqz p0, :cond_a

    .line 331
    .line 332
    new-instance p0, La/jq5;

    .line 333
    .line 334
    invoke-direct {p0}, La/jq5;-><init>()V

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_a
    invoke-static {p1}, La/x2x;->n0(La/h650;)La/lq5;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    :goto_5
    return-object p0

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
