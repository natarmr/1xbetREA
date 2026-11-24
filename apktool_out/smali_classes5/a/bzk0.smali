.class public final La/bzk0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/lme0;

.field public final c:La/zyk0;

.field public final d:La/uyk0;

.field public final e:La/btt0;


# direct methods
.method public constructor <init>(La/knf0;La/lme0;La/zyk0;La/uyk0;La/btt0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bzk0;->a:La/knf0;

    .line 5
    .line 6
    iput-object p2, p0, La/bzk0;->b:La/lme0;

    .line 7
    .line 8
    iput-object p3, p0, La/bzk0;->c:La/zyk0;

    .line 9
    .line 10
    iput-object p4, p0, La/bzk0;->d:La/uyk0;

    .line 11
    .line 12
    iput-object p5, p0, La/bzk0;->e:La/btt0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(DJLa/csr;Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    instance-of v3, v2, La/azk0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/azk0;

    .line 13
    .line 14
    iget v4, v3, La/azk0;->l:I

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
    iput v4, v3, La/azk0;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/azk0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/azk0;-><init>(La/bzk0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/azk0;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/azk0;->l:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v7, :cond_1

    .line 42
    .line 43
    iget-object v0, v3, La/azk0;->i:La/lme0;

    .line 44
    .line 45
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, La/bzk0;->a:La/knf0;

    .line 59
    .line 60
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    iget-object v2, v0, La/bzk0;->e:La/btt0;

    .line 65
    .line 66
    invoke-virtual {v2}, La/btt0;->a()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v5, v0, La/bzk0;->b:La/lme0;

    .line 71
    .line 72
    iput-object v5, v3, La/azk0;->i:La/lme0;

    .line 73
    .line 74
    iput v7, v3, La/azk0;->l:I

    .line 75
    .line 76
    iget-object v0, v0, La/bzk0;->c:La/zyk0;

    .line 77
    .line 78
    iget-object v0, v0, La/zyk0;->b:La/goi0;

    .line 79
    .line 80
    invoke-virtual {v0}, La/goi0;->invoke()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/wxk0;

    .line 85
    .line 86
    new-instance v8, Ljava/lang/Double;

    .line 87
    .line 88
    move-wide/from16 v9, p1

    .line 89
    .line 90
    invoke-direct {v8, v9, v10}, Ljava/lang/Double;-><init>(D)V

    .line 91
    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    iget-object v9, v1, La/csr;->a:La/bsr;

    .line 96
    .line 97
    iget-object v9, v9, La/bsr;->a:La/esr;

    .line 98
    .line 99
    invoke-virtual {v9}, La/esr;->a()Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-nez v9, :cond_3

    .line 104
    .line 105
    move-object v12, v8

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move-object v12, v6

    .line 108
    :goto_1
    if-eqz v1, :cond_4

    .line 109
    .line 110
    sget-object v8, La/bg8;->Companion:La/ag8;

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, La/ag8;->a(La/csr;)La/bg8;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    move-object v11, v1

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    move-object v11, v6

    .line 122
    :goto_2
    new-instance v8, La/yyk0;

    .line 123
    .line 124
    move-wide/from16 v9, p3

    .line 125
    .line 126
    move-object/from16 v14, p6

    .line 127
    .line 128
    invoke-direct/range {v8 .. v14}, La/yyk0;-><init>(JLa/bg8;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0, v2, v8, v3}, La/wxk0;->a(Ljava/lang/String;La/yyk0;La/yje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-ne v2, v4, :cond_5

    .line 136
    .line 137
    return-object v4

    .line 138
    :cond_5
    move-object v0, v5

    .line 139
    :goto_3
    check-cast v2, La/u2t;

    .line 140
    .line 141
    invoke-virtual {v2}, La/u2t;->a()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, La/ezk0;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v0, v1, La/ezk0;->a:Ljava/lang/Long;

    .line 151
    .line 152
    if-eqz v0, :cond_6

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    :goto_4
    move-wide v9, v2

    .line 159
    goto :goto_5

    .line 160
    :cond_6
    const-wide/16 v2, 0x0

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :goto_5
    iget-object v0, v1, La/ezk0;->b:Ljava/lang/Double;

    .line 164
    .line 165
    const-wide/16 v2, 0x0

    .line 166
    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 170
    .line 171
    .line 172
    move-result-wide v4

    .line 173
    move-wide v11, v4

    .line 174
    goto :goto_6

    .line 175
    :cond_7
    move-wide v11, v2

    .line 176
    :goto_6
    iget-object v0, v1, La/ezk0;->c:Ljava/lang/Double;

    .line 177
    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 181
    .line 182
    .line 183
    move-result-wide v4

    .line 184
    move-wide v13, v4

    .line 185
    goto :goto_7

    .line 186
    :cond_8
    move-wide v13, v2

    .line 187
    :goto_7
    iget-object v0, v1, La/ezk0;->d:Ljava/util/List;

    .line 188
    .line 189
    if-eqz v0, :cond_10

    .line 190
    .line 191
    new-instance v4, Ljava/util/ArrayList;

    .line 192
    .line 193
    const/16 v5, 0xa

    .line 194
    .line 195
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-eqz v5, :cond_f

    .line 211
    .line 212
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    check-cast v5, La/yzc;

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_e

    .line 226
    .line 227
    if-eq v5, v7, :cond_d

    .line 228
    .line 229
    const/4 v8, 0x2

    .line 230
    if-eq v5, v8, :cond_c

    .line 231
    .line 232
    const/4 v8, 0x3

    .line 233
    if-eq v5, v8, :cond_b

    .line 234
    .line 235
    const/4 v8, 0x4

    .line 236
    if-eq v5, v8, :cond_a

    .line 237
    .line 238
    const/4 v8, 0x5

    .line 239
    if-ne v5, v8, :cond_9

    .line 240
    .line 241
    sget-object v5, La/yxk0;->f:La/yxk0;

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 245
    .line 246
    .line 247
    return-object v6

    .line 248
    :cond_a
    sget-object v5, La/yxk0;->e:La/yxk0;

    .line 249
    .line 250
    goto :goto_9

    .line 251
    :cond_b
    sget-object v5, La/yxk0;->d:La/yxk0;

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_c
    sget-object v5, La/yxk0;->c:La/yxk0;

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_d
    sget-object v5, La/yxk0;->b:La/yxk0;

    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_e
    sget-object v5, La/yxk0;->a:La/yxk0;

    .line 261
    .line 262
    :goto_9
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_f
    :goto_a
    move-object v15, v4

    .line 267
    goto :goto_b

    .line 268
    :cond_10
    sget-object v4, La/iun;->a:La/iun;

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :goto_b
    iget-object v0, v1, La/ezk0;->e:La/kyk0;

    .line 272
    .line 273
    if-eqz v0, :cond_13

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_12

    .line 280
    .line 281
    if-ne v0, v7, :cond_11

    .line 282
    .line 283
    sget-object v0, La/iyk0;->b:La/iyk0;

    .line 284
    .line 285
    goto :goto_c

    .line 286
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 287
    .line 288
    .line 289
    return-object v6

    .line 290
    :cond_12
    sget-object v0, La/iyk0;->a:La/iyk0;

    .line 291
    .line 292
    :goto_c
    move-object/from16 v16, v0

    .line 293
    .line 294
    goto :goto_d

    .line 295
    :cond_13
    sget-object v0, La/iyk0;->b:La/iyk0;

    .line 296
    .line 297
    goto :goto_c

    .line 298
    :goto_d
    iget-object v0, v1, La/ezk0;->f:Ljava/lang/Double;

    .line 299
    .line 300
    if-eqz v0, :cond_14

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 303
    .line 304
    .line 305
    move-result-wide v2

    .line 306
    :cond_14
    move-wide/from16 v17, v2

    .line 307
    .line 308
    iget-object v0, v1, La/ezk0;->g:Ljava/lang/String;

    .line 309
    .line 310
    if-nez v0, :cond_15

    .line 311
    .line 312
    const-string v0, ""

    .line 313
    .line 314
    :cond_15
    move-object/from16 v19, v0

    .line 315
    .line 316
    new-instance v8, La/vyk0;

    .line 317
    .line 318
    invoke-direct/range {v8 .. v19}, La/vyk0;-><init>(JDDLjava/util/List;La/iyk0;DLjava/lang/String;)V

    .line 319
    .line 320
    .line 321
    return-object v8
.end method
