.class public final synthetic La/kw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/ugd;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/kw0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kw0;->c:La/l7m0;

    iput-object p2, p0, La/kw0;->b:La/ugd;

    return-void
.end method

.method public synthetic constructor <init>(La/ugd;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/kw0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kw0;->b:La/ugd;

    iput-object p2, p0, La/kw0;->c:La/l7m0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kw0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/kw0;->c:La/l7m0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/hh80;

    .line 15
    .line 16
    move-object/from16 v9, p2

    .line 17
    .line 18
    check-cast v9, La/fet;

    .line 19
    .line 20
    move-object/from16 v5, p3

    .line 21
    .line 22
    check-cast v5, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 v6, v5, 0x6

    .line 32
    .line 33
    if-nez v6, :cond_1

    .line 34
    .line 35
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    const/4 v6, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v6, 0x2

    .line 44
    :goto_0
    or-int/2addr v5, v6

    .line 45
    :cond_1
    and-int/lit8 v6, v5, 0x13

    .line 46
    .line 47
    const/16 v7, 0x12

    .line 48
    .line 49
    if-eq v6, v7, :cond_2

    .line 50
    .line 51
    move v6, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v6, v3

    .line 54
    :goto_1
    and-int/2addr v5, v2

    .line 55
    invoke-virtual {v9, v5, v6}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    invoke-interface {v1}, La/hh80;->d()F

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    const/4 v14, 0x0

    .line 66
    const/16 v15, 0xd

    .line 67
    .line 68
    sget-object v10, La/jm40;->b:La/jm40;

    .line 69
    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v13, 0x0

    .line 72
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v5, "TAG_FEEDS_CHAMPS_ROOT"

    .line 77
    .line 78
    invoke-static {v1, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v5, La/gqw0;->a:La/zx7;

    .line 83
    .line 84
    invoke-static {v5, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget-wide v6, v9, La/fet;->T:J

    .line 89
    .line 90
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-static {v9, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9}, La/fet;->i0()V

    .line 108
    .line 109
    .line 110
    iget-boolean v8, v9, La/fet;->S:Z

    .line 111
    .line 112
    if-eqz v8, :cond_3

    .line 113
    .line 114
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 115
    .line 116
    invoke-virtual {v9, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    invoke-virtual {v9}, La/fet;->r0()V

    .line 121
    .line 122
    .line 123
    :goto_2
    sget-object v8, La/gqw0;->x:La/shd;

    .line 124
    .line 125
    invoke-static {v9, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    sget-object v5, La/gqw0;->w:La/shd;

    .line 129
    .line 130
    invoke-static {v9, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    sget-object v6, La/gqw0;->y:La/shd;

    .line 138
    .line 139
    invoke-static {v9, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 143
    .line 144
    .line 145
    sget-object v5, La/gqw0;->v:La/shd;

    .line 146
    .line 147
    invoke-static {v9, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, La/qnp;

    .line 155
    .line 156
    iget-object v6, v1, La/qnp;->c:La/f9h0;

    .line 157
    .line 158
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, La/qnp;

    .line 163
    .line 164
    iget-object v7, v1, La/qnp;->e:La/j700;

    .line 165
    .line 166
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, La/qnp;

    .line 171
    .line 172
    iget-object v8, v1, La/qnp;->b:La/dhq0;

    .line 173
    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    iget-object v5, v0, La/kw0;->b:La/ugd;

    .line 179
    .line 180
    invoke-virtual/range {v5 .. v10}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v2}, La/fet;->r(Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_4
    invoke-virtual {v9}, La/fet;->X()V

    .line 188
    .line 189
    .line 190
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_0
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, La/yhg0;

    .line 196
    .line 197
    move-object/from16 v5, p2

    .line 198
    .line 199
    check-cast v5, La/fet;

    .line 200
    .line 201
    move-object/from16 v6, p3

    .line 202
    .line 203
    check-cast v6, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    and-int/lit8 v1, v6, 0x11

    .line 213
    .line 214
    const/16 v7, 0x10

    .line 215
    .line 216
    if-eq v1, v7, :cond_5

    .line 217
    .line 218
    move v1, v2

    .line 219
    goto :goto_4

    .line 220
    :cond_5
    move v1, v3

    .line 221
    :goto_4
    and-int/2addr v2, v6

    .line 222
    invoke-virtual {v5, v2, v1}, La/fet;->U(IZ)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_7

    .line 227
    .line 228
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, La/nw0;

    .line 233
    .line 234
    iget-boolean v1, v1, La/nw0;->e:Z

    .line 235
    .line 236
    if-eqz v1, :cond_6

    .line 237
    .line 238
    const v1, -0x594f82bc

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v1}, La/fet;->e0(I)V

    .line 242
    .line 243
    .line 244
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    iget-object v0, v0, La/kw0;->b:La/ugd;

    .line 249
    .line 250
    invoke-virtual {v0, v5, v1}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    :goto_5
    invoke-virtual {v5, v3}, La/fet;->r(Z)V

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_6
    const v0, 0x2f5f638d

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_7
    invoke-virtual {v5}, La/fet;->X()V

    .line 265
    .line 266
    .line 267
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object v0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
