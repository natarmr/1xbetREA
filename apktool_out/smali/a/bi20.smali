.class public final synthetic La/bi20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vf7;


# direct methods
.method public synthetic constructor <init>(La/vf7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bi20;->a:B

    iput-object p1, p0, La/bi20;->b:La/vf7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bi20;->a:B

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    iget-object v0, v0, La/bi20;->b:La/vf7;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/oyg0;

    .line 15
    .line 16
    move-object/from16 v10, p2

    .line 17
    .line 18
    check-cast v10, La/a820;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v11, v10, La/a820;->g:La/hx4;

    .line 27
    .line 28
    iget-object v1, v11, La/hx4;->c:La/bx6;

    .line 29
    .line 30
    iget-object v12, v1, La/bx6;->b:La/tw6;

    .line 31
    .line 32
    iget-wide v13, v0, La/vf7;->e:D

    .line 33
    .line 34
    const-wide/16 v15, 0x0

    .line 35
    .line 36
    iget-wide v3, v0, La/vf7;->b:D

    .line 37
    .line 38
    iget-wide v6, v0, La/vf7;->c:D

    .line 39
    .line 40
    const/16 v19, 0x1

    .line 41
    .line 42
    iget-boolean v8, v0, La/vf7;->h:Z

    .line 43
    .line 44
    if-eqz v8, :cond_0

    .line 45
    .line 46
    const-wide v21, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    :goto_0
    move-wide/from16 v23, v15

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    move-wide/from16 v21, v3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_1
    iget-object v15, v10, La/a820;->d:La/xm5;

    .line 58
    .line 59
    iget-object v15, v15, La/xm5;->c:La/ql5;

    .line 60
    .line 61
    iget-object v15, v15, La/ql5;->f:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v8, :cond_1

    .line 64
    .line 65
    const-wide v3, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    :cond_1
    iget-boolean v0, v0, La/vf7;->g:Z

    .line 71
    .line 72
    new-instance v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;

    .line 73
    .line 74
    invoke-direct {v2, v3, v4, v0}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 75
    .line 76
    .line 77
    cmpg-double v0, v13, v23

    .line 78
    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    move/from16 v0, v19

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move v0, v9

    .line 85
    :goto_2
    xor-int/lit8 v29, v0, 0x1

    .line 86
    .line 87
    const/16 v32, 0x0

    .line 88
    .line 89
    const v33, 0xd283

    .line 90
    .line 91
    .line 92
    move-wide/from16 v17, v13

    .line 93
    .line 94
    const-wide/16 v13, 0x0

    .line 95
    .line 96
    move-object/from16 v23, v15

    .line 97
    .line 98
    const-wide/16 v15, 0x0

    .line 99
    .line 100
    const/16 v25, 0x0

    .line 101
    .line 102
    const/16 v27, 0x0

    .line 103
    .line 104
    const/16 v28, 0x1

    .line 105
    .line 106
    const/16 v30, 0x0

    .line 107
    .line 108
    const/16 v31, 0x0

    .line 109
    .line 110
    move-object/from16 v26, v2

    .line 111
    .line 112
    move-wide/from16 v19, v6

    .line 113
    .line 114
    move/from16 v24, v8

    .line 115
    .line 116
    invoke-static/range {v12 .. v33}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/4 v2, 0x5

    .line 121
    invoke-static {v1, v5, v0, v9, v2}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    const/16 v17, 0x0

    .line 126
    .line 127
    const/16 v18, 0x3b

    .line 128
    .line 129
    const/4 v12, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v15, 0x0

    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    invoke-static/range {v11 .. v18}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    const/16 v26, 0x0

    .line 139
    .line 140
    const v27, 0x3ffbf

    .line 141
    .line 142
    .line 143
    const/4 v11, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const/16 v18, 0x0

    .line 148
    .line 149
    const/16 v19, 0x0

    .line 150
    .line 151
    const/16 v20, 0x0

    .line 152
    .line 153
    const/16 v21, 0x0

    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    const/16 v23, 0x0

    .line 158
    .line 159
    const/16 v24, 0x0

    .line 160
    .line 161
    invoke-static/range {v10 .. v27}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    return-object v0

    .line 166
    :pswitch_0
    const/16 v19, 0x1

    .line 167
    .line 168
    const-wide/16 v23, 0x0

    .line 169
    .line 170
    move-object/from16 v1, p1

    .line 171
    .line 172
    check-cast v1, La/oyg0;

    .line 173
    .line 174
    move-object/from16 v2, p2

    .line 175
    .line 176
    check-cast v2, La/a820;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object v1, v2, La/a820;->e:La/pvj0;

    .line 185
    .line 186
    iget-object v3, v1, La/pvj0;->a:La/bx6;

    .line 187
    .line 188
    iget-object v4, v3, La/bx6;->b:La/tw6;

    .line 189
    .line 190
    iget-wide v6, v0, La/vf7;->e:D

    .line 191
    .line 192
    iget-wide v10, v0, La/vf7;->b:D

    .line 193
    .line 194
    iget-wide v12, v0, La/vf7;->c:D

    .line 195
    .line 196
    iget-boolean v8, v0, La/vf7;->h:Z

    .line 197
    .line 198
    if-eqz v8, :cond_3

    .line 199
    .line 200
    const-wide v43, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_3
    move-wide/from16 v43, v10

    .line 207
    .line 208
    :goto_3
    iget-object v14, v2, La/a820;->d:La/xm5;

    .line 209
    .line 210
    iget-object v14, v14, La/xm5;->c:La/ql5;

    .line 211
    .line 212
    iget-object v14, v14, La/ql5;->f:Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v8, :cond_4

    .line 215
    .line 216
    const-wide v10, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    :cond_4
    iget-boolean v0, v0, La/vf7;->g:Z

    .line 222
    .line 223
    new-instance v15, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;

    .line 224
    .line 225
    invoke-direct {v15, v10, v11, v0}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 226
    .line 227
    .line 228
    cmpg-double v0, v6, v23

    .line 229
    .line 230
    if-nez v0, :cond_5

    .line 231
    .line 232
    move/from16 v0, v19

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_5
    move v0, v9

    .line 236
    :goto_4
    xor-int/lit8 v51, v0, 0x1

    .line 237
    .line 238
    const/16 v54, 0x0

    .line 239
    .line 240
    const v55, 0xd683

    .line 241
    .line 242
    .line 243
    const-wide/16 v35, 0x0

    .line 244
    .line 245
    const-wide/16 v37, 0x0

    .line 246
    .line 247
    const/16 v47, 0x0

    .line 248
    .line 249
    const/16 v49, 0x0

    .line 250
    .line 251
    const/16 v50, 0x0

    .line 252
    .line 253
    const/16 v52, 0x0

    .line 254
    .line 255
    const/16 v53, 0x0

    .line 256
    .line 257
    move-object/from16 v34, v4

    .line 258
    .line 259
    move-wide/from16 v39, v6

    .line 260
    .line 261
    move/from16 v46, v8

    .line 262
    .line 263
    move-wide/from16 v41, v12

    .line 264
    .line 265
    move-object/from16 v45, v14

    .line 266
    .line 267
    move-object/from16 v48, v15

    .line 268
    .line 269
    invoke-static/range {v34 .. v55}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const/4 v4, 0x5

    .line 274
    invoke-static {v3, v5, v0, v9, v4}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 275
    .line 276
    .line 277
    move-result-object v26

    .line 278
    const/16 v31, 0x0

    .line 279
    .line 280
    const/16 v32, 0x3e

    .line 281
    .line 282
    const/16 v27, 0x0

    .line 283
    .line 284
    const/16 v28, 0x0

    .line 285
    .line 286
    const/16 v29, 0x0

    .line 287
    .line 288
    const/16 v30, 0x0

    .line 289
    .line 290
    move-object/from16 v25, v1

    .line 291
    .line 292
    invoke-static/range {v25 .. v32}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 293
    .line 294
    .line 295
    move-result-object v38

    .line 296
    const v51, 0x3ffef

    .line 297
    .line 298
    .line 299
    const/16 v35, 0x0

    .line 300
    .line 301
    const/16 v36, 0x0

    .line 302
    .line 303
    const/16 v37, 0x0

    .line 304
    .line 305
    const/16 v39, 0x0

    .line 306
    .line 307
    const/16 v40, 0x0

    .line 308
    .line 309
    const/16 v41, 0x0

    .line 310
    .line 311
    const/16 v42, 0x0

    .line 312
    .line 313
    const/16 v43, 0x0

    .line 314
    .line 315
    const/16 v44, 0x0

    .line 316
    .line 317
    const/16 v45, 0x0

    .line 318
    .line 319
    const/16 v46, 0x0

    .line 320
    .line 321
    const/16 v48, 0x0

    .line 322
    .line 323
    move-object/from16 v34, v2

    .line 324
    .line 325
    invoke-static/range {v34 .. v51}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    return-object v0

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
