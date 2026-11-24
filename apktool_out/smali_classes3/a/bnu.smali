.class public final La/bnu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j2u;

.field public final b:La/pmi;

.field public final c:La/pv00;

.field public final d:La/yfu;

.field public final e:La/epc;

.field public final f:La/kqc;

.field public final g:La/pru;


# direct methods
.method public constructor <init>(La/j2u;La/pmi;La/pv00;La/yfu;La/epc;La/kqc;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/bnu;->a:La/j2u;

    .line 8
    .line 9
    iput-object p2, p0, La/bnu;->b:La/pmi;

    .line 10
    .line 11
    iput-object p3, p0, La/bnu;->c:La/pv00;

    .line 12
    .line 13
    iput-object p4, p0, La/bnu;->d:La/yfu;

    .line 14
    .line 15
    iput-object p5, p0, La/bnu;->e:La/epc;

    .line 16
    .line 17
    iput-object p6, p0, La/bnu;->f:La/kqc;

    .line 18
    .line 19
    iput-object p7, p0, La/bnu;->g:La/pru;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Ljava/util/List;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, La/anu;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/anu;

    .line 9
    .line 10
    iget v2, v1, La/anu;->o:I

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
    iput v2, v1, La/anu;->o:I

    .line 20
    .line 21
    :goto_0
    move-object v8, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La/anu;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/anu;-><init>(La/bnu;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v8, La/anu;->m:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v1, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v8, La/anu;->o:I

    .line 34
    .line 35
    const/4 v9, 0x3

    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x1

    .line 38
    const/4 v10, 0x0

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-eq v2, v4, :cond_3

    .line 42
    .line 43
    if-eq v2, v3, :cond_2

    .line 44
    .line 45
    if-ne v2, v9, :cond_1

    .line 46
    .line 47
    iget-wide v1, v8, La/anu;->l:J

    .line 48
    .line 49
    iget-object v3, v8, La/anu;->i:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v10

    .line 62
    :cond_2
    iget-wide v2, v8, La/anu;->l:J

    .line 63
    .line 64
    iget-object v4, v8, La/anu;->i:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v4, La/bnu;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    move-wide v11, v2

    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-wide v11, v2

    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_3
    iget-wide v4, v8, La/anu;->l:J

    .line 79
    .line 80
    iget-object v2, v8, La/anu;->k:La/j2u;

    .line 81
    .line 82
    iget-object v6, v8, La/anu;->j:Ljava/util/List;

    .line 83
    .line 84
    iget-object v7, v8, La/anu;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v7, La/bnu;

    .line 87
    .line 88
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    .line 91
    move-wide v11, v4

    .line 92
    move-object v5, v6

    .line 93
    goto :goto_2

    .line 94
    :catchall_1
    move-exception v0

    .line 95
    move-wide v11, v4

    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 102
    .line 103
    iget-object v2, p0, La/bnu;->a:La/j2u;

    .line 104
    .line 105
    iget-object v0, p0, La/bnu;->b:La/pmi;

    .line 106
    .line 107
    iput-object p0, v8, La/anu;->i:Ljava/lang/Object;

    .line 108
    .line 109
    move-object/from16 v5, p4

    .line 110
    .line 111
    iput-object v5, v8, La/anu;->j:Ljava/util/List;

    .line 112
    .line 113
    iput-object v2, v8, La/anu;->k:La/j2u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 114
    .line 115
    move-wide v6, p1

    .line 116
    :try_start_3
    iput-wide v6, v8, La/anu;->l:J

    .line 117
    .line 118
    iput v4, v8, La/anu;->o:I

    .line 119
    .line 120
    invoke-virtual {v0, v8}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 121
    .line 122
    .line 123
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 124
    if-ne v0, v1, :cond_5

    .line 125
    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_5
    move-wide v11, v6

    .line 129
    move-object v7, p0

    .line 130
    :goto_2
    :try_start_4
    check-cast v0, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    iget-object v0, v7, La/bnu;->e:La/epc;

    .line 137
    .line 138
    invoke-virtual {v0}, La/epc;->a()La/hr4;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-boolean v0, v0, La/hr4;->a:Z

    .line 143
    .line 144
    sget-object v6, La/sub0;->b:La/nh70;

    .line 145
    .line 146
    iget-object v13, v7, La/bnu;->f:La/kqc;

    .line 147
    .line 148
    invoke-virtual {v13}, La/kqc;->a()La/sub0;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v13}, La/nh70;->j(La/sub0;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    iget-object v7, v7, La/bnu;->g:La/pru;

    .line 160
    .line 161
    invoke-virtual {v7}, La/pru;->a()La/sff0;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    iget-object v7, v7, La/sff0;->d:La/q1w0;

    .line 166
    .line 167
    iget-boolean v7, v7, La/q1w0;->b:Z

    .line 168
    .line 169
    iput-object v10, v8, La/anu;->i:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v10, v8, La/anu;->j:Ljava/util/List;

    .line 172
    .line 173
    iput-object v10, v8, La/anu;->k:La/j2u;

    .line 174
    .line 175
    iput-wide v11, v8, La/anu;->l:J

    .line 176
    .line 177
    iput v3, v8, La/anu;->o:I

    .line 178
    .line 179
    move-object v3, v5

    .line 180
    move v5, v0

    .line 181
    invoke-virtual/range {v2 .. v8}, La/j2u;->a(Ljava/util/List;IZZZLa/zje;)Ljava/io/Serializable;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-ne v0, v1, :cond_6

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_6
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 189
    .line 190
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 191
    .line 192
    move-object v3, v0

    .line 193
    goto :goto_6

    .line 194
    :catchall_2
    move-exception v0

    .line 195
    goto :goto_5

    .line 196
    :catchall_3
    move-exception v0

    .line 197
    :goto_4
    move-wide v11, v6

    .line 198
    goto :goto_5

    .line 199
    :catchall_4
    move-exception v0

    .line 200
    move-wide v6, p1

    .line 201
    goto :goto_4

    .line 202
    :goto_5
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 203
    .line 204
    new-instance v2, La/g0g0;

    .line 205
    .line 206
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    move-object v3, v2

    .line 210
    :goto_6
    instance-of v0, v3, La/g0g0;

    .line 211
    .line 212
    if-nez v0, :cond_8

    .line 213
    .line 214
    move-object v0, v3

    .line 215
    check-cast v0, Ljava/util/List;

    .line 216
    .line 217
    iput-object v3, v8, La/anu;->i:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v10, v8, La/anu;->j:Ljava/util/List;

    .line 220
    .line 221
    iput-object v10, v8, La/anu;->k:La/j2u;

    .line 222
    .line 223
    iput-wide v11, v8, La/anu;->l:J

    .line 224
    .line 225
    iput v9, v8, La/anu;->o:I

    .line 226
    .line 227
    iget-object v2, p0, La/bnu;->c:La/pv00;

    .line 228
    .line 229
    iget-object v2, v2, La/pv00;->a:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v2, La/ux80;

    .line 232
    .line 233
    iget-object v2, v2, La/ux80;->a:La/yox;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iget-object v2, v2, La/yox;->a:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, La/or30;

    .line 241
    .line 242
    invoke-virtual {v2, v0}, La/or30;->d(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    sget-object v2, La/wne;->a:La/wne;

    .line 248
    .line 249
    if-ne v0, v1, :cond_7

    .line 250
    .line 251
    :goto_7
    return-object v1

    .line 252
    :cond_7
    move-wide v1, v11

    .line 253
    :goto_8
    move-wide v11, v1

    .line 254
    :cond_8
    invoke-static {v3}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-nez v0, :cond_9

    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_9
    iget-object p0, p0, La/bnu;->d:La/yfu;

    .line 262
    .line 263
    iget-object p0, p0, La/yfu;->a:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast p0, La/ux80;

    .line 266
    .line 267
    iget-object p0, p0, La/ux80;->a:La/yox;

    .line 268
    .line 269
    iget-object p0, p0, La/yox;->a:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p0, La/or30;

    .line 272
    .line 273
    invoke-virtual {p0, v11, v12}, La/or30;->c(J)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    move-object v3, p0

    .line 278
    check-cast v3, Ljava/util/List;

    .line 279
    .line 280
    :goto_9
    return-object v3
.end method
