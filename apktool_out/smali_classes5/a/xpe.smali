.class public final synthetic La/xpe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bqe;


# direct methods
.method public synthetic constructor <init>(La/bqe;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xpe;->a:B

    iput-object p1, p0, La/xpe;->b:La/bqe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xpe;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v0, v0, La/xpe;->b:La/bqe;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, La/bqe;->l2:La/kiu0;

    .line 19
    .line 20
    move-object/from16 v8, p1

    .line 21
    .line 22
    check-cast v8, La/y5d;

    .line 23
    .line 24
    move-object/from16 v12, p2

    .line 25
    .line 26
    check-cast v12, La/fet;

    .line 27
    .line 28
    move-object/from16 v9, p3

    .line 29
    .line 30
    check-cast v9, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    sget-object v10, La/bqe;->o2:La/kwd;

    .line 37
    .line 38
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v10, v9, 0x6

    .line 42
    .line 43
    if-nez v10, :cond_1

    .line 44
    .line 45
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-eqz v10, :cond_0

    .line 50
    .line 51
    move v4, v5

    .line 52
    :cond_0
    or-int/2addr v9, v4

    .line 53
    :cond_1
    move v4, v9

    .line 54
    and-int/lit8 v5, v4, 0x13

    .line 55
    .line 56
    if-eq v5, v3, :cond_2

    .line 57
    .line 58
    move v3, v6

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v3, v7

    .line 61
    :goto_0
    and-int/lit8 v5, v4, 0x1

    .line 62
    .line 63
    invoke-virtual {v12, v5, v3}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    iget-object v0, v0, La/bqe;->m2:La/kiu0;

    .line 70
    .line 71
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/g0c0;

    .line 76
    .line 77
    iget-object v9, v0, La/g0c0;->b:La/p7m0;

    .line 78
    .line 79
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    const/16 v13, 0x30

    .line 82
    .line 83
    const/4 v14, 0x2

    .line 84
    const/4 v11, 0x0

    .line 85
    invoke-static/range {v9 .. v14}, La/ydx;->E(La/gmq;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;La/fet;II)La/pz40;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, La/kqe;

    .line 94
    .line 95
    iget-object v5, v3, La/kqe;->f:La/p7m0;

    .line 96
    .line 97
    new-instance v9, La/iqe;

    .line 98
    .line 99
    const/4 v10, 0x0

    .line 100
    invoke-direct {v9, v3, v10, v7}, La/iqe;-><init>(La/kqe;La/yje;B)V

    .line 101
    .line 102
    .line 103
    new-instance v3, La/s6n0;

    .line 104
    .line 105
    invoke-direct {v3, v5, v9}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    new-instance v10, La/hqe;

    .line 109
    .line 110
    sget-object v5, La/lak0;->c:La/lak0;

    .line 111
    .line 112
    invoke-direct {v10, v5, v6}, La/hqe;-><init>(La/a4x;Z)V

    .line 113
    .line 114
    .line 115
    move-object v9, v3

    .line 116
    invoke-static/range {v9 .. v14}, La/ydx;->E(La/gmq;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;La/fet;II)La/pz40;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    move-object v15, v1

    .line 125
    check-cast v15, La/kqe;

    .line 126
    .line 127
    invoke-virtual {v12, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    if-nez v1, :cond_3

    .line 136
    .line 137
    if-ne v3, v2, :cond_4

    .line 138
    .line 139
    :cond_3
    new-instance v13, La/z6e;

    .line 140
    .line 141
    const/16 v19, 0x0

    .line 142
    .line 143
    const/16 v20, 0xe

    .line 144
    .line 145
    const/4 v14, 0x1

    .line 146
    const-class v16, La/kqe;

    .line 147
    .line 148
    const-string v17, "onItemClicked"

    .line 149
    .line 150
    const-string v18, "onItemClicked(Lorg/xplatform/personal/impl/presentation/countries/models/PersonalCountryRedesignUiModel$Item;)V"

    .line 151
    .line 152
    invoke-direct/range {v13 .. v20}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move-object v3, v13

    .line 159
    :cond_4
    check-cast v3, La/jhy;

    .line 160
    .line 161
    move-object v11, v3

    .line 162
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 163
    .line 164
    and-int/lit8 v13, v4, 0xe

    .line 165
    .line 166
    move-object v10, v0

    .line 167
    invoke-static/range {v8 .. v13}, La/ny9;->i(La/y5d;La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 172
    .line 173
    .line 174
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_0
    move-object/from16 v1, p1

    .line 178
    .line 179
    check-cast v1, La/y5d;

    .line 180
    .line 181
    move-object/from16 v8, p2

    .line 182
    .line 183
    check-cast v8, La/fet;

    .line 184
    .line 185
    move-object/from16 v9, p3

    .line 186
    .line 187
    check-cast v9, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    sget-object v10, La/bqe;->o2:La/kwd;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    and-int/lit8 v10, v9, 0x6

    .line 199
    .line 200
    if-nez v10, :cond_7

    .line 201
    .line 202
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-eqz v10, :cond_6

    .line 207
    .line 208
    move v4, v5

    .line 209
    :cond_6
    or-int/2addr v9, v4

    .line 210
    :cond_7
    and-int/lit8 v4, v9, 0x13

    .line 211
    .line 212
    if-eq v4, v3, :cond_8

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_8
    move v6, v7

    .line 216
    :goto_2
    and-int/lit8 v3, v9, 0x1

    .line 217
    .line 218
    invoke-virtual {v8, v3, v6}, La/fet;->U(IZ)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_b

    .line 223
    .line 224
    iget-object v3, v0, La/bqe;->k2:La/n0o0;

    .line 225
    .line 226
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    check-cast v3, La/hdi;

    .line 231
    .line 232
    iget-object v3, v3, La/hdi;->e:La/ctf0;

    .line 233
    .line 234
    iget-object v0, v0, La/bqe;->l2:La/kiu0;

    .line 235
    .line 236
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    move-object v12, v0

    .line 241
    check-cast v12, La/kqe;

    .line 242
    .line 243
    invoke-virtual {v8, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    if-nez v0, :cond_9

    .line 252
    .line 253
    if-ne v4, v2, :cond_a

    .line 254
    .line 255
    :cond_9
    new-instance v10, La/z6e;

    .line 256
    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    const/16 v17, 0xd

    .line 260
    .line 261
    const/4 v11, 0x1

    .line 262
    const-class v13, La/kqe;

    .line 263
    .line 264
    const-string v14, "onSearchChange"

    .line 265
    .line 266
    const-string v15, "onSearchChange(Ljava/lang/String;)V"

    .line 267
    .line 268
    invoke-direct/range {v10 .. v17}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v8, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    move-object v4, v10

    .line 275
    :cond_a
    check-cast v4, La/jhy;

    .line 276
    .line 277
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 278
    .line 279
    and-int/lit8 v0, v9, 0xe

    .line 280
    .line 281
    invoke-static {v1, v3, v4, v8, v0}, La/ny9;->L(La/y5d;La/ctf0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_b
    invoke-virtual {v8}, La/fet;->X()V

    .line 286
    .line 287
    .line 288
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
