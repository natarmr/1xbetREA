.class public final synthetic La/yw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/era0;ZZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 3
    iput-byte p6, p0, La/yw;->a:B

    iput-object p1, p0, La/yw;->b:Ljava/lang/Object;

    iput-boolean p2, p0, La/yw;->c:Z

    iput-boolean p3, p0, La/yw;->d:Z

    iput-object p4, p0, La/yw;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;ZZIB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/yw;->a:B

    iput-object p1, p0, La/yw;->b:Ljava/lang/Object;

    iput-object p2, p0, La/yw;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/yw;->c:Z

    iput-boolean p4, p0, La/yw;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ZZLkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/yw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yw;->b:Ljava/lang/Object;

    iput-boolean p2, p0, La/yw;->c:Z

    iput-boolean p3, p0, La/yw;->d:Z

    iput-object p4, p0, La/yw;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yw;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/yw;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/yw;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v5, v4

    .line 14
    check-cast v5, La/mm40;

    .line 15
    .line 16
    move-object v6, v3

    .line 17
    check-cast v6, La/ogs0;

    .line 18
    .line 19
    move-object/from16 v9, p1

    .line 20
    .line 21
    check-cast v9, La/fet;

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, La/x8x;->L(I)I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    iget-boolean v7, v0, La/yw;->c:Z

    .line 35
    .line 36
    iget-boolean v8, v0, La/yw;->d:Z

    .line 37
    .line 38
    invoke-static/range {v5 .. v10}, La/vds0;->a(La/mm40;La/ogs0;ZZLa/fet;I)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    move-object v1, v4

    .line 45
    check-cast v1, La/cra0;

    .line 46
    .line 47
    move-object v4, v3

    .line 48
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    move-object/from16 v5, p1

    .line 51
    .line 52
    check-cast v5, La/fet;

    .line 53
    .line 54
    move-object/from16 v3, p2

    .line 55
    .line 56
    check-cast v3, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, La/x8x;->L(I)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    iget-boolean v2, v0, La/yw;->c:Z

    .line 66
    .line 67
    iget-boolean v3, v0, La/yw;->d:Z

    .line 68
    .line 69
    invoke-static/range {v1 .. v6}, La/y860;->L(La/cra0;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_1
    move-object v1, v4

    .line 76
    check-cast v1, La/ara0;

    .line 77
    .line 78
    move-object v4, v3

    .line 79
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 80
    .line 81
    move-object/from16 v5, p1

    .line 82
    .line 83
    check-cast v5, La/fet;

    .line 84
    .line 85
    move-object/from16 v3, p2

    .line 86
    .line 87
    check-cast v3, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, La/x8x;->L(I)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    iget-boolean v2, v0, La/yw;->c:Z

    .line 97
    .line 98
    iget-boolean v3, v0, La/yw;->d:Z

    .line 99
    .line 100
    invoke-static/range {v1 .. v6}, La/y860;->J(La/ara0;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_2
    move-object v1, v4

    .line 107
    check-cast v1, La/dra0;

    .line 108
    .line 109
    move-object v4, v3

    .line 110
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 111
    .line 112
    move-object/from16 v5, p1

    .line 113
    .line 114
    check-cast v5, La/fet;

    .line 115
    .line 116
    move-object/from16 v3, p2

    .line 117
    .line 118
    check-cast v3, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v2}, La/x8x;->L(I)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    iget-boolean v2, v0, La/yw;->c:Z

    .line 128
    .line 129
    iget-boolean v3, v0, La/yw;->d:Z

    .line 130
    .line 131
    invoke-static/range {v1 .. v6}, La/y860;->M(La/dra0;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_3
    check-cast v4, La/mm40;

    .line 138
    .line 139
    move-object v9, v3

    .line 140
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 141
    .line 142
    move-object/from16 v10, p1

    .line 143
    .line 144
    check-cast v10, La/fet;

    .line 145
    .line 146
    move-object/from16 v1, p2

    .line 147
    .line 148
    check-cast v1, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    and-int/lit8 v3, v1, 0x3

    .line 155
    .line 156
    const/4 v5, 0x2

    .line 157
    if-eq v3, v5, :cond_0

    .line 158
    .line 159
    move v3, v2

    .line 160
    goto :goto_0

    .line 161
    :cond_0
    const/4 v3, 0x0

    .line 162
    :goto_0
    and-int/2addr v1, v2

    .line 163
    invoke-virtual {v10, v1, v3}, La/fet;->U(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_1

    .line 168
    .line 169
    sget v1, La/yom;->a:F

    .line 170
    .line 171
    invoke-static {v4, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    new-instance v8, La/utd0;

    .line 176
    .line 177
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 178
    .line 179
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 184
    .line 185
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 186
    .line 187
    .line 188
    move-result-wide v12

    .line 189
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 194
    .line 195
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v14

    .line 199
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 204
    .line 205
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 206
    .line 207
    .line 208
    move-result-wide v2

    .line 209
    const/high16 v4, 0x3f000000    # 0.5f

    .line 210
    .line 211
    invoke-static {v4, v2, v3}, La/y3d;->c(FJ)J

    .line 212
    .line 213
    .line 214
    move-result-wide v16

    .line 215
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 220
    .line 221
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v1

    .line 225
    invoke-static {v4, v1, v2}, La/y3d;->c(FJ)J

    .line 226
    .line 227
    .line 228
    move-result-wide v18

    .line 229
    move-object v11, v8

    .line 230
    invoke-direct/range {v11 .. v19}, La/utd0;-><init>(JJJJ)V

    .line 231
    .line 232
    .line 233
    const/4 v11, 0x0

    .line 234
    iget-boolean v6, v0, La/yw;->c:Z

    .line 235
    .line 236
    iget-boolean v7, v0, La/yw;->d:Z

    .line 237
    .line 238
    invoke-static/range {v5 .. v11}, La/yom;->a(La/mm40;ZZLa/utd0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_1
    invoke-virtual {v10}, La/fet;->X()V

    .line 243
    .line 244
    .line 245
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_4
    move-object v1, v4

    .line 249
    check-cast v1, La/mm40;

    .line 250
    .line 251
    move-object v2, v3

    .line 252
    check-cast v2, La/roh;

    .line 253
    .line 254
    move-object/from16 v5, p1

    .line 255
    .line 256
    check-cast v5, La/fet;

    .line 257
    .line 258
    move-object/from16 v3, p2

    .line 259
    .line 260
    check-cast v3, Ljava/lang/Integer;

    .line 261
    .line 262
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    const/16 v3, 0xc01

    .line 266
    .line 267
    invoke-static {v3}, La/x8x;->L(I)I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    iget-boolean v3, v0, La/yw;->c:Z

    .line 272
    .line 273
    iget-boolean v4, v0, La/yw;->d:Z

    .line 274
    .line 275
    invoke-static/range {v1 .. v6}, La/u1c;->q(La/mm40;La/roh;ZZLa/fet;I)V

    .line 276
    .line 277
    .line 278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_5
    move-object v1, v4

    .line 282
    check-cast v1, La/mm40;

    .line 283
    .line 284
    check-cast v3, La/ex;

    .line 285
    .line 286
    move-object/from16 v5, p1

    .line 287
    .line 288
    check-cast v5, La/fet;

    .line 289
    .line 290
    move-object/from16 v4, p2

    .line 291
    .line 292
    check-cast v4, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-static {v2}, La/x8x;->L(I)I

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    move-object v2, v3

    .line 302
    iget-boolean v3, v0, La/yw;->c:Z

    .line 303
    .line 304
    iget-boolean v4, v0, La/yw;->d:Z

    .line 305
    .line 306
    invoke-static/range {v1 .. v6}, La/vbw0;->a(La/mm40;La/ex;ZZLa/fet;I)V

    .line 307
    .line 308
    .line 309
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
