.class public final synthetic La/zf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kg0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/kg0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zf0;->a:B

    iput-object p1, p0, La/zf0;->b:La/kg0;

    iput-object p2, p0, La/zf0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zf0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, La/zf0;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object v0, v0, La/zf0;->b:La/kg0;

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
    move-object/from16 v6, p2

    .line 20
    .line 21
    check-cast v6, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    and-int/lit8 v7, v6, 0x3

    .line 28
    .line 29
    if-eq v7, v3, :cond_0

    .line 30
    .line 31
    move v2, v4

    .line 32
    :cond_0
    and-int/lit8 v3, v6, 0x1

    .line 33
    .line 34
    invoke-virtual {v1, v3, v2}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    sget-object v2, La/jm40;->b:La/jm40;

    .line 41
    .line 42
    const-string v3, "TOP_CONTENT"

    .line 43
    .line 44
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v0, v0, La/kg0;->f:La/ya0;

    .line 49
    .line 50
    const/4 v3, 0x6

    .line 51
    invoke-static {v2, v0, v5, v1, v3}, La/q8a;->I(La/mm40;La/ya0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 56
    .line 57
    .line 58
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_0
    move-object/from16 v13, p1

    .line 62
    .line 63
    check-cast v13, La/fet;

    .line 64
    .line 65
    move-object/from16 v1, p2

    .line 66
    .line 67
    check-cast v1, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    and-int/lit8 v6, v1, 0x3

    .line 74
    .line 75
    if-eq v6, v3, :cond_2

    .line 76
    .line 77
    move v2, v4

    .line 78
    :cond_2
    and-int/2addr v1, v4

    .line 79
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    new-instance v14, La/imm;

    .line 86
    .line 87
    new-instance v15, La/ilm;

    .line 88
    .line 89
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 90
    .line 91
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 96
    .line 97
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    invoke-direct {v15, v2, v3}, La/ilm;-><init>(J)V

    .line 102
    .line 103
    .line 104
    new-instance v2, La/plm;

    .line 105
    .line 106
    iget-object v0, v0, La/kg0;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 113
    .line 114
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 115
    .line 116
    .line 117
    move-result-wide v3

    .line 118
    sget-object v6, La/fa50;->a:La/fa50;

    .line 119
    .line 120
    invoke-direct {v2, v0, v3, v4, v6}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, La/dmm;

    .line 124
    .line 125
    new-instance v3, La/ta50;

    .line 126
    .line 127
    new-instance v6, La/wkm;

    .line 128
    .line 129
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 134
    .line 135
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 136
    .line 137
    .line 138
    move-result-wide v11

    .line 139
    const/4 v7, 0x0

    .line 140
    const v8, 0x7f0809ee

    .line 141
    .line 142
    .line 143
    const/4 v9, 0x1

    .line 144
    sget-object v10, La/ra50;->a:La/ra50;

    .line 145
    .line 146
    invoke-direct/range {v6 .. v12}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 147
    .line 148
    .line 149
    invoke-direct {v3, v6}, La/ta50;-><init>(La/wkm;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {v0, v3}, La/dmm;-><init>(La/wa50;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 160
    .line 161
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 162
    .line 163
    .line 164
    move-result-wide v18

    .line 165
    const/16 v20, 0x0

    .line 166
    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    move-object/from16 v17, v0

    .line 170
    .line 171
    move-object/from16 v16, v2

    .line 172
    .line 173
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    sget-object v2, La/ukd;->a:La/cl5;

    .line 185
    .line 186
    if-nez v0, :cond_3

    .line 187
    .line 188
    if-ne v1, v2, :cond_4

    .line 189
    .line 190
    :cond_3
    new-instance v1, La/dn;

    .line 191
    .line 192
    const/16 v0, 0x11

    .line 193
    .line 194
    invoke-direct {v1, v5, v0}, La/dn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_4
    move-object v4, v1

    .line 201
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 202
    .line 203
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-nez v0, :cond_5

    .line 212
    .line 213
    if-ne v1, v2, :cond_6

    .line 214
    .line 215
    :cond_5
    new-instance v1, La/y7;

    .line 216
    .line 217
    const/16 v0, 0x12

    .line 218
    .line 219
    invoke-direct {v1, v5, v0}, La/y7;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_6
    move-object v6, v1

    .line 226
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 227
    .line 228
    const/4 v15, 0x0

    .line 229
    const/16 v16, 0xfd5

    .line 230
    .line 231
    const/4 v1, 0x0

    .line 232
    const/4 v3, 0x0

    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v7, 0x0

    .line 235
    const/4 v8, 0x0

    .line 236
    const/4 v9, 0x0

    .line 237
    const/4 v10, 0x0

    .line 238
    const/4 v11, 0x0

    .line 239
    const/4 v12, 0x0

    .line 240
    move-object v2, v14

    .line 241
    const/4 v14, 0x0

    .line 242
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 247
    .line 248
    .line 249
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object v0

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
