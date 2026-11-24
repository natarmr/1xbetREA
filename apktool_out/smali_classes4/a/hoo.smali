.class public final La/hoo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vno;

.field public final b:La/n530;

.field public final c:La/zr20;


# direct methods
.method public constructor <init>(La/vno;La/n530;La/zr20;)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/hoo;->a:La/vno;

    .line 14
    .line 15
    iput-object p2, p0, La/hoo;->b:La/n530;

    .line 16
    .line 17
    iput-object p3, p0, La/hoo;->c:La/zr20;

    .line 18
    .line 19
    return-void
.end method

.method public static a(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Iterable;

    .line 8
    .line 9
    instance-of v0, p0, Ljava/util/Collection;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    check-cast v0, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 49
    return p0
.end method


# virtual methods
.method public final b(La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, La/foo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/foo;

    .line 7
    .line 8
    iget v1, v0, La/foo;->l:I

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
    iput v1, v0, La/foo;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/foo;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/foo;-><init>(La/hoo;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/foo;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/foo;->l:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    iget-object v6, p0, La/hoo;->a:La/vno;

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_2
    iget-wide v7, v0, La/foo;->i:J

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    move-wide v8, v7

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, La/hoo;->c:La/zr20;

    .line 64
    .line 65
    iget-object p1, p1, La/zr20;->b:La/p7m0;

    .line 66
    .line 67
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, La/fs20;

    .line 72
    .line 73
    invoke-interface {p1}, La/fs20;->a()J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    const-wide/16 v9, -0x1a

    .line 78
    .line 79
    cmp-long p1, v7, v9

    .line 80
    .line 81
    if-eqz p1, :cond_8

    .line 82
    .line 83
    iget-object p0, v6, La/vno;->c:La/p7m0;

    .line 84
    .line 85
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/util/Map;

    .line 90
    .line 91
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/lno;

    .line 100
    .line 101
    if-eqz p0, :cond_5

    .line 102
    .line 103
    iget-object v5, p0, La/lno;->a:Ljava/util/Map;

    .line 104
    .line 105
    :cond_5
    if-nez v5, :cond_6

    .line 106
    .line 107
    sget-object v5, La/lun;->a:La/lun;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    :cond_6
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_7

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, La/hoo;->a(Ljava/util/Collection;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    new-instance p1, La/jno;

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-direct {p1, v0, p0}, La/jno;-><init>(BZ)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v7, v8, p1}, La/vno;->c(JLkotlin/jvm/functions/Function1;)V

    .line 134
    .line 135
    .line 136
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :cond_8
    iput-wide v7, v0, La/foo;->i:J

    .line 140
    .line 141
    iput v4, v0, La/foo;->l:I

    .line 142
    .line 143
    iget-object p1, p0, La/hoo;->b:La/n530;

    .line 144
    .line 145
    iget-object p1, p1, La/n530;->c:La/qoj0;

    .line 146
    .line 147
    invoke-static {p1, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v1, :cond_3

    .line 152
    .line 153
    goto/16 :goto_4

    .line 154
    .line 155
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v10

    .line 161
    iget-object p1, v6, La/vno;->b:La/p7m0;

    .line 162
    .line 163
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Ljava/util/Set;

    .line 168
    .line 169
    new-instance v4, La/ono;

    .line 170
    .line 171
    invoke-direct {v4, v8, v9, v10, v11}, La/ono;-><init>(JJ)V

    .line 172
    .line 173
    .line 174
    invoke-static {v2, v4}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {p1, v5, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    new-instance p1, La/ono;

    .line 182
    .line 183
    invoke-direct {p1, v8, v9, v10, v11}, La/ono;-><init>(JJ)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, p1}, La/vno;->a(La/ono;)La/p7m0;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Ljava/util/HashMap;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_9

    .line 201
    .line 202
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p0

    .line 205
    :cond_9
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {v2}, La/hoo;->a(Ljava/util/Collection;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    check-cast p1, Ljava/lang/Iterable;

    .line 224
    .line 225
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 226
    .line 227
    const/16 v4, 0xa

    .line 228
    .line 229
    invoke-static {p1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    invoke-static {v4}, La/wp20;->a(I)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    const/16 v5, 0x10

    .line 238
    .line 239
    if-ge v4, v5, :cond_a

    .line 240
    .line 241
    move v4, v5

    .line 242
    :cond_a
    invoke-direct {v12, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 243
    .line 244
    .line 245
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-eqz v4, :cond_b

    .line 254
    .line 255
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    move-object v5, v4

    .line 260
    check-cast v5, Ljava/lang/Number;

    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 263
    .line 264
    .line 265
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-interface {v12, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_b
    iput-wide v8, v0, La/foo;->i:J

    .line 274
    .line 275
    iput v3, v0, La/foo;->l:I

    .line 276
    .line 277
    iget-object v7, p0, La/hoo;->a:La/vno;

    .line 278
    .line 279
    invoke-virtual/range {v7 .. v12}, La/vno;->b(JJLjava/util/Map;)Lkotlin/Unit;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    if-ne p0, v1, :cond_c

    .line 284
    .line 285
    :goto_4
    return-object v1

    .line 286
    :cond_c
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object p0
.end method
