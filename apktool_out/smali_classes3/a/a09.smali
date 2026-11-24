.class public final synthetic La/a09;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b09;


# direct methods
.method public synthetic constructor <init>(La/b09;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a09;->a:B

    iput-object p1, p0, La/a09;->b:La/b09;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a09;->a:B

    .line 4
    .line 5
    const/16 v2, 0x7f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/a09;->b:La/b09;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v1, La/mtl;

    .line 14
    .line 15
    new-instance v2, La/itl;

    .line 16
    .line 17
    new-instance v4, La/wul;

    .line 18
    .line 19
    sget-object v5, La/nul;->e:La/nul;

    .line 20
    .line 21
    sget-object v6, La/oe9;->a:La/oe9;

    .line 22
    .line 23
    new-instance v7, La/ue9;

    .line 24
    .line 25
    iget-object v0, v0, La/b09;->b:La/ctf0;

    .line 26
    .line 27
    new-array v8, v3, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v9, v0, La/ctf0;->b:La/lsm0;

    .line 30
    .line 31
    invoke-static {v8, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    const v10, 0x7f131164

    .line 36
    .line 37
    .line 38
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-direct {v7, v8}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x1

    .line 47
    const/4 v8, 0x1

    .line 48
    invoke-direct/range {v4 .. v10}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 49
    .line 50
    .line 51
    sget-object v5, La/wz8;->a:La/wz8;

    .line 52
    .line 53
    invoke-direct {v2, v4, v5}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, La/itl;

    .line 57
    .line 58
    move-object v8, v6

    .line 59
    new-instance v6, La/wul;

    .line 60
    .line 61
    sget-object v7, La/lul;->e:La/lul;

    .line 62
    .line 63
    new-instance v9, La/ue9;

    .line 64
    .line 65
    new-array v5, v3, [Ljava/lang/Object;

    .line 66
    .line 67
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 68
    .line 69
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const v5, 0x7f1312c2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {v9, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x1

    .line 85
    invoke-direct/range {v6 .. v12}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 86
    .line 87
    .line 88
    sget-object v0, La/rz8;->a:La/rz8;

    .line 89
    .line 90
    invoke-direct {v4, v6, v0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 91
    .line 92
    .line 93
    filled-new-array {v2, v4}, [La/itl;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-direct {v1, v0}, La/mtl;-><init>(La/a4x;)V

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :pswitch_0
    new-instance v1, La/hjm;

    .line 106
    .line 107
    iget-object v0, v0, La/b09;->b:La/ctf0;

    .line 108
    .line 109
    new-array v4, v3, [Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 112
    .line 113
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const v4, 0x7f1301bd

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    new-instance v4, La/ojm;

    .line 125
    .line 126
    invoke-direct {v4, v2}, La/ojm;-><init>(I)V

    .line 127
    .line 128
    .line 129
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 130
    .line 131
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 136
    .line 137
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    new-instance v0, La/y3d;

    .line 142
    .line 143
    invoke-direct {v0, v5, v6}, La/y3d;-><init>(J)V

    .line 144
    .line 145
    .line 146
    const/4 v14, 0x0

    .line 147
    const/16 v15, 0x1ff8

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    const/4 v7, 0x0

    .line 151
    const/4 v8, 0x0

    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v10, 0x0

    .line 154
    const/4 v11, 0x0

    .line 155
    const/4 v12, 0x0

    .line 156
    const/4 v13, 0x0

    .line 157
    move-object v5, v0

    .line 158
    move-object v2, v1

    .line 159
    invoke-direct/range {v2 .. v15}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 160
    .line 161
    .line 162
    return-object v2

    .line 163
    :pswitch_1
    new-instance v1, La/hjm;

    .line 164
    .line 165
    iget-object v0, v0, La/b09;->b:La/ctf0;

    .line 166
    .line 167
    new-array v4, v3, [Ljava/lang/Object;

    .line 168
    .line 169
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 170
    .line 171
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    const v4, 0x7f130301

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    new-instance v5, La/ojm;

    .line 183
    .line 184
    invoke-direct {v5, v2}, La/ojm;-><init>(I)V

    .line 185
    .line 186
    .line 187
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 188
    .line 189
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 194
    .line 195
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    new-instance v6, La/y3d;

    .line 200
    .line 201
    invoke-direct {v6, v2, v3}, La/y3d;-><init>(J)V

    .line 202
    .line 203
    .line 204
    const/4 v15, 0x0

    .line 205
    const/16 v16, 0x1ff8

    .line 206
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
    const/4 v14, 0x0

    .line 215
    move-object v3, v1

    .line 216
    invoke-direct/range {v3 .. v16}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 217
    .line 218
    .line 219
    return-object v3

    .line 220
    :pswitch_2
    new-instance v4, La/imm;

    .line 221
    .line 222
    new-instance v5, La/ilm;

    .line 223
    .line 224
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 225
    .line 226
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 231
    .line 232
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v1

    .line 236
    invoke-direct {v5, v1, v2}, La/ilm;-><init>(J)V

    .line 237
    .line 238
    .line 239
    new-instance v6, La/plm;

    .line 240
    .line 241
    iget-object v0, v0, La/b09;->b:La/ctf0;

    .line 242
    .line 243
    new-array v1, v3, [Ljava/lang/Object;

    .line 244
    .line 245
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 246
    .line 247
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    const v2, 0x7f130ab4

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 263
    .line 264
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 265
    .line 266
    .line 267
    move-result-wide v1

    .line 268
    sget-object v3, La/fa50;->a:La/fa50;

    .line 269
    .line 270
    invoke-direct {v6, v0, v1, v2, v3}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

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
    move-result-wide v8

    .line 283
    const/4 v10, 0x1

    .line 284
    const/4 v11, 0x0

    .line 285
    sget-object v7, La/fmm;->a:La/fmm;

    .line 286
    .line 287
    invoke-direct/range {v4 .. v11}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 288
    .line 289
    .line 290
    return-object v4

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
