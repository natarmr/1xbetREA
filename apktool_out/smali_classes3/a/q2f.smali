.class public final synthetic La/q2f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t2f;


# direct methods
.method public synthetic constructor <init>(La/t2f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q2f;->a:B

    iput-object p1, p0, La/q2f;->b:La/t2f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q2f;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/q2f;->b:La/t2f;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Lkotlin/Unit;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v3, La/imm;

    .line 19
    .line 20
    new-instance v4, La/ilm;

    .line 21
    .line 22
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 23
    .line 24
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 29
    .line 30
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    invoke-direct {v4, v5, v6}, La/ilm;-><init>(J)V

    .line 35
    .line 36
    .line 37
    new-instance v5, La/plm;

    .line 38
    .line 39
    iget-object v0, v0, La/t2f;->b:La/ctf0;

    .line 40
    .line 41
    new-array v1, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 44
    .line 45
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const v2, 0x7f1311b5

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 61
    .line 62
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    sget-object v6, La/fa50;->a:La/fa50;

    .line 67
    .line 68
    invoke-direct {v5, v0, v1, v2, v6}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 76
    .line 77
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v10, 0x0

    .line 83
    sget-object v6, La/fmm;->a:La/fmm;

    .line 84
    .line 85
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 86
    .line 87
    .line 88
    return-object v3

    .line 89
    :pswitch_0
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, La/s2f;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v4, v1, La/s2f;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v1, v1, La/s2f;->b:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v0, v0, La/t2f;->b:La/ctf0;

    .line 101
    .line 102
    new-instance v3, La/c6q0;

    .line 103
    .line 104
    new-instance v7, La/s7q0;

    .line 105
    .line 106
    if-nez v1, :cond_0

    .line 107
    .line 108
    const-string v5, ""

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    move-object v5, v1

    .line 112
    :goto_0
    invoke-direct {v7, v5}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    if-eqz v1, :cond_1

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    move v9, v1

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    move v9, v2

    .line 121
    :goto_1
    new-instance v10, La/y5q0;

    .line 122
    .line 123
    const/4 v1, 0x3

    .line 124
    const/4 v5, 0x6

    .line 125
    const/4 v6, 0x0

    .line 126
    invoke-direct {v10, v1, v6, v6, v5}, La/y5q0;-><init>(ILa/vuu0;La/oie;I)V

    .line 127
    .line 128
    .line 129
    new-array v1, v2, [Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 132
    .line 133
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const v2, 0x7f130532

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    const-string v15, "0123456789-"

    .line 145
    .line 146
    const v16, 0x3bd00

    .line 147
    .line 148
    .line 149
    sget-object v5, La/e6q0;->a:La/e6q0;

    .line 150
    .line 151
    sget-object v6, La/o6q0;->a:La/o6q0;

    .line 152
    .line 153
    const/4 v8, 0x1

    .line 154
    const/4 v12, 0x0

    .line 155
    const/4 v13, 0x0

    .line 156
    const/4 v14, 0x0

    .line 157
    invoke-direct/range {v3 .. v16}, La/c6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 158
    .line 159
    .line 160
    return-object v3

    .line 161
    :pswitch_1
    move-object/from16 v1, p1

    .line 162
    .line 163
    check-cast v1, La/r2f;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-boolean v3, v1, La/r2f;->a:Z

    .line 169
    .line 170
    iget-boolean v4, v1, La/r2f;->b:Z

    .line 171
    .line 172
    iget-boolean v9, v1, La/r2f;->c:Z

    .line 173
    .line 174
    iget-object v0, v0, La/t2f;->b:La/ctf0;

    .line 175
    .line 176
    new-array v1, v2, [Ljava/lang/Object;

    .line 177
    .line 178
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 179
    .line 180
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const v6, 0x7f1311b3

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    new-array v5, v2, [Ljava/lang/Object;

    .line 192
    .line 193
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 194
    .line 195
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const v5, 0x7f130435

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    new-instance v2, La/itl;

    .line 207
    .line 208
    new-instance v10, La/wul;

    .line 209
    .line 210
    sget-object v11, La/nul;->e:La/nul;

    .line 211
    .line 212
    sget-object v7, La/oe9;->a:La/oe9;

    .line 213
    .line 214
    new-instance v13, La/ue9;

    .line 215
    .line 216
    invoke-direct {v13, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/4 v15, 0x0

    .line 220
    const/16 v16, 0x1

    .line 221
    .line 222
    const/4 v14, 0x1

    .line 223
    move-object v12, v7

    .line 224
    invoke-direct/range {v10 .. v16}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 225
    .line 226
    .line 227
    sget-object v1, La/rk;->t:La/rk;

    .line 228
    .line 229
    invoke-direct {v2, v10, v1}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 230
    .line 231
    .line 232
    new-instance v1, La/itl;

    .line 233
    .line 234
    new-instance v5, La/wul;

    .line 235
    .line 236
    sget-object v6, La/lul;->e:La/lul;

    .line 237
    .line 238
    new-instance v8, La/ue9;

    .line 239
    .line 240
    invoke-direct {v8, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    const/4 v10, 0x0

    .line 244
    const/4 v11, 0x1

    .line 245
    invoke-direct/range {v5 .. v11}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 246
    .line 247
    .line 248
    sget-object v0, La/rk;->s:La/rk;

    .line 249
    .line 250
    invoke-direct {v1, v5, v0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 251
    .line 252
    .line 253
    if-eqz v3, :cond_2

    .line 254
    .line 255
    if-nez v4, :cond_2

    .line 256
    .line 257
    new-instance v0, La/mtl;

    .line 258
    .line 259
    filled-new-array {v2, v1}, [La/itl;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-direct {v0, v1}, La/mtl;-><init>(La/a4x;)V

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_2
    new-instance v0, La/mtl;

    .line 272
    .line 273
    filled-new-array {v1}, [La/itl;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-direct {v0, v1}, La/mtl;-><init>(La/a4x;)V

    .line 282
    .line 283
    .line 284
    :goto_2
    return-object v0

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
