.class public final synthetic La/tsa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ata0;


# direct methods
.method public synthetic constructor <init>(La/ata0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tsa0;->a:B

    iput-object p1, p0, La/tsa0;->b:La/ata0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/tsa0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/tsa0;->b:La/ata0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-instance v0, La/jsa0;

    .line 16
    .line 17
    iget-object v2, p0, La/ata0;->D:La/ctf0;

    .line 18
    .line 19
    new-array v3, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 22
    .line 23
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v2, p1, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, La/jsa0;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/nsa0;

    .line 50
    .line 51
    iget-object v0, v0, La/nsa0;->b:La/pn00;

    .line 52
    .line 53
    instance-of v0, v0, La/in00;

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 58
    .line 59
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 60
    .line 61
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 69
    .line 70
    move-object v3, v1

    .line 71
    check-cast v3, La/nsa0;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v4, La/fn00;

    .line 77
    .line 78
    invoke-direct {v4, p1}, La/fn00;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    const/16 v11, 0x3fd

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    invoke-static/range {v3 .. v11}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v0, La/ssa0;

    .line 108
    .line 109
    invoke-direct {v0, p0, v1}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    new-instance p0, La/a1w0;

    .line 113
    .line 114
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, La/c8d;

    .line 124
    .line 125
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 126
    .line 127
    new-instance v0, La/v7d;

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, La/nsa0;

    .line 148
    .line 149
    iget-object v0, v0, La/nsa0;->c:La/pn00;

    .line 150
    .line 151
    instance-of v0, v0, La/in00;

    .line 152
    .line 153
    if-nez v0, :cond_3

    .line 154
    .line 155
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 156
    .line 157
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 158
    .line 159
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 167
    .line 168
    move-object v3, v1

    .line 169
    check-cast v3, La/nsa0;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    new-instance v5, La/fn00;

    .line 175
    .line 176
    invoke-direct {v5, p1}, La/fn00;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    const/4 v10, 0x0

    .line 180
    const/16 v11, 0x3fb

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v6, 0x0

    .line 184
    const/4 v7, 0x0

    .line 185
    const/4 v8, 0x0

    .line 186
    const/4 v9, 0x0

    .line 187
    invoke-static/range {v3 .. v11}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_2

    .line 196
    .line 197
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, La/nsa0;

    .line 210
    .line 211
    iget-object v0, v0, La/nsa0;->b:La/pn00;

    .line 212
    .line 213
    instance-of v0, v0, La/in00;

    .line 214
    .line 215
    if-nez v0, :cond_5

    .line 216
    .line 217
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 218
    .line 219
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 220
    .line 221
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 229
    .line 230
    move-object v3, v1

    .line 231
    check-cast v3, La/nsa0;

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v4, La/fn00;

    .line 237
    .line 238
    invoke-direct {v4, p1}, La/fn00;-><init>(Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    const/4 v10, 0x0

    .line 242
    const/16 v11, 0x3fd

    .line 243
    .line 244
    const/4 v5, 0x0

    .line 245
    const/4 v6, 0x0

    .line 246
    const/4 v7, 0x0

    .line 247
    const/4 v8, 0x0

    .line 248
    const/4 v9, 0x0

    .line 249
    invoke-static/range {v3 .. v11}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_4

    .line 258
    .line 259
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object p0

    .line 262
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 268
    .line 269
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 270
    .line 271
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 279
    .line 280
    move-object v3, v1

    .line 281
    check-cast v3, La/nsa0;

    .line 282
    .line 283
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    new-instance v6, La/fn00;

    .line 287
    .line 288
    invoke-direct {v6, p1}, La/fn00;-><init>(Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    const/4 v10, 0x0

    .line 292
    const/16 v11, 0x3ef

    .line 293
    .line 294
    const/4 v4, 0x0

    .line 295
    const/4 v5, 0x0

    .line 296
    const/4 v7, 0x0

    .line 297
    const/4 v8, 0x0

    .line 298
    const/4 v9, 0x0

    .line 299
    invoke-static/range {v3 .. v11}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_6

    .line 308
    .line 309
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
