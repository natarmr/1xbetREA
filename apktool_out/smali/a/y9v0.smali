.class public final synthetic La/y9v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/y9v0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/work/Worker;)V
    .locals 0

    .line 1
    const/16 p1, 0xb

    iput-byte p1, p0, La/y9v0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/y9v0;->a:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/zw3;

    .line 11
    .line 12
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, La/zw3;

    .line 19
    .line 20
    sget-object v1, La/r3w0;->a:La/r3w0;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/t44;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 32
    .line 33
    iput-object v1, v0, La/t44;->a:La/bjk;

    .line 34
    .line 35
    sget-object v1, La/iun;->a:La/iun;

    .line 36
    .line 37
    iput-object v1, v0, La/t44;->b:Ljava/util/List;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_2
    sget v0, La/rzv0;->D:I

    .line 41
    .line 42
    sget-object v0, La/vm60;->a:La/vm60;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_3
    new-instance v1, La/bzv0;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    const-string v2, ""

    .line 50
    .line 51
    sget-object v3, La/f9p;->a:La/f9p;

    .line 52
    .line 53
    sget-object v4, La/kdt;->a:La/kdt;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-direct/range {v1 .. v7}, La/bzv0;-><init>(Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;Z)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :pswitch_4
    new-instance v0, La/g0o;

    .line 61
    .line 62
    sget-object v1, La/kwv0;->INSTANCE:La/kwv0;

    .line 63
    .line 64
    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    .line 65
    .line 66
    const-string v3, "org.xplatform.core.navigation.compose_nav.bottom_sheet.host.XBottomSheetRootRoute"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :pswitch_6
    new-instance v0, La/zw3;

    .line 81
    .line 82
    sget-object v1, La/glv0;->a:La/glv0;

    .line 83
    .line 84
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_7
    new-instance v0, La/zw3;

    .line 89
    .line 90
    sget-object v1, La/o9a0;->a:La/o9a0;

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_8
    new-instance v0, La/zw3;

    .line 97
    .line 98
    sget-object v1, La/qkv0;->a:La/qkv0;

    .line 99
    .line 100
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_9
    new-instance v0, La/zw3;

    .line 105
    .line 106
    new-instance v1, La/zw3;

    .line 107
    .line 108
    sget-object v3, La/okx;->a:La/okx;

    .line 109
    .line 110
    invoke-direct {v1, v3, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_a
    :try_start_0
    const-class v0, La/uhv0;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_0

    .line 124
    .line 125
    new-instance v2, La/jtg0;

    .line 126
    .line 127
    new-instance v3, La/rrc;

    .line 128
    .line 129
    invoke-direct {v3, v0}, La/rrc;-><init>(Ljava/lang/ClassLoader;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {v2, v0, v3}, La/jtg0;-><init>(Ljava/lang/ClassLoader;La/rrc;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    move-object v2, v1

    .line 137
    :goto_0
    if-eqz v2, :cond_5

    .line 138
    .line 139
    invoke-virtual {v2}, La/jtg0;->a()Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    new-instance v3, La/rrc;

    .line 146
    .line 147
    invoke-direct {v3, v0}, La/rrc;-><init>(Ljava/lang/ClassLoader;)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, La/sto;->a()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    const/16 v4, 0x9

    .line 155
    .line 156
    if-lt v0, v4, :cond_1

    .line 157
    .line 158
    new-instance v0, La/ito;

    .line 159
    .line 160
    invoke-direct {v0, v2, v3}, La/gto;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;La/rrc;)V

    .line 161
    .line 162
    .line 163
    :goto_1
    move-object v1, v0

    .line 164
    goto :goto_2

    .line 165
    :cond_1
    const/4 v4, 0x6

    .line 166
    if-lt v0, v4, :cond_2

    .line 167
    .line 168
    new-instance v0, La/hto;

    .line 169
    .line 170
    invoke-direct {v0, v2, v3}, La/gto;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;La/rrc;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_2
    const/4 v4, 0x2

    .line 175
    if-lt v0, v4, :cond_3

    .line 176
    .line 177
    new-instance v0, La/gto;

    .line 178
    .line 179
    invoke-direct {v0, v2, v3}, La/gto;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;La/rrc;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_3
    const/4 v4, 0x1

    .line 184
    if-ne v0, v4, :cond_4

    .line 185
    .line 186
    new-instance v0, La/fto;

    .line 187
    .line 188
    invoke-direct {v0, v2, v3}, La/fto;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;La/rrc;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    new-instance v0, La/dto;

    .line 193
    .line 194
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :catchall_0
    :cond_5
    :goto_2
    return-object v1

    .line 199
    :pswitch_b
    new-instance v0, La/zw3;

    .line 200
    .line 201
    sget-object v1, La/qmn0;->a:La/qmn0;

    .line 202
    .line 203
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 204
    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_c
    new-instance v0, La/hfv0;

    .line 208
    .line 209
    sget-object v2, La/iun;->a:La/iun;

    .line 210
    .line 211
    invoke-direct {v0, v1, v2}, La/hfv0;-><init>(La/pbv;Ljava/util/List;)V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_d
    const/16 v0, 0x2710

    .line 216
    .line 217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :pswitch_e
    sget-wide v2, La/y3d;->g:J

    .line 223
    .line 224
    new-instance v1, La/idv0;

    .line 225
    .line 226
    move-wide v4, v2

    .line 227
    move-wide v6, v2

    .line 228
    move-wide v8, v2

    .line 229
    move-wide v10, v2

    .line 230
    invoke-direct/range {v1 .. v11}, La/idv0;-><init>(JJJJJ)V

    .line 231
    .line 232
    .line 233
    return-object v1

    .line 234
    :pswitch_f
    new-instance v2, La/vbv0;

    .line 235
    .line 236
    new-instance v4, La/ls2;

    .line 237
    .line 238
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    sget-object v5, La/iun;->a:La/iun;

    .line 242
    .line 243
    new-instance v6, La/m0k0;

    .line 244
    .line 245
    const/16 v46, 0x0

    .line 246
    .line 247
    const/16 v47, 0x0

    .line 248
    .line 249
    const-wide/16 v7, -0x1

    .line 250
    .line 251
    const-string v9, ""

    .line 252
    .line 253
    const-wide/16 v10, -0x1

    .line 254
    .line 255
    const-string v12, ""

    .line 256
    .line 257
    const-string v13, ""

    .line 258
    .line 259
    const-string v14, ""

    .line 260
    .line 261
    const-wide/16 v15, -0x1

    .line 262
    .line 263
    const-string v17, ""

    .line 264
    .line 265
    const-string v18, ""

    .line 266
    .line 267
    const-string v19, ""

    .line 268
    .line 269
    const/16 v20, 0x0

    .line 270
    .line 271
    const-string v21, ""

    .line 272
    .line 273
    const/16 v22, -0x1

    .line 274
    .line 275
    const/16 v23, -0x1

    .line 276
    .line 277
    const-string v24, ""

    .line 278
    .line 279
    const-string v25, ""

    .line 280
    .line 281
    const/16 v26, 0x0

    .line 282
    .line 283
    const/16 v27, 0x0

    .line 284
    .line 285
    const-string v28, ""

    .line 286
    .line 287
    const-string v29, ""

    .line 288
    .line 289
    const-string v30, ""

    .line 290
    .line 291
    const-string v31, ""

    .line 292
    .line 293
    const-wide/16 v32, -0x1

    .line 294
    .line 295
    const/16 v34, 0x0

    .line 296
    .line 297
    const-wide/16 v35, -0x1

    .line 298
    .line 299
    const-wide/16 v37, -0x1

    .line 300
    .line 301
    const/16 v39, 0x0

    .line 302
    .line 303
    const-wide/16 v40, -0x1

    .line 304
    .line 305
    const-wide/16 v42, -0x1

    .line 306
    .line 307
    const-string v44, ""

    .line 308
    .line 309
    const/16 v45, 0x0

    .line 310
    .line 311
    invoke-direct/range {v6 .. v47}, La/m0k0;-><init>(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZJJZJJLjava/lang/String;ZZZ)V

    .line 312
    .line 313
    .line 314
    sget-object v0, La/m97;->Companion:La/k97;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-static {}, La/k97;->a()La/m97;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    const-string v3, ""

    .line 324
    .line 325
    move-object v7, v6

    .line 326
    move-object v6, v5

    .line 327
    invoke-direct/range {v2 .. v8}, La/vbv0;-><init>(Ljava/lang/String;La/ms2;Ljava/util/List;Ljava/util/List;La/m0k0;La/m97;)V

    .line 328
    .line 329
    .line 330
    return-object v2

    .line 331
    :pswitch_10
    new-instance v0, La/zw3;

    .line 332
    .line 333
    sget-object v1, La/fav0;->a:La/fav0;

    .line 334
    .line 335
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 336
    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
