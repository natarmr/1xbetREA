.class public final La/rgf0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/pyu;

.field public final p:La/i1w0;


# direct methods
.method public constructor <init>(La/mne;La/ctf0;La/pyu;La/i1w0;La/dot;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/b4f0;

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    invoke-direct {v2, v0}, La/b4f0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/iv80;

    .line 12
    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    invoke-direct {v3, p2, v0}, La/iv80;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p1, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p2, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p3, v0, La/rgf0;->o:La/pyu;

    .line 33
    .line 34
    iput-object p4, v0, La/rgf0;->p:La/i1w0;

    .line 35
    .line 36
    iget-object p0, p3, La/pyu;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/vff0;

    .line 39
    .line 40
    invoke-virtual {p0}, La/vff0;->e()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 45
    .line 46
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object p2, v0, La/i3t0;->f:La/oyg0;

    .line 56
    .line 57
    move-object v1, p1

    .line 58
    check-cast v1, La/pgf0;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    const/16 v6, 0xe

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-static/range {v1 .. v6}, La/pgf0;->a(La/pgf0;Ljava/util/Map;Ljava/lang/String;La/nmy;La/cny;I)La/pgf0;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p0, p1, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_0

    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide p0

    .line 82
    iget-object p2, p5, La/dot;->a:La/j1q0;

    .line 83
    .line 84
    iget-object p2, p2, La/j1q0;->a:La/m1q0;

    .line 85
    .line 86
    iget-object p2, p2, La/m1q0;->a:La/q7d0;

    .line 87
    .line 88
    const-string p3, "TEST_REMOTE_CONFIG_LAST_ACTION_TIME"

    .line 89
    .line 90
    invoke-virtual {p2, p3, p0, p1}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 91
    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/hgf0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/bgf0;->a:La/bgf0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/rgf0;->p:La/i1w0;

    .line 15
    .line 16
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/c8d;

    .line 21
    .line 22
    sget-object v1, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    move-object v0, p1

    .line 35
    check-cast v0, La/paw;

    .line 36
    .line 37
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_a

    .line 42
    .line 43
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/oe50;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    instance-of v0, p1, La/egf0;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    check-cast p1, La/egf0;

    .line 58
    .line 59
    iget-object p1, p1, La/egf0;->a:Ljava/lang/String;

    .line 60
    .line 61
    new-instance v0, La/mgf0;

    .line 62
    .line 63
    invoke-direct {v0, p1}, La/mgf0;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    sget-object v0, La/agf0;->a:La/agf0;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    instance-of v0, p1, La/fgf0;

    .line 83
    .line 84
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 85
    .line 86
    iget-object v2, p0, La/i3t0;->i:La/ocj;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 91
    .line 92
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-object v2, p0

    .line 100
    check-cast v2, La/pgf0;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-object v3, p1

    .line 106
    check-cast v3, La/fgf0;

    .line 107
    .line 108
    iget-object v4, v3, La/fgf0;->a:Ljava/lang/String;

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    const/16 v7, 0xd

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    invoke-static/range {v2 .. v7}, La/pgf0;->a(La/pgf0;Ljava/util/Map;Ljava/lang/String;La/nmy;La/cny;I)La/pgf0;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_3

    .line 124
    .line 125
    return-void

    .line 126
    :cond_4
    sget-object v0, La/ggf0;->a:La/ggf0;

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    new-instance p1, La/ngf0;

    .line 135
    .line 136
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, La/pgf0;

    .line 141
    .line 142
    iget-object v0, v0, La/pgf0;->c:La/nmy;

    .line 143
    .line 144
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, La/pgf0;

    .line 149
    .line 150
    iget-object v1, v1, La/pgf0;->d:La/cny;

    .line 151
    .line 152
    invoke-direct {p1, v0, v1}, La/ngf0;-><init>(La/nmy;La/cny;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_5
    instance-of v0, p1, La/cgf0;

    .line 160
    .line 161
    iget-object p0, p0, La/rgf0;->o:La/pyu;

    .line 162
    .line 163
    if-eqz v0, :cond_8

    .line 164
    .line 165
    iget-object p0, p0, La/pyu;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p0, La/vff0;

    .line 168
    .line 169
    invoke-virtual {p0}, La/vff0;->e()Ljava/util/Map;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 174
    .line 175
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-object v3, p0

    .line 183
    check-cast v3, La/pgf0;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    const/16 v8, 0xe

    .line 190
    .line 191
    const/4 v5, 0x0

    .line 192
    const/4 v6, 0x0

    .line 193
    invoke-static/range {v3 .. v8}, La/pgf0;->a(La/pgf0;Ljava/util/Map;Ljava/lang/String;La/nmy;La/cny;I)La/pgf0;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v0, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-eqz p0, :cond_6

    .line 202
    .line 203
    iget-object p0, v2, La/ocj;->a:La/p7m0;

    .line 204
    .line 205
    :cond_7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-object v2, v0

    .line 213
    check-cast v2, La/pgf0;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-object v3, p1

    .line 219
    check-cast v3, La/cgf0;

    .line 220
    .line 221
    iget-object v5, v3, La/cgf0;->a:La/nmy;

    .line 222
    .line 223
    iget-object v6, v3, La/cgf0;->b:La/cny;

    .line 224
    .line 225
    const/4 v7, 0x3

    .line 226
    const/4 v3, 0x0

    .line 227
    const/4 v4, 0x0

    .line 228
    invoke-static/range {v2 .. v7}, La/pgf0;->a(La/pgf0;Ljava/util/Map;Ljava/lang/String;La/nmy;La/cny;I)La/pgf0;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {p0, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_7

    .line 237
    .line 238
    return-void

    .line 239
    :cond_8
    sget-object v0, La/dgf0;->a:La/dgf0;

    .line 240
    .line 241
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_b

    .line 246
    .line 247
    iget-object p0, p0, La/pyu;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, La/vff0;

    .line 250
    .line 251
    invoke-virtual {p0}, La/vff0;->e()Ljava/util/Map;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    iget-object p0, v2, La/ocj;->a:La/p7m0;

    .line 256
    .line 257
    :cond_9
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-object v3, p1

    .line 265
    check-cast v3, La/pgf0;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const/16 v8, 0xe

    .line 272
    .line 273
    const/4 v5, 0x0

    .line 274
    const/4 v6, 0x0

    .line 275
    invoke-static/range {v3 .. v8}, La/pgf0;->a(La/pgf0;Ljava/util/Map;Ljava/lang/String;La/nmy;La/cny;I)La/pgf0;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    if-eqz p1, :cond_9

    .line 284
    .line 285
    :cond_a
    return-void

    .line 286
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 287
    .line 288
    .line 289
    return-void
.end method
