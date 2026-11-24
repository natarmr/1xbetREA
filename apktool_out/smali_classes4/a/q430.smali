.class public final La/q430;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/eio;

.field public final b:La/he1;

.field public final c:La/mne;


# direct methods
.method public constructor <init>(La/eio;La/he1;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/q430;->a:La/eio;

    .line 5
    .line 6
    iput-object p2, p0, La/q430;->b:La/he1;

    .line 7
    .line 8
    iput-object p3, p0, La/q430;->c:La/mne;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/wt20;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/o430;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/o430;

    .line 7
    .line 8
    iget v1, v0, La/o430;->l:I

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
    iput v1, v0, La/o430;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/o430;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/o430;-><init>(La/q430;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/o430;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/o430;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    iget-object p0, p0, La/q430;->a:La/eio;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v6, :cond_3

    .line 41
    .line 42
    if-eq v2, v5, :cond_2

    .line 43
    .line 44
    if-ne v2, v4, :cond_1

    .line 45
    .line 46
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    return-object v7

    .line 57
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_3
    iget-object p1, v0, La/o430;->i:La/ut20;

    .line 63
    .line 64
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance p2, La/ut20;

    .line 75
    .line 76
    iget-wide v8, p1, La/wt20;->a:J

    .line 77
    .line 78
    iget-boolean v2, p1, La/wt20;->d:Z

    .line 79
    .line 80
    iget p1, p1, La/wt20;->c:I

    .line 81
    .line 82
    invoke-direct {p2, p1, v8, v9, v2}, La/ut20;-><init>(IJZ)V

    .line 83
    .line 84
    .line 85
    iput-object p2, v0, La/o430;->i:La/ut20;

    .line 86
    .line 87
    iput v6, v0, La/o430;->l:I

    .line 88
    .line 89
    invoke-virtual {p0}, La/eio;->a()La/tt20;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, La/tt20;->a:La/zdg0;

    .line 94
    .line 95
    new-instance v2, La/st20;

    .line 96
    .line 97
    invoke-direct {v2, v5, v7, v3}, La/st20;-><init>(ILa/yje;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, p1, v2, v6, v3}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v1, :cond_5

    .line 105
    .line 106
    goto/16 :goto_9

    .line 107
    .line 108
    :cond_5
    move-object v12, p2

    .line 109
    move-object p2, p1

    .line 110
    move-object p1, v12

    .line 111
    :goto_1
    check-cast p2, Ljava/util/Collection;

    .line 112
    .line 113
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_6
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_b

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    check-cast v8, La/ut20;

    .line 139
    .line 140
    iget-wide v8, v8, La/ut20;->a:J

    .line 141
    .line 142
    iget-wide v10, p1, La/ut20;->a:J

    .line 143
    .line 144
    cmp-long v8, v8, v10

    .line 145
    .line 146
    if-nez v8, :cond_7

    .line 147
    .line 148
    iput-object v7, v0, La/o430;->i:La/ut20;

    .line 149
    .line 150
    iput v5, v0, La/o430;->l:I

    .line 151
    .line 152
    invoke-virtual {p0}, La/eio;->a()La/tt20;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    iget-object p0, p0, La/tt20;->a:La/zdg0;

    .line 157
    .line 158
    new-instance p1, La/hu6;

    .line 159
    .line 160
    const/4 p2, 0x7

    .line 161
    invoke-direct {p1, v10, v11, v7, p2}, La/hu6;-><init>(JLa/yje;B)V

    .line 162
    .line 163
    .line 164
    invoke-static {v0, p0, p1, v3, v6}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    sget-object p1, La/wne;->a:La/wne;

    .line 169
    .line 170
    if-ne p0, p1, :cond_8

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    :goto_2
    if-ne p0, p1, :cond_9

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    :goto_3
    if-ne p0, v1, :cond_a

    .line 181
    .line 182
    goto :goto_9

    .line 183
    :cond_a
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_b
    :goto_5
    invoke-virtual {p2, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Ljava/util/ArrayList;

    .line 190
    .line 191
    const/16 v2, 0xa

    .line 192
    .line 193
    invoke-static {p2, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    move v2, v3

    .line 205
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_d

    .line 210
    .line 211
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    add-int/lit8 v8, v2, 0x1

    .line 216
    .line 217
    if-ltz v2, :cond_c

    .line 218
    .line 219
    check-cast v5, La/ut20;

    .line 220
    .line 221
    invoke-static {v5, v8}, La/ut20;->a(La/ut20;I)La/ut20;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move v2, v8

    .line 229
    goto :goto_6

    .line 230
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 231
    .line 232
    .line 233
    throw v7

    .line 234
    :cond_d
    iput-object v7, v0, La/o430;->i:La/ut20;

    .line 235
    .line 236
    iput v4, v0, La/o430;->l:I

    .line 237
    .line 238
    invoke-virtual {p0}, La/eio;->a()La/tt20;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    iget-object p2, p0, La/tt20;->a:La/zdg0;

    .line 243
    .line 244
    new-instance v2, La/v620;

    .line 245
    .line 246
    const/16 v4, 0x1b

    .line 247
    .line 248
    invoke-direct {v2, p0, p1, v7, v4}, La/v620;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 249
    .line 250
    .line 251
    invoke-static {v0, p2, v2, v3, v6}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    sget-object p1, La/wne;->a:La/wne;

    .line 256
    .line 257
    if-ne p0, p1, :cond_e

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    :goto_7
    if-ne p0, p1, :cond_f

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_8
    if-ne p0, v1, :cond_10

    .line 268
    .line 269
    :goto_9
    return-object v1

    .line 270
    :cond_10
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0
.end method
