.class public abstract La/srm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/uts0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/ihn;->d:La/z73;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x5dc

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v2, v3, v0, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/srm;->a:La/uts0;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(ILa/fet;La/mm40;)V
    .locals 14

    .line 1
    move-object v5, p1

    .line 2
    move-object/from16 v8, p2

    .line 3
    .line 4
    const v0, 0x7ff97101

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    or-int/2addr v0, p0

    .line 21
    and-int/lit8 v2, v0, 0x3

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x1

    .line 25
    if-eq v2, v1, :cond_1

    .line 26
    .line 27
    move v1, v10

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v9

    .line 30
    :goto_1
    and-int/2addr v0, v10

    .line 31
    invoke-virtual {p1, v0, v1}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_8

    .line 36
    .line 37
    sget-object v0, La/qmk;->a:La/zcl;

    .line 38
    .line 39
    const/high16 v0, 0x41600000    # 14.0f

    .line 40
    .line 41
    invoke-static {v8, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 46
    .line 47
    invoke-static {v2, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-wide v3, v5, La/fet;->T:J

    .line 52
    .line 53
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {p1, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, La/fet;->i0()V

    .line 71
    .line 72
    .line 73
    iget-boolean v6, v5, La/fet;->S:Z

    .line 74
    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 78
    .line 79
    invoke-virtual {p1, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual {p1}, La/fet;->r0()V

    .line 84
    .line 85
    .line 86
    :goto_2
    sget-object v6, La/gqw0;->x:La/shd;

    .line 87
    .line 88
    invoke-static {p1, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 89
    .line 90
    .line 91
    sget-object v2, La/gqw0;->w:La/shd;

    .line 92
    .line 93
    invoke-static {p1, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    sget-object v3, La/gqw0;->y:La/shd;

    .line 101
    .line 102
    invoke-static {p1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, La/gqw0;->v:La/shd;

    .line 109
    .line 110
    invoke-static {p1, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    sget-object v2, La/ukd;->a:La/cl5;

    .line 118
    .line 119
    if-ne v1, v2, :cond_3

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    invoke-static {v1}, La/xf0;->c(F)La/t33;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    check-cast v1, La/t33;

    .line 130
    .line 131
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    if-nez v4, :cond_4

    .line 142
    .line 143
    if-ne v6, v2, :cond_5

    .line 144
    .line 145
    :cond_4
    new-instance v6, La/ya;

    .line 146
    .line 147
    const/16 v4, 0x1d

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    invoke-direct {v6, v1, v7, v4}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 157
    .line 158
    invoke-static {p1, v3, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 159
    .line 160
    .line 161
    const v3, 0x7f08091f

    .line 162
    .line 163
    .line 164
    invoke-static {v3, v9, p1}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    sget-object v11, La/zaq0;->b:La/zfn;

    .line 169
    .line 170
    invoke-virtual {p1, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 175
    .line 176
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 177
    .line 178
    .line 179
    move-result-wide v6

    .line 180
    sget-object v12, La/jm40;->b:La/jm40;

    .line 181
    .line 182
    invoke-static {v12, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    if-nez v4, :cond_6

    .line 195
    .line 196
    if-ne v13, v2, :cond_7

    .line 197
    .line 198
    :cond_6
    new-instance v13, La/m53;

    .line 199
    .line 200
    const/16 v2, 0xa

    .line 201
    .line 202
    invoke-direct {v13, v1, v2}, La/m53;-><init>(La/t33;B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_7
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 209
    .line 210
    invoke-static {v0, v13}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    move-object v0, v3

    .line 215
    move-wide v3, v6

    .line 216
    const/16 v6, 0x38

    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/4 v1, 0x0

    .line 220
    invoke-static/range {v0 .. v7}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40c00000    # 6.0f

    .line 224
    .line 225
    invoke-static {v12, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {p1, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 234
    .line 235
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v1

    .line 239
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 240
    .line 241
    invoke-static {v0, v1, v2, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-static {v9, p1, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v10}, La/fet;->r(Z)V

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_8
    invoke-virtual {p1}, La/fet;->X()V

    .line 253
    .line 254
    .line 255
    :goto_3
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_9

    .line 260
    .line 261
    new-instance v1, La/xml;

    .line 262
    .line 263
    const/16 v2, 0xd

    .line 264
    .line 265
    invoke-direct {v1, v8, v9, p0, v2}, La/xml;-><init>(La/mm40;ZIB)V

    .line 266
    .line 267
    .line 268
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 269
    .line 270
    :cond_9
    return-void
.end method
