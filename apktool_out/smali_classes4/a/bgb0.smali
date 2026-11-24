.class public final synthetic La/bgb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kgb0;


# direct methods
.method public synthetic constructor <init>(La/kgb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bgb0;->a:B

    iput-object p1, p0, La/bgb0;->b:La/kgb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bgb0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/bgb0;->b:La/kgb0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    check-cast v2, Ljava/lang/Throwable;

    .line 16
    .line 17
    sget v3, La/kgb0;->k0:I

    .line 18
    .line 19
    iget-object v3, v0, La/i3t0;->i:La/ocj;

    .line 20
    .line 21
    iget-object v4, v3, La/ocj;->a:La/p7m0;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, La/ufb0;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v14, La/xee;

    .line 37
    .line 38
    invoke-direct {v14, v2}, La/xee;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const/16 v16, 0x0

    .line 42
    .line 43
    const/16 v17, 0xdff

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v15, 0x0

    .line 54
    invoke-static/range {v5 .. v17}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v4, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 65
    .line 66
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-object v4, v3

    .line 74
    check-cast v4, La/ufb0;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v15, La/xee;

    .line 80
    .line 81
    invoke-direct {v15, v2}, La/xee;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    const/16 v16, 0x7ff

    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x0

    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    invoke-static/range {v4 .. v16}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v0, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_1

    .line 105
    .line 106
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_0
    move-object/from16 v1, p1

    .line 110
    .line 111
    check-cast v1, Ljava/lang/Throwable;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 117
    .line 118
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 119
    .line 120
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 128
    .line 129
    move-object v5, v3

    .line 130
    check-cast v5, La/ufb0;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v13, La/xee;

    .line 136
    .line 137
    invoke-direct {v13, v1}, La/xee;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    const/16 v16, 0x0

    .line 141
    .line 142
    const/16 v17, 0xeff

    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    const/4 v11, 0x0

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    invoke-static/range {v5 .. v17}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_2

    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_1
    move-object/from16 v1, p1

    .line 167
    .line 168
    check-cast v1, Ljava/util/List;

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, La/kgb0;->R()V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_2
    move-object/from16 v1, p1

    .line 180
    .line 181
    check-cast v1, La/k0w0;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, La/kgb0;->T:La/uf3;

    .line 187
    .line 188
    iget-object v0, v0, La/uf3;->a:La/oct;

    .line 189
    .line 190
    invoke-virtual {v0}, La/oct;->d()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, La/c8d;

    .line 201
    .line 202
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 203
    .line 204
    new-instance v3, La/v7d;

    .line 205
    .line 206
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 207
    .line 208
    .line 209
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 210
    .line 211
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_3
    move-object/from16 v1, p1

    .line 215
    .line 216
    check-cast v1, La/k0w0;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object v0, v0, La/kgb0;->T:La/uf3;

    .line 222
    .line 223
    iget-object v0, v0, La/uf3;->a:La/oct;

    .line 224
    .line 225
    invoke-virtual {v0}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, La/c8d;

    .line 236
    .line 237
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 238
    .line 239
    new-instance v3, La/v7d;

    .line 240
    .line 241
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 242
    .line 243
    .line 244
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_4
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, Ljava/lang/Throwable;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 257
    .line 258
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 259
    .line 260
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 268
    .line 269
    move-object v5, v3

    .line 270
    check-cast v5, La/ufb0;

    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v14, La/xee;

    .line 276
    .line 277
    invoke-direct {v14, v1}, La/xee;-><init>(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    const/16 v16, 0x0

    .line 281
    .line 282
    const/16 v17, 0xdff

    .line 283
    .line 284
    const/4 v6, 0x0

    .line 285
    const/4 v7, 0x0

    .line 286
    const/4 v8, 0x0

    .line 287
    const/4 v9, 0x0

    .line 288
    const/4 v10, 0x0

    .line 289
    const/4 v11, 0x0

    .line 290
    const/4 v12, 0x0

    .line 291
    const/4 v13, 0x0

    .line 292
    const/4 v15, 0x0

    .line 293
    invoke-static/range {v5 .. v17}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_3

    .line 302
    .line 303
    invoke-virtual {v0, v1}, La/kgb0;->Q(Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
