.class public final La/kvu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/z220;


# direct methods
.method public synthetic constructor <init>(La/z220;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/kvu;->a:La/z220;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Enum;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, La/zzn0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/zzn0;

    .line 11
    .line 12
    iget v3, v2, La/zzn0;->l:I

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
    iput v3, v2, La/zzn0;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/zzn0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/zzn0;-><init>(La/kvu;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/zzn0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/zzn0;->l:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    iget-object v0, v0, La/kvu;->a:La/z220;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v7, :cond_2

    .line 43
    .line 44
    if-ne v4, v6, :cond_1

    .line 45
    .line 46
    iget-object v2, v2, La/zzn0;->i:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v5

    .line 58
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput v7, v2, La/zzn0;->l:I

    .line 66
    .line 67
    iget-object v1, v0, La/z220;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, La/yvn0;

    .line 70
    .line 71
    iget-object v1, v1, La/yvn0;->c:La/p7m0;

    .line 72
    .line 73
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/util/List;

    .line 78
    .line 79
    if-ne v1, v3, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    check-cast v1, Ljava/util/List;

    .line 83
    .line 84
    iput-object v1, v2, La/zzn0;->i:Ljava/util/List;

    .line 85
    .line 86
    iput v6, v2, La/zzn0;->l:I

    .line 87
    .line 88
    invoke-virtual {v0, v2}, La/z220;->v(La/zje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-ne v2, v3, :cond_5

    .line 93
    .line 94
    :goto_2
    return-object v3

    .line 95
    :cond_5
    move-object/from16 v16, v2

    .line 96
    .line 97
    move-object v2, v1

    .line 98
    move-object/from16 v1, v16

    .line 99
    .line 100
    :goto_3
    check-cast v1, Ljava/util/List;

    .line 101
    .line 102
    new-instance v3, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_9

    .line 116
    .line 117
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    move-object v8, v6

    .line 122
    check-cast v8, La/hpn0;

    .line 123
    .line 124
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_8

    .line 133
    .line 134
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    move-object v11, v10

    .line 139
    check-cast v11, La/hpn0;

    .line 140
    .line 141
    iget-wide v12, v11, La/hpn0;->a:J

    .line 142
    .line 143
    iget-wide v14, v8, La/hpn0;->a:J

    .line 144
    .line 145
    cmp-long v12, v12, v14

    .line 146
    .line 147
    if-nez v12, :cond_7

    .line 148
    .line 149
    iget-wide v11, v11, La/hpn0;->c:J

    .line 150
    .line 151
    iget-wide v13, v8, La/hpn0;->c:J

    .line 152
    .line 153
    cmp-long v11, v11, v13

    .line 154
    .line 155
    if-nez v11, :cond_7

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_8
    move-object v10, v5

    .line 159
    :goto_5
    if-eqz v10, :cond_6

    .line 160
    .line 161
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    invoke-virtual {v0, v3}, La/z220;->M(Ljava/util/ArrayList;)V

    .line 166
    .line 167
    .line 168
    new-instance v4, Ljava/util/ArrayList;

    .line 169
    .line 170
    const/16 v6, 0xa

    .line 171
    .line 172
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_d

    .line 188
    .line 189
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    check-cast v6, La/hpn0;

    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    :cond_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    if-eqz v9, :cond_b

    .line 204
    .line 205
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    move-object v10, v9

    .line 210
    check-cast v10, La/hpn0;

    .line 211
    .line 212
    iget-wide v11, v10, La/hpn0;->a:J

    .line 213
    .line 214
    iget-wide v13, v6, La/hpn0;->a:J

    .line 215
    .line 216
    cmp-long v11, v11, v13

    .line 217
    .line 218
    if-nez v11, :cond_a

    .line 219
    .line 220
    iget-wide v10, v10, La/hpn0;->c:J

    .line 221
    .line 222
    iget-wide v12, v6, La/hpn0;->c:J

    .line 223
    .line 224
    cmp-long v10, v10, v12

    .line 225
    .line 226
    if-nez v10, :cond_a

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_b
    move-object v9, v5

    .line 230
    :goto_7
    if-eqz v9, :cond_c

    .line 231
    .line 232
    move v8, v7

    .line 233
    goto :goto_8

    .line 234
    :cond_c
    const/4 v8, 0x0

    .line 235
    :goto_8
    invoke-static {v6, v8}, La/hpn0;->a(La/hpn0;Z)La/hpn0;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_d
    invoke-virtual {v0, v4}, La/z220;->b(Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-eqz v0, :cond_e

    .line 251
    .line 252
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_e

    .line 257
    .line 258
    sget-object v0, La/o0o0;->b:La/o0o0;

    .line 259
    .line 260
    return-object v0

    .line 261
    :cond_e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-ne v0, v1, :cond_12

    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_f

    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_11

    .line 287
    .line 288
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, La/hpn0;

    .line 293
    .line 294
    iget v1, v1, La/hpn0;->e:I

    .line 295
    .line 296
    if-gtz v1, :cond_10

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_11
    :goto_9
    sget-object v0, La/o0o0;->c:La/o0o0;

    .line 300
    .line 301
    return-object v0

    .line 302
    :cond_12
    :goto_a
    sget-object v0, La/o0o0;->a:La/o0o0;

    .line 303
    .line 304
    return-object v0
.end method
