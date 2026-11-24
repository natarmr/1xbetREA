.class public final La/opu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/util/List;

.field public final synthetic k:J

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLa/mp0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/opu;->i:B

    .line 3
    .line 4
    iput-wide p1, p0, La/opu;->k:J

    .line 5
    .line 6
    iput-object p3, p0, La/opu;->m:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/w5z;JLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/opu;->i:B

    .line 13
    iput-object p1, p0, La/opu;->m:Ljava/lang/Object;

    iput-wide p2, p0, La/opu;->k:J

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/opu;->i:B

    .line 2
    .line 3
    iget-wide v1, p0, La/opu;->k:J

    .line 4
    .line 5
    iget-object p0, p0, La/opu;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/util/List;

    .line 11
    .line 12
    check-cast p2, Ljava/util/HashMap;

    .line 13
    .line 14
    check-cast p3, La/yje;

    .line 15
    .line 16
    new-instance v0, La/opu;

    .line 17
    .line 18
    check-cast p0, La/w5z;

    .line 19
    .line 20
    invoke-direct {v0, p0, v1, v2, p3}, La/opu;-><init>(La/w5z;JLa/yje;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/opu;->j:Ljava/util/List;

    .line 24
    .line 25
    iput-object p2, v0, La/opu;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/opu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, La/nh1;

    .line 35
    .line 36
    check-cast p2, Ljava/util/List;

    .line 37
    .line 38
    check-cast p3, La/yje;

    .line 39
    .line 40
    new-instance v0, La/opu;

    .line 41
    .line 42
    check-cast p0, La/mp0;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2, p0, p3}, La/opu;-><init>(JLa/mp0;La/yje;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, v0, La/opu;->l:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object p2, v0, La/opu;->j:Ljava/util/List;

    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, La/opu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/opu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/opu;->m:Ljava/lang/Object;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/opu;->j:Ljava/util/List;

    .line 11
    .line 12
    iget-object v3, p0, La/opu;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Ljava/util/HashMap;

    .line 15
    .line 16
    sget-object v4, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, La/sr20;

    .line 46
    .line 47
    iget-wide v6, v4, La/sr20;->b:J

    .line 48
    .line 49
    new-instance v8, Ljava/lang/Long;

    .line 50
    .line 51
    invoke-direct {v8, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ljava/lang/Boolean;

    .line 59
    .line 60
    if-eqz v6, :cond_0

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    move v13, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move v13, v5

    .line 69
    :goto_1
    iget-object v6, v4, La/sr20;->a:Ljava/util/ArrayList;

    .line 70
    .line 71
    new-instance v8, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-static {v6, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_2

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/util/List;

    .line 95
    .line 96
    new-instance v9, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static {v7, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_1

    .line 114
    .line 115
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    check-cast v10, La/vr20;

    .line 120
    .line 121
    sget-object v11, La/uyc;->c:La/uyc;

    .line 122
    .line 123
    invoke-static {v10, v5, v5, v11}, La/tlb;->h0(La/vr20;ZZLa/uyc;)La/hao;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_1
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    iget-wide v9, v4, La/sr20;->b:J

    .line 136
    .line 137
    iget-object v11, v4, La/sr20;->c:Ljava/lang/String;

    .line 138
    .line 139
    iget-boolean v12, v4, La/sr20;->d:Z

    .line 140
    .line 141
    new-instance v7, La/mu20;

    .line 142
    .line 143
    invoke-direct/range {v7 .. v13}, La/mu20;-><init>(Ljava/util/ArrayList;JLjava/lang/String;ZZ)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 153
    .line 154
    .line 155
    check-cast v1, La/w5z;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    move v2, v5

    .line 171
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_6

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    add-int/lit8 v4, v2, 0x1

    .line 182
    .line 183
    if-ltz v2, :cond_5

    .line 184
    .line 185
    check-cast v3, La/mu20;

    .line 186
    .line 187
    iget-object v6, v1, La/w5z;->c:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v7, v6

    .line 190
    check-cast v7, La/a1d;

    .line 191
    .line 192
    iget-wide v8, v3, La/mu20;->b:J

    .line 193
    .line 194
    const/4 v3, 0x3

    .line 195
    if-ge v2, v3, :cond_4

    .line 196
    .line 197
    const/4 v2, 0x1

    .line 198
    move v12, v2

    .line 199
    goto :goto_5

    .line 200
    :cond_4
    move v12, v5

    .line 201
    :goto_5
    iget-wide v10, p0, La/opu;->k:J

    .line 202
    .line 203
    invoke-static/range {v7 .. v12}, La/a1d;->h(La/a1d;JJZ)V

    .line 204
    .line 205
    .line 206
    move v2, v4

    .line 207
    goto :goto_4

    .line 208
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 209
    .line 210
    .line 211
    const/4 p0, 0x0

    .line 212
    throw p0

    .line 213
    :cond_6
    return-object p1

    .line 214
    :pswitch_0
    check-cast v1, La/mp0;

    .line 215
    .line 216
    iget-object v0, p0, La/opu;->l:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, La/nh1;

    .line 219
    .line 220
    iget-object v3, p0, La/opu;->j:Ljava/util/List;

    .line 221
    .line 222
    sget-object v4, La/wne;->a:La/wne;

    .line 223
    .line 224
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_7

    .line 232
    .line 233
    iget-object p1, v0, La/nh1;->b:Ljava/util/List;

    .line 234
    .line 235
    new-instance v0, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_8

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    check-cast v2, La/ezc0;

    .line 259
    .line 260
    invoke-static {v2, v1}, La/l7x;->c0(La/ezc0;La/mp0;)Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-eqz v2, :cond_8

    .line 286
    .line 287
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, La/ezc0;

    .line 292
    .line 293
    invoke-static {v2, v1}, La/l7x;->c0(La/ezc0;La/mp0;)Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_8
    new-instance p1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 302
    .line 303
    iget-wide v1, p0, La/opu;->k:J

    .line 304
    .line 305
    sget-object p0, La/iun;->a:La/iun;

    .line 306
    .line 307
    invoke-direct {p1, v1, v2, p0, v0}, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    return-object p1

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
