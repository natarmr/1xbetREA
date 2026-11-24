.class public final La/q54;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;

.field public final p:La/mzt;

.field public final q:La/dpc;


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/mzt;La/s9m0;La/dpc;La/pru;La/bzt;Lorg/xplatform/core/navigation/authorization/model/AuthType;La/mne;)V
    .locals 1

    .line 1
    iget-object p4, p9, La/mne;->c:La/vs10;

    .line 2
    .line 3
    iget-object p9, p9, La/mne;->a:La/rwj;

    .line 4
    .line 5
    invoke-static {p4, p9}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    new-instance p9, La/on;

    .line 10
    .line 11
    const/16 v0, 0x10

    .line 12
    .line 13
    invoke-direct {p9, p8, p6, p7, v0}, La/on;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance p6, La/or3;

    .line 17
    .line 18
    const/16 p7, 0xd

    .line 19
    .line 20
    invoke-direct {p6, p7}, La/or3;-><init>(B)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, p9, p4, p6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;La/g090;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, La/q54;->o:La/i1w0;

    .line 27
    .line 28
    iput-object p3, p0, La/q54;->p:La/mzt;

    .line 29
    .line 30
    iput-object p5, p0, La/q54;->q:La/dpc;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 0

    .line 1
    iget-object p0, p0, La/q54;->q:La/dpc;

    .line 2
    .line 3
    invoke-virtual {p0}, La/dpc;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 10

    .line 1
    check-cast p1, La/a54;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/y44;

    .line 10
    .line 11
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 12
    .line 13
    iget-object v2, p0, La/i3t0;->i:La/ocj;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-object v2, p0

    .line 27
    check-cast v2, La/m54;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v3, p1

    .line 33
    check-cast v3, La/y44;

    .line 34
    .line 35
    iget-boolean v5, v3, La/y44;->a:Z

    .line 36
    .line 37
    const-wide/16 v6, 0x0

    .line 38
    .line 39
    const/16 v8, 0x2f

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static/range {v2 .. v8}, La/m54;->a(La/m54;La/xn4;ZZJI)La/m54;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    sget-object v0, La/x44;->a:La/x44;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, La/m54;

    .line 67
    .line 68
    iget-boolean p1, p1, La/m54;->c:Z

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p0, p0, La/q54;->o:La/i1w0;

    .line 73
    .line 74
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v0, La/c8d;

    .line 79
    .line 80
    sget-object v1, La/y7d;->a:La/v7d;

    .line 81
    .line 82
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 83
    .line 84
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 85
    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :goto_0
    move-object v0, p1

    .line 93
    check-cast v0, La/paw;

    .line 94
    .line 95
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_8

    .line 100
    .line 101
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, La/oe50;

    .line 106
    .line 107
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, La/m54;

    .line 120
    .line 121
    iget-wide v3, p1, La/m54;->f:J

    .line 122
    .line 123
    const-wide/16 v8, -0x1

    .line 124
    .line 125
    cmp-long p1, v3, v8

    .line 126
    .line 127
    if-eqz p1, :cond_4

    .line 128
    .line 129
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, La/m54;

    .line 134
    .line 135
    iget-wide v3, p1, La/m54;->f:J

    .line 136
    .line 137
    sub-long v3, v6, v3

    .line 138
    .line 139
    const-wide/16 v8, 0x7d0

    .line 140
    .line 141
    cmp-long p1, v3, v8

    .line 142
    .line 143
    if-ltz p1, :cond_3

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    sget-object p1, La/j54;->a:La/j54;

    .line 147
    .line 148
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_4
    :goto_1
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 153
    .line 154
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-object v2, p1

    .line 162
    check-cast v2, La/m54;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    const/16 v8, 0x1f

    .line 169
    .line 170
    const/4 v3, 0x0

    .line 171
    const/4 v4, 0x0

    .line 172
    invoke-static/range {v2 .. v8}, La/m54;->a(La/m54;La/xn4;ZZJI)La/m54;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v0, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_5

    .line 181
    .line 182
    sget-object p1, La/k54;->a:La/k54;

    .line 183
    .line 184
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_6
    sget-object v0, La/z44;->a:La/z44;

    .line 189
    .line 190
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_7

    .line 195
    .line 196
    iget-object p0, p0, La/q54;->p:La/mzt;

    .line 197
    .line 198
    iget-object p0, p0, La/mzt;->a:La/peg0;

    .line 199
    .line 200
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p0, La/us3;

    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_7
    sget-object v0, La/w44;->a:La/w44;

    .line 209
    .line 210
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, La/m54;

    .line 221
    .line 222
    iget-boolean p1, p1, La/m54;->b:Z

    .line 223
    .line 224
    if-eqz p1, :cond_9

    .line 225
    .line 226
    :cond_8
    return-void

    .line 227
    :cond_9
    new-instance p1, La/o33;

    .line 228
    .line 229
    const/16 v0, 0xa

    .line 230
    .line 231
    invoke-direct {p1, v0}, La/o33;-><init>(B)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_a
    sget-object v0, La/v44;->a:La/v44;

    .line 239
    .line 240
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_c

    .line 245
    .line 246
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 247
    .line 248
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-object v2, p0

    .line 256
    check-cast v2, La/m54;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 262
    .line 263
    const-string v3, "KEY_ANIMATE_CHANGES"

    .line 264
    .line 265
    invoke-static {v1, p1, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    const-wide/16 v6, 0x0

    .line 269
    .line 270
    const/16 v8, 0x3d

    .line 271
    .line 272
    const/4 v3, 0x0

    .line 273
    const/4 v4, 0x0

    .line 274
    const/4 v5, 0x0

    .line 275
    invoke-static/range {v2 .. v8}, La/m54;->a(La/m54;La/xn4;ZZJI)La/m54;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    if-eqz p0, :cond_b

    .line 284
    .line 285
    return-void

    .line 286
    :cond_c
    sget-object v0, La/u44;->a:La/u44;

    .line 287
    .line 288
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    if-eqz p1, :cond_d

    .line 293
    .line 294
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 299
    .line 300
    .line 301
    return-void
.end method
