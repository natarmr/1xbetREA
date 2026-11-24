.class public final La/mrk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/ksk;

.field public final b:La/ctf0;

.field public final c:La/g2v;

.field public final d:La/y78;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/n0o0;


# direct methods
.method public constructor <init>(La/ksk;La/ctf0;La/g2v;La/y78;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/mrk;->a:La/ksk;

    .line 8
    .line 9
    iput-object p2, p0, La/mrk;->b:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/mrk;->c:La/g2v;

    .line 12
    .line 13
    iput-object p4, p0, La/mrk;->d:La/y78;

    .line 14
    .line 15
    new-instance p2, La/krk;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p2, p0, p3}, La/krk;-><init>(La/mrk;B)V

    .line 19
    .line 20
    .line 21
    new-instance p3, La/yw9;

    .line 22
    .line 23
    const/4 p4, 0x0

    .line 24
    const/16 v0, 0x14

    .line 25
    .line 26
    invoke-direct {p3, p4, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, La/mrk;->e:La/n0o0;

    .line 34
    .line 35
    iget-object p2, p1, La/ksk;->h:La/sip;

    .line 36
    .line 37
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, La/mrk;->f:La/n0o0;

    .line 42
    .line 43
    iget-object p2, p1, La/ksk;->c:La/j0g0;

    .line 44
    .line 45
    new-instance p3, La/krk;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {p3, p0, v1}, La/krk;-><init>(La/mrk;B)V

    .line 49
    .line 50
    .line 51
    new-instance v1, La/yw9;

    .line 52
    .line 53
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    iput-object p3, p0, La/mrk;->g:La/n0o0;

    .line 61
    .line 62
    new-instance p3, La/krk;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-direct {p3, p0, v1}, La/krk;-><init>(La/mrk;B)V

    .line 66
    .line 67
    .line 68
    new-instance v1, La/yw9;

    .line 69
    .line 70
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iput-object p2, p0, La/mrk;->h:La/n0o0;

    .line 78
    .line 79
    iget-object p1, p1, La/ksk;->d:La/j0g0;

    .line 80
    .line 81
    if-eqz p1, :cond_1

    .line 82
    .line 83
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 84
    .line 85
    instance-of p3, p2, La/g0g0;

    .line 86
    .line 87
    if-eqz p3, :cond_0

    .line 88
    .line 89
    move-object p2, p4

    .line 90
    :cond_0
    check-cast p2, La/kuk;

    .line 91
    .line 92
    if-eqz p2, :cond_1

    .line 93
    .line 94
    invoke-static {p2}, La/e3c;->N(La/kuk;)La/drk;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    new-instance p2, La/drk;

    .line 100
    .line 101
    new-instance p3, La/btk;

    .line 102
    .line 103
    sget-object v1, La/iun;->a:La/iun;

    .line 104
    .line 105
    const-string v2, ""

    .line 106
    .line 107
    invoke-direct {p3, v1, v2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance v3, La/btk;

    .line 111
    .line 112
    invoke-direct {v3, v1, v2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p2, p3, v3}, La/drk;-><init>(La/btk;La/btk;)V

    .line 116
    .line 117
    .line 118
    :goto_0
    new-instance p3, La/krk;

    .line 119
    .line 120
    const/4 v1, 0x3

    .line 121
    invoke-direct {p3, p0, v1}, La/krk;-><init>(La/mrk;B)V

    .line 122
    .line 123
    .line 124
    new-instance v1, La/yw9;

    .line 125
    .line 126
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    iput-object p2, p0, La/mrk;->i:La/n0o0;

    .line 134
    .line 135
    if-eqz p1, :cond_3

    .line 136
    .line 137
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 138
    .line 139
    instance-of p3, p2, La/g0g0;

    .line 140
    .line 141
    if-eqz p3, :cond_2

    .line 142
    .line 143
    move-object p2, p4

    .line 144
    :cond_2
    check-cast p2, La/kuk;

    .line 145
    .line 146
    if-eqz p2, :cond_3

    .line 147
    .line 148
    invoke-static {p2}, La/d5c;->d0(La/kuk;)La/irk;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    new-instance p2, La/irk;

    .line 154
    .line 155
    sget-object p3, La/iun;->a:La/iun;

    .line 156
    .line 157
    invoke-direct {p2, p3, p3}, La/irk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    :goto_1
    new-instance p3, La/krk;

    .line 161
    .line 162
    const/4 v1, 0x4

    .line 163
    invoke-direct {p3, p0, v1}, La/krk;-><init>(La/mrk;B)V

    .line 164
    .line 165
    .line 166
    new-instance v1, La/yw9;

    .line 167
    .line 168
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 169
    .line 170
    .line 171
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    iput-object p2, p0, La/mrk;->j:La/n0o0;

    .line 176
    .line 177
    if-eqz p1, :cond_6

    .line 178
    .line 179
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 180
    .line 181
    instance-of p3, p2, La/g0g0;

    .line 182
    .line 183
    if-eqz p3, :cond_4

    .line 184
    .line 185
    move-object p2, p4

    .line 186
    :cond_4
    check-cast p2, La/kuk;

    .line 187
    .line 188
    if-eqz p2, :cond_6

    .line 189
    .line 190
    iget-object p2, p2, La/kuk;->j:Ljava/lang/Object;

    .line 191
    .line 192
    instance-of p3, p2, La/g0g0;

    .line 193
    .line 194
    if-eqz p3, :cond_5

    .line 195
    .line 196
    move-object p2, p4

    .line 197
    :cond_5
    check-cast p2, Ljava/util/List;

    .line 198
    .line 199
    if-nez p2, :cond_7

    .line 200
    .line 201
    :cond_6
    sget-object p2, La/iun;->a:La/iun;

    .line 202
    .line 203
    :cond_7
    invoke-static {p2}, La/v3c;->i0(Ljava/util/List;)La/irk;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    new-instance p3, La/krk;

    .line 208
    .line 209
    const/4 v1, 0x5

    .line 210
    invoke-direct {p3, p0, v1}, La/krk;-><init>(La/mrk;B)V

    .line 211
    .line 212
    .line 213
    new-instance v1, La/yw9;

    .line 214
    .line 215
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 216
    .line 217
    .line 218
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    iput-object p2, p0, La/mrk;->k:La/n0o0;

    .line 223
    .line 224
    if-eqz p1, :cond_a

    .line 225
    .line 226
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 227
    .line 228
    instance-of p2, p1, La/g0g0;

    .line 229
    .line 230
    if-eqz p2, :cond_8

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_8
    move-object p4, p1

    .line 234
    :goto_2
    check-cast p4, La/kuk;

    .line 235
    .line 236
    if-eqz p4, :cond_a

    .line 237
    .line 238
    iget-object p1, p4, La/kuk;->g:La/j0g0;

    .line 239
    .line 240
    if-eqz p1, :cond_a

    .line 241
    .line 242
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 243
    .line 244
    sget-object p2, La/iun;->a:La/iun;

    .line 245
    .line 246
    instance-of p3, p1, La/g0g0;

    .line 247
    .line 248
    if-eqz p3, :cond_9

    .line 249
    .line 250
    move-object p1, p2

    .line 251
    :cond_9
    check-cast p1, Ljava/util/List;

    .line 252
    .line 253
    if-nez p1, :cond_b

    .line 254
    .line 255
    :cond_a
    sget-object p1, La/iun;->a:La/iun;

    .line 256
    .line 257
    :cond_b
    new-instance p2, La/krk;

    .line 258
    .line 259
    const/4 p3, 0x6

    .line 260
    invoke-direct {p2, p0, p3}, La/krk;-><init>(La/mrk;B)V

    .line 261
    .line 262
    .line 263
    new-instance p3, La/yw9;

    .line 264
    .line 265
    invoke-direct {p3, p1, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 266
    .line 267
    .line 268
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    iput-object p1, p0, La/mrk;->l:La/n0o0;

    .line 273
    .line 274
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/ksk;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/mrk;->f:La/n0o0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/fee;

    .line 13
    .line 14
    iget-object v1, p1, La/ksk;->h:La/sip;

    .line 15
    .line 16
    iget-object v2, p1, La/ksk;->c:La/j0g0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, La/ksk;->d:La/j0g0;

    .line 22
    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v1, v0, La/g0g0;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    move-object v0, v3

    .line 33
    :cond_0
    check-cast v0, La/kuk;

    .line 34
    .line 35
    invoke-static {v0}, La/hic;->w(La/kuk;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, La/mrk;->e:La/n0o0;

    .line 44
    .line 45
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, La/fee;

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v0, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    instance-of v5, v0, La/g0g0;

    .line 58
    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v3, v0

    .line 63
    :goto_0
    check-cast v3, La/jtk;

    .line 64
    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    iget-boolean v0, v3, La/jtk;->a:Z

    .line 68
    .line 69
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/fee;

    .line 79
    .line 80
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v3, v0

    .line 85
    check-cast v3, Ljava/lang/Boolean;

    .line 86
    .line 87
    :cond_3
    :goto_1
    invoke-virtual {v4, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    iget-object v0, p0, La/mrk;->g:La/n0o0;

    .line 91
    .line 92
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, La/fee;

    .line 97
    .line 98
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, La/tsk;

    .line 102
    .line 103
    iget-object v2, p0, La/mrk;->a:La/ksk;

    .line 104
    .line 105
    iget-object v2, v2, La/ksk;->b:La/sff0;

    .line 106
    .line 107
    iget-object v2, v2, La/sff0;->c:La/ech;

    .line 108
    .line 109
    iget-object v2, v2, La/ech;->q:La/n2o;

    .line 110
    .line 111
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, La/fee;

    .line 116
    .line 117
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 118
    .line 119
    iget-object v3, p1, La/ksk;->b:La/sff0;

    .line 120
    .line 121
    iget-object v4, v3, La/sff0;->c:La/ech;

    .line 122
    .line 123
    iget-object v5, v4, La/ech;->q:La/n2o;

    .line 124
    .line 125
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 126
    .line 127
    iget-object v6, v3, La/mum0;->y:La/v5l0;

    .line 128
    .line 129
    iget-object v7, p1, La/ksk;->d:La/j0g0;

    .line 130
    .line 131
    iget-object v9, p1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 132
    .line 133
    new-instance v11, La/lrk;

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    invoke-direct {v11, p0, p1, v3}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    iget-object v8, p0, La/mrk;->c:La/g2v;

    .line 140
    .line 141
    const/4 v10, 0x0

    .line 142
    invoke-static/range {v5 .. v11}, La/xbc;->P(La/n2o;La/v5l0;La/j0g0;La/g2v;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;ZLkotlin/jvm/functions/Function0;)La/gsk;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-direct {v1, v2, v0, p0}, La/tsk;-><init>(La/n2o;La/l7m0;La/gsk;)V

    .line 147
    .line 148
    .line 149
    return-object v1
.end method
