.class public final La/q9k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pld;
.implements Ljava/lang/Iterable;
.implements La/khy;


# instance fields
.field public a:[I

.field public b:I

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:I

.field public final f:Ljava/lang/Object;

.field public g:Z

.field public h:I

.field public i:Ljava/util/ArrayList;

.field public j:Ljava/util/HashMap;

.field public k:La/ey40;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, La/q9k0;->a:[I

    .line 8
    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, La/q9k0;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/q9k0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/q9k0;->i:Ljava/util/ArrayList;

    .line 26
    .line 27
    return-void
.end method

.method public static final f(La/t9k0;I)V
    .locals 1

    .line 1
    :goto_0
    iget v0, p0, La/t9k0;->v:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, La/t9k0;->u:I

    .line 6
    .line 7
    if-gt v0, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/t9k0;->N()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/t9k0;->i()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(La/bet;)I
    .locals 0

    .line 1
    iget-boolean p0, p0, La/q9k0;->g:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string p0, "Use active SlotWriter to determine anchor location instead"

    .line 6
    .line 7
    invoke-static {p0}, La/ykd;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, La/bet;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, "Anchor refers to a group that was removed"

    .line 17
    .line 18
    invoke-static {p0}, La/dsb0;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget p0, p1, La/bet;->a:I

    .line 22
    .line 23
    return p0
.end method

.method public final c()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, La/q9k0;->j:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public final e(La/bv3;La/vy40;)La/hz40;
    .locals 10

    .line 1
    iget-object v0, p2, La/vy40;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p2, La/vy40;->b:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v1, :cond_3

    .line 8
    .line 9
    aget-object v4, v0, v3

    .line 10
    .line 11
    check-cast v4, La/mu40;

    .line 12
    .line 13
    iget-object v4, v4, La/mu40;->e:La/bet;

    .line 14
    .line 15
    invoke-static {v4}, La/obc;->J(La/bet;)La/bet;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {p0, v4}, La/q9k0;->j(La/bet;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_2

    .line 24
    .line 25
    new-instance v0, La/vy40;

    .line 26
    .line 27
    invoke-direct {v0}, La/vy40;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p2, La/vy40;->a:[Ljava/lang/Object;

    .line 31
    .line 32
    iget p2, p2, La/vy40;->b:I

    .line 33
    .line 34
    move v3, v2

    .line 35
    :goto_1
    if-ge v3, p2, :cond_1

    .line 36
    .line 37
    aget-object v4, v1, v3

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    check-cast v5, La/mu40;

    .line 41
    .line 42
    iget-object v5, v5, La/mu40;->e:La/bet;

    .line 43
    .line 44
    invoke-static {v5}, La/obc;->J(La/bet;)La/bet;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p0, v5}, La/q9k0;->j(La/bet;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0, v4}, La/vy40;->a(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object p2, v0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_2
    new-instance v0, La/rai0;

    .line 66
    .line 67
    const/16 v1, 0x13

    .line 68
    .line 69
    invoke-direct {v0, p0, v1}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    iget v1, p2, La/vy40;->b:I

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    if-gt v1, v3, :cond_4

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_4
    invoke-virtual {p2, v2}, La/vy40;->g(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, La/rai0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/lang/Comparable;

    .line 87
    .line 88
    iget v4, p2, La/vy40;->b:I

    .line 89
    .line 90
    move v5, v3

    .line 91
    :goto_3
    if-ge v5, v4, :cond_9

    .line 92
    .line 93
    invoke-virtual {p2, v5}, La/vy40;->g(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v0, v6}, La/rai0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Ljava/lang/Comparable;

    .line 102
    .line 103
    invoke-interface {v1, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-lez v1, :cond_8

    .line 108
    .line 109
    new-instance v1, La/vy40;

    .line 110
    .line 111
    iget v4, p2, La/vy40;->b:I

    .line 112
    .line 113
    invoke-direct {v1, v4}, La/vy40;-><init>(I)V

    .line 114
    .line 115
    .line 116
    iget-object v4, p2, La/vy40;->a:[Ljava/lang/Object;

    .line 117
    .line 118
    iget p2, p2, La/vy40;->b:I

    .line 119
    .line 120
    move v5, v2

    .line 121
    :goto_4
    if-ge v5, p2, :cond_5

    .line 122
    .line 123
    aget-object v6, v4, v5

    .line 124
    .line 125
    invoke-virtual {v1, v6}, La/vy40;->a(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    iget-object p2, v1, La/vy40;->c:La/ty40;

    .line 132
    .line 133
    if-eqz p2, :cond_6

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_6
    new-instance p2, La/ty40;

    .line 137
    .line 138
    invoke-direct {p2, v1, v2}, La/ty40;-><init>(Ljava/lang/Object;B)V

    .line 139
    .line 140
    .line 141
    iput-object p2, v1, La/vy40;->c:La/ty40;

    .line 142
    .line 143
    :goto_5
    iget-object v4, p2, La/ty40;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, La/vy40;

    .line 146
    .line 147
    iget v4, v4, La/vy40;->b:I

    .line 148
    .line 149
    if-le v4, v3, :cond_7

    .line 150
    .line 151
    new-instance v4, La/mto;

    .line 152
    .line 153
    invoke-direct {v4, v0, v2}, La/mto;-><init>(Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {v4, p2}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    move-object p2, v1

    .line 160
    goto :goto_6

    .line 161
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 162
    .line 163
    move-object v1, v6

    .line 164
    goto :goto_3

    .line 165
    :cond_9
    :goto_6
    invoke-virtual {p2}, La/vy40;->i()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_a

    .line 170
    .line 171
    sget-object p0, La/u1h0;->b:La/hz40;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_a
    sget-object v0, La/u1h0;->a:[J

    .line 178
    .line 179
    new-instance v0, La/hz40;

    .line 180
    .line 181
    invoke-direct {v0}, La/hz40;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, La/q9k0;->h()La/t9k0;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    :try_start_0
    iget-object v1, p2, La/vy40;->a:[Ljava/lang/Object;

    .line 189
    .line 190
    iget p2, p2, La/vy40;->b:I

    .line 191
    .line 192
    move v4, v2

    .line 193
    :goto_7
    if-ge v4, p2, :cond_f

    .line 194
    .line 195
    aget-object v5, v1, v4

    .line 196
    .line 197
    check-cast v5, La/mu40;

    .line 198
    .line 199
    iget-object v6, v5, La/mu40;->e:La/bet;

    .line 200
    .line 201
    invoke-static {v6}, La/obc;->J(La/bet;)La/bet;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-virtual {p0, v6}, La/t9k0;->c(La/bet;)I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    iget-object v7, p0, La/t9k0;->b:[I

    .line 210
    .line 211
    invoke-virtual {p0, v7, v6}, La/t9k0;->F([II)I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    invoke-static {p0, v7}, La/q9k0;->f(La/t9k0;I)V

    .line 216
    .line 217
    .line 218
    invoke-static {p0, v7}, La/q9k0;->f(La/t9k0;I)V

    .line 219
    .line 220
    .line 221
    :goto_8
    iget v8, p0, La/t9k0;->t:I

    .line 222
    .line 223
    if-eq v8, v7, :cond_d

    .line 224
    .line 225
    iget v9, p0, La/t9k0;->u:I

    .line 226
    .line 227
    if-ne v8, v9, :cond_b

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :cond_b
    invoke-virtual {p0, v8}, La/t9k0;->t(I)I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    add-int/2addr v9, v8

    .line 235
    if-ge v7, v9, :cond_c

    .line 236
    .line 237
    invoke-virtual {p0}, La/t9k0;->Q()V

    .line 238
    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_c
    invoke-virtual {p0}, La/t9k0;->M()I

    .line 242
    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_d
    :goto_9
    if-ne v8, v7, :cond_e

    .line 246
    .line 247
    goto :goto_a

    .line 248
    :cond_e
    const-string v7, "Unexpected slot table structure"

    .line 249
    .line 250
    invoke-static {v7}, La/ykd;->a(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :goto_a
    invoke-virtual {p0}, La/t9k0;->Q()V

    .line 254
    .line 255
    .line 256
    iget v7, p0, La/t9k0;->t:I

    .line 257
    .line 258
    sub-int/2addr v6, v7

    .line 259
    invoke-virtual {p0, v6}, La/t9k0;->a(I)V

    .line 260
    .line 261
    .line 262
    iget-object v6, v5, La/mu40;->c:La/tld;

    .line 263
    .line 264
    invoke-static {v6, v5, p0, p1}, La/ykd;->c(La/tld;La/mu40;La/t9k0;La/bv3;)La/lu40;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-virtual {v0, v5, v6}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    add-int/lit8 v4, v4, 0x1

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :catchall_0
    move-exception p1

    .line 275
    goto :goto_b

    .line 276
    :cond_f
    const p1, 0x7fffffff

    .line 277
    .line 278
    .line 279
    invoke-static {p0, p1}, La/q9k0;->f(La/t9k0;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, v3}, La/t9k0;->e(Z)V

    .line 283
    .line 284
    .line 285
    return-object v0

    .line 286
    :goto_b
    invoke-virtual {p0, v2}, La/t9k0;->e(Z)V

    .line 287
    .line 288
    .line 289
    throw p1
.end method

.method public final g()La/p9k0;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/q9k0;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, La/q9k0;->e:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, La/q9k0;->e:I

    .line 10
    .line 11
    new-instance v0, La/p9k0;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/p9k0;-><init>(La/q9k0;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const-string p0, "Cannot read while a writer is pending"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final h()La/t9k0;
    .locals 2

    .line 1
    iget-boolean v0, p0, La/q9k0;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot start a writer when another writer is pending"

    .line 6
    .line 7
    invoke-static {v0}, La/ykd;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, La/q9k0;->e:I

    .line 11
    .line 12
    if-gtz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "Cannot start a writer when a reader is pending"

    .line 16
    .line 17
    invoke-static {v0}, La/ykd;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, La/q9k0;->g:Z

    .line 22
    .line 23
    iget v1, p0, La/q9k0;->h:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    iput v1, p0, La/q9k0;->h:I

    .line 27
    .line 28
    new-instance v0, La/t9k0;

    .line 29
    .line 30
    invoke-direct {v0, p0}, La/t9k0;-><init>(La/q9k0;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, La/ygv;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, La/q9k0;->b:I

    .line 5
    .line 6
    invoke-direct {v0, p0, v1, v2}, La/ygv;-><init>(La/q9k0;II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final j(La/bet;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, La/bet;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/q9k0;->i:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget v1, p1, La/bet;->a:I

    .line 10
    .line 11
    iget v2, p0, La/q9k0;->b:I

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, La/s9k0;->c(Ljava/util/ArrayList;II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, La/q9k0;->i:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final k(I)La/het;
    .locals 3

    .line 1
    iget-object v0, p0, La/q9k0;->j:Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-boolean v2, p0, La/q9k0;->g:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    const-string v2, "use active SlotWriter to crate an anchor for location instead"

    .line 11
    .line 12
    invoke-static {v2}, La/ykd;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    if-ltz p1, :cond_1

    .line 16
    .line 17
    iget v2, p0, La/q9k0;->b:I

    .line 18
    .line 19
    if-ge p1, v2, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, La/q9k0;->i:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p0, p1, v2}, La/s9k0;->c(Ljava/util/ArrayList;II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ltz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/bet;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p0, v1

    .line 37
    :goto_0
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/het;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    return-object v1
.end method
