.class public final synthetic La/kw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nw8;


# direct methods
.method public synthetic constructor <init>(La/nw8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kw8;->a:B

    iput-object p1, p0, La/kw8;->b:La/nw8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kw8;->a:B

    .line 4
    .line 5
    const/16 v2, 0x7f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/kw8;->b:La/nw8;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v4, La/hjm;

    .line 14
    .line 15
    iget-object v0, v0, La/nw8;->b:La/ctf0;

    .line 16
    .line 17
    new-array v1, v3, [Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 20
    .line 21
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v3, 0x7f131322

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, La/ojm;

    .line 33
    .line 34
    invoke-direct {v6, v2}, La/ojm;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 38
    .line 39
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 44
    .line 45
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    new-instance v7, La/y3d;

    .line 50
    .line 51
    invoke-direct {v7, v0, v1}, La/y3d;-><init>(J)V

    .line 52
    .line 53
    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    const/16 v17, 0x1ff8

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    const/4 v13, 0x0

    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v15, 0x0

    .line 66
    invoke-direct/range {v4 .. v17}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 67
    .line 68
    .line 69
    return-object v4

    .line 70
    :pswitch_0
    new-instance v1, La/mtl;

    .line 71
    .line 72
    new-instance v2, La/itl;

    .line 73
    .line 74
    new-instance v4, La/wul;

    .line 75
    .line 76
    sget-object v5, La/nul;->e:La/nul;

    .line 77
    .line 78
    sget-object v6, La/oe9;->a:La/oe9;

    .line 79
    .line 80
    new-instance v7, La/ue9;

    .line 81
    .line 82
    iget-object v0, v0, La/nw8;->b:La/ctf0;

    .line 83
    .line 84
    new-array v8, v3, [Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v9, v0, La/ctf0;->b:La/lsm0;

    .line 87
    .line 88
    invoke-static {v8, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const v10, 0x7f131164

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-direct {v7, v8}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v10, 0x1

    .line 104
    const/4 v8, 0x1

    .line 105
    invoke-direct/range {v4 .. v10}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 106
    .line 107
    .line 108
    sget-object v5, La/hw8;->a:La/hw8;

    .line 109
    .line 110
    invoke-direct {v2, v4, v5}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 111
    .line 112
    .line 113
    new-instance v4, La/itl;

    .line 114
    .line 115
    move-object v8, v6

    .line 116
    new-instance v6, La/wul;

    .line 117
    .line 118
    sget-object v7, La/lul;->e:La/lul;

    .line 119
    .line 120
    new-instance v9, La/ue9;

    .line 121
    .line 122
    new-array v5, v3, [Ljava/lang/Object;

    .line 123
    .line 124
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 125
    .line 126
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const v5, 0x7f1312c2

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-direct {v9, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x1

    .line 142
    invoke-direct/range {v6 .. v12}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 143
    .line 144
    .line 145
    sget-object v0, La/mv8;->a:La/mv8;

    .line 146
    .line 147
    invoke-direct {v4, v6, v0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 148
    .line 149
    .line 150
    filled-new-array {v2, v4}, [La/itl;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-direct {v1, v0}, La/mtl;-><init>(La/a4x;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :pswitch_1
    new-instance v1, La/hjm;

    .line 163
    .line 164
    iget-object v0, v0, La/nw8;->b:La/ctf0;

    .line 165
    .line 166
    new-array v4, v3, [Ljava/lang/Object;

    .line 167
    .line 168
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 169
    .line 170
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const v4, 0x7f130ab4

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    new-instance v4, La/ojm;

    .line 182
    .line 183
    invoke-direct {v4, v2}, La/ojm;-><init>(I)V

    .line 184
    .line 185
    .line 186
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 187
    .line 188
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 193
    .line 194
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v5

    .line 198
    new-instance v0, La/y3d;

    .line 199
    .line 200
    invoke-direct {v0, v5, v6}, La/y3d;-><init>(J)V

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const/16 v15, 0x1ff8

    .line 205
    .line 206
    const/4 v6, 0x0

    .line 207
    const/4 v7, 0x0

    .line 208
    const/4 v8, 0x0

    .line 209
    const/4 v9, 0x0

    .line 210
    const/4 v10, 0x0

    .line 211
    const/4 v11, 0x0

    .line 212
    const/4 v12, 0x0

    .line 213
    const/4 v13, 0x0

    .line 214
    move-object v5, v0

    .line 215
    move-object v2, v1

    .line 216
    invoke-direct/range {v2 .. v15}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 217
    .line 218
    .line 219
    return-object v2

    .line 220
    :pswitch_2
    new-instance v1, La/imm;

    .line 221
    .line 222
    new-instance v4, La/ilm;

    .line 223
    .line 224
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 225
    .line 226
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 231
    .line 232
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v5

    .line 236
    invoke-direct {v4, v5, v6}, La/ilm;-><init>(J)V

    .line 237
    .line 238
    .line 239
    new-instance v5, La/plm;

    .line 240
    .line 241
    iget-object v0, v0, La/nw8;->b:La/ctf0;

    .line 242
    .line 243
    new-array v2, v3, [Ljava/lang/Object;

    .line 244
    .line 245
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 246
    .line 247
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const v3, 0x7f13089a

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 263
    .line 264
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 265
    .line 266
    .line 267
    move-result-wide v2

    .line 268
    sget-object v6, La/fa50;->a:La/fa50;

    .line 269
    .line 270
    invoke-direct {v5, v0, v2, v3, v6}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 271
    .line 272
    .line 273
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 278
    .line 279
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 280
    .line 281
    .line 282
    move-result-wide v7

    .line 283
    const/4 v9, 0x1

    .line 284
    const/4 v10, 0x0

    .line 285
    sget-object v6, La/fmm;->a:La/fmm;

    .line 286
    .line 287
    move-object v3, v1

    .line 288
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 289
    .line 290
    .line 291
    return-object v3

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
