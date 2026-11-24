.class public final La/qvp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/util/List;

.field public j:B

.field public final synthetic k:La/pmi;

.field public final synthetic l:La/sip;

.field public final synthetic m:La/jo20;

.field public final synthetic n:J


# direct methods
.method public constructor <init>(La/pmi;La/sip;La/jo20;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qvp;->k:La/pmi;

    .line 2
    .line 3
    iput-object p2, p0, La/qvp;->l:La/sip;

    .line 4
    .line 5
    iput-object p3, p0, La/qvp;->m:La/jo20;

    .line 6
    .line 7
    iput-wide p4, p0, La/qvp;->n:J

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/qvp;

    .line 2
    .line 3
    iget-object v3, p0, La/qvp;->m:La/jo20;

    .line 4
    .line 5
    iget-wide v4, p0, La/qvp;->n:J

    .line 6
    .line 7
    iget-object v1, p0, La/qvp;->k:La/pmi;

    .line 8
    .line 9
    iget-object v2, p0, La/qvp;->l:La/sip;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-direct/range {v0 .. v6}, La/qvp;-><init>(La/pmi;La/sip;La/jo20;JLa/yje;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/qvp;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qvp;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/qvp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/qvp;->j:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/qvp;->l:La/sip;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v5, p0, La/qvp;->k:La/pmi;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v6, :cond_1

    .line 15
    .line 16
    if-ne v1, v4, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, La/qvp;->i:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v5, La/pmi;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, La/iqi;

    .line 41
    .line 42
    iput-byte v6, p0, La/qvp;->j:B

    .line 43
    .line 44
    iget-object p1, p1, La/iqi;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, La/yip;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget-object v7, p0, La/qvp;->m:La/jo20;

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    if-ne v1, v6, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1}, La/yip;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, La/ovp;

    .line 63
    .line 64
    invoke-interface {p1, v7, p0}, La/ovp;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_4
    invoke-virtual {p1}, La/yip;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/ovp;

    .line 78
    .line 79
    invoke-interface {p1, v7, p0}, La/ovp;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_0
    if-ne p1, v0, :cond_5

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_5
    :goto_1
    check-cast p1, La/dx5;

    .line 87
    .line 88
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/util/List;

    .line 93
    .line 94
    iget-object v1, v5, La/pmi;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, La/jtj;

    .line 97
    .line 98
    new-instance v5, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_8

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    check-cast v7, La/su10;

    .line 118
    .line 119
    iget-object v8, v7, La/su10;->A:La/h06;

    .line 120
    .line 121
    if-eqz v8, :cond_6

    .line 122
    .line 123
    iget-object v8, v8, La/h06;->c:Ljava/util/List;

    .line 124
    .line 125
    if-eqz v8, :cond_6

    .line 126
    .line 127
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    check-cast v8, La/a280;

    .line 132
    .line 133
    if-eqz v8, :cond_6

    .line 134
    .line 135
    iget-object v8, v8, La/a280;->a:Ljava/lang/Long;

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    move-object v8, v2

    .line 139
    :goto_3
    iget-object v7, v7, La/su10;->B:La/h06;

    .line 140
    .line 141
    if-eqz v7, :cond_7

    .line 142
    .line 143
    iget-object v7, v7, La/h06;->c:Ljava/util/List;

    .line 144
    .line 145
    if-eqz v7, :cond_7

    .line 146
    .line 147
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    check-cast v7, La/a280;

    .line 152
    .line 153
    if-eqz v7, :cond_7

    .line 154
    .line 155
    iget-object v7, v7, La/a280;->a:Ljava/lang/Long;

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_7
    move-object v7, v2

    .line 159
    :goto_4
    filled-new-array {v8, v7}, [Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-static {v7}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-static {v5, v7}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_8
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iput-object p1, p0, La/qvp;->i:Ljava/util/List;

    .line 180
    .line 181
    iput-byte v4, p0, La/qvp;->j:B

    .line 182
    .line 183
    invoke-virtual {v1, v2, p0}, La/jtj;->d(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-ne v1, v0, :cond_9

    .line 188
    .line 189
    :goto_5
    return-object v0

    .line 190
    :cond_9
    move-object v0, p1

    .line 191
    move-object p1, v1

    .line 192
    :goto_6
    check-cast p1, Ljava/util/List;

    .line 193
    .line 194
    new-instance v1, Ljava/util/ArrayList;

    .line 195
    .line 196
    const/16 v2, 0xa

    .line 197
    .line 198
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_a

    .line 214
    .line 215
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, La/su10;

    .line 220
    .line 221
    iget-wide v5, p0, La/qvp;->n:J

    .line 222
    .line 223
    invoke-static {v4, v3, v5, v6}, La/g7x;->a0(La/su10;La/sip;J)La/nas;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_a
    new-instance p0, La/pvp;

    .line 232
    .line 233
    new-instance v2, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    :cond_b
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_c

    .line 247
    .line 248
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    move-object v4, v3

    .line 253
    check-cast v4, La/su10;

    .line 254
    .line 255
    iget-object v4, v4, La/su10;->P:Ljava/lang/Boolean;

    .line 256
    .line 257
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-eqz v4, :cond_b

    .line 264
    .line 265
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    :cond_d
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-eqz v3, :cond_e

    .line 283
    .line 284
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    check-cast v3, La/su10;

    .line 289
    .line 290
    iget-object v3, v3, La/su10;->a:Ljava/lang/Long;

    .line 291
    .line 292
    if-eqz v3, :cond_d

    .line 293
    .line 294
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_e
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-direct {p0, v1, p1, v0}, La/pvp;-><init>(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/Set;)V

    .line 303
    .line 304
    .line 305
    return-object p0
.end method
