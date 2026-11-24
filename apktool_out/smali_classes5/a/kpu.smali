.class public final La/kpu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;

.field public final b:La/kki;

.field public final c:La/wtt;


# direct methods
.method public constructor <init>(La/pru;La/kki;La/wtt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/kpu;->a:La/pru;

    .line 5
    .line 6
    iput-object p2, p0, La/kpu;->b:La/kki;

    .line 7
    .line 8
    iput-object p3, p0, La/kpu;->c:La/wtt;

    .line 9
    .line 10
    return-void
.end method

.method public static a(La/soc0;)La/etc0;
    .locals 3

    .line 1
    sget-object v0, La/zuc0;->f:La/zuc0;

    .line 2
    .line 3
    new-instance v1, La/etc0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, v0, v2, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 7
    .line 8
    .line 9
    return-object v1
.end method


# virtual methods
.method public final b(ZZZLa/zje;)Ljava/io/Serializable;
    .locals 7

    .line 1
    instance-of v0, p4, La/jpu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/jpu;

    .line 7
    .line 8
    iget v1, v0, La/jpu;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/jpu;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/jpu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/jpu;-><init>(La/kpu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/jpu;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/jpu;->p:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-boolean p2, v0, La/jpu;->j:Z

    .line 37
    .line 38
    iget-boolean p1, v0, La/jpu;->i:Z

    .line 39
    .line 40
    iget-object p0, v0, La/jpu;->m:La/toc0;

    .line 41
    .line 42
    iget-object p3, v0, La/jpu;->l:La/lc00;

    .line 43
    .line 44
    iget-object v0, v0, La/jpu;->k:La/lc00;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p4

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    iget-object v2, p0, La/kpu;->a:La/pru;

    .line 68
    .line 69
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-object v4, v2, La/sff0;->l:La/toc0;

    .line 74
    .line 75
    iget-object v5, p0, La/kpu;->c:La/wtt;

    .line 76
    .line 77
    invoke-virtual {v5}, La/wtt;->a()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    iget-boolean v6, v4, La/toc0;->y:Z

    .line 82
    .line 83
    if-eqz v6, :cond_3

    .line 84
    .line 85
    sget-object v6, La/soc0;->c:La/soc0;

    .line 86
    .line 87
    invoke-static {v6}, La/kpu;->a(La/soc0;)La/etc0;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {p4, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_3
    iget-boolean v2, v2, La/sff0;->U:Z

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    sget-object v2, La/soc0;->k:La/soc0;

    .line 99
    .line 100
    invoke-static {v2}, La/kpu;->a(La/soc0;)La/etc0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {p4, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-boolean v2, v4, La/toc0;->a:Z

    .line 108
    .line 109
    if-eqz v2, :cond_7

    .line 110
    .line 111
    if-nez v5, :cond_7

    .line 112
    .line 113
    if-eqz p3, :cond_7

    .line 114
    .line 115
    :try_start_1
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 116
    .line 117
    iget-object p0, p0, La/kpu;->b:La/kki;

    .line 118
    .line 119
    iput-object p4, v0, La/jpu;->k:La/lc00;

    .line 120
    .line 121
    iput-object p4, v0, La/jpu;->l:La/lc00;

    .line 122
    .line 123
    iput-object v4, v0, La/jpu;->m:La/toc0;

    .line 124
    .line 125
    iput-boolean p1, v0, La/jpu;->i:Z

    .line 126
    .line 127
    iput-boolean p2, v0, La/jpu;->j:Z

    .line 128
    .line 129
    iput v3, v0, La/jpu;->p:I

    .line 130
    .line 131
    invoke-virtual {p0, v0}, La/kki;->o(La/zje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    if-ne p0, v1, :cond_5

    .line 136
    .line 137
    return-object v1

    .line 138
    :cond_5
    move-object p3, p4

    .line 139
    move-object v0, p3

    .line 140
    move-object p4, p0

    .line 141
    move-object p0, v4

    .line 142
    :goto_1
    :try_start_2
    check-cast p4, Ljava/util/List;

    .line 143
    .line 144
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    .line 146
    :goto_2
    move-object v4, p0

    .line 147
    goto :goto_4

    .line 148
    :catchall_1
    move-exception p0

    .line 149
    move-object p3, p4

    .line 150
    move-object v0, p3

    .line 151
    move-object p4, p0

    .line 152
    move-object p0, v4

    .line 153
    :goto_3
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 154
    .line 155
    new-instance v1, La/g0g0;

    .line 156
    .line 157
    invoke-direct {v1, p4}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object p4, v1

    .line 161
    goto :goto_2

    .line 162
    :goto_4
    instance-of p0, p4, La/g0g0;

    .line 163
    .line 164
    if-nez p0, :cond_6

    .line 165
    .line 166
    check-cast p4, Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_6

    .line 173
    .line 174
    sget-object p0, La/soc0;->j:La/soc0;

    .line 175
    .line 176
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-interface {p3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :cond_6
    move-object p4, p3

    .line 184
    goto :goto_5

    .line 185
    :cond_7
    move-object v0, p4

    .line 186
    :goto_5
    iget-boolean p0, v4, La/toc0;->g:Z

    .line 187
    .line 188
    if-eqz p0, :cond_8

    .line 189
    .line 190
    sget-object p0, La/soc0;->b:La/soc0;

    .line 191
    .line 192
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    :cond_8
    iget-boolean p0, v4, La/toc0;->j:Z

    .line 200
    .line 201
    if-eqz p0, :cond_9

    .line 202
    .line 203
    sget-object p0, La/soc0;->d:La/soc0;

    .line 204
    .line 205
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_9
    if-eqz p1, :cond_a

    .line 213
    .line 214
    sget-object p0, La/soc0;->e:La/soc0;

    .line 215
    .line 216
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    :cond_a
    iget-boolean p0, v4, La/toc0;->l:Z

    .line 224
    .line 225
    if-eqz p0, :cond_b

    .line 226
    .line 227
    sget-object p0, La/soc0;->f:La/soc0;

    .line 228
    .line 229
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    :cond_b
    iget-boolean p0, v4, La/toc0;->b:Z

    .line 237
    .line 238
    if-eqz p0, :cond_c

    .line 239
    .line 240
    sget-object p0, La/soc0;->g:La/soc0;

    .line 241
    .line 242
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    :cond_c
    iget-boolean p0, v4, La/toc0;->m:Z

    .line 250
    .line 251
    if-eqz p0, :cond_d

    .line 252
    .line 253
    sget-object p0, La/soc0;->h:La/soc0;

    .line 254
    .line 255
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    :cond_d
    if-eqz p2, :cond_e

    .line 263
    .line 264
    sget-object p0, La/soc0;->i:La/soc0;

    .line 265
    .line 266
    invoke-static {p0}, La/kpu;->a(La/soc0;)La/etc0;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    :cond_e
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0
.end method
