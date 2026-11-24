.class public final La/fr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kmq;JLa/jr0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/fr0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/fr0;->b:La/kmq;

    .line 8
    .line 9
    iput-wide p2, p0, La/fr0;->c:J

    .line 10
    .line 11
    iput-object p4, p0, La/fr0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/kmq;La/hie0;J)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/fr0;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fr0;->b:La/kmq;

    iput-object p2, p0, La/fr0;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/fr0;->c:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/fr0;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/fr0;->c:J

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, La/fr0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, La/fr0;->b:La/kmq;

    .line 9
    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/high16 v7, -0x80000000

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    instance-of v0, p2, La/kos;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move-object v0, p2

    .line 24
    check-cast v0, La/kos;

    .line 25
    .line 26
    iget v10, v0, La/kos;->j:I

    .line 27
    .line 28
    and-int v11, v10, v7

    .line 29
    .line 30
    if-eqz v11, :cond_0

    .line 31
    .line 32
    sub-int/2addr v10, v7

    .line 33
    iput v10, v0, La/kos;->j:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v0, La/kos;

    .line 37
    .line 38
    invoke-direct {v0, p0, p2}, La/kos;-><init>(La/fr0;La/yje;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object p0, v0, La/kos;->i:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object p2, La/wne;->a:La/wne;

    .line 44
    .line 45
    iget v7, v0, La/kos;->j:I

    .line 46
    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    if-ne v7, v8, :cond_1

    .line 50
    .line 51
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast p1, La/m9s;

    .line 63
    .line 64
    check-cast v4, La/hie0;

    .line 65
    .line 66
    iget-boolean p0, v4, La/hie0;->a:Z

    .line 67
    .line 68
    iput-boolean v3, v4, La/hie0;->a:Z

    .line 69
    .line 70
    new-instance v3, La/t9s;

    .line 71
    .line 72
    invoke-direct {v3, v1, v2, p1, p0}, La/t9s;-><init>(JLa/m9s;Z)V

    .line 73
    .line 74
    .line 75
    iput v8, v0, La/kos;->j:I

    .line 76
    .line 77
    invoke-interface {v5, v3, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, p2, :cond_3

    .line 82
    .line 83
    move-object v9, p2

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    :goto_1
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    :goto_2
    return-object v9

    .line 88
    :pswitch_0
    check-cast v4, La/jr0;

    .line 89
    .line 90
    iget-object v0, v4, La/jr0;->b:La/ap0;

    .line 91
    .line 92
    instance-of v4, p2, La/er0;

    .line 93
    .line 94
    if-eqz v4, :cond_4

    .line 95
    .line 96
    move-object v4, p2

    .line 97
    check-cast v4, La/er0;

    .line 98
    .line 99
    iget v10, v4, La/er0;->j:I

    .line 100
    .line 101
    and-int v11, v10, v7

    .line 102
    .line 103
    if-eqz v11, :cond_4

    .line 104
    .line 105
    sub-int/2addr v10, v7

    .line 106
    iput v10, v4, La/er0;->j:I

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    new-instance v4, La/er0;

    .line 110
    .line 111
    invoke-direct {v4, p0, p2}, La/er0;-><init>(La/fr0;La/yje;)V

    .line 112
    .line 113
    .line 114
    :goto_3
    iget-object p0, v4, La/er0;->i:Ljava/lang/Object;

    .line 115
    .line 116
    sget-object p2, La/wne;->a:La/wne;

    .line 117
    .line 118
    iget v7, v4, La/er0;->j:I

    .line 119
    .line 120
    if-eqz v7, :cond_6

    .line 121
    .line 122
    if-ne v7, v8, :cond_5

    .line 123
    .line 124
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_7

    .line 128
    .line 129
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    check-cast p1, La/dx5;

    .line 138
    .line 139
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, La/qh1;

    .line 144
    .line 145
    iget-object p0, p0, La/qh1;->a:Ljava/util/List;

    .line 146
    .line 147
    if-eqz p0, :cond_f

    .line 148
    .line 149
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, La/kf0;

    .line 154
    .line 155
    new-instance v6, Ljava/util/ArrayList;

    .line 156
    .line 157
    const/16 v7, 0xa

    .line 158
    .line 159
    invoke-static {p0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    const-string v9, ""

    .line 175
    .line 176
    if-eqz v7, :cond_8

    .line 177
    .line 178
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    check-cast v7, La/kf0;

    .line 183
    .line 184
    new-instance v10, La/ezc0;

    .line 185
    .line 186
    iget-object v11, v7, La/kf0;->a:Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    iget-object v12, v7, La/kf0;->b:Ljava/lang/String;

    .line 193
    .line 194
    if-nez v12, :cond_7

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_7
    move-object v9, v12

    .line 198
    :goto_5
    invoke-virtual {v7, p1}, La/kf0;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-direct {v10, v11, v9, v7}, La/ezc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    if-eqz p0, :cond_a

    .line 214
    .line 215
    :cond_9
    move v3, v8

    .line 216
    goto :goto_6

    .line 217
    :cond_a
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_9

    .line 226
    .line 227
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, La/ezc0;

    .line 232
    .line 233
    iget-boolean p1, p1, La/ezc0;->c:Z

    .line 234
    .line 235
    if-eqz p1, :cond_b

    .line 236
    .line 237
    :goto_6
    new-instance p0, La/ezc0;

    .line 238
    .line 239
    const-string p1, "0"

    .line 240
    .line 241
    invoke-direct {p0, p1, v9, v3}, La/ezc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 242
    .line 243
    .line 244
    invoke-static {v6, p0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    new-instance p1, La/nh1;

    .line 249
    .line 250
    invoke-direct {p1, v1, v2, p0}, La/nh1;-><init>(JLjava/util/List;)V

    .line 251
    .line 252
    .line 253
    iget-object v3, v0, La/ap0;->b:Ljava/util/LinkedHashMap;

    .line 254
    .line 255
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-nez v3, :cond_c

    .line 264
    .line 265
    sget-object v3, La/iun;->a:La/iun;

    .line 266
    .line 267
    :cond_c
    check-cast v3, Ljava/util/List;

    .line 268
    .line 269
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_d

    .line 274
    .line 275
    invoke-virtual {v0, v1, v2, p0}, La/ap0;->a(JLjava/util/List;)V

    .line 276
    .line 277
    .line 278
    :cond_d
    iput v8, v4, La/er0;->j:I

    .line 279
    .line 280
    invoke-interface {v5, p1, v4}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    if-ne p0, p2, :cond_e

    .line 285
    .line 286
    move-object v9, p2

    .line 287
    goto :goto_8

    .line 288
    :cond_e
    :goto_7
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_f
    invoke-static {v9}, La/jf4;->k(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    :goto_8
    return-object v9

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
