.class public final synthetic La/qpk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qsk;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/qsk;FFFLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/qpk;->a:B

    iput-object p1, p0, La/qpk;->b:La/qsk;

    iput p2, p0, La/qpk;->c:F

    iput p3, p0, La/qpk;->d:F

    iput p4, p0, La/qpk;->e:F

    iput-object p5, p0, La/qpk;->f:Lkotlin/jvm/functions/Function1;

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
    iget-byte v1, v0, La/qpk;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x380000

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0x482

    .line 11
    .line 12
    const/16 v6, 0x80

    .line 13
    .line 14
    const/16 v7, 0x100

    .line 15
    .line 16
    const/4 v8, 0x4

    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v10, 0x1

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v12, p1

    .line 23
    .line 24
    check-cast v12, La/l7m0;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, La/l7m0;

    .line 29
    .line 30
    move-object/from16 v11, p3

    .line 31
    .line 32
    check-cast v11, La/ycl;

    .line 33
    .line 34
    move-object/from16 v13, p4

    .line 35
    .line 36
    check-cast v13, La/fet;

    .line 37
    .line 38
    move-object/from16 v14, p5

    .line 39
    .line 40
    check-cast v14, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v14

    .line 46
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    and-int/lit8 v1, v14, 0x6

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v13, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v8, v9

    .line 64
    :goto_0
    or-int v1, v14, v8

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v1, v14

    .line 68
    :goto_1
    and-int/lit16 v8, v14, 0x180

    .line 69
    .line 70
    if-nez v8, :cond_3

    .line 71
    .line 72
    iget v8, v11, La/ycl;->a:F

    .line 73
    .line 74
    invoke-virtual {v13, v8}, La/fet;->d(F)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_2

    .line 79
    .line 80
    move v6, v7

    .line 81
    :cond_2
    or-int/2addr v1, v6

    .line 82
    :cond_3
    and-int/lit16 v6, v1, 0x483

    .line 83
    .line 84
    if-eq v6, v5, :cond_4

    .line 85
    .line 86
    move v4, v10

    .line 87
    :cond_4
    and-int/lit8 v5, v1, 0x1

    .line 88
    .line 89
    invoke-virtual {v13, v5, v4}, La/fet;->U(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-ne v4, v3, :cond_5

    .line 100
    .line 101
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    check-cast v4, La/pz40;

    .line 111
    .line 112
    iget v3, v11, La/ycl;->a:F

    .line 113
    .line 114
    shl-int/lit8 v5, v1, 0x3

    .line 115
    .line 116
    and-int/lit8 v5, v5, 0x70

    .line 117
    .line 118
    or-int/lit16 v5, v5, 0x180

    .line 119
    .line 120
    shl-int/lit8 v1, v1, 0xc

    .line 121
    .line 122
    and-int/2addr v1, v2

    .line 123
    or-int v20, v5, v1

    .line 124
    .line 125
    iget-object v11, v0, La/qpk;->b:La/qsk;

    .line 126
    .line 127
    iget v14, v0, La/qpk;->c:F

    .line 128
    .line 129
    iget v15, v0, La/qpk;->d:F

    .line 130
    .line 131
    iget v1, v0, La/qpk;->e:F

    .line 132
    .line 133
    iget-object v0, v0, La/qpk;->f:Lkotlin/jvm/functions/Function1;

    .line 134
    .line 135
    move-object/from16 v18, v0

    .line 136
    .line 137
    move/from16 v16, v1

    .line 138
    .line 139
    move/from16 v17, v3

    .line 140
    .line 141
    move-object/from16 v19, v13

    .line 142
    .line 143
    move-object v13, v4

    .line 144
    invoke-static/range {v11 .. v20}, La/qcc;->e(La/qsk;La/l7m0;La/l7m0;FFFFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    move-object/from16 v19, v13

    .line 149
    .line 150
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 151
    .line 152
    .line 153
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_0
    move-object/from16 v1, p1

    .line 157
    .line 158
    check-cast v1, La/l7m0;

    .line 159
    .line 160
    move-object/from16 v11, p2

    .line 161
    .line 162
    check-cast v11, La/l7m0;

    .line 163
    .line 164
    move-object/from16 v12, p3

    .line 165
    .line 166
    check-cast v12, La/ycl;

    .line 167
    .line 168
    move-object/from16 v13, p4

    .line 169
    .line 170
    check-cast v13, La/fet;

    .line 171
    .line 172
    move-object/from16 v14, p5

    .line 173
    .line 174
    check-cast v14, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v14

    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    and-int/lit8 v11, v14, 0x6

    .line 187
    .line 188
    if-nez v11, :cond_8

    .line 189
    .line 190
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-eqz v11, :cond_7

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    move v8, v9

    .line 198
    :goto_3
    or-int/2addr v8, v14

    .line 199
    goto :goto_4

    .line 200
    :cond_8
    move v8, v14

    .line 201
    :goto_4
    and-int/lit16 v9, v14, 0x180

    .line 202
    .line 203
    if-nez v9, :cond_a

    .line 204
    .line 205
    iget v9, v12, La/ycl;->a:F

    .line 206
    .line 207
    invoke-virtual {v13, v9}, La/fet;->d(F)Z

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    if-eqz v9, :cond_9

    .line 212
    .line 213
    move v6, v7

    .line 214
    :cond_9
    or-int/2addr v8, v6

    .line 215
    :cond_a
    and-int/lit16 v6, v8, 0x483

    .line 216
    .line 217
    if-eq v6, v5, :cond_b

    .line 218
    .line 219
    move v4, v10

    .line 220
    :cond_b
    and-int/lit8 v5, v8, 0x1

    .line 221
    .line 222
    invoke-virtual {v13, v5, v4}, La/fet;->U(IZ)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_d

    .line 227
    .line 228
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    if-ne v4, v3, :cond_c

    .line 233
    .line 234
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_c
    move-object v3, v4

    .line 244
    check-cast v3, La/pz40;

    .line 245
    .line 246
    iget v7, v12, La/ycl;->a:F

    .line 247
    .line 248
    shl-int/lit8 v4, v8, 0x3

    .line 249
    .line 250
    and-int/lit8 v4, v4, 0x70

    .line 251
    .line 252
    or-int/lit16 v4, v4, 0x180

    .line 253
    .line 254
    shl-int/lit8 v5, v8, 0xc

    .line 255
    .line 256
    and-int/2addr v2, v5

    .line 257
    or-int v10, v4, v2

    .line 258
    .line 259
    move-object v2, v1

    .line 260
    iget-object v1, v0, La/qpk;->b:La/qsk;

    .line 261
    .line 262
    iget v4, v0, La/qpk;->c:F

    .line 263
    .line 264
    iget v5, v0, La/qpk;->d:F

    .line 265
    .line 266
    iget v6, v0, La/qpk;->e:F

    .line 267
    .line 268
    iget-object v8, v0, La/qpk;->f:Lkotlin/jvm/functions/Function1;

    .line 269
    .line 270
    move-object v9, v13

    .line 271
    invoke-static/range {v1 .. v10}, La/qcc;->e(La/qsk;La/l7m0;La/l7m0;FFFFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_d
    move-object v9, v13

    .line 276
    invoke-virtual {v9}, La/fet;->X()V

    .line 277
    .line 278
    .line 279
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object v0

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
