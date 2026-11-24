.class public final synthetic La/vq9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wq9;


# direct methods
.method public synthetic constructor <init>(La/wq9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vq9;->a:B

    iput-object p1, p0, La/vq9;->b:La/wq9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vq9;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v5, p1

    .line 9
    .line 10
    check-cast v5, La/fet;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget-object v2, La/wq9;->S1:La/gl5;

    .line 21
    .line 22
    and-int/lit8 v2, v1, 0x3

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v8, 0x0

    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    move v2, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v8

    .line 32
    :goto_0
    and-int/2addr v1, v4

    .line 33
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_b

    .line 38
    .line 39
    iget-object v11, v0, La/vq9;->b:La/wq9;

    .line 40
    .line 41
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v9, La/ukd;->a:La/cl5;

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    if-ne v1, v9, :cond_2

    .line 54
    .line 55
    :cond_1
    new-instance v1, La/uq9;

    .line 56
    .line 57
    invoke-direct {v1, v11, v4}, La/uq9;-><init>(La/wq9;B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    move-object v2, v1

    .line 64
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 65
    .line 66
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    if-ne v1, v9, :cond_4

    .line 77
    .line 78
    :cond_3
    new-instance v1, La/uq9;

    .line 79
    .line 80
    invoke-direct {v1, v11, v3}, La/uq9;-><init>(La/wq9;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    move-object v3, v1

    .line 87
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x4

    .line 91
    const/4 v4, 0x0

    .line 92
    invoke-static/range {v2 .. v7}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11}, La/wq9;->G0()La/k3t0;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/i3t0;

    .line 100
    .line 101
    invoke-virtual {v0, v5}, La/i3t0;->y(La/fet;)La/pz40;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v11}, La/wq9;->G0()La/k3t0;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    invoke-virtual {v5, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-nez v1, :cond_5

    .line 118
    .line 119
    if-ne v2, v9, :cond_6

    .line 120
    .line 121
    :cond_5
    new-instance v12, La/li8;

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    const/16 v19, 0x12

    .line 126
    .line 127
    const/4 v13, 0x1

    .line 128
    const-class v15, La/k3t0;

    .line 129
    .line 130
    const-string v16, "onAction"

    .line 131
    .line 132
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 133
    .line 134
    invoke-direct/range {v12 .. v19}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v2, v12

    .line 141
    :cond_6
    check-cast v2, La/jhy;

    .line 142
    .line 143
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 144
    .line 145
    invoke-static {v0, v2, v5, v8}, La/cwr0;->k(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11}, La/wq9;->G0()La/k3t0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-nez v1, :cond_7

    .line 161
    .line 162
    if-ne v2, v9, :cond_8

    .line 163
    .line 164
    :cond_7
    move-object v1, v9

    .line 165
    goto :goto_1

    .line 166
    :cond_8
    move-object v1, v9

    .line 167
    goto :goto_2

    .line 168
    :goto_1
    new-instance v9, La/li8;

    .line 169
    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0x13

    .line 172
    .line 173
    const/4 v10, 0x1

    .line 174
    const-class v12, La/wq9;

    .line 175
    .line 176
    const-string v13, "handleSideEffect"

    .line 177
    .line 178
    const-string v14, "handleSideEffect(Lorg/xplatform/callback/impl/presentation/history_compose/actions/CallbackHistorySideEffect;)V"

    .line 179
    .line 180
    invoke-direct/range {v9 .. v16}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v2, v9

    .line 187
    :goto_2
    check-cast v2, La/jhy;

    .line 188
    .line 189
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 190
    .line 191
    sget-object v3, La/lkz;->a:La/lkz;

    .line 192
    .line 193
    invoke-static {v2, v5}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    or-int/2addr v2, v3

    .line 206
    const/4 v3, 0x3

    .line 207
    invoke-virtual {v5, v3}, La/fet;->e(I)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    or-int/2addr v2, v3

    .line 212
    invoke-virtual {v5, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    or-int/2addr v2, v3

    .line 217
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    if-nez v2, :cond_9

    .line 222
    .line 223
    if-ne v3, v1, :cond_a

    .line 224
    .line 225
    :cond_9
    new-instance v9, La/ua7;

    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const/16 v14, 0xb

    .line 229
    .line 230
    move-object v10, v0

    .line 231
    invoke-direct/range {v9 .. v14}, La/ua7;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v5, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    move-object v3, v9

    .line 238
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 239
    .line 240
    invoke-static {v5, v11, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_b
    invoke-virtual {v5}, La/fet;->X()V

    .line 245
    .line 246
    .line 247
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object v0

    .line 250
    :pswitch_0
    move-object/from16 v1, p1

    .line 251
    .line 252
    check-cast v1, Ljava/lang/String;

    .line 253
    .line 254
    move-object/from16 v2, p2

    .line 255
    .line 256
    check-cast v2, Landroid/os/Bundle;

    .line 257
    .line 258
    sget-object v3, La/wq9;->S1:La/gl5;

    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object v0, v0, La/vq9;->b:La/wq9;

    .line 267
    .line 268
    invoke-virtual {v0}, La/wq9;->G0()La/k3t0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    sget-object v1, La/mq9;->a:La/mq9;

    .line 273
    .line 274
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object v0

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
