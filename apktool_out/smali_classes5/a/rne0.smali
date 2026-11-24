.class public final La/rne0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;[J)La/une0;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v4, La/pn40;->a:La/pn40;

    .line 16
    .line 17
    iget-wide v4, v0, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->a:D

    .line 18
    .line 19
    invoke-static {v1, v4, v5}, La/pn40;->k(Ljava/lang/String;D)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    iget-wide v8, v0, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->a:D

    .line 24
    .line 25
    iget-wide v4, v0, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->b:D

    .line 26
    .line 27
    invoke-static {v1, v4, v5}, La/pn40;->k(Ljava/lang/String;D)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    iget-wide v4, v0, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->c:D

    .line 32
    .line 33
    invoke-static {v1, v4, v5}, La/pn40;->k(Ljava/lang/String;D)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    array-length v4, v2

    .line 38
    const/16 v5, 0x3c

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v13, 0x1

    .line 43
    if-ne v4, v13, :cond_0

    .line 44
    .line 45
    sget-object v4, La/rdj;->a:La/rdj;

    .line 46
    .line 47
    new-instance v13, Ljava/util/Date;

    .line 48
    .line 49
    aget-wide v14, v2, v12

    .line 50
    .line 51
    invoke-direct {v13, v14, v15}, Ljava/util/Date;-><init>(J)V

    .line 52
    .line 53
    .line 54
    sget-object v2, La/sdj;->b:La/sdj;

    .line 55
    .line 56
    invoke-static {v4, v2, v13, v6, v5}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object/from16 v17, v7

    .line 61
    .line 62
    move-wide/from16 v18, v8

    .line 63
    .line 64
    move v15, v12

    .line 65
    :goto_0
    move-object v14, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    sget-object v4, La/rdj;->a:La/rdj;

    .line 68
    .line 69
    new-instance v14, Ljava/util/Date;

    .line 70
    .line 71
    move v15, v12

    .line 72
    move/from16 v16, v13

    .line 73
    .line 74
    aget-wide v12, v2, v15

    .line 75
    .line 76
    invoke-direct {v14, v12, v13}, Ljava/util/Date;-><init>(J)V

    .line 77
    .line 78
    .line 79
    sget-object v12, La/sdj;->b:La/sdj;

    .line 80
    .line 81
    invoke-static {v4, v12, v14, v6, v5}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    new-instance v14, Ljava/util/Date;

    .line 86
    .line 87
    move-object/from16 v17, v7

    .line 88
    .line 89
    move-wide/from16 v18, v8

    .line 90
    .line 91
    aget-wide v7, v2, v16

    .line 92
    .line 93
    invoke-direct {v14, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 94
    .line 95
    .line 96
    invoke-static {v4, v12, v14, v6, v5}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const-string v4, " - "

    .line 101
    .line 102
    invoke-static {v13, v4, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    goto :goto_0

    .line 107
    :goto_1
    iget-object v12, v0, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->d:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v0, v0, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->e:Ljava/util/List;

    .line 110
    .line 111
    new-instance v13, Ljava/util/ArrayList;

    .line 112
    .line 113
    const/16 v2, 0xa

    .line 114
    .line 115
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    move-object v4, v0

    .line 137
    check-cast v4, Lorg/xplatform/referral/api/domain/model/ReferralUser;

    .line 138
    .line 139
    new-instance v20, La/dpe0;

    .line 140
    .line 141
    iget-object v0, v4, Lorg/xplatform/referral/api/domain/model/ReferralUser;->a:Ljava/lang/String;

    .line 142
    .line 143
    iget-wide v5, v4, Lorg/xplatform/referral/api/domain/model/ReferralUser;->d:D

    .line 144
    .line 145
    const-string v7, "/"

    .line 146
    .line 147
    const-string v8, " / "

    .line 148
    .line 149
    invoke-static {v0, v7, v8, v15}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v22

    .line 153
    iget-object v7, v4, Lorg/xplatform/referral/api/domain/model/ReferralUser;->b:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v0, v4, Lorg/xplatform/referral/api/domain/model/ReferralUser;->c:Ljava/lang/String;

    .line 156
    .line 157
    sget-object v8, La/tne0;->a:[La/tne0;

    .line 158
    .line 159
    sget-object v8, La/sdj;->b:La/sdj;

    .line 160
    .line 161
    const-string v8, "UTC"

    .line 162
    .line 163
    invoke-static {v8}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v15, Ljava/text/SimpleDateFormat;

    .line 181
    .line 182
    move-object/from16 p1, v2

    .line 183
    .line 184
    const-string v2, "yyyy-MM-dd"

    .line 185
    .line 186
    move-object/from16 v28, v3

    .line 187
    .line 188
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-direct {v15, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v15, v8}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 196
    .line 197
    .line 198
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 199
    .line 200
    const-string v3, "dd.MM.yyyy"

    .line 201
    .line 202
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    invoke-direct {v2, v3, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v9}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 210
    .line 211
    .line 212
    :try_start_0
    invoke-virtual {v15, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-nez v0, :cond_1

    .line 217
    .line 218
    new-instance v0, Ljava/util/Date;

    .line 219
    .line 220
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :catch_0
    move-exception v0

    .line 225
    goto :goto_4

    .line 226
    :cond_1
    :goto_3
    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    .line 232
    .line 233
    move-object/from16 v24, v0

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 237
    .line 238
    .line 239
    move-object/from16 v24, v28

    .line 240
    .line 241
    :goto_5
    const-wide/16 v2, 0x0

    .line 242
    .line 243
    cmpl-double v0, v5, v2

    .line 244
    .line 245
    if-lez v0, :cond_2

    .line 246
    .line 247
    const-string v8, "+"

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_2
    move-object/from16 v8, v28

    .line 251
    .line 252
    :goto_6
    sget-object v9, La/pn40;->a:La/pn40;

    .line 253
    .line 254
    invoke-static {v1, v5, v6}, La/pn40;->k(Ljava/lang/String;D)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    cmpg-double v2, v5, v2

    .line 259
    .line 260
    if-gez v2, :cond_3

    .line 261
    .line 262
    :goto_7
    move-object/from16 v25, v9

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_3
    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    goto :goto_7

    .line 270
    :goto_8
    if-ltz v0, :cond_4

    .line 271
    .line 272
    const v0, 0x7f0606c1

    .line 273
    .line 274
    .line 275
    :goto_9
    move/from16 v21, v0

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_4
    const v0, 0x7f0606d0

    .line 279
    .line 280
    .line 281
    goto :goto_9

    .line 282
    :goto_a
    iget v0, v4, Lorg/xplatform/referral/api/domain/model/ReferralUser;->e:I

    .line 283
    .line 284
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v26

    .line 288
    iget-boolean v0, v4, Lorg/xplatform/referral/api/domain/model/ReferralUser;->f:Z

    .line 289
    .line 290
    move/from16 v27, v0

    .line 291
    .line 292
    move-object/from16 v23, v7

    .line 293
    .line 294
    invoke-direct/range {v20 .. v27}, La/dpe0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 295
    .line 296
    .line 297
    move-object/from16 v2, v20

    .line 298
    .line 299
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-object/from16 v2, p1

    .line 303
    .line 304
    move-object/from16 v3, v28

    .line 305
    .line 306
    const/4 v15, 0x0

    .line 307
    goto/16 :goto_2

    .line 308
    .line 309
    :cond_5
    new-instance v6, La/une0;

    .line 310
    .line 311
    move-object/from16 v7, v17

    .line 312
    .line 313
    move-wide/from16 v8, v18

    .line 314
    .line 315
    invoke-direct/range {v6 .. v14}, La/une0;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    return-object v6
.end method
