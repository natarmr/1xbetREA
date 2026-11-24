.class public final La/mhu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/twz;


# direct methods
.method public constructor <init>(La/twz;)V
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
    iput-object p1, p0, La/mhu;->a:La/twz;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/ucq;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, La/lhu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/lhu;

    .line 7
    .line 8
    iget v1, v0, La/lhu;->n:I

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
    iput v1, v0, La/lhu;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lhu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/lhu;-><init>(La/mhu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/lhu;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lhu;->n:I

    .line 30
    .line 31
    iget-object p0, p0, La/mhu;->a:La/twz;

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, La/lhu;->k:Ljava/util/ArrayList;

    .line 43
    .line 44
    iget-object p1, v0, La/lhu;->j:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_a

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    iget-object p2, v0, La/lhu;->i:La/ucq;

    .line 58
    .line 59
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, v0, La/lhu;->i:La/ucq;

    .line 67
    .line 68
    iput v4, v0, La/lhu;->n:I

    .line 69
    .line 70
    invoke-virtual {p0, p1, v0}, La/twz;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    if-ne p3, v1, :cond_4

    .line 75
    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_4
    :goto_1
    check-cast p3, La/lzz;

    .line 79
    .line 80
    iget-object p1, p3, La/lzz;->a:Ljava/util/List;

    .line 81
    .line 82
    new-instance v2, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/4 v6, 0x0

    .line 96
    if-eqz v4, :cond_8

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    move-object v7, v4

    .line 103
    check-cast v7, La/qcq;

    .line 104
    .line 105
    iget-object v7, v7, La/qcq;->b:La/xrz;

    .line 106
    .line 107
    instance-of v8, v7, La/xh7;

    .line 108
    .line 109
    if-eqz v8, :cond_6

    .line 110
    .line 111
    iget-boolean v6, p2, La/ucq;->l:Z

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    instance-of v7, v7, La/q8k;

    .line 115
    .line 116
    if-eqz v7, :cond_7

    .line 117
    .line 118
    iget-boolean v6, p2, La/ucq;->i:Z

    .line 119
    .line 120
    :cond_7
    :goto_3
    if-eqz v6, :cond_5

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    iget-object p1, p3, La/lzz;->b:Ljava/util/List;

    .line 127
    .line 128
    new-instance p3, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_9
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_d

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    move-object v7, v4

    .line 148
    check-cast v7, La/siq0;

    .line 149
    .line 150
    iget-object v7, v7, La/siq0;->b:La/xrz;

    .line 151
    .line 152
    instance-of v8, v7, La/h8i0;

    .line 153
    .line 154
    if-eqz v8, :cond_a

    .line 155
    .line 156
    iget-boolean v7, p2, La/ucq;->k:Z

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_a
    instance-of v8, v7, La/qmq0;

    .line 160
    .line 161
    if-eqz v8, :cond_b

    .line 162
    .line 163
    iget-boolean v7, p2, La/ucq;->n:Z

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_b
    instance-of v7, v7, La/tbe0;

    .line 167
    .line 168
    if-eqz v7, :cond_c

    .line 169
    .line 170
    iget-boolean v7, p2, La/ucq;->o:Z

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_c
    move v7, v6

    .line 174
    :goto_5
    if-eqz v7, :cond_9

    .line 175
    .line 176
    invoke-virtual {p3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_d
    iput-object v5, v0, La/lhu;->i:La/ucq;

    .line 181
    .line 182
    iput-object v2, v0, La/lhu;->j:Ljava/util/ArrayList;

    .line 183
    .line 184
    iput-object p3, v0, La/lhu;->k:Ljava/util/ArrayList;

    .line 185
    .line 186
    iput v3, v0, La/lhu;->n:I

    .line 187
    .line 188
    iget-object p1, p0, La/twz;->c:La/kwz;

    .line 189
    .line 190
    iget-boolean p1, p1, La/kwz;->i:Z

    .line 191
    .line 192
    if-eqz p1, :cond_e

    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_e
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz p2, :cond_10

    .line 206
    .line 207
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    move-object v3, p2

    .line 212
    check-cast v3, La/siq0;

    .line 213
    .line 214
    iget-object v4, v3, La/siq0;->b:La/xrz;

    .line 215
    .line 216
    sget-object v6, La/tbe0;->a:La/tbe0;

    .line 217
    .line 218
    if-ne v4, v6, :cond_f

    .line 219
    .line 220
    iget-object v3, v3, La/siq0;->j:La/lrz;

    .line 221
    .line 222
    sget-object v4, La/lrz;->b:La/lrz;

    .line 223
    .line 224
    if-ne v3, v4, :cond_f

    .line 225
    .line 226
    move-object v5, p2

    .line 227
    :cond_10
    check-cast v5, La/siq0;

    .line 228
    .line 229
    if-nez v5, :cond_11

    .line 230
    .line 231
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_11
    sget-object p1, La/wen;->b:La/uen;

    .line 235
    .line 236
    iget-wide p1, v5, La/siq0;->e:D

    .line 237
    .line 238
    sget-object v3, La/bfn;->f:La/bfn;

    .line 239
    .line 240
    invoke-static {p1, p2, v3}, La/ibc;->u0(DLa/bfn;)J

    .line 241
    .line 242
    .line 243
    move-result-wide p1

    .line 244
    invoke-static {p1, p2}, La/wen;->e(J)J

    .line 245
    .line 246
    .line 247
    move-result-wide p1

    .line 248
    iget-object p0, p0, La/twz;->c:La/kwz;

    .line 249
    .line 250
    iget-wide v3, p0, La/kwz;->e:J

    .line 251
    .line 252
    cmp-long v3, p1, v3

    .line 253
    .line 254
    if-eqz v3, :cond_15

    .line 255
    .line 256
    iput-wide p1, p0, La/kwz;->e:J

    .line 257
    .line 258
    iget-object p0, p0, La/kwz;->d:La/qoj0;

    .line 259
    .line 260
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    invoke-virtual {p0, p1, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    sget-object p2, La/wne;->a:La/wne;

    .line 267
    .line 268
    if-ne p0, p2, :cond_12

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_12
    move-object p0, p1

    .line 272
    :goto_6
    if-ne p0, p2, :cond_13

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_13
    move-object p0, p1

    .line 276
    :goto_7
    if-ne p0, p2, :cond_14

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_14
    move-object p0, p1

    .line 280
    goto :goto_8

    .line 281
    :cond_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    :goto_8
    if-ne p0, v1, :cond_16

    .line 284
    .line 285
    :goto_9
    return-object v1

    .line 286
    :cond_16
    move-object p0, p3

    .line 287
    move-object p1, v2

    .line 288
    :goto_a
    new-instance p2, La/lzz;

    .line 289
    .line 290
    invoke-direct {p2, p1, p0}, La/lzz;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 291
    .line 292
    .line 293
    return-object p2
.end method
