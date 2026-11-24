.class public final synthetic La/crr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/urr;


# direct methods
.method public synthetic constructor <init>(La/urr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/crr;->a:B

    iput-object p1, p0, La/crr;->b:La/urr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/crr;->a:B

    .line 4
    .line 5
    const/16 v2, 0x90

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    iget-object v0, v0, La/crr;->b:La/urr;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/y5d;

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    check-cast v7, La/mm40;

    .line 25
    .line 26
    move-object/from16 v15, p3

    .line 27
    .line 28
    check-cast v15, La/fet;

    .line 29
    .line 30
    move-object/from16 v8, p4

    .line 31
    .line 32
    check-cast v8, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-static {v8, v1, v7}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    and-int/lit8 v8, v1, 0x30

    .line 39
    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v15, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    move v3, v4

    .line 49
    :cond_0
    or-int/2addr v1, v3

    .line 50
    :cond_1
    and-int/lit16 v3, v1, 0x91

    .line 51
    .line 52
    if-eq v3, v2, :cond_2

    .line 53
    .line 54
    move v2, v6

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v2, v5

    .line 57
    :goto_0
    and-int/2addr v1, v6

    .line 58
    invoke-virtual {v15, v1, v2}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    sget-object v1, La/uc9;->c:La/mw3;

    .line 65
    .line 66
    sget-object v2, La/gqw0;->m:La/xx7;

    .line 67
    .line 68
    invoke-static {v1, v2, v15, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-wide v2, v15, La/fet;->T:J

    .line 73
    .line 74
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v15, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v15}, La/fet;->i0()V

    .line 92
    .line 93
    .line 94
    iget-boolean v7, v15, La/fet;->S:Z

    .line 95
    .line 96
    if-eqz v7, :cond_3

    .line 97
    .line 98
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 99
    .line 100
    invoke-virtual {v15, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-virtual {v15}, La/fet;->r0()V

    .line 105
    .line 106
    .line 107
    :goto_1
    sget-object v7, La/gqw0;->x:La/shd;

    .line 108
    .line 109
    invoke-static {v15, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, La/gqw0;->w:La/shd;

    .line 113
    .line 114
    invoke-static {v15, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    sget-object v2, La/gqw0;->y:La/shd;

    .line 122
    .line 123
    invoke-static {v15, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 127
    .line 128
    .line 129
    sget-object v1, La/gqw0;->v:La/shd;

    .line 130
    .line 131
    invoke-static {v15, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    iget-object v8, v0, La/urr;->f:La/nqr;

    .line 135
    .line 136
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget-object v2, La/ukd;->a:La/cl5;

    .line 141
    .line 142
    if-ne v1, v2, :cond_4

    .line 143
    .line 144
    new-instance v1, La/dcr;

    .line 145
    .line 146
    const/4 v3, 0x5

    .line 147
    invoke-direct {v1, v3}, La/dcr;-><init>(B)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    move-object v10, v1

    .line 154
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-ne v1, v2, :cond_5

    .line 161
    .line 162
    new-instance v1, La/dcr;

    .line 163
    .line 164
    const/4 v2, 0x6

    .line 165
    invoke-direct {v1, v2}, La/dcr;-><init>(B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    move-object v13, v1

    .line 172
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 173
    .line 174
    sget-object v14, La/o050;->d:La/ugd;

    .line 175
    .line 176
    const v16, 0x1b0180

    .line 177
    .line 178
    .line 179
    const/16 v17, 0x1a

    .line 180
    .line 181
    const/4 v9, 0x0

    .line 182
    const/4 v11, 0x0

    .line 183
    const/4 v12, 0x0

    .line 184
    invoke-static/range {v8 .. v17}, La/ay3;->f(Ljava/lang/Object;La/mm40;Lkotlin/jvm/functions/Function1;La/u12;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/ydr;La/fet;II)V

    .line 185
    .line 186
    .line 187
    sget-object v1, La/qmk;->a:La/zcl;

    .line 188
    .line 189
    const/4 v11, 0x0

    .line 190
    const/16 v12, 0xd

    .line 191
    .line 192
    sget-object v7, La/jm40;->b:La/jm40;

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const/high16 v9, 0x40000000    # 2.0f

    .line 196
    .line 197
    const/4 v10, 0x0

    .line 198
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v0, v0, La/urr;->e:La/j83;

    .line 203
    .line 204
    invoke-static {v1, v0, v15, v5}, La/jwb;->r(La/mm40;La/j83;La/fet;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v15, v6}, La/fet;->r(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_6
    invoke-virtual {v15}, La/fet;->X()V

    .line 212
    .line 213
    .line 214
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_0
    move-object/from16 v1, p1

    .line 218
    .line 219
    check-cast v1, La/y5d;

    .line 220
    .line 221
    move-object/from16 v7, p2

    .line 222
    .line 223
    check-cast v7, La/mm40;

    .line 224
    .line 225
    move-object/from16 v8, p3

    .line 226
    .line 227
    check-cast v8, La/fet;

    .line 228
    .line 229
    move-object/from16 v9, p4

    .line 230
    .line 231
    check-cast v9, Ljava/lang/Integer;

    .line 232
    .line 233
    invoke-static {v9, v1, v7}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    and-int/lit8 v9, v1, 0x30

    .line 238
    .line 239
    if-nez v9, :cond_8

    .line 240
    .line 241
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-eqz v9, :cond_7

    .line 246
    .line 247
    move v3, v4

    .line 248
    :cond_7
    or-int/2addr v1, v3

    .line 249
    :cond_8
    and-int/lit16 v3, v1, 0x91

    .line 250
    .line 251
    if-eq v3, v2, :cond_9

    .line 252
    .line 253
    move v5, v6

    .line 254
    :cond_9
    and-int/lit8 v2, v1, 0x1

    .line 255
    .line 256
    invoke-virtual {v8, v2, v5}, La/fet;->U(IZ)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_a

    .line 261
    .line 262
    iget-object v0, v0, La/urr;->a:La/vqr;

    .line 263
    .line 264
    shr-int/lit8 v1, v1, 0x3

    .line 265
    .line 266
    and-int/lit8 v1, v1, 0xe

    .line 267
    .line 268
    invoke-static {v7, v0, v8, v1}, La/ozb;->y(La/mm40;La/vqr;La/fet;I)V

    .line 269
    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_a
    invoke-virtual {v8}, La/fet;->X()V

    .line 273
    .line 274
    .line 275
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v0

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
