.class public final La/g320;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/w5z;

.field public final b:La/ony;


# direct methods
.method public constructor <init>(La/w5z;La/ony;B)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/g320;->a:La/w5z;

    .line 11
    .line 12
    iput-object p2, p0, La/g320;->b:La/ony;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/g320;->a:La/w5z;

    .line 19
    .line 20
    iput-object p2, p0, La/g320;->b:La/ony;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/ouj0;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/f320;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/f320;

    .line 7
    .line 8
    iget v1, v0, La/f320;->l:I

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
    iput v1, v0, La/f320;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f320;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/f320;-><init>(La/g320;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/f320;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f320;->l:I

    .line 30
    .line 31
    const-string v3, "betVid"

    .line 32
    .line 33
    const-string v4, "betGUID"

    .line 34
    .line 35
    const-string v5, "betClickTime"

    .line 36
    .line 37
    const-string v6, "betQuickBet"

    .line 38
    .line 39
    const-string v7, "betUniqueToken"

    .line 40
    .line 41
    iget-object v8, p0, La/g320;->b:La/ony;

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    const-string v10, ""

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    if-ne v2, v9, :cond_1

    .line 49
    .line 50
    iget-object p1, v0, La/f320;->i:La/ouj0;

    .line 51
    .line 52
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-static {v10}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {p2, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-static {v2}, La/ncy;->a(Ljava/lang/Boolean;)La/jdy;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {p2, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v11

    .line 92
    new-instance v2, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-direct {v2, v11, v12}, Ljava/lang/Long;-><init>(J)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2}, La/ncy;->b(Ljava/lang/Number;)La/jdy;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-interface {p2, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget-object v2, p1, La/ouj0;->p:Ljava/lang/String;

    .line 105
    .line 106
    if-nez v2, :cond_3

    .line 107
    .line 108
    move-object v2, v10

    .line 109
    :cond_3
    invoke-static {v2}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-interface {p2, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object v2, La/q4f;->a:La/nwd;

    .line 117
    .line 118
    iget v11, p1, La/ouj0;->f:I

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v11}, La/nwd;->b(I)La/q4f;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-static {v2}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-interface {p2, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    new-instance v2, La/tny;

    .line 139
    .line 140
    invoke-static {p2}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    const-string v11, "logBetRequest"

    .line 145
    .line 146
    invoke-direct {v2, v11, p2}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    move-object p2, v8

    .line 150
    check-cast p2, La/rny;

    .line 151
    .line 152
    const-string v11, "BetEvRequest"

    .line 153
    .line 154
    invoke-virtual {p2, v11, v2}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 155
    .line 156
    .line 157
    sget-object p2, La/q4f;->e:La/q4f;

    .line 158
    .line 159
    sget-object v2, La/q4f;->g:La/q4f;

    .line 160
    .line 161
    sget-object v11, La/q4f;->h:La/q4f;

    .line 162
    .line 163
    filled-new-array {p2, v2, v11}, [La/q4f;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    iget-object v2, p1, La/ouj0;->s:La/q4f;

    .line 172
    .line 173
    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    iput-object p1, v0, La/f320;->i:La/ouj0;

    .line 178
    .line 179
    iput v9, v0, La/f320;->l:I

    .line 180
    .line 181
    iget-object p0, p0, La/g320;->a:La/w5z;

    .line 182
    .line 183
    invoke-virtual {p0, p1, p2, v0}, La/w5z;->Z(La/ouj0;ZLa/zje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    if-ne p2, v1, :cond_4

    .line 188
    .line 189
    return-object v1

    .line 190
    :cond_4
    :goto_1
    move-object p0, p2

    .line 191
    check-cast p0, La/pa20;

    .line 192
    .line 193
    instance-of v0, p0, La/oa20;

    .line 194
    .line 195
    if-eqz v0, :cond_5

    .line 196
    .line 197
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-static {v10}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-static {v1}, La/ncy;->a(Ljava/lang/Boolean;)La/jdy;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 219
    .line 220
    .line 221
    move-result-wide v1

    .line 222
    new-instance v6, Ljava/lang/Long;

    .line 223
    .line 224
    invoke-direct {v6, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 225
    .line 226
    .line 227
    invoke-static {v6}, La/ncy;->b(Ljava/lang/Number;)La/jdy;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    invoke-static {v10}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    check-cast p0, La/oa20;

    .line 242
    .line 243
    iget-object p0, p0, La/oa20;->a:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {p0}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    const-string v1, "betCouponId"

    .line 250
    .line 251
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    sget-object p0, La/q4f;->a:La/nwd;

    .line 255
    .line 256
    iget p1, p1, La/ouj0;->f:I

    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-static {p1}, La/nwd;->b(I)La/q4f;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-static {p0}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    new-instance p0, La/tny;

    .line 277
    .line 278
    invoke-static {v0}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    const-string v0, "logBetResponse"

    .line 283
    .line 284
    invoke-direct {p0, v0, p1}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 285
    .line 286
    .line 287
    check-cast v8, La/rny;

    .line 288
    .line 289
    const-string p1, "BetEvResponse"

    .line 290
    .line 291
    invoke-virtual {v8, p1, p0}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 292
    .line 293
    .line 294
    :cond_5
    return-object p2
.end method

.method public b(La/ouj0;JILa/yje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v0, p5

    .line 6
    .line 7
    instance-of v2, v0, La/yn20;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v0

    .line 12
    check-cast v2, La/yn20;

    .line 13
    .line 14
    iget v4, v2, La/yn20;->n:I

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
    iput v4, v2, La/yn20;->n:I

    .line 24
    .line 25
    :goto_0
    move-object v6, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v2, La/yn20;

    .line 28
    .line 29
    invoke-direct {v2, v1, v0}, La/yn20;-><init>(La/g320;La/yje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v6, La/yn20;->l:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v9, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v2, v6, La/yn20;->n:I

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    const-string v11, "betVid"

    .line 41
    .line 42
    const-string v12, "betGUID"

    .line 43
    .line 44
    const-string v13, "betClickTime"

    .line 45
    .line 46
    const-string v14, "betQuickBet"

    .line 47
    .line 48
    const-string v15, "betUniqueToken"

    .line 49
    .line 50
    iget-object v4, v1, La/g320;->b:La/ony;

    .line 51
    .line 52
    const/4 v5, 0x2

    .line 53
    const-string v16, ""

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    if-eq v2, v7, :cond_2

    .line 59
    .line 60
    if-ne v2, v5, :cond_1

    .line 61
    .line 62
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_a

    .line 66
    .line 67
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v10

    .line 73
    :cond_2
    iget v2, v6, La/yn20;->k:I

    .line 74
    .line 75
    iget-wide v7, v6, La/yn20;->j:J

    .line 76
    .line 77
    iget-object v3, v6, La/yn20;->i:La/ouj0;

    .line 78
    .line 79
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/m07; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    move-object v1, v4

    .line 83
    move v10, v5

    .line 84
    move-wide v4, v7

    .line 85
    move-object v8, v6

    .line 86
    move-object v6, v0

    .line 87
    const/4 v0, 0x1

    .line 88
    goto/16 :goto_2

    .line 89
    .line 90
    :catch_0
    move-exception v0

    .line 91
    move-wide v4, v7

    .line 92
    move-object v8, v6

    .line 93
    goto/16 :goto_8

    .line 94
    .line 95
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :try_start_1
    const-string v0, "BetEvRequest"

    .line 99
    .line 100
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v7, "logBetRequest"

    .line 106
    .line 107
    invoke-static/range {v16 .. v16}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-interface {v2, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-static {v8}, La/ncy;->a(Ljava/lang/Boolean;)La/jdy;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-interface {v2, v14, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch La/m07; {:try_start_1 .. :try_end_1} :catch_5

    .line 121
    .line 122
    .line 123
    move-object v8, v6

    .line 124
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    new-instance v10, Ljava/lang/Long;

    .line 129
    .line 130
    invoke-direct {v10, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 131
    .line 132
    .line 133
    invoke-static {v10}, La/ncy;->b(Ljava/lang/Number;)La/jdy;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-interface {v2, v13, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    iget-object v5, v3, La/ouj0;->p:Ljava/lang/String;

    .line 141
    .line 142
    if-nez v5, :cond_4

    .line 143
    .line 144
    move-object/from16 v5, v16

    .line 145
    .line 146
    :cond_4
    invoke-static {v5}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-interface {v2, v12, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object v5, La/q4f;->a:La/nwd;

    .line 154
    .line 155
    iget v6, v3, La/ouj0;->f:I

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v6}, La/nwd;->b(I)La/q4f;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-interface {v2, v11, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    new-instance v5, La/tny;

    .line 176
    .line 177
    invoke-static {v2}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-direct {v5, v7, v2}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    move-object v2, v4

    .line 185
    check-cast v2, La/rny;

    .line 186
    .line 187
    invoke-virtual {v2, v0, v5}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 188
    .line 189
    .line 190
    iget-object v2, v1, La/g320;->a:La/w5z;

    .line 191
    .line 192
    sget-object v0, La/q4f;->e:La/q4f;

    .line 193
    .line 194
    sget-object v5, La/q4f;->g:La/q4f;

    .line 195
    .line 196
    sget-object v6, La/q4f;->h:La/q4f;

    .line 197
    .line 198
    filled-new-array {v0, v5, v6}, [La/q4f;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iget-object v5, v3, La/ouj0;->s:La/q4f;

    .line 207
    .line 208
    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    iput-object v3, v8, La/yn20;->i:La/ouj0;

    .line 213
    .line 214
    move-object v0, v2

    .line 215
    move-wide/from16 v1, p2

    .line 216
    .line 217
    iput-wide v1, v8, La/yn20;->j:J

    .line 218
    .line 219
    move/from16 v7, p4

    .line 220
    .line 221
    iput v7, v8, La/yn20;->k:I

    .line 222
    .line 223
    const/4 v5, 0x1

    .line 224
    iput v5, v8, La/yn20;->n:I

    .line 225
    .line 226
    const/4 v10, 0x2

    .line 227
    move-wide/from16 v18, v1

    .line 228
    .line 229
    move-object v2, v0

    .line 230
    move-object v1, v4

    .line 231
    move v0, v5

    .line 232
    move-wide/from16 v4, v18

    .line 233
    .line 234
    invoke-virtual/range {v2 .. v8}, La/w5z;->a0(La/ouj0;JZILa/zje;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2
    :try_end_2
    .catch La/m07; {:try_start_2 .. :try_end_2} :catch_4

    .line 238
    if-ne v2, v9, :cond_5

    .line 239
    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :cond_5
    move-object/from16 v3, p1

    .line 243
    .line 244
    move-wide/from16 v4, p2

    .line 245
    .line 246
    move-object v6, v2

    .line 247
    move/from16 v2, p4

    .line 248
    .line 249
    :goto_2
    :try_start_3
    move-object v7, v6

    .line 250
    check-cast v7, La/pa20;

    .line 251
    .line 252
    const-string v10, "BetEvResponse"
    :try_end_3
    .catch La/m07; {:try_start_3 .. :try_end_3} :catch_2

    .line 253
    .line 254
    :try_start_4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 255
    .line 256
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_4
    .catch La/m07; {:try_start_4 .. :try_end_4} :catch_3

    .line 257
    .line 258
    .line 259
    move-object/from16 v17, v1

    .line 260
    .line 261
    :try_start_5
    const-string v1, "logBetResponse"
    :try_end_5
    .catch La/m07; {:try_start_5 .. :try_end_5} :catch_2

    .line 262
    .line 263
    move/from16 p1, v2

    .line 264
    .line 265
    :try_start_6
    invoke-static/range {v16 .. v16}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-interface {v0, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 273
    .line 274
    invoke-static {v2}, La/ncy;->a(Ljava/lang/Boolean;)La/jdy;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-interface {v0, v14, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 282
    .line 283
    .line 284
    move-result-wide v14

    .line 285
    new-instance v2, Ljava/lang/Long;

    .line 286
    .line 287
    invoke-direct {v2, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 288
    .line 289
    .line 290
    invoke-static {v2}, La/ncy;->b(Ljava/lang/Number;)La/jdy;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-interface {v0, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    iget-object v2, v3, La/ouj0;->p:Ljava/lang/String;

    .line 298
    .line 299
    if-nez v2, :cond_6

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_6
    move-object/from16 v16, v2

    .line 303
    .line 304
    :goto_3
    invoke-static/range {v16 .. v16}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-interface {v0, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    const-string v2, "betCouponId"

    .line 312
    .line 313
    if-nez v7, :cond_7

    .line 314
    .line 315
    const/4 v12, -0x1

    .line 316
    goto :goto_4

    .line 317
    :cond_7
    instance-of v12, v7, La/na20;

    .line 318
    .line 319
    if-eqz v12, :cond_8

    .line 320
    .line 321
    const/4 v12, 0x0

    .line 322
    goto :goto_4

    .line 323
    :cond_8
    instance-of v12, v7, La/oa20;

    .line 324
    .line 325
    if-eqz v12, :cond_9

    .line 326
    .line 327
    const/4 v12, 0x1

    .line 328
    goto :goto_4

    .line 329
    :cond_9
    const/4 v12, -0x2

    .line 330
    :goto_4
    if-eqz v12, :cond_b

    .line 331
    .line 332
    const/4 v13, 0x1

    .line 333
    if-ne v12, v13, :cond_a

    .line 334
    .line 335
    check-cast v7, La/oa20;

    .line 336
    .line 337
    iget-object v7, v7, La/oa20;->a:Ljava/lang/String;

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :catch_1
    move-exception v0

    .line 341
    :goto_5
    move/from16 v2, p1

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_a
    new-instance v0, La/m460;

    .line 345
    .line 346
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 347
    .line 348
    .line 349
    throw v0

    .line 350
    :cond_b
    check-cast v7, La/na20;

    .line 351
    .line 352
    iget-object v7, v7, La/na20;->c:Ljava/lang/String;

    .line 353
    .line 354
    :goto_6
    invoke-static {v7}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    invoke-interface {v0, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    sget-object v2, La/q4f;->a:La/nwd;

    .line 362
    .line 363
    iget v7, v3, La/ouj0;->f:I

    .line 364
    .line 365
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-static {v7}, La/nwd;->b(I)La/q4f;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-static {v2}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-interface {v0, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    new-instance v2, La/tny;

    .line 384
    .line 385
    invoke-static {v0}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-direct {v2, v1, v0}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 390
    .line 391
    .line 392
    move-object/from16 v0, v17

    .line 393
    .line 394
    check-cast v0, La/rny;

    .line 395
    .line 396
    invoke-virtual {v0, v10, v2}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 397
    .line 398
    .line 399
    check-cast v6, La/pa20;
    :try_end_6
    .catch La/m07; {:try_start_6 .. :try_end_6} :catch_1

    .line 400
    .line 401
    return-object v6

    .line 402
    :catch_2
    move-exception v0

    .line 403
    move/from16 p1, v2

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :catch_3
    move-exception v0

    .line 407
    move/from16 p1, v2

    .line 408
    .line 409
    goto :goto_5

    .line 410
    :catch_4
    move-exception v0

    .line 411
    :goto_7
    move-object/from16 v3, p1

    .line 412
    .line 413
    move-wide/from16 v4, p2

    .line 414
    .line 415
    move/from16 v2, p4

    .line 416
    .line 417
    goto :goto_8

    .line 418
    :catch_5
    move-exception v0

    .line 419
    move-object v8, v6

    .line 420
    goto :goto_7

    .line 421
    :goto_8
    iget-object v1, v0, La/m07;->a:Ljava/lang/String;

    .line 422
    .line 423
    invoke-static {v3, v1}, La/ouj0;->a(La/ouj0;Ljava/lang/String;)La/ouj0;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    const/4 v3, 0x0

    .line 428
    iput-object v3, v8, La/yn20;->i:La/ouj0;

    .line 429
    .line 430
    iput-wide v4, v8, La/yn20;->j:J

    .line 431
    .line 432
    iput v2, v8, La/yn20;->k:I

    .line 433
    .line 434
    const/4 v10, 0x2

    .line 435
    iput v10, v8, La/yn20;->n:I

    .line 436
    .line 437
    iget-wide v3, v0, La/m07;->b:J

    .line 438
    .line 439
    move v5, v2

    .line 440
    move-object v6, v8

    .line 441
    move-object v2, v1

    .line 442
    move-object/from16 v1, p0

    .line 443
    .line 444
    invoke-virtual/range {v1 .. v6}, La/g320;->b(La/ouj0;JILa/yje;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-ne v0, v9, :cond_c

    .line 449
    .line 450
    :goto_9
    return-object v9

    .line 451
    :cond_c
    :goto_a
    check-cast v0, La/pa20;

    .line 452
    .line 453
    return-object v0
.end method
