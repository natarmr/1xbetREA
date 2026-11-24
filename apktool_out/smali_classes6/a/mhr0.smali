.class public final synthetic La/mhr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/phr0;


# direct methods
.method public synthetic constructor <init>(La/phr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mhr0;->a:B

    iput-object p1, p0, La/mhr0;->b:La/phr0;

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
    iget-byte v1, v0, La/mhr0;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Landroid/os/Bundle;

    .line 15
    .line 16
    sget-object v3, La/phr0;->W1:La/y2m0;

    .line 17
    .line 18
    const-string v3, "TotoBetTypeBottomSheetKey"

    .line 19
    .line 20
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, v0, La/mhr0;->b:La/phr0;

    .line 30
    .line 31
    invoke-virtual {v0}, La/phr0;->G0()La/fir0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v3, La/ehr0;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-direct {v3, v1}, La/ehr0;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3}, La/fir0;->O(La/ghr0;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_0
    return-object v0

    .line 50
    :pswitch_0
    move-object/from16 v4, p1

    .line 51
    .line 52
    check-cast v4, La/fet;

    .line 53
    .line 54
    move-object/from16 v1, p2

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    sget-object v2, La/phr0;->W1:La/y2m0;

    .line 63
    .line 64
    and-int/lit8 v2, v1, 0x3

    .line 65
    .line 66
    const/4 v3, 0x2

    .line 67
    const/4 v5, 0x1

    .line 68
    const/4 v7, 0x0

    .line 69
    if-eq v2, v3, :cond_1

    .line 70
    .line 71
    move v2, v5

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v2, v7

    .line 74
    :goto_1
    and-int/2addr v1, v5

    .line 75
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_a

    .line 80
    .line 81
    iget-object v10, v0, La/mhr0;->b:La/phr0;

    .line 82
    .line 83
    invoke-virtual {v10}, La/phr0;->G0()La/fir0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v4, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    sget-object v3, La/ukd;->a:La/cl5;

    .line 96
    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    if-ne v2, v3, :cond_3

    .line 100
    .line 101
    :cond_2
    new-instance v8, La/ddr0;

    .line 102
    .line 103
    const/4 v14, 0x0

    .line 104
    const/4 v15, 0x4

    .line 105
    const/4 v9, 0x1

    .line 106
    const-class v11, La/phr0;

    .line 107
    .line 108
    const-string v12, "handleSideEffect"

    .line 109
    .line 110
    const-string v13, "handleSideEffect(Lorg/xplatform/toto_bet/active_tirage/presentation/TotoActiveTirageSideEffect;)V"

    .line 111
    .line 112
    invoke-direct/range {v8 .. v15}, La/ddr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v2, v8

    .line 119
    :cond_3
    check-cast v2, La/jhy;

    .line 120
    .line 121
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 122
    .line 123
    sget v1, La/fir0;->X:I

    .line 124
    .line 125
    sget-object v1, La/lkz;->a:La/lkz;

    .line 126
    .line 127
    invoke-static {v2, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {v4, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    or-int/2addr v1, v2

    .line 140
    const/4 v2, 0x3

    .line 141
    invoke-virtual {v4, v2}, La/fet;->e(I)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    or-int/2addr v1, v2

    .line 146
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    or-int/2addr v1, v2

    .line 151
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const/4 v12, 0x0

    .line 156
    if-nez v1, :cond_4

    .line 157
    .line 158
    if-ne v2, v3, :cond_5

    .line 159
    .line 160
    :cond_4
    new-instance v8, La/tmj0;

    .line 161
    .line 162
    const/16 v13, 0xf

    .line 163
    .line 164
    move-object v9, v0

    .line 165
    invoke-direct/range {v8 .. v13}, La/tmj0;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object v2, v8

    .line 172
    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 173
    .line 174
    invoke-static {v4, v10, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-nez v0, :cond_6

    .line 186
    .line 187
    if-ne v1, v3, :cond_7

    .line 188
    .line 189
    :cond_6
    new-instance v1, La/nhr0;

    .line 190
    .line 191
    invoke-direct {v1, v10, v5}, La/nhr0;-><init>(La/phr0;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 198
    .line 199
    const/4 v5, 0x0

    .line 200
    const/4 v6, 0x6

    .line 201
    const/4 v2, 0x0

    .line 202
    move-object v0, v3

    .line 203
    const/4 v3, 0x0

    .line 204
    invoke-static/range {v1 .. v6}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v10}, La/phr0;->G0()La/fir0;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v1, v4}, La/i3t0;->y(La/fet;)La/pz40;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, La/air0;

    .line 220
    .line 221
    invoke-virtual {v10}, La/phr0;->G0()La/fir0;

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    invoke-virtual {v4, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    if-nez v2, :cond_8

    .line 234
    .line 235
    if-ne v3, v0, :cond_9

    .line 236
    .line 237
    :cond_8
    new-instance v13, La/ddr0;

    .line 238
    .line 239
    const/16 v19, 0x0

    .line 240
    .line 241
    const/16 v20, 0x5

    .line 242
    .line 243
    const/4 v14, 0x1

    .line 244
    const-class v16, La/fir0;

    .line 245
    .line 246
    const-string v17, "onAction"

    .line 247
    .line 248
    const-string v18, "onAction(Lorg/xplatform/toto_bet/active_tirage/presentation/TotoActiveTirageAction;)V"

    .line 249
    .line 250
    invoke-direct/range {v13 .. v20}, La/ddr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    move-object v3, v13

    .line 257
    :cond_9
    check-cast v3, La/jhy;

    .line 258
    .line 259
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 260
    .line 261
    invoke-static {v12, v1, v3, v4, v7}, La/wha0;->E(La/mm40;La/air0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_a
    invoke-virtual {v4}, La/fet;->X()V

    .line 266
    .line 267
    .line 268
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
