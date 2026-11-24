.class public final synthetic La/igx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(JFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/igx;->a:B

    iput-wide p1, p0, La/igx;->b:J

    iput p3, p0, La/igx;->c:F

    iput-object p4, p0, La/igx;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/igx;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/igx;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/16 v5, 0x20

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    iget-wide v7, v0, La/igx;->b:J

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/zgx;

    .line 21
    .line 22
    move-object/from16 v10, p2

    .line 23
    .line 24
    check-cast v10, La/d4n;

    .line 25
    .line 26
    move-object/from16 v9, p3

    .line 27
    .line 28
    check-cast v9, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object/from16 v14, p4

    .line 34
    .line 35
    check-cast v14, La/fet;

    .line 36
    .line 37
    move-object/from16 v9, p5

    .line 38
    .line 39
    check-cast v9, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    and-int/lit8 v1, v9, 0x30

    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {v14, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    move v4, v5

    .line 62
    :cond_0
    or-int/2addr v9, v4

    .line 63
    :cond_1
    and-int/lit16 v1, v9, 0x411

    .line 64
    .line 65
    const/16 v4, 0x410

    .line 66
    .line 67
    if-eq v1, v4, :cond_2

    .line 68
    .line 69
    move v3, v6

    .line 70
    :cond_2
    and-int/lit8 v1, v9, 0x1

    .line 71
    .line 72
    invoke-virtual {v14, v1, v3}, La/fet;->U(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    sget-object v1, La/jd8;->n:La/ljc;

    .line 79
    .line 80
    invoke-static {v2, v7, v8, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v15

    .line 84
    const/16 v19, 0x0

    .line 85
    .line 86
    const/16 v20, 0xa

    .line 87
    .line 88
    iget v1, v0, La/igx;->c:F

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    move/from16 v18, v1

    .line 93
    .line 94
    move/from16 v16, v1

    .line 95
    .line 96
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    sget-object v2, La/kr00;->a:La/zfn;

    .line 101
    .line 102
    invoke-virtual {v14, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    and-int/lit8 v15, v9, 0x70

    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    iget-object v12, v0, La/igx;->d:Lkotlin/jvm/functions/Function1;

    .line 117
    .line 118
    iget-object v13, v0, La/igx;->e:Lkotlin/jvm/functions/Function1;

    .line 119
    .line 120
    move-object v9, v1

    .line 121
    invoke-static/range {v9 .. v16}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {v14}, La/fet;->X()V

    .line 126
    .line 127
    .line 128
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_0
    move-object/from16 v1, p1

    .line 132
    .line 133
    check-cast v1, La/zgx;

    .line 134
    .line 135
    move-object/from16 v10, p2

    .line 136
    .line 137
    check-cast v10, La/d4n;

    .line 138
    .line 139
    move-object/from16 v9, p3

    .line 140
    .line 141
    check-cast v9, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    move-object/from16 v14, p4

    .line 148
    .line 149
    check-cast v14, La/fet;

    .line 150
    .line 151
    move-object/from16 v11, p5

    .line 152
    .line 153
    check-cast v11, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    and-int/lit8 v12, v11, 0x6

    .line 166
    .line 167
    if-nez v12, :cond_5

    .line 168
    .line 169
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-eqz v12, :cond_4

    .line 174
    .line 175
    const/4 v12, 0x4

    .line 176
    goto :goto_1

    .line 177
    :cond_4
    const/4 v12, 0x2

    .line 178
    :goto_1
    or-int/2addr v12, v11

    .line 179
    goto :goto_2

    .line 180
    :cond_5
    move v12, v11

    .line 181
    :goto_2
    and-int/lit8 v13, v11, 0x30

    .line 182
    .line 183
    if-nez v13, :cond_7

    .line 184
    .line 185
    invoke-virtual {v14, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    if-eqz v13, :cond_6

    .line 190
    .line 191
    move v4, v5

    .line 192
    :cond_6
    or-int/2addr v12, v4

    .line 193
    :cond_7
    and-int/lit16 v4, v11, 0x180

    .line 194
    .line 195
    if-nez v4, :cond_9

    .line 196
    .line 197
    invoke-virtual {v14, v9}, La/fet;->e(I)Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-eqz v4, :cond_8

    .line 202
    .line 203
    const/16 v4, 0x100

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_8
    const/16 v4, 0x80

    .line 207
    .line 208
    :goto_3
    or-int/2addr v12, v4

    .line 209
    :cond_9
    and-int/lit16 v4, v12, 0x493

    .line 210
    .line 211
    const/16 v5, 0x492

    .line 212
    .line 213
    if-eq v4, v5, :cond_a

    .line 214
    .line 215
    move v3, v6

    .line 216
    :cond_a
    and-int/lit8 v4, v12, 0x1

    .line 217
    .line 218
    invoke-virtual {v14, v4, v3}, La/fet;->U(IZ)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_d

    .line 223
    .line 224
    sget-object v3, La/jd8;->n:La/ljc;

    .line 225
    .line 226
    invoke-static {v2, v7, v8, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const/high16 v3, 0x40000000    # 2.0f

    .line 231
    .line 232
    sget-object v4, La/qmk;->a:La/zcl;

    .line 233
    .line 234
    if-nez v9, :cond_b

    .line 235
    .line 236
    const/high16 v4, 0x41400000    # 12.0f

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_b
    move v4, v3

    .line 240
    :goto_4
    iget-object v1, v1, La/zgx;->b:La/a4x;

    .line 241
    .line 242
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-ne v9, v1, :cond_c

    .line 247
    .line 248
    const/high16 v3, 0x41000000    # 8.0f

    .line 249
    .line 250
    :cond_c
    iget v1, v0, La/igx;->c:F

    .line 251
    .line 252
    invoke-static {v2, v1, v4, v1, v3}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    sget-object v1, La/kr00;->a:La/zfn;

    .line 257
    .line 258
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    and-int/lit8 v15, v12, 0x70

    .line 269
    .line 270
    const/16 v16, 0x0

    .line 271
    .line 272
    iget-object v12, v0, La/igx;->d:Lkotlin/jvm/functions/Function1;

    .line 273
    .line 274
    iget-object v13, v0, La/igx;->e:Lkotlin/jvm/functions/Function1;

    .line 275
    .line 276
    invoke-static/range {v9 .. v16}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_d
    invoke-virtual {v14}, La/fet;->X()V

    .line 281
    .line 282
    .line 283
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object v0

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
