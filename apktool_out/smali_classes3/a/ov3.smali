.class public final La/ov3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/share/AppsFlyerConversionListener;


# instance fields
.field public final synthetic a:La/rv3;


# direct methods
.method public constructor <init>(La/rv3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ov3;->a:La/rv3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/LinkedHashMap;La/zje;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/kv3;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/kv3;

    .line 11
    .line 12
    iget v3, v2, La/kv3;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v6, v3, v4

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/kv3;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/kv3;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, La/kv3;-><init>(La/ov3;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, La/kv3;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v10, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v8, La/kv3;->k:I

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v9, :cond_1

    .line 41
    .line 42
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast v1, La/j0g0;

    .line 46
    .line 47
    iget-object v0, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    return-object v0

    .line 58
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "nr_pid"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    const-string v2, ""

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    move-object v1, v2

    .line 74
    :cond_3
    const-string v3, "nr_ipid"

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Ljava/lang/String;

    .line 81
    .line 82
    if-nez v3, :cond_4

    .line 83
    .line 84
    move-object v3, v2

    .line 85
    :cond_4
    const-string v4, "nr_bid"

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ljava/lang/String;

    .line 92
    .line 93
    if-nez v0, :cond_5

    .line 94
    .line 95
    move-object v4, v2

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v4, v0

    .line 98
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-lez v0, :cond_7

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-lez v0, :cond_7

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-lez v0, :cond_7

    .line 115
    .line 116
    const-class v0, La/ov3;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    sget-object v0, La/wen;->b:La/uen;

    .line 123
    .line 124
    const-wide/16 v6, 0x3

    .line 125
    .line 126
    sget-object v0, La/bfn;->e:La/bfn;

    .line 127
    .line 128
    invoke-static {v6, v7, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v12

    .line 132
    const-class v0, La/oqt0;

    .line 133
    .line 134
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    new-instance v0, La/wn2;

    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    const/4 v7, 0x4

    .line 142
    move-object v2, v1

    .line 143
    iget-object v1, p0, La/ov3;->a:La/rv3;

    .line 144
    .line 145
    move-object v5, p0

    .line 146
    invoke-direct/range {v0 .. v7}, La/wn2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 147
    .line 148
    .line 149
    iput v9, v8, La/kv3;->k:I

    .line 150
    .line 151
    const/4 v3, 0x3

    .line 152
    move-object v9, v0

    .line 153
    move-object v6, v8

    .line 154
    move-object v7, v11

    .line 155
    move-wide v4, v12

    .line 156
    move-object v8, v14

    .line 157
    invoke-static/range {v3 .. v9}, La/j0x;->D(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-ne v0, v10, :cond_6

    .line 162
    .line 163
    return-object v10

    .line 164
    :cond_6
    :goto_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0
.end method

.method public final b(Ljava/util/LinkedHashMap;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/lv3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/lv3;

    .line 7
    .line 8
    iget v1, v0, La/lv3;->k:I

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
    iput v1, v0, La/lv3;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lv3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/lv3;-><init>(La/ov3;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/lv3;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lv3;->k:I

    .line 30
    .line 31
    const-string v3, "B_TAG_RECEIVING_TIME"

    .line 32
    .line 33
    const-string v4, "referral_dl"

    .line 34
    .line 35
    iget-object p0, p0, La/ov3;->a:La/rv3;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string p2, "btag"

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, Ljava/lang/String;

    .line 64
    .line 65
    const-string v2, ""

    .line 66
    .line 67
    if-nez p2, :cond_3

    .line 68
    .line 69
    move-object p2, v2

    .line 70
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-lez v6, :cond_4

    .line 75
    .line 76
    iget-object p0, p0, La/rv3;->c:La/k9b0;

    .line 77
    .line 78
    iget-object p0, p0, La/k9b0;->a:La/vwb0;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-lez p1, :cond_17

    .line 85
    .line 86
    invoke-virtual {p0, v4, p2}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    invoke-virtual {p0, v3, p1, p2}, La/vwb0;->g(Ljava/lang/String;J)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_8

    .line 97
    .line 98
    :cond_4
    const-string p2, "af_sub1"

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Ljava/lang/String;

    .line 105
    .line 106
    if-nez p2, :cond_5

    .line 107
    .line 108
    move-object p2, v2

    .line 109
    :cond_5
    const-string v6, "agency"

    .line 110
    .line 111
    invoke-virtual {p1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    check-cast v6, Ljava/lang/String;

    .line 116
    .line 117
    if-nez v6, :cond_6

    .line 118
    .line 119
    move-object v6, v2

    .line 120
    :cond_6
    const-string v7, "campaign"

    .line 121
    .line 122
    invoke-virtual {p1, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const-string v9, "None"

    .line 127
    .line 128
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_7

    .line 133
    .line 134
    :goto_1
    move-object v7, v2

    .line 135
    goto :goto_2

    .line 136
    :cond_7
    invoke-virtual {p1, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    check-cast v7, Ljava/lang/String;

    .line 141
    .line 142
    if-nez v7, :cond_8

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_8
    :goto_2
    new-instance v8, La/mb5;

    .line 146
    .line 147
    const-string v9, "af_sub2"

    .line 148
    .line 149
    invoke-virtual {p1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    check-cast v9, Ljava/lang/String;

    .line 154
    .line 155
    if-nez v9, :cond_9

    .line 156
    .line 157
    move-object v9, v2

    .line 158
    :cond_9
    const-string v10, "af_sub3"

    .line 159
    .line 160
    invoke-virtual {p1, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    check-cast v10, Ljava/lang/String;

    .line 165
    .line 166
    if-nez v10, :cond_a

    .line 167
    .line 168
    move-object v10, v2

    .line 169
    :cond_a
    const-string v11, "af_sub4"

    .line 170
    .line 171
    invoke-virtual {p1, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    check-cast v11, Ljava/lang/String;

    .line 176
    .line 177
    if-nez v11, :cond_b

    .line 178
    .line 179
    move-object v11, v2

    .line 180
    :cond_b
    const-string v12, "af_sub5"

    .line 181
    .line 182
    invoke-virtual {p1, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Ljava/lang/String;

    .line 187
    .line 188
    if-nez p1, :cond_c

    .line 189
    .line 190
    move-object p1, v2

    .line 191
    :cond_c
    invoke-direct {v8, v9, v10, v11, p1}, La/mb5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iput v5, v0, La/lv3;->k:I

    .line 195
    .line 196
    iget-object p1, p0, La/rv3;->d:La/yqc;

    .line 197
    .line 198
    const-string v5, "_"

    .line 199
    .line 200
    const/4 v9, 0x0

    .line 201
    invoke-static {v7, v5, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_e

    .line 206
    .line 207
    filled-new-array {v5}, [Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    const/4 v10, 0x6

    .line 212
    invoke-static {v7, v5, v9, v10}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    check-cast v9, Ljava/lang/String;

    .line 221
    .line 222
    if-nez v9, :cond_d

    .line 223
    .line 224
    move-object v9, v2

    .line 225
    :cond_d
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    check-cast v5, Ljava/lang/String;

    .line 230
    .line 231
    if-nez v5, :cond_f

    .line 232
    .line 233
    move-object v5, v2

    .line 234
    goto :goto_3

    .line 235
    :cond_e
    move-object v5, v2

    .line 236
    move-object v9, v7

    .line 237
    :cond_f
    :goto_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-lez v10, :cond_10

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_10
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    if-lez v10, :cond_11

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_11
    sget-object v8, La/mb5;->e:La/mb5;

    .line 252
    .line 253
    :goto_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-lez v10, :cond_12

    .line 258
    .line 259
    invoke-virtual {p1, p2, v8, v0}, La/yqc;->n(Ljava/lang/String;La/mb5;La/zje;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    :goto_5
    move-object p2, p1

    .line 264
    goto :goto_6

    .line 265
    :cond_12
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    if-lez p2, :cond_13

    .line 270
    .line 271
    invoke-virtual {p1, v6, v8, v0}, La/yqc;->m(Ljava/lang/String;La/mb5;La/zje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    goto :goto_5

    .line 276
    :cond_13
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 277
    .line 278
    .line 279
    move-result p2

    .line 280
    if-lez p2, :cond_14

    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    if-lez p2, :cond_14

    .line 287
    .line 288
    invoke-virtual {p1, v9, v5, v0}, La/yqc;->o(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    goto :goto_5

    .line 293
    :cond_14
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    if-lez p2, :cond_15

    .line 298
    .line 299
    invoke-virtual {p1, v7, v8, v0}, La/yqc;->n(Ljava/lang/String;La/mb5;La/zje;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    goto :goto_5

    .line 304
    :cond_15
    move-object p2, v2

    .line 305
    :goto_6
    if-ne p2, v1, :cond_16

    .line 306
    .line 307
    return-object v1

    .line 308
    :cond_16
    :goto_7
    check-cast p2, Ljava/lang/String;

    .line 309
    .line 310
    iget-object p0, p0, La/rv3;->c:La/k9b0;

    .line 311
    .line 312
    iget-object p0, p0, La/k9b0;->a:La/vwb0;

    .line 313
    .line 314
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    if-lez p1, :cond_17

    .line 319
    .line 320
    invoke-virtual {p0, v4, p2}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 324
    .line 325
    .line 326
    move-result-wide p1

    .line 327
    invoke-virtual {p0, v3, p1, p2}, La/vwb0;->g(Ljava/lang/String;J)V

    .line 328
    .line 329
    .line 330
    :cond_17
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object p0
.end method

.method public final c(Ljava/util/LinkedHashMap;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/mv3;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/mv3;

    .line 13
    .line 14
    iget v4, v3, La/mv3;->k:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/mv3;->k:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, La/mv3;

    .line 28
    .line 29
    invoke-direct {v3, v0, v2}, La/mv3;-><init>(La/ov3;La/zje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v7, La/mv3;->i:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v4, v7, La/mv3;->k:I

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    if-ne v4, v5, :cond_1

    .line 43
    .line 44
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v2, La/j0g0;

    .line 48
    .line 49
    iget-object v0, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    return-object v0

    .line 60
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const-string v2, "c"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    const-string v4, ""

    .line 72
    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    move-object v10, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object v10, v2

    .line 78
    :goto_2
    const-string v2, "af_sub1"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    move-object v11, v4

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move-object v11, v2

    .line 91
    :goto_3
    const-string v2, "pid"

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    move-object v12, v4

    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move-object v12, v1

    .line 104
    :goto_4
    const-class v1, La/ov3;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sget-object v2, La/wen;->b:La/uen;

    .line 111
    .line 112
    const-wide/16 v8, 0x3

    .line 113
    .line 114
    sget-object v2, La/bfn;->e:La/bfn;

    .line 115
    .line 116
    invoke-static {v8, v9, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v15

    .line 120
    const-class v2, La/oqt0;

    .line 121
    .line 122
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    new-instance v8, La/ic1;

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v14, 0x3

    .line 130
    iget-object v9, v0, La/ov3;->a:La/rv3;

    .line 131
    .line 132
    invoke-direct/range {v8 .. v14}, La/ic1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 133
    .line 134
    .line 135
    iput v5, v7, La/mv3;->k:I

    .line 136
    .line 137
    const/4 v4, 0x3

    .line 138
    move-object v9, v2

    .line 139
    move-object v10, v8

    .line 140
    move-wide v5, v15

    .line 141
    move-object v8, v1

    .line 142
    invoke-static/range {v4 .. v10}, La/j0x;->D(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-ne v0, v3, :cond_6

    .line 147
    .line 148
    return-object v3

    .line 149
    :cond_6
    :goto_5
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0
.end method

.method public final d(ZZ)V
    .locals 2

    .line 1
    iget-object v0, p0, La/ov3;->a:La/rv3;

    .line 2
    .line 3
    iget-object v0, v0, La/rv3;->h:La/sd60;

    .line 4
    .line 5
    iget-object v0, v0, La/sd60;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/gv3;

    .line 8
    .line 9
    iget-object v0, v0, La/gv3;->a:La/qoj0;

    .line 10
    .line 11
    new-instance v1, La/ka80;

    .line 12
    .line 13
    invoke-direct {v1, p2}, La/ka80;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, La/ov3;->a:La/rv3;

    .line 22
    .line 23
    iget-boolean p1, p1, La/rv3;->l:Z

    .line 24
    .line 25
    iget-object p0, p0, La/ov3;->a:La/rv3;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, La/rv3;->c()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, La/rv3;->m:Z

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final onConversionDataFail(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-class v0, La/rv3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "onConversionDataFail: "

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/ov3;->a:La/rv3;

    .line 25
    .line 26
    iget-object p1, p1, La/rv3;->c:La/k9b0;

    .line 27
    .line 28
    iget-object p1, p1, La/k9b0;->a:La/vwb0;

    .line 29
    .line 30
    const-string v0, "IS_ORGANIC"

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p1, v0, v1}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-virtual {p0, p1, v1}, La/ov3;->d(ZZ)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final onConversionDataSuccess(Ljava/util/Map;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/ov3;->a:La/rv3;

    .line 6
    .line 7
    iget-object v3, v2, La/rv3;->k:La/n0o0;

    .line 8
    .line 9
    if-eqz v1, :cond_f

    .line 10
    .line 11
    const-string v4, "is_first_launch"

    .line 12
    .line 13
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    check-cast v4, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v5

    .line 28
    :goto_0
    iget-object v6, v2, La/rv3;->i:La/nwd;

    .line 29
    .line 30
    iget-object v7, v2, La/rv3;->c:La/k9b0;

    .line 31
    .line 32
    iget-object v7, v7, La/k9b0;->a:La/vwb0;

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v6, v2, La/rv3;->b:La/z7z;

    .line 38
    .line 39
    invoke-interface {v6}, La/z7z;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, La/gst0;

    .line 44
    .line 45
    invoke-virtual {v6}, La/gst0;->a()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_f

    .line 50
    .line 51
    if-eqz v4, :cond_f

    .line 52
    .line 53
    const-string v4, "af_status"

    .line 54
    .line 55
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const-string v6, "Organic"

    .line 60
    .line 61
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const-string v6, "campaign"

    .line 66
    .line 67
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    const/4 v8, 0x0

    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v6, v8

    .line 80
    :goto_1
    const-string v9, "nr_cid"

    .line 81
    .line 82
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    const-string v10, ""

    .line 87
    .line 88
    if-eqz v9, :cond_2

    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    if-nez v9, :cond_3

    .line 95
    .line 96
    :cond_2
    move-object v9, v10

    .line 97
    :cond_3
    const-string v11, "media_source"

    .line 98
    .line 99
    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    if-eqz v11, :cond_4

    .line 104
    .line 105
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    goto :goto_2

    .line 110
    :cond_4
    move-object v11, v8

    .line 111
    :goto_2
    if-eqz v11, :cond_6

    .line 112
    .line 113
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-nez v12, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    const-string v12, "MEDIA_SOURCE_ID"

    .line 121
    .line 122
    invoke-virtual {v7, v12, v11}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    :goto_3
    if-eqz v6, :cond_8

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-nez v11, :cond_7

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    const-string v11, "referral_dl"

    .line 135
    .line 136
    invoke-virtual {v7, v11, v6}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    move v6, v4

    .line 140
    goto :goto_5

    .line 141
    :cond_8
    :goto_4
    move v6, v5

    .line 142
    :goto_5
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    const/4 v12, 0x1

    .line 147
    if-lez v11, :cond_9

    .line 148
    .line 149
    const-string v6, "promo"

    .line 150
    .line 151
    invoke-virtual {v7, v6, v9}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    move v6, v12

    .line 155
    :cond_9
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    invoke-static {v11}, La/wp20;->a(I)I

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    invoke-direct {v9, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Ljava/lang/Iterable;

    .line 173
    .line 174
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    if-eqz v11, :cond_a

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    check-cast v11, Ljava/util/Map$Entry;

    .line 189
    .line 190
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    invoke-interface {v9, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_a
    invoke-static {v9}, La/rv3;->b(Ljava/util/LinkedHashMap;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-string v11, "post_back"

    .line 211
    .line 212
    invoke-virtual {v7, v11, v1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string v1, "af_siteid"

    .line 216
    .line 217
    invoke-virtual {v9, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Ljava/lang/String;

    .line 222
    .line 223
    if-nez v1, :cond_b

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_b
    move-object v10, v1

    .line 227
    :goto_7
    const-string v1, "siteId"

    .line 228
    .line 229
    invoke-virtual {v7, v1, v10}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, La/v8d;

    .line 237
    .line 238
    iget-object v13, v2, La/rv3;->r:La/sje;

    .line 239
    .line 240
    iget-boolean v1, v1, La/v8d;->s:Z

    .line 241
    .line 242
    if-eqz v1, :cond_c

    .line 243
    .line 244
    new-instance v14, La/or3;

    .line 245
    .line 246
    const/4 v1, 0x6

    .line 247
    invoke-direct {v14, v1}, La/or3;-><init>(B)V

    .line 248
    .line 249
    .line 250
    new-instance v15, La/jv3;

    .line 251
    .line 252
    invoke-direct {v15, v0, v6, v4, v5}, La/jv3;-><init>(La/ov3;ZZB)V

    .line 253
    .line 254
    .line 255
    new-instance v1, La/nv3;

    .line 256
    .line 257
    invoke-direct {v1, v0, v9, v8, v5}, La/nv3;-><init>(La/ov3;Ljava/util/LinkedHashMap;La/yje;B)V

    .line 258
    .line 259
    .line 260
    const/16 v18, 0xc

    .line 261
    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    move-object/from16 v17, v1

    .line 265
    .line 266
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 267
    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_c
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, La/v8d;

    .line 275
    .line 276
    iget-boolean v1, v1, La/v8d;->u:Z

    .line 277
    .line 278
    if-eqz v1, :cond_d

    .line 279
    .line 280
    new-instance v14, La/or3;

    .line 281
    .line 282
    const/4 v1, 0x7

    .line 283
    invoke-direct {v14, v1}, La/or3;-><init>(B)V

    .line 284
    .line 285
    .line 286
    new-instance v15, La/jv3;

    .line 287
    .line 288
    invoke-direct {v15, v0, v6, v4, v12}, La/jv3;-><init>(La/ov3;ZZB)V

    .line 289
    .line 290
    .line 291
    new-instance v1, La/nv3;

    .line 292
    .line 293
    invoke-direct {v1, v0, v9, v8, v12}, La/nv3;-><init>(La/ov3;Ljava/util/LinkedHashMap;La/yje;B)V

    .line 294
    .line 295
    .line 296
    const/16 v18, 0xc

    .line 297
    .line 298
    const/16 v16, 0x0

    .line 299
    .line 300
    move-object/from16 v17, v1

    .line 301
    .line 302
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 303
    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_d
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    check-cast v1, La/v8d;

    .line 311
    .line 312
    iget-boolean v1, v1, La/v8d;->t:Z

    .line 313
    .line 314
    if-eqz v1, :cond_e

    .line 315
    .line 316
    new-instance v14, La/or3;

    .line 317
    .line 318
    const/16 v1, 0x8

    .line 319
    .line 320
    invoke-direct {v14, v1}, La/or3;-><init>(B)V

    .line 321
    .line 322
    .line 323
    new-instance v15, La/jv3;

    .line 324
    .line 325
    const/4 v1, 0x2

    .line 326
    invoke-direct {v15, v0, v6, v4, v1}, La/jv3;-><init>(La/ov3;ZZB)V

    .line 327
    .line 328
    .line 329
    new-instance v2, La/nv3;

    .line 330
    .line 331
    invoke-direct {v2, v0, v9, v8, v1}, La/nv3;-><init>(La/ov3;Ljava/util/LinkedHashMap;La/yje;B)V

    .line 332
    .line 333
    .line 334
    const/16 v18, 0xc

    .line 335
    .line 336
    const/16 v16, 0x0

    .line 337
    .line 338
    move-object/from16 v17, v2

    .line 339
    .line 340
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 341
    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_e
    invoke-virtual {v0, v6, v4}, La/ov3;->d(ZZ)V

    .line 345
    .line 346
    .line 347
    :goto_8
    const-string v0, "IS_ORGANIC"

    .line 348
    .line 349
    invoke-virtual {v7, v0, v4}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 350
    .line 351
    .line 352
    :cond_f
    return-void
.end method
