.class public final synthetic La/l4q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n4q;


# direct methods
.method public synthetic constructor <init>(La/n4q;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l4q;->a:B

    iput-object p1, p0, La/l4q;->b:La/n4q;

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
    iget-byte v1, v0, La/l4q;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/l4q;->b:La/n4q;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p1

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    move-object/from16 v1, p2

    .line 16
    .line 17
    check-cast v1, Landroid/os/Bundle;

    .line 18
    .line 19
    sget-object v4, La/n4q;->R1:La/bek;

    .line 20
    .line 21
    const-string v4, "REQUEST_SEASONS_DIALOG_KEY"

    .line 22
    .line 23
    invoke-static {v1, v0, v4}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v0, "RESULT_ON_SEASON_SELECTED_LISTENER_KEY"

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v3}, La/n4q;->G0()La/k3t0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, La/f4q;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/f4q;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    :goto_0
    return-object v0

    .line 61
    :pswitch_0
    move-object/from16 v0, p1

    .line 62
    .line 63
    check-cast v0, Ljava/lang/String;

    .line 64
    .line 65
    move-object/from16 v1, p2

    .line 66
    .line 67
    check-cast v1, Landroid/os/Bundle;

    .line 68
    .line 69
    sget-object v2, La/n4q;->R1:La/bek;

    .line 70
    .line 71
    const-string v2, "REQUEST_MATCH_TYPES_DIALOG_KEY"

    .line 72
    .line 73
    invoke-static {v1, v0, v2}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const-string v0, "RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY"

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    instance-of v1, v0, La/lg30;

    .line 95
    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    check-cast v0, La/lg30;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/4 v0, 0x0

    .line 102
    :goto_1
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v3}, La/n4q;->G0()La/k3t0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v2, La/c4q;

    .line 109
    .line 110
    invoke-direct {v2, v0}, La/c4q;-><init>(La/lg30;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_2
    return-object v0

    .line 119
    :pswitch_1
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, La/fet;

    .line 122
    .line 123
    move-object/from16 v3, p2

    .line 124
    .line 125
    check-cast v3, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    sget-object v4, La/n4q;->R1:La/bek;

    .line 132
    .line 133
    and-int/lit8 v4, v3, 0x3

    .line 134
    .line 135
    const/4 v5, 0x2

    .line 136
    const/4 v6, 0x1

    .line 137
    if-eq v4, v5, :cond_5

    .line 138
    .line 139
    move v4, v6

    .line 140
    goto :goto_3

    .line 141
    :cond_5
    move v4, v2

    .line 142
    :goto_3
    and-int/2addr v3, v6

    .line 143
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_c

    .line 148
    .line 149
    iget-object v6, v0, La/l4q;->b:La/n4q;

    .line 150
    .line 151
    invoke-virtual {v6}, La/n4q;->G0()La/k3t0;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    sget-object v12, La/ukd;->a:La/cl5;

    .line 164
    .line 165
    if-nez v3, :cond_6

    .line 166
    .line 167
    if-ne v4, v12, :cond_7

    .line 168
    .line 169
    :cond_6
    new-instance v4, La/pop;

    .line 170
    .line 171
    const/4 v10, 0x0

    .line 172
    const/16 v11, 0x9

    .line 173
    .line 174
    const/4 v5, 0x1

    .line 175
    const-class v7, La/n4q;

    .line 176
    .line 177
    const-string v8, "handleSideEffects"

    .line 178
    .line 179
    const-string v9, "handleSideEffects(Lorg/xplatform/statistic/tennis/impl/wins_and_losses/presentation/actual/filter/FilterWinLossSideEffect;)V"

    .line 180
    .line 181
    invoke-direct/range {v4 .. v11}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_7
    check-cast v4, La/jhy;

    .line 188
    .line 189
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 190
    .line 191
    sget-object v3, La/lkz;->a:La/lkz;

    .line 192
    .line 193
    invoke-static {v4, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-virtual {v1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    or-int/2addr v3, v4

    .line 206
    const/4 v4, 0x3

    .line 207
    invoke-virtual {v1, v4}, La/fet;->e(I)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    or-int/2addr v3, v4

    .line 212
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    or-int/2addr v3, v4

    .line 217
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    const/4 v8, 0x0

    .line 222
    if-nez v3, :cond_8

    .line 223
    .line 224
    if-ne v4, v12, :cond_9

    .line 225
    .line 226
    :cond_8
    new-instance v4, La/bio;

    .line 227
    .line 228
    const/4 v9, 0x6

    .line 229
    move-object v5, v0

    .line 230
    invoke-direct/range {v4 .. v9}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :cond_9
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 237
    .line 238
    invoke-static {v1, v6, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, La/n4q;->G0()La/k3t0;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, La/i3t0;

    .line 246
    .line 247
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v6}, La/n4q;->G0()La/k3t0;

    .line 252
    .line 253
    .line 254
    move-result-object v15

    .line 255
    invoke-virtual {v1, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    if-nez v3, :cond_a

    .line 264
    .line 265
    if-ne v4, v12, :cond_b

    .line 266
    .line 267
    :cond_a
    new-instance v13, La/pop;

    .line 268
    .line 269
    const/16 v19, 0x0

    .line 270
    .line 271
    const/16 v20, 0xa

    .line 272
    .line 273
    const/4 v14, 0x1

    .line 274
    const-class v16, La/k3t0;

    .line 275
    .line 276
    const-string v17, "onAction"

    .line 277
    .line 278
    const-string v18, "onAction(Ljava/lang/Object;)V"

    .line 279
    .line 280
    invoke-direct/range {v13 .. v20}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    move-object v4, v13

    .line 287
    :cond_b
    check-cast v4, La/jhy;

    .line 288
    .line 289
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 290
    .line 291
    invoke-static {v2, v1, v8, v0, v4}, La/ntr;->y(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 292
    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_c
    invoke-virtual {v1}, La/fet;->X()V

    .line 296
    .line 297
    .line 298
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
