.class public final synthetic La/rto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:La/ctf0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/d3h0;

.field public final synthetic f:La/anq0;

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/d3h0;La/anq0;Ljava/lang/String;ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p5, p0, La/rto;->a:Z

    iput-boolean p6, p0, La/rto;->b:Z

    iput-object p1, p0, La/rto;->c:La/ctf0;

    iput-object p4, p0, La/rto;->d:Ljava/lang/String;

    iput-object p2, p0, La/rto;->e:La/d3h0;

    iput-object p3, p0, La/rto;->f:La/anq0;

    iput-boolean p7, p0, La/rto;->g:Z

    iput-boolean p8, p0, La/rto;->h:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/bnk0;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, v0, La/bnk0;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-boolean v2, p0, La/rto;->a:Z

    .line 11
    .line 12
    iget-object v7, p0, La/rto;->c:La/ctf0;

    .line 13
    .line 14
    iget-object v8, p0, La/rto;->f:La/anq0;

    .line 15
    .line 16
    if-eqz v2, :cond_5

    .line 17
    .line 18
    iget-boolean v2, p0, La/rto;->b:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-array p0, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p1, v7, La/ctf0;->b:La/lsm0;

    .line 25
    .line 26
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const v1, 0x7f130920

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1, p0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v5, 0x0

    .line 38
    const/16 v6, 0x36

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    const v3, 0x7f0606e1

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :cond_0
    iget-object v1, p0, La/rto;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-lez v2, :cond_1

    .line 57
    .line 58
    invoke-static {v0}, La/pzb;->G(La/bnk0;)V

    .line 59
    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const/16 v6, 0x36

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    const v3, 0x7f0606e1

    .line 66
    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v1, p0, La/rto;->e:La/d3h0;

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    instance-of v2, v1, La/pz10;

    .line 77
    .line 78
    iget-boolean p0, p0, La/rto;->h:Z

    .line 79
    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    check-cast v1, La/pz10;

    .line 83
    .line 84
    invoke-static {v0, v1, p0}, La/pzb;->Y(La/bnk0;La/pz10;Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    instance-of v2, v1, La/izm0;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    move-object v9, v1

    .line 93
    check-cast v9, La/izm0;

    .line 94
    .line 95
    invoke-interface {v9}, La/izm0;->d()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    const/4 v2, 0x1

    .line 104
    if-le v1, v2, :cond_3

    .line 105
    .line 106
    invoke-static {v0}, La/pzb;->G(La/bnk0;)V

    .line 107
    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    const/16 v6, 0x36

    .line 111
    .line 112
    const-string v1, "("

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    const v3, 0x7f0606e1

    .line 116
    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v9, p0}, La/pzb;->h0(La/bnk0;La/izm0;Z)V

    .line 123
    .line 124
    .line 125
    const-string v1, ")"

    .line 126
    .line 127
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 128
    .line 129
    .line 130
    :cond_3
    :goto_0
    iget-wide v1, v8, La/anq0;->e:J

    .line 131
    .line 132
    const-wide/16 v3, 0x0

    .line 133
    .line 134
    cmp-long p0, v1, v3

    .line 135
    .line 136
    if-eqz p0, :cond_8

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-nez p0, :cond_4

    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    const/16 v6, 0x36

    .line 146
    .line 147
    const-string v1, ". "

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    const v3, 0x7f0606e1

    .line 151
    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 155
    .line 156
    .line 157
    :cond_4
    invoke-static {v8, v7}, La/pzb;->I(La/anq0;La/ctf0;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const/4 v5, 0x0

    .line 162
    const/16 v6, 0x36

    .line 163
    .line 164
    const/4 v2, 0x0

    .line 165
    const v3, 0x7f0606e1

    .line 166
    .line 167
    .line 168
    const/4 v4, 0x0

    .line 169
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 170
    .line 171
    .line 172
    const-string v1, " "

    .line 173
    .line 174
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 175
    .line 176
    .line 177
    invoke-static {v8}, La/pzb;->V(La/anq0;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    sget-object v2, La/rdj;->a:La/rdj;

    .line 186
    .line 187
    iget-wide v2, v8, La/anq0;->f:J

    .line 188
    .line 189
    sget-object v4, La/efj;->c:La/efj;

    .line 190
    .line 191
    new-instance v5, La/znq0;

    .line 192
    .line 193
    invoke-direct {v5, v2, v3}, La/znq0;-><init>(J)V

    .line 194
    .line 195
    .line 196
    iget-boolean p0, p0, La/rto;->g:Z

    .line 197
    .line 198
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    const/16 v2, 0x38

    .line 203
    .line 204
    invoke-static {v5, v4, p0, v1, v2}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const/4 v5, 0x0

    .line 209
    const/16 v6, 0x36

    .line 210
    .line 211
    const/4 v2, 0x0

    .line 212
    const v3, 0x7f0606e1

    .line 213
    .line 214
    .line 215
    const/4 v4, 0x0

    .line 216
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-nez p0, :cond_6

    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    const/16 v6, 0x36

    .line 227
    .line 228
    const-string v1, ". "

    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    const v3, 0x7f0606e1

    .line 232
    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 236
    .line 237
    .line 238
    :cond_6
    invoke-static {v8, v7}, La/pzb;->H(La/anq0;La/ctf0;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    const/4 v5, 0x0

    .line 243
    const/16 v6, 0x36

    .line 244
    .line 245
    const/4 v2, 0x0

    .line 246
    const v3, 0x7f0606e1

    .line 247
    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result p0

    .line 257
    if-nez p0, :cond_7

    .line 258
    .line 259
    const/4 v5, 0x0

    .line 260
    const/16 v6, 0x36

    .line 261
    .line 262
    const-string v1, " "

    .line 263
    .line 264
    const/4 v2, 0x0

    .line 265
    const v3, 0x7f0606e1

    .line 266
    .line 267
    .line 268
    const/4 v4, 0x0

    .line 269
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 270
    .line 271
    .line 272
    :cond_7
    invoke-static {v8}, La/pzb;->U(La/anq0;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    const/4 v5, 0x0

    .line 277
    const/16 v6, 0x36

    .line 278
    .line 279
    const/4 v2, 0x0

    .line 280
    const v3, 0x7f0606e1

    .line 281
    .line 282
    .line 283
    const/4 v4, 0x0

    .line 284
    invoke-static/range {v0 .. v6}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 285
    .line 286
    .line 287
    :cond_8
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object p0
.end method
