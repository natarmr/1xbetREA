.class public abstract La/hev0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/d7k;


# instance fields
.field public a:I

.field public b:La/k4e;

.field public c:La/nog0;

.field public d:La/j4e;

.field public final e:La/vmk;

.field public f:I

.field public g:Z

.field public final h:La/i7k;

.field public final i:La/i7k;

.field public j:I


# direct methods
.method public constructor <init>(La/k4e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/vmk;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La/vmk;-><init>(La/hev0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/hev0;->e:La/vmk;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, La/hev0;->f:I

    .line 13
    .line 14
    iput-boolean v0, p0, La/hev0;->g:Z

    .line 15
    .line 16
    new-instance v0, La/i7k;

    .line 17
    .line 18
    invoke-direct {v0, p0}, La/i7k;-><init>(La/hev0;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/hev0;->h:La/i7k;

    .line 22
    .line 23
    new-instance v0, La/i7k;

    .line 24
    .line 25
    invoke-direct {v0, p0}, La/i7k;-><init>(La/hev0;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/hev0;->i:La/i7k;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iput v0, p0, La/hev0;->j:I

    .line 32
    .line 33
    iput-object p1, p0, La/hev0;->b:La/k4e;

    .line 34
    .line 35
    return-void
.end method

.method public static b(La/i7k;La/i7k;I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/i7k;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iput p2, p0, La/i7k;->f:I

    .line 7
    .line 8
    iget-object p1, p1, La/i7k;->k:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static h(La/w2e;)La/i7k;
    .locals 2

    .line 1
    iget-object p0, p0, La/w2e;->f:La/w2e;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, La/w2e;->d:La/k4e;

    .line 7
    .line 8
    iget p0, p0, La/w2e;->e:I

    .line 9
    .line 10
    invoke-static {p0}, La/hne;->E(I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_5

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p0, v1, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq p0, v1, :cond_3

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq p0, v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-eq p0, v1, :cond_1

    .line 28
    .line 29
    :goto_0
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    iget-object p0, v0, La/k4e;->e:La/ocu0;

    .line 32
    .line 33
    iget-object p0, p0, La/ocu0;->k:La/i7k;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    iget-object p0, v0, La/k4e;->e:La/ocu0;

    .line 37
    .line 38
    iget-object p0, p0, La/hev0;->i:La/i7k;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    iget-object p0, v0, La/k4e;->d:La/cmw;

    .line 42
    .line 43
    iget-object p0, p0, La/hev0;->i:La/i7k;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    iget-object p0, v0, La/k4e;->e:La/ocu0;

    .line 47
    .line 48
    iget-object p0, p0, La/hev0;->h:La/i7k;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_5
    iget-object p0, v0, La/k4e;->d:La/cmw;

    .line 52
    .line 53
    iget-object p0, p0, La/hev0;->h:La/i7k;

    .line 54
    .line 55
    return-object p0
.end method

.method public static i(La/w2e;I)La/i7k;
    .locals 1

    .line 1
    iget-object p0, p0, La/w2e;->f:La/w2e;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, La/w2e;->d:La/k4e;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, v0, La/k4e;->d:La/cmw;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object p1, v0, La/k4e;->e:La/ocu0;

    .line 14
    .line 15
    :goto_0
    iget p0, p0, La/w2e;->e:I

    .line 16
    .line 17
    invoke-static {p0}, La/hne;->E(I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p0, v0, :cond_3

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    if-eq p0, v0, :cond_2

    .line 32
    .line 33
    :goto_1
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_2
    iget-object p0, p1, La/hev0;->i:La/i7k;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    iget-object p0, p1, La/hev0;->h:La/i7k;

    .line 39
    .line 40
    return-object p0
.end method


# virtual methods
.method public final c(La/i7k;La/i7k;ILa/vmk;)V
    .locals 1

    .line 1
    iget-object v0, p1, La/i7k;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, La/i7k;->l:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, La/hev0;->e:La/vmk;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iput p3, p1, La/i7k;->h:I

    .line 14
    .line 15
    iput-object p4, p1, La/i7k;->i:La/vmk;

    .line 16
    .line 17
    iget-object p0, p2, La/i7k;->k:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object p0, p4, La/i7k;->k:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public d()V
    .locals 13

    .line 1
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 2
    .line 3
    iget-boolean v1, v0, La/k4e;->a:Z

    .line 4
    .line 5
    iget-object v2, p0, La/hev0;->e:La/vmk;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La/k4e;->s()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2, v0}, La/vmk;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, v2, La/i7k;->j:Z

    .line 17
    .line 18
    iget-object v1, v2, La/i7k;->k:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v3, v2, La/i7k;->l:Ljava/util/ArrayList;

    .line 21
    .line 22
    sget-object v4, La/j4e;->d:La/j4e;

    .line 23
    .line 24
    sget-object v5, La/j4e;->c:La/j4e;

    .line 25
    .line 26
    sget-object v6, La/j4e;->a:La/j4e;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-object v8, p0, La/hev0;->i:La/i7k;

    .line 30
    .line 31
    iget-object v9, p0, La/hev0;->h:La/i7k;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 36
    .line 37
    iget-object v10, v0, La/k4e;->U:[La/j4e;

    .line 38
    .line 39
    aget-object v10, v10, v7

    .line 40
    .line 41
    iput-object v10, p0, La/hev0;->d:La/j4e;

    .line 42
    .line 43
    if-eq v10, v5, :cond_5

    .line 44
    .line 45
    if-ne v10, v4, :cond_2

    .line 46
    .line 47
    iget-object v11, v0, La/k4e;->V:La/k4e;

    .line 48
    .line 49
    if-eqz v11, :cond_2

    .line 50
    .line 51
    iget-object v12, v11, La/k4e;->U:[La/j4e;

    .line 52
    .line 53
    aget-object v12, v12, v7

    .line 54
    .line 55
    if-eq v12, v6, :cond_1

    .line 56
    .line 57
    if-ne v12, v4, :cond_2

    .line 58
    .line 59
    :cond_1
    invoke-virtual {v11}, La/k4e;->s()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 64
    .line 65
    iget-object v1, v1, La/k4e;->J:La/w2e;

    .line 66
    .line 67
    invoke-virtual {v1}, La/w2e;->e()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sub-int/2addr v0, v1

    .line 72
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 73
    .line 74
    iget-object v1, v1, La/k4e;->L:La/w2e;

    .line 75
    .line 76
    invoke-virtual {v1}, La/w2e;->e()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    sub-int/2addr v0, v1

    .line 81
    iget-object v1, v11, La/k4e;->d:La/cmw;

    .line 82
    .line 83
    iget-object v1, v1, La/hev0;->h:La/i7k;

    .line 84
    .line 85
    iget-object v3, p0, La/hev0;->b:La/k4e;

    .line 86
    .line 87
    iget-object v3, v3, La/k4e;->J:La/w2e;

    .line 88
    .line 89
    invoke-virtual {v3}, La/w2e;->e()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-static {v9, v1, v3}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v11, La/k4e;->d:La/cmw;

    .line 97
    .line 98
    iget-object v1, v1, La/hev0;->i:La/i7k;

    .line 99
    .line 100
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 101
    .line 102
    iget-object p0, p0, La/k4e;->L:La/w2e;

    .line 103
    .line 104
    invoke-virtual {p0}, La/w2e;->e()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    neg-int p0, p0

    .line 109
    invoke-static {v8, v1, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v0}, La/vmk;->d(I)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    if-ne v10, v6, :cond_5

    .line 117
    .line 118
    invoke-virtual {v0}, La/k4e;->s()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-virtual {v2, v0}, La/vmk;->d(I)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    iget-object v0, p0, La/hev0;->d:La/j4e;

    .line 127
    .line 128
    if-ne v0, v4, :cond_5

    .line 129
    .line 130
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 131
    .line 132
    iget-object v10, v0, La/k4e;->V:La/k4e;

    .line 133
    .line 134
    if-eqz v10, :cond_5

    .line 135
    .line 136
    iget-object v11, v10, La/k4e;->U:[La/j4e;

    .line 137
    .line 138
    aget-object v11, v11, v7

    .line 139
    .line 140
    if-eq v11, v6, :cond_4

    .line 141
    .line 142
    if-ne v11, v4, :cond_5

    .line 143
    .line 144
    :cond_4
    iget-object v1, v10, La/k4e;->d:La/cmw;

    .line 145
    .line 146
    iget-object v1, v1, La/hev0;->h:La/i7k;

    .line 147
    .line 148
    iget-object v0, v0, La/k4e;->J:La/w2e;

    .line 149
    .line 150
    invoke-virtual {v0}, La/w2e;->e()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-static {v9, v1, v0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v10, La/k4e;->d:La/cmw;

    .line 158
    .line 159
    iget-object v0, v0, La/hev0;->i:La/i7k;

    .line 160
    .line 161
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 162
    .line 163
    iget-object p0, p0, La/k4e;->L:La/w2e;

    .line 164
    .line 165
    invoke-virtual {p0}, La/w2e;->e()I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    neg-int p0, p0

    .line 170
    invoke-static {v8, v0, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_5
    :goto_0
    iget-boolean v0, v2, La/i7k;->j:Z

    .line 175
    .line 176
    const/4 v4, 0x1

    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 180
    .line 181
    iget-boolean v6, v0, La/k4e;->a:Z

    .line 182
    .line 183
    if-eqz v6, :cond_c

    .line 184
    .line 185
    iget-object v1, v0, La/k4e;->R:[La/w2e;

    .line 186
    .line 187
    aget-object v3, v1, v7

    .line 188
    .line 189
    iget-object v5, v3, La/w2e;->f:La/w2e;

    .line 190
    .line 191
    if-eqz v5, :cond_9

    .line 192
    .line 193
    aget-object v6, v1, v4

    .line 194
    .line 195
    iget-object v6, v6, La/w2e;->f:La/w2e;

    .line 196
    .line 197
    if-eqz v6, :cond_9

    .line 198
    .line 199
    invoke-virtual {v0}, La/k4e;->z()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 204
    .line 205
    if-eqz v0, :cond_6

    .line 206
    .line 207
    iget-object v0, v1, La/k4e;->R:[La/w2e;

    .line 208
    .line 209
    aget-object v0, v0, v7

    .line 210
    .line 211
    invoke-virtual {v0}, La/w2e;->e()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    iput v0, v9, La/i7k;->f:I

    .line 216
    .line 217
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 218
    .line 219
    iget-object p0, p0, La/k4e;->R:[La/w2e;

    .line 220
    .line 221
    aget-object p0, p0, v4

    .line 222
    .line 223
    invoke-virtual {p0}, La/w2e;->e()I

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    neg-int p0, p0

    .line 228
    iput p0, v8, La/i7k;->f:I

    .line 229
    .line 230
    return-void

    .line 231
    :cond_6
    iget-object v0, v1, La/k4e;->R:[La/w2e;

    .line 232
    .line 233
    aget-object v0, v0, v7

    .line 234
    .line 235
    invoke-static {v0}, La/hev0;->h(La/w2e;)La/i7k;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-eqz v0, :cond_7

    .line 240
    .line 241
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 242
    .line 243
    iget-object v1, v1, La/k4e;->R:[La/w2e;

    .line 244
    .line 245
    aget-object v1, v1, v7

    .line 246
    .line 247
    invoke-virtual {v1}, La/w2e;->e()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-static {v9, v0, v1}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 252
    .line 253
    .line 254
    :cond_7
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 255
    .line 256
    iget-object v0, v0, La/k4e;->R:[La/w2e;

    .line 257
    .line 258
    aget-object v0, v0, v4

    .line 259
    .line 260
    invoke-static {v0}, La/hev0;->h(La/w2e;)La/i7k;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-eqz v0, :cond_8

    .line 265
    .line 266
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 267
    .line 268
    iget-object p0, p0, La/k4e;->R:[La/w2e;

    .line 269
    .line 270
    aget-object p0, p0, v4

    .line 271
    .line 272
    invoke-virtual {p0}, La/w2e;->e()I

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    neg-int p0, p0

    .line 277
    invoke-static {v8, v0, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 278
    .line 279
    .line 280
    :cond_8
    iput-boolean v4, v9, La/i7k;->b:Z

    .line 281
    .line 282
    iput-boolean v4, v8, La/i7k;->b:Z

    .line 283
    .line 284
    return-void

    .line 285
    :cond_9
    if-eqz v5, :cond_a

    .line 286
    .line 287
    invoke-static {v3}, La/hev0;->h(La/w2e;)La/i7k;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-eqz v0, :cond_1a

    .line 292
    .line 293
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 294
    .line 295
    iget-object p0, p0, La/k4e;->R:[La/w2e;

    .line 296
    .line 297
    aget-object p0, p0, v7

    .line 298
    .line 299
    invoke-virtual {p0}, La/w2e;->e()I

    .line 300
    .line 301
    .line 302
    move-result p0

    .line 303
    invoke-static {v9, v0, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 304
    .line 305
    .line 306
    iget p0, v2, La/i7k;->g:I

    .line 307
    .line 308
    invoke-static {v8, v9, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :cond_a
    aget-object v1, v1, v4

    .line 313
    .line 314
    iget-object v3, v1, La/w2e;->f:La/w2e;

    .line 315
    .line 316
    if-eqz v3, :cond_b

    .line 317
    .line 318
    invoke-static {v1}, La/hev0;->h(La/w2e;)La/i7k;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-eqz v0, :cond_1a

    .line 323
    .line 324
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 325
    .line 326
    iget-object p0, p0, La/k4e;->R:[La/w2e;

    .line 327
    .line 328
    aget-object p0, p0, v4

    .line 329
    .line 330
    invoke-virtual {p0}, La/w2e;->e()I

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    neg-int p0, p0

    .line 335
    invoke-static {v8, v0, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 336
    .line 337
    .line 338
    iget p0, v2, La/i7k;->g:I

    .line 339
    .line 340
    neg-int p0, p0

    .line 341
    invoke-static {v9, v8, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :cond_b
    instance-of v1, v0, La/jvv;

    .line 346
    .line 347
    if-nez v1, :cond_1a

    .line 348
    .line 349
    iget-object v1, v0, La/k4e;->V:La/k4e;

    .line 350
    .line 351
    if-eqz v1, :cond_1a

    .line 352
    .line 353
    const/4 v1, 0x7

    .line 354
    invoke-virtual {v0, v1}, La/k4e;->k(I)La/w2e;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v0, v0, La/w2e;->f:La/w2e;

    .line 359
    .line 360
    if-nez v0, :cond_1a

    .line 361
    .line 362
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 363
    .line 364
    iget-object v0, p0, La/k4e;->V:La/k4e;

    .line 365
    .line 366
    iget-object v0, v0, La/k4e;->d:La/cmw;

    .line 367
    .line 368
    iget-object v0, v0, La/hev0;->h:La/i7k;

    .line 369
    .line 370
    invoke-virtual {p0}, La/k4e;->t()I

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    invoke-static {v9, v0, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 375
    .line 376
    .line 377
    iget p0, v2, La/i7k;->g:I

    .line 378
    .line 379
    invoke-static {v8, v9, p0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :cond_c
    iget-object v0, p0, La/hev0;->d:La/j4e;

    .line 384
    .line 385
    if-ne v0, v5, :cond_13

    .line 386
    .line 387
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 388
    .line 389
    iget v5, v0, La/k4e;->s:I

    .line 390
    .line 391
    const/4 v6, 0x2

    .line 392
    if-eq v5, v6, :cond_11

    .line 393
    .line 394
    const/4 v6, 0x3

    .line 395
    if-eq v5, v6, :cond_d

    .line 396
    .line 397
    goto/16 :goto_1

    .line 398
    .line 399
    :cond_d
    iget v5, v0, La/k4e;->t:I

    .line 400
    .line 401
    if-ne v5, v6, :cond_10

    .line 402
    .line 403
    iput-object p0, v9, La/i7k;->a:La/hev0;

    .line 404
    .line 405
    iput-object p0, v8, La/i7k;->a:La/hev0;

    .line 406
    .line 407
    iget-object v5, v0, La/k4e;->e:La/ocu0;

    .line 408
    .line 409
    iget-object v6, v5, La/hev0;->h:La/i7k;

    .line 410
    .line 411
    iput-object p0, v6, La/i7k;->a:La/hev0;

    .line 412
    .line 413
    iget-object v5, v5, La/hev0;->i:La/i7k;

    .line 414
    .line 415
    iput-object p0, v5, La/i7k;->a:La/hev0;

    .line 416
    .line 417
    iput-object p0, v2, La/i7k;->a:La/hev0;

    .line 418
    .line 419
    invoke-virtual {v0}, La/k4e;->A()Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_e

    .line 424
    .line 425
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 426
    .line 427
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 428
    .line 429
    iget-object v0, v0, La/hev0;->e:La/vmk;

    .line 430
    .line 431
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 435
    .line 436
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 437
    .line 438
    iget-object v0, v0, La/hev0;->e:La/vmk;

    .line 439
    .line 440
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 441
    .line 442
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 446
    .line 447
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 448
    .line 449
    iget-object v1, v0, La/hev0;->e:La/vmk;

    .line 450
    .line 451
    iput-object p0, v1, La/i7k;->a:La/hev0;

    .line 452
    .line 453
    iget-object v0, v0, La/hev0;->h:La/i7k;

    .line 454
    .line 455
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 459
    .line 460
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 461
    .line 462
    iget-object v0, v0, La/hev0;->i:La/i7k;

    .line 463
    .line 464
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 468
    .line 469
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 470
    .line 471
    iget-object v0, v0, La/hev0;->h:La/i7k;

    .line 472
    .line 473
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 474
    .line 475
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 479
    .line 480
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 481
    .line 482
    iget-object v0, v0, La/hev0;->i:La/i7k;

    .line 483
    .line 484
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    goto/16 :goto_1

    .line 490
    .line 491
    :cond_e
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 492
    .line 493
    invoke-virtual {v0}, La/k4e;->z()Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    iget-object v3, p0, La/hev0;->b:La/k4e;

    .line 498
    .line 499
    if-eqz v0, :cond_f

    .line 500
    .line 501
    iget-object v0, v3, La/k4e;->e:La/ocu0;

    .line 502
    .line 503
    iget-object v0, v0, La/hev0;->e:La/vmk;

    .line 504
    .line 505
    iget-object v0, v0, La/i7k;->l:Ljava/util/ArrayList;

    .line 506
    .line 507
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 511
    .line 512
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 513
    .line 514
    iget-object v0, v0, La/hev0;->e:La/vmk;

    .line 515
    .line 516
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    goto :goto_1

    .line 520
    :cond_f
    iget-object v0, v3, La/k4e;->e:La/ocu0;

    .line 521
    .line 522
    iget-object v0, v0, La/hev0;->e:La/vmk;

    .line 523
    .line 524
    iget-object v0, v0, La/i7k;->l:Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    goto :goto_1

    .line 530
    :cond_10
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 531
    .line 532
    iget-object v0, v0, La/hev0;->e:La/vmk;

    .line 533
    .line 534
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 543
    .line 544
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 545
    .line 546
    iget-object v0, v0, La/hev0;->h:La/i7k;

    .line 547
    .line 548
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 549
    .line 550
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 554
    .line 555
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 556
    .line 557
    iget-object v0, v0, La/hev0;->i:La/i7k;

    .line 558
    .line 559
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 560
    .line 561
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    iput-boolean v4, v2, La/i7k;->b:Z

    .line 565
    .line 566
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    iget-object v0, v9, La/i7k;->l:Ljava/util/ArrayList;

    .line 573
    .line 574
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    iget-object v0, v8, La/i7k;->l:Ljava/util/ArrayList;

    .line 578
    .line 579
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    goto :goto_1

    .line 583
    :cond_11
    iget-object v0, v0, La/k4e;->V:La/k4e;

    .line 584
    .line 585
    if-nez v0, :cond_12

    .line 586
    .line 587
    goto :goto_1

    .line 588
    :cond_12
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 589
    .line 590
    iget-object v0, v0, La/hev0;->e:La/vmk;

    .line 591
    .line 592
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    iput-boolean v4, v2, La/i7k;->b:Z

    .line 601
    .line 602
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    :cond_13
    :goto_1
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 609
    .line 610
    iget-object v1, v0, La/k4e;->R:[La/w2e;

    .line 611
    .line 612
    aget-object v3, v1, v7

    .line 613
    .line 614
    iget-object v5, v3, La/w2e;->f:La/w2e;

    .line 615
    .line 616
    if-eqz v5, :cond_17

    .line 617
    .line 618
    aget-object v6, v1, v4

    .line 619
    .line 620
    iget-object v6, v6, La/w2e;->f:La/w2e;

    .line 621
    .line 622
    if-eqz v6, :cond_17

    .line 623
    .line 624
    invoke-virtual {v0}, La/k4e;->z()Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 629
    .line 630
    if-eqz v0, :cond_14

    .line 631
    .line 632
    iget-object v0, v1, La/k4e;->R:[La/w2e;

    .line 633
    .line 634
    aget-object v0, v0, v7

    .line 635
    .line 636
    invoke-virtual {v0}, La/w2e;->e()I

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    iput v0, v9, La/i7k;->f:I

    .line 641
    .line 642
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 643
    .line 644
    iget-object p0, p0, La/k4e;->R:[La/w2e;

    .line 645
    .line 646
    aget-object p0, p0, v4

    .line 647
    .line 648
    invoke-virtual {p0}, La/w2e;->e()I

    .line 649
    .line 650
    .line 651
    move-result p0

    .line 652
    neg-int p0, p0

    .line 653
    iput p0, v8, La/i7k;->f:I

    .line 654
    .line 655
    return-void

    .line 656
    :cond_14
    iget-object v0, v1, La/k4e;->R:[La/w2e;

    .line 657
    .line 658
    aget-object v0, v0, v7

    .line 659
    .line 660
    invoke-static {v0}, La/hev0;->h(La/w2e;)La/i7k;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 665
    .line 666
    iget-object v1, v1, La/k4e;->R:[La/w2e;

    .line 667
    .line 668
    aget-object v1, v1, v4

    .line 669
    .line 670
    invoke-static {v1}, La/hev0;->h(La/w2e;)La/i7k;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    if-eqz v0, :cond_15

    .line 675
    .line 676
    invoke-virtual {v0, p0}, La/i7k;->b(La/hev0;)V

    .line 677
    .line 678
    .line 679
    :cond_15
    if-eqz v1, :cond_16

    .line 680
    .line 681
    invoke-virtual {v1, p0}, La/i7k;->b(La/hev0;)V

    .line 682
    .line 683
    .line 684
    :cond_16
    const/4 v0, 0x4

    .line 685
    iput v0, p0, La/hev0;->j:I

    .line 686
    .line 687
    return-void

    .line 688
    :cond_17
    if-eqz v5, :cond_18

    .line 689
    .line 690
    invoke-static {v3}, La/hev0;->h(La/w2e;)La/i7k;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    if-eqz v0, :cond_1a

    .line 695
    .line 696
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 697
    .line 698
    iget-object v1, v1, La/k4e;->R:[La/w2e;

    .line 699
    .line 700
    aget-object v1, v1, v7

    .line 701
    .line 702
    invoke-virtual {v1}, La/w2e;->e()I

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    invoke-static {v9, v0, v1}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {p0, v8, v9, v4, v2}, La/hev0;->c(La/i7k;La/i7k;ILa/vmk;)V

    .line 710
    .line 711
    .line 712
    return-void

    .line 713
    :cond_18
    aget-object v1, v1, v4

    .line 714
    .line 715
    iget-object v3, v1, La/w2e;->f:La/w2e;

    .line 716
    .line 717
    if-eqz v3, :cond_19

    .line 718
    .line 719
    invoke-static {v1}, La/hev0;->h(La/w2e;)La/i7k;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    if-eqz v0, :cond_1a

    .line 724
    .line 725
    iget-object v1, p0, La/hev0;->b:La/k4e;

    .line 726
    .line 727
    iget-object v1, v1, La/k4e;->R:[La/w2e;

    .line 728
    .line 729
    aget-object v1, v1, v4

    .line 730
    .line 731
    invoke-virtual {v1}, La/w2e;->e()I

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    neg-int v1, v1

    .line 736
    invoke-static {v8, v0, v1}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 737
    .line 738
    .line 739
    const/4 v0, -0x1

    .line 740
    invoke-virtual {p0, v9, v8, v0, v2}, La/hev0;->c(La/i7k;La/i7k;ILa/vmk;)V

    .line 741
    .line 742
    .line 743
    return-void

    .line 744
    :cond_19
    instance-of v1, v0, La/jvv;

    .line 745
    .line 746
    if-nez v1, :cond_1a

    .line 747
    .line 748
    iget-object v1, v0, La/k4e;->V:La/k4e;

    .line 749
    .line 750
    if-eqz v1, :cond_1a

    .line 751
    .line 752
    iget-object v1, v1, La/k4e;->d:La/cmw;

    .line 753
    .line 754
    iget-object v1, v1, La/hev0;->h:La/i7k;

    .line 755
    .line 756
    invoke-virtual {v0}, La/k4e;->t()I

    .line 757
    .line 758
    .line 759
    move-result v0

    .line 760
    invoke-static {v9, v1, v0}, La/hev0;->b(La/i7k;La/i7k;I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {p0, v8, v9, v4, v2}, La/hev0;->c(La/i7k;La/i7k;ILa/vmk;)V

    .line 764
    .line 765
    .line 766
    :cond_1a
    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, La/hev0;->b:La/k4e;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/qiv;

    .line 5
    .line 6
    iget v1, v1, La/qiv;->y0:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    iget-object p0, p0, La/hev0;->h:La/i7k;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget p0, p0, La/i7k;->g:I

    .line 14
    .line 15
    iput p0, v0, La/k4e;->a0:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget p0, p0, La/i7k;->g:I

    .line 19
    .line 20
    iput p0, v0, La/k4e;->b0:I

    .line 21
    .line 22
    return-void
.end method

.method public f()V
    .locals 0

    .line 1
    iget-object p0, p0, La/hev0;->h:La/i7k;

    .line 2
    .line 3
    invoke-virtual {p0}, La/i7k;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(II)I
    .locals 0

    .line 1
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget p2, p0, La/k4e;->w:I

    .line 6
    .line 7
    iget p0, p0, La/k4e;->v:I

    .line 8
    .line 9
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-lez p2, :cond_0

    .line 14
    .line 15
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :cond_0
    if-eq p0, p1, :cond_3

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    iget p2, p0, La/k4e;->z:I

    .line 23
    .line 24
    iget p0, p0, La/k4e;->y:I

    .line 25
    .line 26
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-lez p2, :cond_2

    .line 31
    .line 32
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :cond_2
    if-eq p0, p1, :cond_3

    .line 37
    .line 38
    return p0

    .line 39
    :cond_3
    return p1
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object p0, p0, La/hev0;->e:La/vmk;

    .line 2
    .line 3
    iget-boolean v0, p0, La/i7k;->j:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, La/i7k;->g:I

    .line 8
    .line 9
    int-to-long v0, p0

    .line 10
    return-wide v0

    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    return-wide v0
.end method

.method public k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l(La/w2e;La/w2e;I)V
    .locals 12

    .line 1
    invoke-static {p1}, La/hev0;->h(La/w2e;)La/i7k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p2}, La/hev0;->h(La/w2e;)La/i7k;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, v0, La/i7k;->j:Z

    .line 10
    .line 11
    if-eqz v2, :cond_f

    .line 12
    .line 13
    iget-boolean v2, v1, La/i7k;->j:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    iget v2, v0, La/i7k;->g:I

    .line 20
    .line 21
    invoke-virtual {p1}, La/w2e;->e()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    add-int/2addr p1, v2

    .line 26
    iget v2, v1, La/i7k;->g:I

    .line 27
    .line 28
    invoke-virtual {p2}, La/w2e;->e()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    sub-int/2addr v2, p2

    .line 33
    sub-int p2, v2, p1

    .line 34
    .line 35
    iget-object v3, p0, La/hev0;->e:La/vmk;

    .line 36
    .line 37
    iget-boolean v4, v3, La/i7k;->j:Z

    .line 38
    .line 39
    const/high16 v5, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-nez v4, :cond_a

    .line 42
    .line 43
    iget-object v4, p0, La/hev0;->d:La/j4e;

    .line 44
    .line 45
    sget-object v6, La/j4e;->c:La/j4e;

    .line 46
    .line 47
    if-ne v4, v6, :cond_a

    .line 48
    .line 49
    iget v4, p0, La/hev0;->a:I

    .line 50
    .line 51
    if-eqz v4, :cond_9

    .line 52
    .line 53
    const/4 v7, 0x1

    .line 54
    if-eq v4, v7, :cond_8

    .line 55
    .line 56
    const/4 v8, 0x2

    .line 57
    if-eq v4, v8, :cond_5

    .line 58
    .line 59
    const/4 v8, 0x3

    .line 60
    if-eq v4, v8, :cond_1

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_1
    iget-object v4, p0, La/hev0;->b:La/k4e;

    .line 65
    .line 66
    iget-object v9, v4, La/k4e;->d:La/cmw;

    .line 67
    .line 68
    iget-object v10, v9, La/hev0;->d:La/j4e;

    .line 69
    .line 70
    if-ne v10, v6, :cond_2

    .line 71
    .line 72
    iget v10, v9, La/hev0;->a:I

    .line 73
    .line 74
    if-ne v10, v8, :cond_2

    .line 75
    .line 76
    iget-object v10, v4, La/k4e;->e:La/ocu0;

    .line 77
    .line 78
    iget-object v11, v10, La/hev0;->d:La/j4e;

    .line 79
    .line 80
    if-ne v11, v6, :cond_2

    .line 81
    .line 82
    iget v6, v10, La/hev0;->a:I

    .line 83
    .line 84
    if-ne v6, v8, :cond_2

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    if-nez p3, :cond_3

    .line 88
    .line 89
    iget-object v9, v4, La/k4e;->e:La/ocu0;

    .line 90
    .line 91
    :cond_3
    iget-object v6, v9, La/hev0;->e:La/vmk;

    .line 92
    .line 93
    iget-boolean v8, v6, La/i7k;->j:Z

    .line 94
    .line 95
    if-eqz v8, :cond_a

    .line 96
    .line 97
    iget v4, v4, La/k4e;->Y:F

    .line 98
    .line 99
    iget v6, v6, La/i7k;->g:I

    .line 100
    .line 101
    if-ne p3, v7, :cond_4

    .line 102
    .line 103
    int-to-float v6, v6

    .line 104
    div-float/2addr v6, v4

    .line 105
    add-float/2addr v6, v5

    .line 106
    float-to-int v4, v6

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    int-to-float v6, v6

    .line 109
    mul-float/2addr v4, v6

    .line 110
    add-float/2addr v4, v5

    .line 111
    float-to-int v4, v4

    .line 112
    :goto_0
    invoke-virtual {v3, v4}, La/vmk;->d(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    iget-object v4, p0, La/hev0;->b:La/k4e;

    .line 117
    .line 118
    iget-object v6, v4, La/k4e;->V:La/k4e;

    .line 119
    .line 120
    if-eqz v6, :cond_a

    .line 121
    .line 122
    if-nez p3, :cond_6

    .line 123
    .line 124
    iget-object v6, v6, La/k4e;->d:La/cmw;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_6
    iget-object v6, v6, La/k4e;->e:La/ocu0;

    .line 128
    .line 129
    :goto_1
    iget-object v6, v6, La/hev0;->e:La/vmk;

    .line 130
    .line 131
    iget-boolean v7, v6, La/i7k;->j:Z

    .line 132
    .line 133
    if-eqz v7, :cond_a

    .line 134
    .line 135
    if-nez p3, :cond_7

    .line 136
    .line 137
    iget v4, v4, La/k4e;->x:F

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    iget v4, v4, La/k4e;->A:F

    .line 141
    .line 142
    :goto_2
    iget v6, v6, La/i7k;->g:I

    .line 143
    .line 144
    int-to-float v6, v6

    .line 145
    mul-float/2addr v6, v4

    .line 146
    add-float/2addr v6, v5

    .line 147
    float-to-int v4, v6

    .line 148
    invoke-virtual {p0, v4, p3}, La/hev0;->g(II)I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-virtual {v3, v4}, La/vmk;->d(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_8
    iget v4, v3, La/vmk;->m:I

    .line 157
    .line 158
    invoke-virtual {p0, v4, p3}, La/hev0;->g(II)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    invoke-virtual {v3, v4}, La/vmk;->d(I)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_9
    invoke-virtual {p0, p2, p3}, La/hev0;->g(II)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-virtual {v3, v4}, La/vmk;->d(I)V

    .line 175
    .line 176
    .line 177
    :cond_a
    :goto_3
    iget-boolean v4, v3, La/i7k;->j:Z

    .line 178
    .line 179
    if-nez v4, :cond_b

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_b
    iget v4, v3, La/i7k;->g:I

    .line 183
    .line 184
    iget-object v6, p0, La/hev0;->i:La/i7k;

    .line 185
    .line 186
    iget-object v7, p0, La/hev0;->h:La/i7k;

    .line 187
    .line 188
    if-ne v4, p2, :cond_c

    .line 189
    .line 190
    invoke-virtual {v7, p1}, La/i7k;->d(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6, v2}, La/i7k;->d(I)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_c
    iget-object p0, p0, La/hev0;->b:La/k4e;

    .line 198
    .line 199
    if-nez p3, :cond_d

    .line 200
    .line 201
    iget p0, p0, La/k4e;->f0:F

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_d
    iget p0, p0, La/k4e;->g0:F

    .line 205
    .line 206
    :goto_4
    if-ne v0, v1, :cond_e

    .line 207
    .line 208
    iget p1, v0, La/i7k;->g:I

    .line 209
    .line 210
    iget v2, v1, La/i7k;->g:I

    .line 211
    .line 212
    move p0, v5

    .line 213
    :cond_e
    sub-int/2addr v2, p1

    .line 214
    sub-int/2addr v2, v4

    .line 215
    int-to-float p1, p1

    .line 216
    add-float/2addr p1, v5

    .line 217
    int-to-float p2, v2

    .line 218
    mul-float/2addr p2, p0

    .line 219
    add-float/2addr p2, p1

    .line 220
    float-to-int p0, p2

    .line 221
    invoke-virtual {v7, p0}, La/i7k;->d(I)V

    .line 222
    .line 223
    .line 224
    iget p0, v7, La/i7k;->g:I

    .line 225
    .line 226
    iget p1, v3, La/i7k;->g:I

    .line 227
    .line 228
    add-int/2addr p0, p1

    .line 229
    invoke-virtual {v6, p0}, La/i7k;->d(I)V

    .line 230
    .line 231
    .line 232
    :cond_f
    :goto_5
    return-void
.end method
