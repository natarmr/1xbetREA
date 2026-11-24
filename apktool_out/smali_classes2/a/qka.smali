.class public final synthetic La/qka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d9z;

.field public final synthetic c:La/a4x;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/d9z;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/qka;->a:B

    iput-object p1, p0, La/qka;->c:La/a4x;

    iput-object p2, p0, La/qka;->b:La/d9z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/d9z;La/a4x;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/qka;->a:B

    iput-object p1, p0, La/qka;->b:La/d9z;

    iput-object p2, p0, La/qka;->c:La/a4x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qka;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/qka;->b:La/d9z;

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/high16 v4, 0x40000000    # 2.0f

    .line 10
    .line 11
    const/4 v5, 0x5

    .line 12
    sget-object v6, La/jm40;->b:La/jm40;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x2

    .line 16
    const/16 v9, 0xe

    .line 17
    .line 18
    iget-object v10, v0, La/qka;->c:La/a4x;

    .line 19
    .line 20
    const/4 v11, 0x1

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/fet;

    .line 27
    .line 28
    move-object/from16 v2, p2

    .line 29
    .line 30
    check-cast v2, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    and-int/lit8 v12, v2, 0x3

    .line 37
    .line 38
    if-eq v12, v8, :cond_0

    .line 39
    .line 40
    move v7, v11

    .line 41
    :cond_0
    and-int/2addr v2, v11

    .line 42
    invoke-virtual {v1, v2, v7}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    sget-object v2, La/qmk;->a:La/zcl;

    .line 49
    .line 50
    const/high16 v2, 0x42d80000    # 108.0f

    .line 51
    .line 52
    invoke-static {v6, v2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/high16 v6, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-static {v2, v6}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    new-instance v12, La/ngv;

    .line 63
    .line 64
    invoke-direct {v12, v5}, La/ngv;-><init>(I)V

    .line 65
    .line 66
    .line 67
    new-instance v2, La/qw3;

    .line 68
    .line 69
    new-instance v5, La/jf4;

    .line 70
    .line 71
    invoke-direct {v5, v9}, La/jf4;-><init>(B)V

    .line 72
    .line 73
    .line 74
    const/high16 v6, 0x40800000    # 4.0f

    .line 75
    .line 76
    invoke-direct {v2, v6, v11, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 77
    .line 78
    .line 79
    new-instance v5, La/qw3;

    .line 80
    .line 81
    new-instance v6, La/jf4;

    .line 82
    .line 83
    invoke-direct {v6, v9}, La/jf4;-><init>(B)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v5, v4, v11, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-nez v4, :cond_1

    .line 98
    .line 99
    if-ne v6, v3, :cond_2

    .line 100
    .line 101
    :cond_1
    new-instance v6, La/oea;

    .line 102
    .line 103
    invoke-direct {v6, v10, v11}, La/oea;-><init>(La/a4x;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    move-object/from16 v21, v6

    .line 110
    .line 111
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 112
    .line 113
    const/16 v23, 0x0

    .line 114
    .line 115
    const/16 v24, 0x398

    .line 116
    .line 117
    iget-object v14, v0, La/qka;->b:La/d9z;

    .line 118
    .line 119
    const/4 v15, 0x0

    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    const/16 v20, 0x0

    .line 125
    .line 126
    move-object/from16 v22, v1

    .line 127
    .line 128
    move-object/from16 v17, v2

    .line 129
    .line 130
    move-object/from16 v16, v5

    .line 131
    .line 132
    invoke-static/range {v12 .. v24}, La/g8x;->i(La/ngv;La/mm40;La/d9z;La/hh80;La/sw3;La/ow3;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_3
    move-object/from16 v22, v1

    .line 137
    .line 138
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 139
    .line 140
    .line 141
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_0
    move-object/from16 v0, p1

    .line 145
    .line 146
    check-cast v0, La/fet;

    .line 147
    .line 148
    move-object/from16 v1, p2

    .line 149
    .line 150
    check-cast v1, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v11}, La/x8x;->L(I)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-static {v10, v2, v0, v1}, La/j47;->q0(La/a4x;La/d9z;La/fet;I)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_1
    move-object/from16 v1, p1

    .line 166
    .line 167
    check-cast v1, La/fet;

    .line 168
    .line 169
    move-object/from16 v2, p2

    .line 170
    .line 171
    check-cast v2, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    and-int/lit8 v12, v2, 0x3

    .line 178
    .line 179
    if-eq v12, v8, :cond_4

    .line 180
    .line 181
    move v7, v11

    .line 182
    :cond_4
    and-int/2addr v2, v11

    .line 183
    invoke-virtual {v1, v2, v7}, La/fet;->U(IZ)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_7

    .line 188
    .line 189
    new-instance v2, La/ngv;

    .line 190
    .line 191
    invoke-direct {v2, v5}, La/ngv;-><init>(I)V

    .line 192
    .line 193
    .line 194
    sget-object v5, La/qmk;->a:La/zcl;

    .line 195
    .line 196
    const/high16 v5, 0x42c40000    # 98.0f

    .line 197
    .line 198
    const/high16 v7, 0x42800000    # 64.0f

    .line 199
    .line 200
    invoke-static {v6, v5, v7}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    new-instance v6, La/qw3;

    .line 205
    .line 206
    new-instance v7, La/jf4;

    .line 207
    .line 208
    invoke-direct {v7, v9}, La/jf4;-><init>(B)V

    .line 209
    .line 210
    .line 211
    invoke-direct {v6, v4, v11, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 212
    .line 213
    .line 214
    move-object v7, v2

    .line 215
    move-object v2, v5

    .line 216
    new-instance v5, La/qw3;

    .line 217
    .line 218
    new-instance v12, La/jf4;

    .line 219
    .line 220
    invoke-direct {v12, v9}, La/jf4;-><init>(B)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v5, v4, v11, v12}, La/qw3;-><init>(FZLa/rw3;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    if-nez v4, :cond_5

    .line 235
    .line 236
    if-ne v9, v3, :cond_6

    .line 237
    .line 238
    :cond_5
    new-instance v9, La/oea;

    .line 239
    .line 240
    invoke-direct {v9, v10, v8}, La/oea;-><init>(La/a4x;B)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_6
    move-object v10, v9

    .line 247
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    const/16 v13, 0x398

    .line 251
    .line 252
    iget-object v3, v0, La/qka;->b:La/d9z;

    .line 253
    .line 254
    const/4 v4, 0x0

    .line 255
    move-object v11, v1

    .line 256
    move-object v1, v7

    .line 257
    const/4 v7, 0x0

    .line 258
    const/4 v8, 0x0

    .line 259
    const/4 v9, 0x0

    .line 260
    invoke-static/range {v1 .. v13}, La/g8x;->i(La/ngv;La/mm40;La/d9z;La/hh80;La/sw3;La/ow3;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_7
    move-object v11, v1

    .line 265
    invoke-virtual {v11}, La/fet;->X()V

    .line 266
    .line 267
    .line 268
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_2
    move-object/from16 v0, p1

    .line 272
    .line 273
    check-cast v0, La/fet;

    .line 274
    .line 275
    move-object/from16 v1, p2

    .line 276
    .line 277
    check-cast v1, Ljava/lang/Integer;

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {v11}, La/x8x;->L(I)I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-static {v10, v2, v0, v1}, La/kc5;->F0(La/a4x;La/d9z;La/fet;I)V

    .line 287
    .line 288
    .line 289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
