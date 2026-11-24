.class public final La/do20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b040;


# static fields
.field public static final b:La/wit;

.field public static final c:La/nfx0;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/wit;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/wit;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/do20;->b:La/wit;

    .line 8
    .line 9
    new-instance v0, La/nfx0;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/do20;->c:La/nfx0;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/fsd;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, La/do20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sparse-switch p2, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/sza;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La/do20;->a:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p2, La/sza;

    .line 23
    .line 24
    const/16 v0, 0xc

    .line 25
    .line 26
    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, La/do20;->a:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p2, La/sza;

    .line 36
    .line 37
    const/4 v0, 0x6

    .line 38
    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, La/do20;->a:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/gw8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, La/do20;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 49
    iput-object p1, p0, La/do20;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static q(Landroid/view/ViewGroup;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast v0, La/ble;

    .line 8
    .line 9
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    .line 16
    .line 17
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static r(Ljava/lang/String;La/lfx0;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/Date;

    .line 7
    .line 8
    iget-wide v2, p1, La/lfx0;->b:J

    .line 9
    .line 10
    const-wide/32 v4, 0xf4240

    .line 11
    .line 12
    .line 13
    div-long/2addr v2, v4

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 18
    .line 19
    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ": logging error ["

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, La/lfx0;->d:La/jgx0;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-static {v1, p1, v0}, La/ofm0;->D(ILa/jgx0;Ljava/lang/StringBuilder;)Z

    .line 42
    .line 43
    .line 44
    const-string p1, "]: "

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/io/PrintStream;->flush()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    const-string p0, "cannot request log site information prior to postProcess()"

    .line 64
    .line 65
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;La/qt20;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 26

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move-object/from16 v11, p6

    .line 6
    .line 7
    sget-object v0, La/qja;->j:La/qja;

    .line 8
    .line 9
    const v1, 0x1cf5556f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v11, v1}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v11, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v4

    .line 25
    :goto_0
    or-int v1, p7, v1

    .line 26
    .line 27
    move-object/from16 v13, p2

    .line 28
    .line 29
    invoke-virtual {v11, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    const/16 v6, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v6, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v1, v6

    .line 41
    move/from16 v14, p3

    .line 42
    .line 43
    invoke-virtual {v11, v14}, La/fet;->d(F)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    const/16 v6, 0x100

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v6, 0x80

    .line 53
    .line 54
    :goto_2
    or-int/2addr v1, v6

    .line 55
    invoke-virtual {v11, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    const/16 v6, 0x800

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v6, 0x400

    .line 65
    .line 66
    :goto_3
    or-int/2addr v1, v6

    .line 67
    move-object/from16 v15, p5

    .line 68
    .line 69
    invoke-virtual {v11, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    const/16 v6, 0x4000

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    const/16 v6, 0x2000

    .line 79
    .line 80
    :goto_4
    or-int/2addr v1, v6

    .line 81
    and-int/lit16 v6, v1, 0x2493

    .line 82
    .line 83
    const/16 v7, 0x2492

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    if-eq v6, v7, :cond_5

    .line 87
    .line 88
    const/4 v6, 0x1

    .line 89
    goto :goto_5

    .line 90
    :cond_5
    move v6, v9

    .line 91
    :goto_5
    and-int/lit8 v7, v1, 0x1

    .line 92
    .line 93
    invoke-virtual {v11, v7, v6}, La/fet;->U(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_24

    .line 98
    .line 99
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    const/4 v7, 0x6

    .line 104
    shr-int/2addr v1, v7

    .line 105
    and-int/lit8 v1, v1, 0xe

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    invoke-static {v6, v10, v11, v1, v4}, La/phu0;->Z(Ljava/lang/Object;Ljava/lang/String;La/fet;II)La/oms0;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    iget-object v1, v6, La/oms0;->d:La/pz40;

    .line 113
    .line 114
    iget-object v12, v6, La/oms0;->a:La/p4;

    .line 115
    .line 116
    check-cast v1, La/hgk0;

    .line 117
    .line 118
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v16

    .line 122
    check-cast v16, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->floatValue()F

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    const v8, 0x47ca7941

    .line 129
    .line 130
    .line 131
    invoke-virtual {v11, v8}, La/fet;->e0(I)V

    .line 132
    .line 133
    .line 134
    invoke-static {v11}, La/afn0;->p(La/fet;)Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 135
    .line 136
    .line 137
    move-result-object v18

    .line 138
    invoke-virtual/range {v18 .. v18}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v3

    .line 142
    invoke-static {v11}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 143
    .line 144
    .line 145
    move-result-object v18

    .line 146
    invoke-virtual/range {v18 .. v18}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 147
    .line 148
    .line 149
    move-result-wide v13

    .line 150
    invoke-static {v7, v3, v4, v13, v14}, La/fbc;->P(FJJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v3

    .line 154
    invoke-virtual {v11, v9}, La/fet;->r(Z)V

    .line 155
    .line 156
    .line 157
    invoke-static {v3, v4}, La/y3d;->f(J)La/y4d;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v11, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    sget-object v13, La/ukd;->a:La/cl5;

    .line 170
    .line 171
    if-nez v4, :cond_6

    .line 172
    .line 173
    if-ne v7, v13, :cond_7

    .line 174
    .line 175
    :cond_6
    new-instance v4, La/s43;

    .line 176
    .line 177
    const/4 v7, 0x2

    .line 178
    invoke-direct {v4, v3, v7}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v4, v11}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    :cond_7
    check-cast v7, La/lxs0;

    .line 186
    .line 187
    invoke-virtual {v6}, La/oms0;->h()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    const v4, 0x6359c50d

    .line 192
    .line 193
    .line 194
    const v14, 0x6355e4b0

    .line 195
    .line 196
    .line 197
    if-nez v3, :cond_b

    .line 198
    .line 199
    invoke-virtual {v11, v14}, La/fet;->e0(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    if-nez v3, :cond_8

    .line 211
    .line 212
    if-ne v10, v13, :cond_a

    .line 213
    .line 214
    :cond_8
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    if-eqz v3, :cond_9

    .line 219
    .line 220
    invoke-virtual {v3}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    goto :goto_6

    .line 225
    :cond_9
    const/4 v10, 0x0

    .line 226
    :goto_6
    invoke-static {v3}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    :try_start_0
    invoke-virtual {v12}, La/p4;->y0()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    invoke-static {v3, v14, v10}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v11, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    move-object v10, v8

    .line 241
    :cond_a
    invoke-virtual {v11, v9}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :catchall_0
    move-exception v0

    .line 246
    invoke-static {v3, v14, v10}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 247
    .line 248
    .line 249
    throw v0

    .line 250
    :cond_b
    invoke-static {v11, v4, v9, v12}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    :goto_7
    check-cast v10, Ljava/lang/Number;

    .line 255
    .line 256
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    const v8, 0x47ca7941

    .line 261
    .line 262
    .line 263
    invoke-virtual {v11, v8}, La/fet;->e0(I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v11}, La/afn0;->p(La/fet;)Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 271
    .line 272
    .line 273
    move-result-wide v4

    .line 274
    invoke-static {v11, v4, v5, v3, v9}, La/twn;->i(La/fet;JFZ)J

    .line 275
    .line 276
    .line 277
    move-result-wide v3

    .line 278
    move-object v10, v7

    .line 279
    new-instance v7, La/y3d;

    .line 280
    .line 281
    invoke-direct {v7, v3, v4}, La/y3d;-><init>(J)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    if-nez v3, :cond_c

    .line 293
    .line 294
    if-ne v4, v13, :cond_d

    .line 295
    .line 296
    :cond_c
    new-instance v3, La/gb3;

    .line 297
    .line 298
    const/4 v4, 0x4

    .line 299
    invoke-direct {v3, v6, v4}, La/gb3;-><init>(La/oms0;B)V

    .line 300
    .line 301
    .line 302
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_d
    check-cast v4, La/l7m0;

    .line 310
    .line 311
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    check-cast v3, Ljava/lang/Number;

    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    const v8, 0x47ca7941

    .line 322
    .line 323
    .line 324
    invoke-virtual {v11, v8}, La/fet;->e0(I)V

    .line 325
    .line 326
    .line 327
    invoke-static {v11}, La/afn0;->p(La/fet;)Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 332
    .line 333
    .line 334
    move-result-wide v4

    .line 335
    invoke-static {v11, v4, v5, v3, v9}, La/twn;->i(La/fet;JFZ)J

    .line 336
    .line 337
    .line 338
    move-result-wide v3

    .line 339
    new-instance v8, La/y3d;

    .line 340
    .line 341
    invoke-direct {v8, v3, v4}, La/y3d;-><init>(J)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    if-nez v3, :cond_e

    .line 353
    .line 354
    if-ne v4, v13, :cond_f

    .line 355
    .line 356
    :cond_e
    new-instance v3, La/gb3;

    .line 357
    .line 358
    const/4 v4, 0x5

    .line 359
    invoke-direct {v3, v6, v4}, La/gb3;-><init>(La/oms0;B)V

    .line 360
    .line 361
    .line 362
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_f
    check-cast v4, La/l7m0;

    .line 370
    .line 371
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    check-cast v3, La/ams0;

    .line 376
    .line 377
    const v4, 0x1175c9e1

    .line 378
    .line 379
    .line 380
    invoke-static {v3, v11, v4, v9}, La/w6x;->k(La/ams0;La/fet;IZ)La/jfk0;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    move-object v4, v12

    .line 385
    const/4 v12, 0x0

    .line 386
    move v5, v9

    .line 387
    const/4 v14, 0x6

    .line 388
    const/16 v18, 0x0

    .line 389
    .line 390
    move-object v9, v3

    .line 391
    const/4 v3, 0x1

    .line 392
    invoke-static/range {v6 .. v12}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    check-cast v8, Ljava/lang/Number;

    .line 401
    .line 402
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    const v9, -0x4cdd33fa

    .line 407
    .line 408
    .line 409
    invoke-static {v11, v9, v11}, La/twn;->B(La/fet;ILa/fet;)J

    .line 410
    .line 411
    .line 412
    move-result-wide v14

    .line 413
    invoke-static {v11}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 418
    .line 419
    .line 420
    move-result-wide v9

    .line 421
    invoke-static {v8, v14, v15, v9, v10}, La/fbc;->P(FJJ)J

    .line 422
    .line 423
    .line 424
    move-result-wide v8

    .line 425
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 426
    .line 427
    .line 428
    invoke-static {v8, v9}, La/y3d;->f(J)La/y4d;

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    invoke-virtual {v11, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    if-nez v9, :cond_10

    .line 441
    .line 442
    if-ne v10, v13, :cond_11

    .line 443
    .line 444
    :cond_10
    new-instance v9, La/s43;

    .line 445
    .line 446
    const/4 v10, 0x2

    .line 447
    invoke-direct {v9, v8, v10}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 448
    .line 449
    .line 450
    invoke-static {v0, v9, v11}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 451
    .line 452
    .line 453
    move-result-object v10

    .line 454
    :cond_11
    check-cast v10, La/lxs0;

    .line 455
    .line 456
    invoke-virtual {v6}, La/oms0;->h()Z

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    if-nez v8, :cond_15

    .line 461
    .line 462
    const v8, 0x6355e4b0

    .line 463
    .line 464
    .line 465
    invoke-virtual {v11, v8}, La/fet;->e0(I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    if-nez v8, :cond_12

    .line 477
    .line 478
    if-ne v9, v13, :cond_14

    .line 479
    .line 480
    :cond_12
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    if-eqz v8, :cond_13

    .line 485
    .line 486
    invoke-virtual {v8}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    goto :goto_8

    .line 491
    :cond_13
    move-object/from16 v9, v18

    .line 492
    .line 493
    :goto_8
    invoke-static {v8}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 494
    .line 495
    .line 496
    move-result-object v14

    .line 497
    :try_start_1
    invoke-virtual {v4}, La/p4;->y0()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 501
    invoke-static {v8, v14, v9}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v11, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    move-object v9, v15

    .line 508
    :cond_14
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 509
    .line 510
    .line 511
    goto :goto_9

    .line 512
    :catchall_1
    move-exception v0

    .line 513
    invoke-static {v8, v14, v9}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 514
    .line 515
    .line 516
    throw v0

    .line 517
    :cond_15
    const v14, 0x6359c50d

    .line 518
    .line 519
    .line 520
    invoke-static {v11, v14, v5, v4}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    :goto_9
    check-cast v9, Ljava/lang/Number;

    .line 525
    .line 526
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 527
    .line 528
    .line 529
    move-result v8

    .line 530
    const v9, -0x4cdd33fa

    .line 531
    .line 532
    .line 533
    invoke-static {v11, v9, v11}, La/twn;->B(La/fet;ILa/fet;)J

    .line 534
    .line 535
    .line 536
    move-result-wide v14

    .line 537
    invoke-static {v11, v14, v15, v8, v5}, La/twn;->i(La/fet;JFZ)J

    .line 538
    .line 539
    .line 540
    move-result-wide v8

    .line 541
    move-object v14, v7

    .line 542
    new-instance v7, La/y3d;

    .line 543
    .line 544
    invoke-direct {v7, v8, v9}, La/y3d;-><init>(J)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v8

    .line 551
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v9

    .line 555
    if-nez v8, :cond_16

    .line 556
    .line 557
    if-ne v9, v13, :cond_17

    .line 558
    .line 559
    :cond_16
    new-instance v8, La/gb3;

    .line 560
    .line 561
    const/4 v9, 0x6

    .line 562
    invoke-direct {v8, v6, v9}, La/gb3;-><init>(La/oms0;B)V

    .line 563
    .line 564
    .line 565
    invoke-static {v8}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 566
    .line 567
    .line 568
    move-result-object v9

    .line 569
    invoke-virtual {v11, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    :cond_17
    check-cast v9, La/l7m0;

    .line 573
    .line 574
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    check-cast v8, Ljava/lang/Number;

    .line 579
    .line 580
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 581
    .line 582
    .line 583
    move-result v8

    .line 584
    move-object v15, v4

    .line 585
    const v9, -0x4cdd33fa

    .line 586
    .line 587
    .line 588
    invoke-static {v11, v9, v11}, La/twn;->B(La/fet;ILa/fet;)J

    .line 589
    .line 590
    .line 591
    move-result-wide v3

    .line 592
    invoke-static {v11, v3, v4, v8, v5}, La/twn;->i(La/fet;JFZ)J

    .line 593
    .line 594
    .line 595
    move-result-wide v3

    .line 596
    new-instance v8, La/y3d;

    .line 597
    .line 598
    invoke-direct {v8, v3, v4}, La/y3d;-><init>(J)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    if-nez v3, :cond_18

    .line 610
    .line 611
    if-ne v4, v13, :cond_19

    .line 612
    .line 613
    :cond_18
    new-instance v3, La/gb3;

    .line 614
    .line 615
    const/4 v4, 0x7

    .line 616
    invoke-direct {v3, v6, v4}, La/gb3;-><init>(La/oms0;B)V

    .line 617
    .line 618
    .line 619
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    :cond_19
    check-cast v4, La/l7m0;

    .line 627
    .line 628
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v3

    .line 632
    check-cast v3, La/ams0;

    .line 633
    .line 634
    const v4, 0x147ae766

    .line 635
    .line 636
    .line 637
    invoke-static {v3, v11, v4, v5}, La/w6x;->k(La/ams0;La/fet;IZ)La/jfk0;

    .line 638
    .line 639
    .line 640
    move-result-object v9

    .line 641
    invoke-static/range {v6 .. v12}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    check-cast v1, Ljava/lang/Number;

    .line 650
    .line 651
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    const v4, 0x68cfca14

    .line 656
    .line 657
    .line 658
    invoke-static {v11, v4, v11}, La/twn;->h(La/fet;ILa/fet;)J

    .line 659
    .line 660
    .line 661
    move-result-wide v7

    .line 662
    invoke-static {v11}, La/afn0;->p(La/fet;)Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 663
    .line 664
    .line 665
    move-result-object v9

    .line 666
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 667
    .line 668
    .line 669
    move-result-wide v9

    .line 670
    invoke-static {v1, v7, v8, v9, v10}, La/fbc;->P(FJJ)J

    .line 671
    .line 672
    .line 673
    move-result-wide v7

    .line 674
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 675
    .line 676
    .line 677
    invoke-static {v7, v8}, La/y3d;->f(J)La/y4d;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v8

    .line 689
    if-nez v7, :cond_1a

    .line 690
    .line 691
    if-ne v8, v13, :cond_1b

    .line 692
    .line 693
    :cond_1a
    new-instance v7, La/s43;

    .line 694
    .line 695
    const/4 v10, 0x2

    .line 696
    invoke-direct {v7, v1, v10}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 697
    .line 698
    .line 699
    invoke-static {v0, v7, v11}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 700
    .line 701
    .line 702
    move-result-object v8

    .line 703
    :cond_1b
    move-object v10, v8

    .line 704
    check-cast v10, La/lxs0;

    .line 705
    .line 706
    invoke-virtual {v6}, La/oms0;->h()Z

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    if-nez v0, :cond_1f

    .line 711
    .line 712
    const v8, 0x6355e4b0

    .line 713
    .line 714
    .line 715
    invoke-virtual {v11, v8}, La/fet;->e0(I)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    if-nez v0, :cond_1c

    .line 727
    .line 728
    if-ne v1, v13, :cond_1e

    .line 729
    .line 730
    :cond_1c
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    if-eqz v1, :cond_1d

    .line 735
    .line 736
    invoke-virtual {v1}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    move-object v7, v0

    .line 741
    goto :goto_a

    .line 742
    :cond_1d
    move-object/from16 v7, v18

    .line 743
    .line 744
    :goto_a
    invoke-static {v1}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 745
    .line 746
    .line 747
    move-result-object v8

    .line 748
    :try_start_2
    invoke-virtual {v15}, La/p4;->y0()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 752
    invoke-static {v1, v8, v7}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v11, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    move-object v1, v0

    .line 759
    :cond_1e
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 760
    .line 761
    .line 762
    goto :goto_b

    .line 763
    :catchall_2
    move-exception v0

    .line 764
    invoke-static {v1, v8, v7}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 765
    .line 766
    .line 767
    throw v0

    .line 768
    :cond_1f
    const v0, 0x6359c50d

    .line 769
    .line 770
    .line 771
    invoke-static {v11, v0, v5, v15}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    :goto_b
    check-cast v1, Ljava/lang/Number;

    .line 776
    .line 777
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 778
    .line 779
    .line 780
    move-result v0

    .line 781
    invoke-static {v11, v4, v11}, La/twn;->h(La/fet;ILa/fet;)J

    .line 782
    .line 783
    .line 784
    move-result-wide v7

    .line 785
    invoke-static {v11}, La/afn0;->p(La/fet;)Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    move-object v9, v13

    .line 790
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 791
    .line 792
    .line 793
    move-result-wide v12

    .line 794
    invoke-static {v0, v7, v8, v12, v13}, La/fbc;->P(FJJ)J

    .line 795
    .line 796
    .line 797
    move-result-wide v0

    .line 798
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 799
    .line 800
    .line 801
    new-instance v7, La/y3d;

    .line 802
    .line 803
    invoke-direct {v7, v0, v1}, La/y3d;-><init>(J)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    if-nez v0, :cond_20

    .line 815
    .line 816
    if-ne v1, v9, :cond_21

    .line 817
    .line 818
    :cond_20
    new-instance v0, La/gb3;

    .line 819
    .line 820
    const/16 v1, 0x8

    .line 821
    .line 822
    invoke-direct {v0, v6, v1}, La/gb3;-><init>(La/oms0;B)V

    .line 823
    .line 824
    .line 825
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    :cond_21
    check-cast v1, La/l7m0;

    .line 833
    .line 834
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    check-cast v0, Ljava/lang/Number;

    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    invoke-static {v11, v4, v11}, La/twn;->h(La/fet;ILa/fet;)J

    .line 845
    .line 846
    .line 847
    move-result-wide v12

    .line 848
    invoke-static {v11}, La/afn0;->p(La/fet;)Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    move-object v4, v7

    .line 853
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 854
    .line 855
    .line 856
    move-result-wide v7

    .line 857
    invoke-static {v0, v12, v13, v7, v8}, La/fbc;->P(FJJ)J

    .line 858
    .line 859
    .line 860
    move-result-wide v0

    .line 861
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 862
    .line 863
    .line 864
    new-instance v8, La/y3d;

    .line 865
    .line 866
    invoke-direct {v8, v0, v1}, La/y3d;-><init>(J)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    if-nez v0, :cond_22

    .line 878
    .line 879
    if-ne v1, v9, :cond_23

    .line 880
    .line 881
    :cond_22
    new-instance v0, La/gb3;

    .line 882
    .line 883
    const/16 v1, 0x9

    .line 884
    .line 885
    invoke-direct {v0, v6, v1}, La/gb3;-><init>(La/oms0;B)V

    .line 886
    .line 887
    .line 888
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    :cond_23
    check-cast v1, La/l7m0;

    .line 896
    .line 897
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    check-cast v0, La/ams0;

    .line 902
    .line 903
    const v1, -0xf3ad28c

    .line 904
    .line 905
    .line 906
    invoke-static {v0, v11, v1, v5}, La/w6x;->k(La/ams0;La/fet;IZ)La/jfk0;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    move-object v7, v4

    .line 911
    const/4 v12, 0x0

    .line 912
    invoke-static/range {v6 .. v12}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 913
    .line 914
    .line 915
    move-result-object v10

    .line 916
    move-object v0, v11

    .line 917
    sget-object v1, La/jm40;->b:La/jm40;

    .line 918
    .line 919
    const/high16 v4, 0x3f800000    # 1.0f

    .line 920
    .line 921
    invoke-static {v1, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    invoke-static {v1}, La/o050;->W(La/mm40;)La/mm40;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    new-instance v18, La/imm;

    .line 930
    .line 931
    new-instance v4, La/plm;

    .line 932
    .line 933
    iget-object v5, v14, La/cms0;->j:La/pz40;

    .line 934
    .line 935
    check-cast v5, La/hgk0;

    .line 936
    .line 937
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    check-cast v5, La/y3d;

    .line 942
    .line 943
    iget-wide v5, v5, La/y3d;->a:J

    .line 944
    .line 945
    sget-object v7, La/fa50;->a:La/fa50;

    .line 946
    .line 947
    invoke-direct {v4, v2, v5, v6, v7}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 948
    .line 949
    .line 950
    invoke-static {v0}, La/afn0;->p(La/fet;)Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 951
    .line 952
    .line 953
    move-result-object v5

    .line 954
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 955
    .line 956
    .line 957
    move-result-wide v22

    .line 958
    const/16 v24, 0x0

    .line 959
    .line 960
    const/16 v25, 0x0

    .line 961
    .line 962
    sget-object v19, La/klm;->a:La/klm;

    .line 963
    .line 964
    sget-object v21, La/fmm;->a:La/fmm;

    .line 965
    .line 966
    move-object/from16 v20, v4

    .line 967
    .line 968
    invoke-direct/range {v18 .. v25}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 969
    .line 970
    .line 971
    new-instance v4, La/cb3;

    .line 972
    .line 973
    move-object/from16 v5, p4

    .line 974
    .line 975
    const/4 v6, 0x1

    .line 976
    invoke-direct {v4, v5, v3, v10, v6}, La/cb3;-><init>(Lkotlin/jvm/functions/Function0;La/cms0;La/cms0;B)V

    .line 977
    .line 978
    .line 979
    const v6, 0x24b91573

    .line 980
    .line 981
    .line 982
    invoke-static {v6, v4, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 983
    .line 984
    .line 985
    move-result-object v15

    .line 986
    new-instance v6, La/iop;

    .line 987
    .line 988
    const/16 v11, 0x13

    .line 989
    .line 990
    move-object/from16 v7, p2

    .line 991
    .line 992
    move-object/from16 v8, p5

    .line 993
    .line 994
    move-object v9, v3

    .line 995
    invoke-direct/range {v6 .. v11}, La/iop;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 996
    .line 997
    .line 998
    const v3, 0x5bf05d02

    .line 999
    .line 1000
    .line 1001
    invoke-static {v3, v6, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v17

    .line 1005
    const/16 v20, 0x30

    .line 1006
    .line 1007
    const/16 v21, 0x5fc

    .line 1008
    .line 1009
    const/4 v8, 0x0

    .line 1010
    const/4 v9, 0x0

    .line 1011
    const/4 v10, 0x0

    .line 1012
    const/4 v11, 0x0

    .line 1013
    const/4 v12, 0x0

    .line 1014
    const/4 v13, 0x0

    .line 1015
    const/4 v14, 0x0

    .line 1016
    const/16 v16, 0x0

    .line 1017
    .line 1018
    const/high16 v19, 0x30000000

    .line 1019
    .line 1020
    move-object v6, v1

    .line 1021
    move-object/from16 v7, v18

    .line 1022
    .line 1023
    move-object/from16 v18, v0

    .line 1024
    .line 1025
    invoke-static/range {v6 .. v21}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 1026
    .line 1027
    .line 1028
    goto :goto_c

    .line 1029
    :cond_24
    invoke-virtual/range {p6 .. p6}, La/fet;->X()V

    .line 1030
    .line 1031
    .line 1032
    :goto_c
    invoke-virtual/range {p6 .. p6}, La/fet;->u()La/yfe0;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v9

    .line 1036
    if-eqz v9, :cond_25

    .line 1037
    .line 1038
    new-instance v0, La/gc3;

    .line 1039
    .line 1040
    const/4 v8, 0x0

    .line 1041
    move-object/from16 v1, p0

    .line 1042
    .line 1043
    move-object/from16 v3, p2

    .line 1044
    .line 1045
    move/from16 v4, p3

    .line 1046
    .line 1047
    move-object/from16 v6, p5

    .line 1048
    .line 1049
    move/from16 v7, p7

    .line 1050
    .line 1051
    invoke-direct/range {v0 .. v8}, La/gc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;FLjava/lang/Object;La/wdr;IB)V

    .line 1052
    .line 1053
    .line 1054
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 1055
    .line 1056
    :cond_25
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/r5w0;

    .line 7
    .line 8
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 16
    .line 17
    .line 18
    const-string p1, "EC"

    .line 19
    .line 20
    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p0, p0, La/r5w0;->b:La/n0o0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/s4w0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    :try_start_0
    invoke-virtual {p0, p2}, La/s4w0;->b(Ljava/lang/String;)Ljava/security/KeyPair;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const-string p2, "ECDH"

    .line 57
    .line 58
    invoke-static {p2}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2, p0}, Ljavax/crypto/KeyAgreement;->init(Ljava/security/Key;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    invoke-virtual {p2, p1, p0}, Ljavax/crypto/KeyAgreement;->doPhase(Ljava/security/Key;Z)Ljava/security/Key;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljavax/crypto/KeyAgreement;->generateSecret()[B

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string p1, "SHA-256"

    .line 74
    .line 75
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string p1, "AES"

    .line 86
    .line 87
    invoke-direct {p2, p0, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    move-object v0, p2

    .line 91
    goto :goto_0

    .line 92
    :catch_0
    move-exception p0

    .line 93
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 94
    .line 95
    .line 96
    :cond_1
    :goto_0
    new-instance p0, Ljavax/crypto/spec/IvParameterSpec;

    .line 97
    .line 98
    invoke-static {p3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-direct {p0, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 103
    .line 104
    .line 105
    const-string p1, "AES/CBC/PKCS5Padding"

    .line 106
    .line 107
    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const/4 p2, 0x2

    .line 112
    invoke-virtual {p1, p2, v0, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p4, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    new-instance p1, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    sget-object p2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 129
    .line 130
    invoke-direct {p1, p0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 131
    .line 132
    .line 133
    return-object p1
.end method

.method public c(La/ox30;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, La/fzm0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/fzm0;

    .line 7
    .line 8
    iget-object v0, v0, La/fzm0;->z:La/ox30;

    .line 9
    .line 10
    invoke-virtual {v0}, La/ox30;->k()La/ox30;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, La/ox30;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/xi;

    .line 21
    .line 22
    iget-object p0, p0, La/xi;->e:La/b040;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, La/b040;->c(La/ox30;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/r5w0;

    .line 7
    .line 8
    iget-object p0, p0, La/r5w0;->b:La/n0o0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/s4w0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/s4w0;->b(Ljava/lang/String;)Ljava/security/KeyPair;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v0, "EC"

    .line 28
    .line 29
    invoke-static {v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    .line 34
    .line 35
    const-string v3, "secp521r1"

    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v2, "AES/GCM/NoPadding"

    .line 48
    .line 49
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p0}, La/s4w0;->a()Ljavax/crypto/SecretKey;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-virtual {v2, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v3}, Ljava/security/Key;->getEncoded()[B

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    new-instance v4, La/n8w0;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v5}, Ljava/security/Key;->getEncoded()[B

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v5, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-static {v3, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v2}, Ljavax/crypto/Cipher;->getIV()[B

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {v2, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-direct {v4, v5, v3, v2}, La/n8w0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v2, p0, La/s4w0;->b:La/vby;

    .line 103
    .line 104
    sget-object v3, La/n8w0;->Companion:La/i8w0;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    sget-object v3, La/e8w0;->a:La/e8w0;

    .line 110
    .line 111
    invoke-virtual {v2, v3, v4}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-object v3, p0, La/s4w0;->a:La/akh0;

    .line 116
    .line 117
    const-string v4, "USER_KEYS_PAIR_KEY_"

    .line 118
    .line 119
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iget-object v3, v3, La/akh0;->c:La/n0o0;

    .line 124
    .line 125
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Landroid/content/SharedPreferences;

    .line 130
    .line 131
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, La/s4w0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    :goto_0
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    return-object p0
.end method

.method public e(JLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/keb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/keb;

    .line 7
    .line 8
    iget v1, v0, La/keb;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/keb;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/keb;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/keb;-><init>(La/do20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/keb;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/keb;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/sza;

    .line 53
    .line 54
    invoke-virtual {p0}, La/sza;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/xbg;

    .line 59
    .line 60
    iput v3, v0, La/keb;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, v0}, La/xbg;->c(JLa/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p3, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p3}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public f(La/ox30;)Z
    .locals 1

    .line 1
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xi;

    .line 4
    .line 5
    iget-object v0, p0, La/xi;->c:La/ox30;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, p1

    .line 11
    check-cast v0, La/fzm0;

    .line 12
    .line 13
    iget-object v0, v0, La/fzm0;->A:La/hz30;

    .line 14
    .line 15
    iget-object p0, p0, La/xi;->e:La/b040;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0, p1}, La/b040;->f(La/ox30;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public g(Ljava/util/Map;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/leb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/leb;

    .line 7
    .line 8
    iget v1, v0, La/leb;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/leb;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/leb;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/leb;-><init>(La/do20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/leb;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/leb;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/sza;

    .line 53
    .line 54
    invoke-virtual {p0}, La/sza;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/xbg;

    .line 59
    .line 60
    iput v3, v0, La/leb;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/xbg;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-ne p2, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p2, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public h(JJJIIIILjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p12

    .line 2
    .line 3
    instance-of v1, v0, La/meb;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/meb;

    .line 9
    .line 10
    iget v2, v1, La/meb;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/meb;->k:I

    .line 20
    .line 21
    :goto_0
    move-object v13, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La/meb;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/meb;-><init>(La/do20;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v13, La/meb;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v1, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v13, La/meb;->k:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/sza;

    .line 57
    .line 58
    invoke-virtual {p0}, La/sza;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    move-object v2, p0

    .line 63
    check-cast v2, La/xbg;

    .line 64
    .line 65
    invoke-static/range {p1 .. p2}, La/cs0;->u(J)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    iput v3, v13, La/meb;->k:I

    .line 70
    .line 71
    move-wide/from16 v8, p3

    .line 72
    .line 73
    move-wide/from16 v10, p5

    .line 74
    .line 75
    move/from16 v12, p7

    .line 76
    .line 77
    move/from16 v3, p8

    .line 78
    .line 79
    move/from16 v4, p9

    .line 80
    .line 81
    move/from16 v6, p10

    .line 82
    .line 83
    move-object/from16 v5, p11

    .line 84
    .line 85
    invoke-interface/range {v2 .. v13}, La/xbg;->a(IILjava/lang/String;ILjava/util/List;JJILa/yje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-ne v0, v1, :cond_3

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_3
    :goto_2
    check-cast v0, La/dx5;

    .line 93
    .line 94
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method

.method public i(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/neb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/neb;

    .line 7
    .line 8
    iget v1, v0, La/neb;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/neb;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/neb;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/neb;-><init>(La/do20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/neb;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/neb;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/sza;

    .line 53
    .line 54
    invoke-virtual {p0}, La/sza;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/xbg;

    .line 59
    .line 60
    iput v3, v0, La/neb;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, p4, v0}, La/xbg;->d(JLjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p3, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p3}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public j(JLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/do20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/svu;

    .line 4
    .line 5
    instance-of v1, p3, La/rp;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, La/rp;

    .line 11
    .line 12
    iget v2, v1, La/rp;->l:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/rp;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/rp;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, La/rp;-><init>(La/do20;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/rp;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/rp;->l:I

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_5

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    iget-wide p1, v1, La/rp;->i:J

    .line 58
    .line 59
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    iget-wide p1, v1, La/rp;->i:J

    .line 64
    .line 65
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, La/txy;->a:La/txy;

    .line 73
    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    iput-wide p1, v1, La/rp;->i:J

    .line 79
    .line 80
    iput v5, v1, La/rp;->l:I

    .line 81
    .line 82
    iget-object p0, v0, La/svu;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, La/jxy;

    .line 85
    .line 86
    new-instance v6, La/hxy;

    .line 87
    .line 88
    const/4 v7, 0x1

    .line 89
    move-wide v8, p1

    .line 90
    invoke-direct/range {v6 .. v11}, La/hxy;-><init>(IJJ)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1, v6}, La/jxy;->a(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-ne p0, p3, :cond_5

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_1
    if-ne p0, p3, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    move-wide p1, v8

    .line 106
    :goto_2
    sget-object p0, La/txy;->a:La/txy;

    .line 107
    .line 108
    iput-wide p1, v1, La/rp;->i:J

    .line 109
    .line 110
    iput v4, v1, La/rp;->l:I

    .line 111
    .line 112
    invoke-virtual {v0, v5, v1}, La/svu;->b(ILa/zje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, p3, :cond_7

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    :goto_3
    check-cast p0, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v6

    .line 125
    const-wide/16 v8, 0x32

    .line 126
    .line 127
    cmp-long p0, v6, v8

    .line 128
    .line 129
    if-lez p0, :cond_9

    .line 130
    .line 131
    sget-object p0, La/txy;->a:La/txy;

    .line 132
    .line 133
    iput-wide p1, v1, La/rp;->i:J

    .line 134
    .line 135
    iput v3, v1, La/rp;->l:I

    .line 136
    .line 137
    invoke-virtual {v0, v5, v1}, La/svu;->d(ILa/zje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-ne p0, p3, :cond_8

    .line 142
    .line 143
    :goto_4
    return-object p3

    .line 144
    :cond_8
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0
.end method

.method public k(La/zje;La/swp0;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/c9c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/c9c;

    .line 7
    .line 8
    iget v1, v0, La/c9c;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/c9c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/c9c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/c9c;-><init>(La/do20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/c9c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/c9c;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/kd30;

    .line 53
    .line 54
    iput v4, v0, La/c9c;->k:I

    .line 55
    .line 56
    invoke-virtual {p0, v0, p2, p3}, La/kd30;->E(La/zje;La/swp0;Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p1, La/wus0;

    .line 64
    .line 65
    iget-object p0, p1, La/wus0;->f:La/vus0;

    .line 66
    .line 67
    iget-object p2, p1, La/wus0;->a:Ljava/lang/String;

    .line 68
    .line 69
    instance-of p3, p0, La/uus0;

    .line 70
    .line 71
    if-eqz p3, :cond_4

    .line 72
    .line 73
    check-cast p0, La/uus0;

    .line 74
    .line 75
    iget-object p2, p1, La/wus0;->d:Ljava/util/List;

    .line 76
    .line 77
    iget-object p1, p1, La/wus0;->e:Ljava/util/List;

    .line 78
    .line 79
    new-instance p3, La/e9c;

    .line 80
    .line 81
    iget-object p0, p0, La/uus0;->a:La/swp0;

    .line 82
    .line 83
    invoke-direct {p3, p0, p2, p1}, La/e9c;-><init>(La/swp0;Ljava/util/List;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    return-object p3

    .line 87
    :cond_4
    instance-of p0, p0, La/tus0;

    .line 88
    .line 89
    if-eqz p0, :cond_6

    .line 90
    .line 91
    iget-wide v0, p1, La/wus0;->b:J

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_5

    .line 98
    .line 99
    const-wide/16 v4, 0x0

    .line 100
    .line 101
    cmp-long p0, v0, v4

    .line 102
    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    iget-object p0, p1, La/wus0;->c:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-gtz p0, :cond_5

    .line 112
    .line 113
    new-instance p0, La/d9c;

    .line 114
    .line 115
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {p0, p2, p1}, La/d9c;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_5
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v3

    .line 127
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 128
    .line 129
    .line 130
    return-object v3
.end method

.method public l(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/uii;

    .line 4
    .line 5
    iget-object p0, p0, La/uii;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/phj;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/phj;->e:La/ir30;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0}, La/ir30;->a()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object p0, p0, La/phj;->f:La/ir30;

    .line 18
    .line 19
    goto :goto_0
.end method

.method public m()Lorg/json/JSONObject;
    .locals 5

    .line 1
    const-string v0, "Error while closing settings cache file."

    .line 2
    .line 3
    const-string v1, "FirebaseCrashlytics"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const-string v2, "Checking for cached settings..."

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    :cond_0
    :try_start_0
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/io/File;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    new-instance v2, Ljava/io/FileInputStream;

    .line 29
    .line 30
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_1
    invoke-static {v2}, La/aad;->b0(Ljava/io/FileInputStream;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v4, Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    move-object v3, v2

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    move-object v3, v2

    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p0

    .line 50
    goto :goto_2

    .line 51
    :catch_1
    move-exception p0

    .line 52
    move-object v2, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :try_start_2
    const-string p0, "Settings file does not exist."

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-static {v1, p0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .line 65
    .line 66
    :cond_2
    move-object v4, v3

    .line 67
    :goto_0
    invoke-static {v3, v0}, La/aad;->J(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v4

    .line 71
    :goto_1
    :try_start_3
    const-string v4, "Failed to fetch cached settings"

    .line 72
    .line 73
    invoke-static {v1, v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v0}, La/aad;->J(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    :goto_2
    invoke-static {v3, v0}, La/aad;->J(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/r5w0;

    .line 7
    .line 8
    iget-object p0, p0, La/r5w0;->b:La/n0o0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/s4w0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v0, "USER_KEYS_PAIR_KEY_"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, La/s4w0;->a:La/akh0;

    .line 26
    .line 27
    iget-object v1, v1, La/akh0;->c:La/n0o0;

    .line 28
    .line 29
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroid/content/SharedPreferences;

    .line 34
    .line 35
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, La/s4w0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/r5w0;

    .line 10
    .line 11
    iget-object p0, p0, La/r5w0;->b:La/n0o0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/s4w0;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p0, p1}, La/s4w0;->b(Ljava/lang/String;)Ljava/security/KeyPair;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p1, "SHA256withECDSA"

    .line 38
    .line 39
    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, p0}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 47
    .line 48
    invoke-virtual {p2, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/security/Signature;->update([B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/security/Signature;->sign()[B

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 p1, 0x2

    .line 63
    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :catch_0
    move-exception p0

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    :goto_0
    return-object v0

    .line 74
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public p(Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams;)V
    .locals 2

    .line 1
    sget v0, Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;->d:I

    .line 2
    .line 3
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/us00;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, La/sj3;->K(Landroid/content/Context;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Landroid/content/Intent;

    .line 21
    .line 22
    const-class v1, Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "KEY_DOWNLOAD_BACKGROUND_SERVICE_PARAMS"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
