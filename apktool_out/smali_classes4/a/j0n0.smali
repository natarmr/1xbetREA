.class public final synthetic La/j0n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l0n0;


# direct methods
.method public synthetic constructor <init>(La/l0n0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j0n0;->a:B

    iput-object p1, p0, La/j0n0;->b:La/l0n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j0n0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/j0n0;->b:La/l0n0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v5, p1

    .line 11
    .line 12
    check-cast v5, La/fet;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sget-object v2, La/l0n0;->P1:La/s2m0;

    .line 23
    .line 24
    and-int/lit8 v2, v1, 0x3

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    const/4 v4, 0x1

    .line 28
    const/4 v8, 0x0

    .line 29
    if-eq v2, v3, :cond_0

    .line 30
    .line 31
    move v2, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v2, v8

    .line 34
    :goto_0
    and-int/2addr v1, v4

    .line 35
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_c

    .line 40
    .line 41
    invoke-virtual {v0}, La/l0n0;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, La/i3t0;

    .line 46
    .line 47
    invoke-virtual {v1, v5}, La/i3t0;->y(La/fet;)La/pz40;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0}, La/l0n0;->G0()La/k3t0;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    sget-object v9, La/ukd;->a:La/cl5;

    .line 60
    .line 61
    if-ne v6, v9, :cond_1

    .line 62
    .line 63
    sget-object v6, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 64
    .line 65
    invoke-static {v6, v5}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    check-cast v6, La/vne;

    .line 73
    .line 74
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    if-nez v7, :cond_2

    .line 83
    .line 84
    if-ne v10, v9, :cond_3

    .line 85
    .line 86
    :cond_2
    new-instance v10, La/j1l0;

    .line 87
    .line 88
    const/16 v7, 0x14

    .line 89
    .line 90
    invoke-direct {v10, v0, v7}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    invoke-virtual {v5, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    invoke-virtual {v5, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    or-int/2addr v11, v12

    .line 109
    invoke-virtual {v5, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    or-int/2addr v11, v12

    .line 114
    const/4 v12, 0x0

    .line 115
    invoke-virtual {v5, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    or-int/2addr v11, v13

    .line 120
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    if-nez v11, :cond_4

    .line 125
    .line 126
    if-ne v13, v9, :cond_5

    .line 127
    .line 128
    :cond_4
    new-instance v13, La/ggc0;

    .line 129
    .line 130
    const/16 v11, 0xb

    .line 131
    .line 132
    invoke-direct {v13, v6, v2, v10, v11}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_5
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    invoke-static {v7, v13, v5}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    if-nez v2, :cond_6

    .line 152
    .line 153
    if-ne v6, v9, :cond_7

    .line 154
    .line 155
    :cond_6
    new-instance v6, La/i0n0;

    .line 156
    .line 157
    invoke-direct {v6, v0, v4}, La/i0n0;-><init>(La/l0n0;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    move-object v2, v6

    .line 164
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 165
    .line 166
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-nez v4, :cond_8

    .line 175
    .line 176
    if-ne v6, v9, :cond_9

    .line 177
    .line 178
    :cond_8
    new-instance v6, La/i0n0;

    .line 179
    .line 180
    invoke-direct {v6, v0, v3}, La/i0n0;-><init>(La/l0n0;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_9
    move-object v3, v6

    .line 187
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 188
    .line 189
    const/4 v6, 0x0

    .line 190
    const/4 v7, 0x4

    .line 191
    const/4 v4, 0x0

    .line 192
    invoke-static/range {v2 .. v7}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, La/u2n0;

    .line 200
    .line 201
    invoke-virtual {v0}, La/l0n0;->G0()La/k3t0;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    invoke-virtual {v5, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    if-nez v0, :cond_a

    .line 214
    .line 215
    if-ne v2, v9, :cond_b

    .line 216
    .line 217
    :cond_a
    new-instance v13, La/kcl0;

    .line 218
    .line 219
    const/16 v19, 0x0

    .line 220
    .line 221
    const/16 v20, 0x15

    .line 222
    .line 223
    const/4 v14, 0x1

    .line 224
    const-class v16, La/k3t0;

    .line 225
    .line 226
    const-string v17, "onAction"

    .line 227
    .line 228
    const-string v18, "onAction(Ljava/lang/Object;)V"

    .line 229
    .line 230
    invoke-direct/range {v13 .. v20}, La/kcl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object v2, v13

    .line 237
    :cond_b
    check-cast v2, La/jhy;

    .line 238
    .line 239
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 240
    .line 241
    invoke-static {v12, v1, v2, v5, v8}, La/unh0;->c0(La/mm40;La/u2n0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_c
    invoke-virtual {v5}, La/fet;->X()V

    .line 246
    .line 247
    .line 248
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_0
    move-object/from16 v1, p1

    .line 252
    .line 253
    check-cast v1, Ljava/lang/String;

    .line 254
    .line 255
    move-object/from16 v2, p2

    .line 256
    .line 257
    check-cast v2, Landroid/os/Bundle;

    .line 258
    .line 259
    sget-object v3, La/l0n0;->P1:La/s2m0;

    .line 260
    .line 261
    const-string v3, "KEY_PICKER_MODEL_REQUEST"

    .line 262
    .line 263
    invoke-static {v2, v1, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    invoke-virtual {v0}, La/l0n0;->G0()La/k3t0;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    new-instance v2, La/b0n0;

    .line 272
    .line 273
    invoke-direct {v2, v1}, La/b0n0;-><init>(I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
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
