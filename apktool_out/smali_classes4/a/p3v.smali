.class public final La/p3v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kmq;La/nc0;JIILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/p3v;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/p3v;->b:La/kmq;

    .line 8
    .line 9
    iput-object p2, p0, La/p3v;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p3, p0, La/p3v;->c:J

    .line 12
    .line 13
    iput p5, p0, La/p3v;->d:I

    .line 14
    .line 15
    iput-byte p6, p0, La/p3v;->e:B

    .line 16
    .line 17
    iput-object p7, p0, La/p3v;->g:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/kmq;Ljava/util/Date;La/y3v;JII)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/p3v;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p3v;->b:La/kmq;

    iput-object p2, p0, La/p3v;->f:Ljava/lang/Object;

    iput-object p3, p0, La/p3v;->g:Ljava/lang/Object;

    iput-wide p4, p0, La/p3v;->c:J

    iput p6, p0, La/p3v;->d:I

    iput-byte p7, p0, La/p3v;->e:B

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/p3v;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/p3v;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/p3v;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/p3v;->b:La/kmq;

    .line 12
    .line 13
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/high16 v7, -0x80000000

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x2

    .line 19
    const/4 v10, 0x0

    .line 20
    packed-switch v2, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    instance-of v2, v1, La/w3v;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, La/w3v;

    .line 29
    .line 30
    iget v11, v2, La/w3v;->j:I

    .line 31
    .line 32
    and-int v12, v11, v7

    .line 33
    .line 34
    if-eqz v12, :cond_0

    .line 35
    .line 36
    sub-int/2addr v11, v7

    .line 37
    iput v11, v2, La/w3v;->j:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v2, La/w3v;

    .line 41
    .line 42
    invoke-direct {v2, v0, v1}, La/w3v;-><init>(La/p3v;La/yje;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object v1, v2, La/w3v;->i:Ljava/lang/Object;

    .line 46
    .line 47
    sget-object v7, La/wne;->a:La/wne;

    .line 48
    .line 49
    iget v11, v2, La/w3v;->j:I

    .line 50
    .line 51
    if-eqz v11, :cond_3

    .line 52
    .line 53
    if-eq v11, v8, :cond_2

    .line 54
    .line 55
    if-ne v11, v9, :cond_1

    .line 56
    .line 57
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_2
    iget-object v0, v2, La/w3v;->m:Ljava/util/Date;

    .line 68
    .line 69
    iget-object v5, v2, La/w3v;->l:La/kmq;

    .line 70
    .line 71
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    check-cast v1, La/j0g0;

    .line 75
    .line 76
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 77
    .line 78
    move-object/from16 v18, v1

    .line 79
    .line 80
    move-object v1, v0

    .line 81
    move-object/from16 v0, v18

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object/from16 v1, p1

    .line 88
    .line 89
    check-cast v1, Ljava/util/Date;

    .line 90
    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    move-object v1, v4

    .line 94
    check-cast v1, Ljava/util/Date;

    .line 95
    .line 96
    :cond_4
    check-cast v3, La/y3v;

    .line 97
    .line 98
    iget-object v3, v3, La/y3v;->d:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v11, v3

    .line 101
    check-cast v11, La/svu;

    .line 102
    .line 103
    iput-object v5, v2, La/w3v;->l:La/kmq;

    .line 104
    .line 105
    iput-object v1, v2, La/w3v;->m:Ljava/util/Date;

    .line 106
    .line 107
    iput v8, v2, La/w3v;->j:I

    .line 108
    .line 109
    iget v12, v0, La/p3v;->d:I

    .line 110
    .line 111
    iget-byte v13, v0, La/p3v;->e:B

    .line 112
    .line 113
    iget-wide v14, v0, La/p3v;->c:J

    .line 114
    .line 115
    move-object/from16 v17, v1

    .line 116
    .line 117
    move-object/from16 v16, v2

    .line 118
    .line 119
    invoke-virtual/range {v11 .. v17}, La/svu;->m(IIJLa/zje;Ljava/util/Date;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-ne v1, v7, :cond_5

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-object v0, v1

    .line 127
    move-object/from16 v1, v17

    .line 128
    .line 129
    :goto_1
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 130
    .line 131
    instance-of v3, v0, La/g0g0;

    .line 132
    .line 133
    if-nez v3, :cond_6

    .line 134
    .line 135
    :try_start_0
    check-cast v0, La/vdg;

    .line 136
    .line 137
    iget-object v0, v0, La/vdg;->b:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 142
    .line 143
    new-instance v3, La/g0g0;

    .line 144
    .line 145
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object v0, v3

    .line 149
    :cond_6
    :goto_2
    new-instance v3, La/qbt0;

    .line 150
    .line 151
    invoke-direct {v3, v1, v0}, La/qbt0;-><init>(Ljava/util/Date;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iput-object v10, v2, La/w3v;->l:La/kmq;

    .line 155
    .line 156
    iput-object v10, v2, La/w3v;->m:Ljava/util/Date;

    .line 157
    .line 158
    iput v9, v2, La/w3v;->j:I

    .line 159
    .line 160
    invoke-interface {v5, v3, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v7, :cond_7

    .line 165
    .line 166
    :goto_3
    move-object v10, v7

    .line 167
    goto :goto_5

    .line 168
    :cond_7
    :goto_4
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_5
    return-object v10

    .line 171
    :pswitch_0
    instance-of v2, v1, La/o3v;

    .line 172
    .line 173
    if-eqz v2, :cond_8

    .line 174
    .line 175
    move-object v2, v1

    .line 176
    check-cast v2, La/o3v;

    .line 177
    .line 178
    iget v11, v2, La/o3v;->j:I

    .line 179
    .line 180
    and-int v12, v11, v7

    .line 181
    .line 182
    if-eqz v12, :cond_8

    .line 183
    .line 184
    sub-int/2addr v11, v7

    .line 185
    iput v11, v2, La/o3v;->j:I

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_8
    new-instance v2, La/o3v;

    .line 189
    .line 190
    invoke-direct {v2, v0, v1}, La/o3v;-><init>(La/p3v;La/yje;)V

    .line 191
    .line 192
    .line 193
    :goto_6
    iget-object v1, v2, La/o3v;->i:Ljava/lang/Object;

    .line 194
    .line 195
    sget-object v7, La/wne;->a:La/wne;

    .line 196
    .line 197
    iget v11, v2, La/o3v;->j:I

    .line 198
    .line 199
    if-eqz v11, :cond_b

    .line 200
    .line 201
    if-eq v11, v8, :cond_a

    .line 202
    .line 203
    if-ne v11, v9, :cond_9

    .line 204
    .line 205
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto :goto_a

    .line 209
    :cond_9
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_b

    .line 213
    :cond_a
    iget-object v0, v2, La/o3v;->m:Ljava/util/Date;

    .line 214
    .line 215
    iget-object v5, v2, La/o3v;->l:La/kmq;

    .line 216
    .line 217
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    check-cast v1, La/j0g0;

    .line 221
    .line 222
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_b
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v1, p1

    .line 229
    .line 230
    check-cast v1, Ljava/util/Date;

    .line 231
    .line 232
    check-cast v4, La/nc0;

    .line 233
    .line 234
    iget-object v4, v4, La/nc0;->l:Ljava/lang/Object;

    .line 235
    .line 236
    move-object v11, v4

    .line 237
    check-cast v11, La/svu;

    .line 238
    .line 239
    iput-object v5, v2, La/o3v;->l:La/kmq;

    .line 240
    .line 241
    iput-object v1, v2, La/o3v;->m:Ljava/util/Date;

    .line 242
    .line 243
    iput v8, v2, La/o3v;->j:I

    .line 244
    .line 245
    iget v12, v0, La/p3v;->d:I

    .line 246
    .line 247
    iget-byte v13, v0, La/p3v;->e:B

    .line 248
    .line 249
    iget-wide v14, v0, La/p3v;->c:J

    .line 250
    .line 251
    move-object/from16 v17, v1

    .line 252
    .line 253
    move-object/from16 v16, v2

    .line 254
    .line 255
    invoke-virtual/range {v11 .. v17}, La/svu;->m(IIJLa/zje;Ljava/util/Date;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    if-ne v1, v7, :cond_c

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_c
    move-object/from16 v0, v17

    .line 263
    .line 264
    :goto_7
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 265
    .line 266
    instance-of v4, v1, La/g0g0;

    .line 267
    .line 268
    if-nez v4, :cond_d

    .line 269
    .line 270
    :try_start_1
    check-cast v1, La/vdg;

    .line 271
    .line 272
    new-instance v4, La/qbt0;

    .line 273
    .line 274
    iget-object v1, v1, La/vdg;->b:Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-direct {v4, v0, v1}, La/qbt0;-><init>(Ljava/util/Date;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 277
    .line 278
    .line 279
    move-object v1, v4

    .line 280
    goto :goto_8

    .line 281
    :catchall_1
    move-exception v0

    .line 282
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 283
    .line 284
    new-instance v1, La/g0g0;

    .line 285
    .line 286
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    :cond_d
    :goto_8
    new-instance v0, La/c8t0;

    .line 290
    .line 291
    invoke-direct {v0, v3, v1}, La/c8t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iput-object v10, v2, La/o3v;->l:La/kmq;

    .line 295
    .line 296
    iput-object v10, v2, La/o3v;->m:Ljava/util/Date;

    .line 297
    .line 298
    iput v9, v2, La/o3v;->j:I

    .line 299
    .line 300
    invoke-interface {v5, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-ne v0, v7, :cond_e

    .line 305
    .line 306
    :goto_9
    move-object v10, v7

    .line 307
    goto :goto_b

    .line 308
    :cond_e
    :goto_a
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    :goto_b
    return-object v10

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
