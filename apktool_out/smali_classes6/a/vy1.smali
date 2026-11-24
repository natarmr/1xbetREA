.class public final synthetic La/vy1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kz1;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/kz1;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/vy1;->a:B

    iput-object p1, p0, La/vy1;->b:La/kz1;

    iput-object p2, p0, La/vy1;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/kz1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    iput-byte p3, p0, La/vy1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vy1;->b:La/kz1;

    iput-object p2, p0, La/vy1;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vy1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, La/vy1;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object v0, v0, La/vy1;->b:La/kz1;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fet;

    .line 18
    .line 19
    move-object/from16 v2, p2

    .line 20
    .line 21
    check-cast v2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v4}, La/x8x;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v0, v5, v1, v2}, La/ccq0;->a(La/kz1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, La/fet;

    .line 39
    .line 40
    move-object/from16 v6, p2

    .line 41
    .line 42
    check-cast v6, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    and-int/lit8 v7, v6, 0x3

    .line 49
    .line 50
    if-eq v7, v3, :cond_0

    .line 51
    .line 52
    move v2, v4

    .line 53
    :cond_0
    and-int/lit8 v3, v6, 0x1

    .line 54
    .line 55
    invoke-virtual {v1, v3, v2}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    sget-object v2, La/jm40;->b:La/jm40;

    .line 62
    .line 63
    const-string v3, "TOP_CONTENT"

    .line 64
    .line 65
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v0, v0, La/kz1;->c:La/ya0;

    .line 70
    .line 71
    const/4 v3, 0x6

    .line 72
    invoke-static {v2, v0, v5, v1, v3}, La/ccq0;->N(La/mm40;La/ya0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 77
    .line 78
    .line 79
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    move-object/from16 v13, p1

    .line 83
    .line 84
    check-cast v13, La/fet;

    .line 85
    .line 86
    move-object/from16 v1, p2

    .line 87
    .line 88
    check-cast v1, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    and-int/lit8 v6, v1, 0x3

    .line 95
    .line 96
    if-eq v6, v3, :cond_2

    .line 97
    .line 98
    move v2, v4

    .line 99
    :cond_2
    and-int/2addr v1, v4

    .line 100
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_7

    .line 105
    .line 106
    new-instance v14, La/imm;

    .line 107
    .line 108
    new-instance v15, La/ilm;

    .line 109
    .line 110
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 111
    .line 112
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 117
    .line 118
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    invoke-direct {v15, v2, v3}, La/ilm;-><init>(J)V

    .line 123
    .line 124
    .line 125
    new-instance v2, La/plm;

    .line 126
    .line 127
    iget-object v0, v0, La/kz1;->a:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 134
    .line 135
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 136
    .line 137
    .line 138
    move-result-wide v3

    .line 139
    sget-object v6, La/fa50;->a:La/fa50;

    .line 140
    .line 141
    invoke-direct {v2, v0, v3, v4, v6}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, La/dmm;

    .line 145
    .line 146
    new-instance v3, La/ta50;

    .line 147
    .line 148
    new-instance v6, La/wkm;

    .line 149
    .line 150
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 155
    .line 156
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 157
    .line 158
    .line 159
    move-result-wide v11

    .line 160
    const/4 v7, 0x0

    .line 161
    const v8, 0x7f0809ee

    .line 162
    .line 163
    .line 164
    const/4 v9, 0x1

    .line 165
    sget-object v10, La/ra50;->a:La/ra50;

    .line 166
    .line 167
    invoke-direct/range {v6 .. v12}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v3, v6}, La/ta50;-><init>(La/wkm;)V

    .line 171
    .line 172
    .line 173
    invoke-direct {v0, v3}, La/dmm;-><init>(La/wa50;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 181
    .line 182
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 183
    .line 184
    .line 185
    move-result-wide v18

    .line 186
    const/16 v20, 0x0

    .line 187
    .line 188
    const/16 v21, 0x0

    .line 189
    .line 190
    move-object/from16 v17, v0

    .line 191
    .line 192
    move-object/from16 v16, v2

    .line 193
    .line 194
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    sget-object v2, La/ukd;->a:La/cl5;

    .line 206
    .line 207
    if-nez v0, :cond_3

    .line 208
    .line 209
    if-ne v1, v2, :cond_4

    .line 210
    .line 211
    :cond_3
    new-instance v1, La/si1;

    .line 212
    .line 213
    const/16 v0, 0x15

    .line 214
    .line 215
    invoke-direct {v1, v5, v0}, La/si1;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_4
    move-object v4, v1

    .line 222
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 223
    .line 224
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-nez v0, :cond_5

    .line 233
    .line 234
    if-ne v1, v2, :cond_6

    .line 235
    .line 236
    :cond_5
    new-instance v1, La/h61;

    .line 237
    .line 238
    const/16 v0, 0x1b

    .line 239
    .line 240
    invoke-direct {v1, v5, v0}, La/h61;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_6
    move-object v6, v1

    .line 247
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    const/16 v16, 0xfd5

    .line 251
    .line 252
    const/4 v1, 0x0

    .line 253
    const/4 v3, 0x0

    .line 254
    const/4 v5, 0x0

    .line 255
    const/4 v7, 0x0

    .line 256
    const/4 v8, 0x0

    .line 257
    const/4 v9, 0x0

    .line 258
    const/4 v10, 0x0

    .line 259
    const/4 v11, 0x0

    .line 260
    const/4 v12, 0x0

    .line 261
    move-object v2, v14

    .line 262
    const/4 v14, 0x0

    .line 263
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 264
    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 268
    .line 269
    .line 270
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object v0

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
