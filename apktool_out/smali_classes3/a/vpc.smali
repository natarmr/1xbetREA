.class public final La/vpc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gfi0;


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vpc;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, La/wnf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/wnf0;

    .line 7
    .line 8
    iget v1, v0, La/wnf0;->n:I

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
    iput v1, v0, La/wnf0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wnf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/wnf0;-><init>(La/vpc;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/wnf0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wnf0;->n:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    iget-object v7, p0, La/vpc;->a:La/g45;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v2, :cond_6

    .line 39
    .line 40
    if-eq v2, v6, :cond_5

    .line 41
    .line 42
    if-eq v2, v5, :cond_3

    .line 43
    .line 44
    if-eq v2, v4, :cond_2

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    iget-object v2, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 49
    .line 50
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v8

    .line 61
    :cond_2
    iget-object v2, v0, La/wnf0;->j:Ljava/util/Map$Entry;

    .line 62
    .line 63
    iget-object v9, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 64
    .line 65
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_3
    iget-object v2, v0, La/wnf0;->k:La/rei0;

    .line 71
    .line 72
    iget-object v9, v0, La/wnf0;->j:Ljava/util/Map$Entry;

    .line 73
    .line 74
    iget-object v10, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 75
    .line 76
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    move-object v12, v10

    .line 80
    move-object v10, v2

    .line 81
    move-object v2, v12

    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_5
    iget-object v2, v0, La/wnf0;->k:La/rei0;

    .line 85
    .line 86
    iget-object v9, v0, La/wnf0;->j:Ljava/util/Map$Entry;

    .line 87
    .line 88
    iget-object v10, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, v7, La/g45;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, La/i7e;

    .line 100
    .line 101
    iget-object p1, p1, La/i7e;->g:La/p7m0;

    .line 102
    .line 103
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Ljava/util/Map;

    .line 108
    .line 109
    invoke-virtual {v7, p1}, La/g45;->V(Ljava/util/Map;)Ljava/util/HashMap;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :cond_7
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_8

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    check-cast v9, Ljava/util/Map$Entry;

    .line 137
    .line 138
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    check-cast v10, La/rei0;

    .line 143
    .line 144
    invoke-virtual {v10}, La/rei0;->c()Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-nez v10, :cond_7

    .line 149
    .line 150
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_8
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    move-object v10, p1

    .line 171
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_f

    .line 176
    .line 177
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    move-object v9, p1

    .line 182
    check-cast v9, Ljava/util/Map$Entry;

    .line 183
    .line 184
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, La/rei0;

    .line 189
    .line 190
    iput-object v10, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 191
    .line 192
    iput-object v9, v0, La/wnf0;->j:Ljava/util/Map$Entry;

    .line 193
    .line 194
    iput-object p1, v0, La/wnf0;->k:La/rei0;

    .line 195
    .line 196
    iput v6, v0, La/wnf0;->n:I

    .line 197
    .line 198
    invoke-static {v7}, La/gfi0;->b(La/g45;)Lkotlin/Unit;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-ne v2, v1, :cond_9

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_9
    move-object v2, p1

    .line 206
    :goto_3
    iput-object v10, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 207
    .line 208
    iput-object v9, v0, La/wnf0;->j:Ljava/util/Map$Entry;

    .line 209
    .line 210
    iput-object v2, v0, La/wnf0;->k:La/rei0;

    .line 211
    .line 212
    iput v5, v0, La/wnf0;->n:I

    .line 213
    .line 214
    invoke-virtual {v7, v2, v0}, La/g45;->f0(La/rei0;La/zje;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    if-ne p1, v1, :cond_4

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :goto_4
    check-cast p1, La/qtf0;

    .line 222
    .line 223
    instance-of v11, p1, La/ptf0;

    .line 224
    .line 225
    if-eqz v11, :cond_b

    .line 226
    .line 227
    check-cast p1, La/ptf0;

    .line 228
    .line 229
    iget-object p1, p1, La/ptf0;->a:La/a640;

    .line 230
    .line 231
    iput-object v2, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 232
    .line 233
    iput-object v9, v0, La/wnf0;->j:Ljava/util/Map$Entry;

    .line 234
    .line 235
    iput-object v8, v0, La/wnf0;->k:La/rei0;

    .line 236
    .line 237
    iput v4, v0, La/wnf0;->n:I

    .line 238
    .line 239
    invoke-virtual {v7, p1}, La/g45;->c(La/a640;)Lkotlin/Unit;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    if-ne p1, v1, :cond_a

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_a
    move-object v12, v9

    .line 247
    move-object v9, v2

    .line 248
    move-object v2, v12

    .line 249
    :goto_5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    check-cast p1, Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v7, p1}, La/g45;->b0(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    move-object v10, v9

    .line 259
    goto :goto_2

    .line 260
    :cond_b
    instance-of v11, p1, La/ntf0;

    .line 261
    .line 262
    if-eqz v11, :cond_d

    .line 263
    .line 264
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    check-cast p1, Ljava/lang/String;

    .line 269
    .line 270
    iput-object v2, v0, La/wnf0;->i:Ljava/util/Iterator;

    .line 271
    .line 272
    iput-object v8, v0, La/wnf0;->j:Ljava/util/Map$Entry;

    .line 273
    .line 274
    iput-object v8, v0, La/wnf0;->k:La/rei0;

    .line 275
    .line 276
    iput v3, v0, La/wnf0;->n:I

    .line 277
    .line 278
    invoke-static {p0, p1, v10, v7, v0}, La/gfi0;->a(La/gfi0;Ljava/lang/String;La/rei0;La/g45;La/zje;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-ne p1, v1, :cond_c

    .line 283
    .line 284
    :goto_6
    return-object v1

    .line 285
    :cond_c
    :goto_7
    move-object v10, v2

    .line 286
    goto :goto_2

    .line 287
    :cond_d
    sget-object v9, La/otf0;->a:La/otf0;

    .line 288
    .line 289
    invoke-static {p1, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_e

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 297
    .line 298
    .line 299
    return-object v8

    .line 300
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object p0
.end method
