.class public final synthetic La/pw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rw;


# direct methods
.method public synthetic constructor <init>(La/rw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pw;->a:B

    iput-object p1, p0, La/pw;->b:La/rw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pw;->a:B

    .line 4
    .line 5
    const v2, 0x7f130450

    .line 6
    .line 7
    .line 8
    const-string v3, ")"

    .line 9
    .line 10
    const-string v4, " ("

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    iget-object v0, v0, La/pw;->b:La/rw;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/xuf;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-boolean v6, v1, La/xuf;->o:Z

    .line 26
    .line 27
    if-nez v6, :cond_0

    .line 28
    .line 29
    iget-object v0, v1, La/xuf;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, v1, La/xuf;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v4, v2, v3}, La/kng0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, v0, La/rw;->b:La/ctf0;

    .line 39
    .line 40
    new-array v3, v5, [Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 43
    .line 44
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v0, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_0
    iget-wide v1, v1, La/xuf;->a:J

    .line 53
    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    cmp-long v3, v1, v3

    .line 57
    .line 58
    const v4, 0x7f0809b6

    .line 59
    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    new-instance v3, La/n0x;

    .line 65
    .line 66
    const-string v6, "android"

    .line 67
    .line 68
    const-string v7, "icons_currency"

    .line 69
    .line 70
    const-string v8, "static"

    .line 71
    .line 72
    const-string v9, "img"

    .line 73
    .line 74
    invoke-static {v8, v9, v6, v7}, La/rz4;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const-string v7, ".svg"

    .line 79
    .line 80
    invoke-static {v1, v2, v7, v6}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v6, La/bzu;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v3, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    move-object v9, v3

    .line 95
    goto :goto_2

    .line 96
    :cond_1
    new-instance v3, La/m0x;

    .line 97
    .line 98
    const/4 v1, 0x6

    .line 99
    invoke-direct {v3, v4, v5, v1}, La/m0x;-><init>(ILa/bzw;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :goto_2
    new-instance v6, La/nui0;

    .line 104
    .line 105
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 110
    .line 111
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 116
    .line 117
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    new-instance v10, La/y3d;

    .line 122
    .line 123
    invoke-direct {v10, v1, v2}, La/y3d;-><init>(J)V

    .line 124
    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/16 v14, 0xf2

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v12, 0x0

    .line 132
    invoke-direct/range {v6 .. v14}, La/nui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;La/y3d;La/rc5;FI)V

    .line 133
    .line 134
    .line 135
    new-instance v11, La/tui0;

    .line 136
    .line 137
    invoke-direct {v11, v0, v5}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 138
    .line 139
    .line 140
    new-instance v13, La/fvi0;

    .line 141
    .line 142
    invoke-direct {v13, v5}, La/fvi0;-><init>(La/y3d;)V

    .line 143
    .line 144
    .line 145
    sget-object v16, La/wui0;->a:La/wui0;

    .line 146
    .line 147
    new-instance v10, La/rqm;

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    const/16 v19, 0x198

    .line 152
    .line 153
    const/4 v14, 0x0

    .line 154
    sget-object v15, La/qvi0;->a:La/qvi0;

    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    move-object v12, v6

    .line 159
    invoke-direct/range {v10 .. v19}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 160
    .line 161
    .line 162
    return-object v10

    .line 163
    :pswitch_0
    move-object/from16 v1, p1

    .line 164
    .line 165
    check-cast v1, La/qw;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v7, v1, La/qw;->a:Ljava/lang/String;

    .line 171
    .line 172
    iget-boolean v2, v1, La/qw;->b:Z

    .line 173
    .line 174
    if-eqz v2, :cond_2

    .line 175
    .line 176
    new-instance v2, La/s7q0;

    .line 177
    .line 178
    iget-object v3, v1, La/qw;->c:Ljava/lang/String;

    .line 179
    .line 180
    invoke-direct {v2, v3}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :goto_3
    move-object v10, v2

    .line 184
    goto :goto_4

    .line 185
    :cond_2
    sget-object v2, La/r7q0;->a:La/r7q0;

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :goto_4
    iget-object v0, v0, La/rw;->b:La/ctf0;

    .line 189
    .line 190
    new-array v2, v5, [Ljava/lang/Object;

    .line 191
    .line 192
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 193
    .line 194
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const v3, 0x7f1307a6

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    iget-boolean v12, v1, La/qw;->b:Z

    .line 206
    .line 207
    new-instance v6, La/c6q0;

    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    const v19, 0x3fd80

    .line 212
    .line 213
    .line 214
    sget-object v8, La/e6q0;->a:La/e6q0;

    .line 215
    .line 216
    sget-object v9, La/o6q0;->a:La/o6q0;

    .line 217
    .line 218
    const/4 v11, 0x1

    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    invoke-direct/range {v6 .. v19}, La/c6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 226
    .line 227
    .line 228
    return-object v6

    .line 229
    :pswitch_1
    move-object/from16 v1, p1

    .line 230
    .line 231
    check-cast v1, Ljava/lang/Boolean;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    iget-object v0, v0, La/rw;->b:La/ctf0;

    .line 238
    .line 239
    new-array v1, v5, [Ljava/lang/Object;

    .line 240
    .line 241
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 242
    .line 243
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    const v2, 0x7f13006b

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v1, La/mtl;

    .line 255
    .line 256
    new-instance v2, La/itl;

    .line 257
    .line 258
    new-instance v6, La/wul;

    .line 259
    .line 260
    sget-object v7, La/lul;->e:La/lul;

    .line 261
    .line 262
    sget-object v8, La/oe9;->a:La/oe9;

    .line 263
    .line 264
    new-instance v9, La/ue9;

    .line 265
    .line 266
    invoke-direct {v9, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    const/4 v11, 0x0

    .line 270
    const/4 v12, 0x1

    .line 271
    invoke-direct/range {v6 .. v12}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 272
    .line 273
    .line 274
    sget-object v0, La/rk;->c:La/rk;

    .line 275
    .line 276
    invoke-direct {v2, v6, v0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 277
    .line 278
    .line 279
    filled-new-array {v2}, [La/itl;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-direct {v1, v0}, La/mtl;-><init>(La/a4x;)V

    .line 288
    .line 289
    .line 290
    return-object v1

    .line 291
    :pswitch_2
    move-object/from16 v1, p1

    .line 292
    .line 293
    check-cast v1, La/xuf;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-boolean v6, v1, La/xuf;->o:Z

    .line 299
    .line 300
    if-nez v6, :cond_3

    .line 301
    .line 302
    iget-object v0, v1, La/xuf;->c:Ljava/lang/String;

    .line 303
    .line 304
    iget-object v1, v1, La/xuf;->b:Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {v0, v4, v1, v3}, La/kng0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    goto :goto_5

    .line 311
    :cond_3
    iget-object v0, v0, La/rw;->b:La/ctf0;

    .line 312
    .line 313
    new-array v1, v5, [Ljava/lang/Object;

    .line 314
    .line 315
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 316
    .line 317
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    :goto_5
    return-object v0

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
