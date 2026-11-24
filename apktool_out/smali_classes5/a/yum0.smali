.class public abstract La/yum0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILa/fet;Lkotlin/jvm/functions/Function0;)V
    .locals 24

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v2, 0x1285d06

    .line 11
    .line 12
    .line 13
    invoke-virtual {v13, v2}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p1 .. p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x2

    .line 21
    const/4 v4, 0x4

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v3

    .line 27
    :goto_0
    or-int/2addr v2, v0

    .line 28
    and-int/lit8 v5, v2, 0x3

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-eq v5, v3, :cond_1

    .line 33
    .line 34
    move v3, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v3, v7

    .line 37
    :goto_1
    and-int/lit8 v5, v2, 0x1

    .line 38
    .line 39
    invoke-virtual {v13, v5, v3}, La/fet;->U(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_5

    .line 44
    .line 45
    sget-object v3, La/qmk;->a:La/zcl;

    .line 46
    .line 47
    const/high16 v18, 0x41000000    # 8.0f

    .line 48
    .line 49
    const/16 v19, 0x7

    .line 50
    .line 51
    sget-object v14, La/jm40;->b:La/jm40;

    .line 52
    .line 53
    const/4 v15, 0x0

    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    new-instance v14, La/imm;

    .line 63
    .line 64
    new-instance v15, La/ilm;

    .line 65
    .line 66
    sget-object v5, La/m8m0;->a:La/zfn;

    .line 67
    .line 68
    invoke-virtual {v13, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 73
    .line 74
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 75
    .line 76
    .line 77
    move-result-wide v8

    .line 78
    invoke-direct {v15, v8, v9}, La/ilm;-><init>(J)V

    .line 79
    .line 80
    .line 81
    new-instance v16, La/olm;

    .line 82
    .line 83
    const v8, 0x7f131629

    .line 84
    .line 85
    .line 86
    invoke-static {v8, v13}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v17

    .line 90
    const v8, 0x7f13161b

    .line 91
    .line 92
    .line 93
    invoke-static {v8, v13}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v18

    .line 97
    invoke-virtual {v13, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 102
    .line 103
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 104
    .line 105
    .line 106
    move-result-wide v19

    .line 107
    invoke-virtual {v13, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 112
    .line 113
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 114
    .line 115
    .line 116
    move-result-wide v21

    .line 117
    sget-object v23, La/fa50;->a:La/fa50;

    .line 118
    .line 119
    invoke-direct/range {v16 .. v23}, La/olm;-><init>(Ljava/lang/String;Ljava/lang/String;JJLa/ga50;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v13, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 127
    .line 128
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 129
    .line 130
    .line 131
    move-result-wide v18

    .line 132
    const/16 v20, 0x0

    .line 133
    .line 134
    const/16 v21, 0x0

    .line 135
    .line 136
    sget-object v17, La/fmm;->a:La/fmm;

    .line 137
    .line 138
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 139
    .line 140
    .line 141
    and-int/lit8 v2, v2, 0xe

    .line 142
    .line 143
    if-ne v2, v4, :cond_2

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    move v6, v7

    .line 147
    :goto_2
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-nez v6, :cond_3

    .line 152
    .line 153
    sget-object v4, La/ukd;->a:La/cl5;

    .line 154
    .line 155
    if-ne v2, v4, :cond_4

    .line 156
    .line 157
    :cond_3
    new-instance v2, La/xhl0;

    .line 158
    .line 159
    const/16 v4, 0xf

    .line 160
    .line 161
    invoke-direct {v2, v1, v4}, La/xhl0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_4
    move-object v4, v2

    .line 168
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 169
    .line 170
    sget-object v12, La/jar0;->f:La/ugd;

    .line 171
    .line 172
    const/16 v15, 0x30

    .line 173
    .line 174
    const/16 v16, 0x7f4

    .line 175
    .line 176
    move-object v1, v3

    .line 177
    const/4 v3, 0x0

    .line 178
    const/4 v5, 0x0

    .line 179
    const/4 v6, 0x0

    .line 180
    const/4 v7, 0x0

    .line 181
    const/4 v8, 0x0

    .line 182
    const/4 v9, 0x0

    .line 183
    const/4 v10, 0x0

    .line 184
    const/4 v11, 0x0

    .line 185
    move-object v2, v14

    .line 186
    const/4 v14, 0x0

    .line 187
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    invoke-virtual/range {p1 .. p1}, La/fet;->X()V

    .line 192
    .line 193
    .line 194
    :goto_3
    invoke-virtual/range {p1 .. p1}, La/fet;->u()La/yfe0;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-eqz v1, :cond_6

    .line 199
    .line 200
    new-instance v2, La/wr4;

    .line 201
    .line 202
    const/16 v3, 0xb

    .line 203
    .line 204
    move-object/from16 v4, p2

    .line 205
    .line 206
    invoke-direct {v2, v3, v0, v4}, La/wr4;-><init>(BILkotlin/jvm/functions/Function0;)V

    .line 207
    .line 208
    .line 209
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 210
    .line 211
    :cond_6
    return-void
.end method

.method public static final b(La/mm40;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V
    .locals 11

    .line 1
    const v0, -0x649ec8fc

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    or-int/lit8 v0, p4, 0x36

    .line 8
    .line 9
    invoke-virtual {p3, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x100

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x80

    .line 19
    .line 20
    :goto_0
    or-int/2addr v0, v1

    .line 21
    and-int/lit16 v1, v0, 0x493

    .line 22
    .line 23
    const/16 v2, 0x492

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x1

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    move v1, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v3

    .line 32
    :goto_1
    and-int/2addr v0, v4

    .line 33
    invoke-virtual {p3, v0, v1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_11

    .line 38
    .line 39
    sget-object p0, La/ps00;->a:La/zfn;

    .line 40
    .line 41
    invoke-virtual {p3, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/mwv0;

    .line 46
    .line 47
    if-eqz p0, :cond_10

    .line 48
    .line 49
    const v0, 0x47efb414

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 53
    .line 54
    .line 55
    sget-object v0, La/bmd;->h:La/zfn;

    .line 56
    .line 57
    invoke-virtual {p3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v5, v0

    .line 62
    check-cast v5, La/w6k;

    .line 63
    .line 64
    sget-object v0, La/bmd;->u:La/zfn;

    .line 65
    .line 66
    invoke-virtual {p3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, La/rhv0;

    .line 71
    .line 72
    check-cast v0, La/yez;

    .line 73
    .line 74
    invoke-virtual {v0}, La/yez;->b()J

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    sget-object v0, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 79
    .line 80
    invoke-static {p3}, La/zcm0;->i(La/fet;)La/djv0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v0, v0, La/djv0;->e:La/q33;

    .line 85
    .line 86
    invoke-virtual {v0}, La/q33;->e()La/pfx;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget v8, v0, La/pfx;->d:I

    .line 91
    .line 92
    invoke-static {p3}, La/zcm0;->i(La/fet;)La/djv0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v0, v0, La/djv0;->f:La/q33;

    .line 97
    .line 98
    invoke-virtual {v0}, La/q33;->e()La/pfx;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget v9, v0, La/pfx;->b:I

    .line 103
    .line 104
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sget-object v1, La/ukd;->a:La/cl5;

    .line 109
    .line 110
    if-ne v0, v1, :cond_2

    .line 111
    .line 112
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 113
    .line 114
    invoke-static {v0, p3}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p3, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    move-object v10, v0

    .line 122
    check-cast v10, La/vne;

    .line 123
    .line 124
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v1, :cond_3

    .line 129
    .line 130
    new-instance v0, La/wwv0;

    .line 131
    .line 132
    invoke-direct {v0}, La/wwv0;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    check-cast v0, La/wwv0;

    .line 142
    .line 143
    new-instance v4, La/euv0;

    .line 144
    .line 145
    invoke-direct/range {v4 .. v10}, La/euv0;-><init>(La/w6k;JIILa/vne;)V

    .line 146
    .line 147
    .line 148
    new-array v2, v3, [Ljava/lang/Object;

    .line 149
    .line 150
    sget-object v5, La/zwv0;->a:La/v0h0;

    .line 151
    .line 152
    invoke-virtual {p3, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    invoke-virtual {p3, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    or-int/2addr v6, v7

    .line 161
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    if-nez v6, :cond_4

    .line 166
    .line 167
    if-ne v7, v1, :cond_5

    .line 168
    .line 169
    :cond_4
    new-instance v7, La/ugu0;

    .line 170
    .line 171
    const/16 v6, 0xa

    .line 172
    .line 173
    invoke-direct {v7, v0, v4, v6}, La/ugu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p3, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_5
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 180
    .line 181
    invoke-static {v2, v5, v7, p3, v3}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, La/ywv0;

    .line 186
    .line 187
    invoke-virtual {p3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {p3, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    or-int/2addr v2, v5

    .line 196
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    if-nez v2, :cond_6

    .line 201
    .line 202
    if-ne v5, v1, :cond_7

    .line 203
    .line 204
    :cond_6
    new-instance v5, La/ugu0;

    .line 205
    .line 206
    const/16 v2, 0xb

    .line 207
    .line 208
    invoke-direct {v5, v0, v4, v2}, La/ugu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p3, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 215
    .line 216
    invoke-static {v5, p3}, La/m0x0;->D(Lkotlin/jvm/functions/Function0;La/fet;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    if-nez v2, :cond_8

    .line 228
    .line 229
    if-ne v4, v1, :cond_9

    .line 230
    .line 231
    :cond_8
    new-instance v4, La/gtv0;

    .line 232
    .line 233
    const/4 v2, 0x4

    .line 234
    invoke-direct {v4, v0, v2}, La/gtv0;-><init>(La/ywv0;B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_9
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 241
    .line 242
    invoke-static {v0, v4, p3}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p3, v3}, La/fet;->r(Z)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    invoke-virtual {p3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    or-int/2addr v2, v3

    .line 257
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    if-nez v2, :cond_a

    .line 262
    .line 263
    if-ne v3, v1, :cond_b

    .line 264
    .line 265
    :cond_a
    new-instance v3, La/zfv0;

    .line 266
    .line 267
    const/16 v2, 0xf

    .line 268
    .line 269
    invoke-direct {v3, p0, v0, v2}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p3, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 276
    .line 277
    invoke-static {v0, p0, v3, p3}, La/m0x0;->n(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    or-int/2addr v2, v3

    .line 289
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    const/4 v4, 0x0

    .line 294
    if-nez v2, :cond_c

    .line 295
    .line 296
    if-ne v3, v1, :cond_d

    .line 297
    .line 298
    :cond_c
    new-instance v3, La/wbl0;

    .line 299
    .line 300
    const/16 v2, 0x13

    .line 301
    .line 302
    invoke-direct {v3, p0, v0, v4, v2}, La/wbl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p3, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_d
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 309
    .line 310
    invoke-static {p3, v0, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    if-nez v2, :cond_e

    .line 322
    .line 323
    if-ne v3, v1, :cond_f

    .line 324
    .line 325
    :cond_e
    new-instance v3, La/m91;

    .line 326
    .line 327
    const/16 v1, 0x1a

    .line 328
    .line 329
    invoke-direct {v3, p0, v4, v1}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p3, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 336
    .line 337
    const/16 p0, 0x6006

    .line 338
    .line 339
    invoke-static {v0, v3, p2, p3, p0}, La/tlb;->j(La/ywv0;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 340
    .line 341
    .line 342
    sget-object p0, La/jm40;->b:La/jm40;

    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_10
    new-instance p0, La/tiu0;

    .line 346
    .line 347
    const-string p1, "XBottomSheetScreen \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c \u0445\u043e\u0441\u0442\u043e\u043c \u0441\u0446\u0435\u043d\u044b \u043d\u0430\u0432\u0438\u0433\u0430\u0446\u0438\u0438, \u043f\u0440\u0435\u0434\u043e\u0441\u0442\u0430\u0432\u043b\u044f\u044e\u0449\u0435\u0439 LocalXBottomSheetSceneState"

    .line 348
    .line 349
    invoke-direct {p0, p1, v4}, La/tiu0;-><init>(Ljava/lang/String;B)V

    .line 350
    .line 351
    .line 352
    throw p0

    .line 353
    :cond_11
    invoke-virtual {p3}, La/fet;->X()V

    .line 354
    .line 355
    .line 356
    :goto_2
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 357
    .line 358
    .line 359
    move-result-object p3

    .line 360
    if-eqz p3, :cond_12

    .line 361
    .line 362
    new-instance v0, La/gdr0;

    .line 363
    .line 364
    invoke-direct {v0, p0, p1, p2, p4}, La/gdr0;-><init>(La/mm40;Lkotlin/jvm/functions/Function1;La/ugd;I)V

    .line 365
    .line 366
    .line 367
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 368
    .line 369
    :cond_12
    return-void
.end method

.method public static final c(La/lc00;La/ctf0;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, La/ar40;->c:La/ar40;

    .line 2
    .line 3
    const-string v1, "WhoWin"

    .line 4
    .line 5
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const v1, 0x7f131327

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v1, v0, p2}, La/m2x;->t(La/ctf0;ILa/ar40;Ljava/lang/Object;)La/br40;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final d(La/f2h;)La/e2z;
    .locals 4

    .line 1
    new-instance v0, La/e2z;

    .line 2
    .line 3
    iget-object p0, p0, La/f2h;->d:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p0, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    :goto_0
    const-string p0, ""

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const-string v1, "playerlogo/"

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v1, "%s/%s"

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const-string v1, "%s/playerlogo/%s"

    .line 49
    .line 50
    :goto_1
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 51
    .line 52
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 53
    .line 54
    filled-new-array {v3, p0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {v2, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :goto_2
    invoke-direct {v0, p0}, La/e2z;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public static final e(JLjava/util/List;)La/dao;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/sx3;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p2, v1}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/f8l0;

    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-direct {p2, v1}, La/f8l0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p2}, La/pgi0;->k(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance v0, La/f8l0;

    .line 22
    .line 23
    const/16 v1, 0x11

    .line 24
    .line 25
    invoke-direct {v0, v1}, La/f8l0;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2, v0}, La/pgi0;->k(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    new-instance v0, La/f8l0;

    .line 33
    .line 34
    const/16 v1, 0x12

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/f8l0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2, v0}, La/pgi0;->k(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v0, La/bkq;

    .line 44
    .line 45
    invoke-direct {v0, p2}, La/bkq;-><init>(La/ckq;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {v0}, La/bkq;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, La/bkq;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    move-object v1, p2

    .line 59
    check-cast v1, La/dao;

    .line 60
    .line 61
    iget-object v1, v1, La/dao;->m:La/sh7;

    .line 62
    .line 63
    iget-wide v1, v1, La/sh7;->a:J

    .line 64
    .line 65
    cmp-long v1, v1, p0

    .line 66
    .line 67
    if-nez v1, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/4 p2, 0x0

    .line 71
    :goto_0
    check-cast p2, La/dao;

    .line 72
    .line 73
    return-object p2
.end method

.method public static f(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    check-cast p0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return-object v1
.end method

.method public static final g(La/ou90;ILa/nls0;La/a9q0;ZI)La/jge0;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p2, p2, La/nls0;->b:La/qe60;

    .line 4
    .line 5
    invoke-interface {p2, p1}, La/qe60;->s(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p3, p1}, La/a9q0;->c(I)La/jge0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object p1, La/jge0;->e:La/jge0;

    .line 15
    .line 16
    :goto_0
    const/high16 p2, 0x40000000    # 2.0f

    .line 17
    .line 18
    invoke-interface {p0, p2}, La/w6k;->T(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iget p2, p1, La/jge0;->a:F

    .line 23
    .line 24
    if-eqz p4, :cond_1

    .line 25
    .line 26
    int-to-float p3, p5

    .line 27
    sub-float/2addr p3, p2

    .line 28
    int-to-float v0, p0

    .line 29
    sub-float/2addr p3, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move p3, p2

    .line 32
    :goto_1
    if-eqz p4, :cond_2

    .line 33
    .line 34
    int-to-float p0, p5

    .line 35
    sub-float/2addr p0, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    int-to-float p0, p0

    .line 38
    add-float/2addr p0, p2

    .line 39
    :goto_2
    const/16 p2, 0xa

    .line 40
    .line 41
    invoke-static {p1, p3, p0, p2}, La/jge0;->b(La/jge0;FFI)La/jge0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static h(II)I
    .locals 1

    .line 1
    const/16 v0, -0xc

    .line 2
    .line 3
    if-gt p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, -0x41

    .line 6
    .line 7
    if-le p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    shl-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    xor-int/2addr p0, p1

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public static i([BII)I
    .locals 5

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    aget-byte v0, p0, v0

    .line 4
    .line 5
    sub-int/2addr p2, p1

    .line 6
    const/4 v1, -0x1

    .line 7
    const/16 v2, -0xc

    .line 8
    .line 9
    if-eqz p2, :cond_4

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq p2, v3, :cond_3

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    if-ne p2, v4, :cond_2

    .line 16
    .line 17
    aget-byte p2, p0, p1

    .line 18
    .line 19
    add-int/2addr p1, v3

    .line 20
    aget-byte p0, p0, p1

    .line 21
    .line 22
    if-gt v0, v2, :cond_1

    .line 23
    .line 24
    const/16 p1, -0x41

    .line 25
    .line 26
    if-gt p2, p1, :cond_1

    .line 27
    .line 28
    if-le p0, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    shl-int/lit8 p1, p2, 0x8

    .line 32
    .line 33
    xor-int/2addr p1, v0

    .line 34
    shl-int/lit8 p0, p0, 0x10

    .line 35
    .line 36
    xor-int/2addr p0, p1

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    return v1

    .line 39
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_3
    aget-byte p0, p0, p1

    .line 46
    .line 47
    invoke-static {v0, p0}, La/yum0;->h(II)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_4
    if-le v0, v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    return v0
.end method

.method public static final j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string p0, ":"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " "

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static k([BII)I
    .locals 7

    .line 1
    :goto_0
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-lt p1, p2, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    :goto_1
    if-lt p1, p2, :cond_2

    .line 15
    .line 16
    return v0

    .line 17
    :cond_2
    add-int/lit8 v1, p1, 0x1

    .line 18
    .line 19
    aget-byte v2, p0, p1

    .line 20
    .line 21
    if-gez v2, :cond_b

    .line 22
    .line 23
    const/16 v3, -0x20

    .line 24
    .line 25
    const/16 v4, -0x41

    .line 26
    .line 27
    if-ge v2, v3, :cond_4

    .line 28
    .line 29
    if-lt v1, p2, :cond_3

    .line 30
    .line 31
    return v2

    .line 32
    :cond_3
    const/16 v3, -0x3e

    .line 33
    .line 34
    if-lt v2, v3, :cond_a

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x2

    .line 37
    .line 38
    aget-byte v1, p0, v1

    .line 39
    .line 40
    if-le v1, v4, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_4
    const/16 v5, -0x10

    .line 44
    .line 45
    if-ge v2, v5, :cond_8

    .line 46
    .line 47
    add-int/lit8 v5, p2, -0x1

    .line 48
    .line 49
    if-lt v1, v5, :cond_5

    .line 50
    .line 51
    invoke-static {p0, v1, p2}, La/yum0;->i([BII)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0

    .line 56
    :cond_5
    add-int/lit8 v5, p1, 0x2

    .line 57
    .line 58
    aget-byte v1, p0, v1

    .line 59
    .line 60
    if-gt v1, v4, :cond_a

    .line 61
    .line 62
    const/16 v6, -0x60

    .line 63
    .line 64
    if-ne v2, v3, :cond_6

    .line 65
    .line 66
    if-lt v1, v6, :cond_a

    .line 67
    .line 68
    :cond_6
    const/16 v3, -0x13

    .line 69
    .line 70
    if-ne v2, v3, :cond_7

    .line 71
    .line 72
    if-ge v1, v6, :cond_a

    .line 73
    .line 74
    :cond_7
    add-int/lit8 p1, p1, 0x3

    .line 75
    .line 76
    aget-byte v1, p0, v5

    .line 77
    .line 78
    if-le v1, v4, :cond_1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_8
    add-int/lit8 v3, p2, -0x2

    .line 82
    .line 83
    if-lt v1, v3, :cond_9

    .line 84
    .line 85
    invoke-static {p0, v1, p2}, La/yum0;->i([BII)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_9
    add-int/lit8 v3, p1, 0x2

    .line 91
    .line 92
    aget-byte v1, p0, v1

    .line 93
    .line 94
    if-gt v1, v4, :cond_a

    .line 95
    .line 96
    shl-int/lit8 v2, v2, 0x1c

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x70

    .line 99
    .line 100
    add-int/2addr v1, v2

    .line 101
    shr-int/lit8 v1, v1, 0x1e

    .line 102
    .line 103
    if-nez v1, :cond_a

    .line 104
    .line 105
    add-int/lit8 v1, p1, 0x3

    .line 106
    .line 107
    aget-byte v2, p0, v3

    .line 108
    .line 109
    if-gt v2, v4, :cond_a

    .line 110
    .line 111
    add-int/lit8 p1, p1, 0x4

    .line 112
    .line 113
    aget-byte v1, p0, v1

    .line 114
    .line 115
    if-le v1, v4, :cond_1

    .line 116
    .line 117
    :cond_a
    :goto_2
    const/4 p0, -0x1

    .line 118
    return p0

    .line 119
    :cond_b
    move p1, v1

    .line 120
    goto :goto_1
.end method

.method public static l(La/ess0;[Ljava/lang/String;Ljava/util/Map;)La/ess0;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p0, :cond_3

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    array-length v2, p1

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    aget-object p0, p1, v0

    .line 13
    .line 14
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, La/ess0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    array-length v2, p1

    .line 22
    if-le v2, v1, :cond_5

    .line 23
    .line 24
    new-instance p0, La/ess0;

    .line 25
    .line 26
    invoke-direct {p0}, La/ess0;-><init>()V

    .line 27
    .line 28
    .line 29
    array-length v1, p1

    .line 30
    :goto_0
    if-ge v0, v1, :cond_2

    .line 31
    .line 32
    aget-object v2, p1, v0

    .line 33
    .line 34
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/ess0;

    .line 39
    .line 40
    invoke-virtual {p0, v2}, La/ess0;->a(La/ess0;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-object p0

    .line 47
    :cond_3
    if-eqz p1, :cond_4

    .line 48
    .line 49
    array-length v2, p1

    .line 50
    if-ne v2, v1, :cond_4

    .line 51
    .line 52
    aget-object p1, p1, v0

    .line 53
    .line 54
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, La/ess0;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/ess0;->a(La/ess0;)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    if-eqz p1, :cond_5

    .line 65
    .line 66
    array-length v2, p1

    .line 67
    if-le v2, v1, :cond_5

    .line 68
    .line 69
    array-length v1, p1

    .line 70
    :goto_1
    if-ge v0, v1, :cond_5

    .line 71
    .line 72
    aget-object v2, p1, v0

    .line 73
    .line 74
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, La/ess0;

    .line 79
    .line 80
    invoke-virtual {p0, v2}, La/ess0;->a(La/ess0;)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    return-object p0
.end method

.method public static m(Landroidx/fragment/app/e;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "TotoBetTypeBottomSheetTag"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, La/ylr0;

    .line 14
    .line 15
    invoke-direct {v1}, La/ylr0;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final n(La/kwo0;Ljava/lang/String;Z)La/ixo0;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v1, p0, La/kwo0;->a:Z

    .line 5
    .line 6
    iget-wide v2, p0, La/kwo0;->d:D

    .line 7
    .line 8
    move-wide v3, v2

    .line 9
    iget-object v2, p0, La/kwo0;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean v0, p0, La/kwo0;->b:Z

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    cmpg-double v7, v3, v5

    .line 21
    .line 22
    if-nez v7, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    :goto_0
    move-object v3, p1

    .line 26
    goto :goto_3

    .line 27
    :cond_1
    new-instance v7, La/zwo0;

    .line 28
    .line 29
    sget v8, La/cy7;->a:I

    .line 30
    .line 31
    sget-object v8, La/pn40;->a:La/pn40;

    .line 32
    .line 33
    invoke-static {p1, v3, v4}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    cmpl-double v3, v3, v5

    .line 42
    .line 43
    if-lez v3, :cond_2

    .line 44
    .line 45
    sget-object v3, La/d4d;->j:La/d4d;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    sget-object v3, La/d4d;->y:La/d4d;

    .line 49
    .line 50
    :goto_1
    invoke-direct {v7, p1, v3}, La/zwo0;-><init>(Ljava/lang/String;La/d4d;)V

    .line 51
    .line 52
    .line 53
    move-object v3, v7

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    :goto_2
    sget-object p1, La/xwo0;->a:La/xwo0;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_3
    iget-object v4, p0, La/kwo0;->e:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v0, :cond_6

    .line 61
    .line 62
    if-eqz p2, :cond_4

    .line 63
    .line 64
    goto :goto_6

    .line 65
    :cond_4
    iget-object p0, p0, La/kwo0;->f:Ljava/util/List;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    const/16 p2, 0xa

    .line 70
    .line 71
    invoke-static {p0, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    check-cast p2, La/mvo0;

    .line 93
    .line 94
    new-instance v0, La/fuy;

    .line 95
    .line 96
    iget-object v5, p2, La/mvo0;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object p2, p2, La/mvo0;->b:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {v0, v5, p2}, La/fuy;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    invoke-static {p1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance p1, La/sn7;

    .line 112
    .line 113
    invoke-direct {p1, p0}, La/sn7;-><init>(La/i4;)V

    .line 114
    .line 115
    .line 116
    :goto_5
    move-object v5, p1

    .line 117
    goto :goto_7

    .line 118
    :cond_6
    :goto_6
    sget-object p1, La/rn7;->a:La/rn7;

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :goto_7
    new-instance v0, La/ixo0;

    .line 122
    .line 123
    invoke-direct/range {v0 .. v5}, La/ixo0;-><init>(ZLjava/lang/String;La/bxo0;Ljava/lang/String;La/tn7;)V

    .line 124
    .line 125
    .line 126
    return-object v0
.end method

.method public static final o(La/z2s0;)La/w2s0;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/w2s0;

    .line 5
    .line 6
    iget-object v1, p0, La/z2s0;->a:Ljava/lang/Long;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    iget-object v1, p0, La/z2s0;->b:Ljava/lang/Boolean;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    iget-object v1, p0, La/z2s0;->c:Ljava/lang/Long;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-wide/16 v6, 0x0

    .line 33
    .line 34
    :goto_0
    iget-object p0, p0, La/z2s0;->d:Ljava/lang/Boolean;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    move-wide v1, v3

    .line 43
    move-wide v3, v6

    .line 44
    move v6, p0

    .line 45
    invoke-direct/range {v0 .. v6}, La/w2s0;-><init>(JJZZ)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    invoke-static {v2}, La/jf4;->k(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    invoke-static {v2}, La/jf4;->k(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_3
    invoke-static {v2}, La/jf4;->k(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v2
.end method

.method public static final p(La/ctf0;Ljava/util/List;)Ljava/util/List;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v0, La/iun;->a:La/iun;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1d

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, La/ifb;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    if-eqz v3, :cond_1c

    .line 40
    .line 41
    instance-of v5, v3, La/ffb;

    .line 42
    .line 43
    const/16 v6, 0xa

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x4

    .line 47
    if-eqz v5, :cond_8

    .line 48
    .line 49
    check-cast v3, La/ffb;

    .line 50
    .line 51
    iget-object v5, v3, La/ffb;->a:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_1
    new-instance v9, La/eok0;

    .line 62
    .line 63
    new-instance v10, La/hjm;

    .line 64
    .line 65
    new-array v11, v7, [Ljava/lang/Object;

    .line 66
    .line 67
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 68
    .line 69
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    const v13, 0x7f131332

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    sget-object v12, La/s6t0;->a:La/pz40;

    .line 81
    .line 82
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    iget-object v12, v12, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 87
    .line 88
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 89
    .line 90
    .line 91
    move-result-wide v12

    .line 92
    new-instance v14, La/y3d;

    .line 93
    .line 94
    invoke-direct {v14, v12, v13}, La/y3d;-><init>(J)V

    .line 95
    .line 96
    .line 97
    const/16 v22, 0x0

    .line 98
    .line 99
    const/16 v23, 0x1ffa

    .line 100
    .line 101
    const/4 v12, 0x0

    .line 102
    move-object v13, v14

    .line 103
    const/4 v14, 0x0

    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    const/16 v19, 0x0

    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    invoke-direct/range {v10 .. v23}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 118
    .line 119
    .line 120
    sget-object v11, La/i9h0;->a:La/i9h0;

    .line 121
    .line 122
    invoke-direct {v9, v10, v4, v11}, La/eok0;-><init>(La/hjm;La/bqv;La/i9h0;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    invoke-static {v5, v8}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    new-instance v10, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-static {v9, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    if-eqz v11, :cond_6

    .line 150
    .line 151
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    add-int/lit8 v12, v7, 0x1

    .line 156
    .line 157
    if-ltz v7, :cond_5

    .line 158
    .line 159
    check-cast v11, La/f280;

    .line 160
    .line 161
    iget v13, v11, La/f280;->a:I

    .line 162
    .line 163
    const-string v14, "_FINAL_SECTION_KEY"

    .line 164
    .line 165
    invoke-static {v13, v14}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    iget-object v14, v3, La/ffb;->b:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    if-eqz v15, :cond_3

    .line 180
    .line 181
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    move-object/from16 p1, v4

    .line 186
    .line 187
    move-object v4, v15

    .line 188
    check-cast v4, La/nms;

    .line 189
    .line 190
    iget v4, v4, La/nms;->a:I

    .line 191
    .line 192
    iget-object v8, v11, La/f280;->d:La/seo;

    .line 193
    .line 194
    iget v8, v8, La/seo;->i:I

    .line 195
    .line 196
    if-ne v4, v8, :cond_2

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_2
    move-object/from16 v4, p1

    .line 200
    .line 201
    const/4 v8, 0x4

    .line 202
    goto :goto_2

    .line 203
    :cond_3
    move-object/from16 p1, v4

    .line 204
    .line 205
    move-object/from16 v15, p1

    .line 206
    .line 207
    :goto_3
    check-cast v15, La/nms;

    .line 208
    .line 209
    if-eqz v15, :cond_4

    .line 210
    .line 211
    iget v4, v15, La/nms;->a:I

    .line 212
    .line 213
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    goto :goto_4

    .line 218
    :cond_4
    move-object/from16 v4, p1

    .line 219
    .line 220
    :goto_4
    invoke-static {v7, v9}, La/unh0;->i0(ILjava/util/List;)La/v12;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    invoke-static {v11, v4, v8, v7}, La/jtt0;->u(La/f280;Ljava/lang/Integer;La/v12;I)La/wbv0;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    new-instance v7, La/lcv0;

    .line 229
    .line 230
    invoke-direct {v7, v13, v4}, La/lcv0;-><init>(Ljava/lang/String;La/wbv0;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-object/from16 v4, p1

    .line 237
    .line 238
    move v7, v12

    .line 239
    const/4 v8, 0x4

    .line 240
    goto :goto_1

    .line 241
    :cond_5
    move-object/from16 p1, v4

    .line 242
    .line 243
    invoke-static {}, La/q3d;->p()V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_6
    invoke-virtual {v1, v10}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 248
    .line 249
    .line 250
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    const/4 v4, 0x4

    .line 255
    if-le v3, v4, :cond_7

    .line 256
    .line 257
    const-string v3, "FINAL_SECTION_KEY"

    .line 258
    .line 259
    invoke-static {v1, v0, v3}, La/yum0;->c(La/lc00;La/ctf0;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_7
    :goto_5
    move-object/from16 v21, v2

    .line 263
    .line 264
    goto/16 :goto_f

    .line 265
    .line 266
    :cond_8
    move-object/from16 p1, v4

    .line 267
    .line 268
    instance-of v4, v3, La/efb;

    .line 269
    .line 270
    if-eqz v4, :cond_14

    .line 271
    .line 272
    check-cast v3, La/efb;

    .line 273
    .line 274
    iget-object v4, v3, La/efb;->a:Ljava/util/List;

    .line 275
    .line 276
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    if-eqz v5, :cond_9

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_9
    new-instance v5, La/eok0;

    .line 284
    .line 285
    new-instance v17, La/hjm;

    .line 286
    .line 287
    new-array v8, v7, [Ljava/lang/Object;

    .line 288
    .line 289
    iget-object v9, v0, La/ctf0;->b:La/lsm0;

    .line 290
    .line 291
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    const v10, 0x7f13132e

    .line 296
    .line 297
    .line 298
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v18

    .line 302
    sget-object v8, La/s6t0;->a:La/pz40;

    .line 303
    .line 304
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    iget-object v8, v8, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 309
    .line 310
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 311
    .line 312
    .line 313
    move-result-wide v8

    .line 314
    new-instance v10, La/y3d;

    .line 315
    .line 316
    invoke-direct {v10, v8, v9}, La/y3d;-><init>(J)V

    .line 317
    .line 318
    .line 319
    const/16 v29, 0x0

    .line 320
    .line 321
    const/16 v30, 0x1ffa

    .line 322
    .line 323
    const/16 v19, 0x0

    .line 324
    .line 325
    const/16 v21, 0x0

    .line 326
    .line 327
    const/16 v22, 0x0

    .line 328
    .line 329
    const/16 v23, 0x0

    .line 330
    .line 331
    const/16 v24, 0x0

    .line 332
    .line 333
    const/16 v25, 0x0

    .line 334
    .line 335
    const/16 v26, 0x0

    .line 336
    .line 337
    const/16 v27, 0x0

    .line 338
    .line 339
    const/16 v28, 0x0

    .line 340
    .line 341
    move-object/from16 v20, v10

    .line 342
    .line 343
    invoke-direct/range {v17 .. v30}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 344
    .line 345
    .line 346
    move-object/from16 v8, v17

    .line 347
    .line 348
    sget-object v9, La/i9h0;->a:La/i9h0;

    .line 349
    .line 350
    move-object/from16 v10, p1

    .line 351
    .line 352
    invoke-direct {v5, v8, v10, v9}, La/eok0;-><init>(La/hjm;La/bqv;La/i9h0;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    new-instance v5, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    move v9, v7

    .line 372
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    if-eqz v10, :cond_11

    .line 377
    .line 378
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    add-int/lit8 v11, v9, 0x1

    .line 383
    .line 384
    if-ltz v9, :cond_10

    .line 385
    .line 386
    check-cast v10, La/dfb;

    .line 387
    .line 388
    iget-object v12, v3, La/efb;->b:Ljava/util/List;

    .line 389
    .line 390
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    iget-object v13, v10, La/dfb;->a:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    iget-object v10, v10, La/dfb;->b:Ljava/util/List;

    .line 399
    .line 400
    const/4 v14, 0x4

    .line 401
    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 406
    .line 407
    .line 408
    move-result v14

    .line 409
    if-lez v14, :cond_a

    .line 410
    .line 411
    new-instance v17, La/hjm;

    .line 412
    .line 413
    sget-object v14, La/s6t0;->a:La/pz40;

    .line 414
    .line 415
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 416
    .line 417
    .line 418
    move-result-object v14

    .line 419
    iget-object v14, v14, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 420
    .line 421
    invoke-virtual {v14}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v14

    .line 425
    new-instance v7, La/y3d;

    .line 426
    .line 427
    invoke-direct {v7, v14, v15}, La/y3d;-><init>(J)V

    .line 428
    .line 429
    .line 430
    const/16 v29, 0x0

    .line 431
    .line 432
    const/16 v30, 0x1ffa

    .line 433
    .line 434
    const/16 v19, 0x0

    .line 435
    .line 436
    const/16 v21, 0x0

    .line 437
    .line 438
    const/16 v22, 0x0

    .line 439
    .line 440
    const/16 v23, 0x0

    .line 441
    .line 442
    const/16 v24, 0x0

    .line 443
    .line 444
    const/16 v25, 0x0

    .line 445
    .line 446
    const/16 v26, 0x0

    .line 447
    .line 448
    const/16 v27, 0x0

    .line 449
    .line 450
    const/16 v28, 0x0

    .line 451
    .line 452
    move-object/from16 v20, v7

    .line 453
    .line 454
    move-object/from16 v18, v13

    .line 455
    .line 456
    invoke-direct/range {v17 .. v30}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 457
    .line 458
    .line 459
    move-object/from16 v7, v17

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_a
    const/4 v7, 0x0

    .line 463
    :goto_7
    new-instance v13, Ljava/util/ArrayList;

    .line 464
    .line 465
    invoke-static {v10, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 466
    .line 467
    .line 468
    move-result v14

    .line 469
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 470
    .line 471
    .line 472
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v14

    .line 476
    const/4 v15, 0x0

    .line 477
    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v17

    .line 481
    if-eqz v17, :cond_f

    .line 482
    .line 483
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v17

    .line 487
    add-int/lit8 v18, v15, 0x1

    .line 488
    .line 489
    if-ltz v15, :cond_e

    .line 490
    .line 491
    move-object/from16 v6, v17

    .line 492
    .line 493
    check-cast v6, La/f280;

    .line 494
    .line 495
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v17

    .line 499
    :goto_9
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v20

    .line 503
    if-eqz v20, :cond_c

    .line 504
    .line 505
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v20

    .line 509
    move-object/from16 v21, v2

    .line 510
    .line 511
    move-object/from16 v2, v20

    .line 512
    .line 513
    check-cast v2, La/nms;

    .line 514
    .line 515
    iget v2, v2, La/nms;->a:I

    .line 516
    .line 517
    move-object/from16 v22, v3

    .line 518
    .line 519
    iget-object v3, v6, La/f280;->d:La/seo;

    .line 520
    .line 521
    iget v3, v3, La/seo;->i:I

    .line 522
    .line 523
    if-ne v2, v3, :cond_b

    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_b
    move-object/from16 v2, v21

    .line 527
    .line 528
    move-object/from16 v3, v22

    .line 529
    .line 530
    goto :goto_9

    .line 531
    :cond_c
    move-object/from16 v21, v2

    .line 532
    .line 533
    move-object/from16 v22, v3

    .line 534
    .line 535
    const/16 v20, 0x0

    .line 536
    .line 537
    :goto_a
    move-object/from16 v2, v20

    .line 538
    .line 539
    check-cast v2, La/nms;

    .line 540
    .line 541
    if-eqz v2, :cond_d

    .line 542
    .line 543
    iget v2, v2, La/nms;->a:I

    .line 544
    .line 545
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    goto :goto_b

    .line 550
    :cond_d
    const/4 v2, 0x0

    .line 551
    :goto_b
    invoke-static {v15, v10}, La/unh0;->i0(ILjava/util/List;)La/v12;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    invoke-static {v6, v2, v3, v15}, La/jtt0;->u(La/f280;Ljava/lang/Integer;La/v12;I)La/wbv0;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move/from16 v15, v18

    .line 563
    .line 564
    move-object/from16 v2, v21

    .line 565
    .line 566
    move-object/from16 v3, v22

    .line 567
    .line 568
    const/16 v6, 0xa

    .line 569
    .line 570
    goto :goto_8

    .line 571
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 572
    .line 573
    .line 574
    const/4 v10, 0x0

    .line 575
    throw v10

    .line 576
    :cond_f
    move-object/from16 v21, v2

    .line 577
    .line 578
    move-object/from16 v22, v3

    .line 579
    .line 580
    const/4 v10, 0x0

    .line 581
    invoke-static {v13}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    new-instance v3, La/ecv0;

    .line 586
    .line 587
    invoke-direct {v3, v9, v7, v2}, La/ecv0;-><init>(ILa/hjm;La/i4;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move v9, v11

    .line 594
    move-object/from16 v2, v21

    .line 595
    .line 596
    move-object/from16 v3, v22

    .line 597
    .line 598
    const/16 v6, 0xa

    .line 599
    .line 600
    const/4 v7, 0x0

    .line 601
    goto/16 :goto_6

    .line 602
    .line 603
    :cond_10
    const/4 v10, 0x0

    .line 604
    invoke-static {}, La/q3d;->p()V

    .line 605
    .line 606
    .line 607
    throw v10

    .line 608
    :cond_11
    move-object/from16 v21, v2

    .line 609
    .line 610
    invoke-static {v5}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    new-instance v3, La/kcv0;

    .line 615
    .line 616
    invoke-direct {v3, v2}, La/kcv0;-><init>(La/i4;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    if-eqz v2, :cond_12

    .line 627
    .line 628
    goto/16 :goto_f

    .line 629
    .line 630
    :cond_12
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    :cond_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    if-eqz v3, :cond_1b

    .line 639
    .line 640
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    check-cast v3, La/dfb;

    .line 645
    .line 646
    iget-object v3, v3, La/dfb;->b:Ljava/util/List;

    .line 647
    .line 648
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    const/4 v14, 0x4

    .line 653
    if-le v3, v14, :cond_13

    .line 654
    .line 655
    const-string v2, "GROUP_STAGE_SECTION_KEY"

    .line 656
    .line 657
    invoke-static {v1, v0, v2}, La/yum0;->c(La/lc00;La/ctf0;Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    goto/16 :goto_f

    .line 661
    .line 662
    :cond_14
    move-object/from16 v21, v2

    .line 663
    .line 664
    instance-of v2, v3, La/gfb;

    .line 665
    .line 666
    if-eqz v2, :cond_1c

    .line 667
    .line 668
    check-cast v3, La/gfb;

    .line 669
    .line 670
    iget-object v2, v3, La/gfb;->a:Ljava/util/List;

    .line 671
    .line 672
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 673
    .line 674
    .line 675
    move-result v4

    .line 676
    if-eqz v4, :cond_15

    .line 677
    .line 678
    goto/16 :goto_f

    .line 679
    .line 680
    :cond_15
    new-instance v4, La/eok0;

    .line 681
    .line 682
    new-instance v31, La/hjm;

    .line 683
    .line 684
    const/4 v5, 0x0

    .line 685
    new-array v6, v5, [Ljava/lang/Object;

    .line 686
    .line 687
    iget-object v7, v0, La/ctf0;->b:La/lsm0;

    .line 688
    .line 689
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v6

    .line 693
    const v8, 0x7f131333

    .line 694
    .line 695
    .line 696
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v32

    .line 700
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 701
    .line 702
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 703
    .line 704
    .line 705
    move-result-object v6

    .line 706
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 707
    .line 708
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 709
    .line 710
    .line 711
    move-result-wide v6

    .line 712
    new-instance v8, La/y3d;

    .line 713
    .line 714
    invoke-direct {v8, v6, v7}, La/y3d;-><init>(J)V

    .line 715
    .line 716
    .line 717
    const/16 v43, 0x0

    .line 718
    .line 719
    const/16 v44, 0x1ffa

    .line 720
    .line 721
    const/16 v33, 0x0

    .line 722
    .line 723
    const/16 v35, 0x0

    .line 724
    .line 725
    const/16 v36, 0x0

    .line 726
    .line 727
    const/16 v37, 0x0

    .line 728
    .line 729
    const/16 v38, 0x0

    .line 730
    .line 731
    const/16 v39, 0x0

    .line 732
    .line 733
    const/16 v40, 0x0

    .line 734
    .line 735
    const/16 v41, 0x0

    .line 736
    .line 737
    const/16 v42, 0x0

    .line 738
    .line 739
    move-object/from16 v34, v8

    .line 740
    .line 741
    invoke-direct/range {v31 .. v44}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 742
    .line 743
    .line 744
    move-object/from16 v6, v31

    .line 745
    .line 746
    sget-object v7, La/i9h0;->a:La/i9h0;

    .line 747
    .line 748
    const/4 v10, 0x0

    .line 749
    invoke-direct {v4, v6, v10, v7}, La/eok0;-><init>(La/hjm;La/bqv;La/i9h0;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    const/4 v14, 0x4

    .line 756
    invoke-static {v2, v14}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    new-instance v6, Ljava/util/ArrayList;

    .line 761
    .line 762
    const/16 v7, 0xa

    .line 763
    .line 764
    invoke-static {v4, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 769
    .line 770
    .line 771
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 772
    .line 773
    .line 774
    move-result-object v7

    .line 775
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 776
    .line 777
    .line 778
    move-result v8

    .line 779
    if-eqz v8, :cond_1a

    .line 780
    .line 781
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v8

    .line 785
    add-int/lit8 v9, v5, 0x1

    .line 786
    .line 787
    if-ltz v5, :cond_19

    .line 788
    .line 789
    check-cast v8, La/f280;

    .line 790
    .line 791
    iget v10, v8, La/f280;->a:I

    .line 792
    .line 793
    const-string v11, "_PLAY_OFF_SECTION_KEY"

    .line 794
    .line 795
    invoke-static {v10, v11}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v10

    .line 799
    iget-object v11, v3, La/gfb;->b:Ljava/util/List;

    .line 800
    .line 801
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 802
    .line 803
    .line 804
    move-result-object v11

    .line 805
    :cond_16
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 806
    .line 807
    .line 808
    move-result v12

    .line 809
    if-eqz v12, :cond_17

    .line 810
    .line 811
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v12

    .line 815
    move-object v13, v12

    .line 816
    check-cast v13, La/nms;

    .line 817
    .line 818
    iget v13, v13, La/nms;->a:I

    .line 819
    .line 820
    iget-object v14, v8, La/f280;->d:La/seo;

    .line 821
    .line 822
    iget v14, v14, La/seo;->i:I

    .line 823
    .line 824
    if-ne v13, v14, :cond_16

    .line 825
    .line 826
    goto :goto_d

    .line 827
    :cond_17
    const/4 v12, 0x0

    .line 828
    :goto_d
    check-cast v12, La/nms;

    .line 829
    .line 830
    if-eqz v12, :cond_18

    .line 831
    .line 832
    iget v11, v12, La/nms;->a:I

    .line 833
    .line 834
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 835
    .line 836
    .line 837
    move-result-object v11

    .line 838
    goto :goto_e

    .line 839
    :cond_18
    const/4 v11, 0x0

    .line 840
    :goto_e
    invoke-static {v5, v4}, La/unh0;->i0(ILjava/util/List;)La/v12;

    .line 841
    .line 842
    .line 843
    move-result-object v12

    .line 844
    invoke-static {v8, v11, v12, v5}, La/jtt0;->u(La/f280;Ljava/lang/Integer;La/v12;I)La/wbv0;

    .line 845
    .line 846
    .line 847
    move-result-object v5

    .line 848
    new-instance v8, La/lcv0;

    .line 849
    .line 850
    invoke-direct {v8, v10, v5}, La/lcv0;-><init>(Ljava/lang/String;La/wbv0;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move v5, v9

    .line 857
    goto :goto_c

    .line 858
    :cond_19
    invoke-static {}, La/q3d;->p()V

    .line 859
    .line 860
    .line 861
    const/4 v10, 0x0

    .line 862
    throw v10

    .line 863
    :cond_1a
    invoke-virtual {v1, v6}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 864
    .line 865
    .line 866
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 867
    .line 868
    .line 869
    move-result v2

    .line 870
    const/4 v14, 0x4

    .line 871
    if-le v2, v14, :cond_1b

    .line 872
    .line 873
    const-string v2, "PLAY_OFF_SECTION_KEY"

    .line 874
    .line 875
    invoke-static {v1, v0, v2}, La/yum0;->c(La/lc00;La/ctf0;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    :cond_1b
    :goto_f
    move-object/from16 v2, v21

    .line 879
    .line 880
    goto/16 :goto_0

    .line 881
    .line 882
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 883
    .line 884
    .line 885
    const/4 v10, 0x0

    .line 886
    return-object v10

    .line 887
    :cond_1d
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    return-object v0
.end method

.method public static q(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v1, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x5

    .line 18
    return p0

    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    return v0

    .line 21
    :cond_3
    return v1

    .line 22
    :cond_4
    return v0
.end method
