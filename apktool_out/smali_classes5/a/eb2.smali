.class public final La/eb2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hb2;


# direct methods
.method public synthetic constructor <init>(La/hb2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eb2;->a:B

    iput-object p1, p0, La/eb2;->b:La/hb2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eb2;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/eb2;->b:La/hb2;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 19
    .line 20
    sget v2, La/hb2;->E:I

    .line 21
    .line 22
    iget-object v14, v0, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v15, v14, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v15}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v3, v2

    .line 34
    move-object v2, v3

    .line 35
    check-cast v2, La/ab2;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v12, 0x0

    .line 41
    const v13, 0xfffb

    .line 42
    .line 43
    .line 44
    move-object v4, v3

    .line 45
    const/4 v3, 0x0

    .line 46
    move-object v6, v4

    .line 47
    const/4 v4, 0x0

    .line 48
    move-object v7, v6

    .line 49
    const/4 v6, 0x0

    .line 50
    move-object v8, v7

    .line 51
    const/4 v7, 0x0

    .line 52
    move-object v9, v8

    .line 53
    const/4 v8, 0x0

    .line 54
    move-object v10, v9

    .line 55
    const/4 v9, 0x0

    .line 56
    move-object v11, v10

    .line 57
    const/4 v10, 0x0

    .line 58
    move-object/from16 v16, v11

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    move-object/from16 p0, v1

    .line 62
    .line 63
    move-object/from16 v1, v16

    .line 64
    .line 65
    invoke-static/range {v2 .. v13}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v15, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    if-nez v5, :cond_1

    .line 76
    .line 77
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, La/ab2;

    .line 82
    .line 83
    iget-object v1, v1, La/ab2;->d:La/za2;

    .line 84
    .line 85
    instance-of v1, v1, La/ya2;

    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    iget-object v1, v14, La/ocj;->a:La/p7m0;

    .line 90
    .line 91
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-object v2, v0

    .line 99
    check-cast v2, La/ab2;

    .line 100
    .line 101
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v6, La/wa2;

    .line 105
    .line 106
    new-instance v3, Ljava/net/UnknownHostException;

    .line 107
    .line 108
    invoke-direct {v3}, Ljava/net/UnknownHostException;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-direct {v6, v3}, La/wa2;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    const/4 v12, 0x0

    .line 115
    const v13, 0xffef

    .line 116
    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v9, 0x0

    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v11, 0x0

    .line 126
    invoke-static/range {v2 .. v13}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_0

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_1
    if-eqz v5, :cond_5

    .line 138
    .line 139
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, La/ab2;

    .line 144
    .line 145
    iget-object v1, v1, La/ab2;->d:La/za2;

    .line 146
    .line 147
    instance-of v1, v1, La/xa2;

    .line 148
    .line 149
    if-eqz v1, :cond_4

    .line 150
    .line 151
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, La/ab2;

    .line 156
    .line 157
    iget-object v1, v1, La/ab2;->d:La/za2;

    .line 158
    .line 159
    instance-of v2, v1, La/xa2;

    .line 160
    .line 161
    if-eqz v2, :cond_2

    .line 162
    .line 163
    check-cast v1, La/xa2;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_2
    const/4 v1, 0x0

    .line 167
    :goto_1
    if-eqz v1, :cond_5

    .line 168
    .line 169
    iget-object v1, v1, La/xa2;->a:Ljava/util/Date;

    .line 170
    .line 171
    if-eqz v1, :cond_5

    .line 172
    .line 173
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, La/ab2;

    .line 178
    .line 179
    iget-object v2, v2, La/ab2;->b:Ljava/util/Date;

    .line 180
    .line 181
    if-nez v2, :cond_3

    .line 182
    .line 183
    new-instance v2, Ljava/util/Date;

    .line 184
    .line 185
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 186
    .line 187
    .line 188
    :cond_3
    invoke-static {v1, v2}, La/ntb;->V(Ljava/util/Date;Ljava/util/Date;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_5

    .line 193
    .line 194
    :cond_4
    const/4 v1, 0x0

    .line 195
    invoke-virtual {v0, v1}, La/hb2;->M(Z)V

    .line 196
    .line 197
    .line 198
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0

    .line 201
    :cond_6
    move-object/from16 v1, p0

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :pswitch_0
    move-object/from16 v3, p1

    .line 206
    .line 207
    check-cast v3, Ljava/util/Date;

    .line 208
    .line 209
    sget v1, La/hb2;->E:I

    .line 210
    .line 211
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 212
    .line 213
    iget-object v13, v1, La/ocj;->a:La/p7m0;

    .line 214
    .line 215
    :cond_7
    invoke-virtual {v13}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 223
    .line 224
    move-object v2, v1

    .line 225
    move-object v1, v14

    .line 226
    check-cast v1, La/ab2;

    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    const/4 v11, 0x0

    .line 232
    const v12, 0xfffd

    .line 233
    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    const/4 v4, 0x0

    .line 237
    const/4 v5, 0x0

    .line 238
    const/4 v6, 0x0

    .line 239
    const/4 v7, 0x0

    .line 240
    const/4 v8, 0x0

    .line 241
    const/4 v9, 0x0

    .line 242
    const/4 v10, 0x0

    .line 243
    invoke-static/range {v1 .. v12}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v13, v14, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_7

    .line 252
    .line 253
    iget-object v0, v0, La/hb2;->o:La/vzg0;

    .line 254
    .line 255
    const-string v1, "KEY_CURRENT_DATE"

    .line 256
    .line 257
    invoke-virtual {v0, v1, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_1
    move-object/from16 v1, p1

    .line 264
    .line 265
    check-cast v1, La/k2g0;

    .line 266
    .line 267
    iget-object v2, v0, La/hb2;->o:La/vzg0;

    .line 268
    .line 269
    const-string v3, "EXPANDED_IDS_KEY"

    .line 270
    .line 271
    iget-object v4, v1, La/k2g0;->d:Ljava/util/Set;

    .line 272
    .line 273
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 277
    .line 278
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 279
    .line 280
    :cond_8
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 288
    .line 289
    move-object v5, v3

    .line 290
    check-cast v5, La/ab2;

    .line 291
    .line 292
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    iget-object v15, v1, La/k2g0;->d:Ljava/util/Set;

    .line 296
    .line 297
    const v16, 0xdfff

    .line 298
    .line 299
    .line 300
    const/4 v6, 0x0

    .line 301
    const/4 v7, 0x0

    .line 302
    const/4 v8, 0x0

    .line 303
    const/4 v9, 0x0

    .line 304
    const/4 v10, 0x0

    .line 305
    const/4 v11, 0x0

    .line 306
    const/4 v12, 0x0

    .line 307
    const/4 v13, 0x0

    .line 308
    const/4 v14, 0x0

    .line 309
    invoke-static/range {v5 .. v16}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_8

    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
