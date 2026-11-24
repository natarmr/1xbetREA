.class public final synthetic La/zmz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/anz;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/anz;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zmz;->a:B

    iput-object p1, p0, La/zmz;->b:La/anz;

    iput-object p2, p0, La/zmz;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zmz;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x41000000    # 8.0f

    .line 8
    .line 9
    const/high16 v4, 0x41800000    # 16.0f

    .line 10
    .line 11
    sget-object v5, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    iget-object v9, v0, La/zmz;->c:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    iget-object v0, v0, La/zmz;->b:La/anz;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/y5d;

    .line 27
    .line 28
    move-object/from16 v15, p2

    .line 29
    .line 30
    check-cast v15, La/fet;

    .line 31
    .line 32
    move-object/from16 v10, p3

    .line 33
    .line 34
    check-cast v10, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    and-int/lit8 v1, v10, 0x11

    .line 44
    .line 45
    if-eq v1, v6, :cond_0

    .line 46
    .line 47
    move v1, v8

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v1, v7

    .line 50
    :goto_0
    and-int/lit8 v6, v10, 0x1

    .line 51
    .line 52
    invoke-virtual {v15, v6, v1}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-boolean v1, v0, La/anz;->d:Z

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    const v1, -0x25030466

    .line 63
    .line 64
    .line 65
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 66
    .line 67
    .line 68
    sget-object v1, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    invoke-static {v5, v4, v3}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    iget-object v1, v0, La/anz;->b:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v3, v0, La/anz;->c:Ljava/lang/String;

    .line 77
    .line 78
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const v4, 0x7f130b13

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v3, v15}, La/xsm0;->t(I[Ljava/lang/Object;La/fet;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v24

    .line 89
    new-instance v3, La/s7q0;

    .line 90
    .line 91
    const-string v4, ""

    .line 92
    .line 93
    invoke-direct {v3, v4}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v4, La/y5q0;

    .line 97
    .line 98
    const/4 v5, 0x3

    .line 99
    const/4 v6, 0x6

    .line 100
    const/4 v11, 0x0

    .line 101
    invoke-direct {v4, v5, v11, v11, v6}, La/y5q0;-><init>(ILa/vuu0;La/oie;I)V

    .line 102
    .line 103
    .line 104
    iget-boolean v0, v0, La/anz;->g:Z

    .line 105
    .line 106
    xor-int/lit8 v21, v0, 0x1

    .line 107
    .line 108
    new-instance v16, La/c6q0;

    .line 109
    .line 110
    const/16 v28, 0x0

    .line 111
    .line 112
    const v29, 0x3fc00

    .line 113
    .line 114
    .line 115
    sget-object v18, La/e6q0;->a:La/e6q0;

    .line 116
    .line 117
    sget-object v19, La/o6q0;->a:La/o6q0;

    .line 118
    .line 119
    const/16 v22, 0x0

    .line 120
    .line 121
    const/16 v25, 0x0

    .line 122
    .line 123
    const/16 v26, 0x0

    .line 124
    .line 125
    const/16 v27, 0x0

    .line 126
    .line 127
    move-object/from16 v17, v1

    .line 128
    .line 129
    move-object/from16 v20, v3

    .line 130
    .line 131
    move-object/from16 v23, v4

    .line 132
    .line 133
    invoke-direct/range {v16 .. v29}, La/c6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v15, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-nez v0, :cond_1

    .line 145
    .line 146
    if-ne v1, v2, :cond_2

    .line 147
    .line 148
    :cond_1
    new-instance v1, La/i1y;

    .line 149
    .line 150
    const/16 v0, 0x16

    .line 151
    .line 152
    invoke-direct {v1, v9, v0}, La/i1y;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_2
    move-object v14, v1

    .line 159
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 160
    .line 161
    move-object/from16 v11, v16

    .line 162
    .line 163
    const/16 v16, 0x0

    .line 164
    .line 165
    const/16 v17, 0xc

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    invoke-static/range {v10 .. v17}, La/wvb;->t(La/mm40;La/c6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_3
    const v0, -0x24f055ec

    .line 177
    .line 178
    .line 179
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_4
    invoke-virtual {v15}, La/fet;->X()V

    .line 187
    .line 188
    .line 189
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_0
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, La/y5d;

    .line 195
    .line 196
    move-object/from16 v13, p2

    .line 197
    .line 198
    check-cast v13, La/fet;

    .line 199
    .line 200
    move-object/from16 v10, p3

    .line 201
    .line 202
    check-cast v10, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    and-int/lit8 v1, v10, 0x11

    .line 212
    .line 213
    if-eq v1, v6, :cond_5

    .line 214
    .line 215
    move v7, v8

    .line 216
    :cond_5
    and-int/lit8 v1, v10, 0x1

    .line 217
    .line 218
    invoke-virtual {v13, v1, v7}, La/fet;->U(IZ)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_8

    .line 223
    .line 224
    const/high16 v1, 0x3f800000    # 1.0f

    .line 225
    .line 226
    invoke-static {v5, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    sget-object v5, La/qmk;->a:La/zcl;

    .line 231
    .line 232
    invoke-static {v1, v4, v3}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    new-instance v14, La/wul;

    .line 237
    .line 238
    sget-object v15, La/lul;->e:La/lul;

    .line 239
    .line 240
    sget-object v16, La/oe9;->a:La/oe9;

    .line 241
    .line 242
    new-instance v1, La/ue9;

    .line 243
    .line 244
    const v3, 0x7f1304d0

    .line 245
    .line 246
    .line 247
    invoke-static {v3, v13}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-direct {v1, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget-boolean v3, v0, La/anz;->f:Z

    .line 255
    .line 256
    iget-boolean v0, v0, La/anz;->g:Z

    .line 257
    .line 258
    const/16 v20, 0x0

    .line 259
    .line 260
    move/from16 v19, v0

    .line 261
    .line 262
    move-object/from16 v17, v1

    .line 263
    .line 264
    move/from16 v18, v3

    .line 265
    .line 266
    invoke-direct/range {v14 .. v20}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v13, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    if-nez v0, :cond_6

    .line 278
    .line 279
    if-ne v1, v2, :cond_7

    .line 280
    .line 281
    :cond_6
    new-instance v1, La/xwy;

    .line 282
    .line 283
    const/16 v0, 0x11

    .line 284
    .line 285
    invoke-direct {v1, v9, v0}, La/xwy;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_7
    move-object v12, v1

    .line 292
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 293
    .line 294
    move-object v11, v14

    .line 295
    const/4 v14, 0x0

    .line 296
    const/4 v15, 0x0

    .line 297
    invoke-static/range {v10 .. v15}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_8
    invoke-virtual {v13}, La/fet;->X()V

    .line 302
    .line 303
    .line 304
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
