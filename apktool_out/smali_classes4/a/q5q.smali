.class public final La/q5q;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/noc;


# direct methods
.method public constructor <init>(La/mne;La/ctf0;La/nmy;La/cny;La/noc;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/gmo;

    .line 5
    .line 6
    const/16 v0, 0xb

    .line 7
    .line 8
    invoke-direct {v2, p3, p4, v0}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/bcn;

    .line 12
    .line 13
    const/16 p3, 0xe

    .line 14
    .line 15
    invoke-direct {v3, p2, p3}, La/bcn;-><init>(La/ctf0;B)V

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
    iput-object p5, v0, La/q5q;->o:La/noc;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    check-cast p1, La/g5q;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v1, p1, La/d5q;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 14
    .line 15
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 25
    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, La/o5q;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v3, p1

    .line 33
    check-cast v3, La/d5q;

    .line 34
    .line 35
    iget-object v3, v3, La/d5q;->a:La/nmy;

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    invoke-static {v4, v3, v2, v5}, La/o5q;->a(La/o5q;La/nmy;La/cny;I)La/o5q;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    instance-of v1, p1, La/f5q;

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 55
    .line 56
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 57
    .line 58
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 66
    .line 67
    move-object v5, v0

    .line 68
    check-cast v5, La/o5q;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-object v4, p1

    .line 74
    check-cast v4, La/f5q;

    .line 75
    .line 76
    iget-object v4, v4, La/f5q;->a:La/cny;

    .line 77
    .line 78
    invoke-static {v5, v2, v4, v3}, La/o5q;->a(La/o5q;La/nmy;La/cny;I)La/o5q;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    sget-object v1, La/e5q;->a:La/e5q;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_8

    .line 96
    .line 97
    iget-object p1, p0, La/q5q;->o:La/noc;

    .line 98
    .line 99
    iget-object p1, p1, La/noc;->a:La/vff0;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const-string v1, "TEST_SECTION_CONFIG_KEY"

    .line 105
    .line 106
    :try_start_0
    iget-object v2, p1, La/vff0;->c:La/q7d0;

    .line 107
    .line 108
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    move-object v0, v2

    .line 120
    :goto_0
    iget-object v2, p1, La/vff0;->h:La/vby;

    .line 121
    .line 122
    new-instance v4, La/inv;

    .line 123
    .line 124
    sget-object v5, La/ysm0;->a:La/ysm0;

    .line 125
    .line 126
    sget-object v6, La/ssd;->Companion:La/rsd;

    .line 127
    .line 128
    invoke-virtual {v6}, La/rsd;->serializer()La/jiy;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-static {v6}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-direct {v4, v5, v6, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4, v0}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/util/Map;

    .line 144
    .line 145
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_6

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    check-cast v4, Ljava/util/Map$Entry;

    .line 169
    .line 170
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, La/ssd;

    .line 175
    .line 176
    if-eqz v5, :cond_5

    .line 177
    .line 178
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :catch_0
    move-exception p1

    .line 191
    goto :goto_3

    .line 192
    :cond_6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 193
    .line 194
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    invoke-static {v4}, La/wp20;->a(I)I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    invoke-direct {v0, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Ljava/lang/Iterable;

    .line 210
    .line 211
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_7

    .line 220
    .line 221
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    move-object v5, v4

    .line 226
    check-cast v5, Ljava/util/Map$Entry;

    .line 227
    .line 228
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    check-cast v4, Ljava/util/Map$Entry;

    .line 233
    .line 234
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    check-cast v4, La/ssd;

    .line 242
    .line 243
    iget-object v6, v4, La/ssd;->a:La/mcy;

    .line 244
    .line 245
    iget-object v4, v4, La/ssd;->c:Ljava/util/List;

    .line 246
    .line 247
    new-instance v7, La/ssd;

    .line 248
    .line 249
    invoke-direct {v7, v6, v6, v4}, La/ssd;-><init>(La/mcy;La/mcy;Ljava/util/List;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v0, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_7
    iget-object v2, p1, La/vff0;->h:La/vby;

    .line 257
    .line 258
    new-instance v4, La/inv;

    .line 259
    .line 260
    sget-object v5, La/ysm0;->a:La/ysm0;

    .line 261
    .line 262
    sget-object v6, La/ssd;->Companion:La/rsd;

    .line 263
    .line 264
    invoke-virtual {v6}, La/rsd;->serializer()La/jiy;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-direct {v4, v5, v6, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v4, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    iget-object v3, p1, La/vff0;->c:La/q7d0;

    .line 276
    .line 277
    invoke-virtual {v3, v1, v2}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iput-object v0, p1, La/vff0;->q:Ljava/util/LinkedHashMap;

    .line 281
    .line 282
    iget-object p1, p1, La/vff0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 289
    .line 290
    .line 291
    :goto_4
    sget-object p1, La/n5q;->a:La/n5q;

    .line 292
    .line 293
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 298
    .line 299
    .line 300
    return-void
.end method
