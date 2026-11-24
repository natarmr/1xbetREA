.class public final La/izx;
.super Ljava/lang/Object;


# instance fields
.field public final a:La/zjh0;

.field public final b:La/et2;


# direct methods
.method public constructor <init>(La/zjh0;La/et2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/izx;->a:La/zjh0;

    .line 5
    .line 6
    iput-object p2, p0, La/izx;->b:La/et2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/v0;Ljava/lang/String;La/i7a;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, La/rty;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/rty;

    .line 7
    .line 8
    iget v1, v0, La/rty;->m:I

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
    iput v1, v0, La/rty;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/rty;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/rty;-><init>(La/izx;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/rty;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/rty;->m:I

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
    iget-wide p1, v0, La/rty;->j:J

    .line 37
    .line 38
    iget-object p3, v0, La/rty;->i:La/v0;

    .line 39
    .line 40
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-wide v4, p1

    .line 44
    move-object p1, p3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    iput-object p1, v0, La/rty;->i:La/v0;

    .line 61
    .line 62
    iput-wide v4, v0, La/rty;->j:J

    .line 63
    .line 64
    iput v3, v0, La/rty;->m:I

    .line 65
    .line 66
    invoke-virtual {p0, p2, p3, v0}, La/izx;->b(Ljava/lang/String;La/i7a;La/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    if-ne p4, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p4, Ljava/lang/String;

    .line 74
    .line 75
    iget-object p1, p1, La/v0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 80
    .line 81
    .line 82
    move-result-wide p2

    .line 83
    sub-long/2addr p2, v4

    .line 84
    iget-object p0, p0, La/izx;->b:La/et2;

    .line 85
    .line 86
    iget-object p0, p0, La/et2;->a:La/ony;

    .line 87
    .line 88
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v1, "methodName"

    .line 94
    .line 95
    invoke-static {p1}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, La/ncy;->b(Ljava/lang/Number;)La/jdy;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string p2, "timeValue"

    .line 111
    .line 112
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    new-instance p1, La/tny;

    .line 116
    .line 117
    invoke-static {v0}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    const-string p3, "captchaLoading"

    .line 122
    .line 123
    invoke-direct {p1, p3, p2}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 124
    .line 125
    .line 126
    check-cast p0, La/rny;

    .line 127
    .line 128
    const-string p2, "captchaTime"

    .line 129
    .line 130
    invoke-virtual {p0, p2, p1}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 131
    .line 132
    .line 133
    return-object p4
.end method

.method public final b(Ljava/lang/String;La/i7a;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/ogy;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/ogy;

    .line 11
    .line 12
    iget v3, v2, La/ogy;->o:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/ogy;->o:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/ogy;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/ogy;-><init>(La/izx;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/ogy;->m:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/ogy;->o:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v7, :cond_2

    .line 42
    .line 43
    if-ne v4, v6, :cond_1

    .line 44
    .line 45
    iget-object v0, v2, La/ogy;->j:La/rv00;

    .line 46
    .line 47
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v8

    .line 58
    :cond_2
    iget-object v0, v2, La/ogy;->l:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v4, v2, La/ogy;->k:La/rv00;

    .line 61
    .line 62
    iget-object v9, v2, La/ogy;->j:La/rv00;

    .line 63
    .line 64
    iget-object v10, v2, La/ogy;->i:La/i7a;

    .line 65
    .line 66
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v13, v0

    .line 70
    move-object v0, v9

    .line 71
    move-object v9, v4

    .line 72
    move-object v4, v1

    .line 73
    move-object v1, v10

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v4, La/rv00;->u:La/rv00;

    .line 79
    .line 80
    move-object/from16 v1, p2

    .line 81
    .line 82
    iput-object v1, v2, La/ogy;->i:La/i7a;

    .line 83
    .line 84
    iput-object v4, v2, La/ogy;->j:La/rv00;

    .line 85
    .line 86
    iput-object v4, v2, La/ogy;->k:La/rv00;

    .line 87
    .line 88
    move-object/from16 v9, p1

    .line 89
    .line 90
    iput-object v9, v2, La/ogy;->l:Ljava/lang/String;

    .line 91
    .line 92
    iput v7, v2, La/ogy;->o:I

    .line 93
    .line 94
    iget-object v0, v0, La/izx;->a:La/zjh0;

    .line 95
    .line 96
    check-cast v0, La/zf3;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, La/zf3;->a(La/zje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-ne v0, v3, :cond_4

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_4
    move-object v13, v9

    .line 106
    move-object v9, v4

    .line 107
    move-object v4, v0

    .line 108
    move-object v0, v9

    .line 109
    :goto_1
    check-cast v4, Ljava/lang/String;

    .line 110
    .line 111
    iget-object v14, v1, La/i7a;->b:Ljava/lang/String;

    .line 112
    .line 113
    iget v10, v1, La/i7a;->c:I

    .line 114
    .line 115
    iget v11, v1, La/i7a;->a:I

    .line 116
    .line 117
    iput-object v8, v2, La/ogy;->i:La/i7a;

    .line 118
    .line 119
    iput-object v0, v2, La/ogy;->j:La/rv00;

    .line 120
    .line 121
    iput-object v8, v2, La/ogy;->k:La/rv00;

    .line 122
    .line 123
    iput-object v8, v2, La/ogy;->l:Ljava/lang/String;

    .line 124
    .line 125
    iput v6, v2, La/ogy;->o:I

    .line 126
    .line 127
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v7, v4}, La/ttm0;->G(ILjava/lang/CharSequence;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    int-to-double v6, v12

    .line 151
    int-to-double v8, v11

    .line 152
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    double-to-int v4, v6

    .line 157
    div-int v6, v4, v1

    .line 158
    .line 159
    rem-int/2addr v4, v1

    .line 160
    new-array v10, v1, [Lkotlin/ranges/IntRange;

    .line 161
    .line 162
    move v7, v5

    .line 163
    :goto_2
    if-ge v7, v1, :cond_6

    .line 164
    .line 165
    mul-int v8, v6, v7

    .line 166
    .line 167
    add-int/lit8 v9, v1, -0x1

    .line 168
    .line 169
    if-ne v7, v9, :cond_5

    .line 170
    .line 171
    add-int v9, v8, v6

    .line 172
    .line 173
    add-int/2addr v9, v4

    .line 174
    :goto_3
    invoke-static {v8, v9}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    goto :goto_4

    .line 179
    :cond_5
    add-int v9, v8, v6

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :goto_4
    aput-object v8, v10, v7

    .line 183
    .line 184
    add-int/lit8 v7, v7, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    sget-object v1, La/tvk;->a:La/rwj;

    .line 188
    .line 189
    new-instance v9, La/o960;

    .line 190
    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    invoke-direct/range {v9 .. v16}, La/o960;-><init>([Lkotlin/ranges/IntRange;IILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/yje;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v9, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-ne v1, v3, :cond_7

    .line 201
    .line 202
    :goto_5
    return-object v3

    .line 203
    :cond_7
    :goto_6
    check-cast v1, Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    const-string v0, "SHA-256"

    .line 212
    .line 213
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    new-instance v1, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    array-length v2, v0

    .line 239
    :goto_7
    if-ge v5, v2, :cond_8

    .line 240
    .line 241
    aget-byte v3, v0, v5

    .line 242
    .line 243
    sget-object v4, La/z1w0;->a:Ljava/util/Map;

    .line 244
    .line 245
    new-instance v6, La/p1t0;

    .line 246
    .line 247
    invoke-direct {v6, v3}, La/p1t0;-><init>(B)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    check-cast v3, Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    add-int/lit8 v5, v5, 0x1

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    return-object v0
.end method
