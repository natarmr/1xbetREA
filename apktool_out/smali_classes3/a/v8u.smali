.class public final La/v8u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/v4u;

.field public final b:La/gmt;

.field public final c:La/pbt;


# direct methods
.method public constructor <init>(La/v4u;La/gmt;La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/v8u;->a:La/v4u;

    .line 11
    .line 12
    iput-object p2, p0, La/v8u;->b:La/gmt;

    .line 13
    .line 14
    iput-object p3, p0, La/v8u;->c:La/pbt;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(La/gxo;)D
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/v8u;->b:La/gmt;

    .line 5
    .line 6
    invoke-virtual {v0}, La/gmt;->a()La/ql5;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-wide v0, v0, La/ql5;->a:J

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide/16 v0, -0x1

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v3, ""

    .line 22
    .line 23
    iget-object v4, p0, La/v8u;->c:La/pbt;

    .line 24
    .line 25
    const-wide/16 v5, 0x0

    .line 26
    .line 27
    if-eqz v2, :cond_a

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    if-eq v2, v7, :cond_6

    .line 31
    .line 32
    const/4 v7, 0x2

    .line 33
    if-ne v2, v7, :cond_5

    .line 34
    .line 35
    iget-object v2, v4, La/pbt;->a:La/j5t;

    .line 36
    .line 37
    iget-object v7, v2, La/j5t;->j:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Ljava/lang/Double;

    .line 48
    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-wide v7, v5

    .line 57
    :goto_1
    cmpg-double v7, v7, v5

    .line 58
    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    iget-object v4, v4, La/pbt;->b:La/lsn;

    .line 62
    .line 63
    iget-object v4, v4, La/lsn;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Landroid/content/SharedPreferences;

    .line 66
    .line 67
    new-instance v7, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v8, "thirdFastBet"

    .line 70
    .line 71
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-interface {v4, v7, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    invoke-static {v3}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    move-wide v3, v5

    .line 99
    :goto_2
    invoke-virtual {v2, v3, v4, v0, v1}, La/j5t;->d(DJ)V

    .line 100
    .line 101
    .line 102
    :cond_3
    iget-object v2, v2, La/j5t;->j:Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/lang/Double;

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    goto/16 :goto_7

    .line 121
    .line 122
    :cond_4
    move-wide v0, v5

    .line 123
    goto/16 :goto_7

    .line 124
    .line 125
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 126
    .line 127
    .line 128
    return-wide v5

    .line 129
    :cond_6
    iget-object v2, v4, La/pbt;->a:La/j5t;

    .line 130
    .line 131
    iget-object v7, v2, La/j5t;->i:Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    check-cast v7, Ljava/lang/Double;

    .line 142
    .line 143
    if-eqz v7, :cond_7

    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 146
    .line 147
    .line 148
    move-result-wide v7

    .line 149
    goto :goto_3

    .line 150
    :cond_7
    move-wide v7, v5

    .line 151
    :goto_3
    cmpg-double v7, v7, v5

    .line 152
    .line 153
    if-nez v7, :cond_9

    .line 154
    .line 155
    iget-object v4, v4, La/pbt;->b:La/lsn;

    .line 156
    .line 157
    iget-object v4, v4, La/lsn;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v4, Landroid/content/SharedPreferences;

    .line 160
    .line 161
    new-instance v7, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v8, "secondFastBet"

    .line 164
    .line 165
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-interface {v4, v7, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    if-eqz v3, :cond_8

    .line 180
    .line 181
    invoke-static {v3}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    if-eqz v3, :cond_8

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 188
    .line 189
    .line 190
    move-result-wide v3

    .line 191
    goto :goto_4

    .line 192
    :cond_8
    move-wide v3, v5

    .line 193
    :goto_4
    invoke-virtual {v2, v3, v4, v0, v1}, La/j5t;->c(DJ)V

    .line 194
    .line 195
    .line 196
    :cond_9
    iget-object v2, v2, La/j5t;->i:Ljava/util/HashMap;

    .line 197
    .line 198
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Ljava/lang/Double;

    .line 207
    .line 208
    if-eqz v0, :cond_4

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    goto :goto_7

    .line 215
    :cond_a
    iget-object v2, v4, La/pbt;->a:La/j5t;

    .line 216
    .line 217
    iget-object v7, v2, La/j5t;->h:Ljava/util/HashMap;

    .line 218
    .line 219
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    check-cast v7, Ljava/lang/Double;

    .line 228
    .line 229
    if-eqz v7, :cond_b

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 232
    .line 233
    .line 234
    move-result-wide v7

    .line 235
    goto :goto_5

    .line 236
    :cond_b
    move-wide v7, v5

    .line 237
    :goto_5
    cmpg-double v7, v7, v5

    .line 238
    .line 239
    if-nez v7, :cond_d

    .line 240
    .line 241
    iget-object v4, v4, La/pbt;->b:La/lsn;

    .line 242
    .line 243
    iget-object v4, v4, La/lsn;->a:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v4, Landroid/content/SharedPreferences;

    .line 246
    .line 247
    new-instance v7, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string v8, "firstFastBet"

    .line 250
    .line 251
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-interface {v4, v7, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    if-eqz v3, :cond_c

    .line 266
    .line 267
    invoke-static {v3}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    if-eqz v3, :cond_c

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 274
    .line 275
    .line 276
    move-result-wide v3

    .line 277
    goto :goto_6

    .line 278
    :cond_c
    move-wide v3, v5

    .line 279
    :goto_6
    invoke-virtual {v2, v3, v4, v0, v1}, La/j5t;->b(DJ)V

    .line 280
    .line 281
    .line 282
    :cond_d
    iget-object v2, v2, La/j5t;->h:Ljava/util/HashMap;

    .line 283
    .line 284
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, Ljava/lang/Double;

    .line 293
    .line 294
    if-eqz v0, :cond_4

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 297
    .line 298
    .line 299
    move-result-wide v0

    .line 300
    :goto_7
    cmpg-double v2, v0, v5

    .line 301
    .line 302
    if-nez v2, :cond_e

    .line 303
    .line 304
    iget-object p0, p0, La/v8u;->a:La/v4u;

    .line 305
    .line 306
    invoke-virtual {p0, p1}, La/v4u;->a(La/gxo;)D

    .line 307
    .line 308
    .line 309
    move-result-wide p0

    .line 310
    return-wide p0

    .line 311
    :cond_e
    return-wide v0
.end method
