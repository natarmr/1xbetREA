.class public final synthetic La/y970;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ca70;


# direct methods
.method public synthetic constructor <init>(La/ca70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y970;->a:B

    iput-object p1, p0, La/y970;->b:La/ca70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/y970;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y970;->b:La/ca70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, La/csr;

    .line 10
    .line 11
    move-object/from16 v1, p2

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    sget-object v3, La/ca70;->U1:La/htz;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v3, La/r670;

    .line 29
    .line 30
    invoke-direct {v3, v1, v2, v0}, La/r670;-><init>(JLa/csr;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    move-object v3, p1

    .line 40
    check-cast v3, La/fet;

    .line 41
    .line 42
    move-object/from16 v0, p2

    .line 43
    .line 44
    check-cast v0, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sget-object v1, La/ca70;->U1:La/htz;

    .line 51
    .line 52
    and-int/lit8 v1, v0, 0x3

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x1

    .line 57
    if-eq v1, v2, :cond_0

    .line 58
    .line 59
    move v1, v5

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v1, v4

    .line 62
    :goto_0
    and-int/2addr v0, v5

    .line 63
    invoke-virtual {v3, v0, v1}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_b

    .line 68
    .line 69
    sget-object v0, La/cr00;->a:La/lqd;

    .line 70
    .line 71
    invoke-virtual {v3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Landroid/app/Activity;

    .line 76
    .line 77
    sget-object v1, La/or00;->a:La/zfn;

    .line 78
    .line 79
    invoke-virtual {v3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v8, v1

    .line 84
    check-cast v8, La/clz;

    .line 85
    .line 86
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, La/i3t0;

    .line 91
    .line 92
    invoke-virtual {v1, v3}, La/i3t0;->y(La/fet;)La/pz40;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v12, v1

    .line 101
    check-cast v12, La/cc70;

    .line 102
    .line 103
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    sget-object v13, La/ukd;->a:La/cl5;

    .line 116
    .line 117
    if-nez v1, :cond_1

    .line 118
    .line 119
    if-ne v2, v13, :cond_2

    .line 120
    .line 121
    :cond_1
    new-instance v2, La/cd60;

    .line 122
    .line 123
    const/16 v1, 0xe

    .line 124
    .line 125
    invoke-direct {v2, p0, v1}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 132
    .line 133
    sget-object v1, La/lkz;->a:La/lkz;

    .line 134
    .line 135
    invoke-static {v2, v3}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-virtual {v3, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-virtual {v3, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    or-int/2addr v1, v2

    .line 148
    const/4 v2, 0x3

    .line 149
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    or-int/2addr v1, v2

    .line 154
    invoke-virtual {v3, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    or-int/2addr v1, v2

    .line 159
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-nez v1, :cond_3

    .line 164
    .line 165
    if-ne v2, v13, :cond_4

    .line 166
    .line 167
    :cond_3
    new-instance v6, La/rxt0;

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    const/4 v11, 0x1

    .line 171
    invoke-direct/range {v6 .. v11}, La/rxt0;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move-object v2, v6

    .line 178
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 179
    .line 180
    invoke-static {v3, v8, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-virtual {v3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    or-int/2addr v1, v2

    .line 192
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-nez v1, :cond_5

    .line 197
    .line 198
    if-ne v2, v13, :cond_6

    .line 199
    .line 200
    :cond_5
    new-instance v2, La/z970;

    .line 201
    .line 202
    invoke-direct {v2, v0, p0, v4}, La/z970;-><init>(Landroid/app/Activity;La/ca70;B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 209
    .line 210
    invoke-virtual {v3, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-virtual {v3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    or-int/2addr v1, v4

    .line 219
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    if-nez v1, :cond_7

    .line 224
    .line 225
    if-ne v4, v13, :cond_8

    .line 226
    .line 227
    :cond_7
    new-instance v4, La/z970;

    .line 228
    .line 229
    invoke-direct {v4, v0, p0, v5}, La/z970;-><init>(Landroid/app/Activity;La/ca70;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    move-object v1, v4

    .line 236
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    const/4 v5, 0x4

    .line 240
    move-object v0, v2

    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-static/range {v0 .. v5}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 243
    .line 244
    .line 245
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 246
    .line 247
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-virtual {v3, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    if-nez p0, :cond_9

    .line 260
    .line 261
    if-ne v1, v13, :cond_a

    .line 262
    .line 263
    :cond_9
    new-instance v4, La/cy60;

    .line 264
    .line 265
    const/4 v10, 0x0

    .line 266
    const/16 v11, 0xd

    .line 267
    .line 268
    const/4 v5, 0x1

    .line 269
    const-class v7, La/k3t0;

    .line 270
    .line 271
    const-string v8, "onAction"

    .line 272
    .line 273
    const-string v9, "onAction(Ljava/lang/Object;)V"

    .line 274
    .line 275
    invoke-direct/range {v4 .. v11}, La/cy60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    move-object v1, v4

    .line 282
    :cond_a
    check-cast v1, La/jhy;

    .line 283
    .line 284
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 285
    .line 286
    const/4 p0, 0x6

    .line 287
    invoke-static {v0, v12, v1, v3, p0}, La/cwr0;->A(La/mm40;La/cc70;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 288
    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_b
    invoke-virtual {v3}, La/fet;->X()V

    .line 292
    .line 293
    .line 294
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
