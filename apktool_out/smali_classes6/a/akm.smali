.class public final synthetic La/akm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(JFFLa/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/akm;->a:J

    iput p3, p0, La/akm;->b:F

    iput p4, p0, La/akm;->c:F

    iput-object p5, p0, La/akm;->d:La/l7m0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    move-object/from16 v7, p2

    .line 12
    .line 13
    check-cast v7, La/fet;

    .line 14
    .line 15
    move-object/from16 v2, p3

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    and-int/lit8 v3, v2, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v7, v1}, La/fet;->h(Z)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v2, v3

    .line 37
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 38
    .line 39
    const/16 v4, 0x12

    .line 40
    .line 41
    const/4 v10, 0x1

    .line 42
    const/4 v11, 0x0

    .line 43
    if-eq v3, v4, :cond_2

    .line 44
    .line 45
    move v3, v10

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v3, v11

    .line 48
    :goto_1
    and-int/2addr v2, v10

    .line 49
    invoke-virtual {v7, v2, v3}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    sget-object v2, La/jm40;->b:La/jm40;

    .line 56
    .line 57
    const/high16 v3, 0x41c00000    # 24.0f

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    const v1, -0x6d9d03e0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v1}, La/fet;->e0(I)V

    .line 65
    .line 66
    .line 67
    sget-object v1, La/qmk;->a:La/zcl;

    .line 68
    .line 69
    invoke-static {v2, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 74
    .line 75
    invoke-static {v1, v3}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v3, La/jd8;->n:La/ljc;

    .line 80
    .line 81
    iget-wide v4, v0, La/akm;->a:J

    .line 82
    .line 83
    invoke-static {v1, v4, v5, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 88
    .line 89
    invoke-static {v3, v11}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-wide v5, v7, La/fet;->T:J

    .line 94
    .line 95
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v7, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7}, La/fet;->i0()V

    .line 113
    .line 114
    .line 115
    iget-boolean v8, v7, La/fet;->S:Z

    .line 116
    .line 117
    if-eqz v8, :cond_3

    .line 118
    .line 119
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 120
    .line 121
    invoke-virtual {v7, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    invoke-virtual {v7}, La/fet;->r0()V

    .line 126
    .line 127
    .line 128
    :goto_2
    sget-object v8, La/gqw0;->x:La/shd;

    .line 129
    .line 130
    invoke-static {v7, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    sget-object v4, La/gqw0;->w:La/shd;

    .line 134
    .line 135
    invoke-static {v7, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    sget-object v5, La/gqw0;->y:La/shd;

    .line 143
    .line 144
    invoke-static {v7, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v7}, La/jpm0;->n(La/fet;)V

    .line 148
    .line 149
    .line 150
    sget-object v4, La/gqw0;->v:La/shd;

    .line 151
    .line 152
    invoke-static {v7, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    const v1, 0x7f0806fa

    .line 156
    .line 157
    .line 158
    invoke-static {v1, v11, v7}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 163
    .line 164
    invoke-virtual {v7, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 169
    .line 170
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 171
    .line 172
    .line 173
    move-result-wide v5

    .line 174
    iget-object v4, v0, La/akm;->d:La/l7m0;

    .line 175
    .line 176
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    check-cast v4, La/ycl;

    .line 181
    .line 182
    iget v4, v4, La/ycl;->a:F

    .line 183
    .line 184
    invoke-static {v2, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    const/16 v30, 0x0

    .line 189
    .line 190
    const v31, 0xffffc

    .line 191
    .line 192
    .line 193
    iget v13, v0, La/akm;->c:F

    .line 194
    .line 195
    const/4 v15, 0x0

    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const/16 v18, 0x0

    .line 201
    .line 202
    const/16 v19, 0x0

    .line 203
    .line 204
    const/16 v20, 0x0

    .line 205
    .line 206
    const-wide/16 v21, 0x0

    .line 207
    .line 208
    const/16 v23, 0x0

    .line 209
    .line 210
    const/16 v24, 0x0

    .line 211
    .line 212
    const-wide/16 v25, 0x0

    .line 213
    .line 214
    const-wide/16 v27, 0x0

    .line 215
    .line 216
    const/16 v29, 0x0

    .line 217
    .line 218
    move v14, v13

    .line 219
    invoke-static/range {v12 .. v31}, La/i4w0;->U(La/mm40;FFFFFFFFJLa/yjj0;ZJJILa/z5z;I)La/mm40;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sget-object v2, La/jr8;->a:La/jr8;

    .line 224
    .line 225
    invoke-virtual {v2, v0, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    const-string v2, "ICON_CHECKBOX_ACTIVE"

    .line 230
    .line 231
    invoke-static {v0, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    const/16 v8, 0x38

    .line 236
    .line 237
    const/4 v9, 0x0

    .line 238
    const/4 v3, 0x0

    .line 239
    move-object v2, v1

    .line 240
    invoke-static/range {v2 .. v9}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_4
    const v1, -0x6d8fce55

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7, v1}, La/fet;->e0(I)V

    .line 254
    .line 255
    .line 256
    sget-object v1, La/qmk;->a:La/zcl;

    .line 257
    .line 258
    invoke-static {v2, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 263
    .line 264
    invoke-virtual {v7, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 269
    .line 270
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 271
    .line 272
    .line 273
    move-result-wide v2

    .line 274
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 275
    .line 276
    iget v0, v0, La/akm;->b:F

    .line 277
    .line 278
    invoke-static {v1, v0, v2, v3, v4}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v11, v7, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_5
    invoke-virtual {v7}, La/fet;->X()V

    .line 290
    .line 291
    .line 292
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0
.end method
