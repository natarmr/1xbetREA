.class public final synthetic La/zod0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/epd0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BLa/epd0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/zod0;->a:B

    iput-object p2, p0, La/zod0;->b:La/epd0;

    iput-object p3, p0, La/zod0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zod0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const v3, 0x7f130cdb

    .line 8
    .line 9
    .line 10
    const/high16 v4, 0x3e800000    # 0.25f

    .line 11
    .line 12
    sget-object v5, La/jm40;->b:La/jm40;

    .line 13
    .line 14
    const/16 v6, 0x12

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    const/4 v8, 0x4

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x1

    .line 20
    iget-object v11, v0, La/zod0;->c:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    iget-object v0, v0, La/zod0;->b:La/epd0;

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/yhg0;

    .line 30
    .line 31
    move-object/from16 v13, p2

    .line 32
    .line 33
    check-cast v13, La/fet;

    .line 34
    .line 35
    move-object/from16 v12, p3

    .line 36
    .line 37
    check-cast v12, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v12

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    and-int/lit8 v14, v12, 0x6

    .line 47
    .line 48
    if-nez v14, :cond_1

    .line 49
    .line 50
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v14

    .line 54
    if-eqz v14, :cond_0

    .line 55
    .line 56
    move v7, v8

    .line 57
    :cond_0
    or-int/2addr v12, v7

    .line 58
    :cond_1
    and-int/lit8 v7, v12, 0x13

    .line 59
    .line 60
    if-eq v7, v6, :cond_2

    .line 61
    .line 62
    move v6, v10

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v6, v9

    .line 65
    :goto_0
    and-int/lit8 v7, v12, 0x1

    .line 66
    .line 67
    invoke-virtual {v13, v7, v6}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_6

    .line 72
    .line 73
    iget-object v6, v0, La/epd0;->f:Ljava/lang/String;

    .line 74
    .line 75
    if-nez v6, :cond_3

    .line 76
    .line 77
    const v0, -0x5f0210b1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v13, v9}, La/fet;->r(Z)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const v6, -0x5f0210b0

    .line 88
    .line 89
    .line 90
    invoke-virtual {v13, v6}, La/fet;->e0(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v4, v5, v10}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    invoke-static {v3, v9, v13}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 102
    .line 103
    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-boolean v1, v0, La/epd0;->a:Z

    .line 111
    .line 112
    invoke-virtual {v13, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v13, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    or-int/2addr v3, v4

    .line 121
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    if-nez v3, :cond_4

    .line 126
    .line 127
    if-ne v4, v2, :cond_5

    .line 128
    .line 129
    :cond_4
    new-instance v4, La/wod0;

    .line 130
    .line 131
    const/16 v2, 0x9

    .line 132
    .line 133
    invoke-direct {v4, v2, v0, v11}, La/wod0;-><init>(BLa/epd0;Lkotlin/jvm/functions/Function1;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    move-object/from16 v16, v4

    .line 140
    .line 141
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 142
    .line 143
    const/4 v12, 0x0

    .line 144
    move/from16 v17, v1

    .line 145
    .line 146
    invoke-static/range {v12 .. v17}, La/bww;->p(ILa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v13, v9}, La/fet;->r(Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_6
    invoke-virtual {v13}, La/fet;->X()V

    .line 154
    .line 155
    .line 156
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_0
    move-object/from16 v1, p1

    .line 160
    .line 161
    check-cast v1, La/yhg0;

    .line 162
    .line 163
    move-object/from16 v13, p2

    .line 164
    .line 165
    check-cast v13, La/fet;

    .line 166
    .line 167
    move-object/from16 v12, p3

    .line 168
    .line 169
    check-cast v12, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    and-int/lit8 v14, v12, 0x6

    .line 179
    .line 180
    if-nez v14, :cond_8

    .line 181
    .line 182
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    if-eqz v14, :cond_7

    .line 187
    .line 188
    move v7, v8

    .line 189
    :cond_7
    or-int/2addr v12, v7

    .line 190
    :cond_8
    and-int/lit8 v7, v12, 0x13

    .line 191
    .line 192
    if-eq v7, v6, :cond_9

    .line 193
    .line 194
    move v6, v10

    .line 195
    goto :goto_2

    .line 196
    :cond_9
    move v6, v9

    .line 197
    :goto_2
    and-int/lit8 v7, v12, 0x1

    .line 198
    .line 199
    invoke-virtual {v13, v7, v6}, La/fet;->U(IZ)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_d

    .line 204
    .line 205
    iget-object v6, v0, La/epd0;->f:Ljava/lang/String;

    .line 206
    .line 207
    if-nez v6, :cond_a

    .line 208
    .line 209
    const v0, -0x47bc90b

    .line 210
    .line 211
    .line 212
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v13, v9}, La/fet;->r(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_a
    const v6, -0x47bc90a

    .line 220
    .line 221
    .line 222
    invoke-virtual {v13, v6}, La/fet;->e0(I)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v1, v4, v5, v10}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    invoke-static {v3, v9, v13}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 234
    .line 235
    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    iget-boolean v1, v0, La/epd0;->a:Z

    .line 243
    .line 244
    invoke-virtual {v13, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    invoke-virtual {v13, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    or-int/2addr v3, v4

    .line 253
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    if-nez v3, :cond_b

    .line 258
    .line 259
    if-ne v4, v2, :cond_c

    .line 260
    .line 261
    :cond_b
    new-instance v4, La/wod0;

    .line 262
    .line 263
    const/16 v2, 0x8

    .line 264
    .line 265
    invoke-direct {v4, v2, v0, v11}, La/wod0;-><init>(BLa/epd0;Lkotlin/jvm/functions/Function1;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :cond_c
    move-object/from16 v16, v4

    .line 272
    .line 273
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 274
    .line 275
    const/4 v12, 0x0

    .line 276
    move/from16 v17, v1

    .line 277
    .line 278
    invoke-static/range {v12 .. v17}, La/xvw;->m(ILa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v13, v9}, La/fet;->r(Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_d
    invoke-virtual {v13}, La/fet;->X()V

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
