.class public final La/u8v;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:La/vzg0;

.field public final p:Ljava/lang/String;

.field public final q:La/i1w0;

.field public final r:La/ouu;

.field public final s:La/s31;

.field public final t:La/cyu;

.field public final u:Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;

.field public final v:La/x4u;

.field public final w:La/ilp0;


# direct methods
.method public constructor <init>(La/vzg0;Ljava/lang/String;La/pru;La/lbu;La/ctf0;La/i1w0;La/ouu;La/s31;La/cyu;La/mne;Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;La/x4u;La/ilp0;)V
    .locals 9

    .line 1
    move-object/from16 v0, p10

    .line 2
    .line 3
    move-object/from16 v1, p13

    .line 4
    .line 5
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, La/ng0;

    .line 9
    .line 10
    const/16 v8, 0xa

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    move-object v5, p3

    .line 14
    move-object v6, p4

    .line 15
    move-object v7, p5

    .line 16
    move-object/from16 v4, p11

    .line 17
    .line 18
    invoke-direct/range {v2 .. v8}, La/ng0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/ctf0;B)V

    .line 19
    .line 20
    .line 21
    new-instance v5, La/bcn;

    .line 22
    .line 23
    const/16 v3, 0x13

    .line 24
    .line 25
    invoke-direct {v5, p5, v3}, La/bcn;-><init>(La/ctf0;B)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, La/mne;->a:La/rwj;

    .line 29
    .line 30
    invoke-static {v3, v3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    move-object v4, v2

    .line 37
    move-object v2, p0

    .line 38
    invoke-direct/range {v2 .. v7}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/u8v;->o:La/vzg0;

    .line 42
    .line 43
    iput-object p2, p0, La/u8v;->p:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p6, p0, La/u8v;->q:La/i1w0;

    .line 46
    .line 47
    move-object/from16 v3, p7

    .line 48
    .line 49
    iput-object v3, p0, La/u8v;->r:La/ouu;

    .line 50
    .line 51
    move-object/from16 v3, p8

    .line 52
    .line 53
    iput-object v3, p0, La/u8v;->s:La/s31;

    .line 54
    .line 55
    move-object/from16 v3, p9

    .line 56
    .line 57
    iput-object v3, p0, La/u8v;->t:La/cyu;

    .line 58
    .line 59
    move-object/from16 v4, p11

    .line 60
    .line 61
    iput-object v4, p0, La/u8v;->u:Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;

    .line 62
    .line 63
    move-object/from16 v3, p12

    .line 64
    .line 65
    iput-object v3, p0, La/u8v;->v:La/x4u;

    .line 66
    .line 67
    iput-object v1, p0, La/u8v;->w:La/ilp0;

    .line 68
    .line 69
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, La/r8v;

    .line 74
    .line 75
    iget-object v3, v3, La/r8v;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v1, v3}, La/ilp0;->d(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 85
    .line 86
    sget-object v3, La/t8v;->a:La/t8v;

    .line 87
    .line 88
    new-instance v4, La/gkr;

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    const/16 v6, 0x12

    .line 92
    .line 93
    invoke-direct {v4, p0, v5, v6}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 94
    .line 95
    .line 96
    const/16 p0, 0xa

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    move p5, p0

    .line 100
    move-object p3, v0

    .line 101
    move-object p0, v1

    .line 102
    move-object p2, v2

    .line 103
    move-object p1, v3

    .line 104
    move-object p4, v4

    .line 105
    invoke-static/range {p0 .. p5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 106
    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 1

    .line 1
    sget-object v0, La/m8v;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object p0, p0, La/u8v;->p:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/m8v;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/e8v;

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
    instance-of v0, p1, La/w7v;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v0, La/z7v;->a:La/z7v;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, La/u8v;->q:La/i1w0;

    .line 27
    .line 28
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, La/c8d;

    .line 33
    .line 34
    sget-object v2, La/y7d;->a:La/v7d;

    .line 35
    .line 36
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 37
    .line 38
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    move-object v0, p1

    .line 46
    check-cast v0, La/paw;

    .line 47
    .line 48
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, La/oe50;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void

    .line 65
    :cond_2
    instance-of v0, p1, La/b8v;

    .line 66
    .line 67
    iget-object v2, p0, La/u8v;->w:La/ilp0;

    .line 68
    .line 69
    const-string v3, "SAVED_QUERY_STATE_HANDLE_KEY"

    .line 70
    .line 71
    iget-object v4, p0, La/u8v;->o:La/vzg0;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    check-cast p1, La/b8v;

    .line 76
    .line 77
    iget-object p0, p1, La/b8v;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v4, v3, p0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p0}, La/ilp0;->d(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    sget-object v0, La/a8v;->a:La/a8v;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    sget-object p1, La/p8v;->a:La/p8v;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    instance-of v0, p1, La/c8v;

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    iget-object v6, p0, La/i3t0;->f:La/oyg0;

    .line 104
    .line 105
    iget-object v7, p0, La/i3t0;->i:La/ocj;

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    check-cast p1, La/c8v;

    .line 110
    .line 111
    iget-object v0, p1, La/c8v;->a:La/bfo0;

    .line 112
    .line 113
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, La/r8v;

    .line 118
    .line 119
    iget-object p1, p1, La/r8v;->c:La/bfo0;

    .line 120
    .line 121
    if-eq p1, v0, :cond_5

    .line 122
    .line 123
    const-string p1, ""

    .line 124
    .line 125
    invoke-virtual {v4, v3, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p1}, La/ilp0;->d(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, La/r8v;

    .line 136
    .line 137
    iget-object p1, p1, La/r8v;->c:La/bfo0;

    .line 138
    .line 139
    invoke-static {p1}, La/n6x;->r0(La/bfo0;)La/wgh0;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v2, p0, La/u8v;->s:La/s31;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v2, v2, La/s31;->a:La/kt2;

    .line 149
    .line 150
    const-string v3, "screen"

    .line 151
    .line 152
    iget-object v1, v1, La/wgh0;->a:Ljava/lang/String;

    .line 153
    .line 154
    const-string v8, "search_call"

    .line 155
    .line 156
    invoke-static {v3, v1, v2, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p1}, La/n6x;->r0(La/bfo0;)La/wgh0;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object p1, p1, La/wgh0;->a:Ljava/lang/String;

    .line 164
    .line 165
    iget-object p0, p0, La/u8v;->t:La/cyu;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, La/cyu;->C(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    const-string p0, "SAVED_SELECTED_TAB_HANDLE_KEY"

    .line 171
    .line 172
    invoke-virtual {v4, p0, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object v2, v7, La/ocj;->a:La/p7m0;

    .line 176
    .line 177
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-object p1, p0

    .line 185
    check-cast p1, La/r8v;

    .line 186
    .line 187
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const/16 v1, 0x1b

    .line 191
    .line 192
    invoke-static {p1, v5, v0, v1}, La/r8v;->a(La/r8v;Ljava/lang/String;La/bfo0;I)La/r8v;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {v2, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-eqz p0, :cond_6

    .line 201
    .line 202
    return-void

    .line 203
    :cond_7
    instance-of v0, p1, La/y7v;

    .line 204
    .line 205
    const/16 v2, 0xf

    .line 206
    .line 207
    const-string v3, "SEARCH_FOCUSED_KEY"

    .line 208
    .line 209
    if-eqz v0, :cond_9

    .line 210
    .line 211
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    check-cast p0, La/r8v;

    .line 216
    .line 217
    iget-boolean p0, p0, La/r8v;->e:Z

    .line 218
    .line 219
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {v4, v3, p0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v7, La/ocj;->a:La/p7m0;

    .line 227
    .line 228
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-object p1, p0

    .line 236
    check-cast p1, La/r8v;

    .line 237
    .line 238
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {p1, v5, v5, v2}, La/r8v;->a(La/r8v;Ljava/lang/String;La/bfo0;I)La/r8v;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-eqz p0, :cond_8

    .line 250
    .line 251
    return-void

    .line 252
    :cond_9
    sget-object v0, La/x7v;->a:La/x7v;

    .line 253
    .line 254
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_b

    .line 259
    .line 260
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-virtual {v4, v3, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v7, La/ocj;->a:La/p7m0;

    .line 266
    .line 267
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-object v1, p1

    .line 275
    check-cast v1, La/r8v;

    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-static {v1, v5, v5, v2}, La/r8v;->a(La/r8v;Ljava/lang/String;La/bfo0;I)La/r8v;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    if-eqz p1, :cond_a

    .line 289
    .line 290
    sget-object p1, La/o8v;->a:La/o8v;

    .line 291
    .line 292
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_b
    sget-object v0, La/d8v;->a:La/d8v;

    .line 297
    .line 298
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-eqz p1, :cond_c

    .line 303
    .line 304
    new-instance p1, La/bb50;

    .line 305
    .line 306
    invoke-direct {p1, v1}, La/bb50;-><init>(Z)V

    .line 307
    .line 308
    .line 309
    iget-object p0, p0, La/u8v;->r:La/ouu;

    .line 310
    .line 311
    invoke-virtual {p0, p1, v1}, La/ouu;->q(La/cb50;Z)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 316
    .line 317
    .line 318
    return-void
.end method
