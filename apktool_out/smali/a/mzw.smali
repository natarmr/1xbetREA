.class public final La/mzw;
.super La/fot0;
.source "SourceFile"


# static fields
.field public static final C:La/jzw;


# instance fields
.field public A:La/uii0;

.field public final B:La/g2v;

.field public final r:I

.field public final s:Ljava/util/concurrent/atomic/AtomicReference;

.field public final t:I

.field public u:I

.field public v:Landroid/util/Rational;

.field public final w:La/r7h0;

.field public x:La/tii0;

.field public y:La/dgu;

.field public z:La/ito0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/jzw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/mzw;->C:La/jzw;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/nzw;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, La/fot0;-><init>(La/fpt0;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    iput p1, p0, La/mzw;->u:I

    .line 14
    .line 15
    iput-object v0, p0, La/mzw;->v:Landroid/util/Rational;

    .line 16
    .line 17
    new-instance p1, La/g2v;

    .line 18
    .line 19
    invoke-direct {p1, p0}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/mzw;->B:La/g2v;

    .line 23
    .line 24
    iget-object p1, p0, La/fot0;->i:La/fpt0;

    .line 25
    .line 26
    check-cast p1, La/nzw;

    .line 27
    .line 28
    sget-object v1, La/nzw;->b:La/u15;

    .line 29
    .line 30
    invoke-interface {p1, v1}, La/qae0;->f(La/u15;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {p1, v1}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, La/mzw;->r:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v1, 0x1

    .line 50
    iput v1, p0, La/mzw;->r:I

    .line 51
    .line 52
    :goto_0
    sget-object v1, La/nzw;->i:La/u15;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {p1, v1, v2}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iput v1, p0, La/mzw;->t:I

    .line 70
    .line 71
    sget-object v1, La/nzw;->k:La/u15;

    .line 72
    .line 73
    invoke-interface {p1, v1, v0}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/kzw;

    .line 78
    .line 79
    new-instance v0, La/r7h0;

    .line 80
    .line 81
    invoke-direct {v0, p1}, La/r7h0;-><init>(La/kzw;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/mzw;->w:La/r7h0;

    .line 85
    .line 86
    return-void
.end method

.method public static J(ILjava/util/List;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method


# virtual methods
.method public final A()V
    .locals 1

    .line 1
    iget-object v0, p0, La/mzw;->w:La/r7h0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/r7h0;->c()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, La/r7h0;->b()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/mzw;->z:La/ito0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/ito0;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, La/mzw;->G(Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0}, La/fot0;->e()La/ry9;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0, v0}, La/ry9;->k(La/kzw;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final G(Z)V
    .locals 2

    .line 1
    const-string v0, "ImageCapture"

    .line 2
    .line 3
    const-string v1, "clearPipeline"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-static {}, La/ofm0;->m()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/mzw;->A:La/uii0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, La/uii0;->b()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, La/mzw;->A:La/uii0;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, La/mzw;->y:La/dgu;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, La/dgu;->d()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, La/mzw;->y:La/dgu;

    .line 29
    .line 30
    :cond_1
    if-nez p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, La/mzw;->z:La/ito0;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, La/ito0;->b()V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, La/mzw;->z:La/ito0;

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, La/fot0;->e()La/ry9;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, La/ry9;->a()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final H(Ljava/lang/String;La/nzw;La/h55;)La/tii0;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {}, La/ofm0;->m()V

    .line 7
    .line 8
    .line 9
    const-string v2, "ImageCapture"

    .line 10
    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "createPipeline(cameraId: "

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, ", streamSpec: "

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, ")"

    .line 30
    .line 31
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iget-object p1, p3, La/h55;->a:Landroid/util/Size;

    .line 42
    .line 43
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-interface {v2}, La/s0a;->q()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x1

    .line 55
    xor-int/2addr v2, v3

    .line 56
    iget-object v4, p0, La/mzw;->y:La/dgu;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    invoke-static {v5, v2}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    iget-object v4, p0, La/mzw;->y:La/dgu;

    .line 65
    .line 66
    invoke-virtual {v4}, La/dgu;->d()V

    .line 67
    .line 68
    .line 69
    :cond_0
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v4}, La/s0a;->a()La/j0a;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const/4 v6, 0x3

    .line 78
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    instance-of v8, v4, La/zo;

    .line 87
    .line 88
    const/16 v9, 0x1005

    .line 89
    .line 90
    if-nez v8, :cond_2

    .line 91
    .line 92
    :cond_1
    :goto_0
    move-object v11, v5

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    move-object v8, v4

    .line 95
    check-cast v8, La/zo;

    .line 96
    .line 97
    iget-object v8, v8, La/zo;->c:La/hy9;

    .line 98
    .line 99
    sget-object v10, La/hy9;->H:La/u15;

    .line 100
    .line 101
    sget-object v11, La/ipt0;->a:La/gpt0;

    .line 102
    .line 103
    invoke-interface {v8, v10, v11}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, La/ipt0;

    .line 108
    .line 109
    sget-object v10, La/hpt0;->a:La/hpt0;

    .line 110
    .line 111
    invoke-interface {v8, v10, v3}, La/ipt0;->a(La/hpt0;I)La/drd;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    if-eqz v8, :cond_1

    .line 116
    .line 117
    sget-object v10, La/w0x;->r0:La/u15;

    .line 118
    .line 119
    check-cast v8, La/b780;

    .line 120
    .line 121
    iget-object v11, v8, La/b780;->a:Ljava/util/TreeMap;

    .line 122
    .line 123
    invoke-virtual {v11, v10}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-nez v11, :cond_3

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    new-instance v11, Ljava/util/HashSet;

    .line 131
    .line 132
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8, v10}, La/b780;->d(La/u15;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    check-cast v8, Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_5

    .line 153
    .line 154
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    check-cast v10, Landroid/util/Pair;

    .line 159
    .line 160
    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v10, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    if-ne v10, v9, :cond_4

    .line 169
    .line 170
    invoke-virtual {v11, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_5
    :goto_1
    const/4 v8, 0x2

    .line 174
    if-eqz v11, :cond_6

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_6
    new-instance v11, Ljava/util/HashSet;

    .line 178
    .line 179
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v11, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    if-eqz v4, :cond_7

    .line 186
    .line 187
    move-object v10, v4

    .line 188
    check-cast v10, La/n0a;

    .line 189
    .line 190
    invoke-interface {v10}, La/n0a;->G()Ljava/util/Set;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    goto :goto_2

    .line 203
    :cond_7
    move v9, v0

    .line 204
    :goto_2
    if-eqz v9, :cond_8

    .line 205
    .line 206
    invoke-virtual {v11, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    :cond_8
    if-eqz v4, :cond_9

    .line 210
    .line 211
    check-cast v4, La/n0a;

    .line 212
    .line 213
    invoke-interface {v4}, La/n0a;->s()Ljava/util/Set;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-nez v7, :cond_a

    .line 222
    .line 223
    :cond_9
    move v4, v0

    .line 224
    goto :goto_3

    .line 225
    :cond_a
    invoke-interface {v4}, La/n0a;->G()Ljava/util/Set;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    const/16 v7, 0x20

    .line 230
    .line 231
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    :goto_3
    if-eqz v4, :cond_b

    .line 240
    .line 241
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-virtual {v11, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {v11, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    :cond_b
    :goto_4
    iget-object v4, p0, La/fot0;->i:La/fpt0;

    .line 252
    .line 253
    sget-object v6, La/nzw;->f:La/u15;

    .line 254
    .line 255
    invoke-interface {v4, v6, v1}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    check-cast v4, Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-interface {v11, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    new-instance v7, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v9, "The specified output format ("

    .line 271
    .line 272
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object v9, p0, La/fot0;->i:La/fpt0;

    .line 276
    .line 277
    invoke-interface {v9, v6, v1}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    check-cast v1, Ljava/lang/Integer;

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const-string v1, ") is not supported by current configuration. Supported output formats: "

    .line 294
    .line 295
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-static {v1, v4}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 306
    .line 307
    .line 308
    iget-object v1, p0, La/fot0;->i:La/fpt0;

    .line 309
    .line 310
    sget-object v4, La/nzw;->l:La/u15;

    .line 311
    .line 312
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 313
    .line 314
    invoke-interface {v1, v4, v6}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_c

    .line 325
    .line 326
    invoke-virtual {p2}, La/nzw;->k()I

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-interface {v1}, La/s0a;->e()La/hy9;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-interface {v1}, La/hy9;->o()V

    .line 338
    .line 339
    .line 340
    :cond_c
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    if-eqz v1, :cond_d

    .line 345
    .line 346
    :try_start_0
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-interface {v1}, La/s0a;->h()La/n0a;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-interface {v1}, La/n0a;->j()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    instance-of v4, v1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 359
    .line 360
    if-eqz v4, :cond_d

    .line 361
    .line 362
    check-cast v1, Landroid/hardware/camera2/CameraCharacteristics;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 363
    .line 364
    move-object v5, v1

    .line 365
    goto :goto_5

    .line 366
    :catch_0
    move-exception v1

    .line 367
    const-string v4, "ImageCapture"

    .line 368
    .line 369
    const-string v6, "getCameraCharacteristics failed"

    .line 370
    .line 371
    invoke-static {v4, v6, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 372
    .line 373
    .line 374
    :cond_d
    :goto_5
    new-instance v1, La/dgu;

    .line 375
    .line 376
    invoke-direct {v1, p2, p1, v5, v2}, La/dgu;-><init>(La/nzw;Landroid/util/Size;Landroid/hardware/camera2/CameraCharacteristics;Z)V

    .line 377
    .line 378
    .line 379
    iput-object v1, p0, La/mzw;->y:La/dgu;

    .line 380
    .line 381
    iget-object p1, p0, La/mzw;->z:La/ito0;

    .line 382
    .line 383
    if-nez p1, :cond_e

    .line 384
    .line 385
    iget-object p1, p0, La/fot0;->i:La/fpt0;

    .line 386
    .line 387
    sget-object p2, La/fpt0;->R0:La/u15;

    .line 388
    .line 389
    new-instance v1, La/dpt0;

    .line 390
    .line 391
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-interface {p1, p2, v1}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    check-cast p1, La/dpt0;

    .line 399
    .line 400
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    iget-object p1, p0, La/mzw;->B:La/g2v;

    .line 404
    .line 405
    new-instance p2, La/ito0;

    .line 406
    .line 407
    invoke-direct {p2, p1}, La/ito0;-><init>(La/g2v;)V

    .line 408
    .line 409
    .line 410
    iput-object p2, p0, La/mzw;->z:La/ito0;

    .line 411
    .line 412
    move-object p1, p2

    .line 413
    :cond_e
    iget-object p2, p0, La/mzw;->y:La/dgu;

    .line 414
    .line 415
    invoke-static {}, La/ofm0;->m()V

    .line 416
    .line 417
    .line 418
    iput-object p2, p1, La/ito0;->c:La/dgu;

    .line 419
    .line 420
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {}, La/ofm0;->m()V

    .line 424
    .line 425
    .line 426
    iget-object p2, p2, La/dgu;->c:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast p2, La/esg0;

    .line 429
    .line 430
    invoke-static {}, La/ofm0;->m()V

    .line 431
    .line 432
    .line 433
    iget-object v1, p2, La/esg0;->b:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v1, La/ibe0;

    .line 436
    .line 437
    if-eqz v1, :cond_f

    .line 438
    .line 439
    move v1, v3

    .line 440
    goto :goto_6

    .line 441
    :cond_f
    move v1, v0

    .line 442
    :goto_6
    const-string v2, "The ImageReader is not initialized."

    .line 443
    .line 444
    invoke-static {v2, v1}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 445
    .line 446
    .line 447
    iget-object p2, p2, La/esg0;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast p2, La/ibe0;

    .line 450
    .line 451
    iget-object v1, p2, La/ibe0;->c:Ljava/lang/Object;

    .line 452
    .line 453
    monitor-enter v1

    .line 454
    :try_start_1
    iput-object p1, p2, La/ibe0;->f:Ljava/lang/Object;

    .line 455
    .line 456
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 457
    iget-object p1, p0, La/mzw;->y:La/dgu;

    .line 458
    .line 459
    iget-object p2, p3, La/h55;->a:Landroid/util/Size;

    .line 460
    .line 461
    iget-object v1, p1, La/dgu;->a:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v1, La/nzw;

    .line 464
    .line 465
    invoke-static {v1, p2}, La/tii0;->d(La/fpt0;Landroid/util/Size;)La/tii0;

    .line 466
    .line 467
    .line 468
    move-result-object p2

    .line 469
    iget-object p1, p1, La/dgu;->d:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast p1, La/r15;

    .line 472
    .line 473
    iget-object v1, p1, La/r15;->c:La/o3x;

    .line 474
    .line 475
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    sget-object v2, La/agn;->d:La/agn;

    .line 479
    .line 480
    invoke-static {v1}, La/a55;->a(La/hzj;)La/gr00;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    iput-object v2, v1, La/gr00;->e:Ljava/lang/Object;

    .line 485
    .line 486
    invoke-virtual {v1}, La/gr00;->g()La/a55;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    iget-object v4, p2, La/sii0;->a:Ljava/util/LinkedHashSet;

    .line 491
    .line 492
    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    iget-object v1, p1, La/r15;->h:Ljava/util/ArrayList;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-le v1, v3, :cond_10

    .line 502
    .line 503
    iget-object v1, p1, La/r15;->d:La/o3x;

    .line 504
    .line 505
    if-eqz v1, :cond_10

    .line 506
    .line 507
    invoke-static {v1}, La/a55;->a(La/hzj;)La/gr00;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    iput-object v2, v1, La/gr00;->e:Ljava/lang/Object;

    .line 512
    .line 513
    invoke-virtual {v1}, La/gr00;->g()La/a55;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    iget-object v2, p2, La/sii0;->a:Ljava/util/LinkedHashSet;

    .line 518
    .line 519
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    :cond_10
    iget-object p1, p1, La/r15;->e:La/o3x;

    .line 523
    .line 524
    if-eqz p1, :cond_11

    .line 525
    .line 526
    invoke-static {p1}, La/a55;->a(La/hzj;)La/gr00;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-virtual {p1}, La/gr00;->g()La/a55;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    iput-object p1, p2, La/sii0;->i:La/a55;

    .line 535
    .line 536
    :cond_11
    iget p1, p3, La/h55;->d:I

    .line 537
    .line 538
    iput p1, p2, La/sii0;->h:I

    .line 539
    .line 540
    iget p1, p0, La/mzw;->r:I

    .line 541
    .line 542
    if-ne p1, v8, :cond_12

    .line 543
    .line 544
    iget-boolean p1, p3, La/h55;->g:Z

    .line 545
    .line 546
    if-nez p1, :cond_12

    .line 547
    .line 548
    invoke-virtual {p0}, La/fot0;->e()La/ry9;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    invoke-interface {p1, p2}, La/ry9;->b(La/tii0;)V

    .line 553
    .line 554
    .line 555
    :cond_12
    iget-object p1, p3, La/h55;->f:La/drd;

    .line 556
    .line 557
    if-eqz p1, :cond_13

    .line 558
    .line 559
    iget-object p3, p2, La/sii0;->b:La/ucs0;

    .line 560
    .line 561
    invoke-virtual {p3, p1}, La/ucs0;->g(La/drd;)V

    .line 562
    .line 563
    .line 564
    :cond_13
    iget-object p1, p0, La/mzw;->A:La/uii0;

    .line 565
    .line 566
    if-eqz p1, :cond_14

    .line 567
    .line 568
    invoke-virtual {p1}, La/uii0;->b()V

    .line 569
    .line 570
    .line 571
    :cond_14
    new-instance p1, La/uii0;

    .line 572
    .line 573
    new-instance p3, La/izw;

    .line 574
    .line 575
    invoke-direct {p3, p0, v0}, La/izw;-><init>(Ljava/lang/Object;B)V

    .line 576
    .line 577
    .line 578
    invoke-direct {p1, p3}, La/uii0;-><init>(La/vii0;)V

    .line 579
    .line 580
    .line 581
    iput-object p1, p0, La/mzw;->A:La/uii0;

    .line 582
    .line 583
    iput-object p1, p2, La/sii0;->f:La/uii0;

    .line 584
    .line 585
    return-object p2

    .line 586
    :catchall_0
    move-exception p0

    .line 587
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 588
    throw p0
.end method

.method public final I()I
    .locals 3

    .line 1
    iget-object v0, p0, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, La/mzw;->u:I

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, La/fot0;->i:La/fpt0;

    .line 11
    .line 12
    check-cast p0, La/nzw;

    .line 13
    .line 14
    sget-object v1, La/nzw;->c:La/u15;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {p0, v1, v2}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :goto_0
    monitor-exit v0

    .line 32
    return v1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
.end method

.method public final K(Ljava/util/concurrent/Executor;La/mz9;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eq v1, v3, :cond_0

    .line 14
    .line 15
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v3, La/b1;

    .line 20
    .line 21
    const/16 v4, 0x12

    .line 22
    .line 23
    move-object/from16 v5, p1

    .line 24
    .line 25
    invoke-direct {v3, v0, v5, v2, v4}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    check-cast v1, La/lmv;

    .line 29
    .line 30
    invoke-virtual {v1, v3}, La/lmv;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    move-object/from16 v5, p1

    .line 35
    .line 36
    invoke-static {}, La/ofm0;->m()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, La/mzw;->I()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v3, 0x3

    .line 44
    if-ne v1, v3, :cond_2

    .line 45
    .line 46
    iget-object v1, v0, La/mzw;->w:La/r7h0;

    .line 47
    .line 48
    iget-object v1, v1, La/r7h0;->a:La/kzw;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const-string v0, "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    :goto_0
    const-string v1, "ImageCapture"

    .line 60
    .line 61
    const-string v3, "takePictureInternal"

    .line 62
    .line 63
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, La/fot0;->d()La/s0a;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/4 v3, 0x0

    .line 71
    if-eqz v1, :cond_10

    .line 72
    .line 73
    iget-boolean v4, v0, La/fot0;->a:Z

    .line 74
    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :cond_3
    iget-object v4, v0, La/fot0;->i:La/fpt0;

    .line 80
    .line 81
    sget-object v6, La/h0x;->i0:La/u15;

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-interface {v4, v6, v8}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const/4 v6, 0x1

    .line 99
    if-eqz v4, :cond_4

    .line 100
    .line 101
    move v8, v6

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move v8, v7

    .line 104
    :goto_1
    iget-object v10, v0, La/mzw;->z:La/ito0;

    .line 105
    .line 106
    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    iget-object v4, v0, La/fot0;->l:Landroid/graphics/Rect;

    .line 110
    .line 111
    invoke-virtual {v0}, La/fot0;->c()Landroid/util/Size;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    if-eqz v4, :cond_5

    .line 119
    .line 120
    move-object v3, v4

    .line 121
    const/16 v16, 0x2

    .line 122
    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_5
    iget-object v4, v0, La/mzw;->v:Landroid/util/Rational;

    .line 126
    .line 127
    if-eqz v4, :cond_9

    .line 128
    .line 129
    invoke-virtual {v4}, Landroid/util/Rational;->floatValue()F

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    const/4 v13, 0x0

    .line 134
    cmpl-float v12, v12, v13

    .line 135
    .line 136
    if-lez v12, :cond_9

    .line 137
    .line 138
    invoke-virtual {v4}, Landroid/util/Rational;->isNaN()Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-nez v4, :cond_9

    .line 143
    .line 144
    invoke-virtual {v0}, La/fot0;->d()La/s0a;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v4, v7}, La/fot0;->i(La/s0a;Z)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    new-instance v12, Landroid/util/Rational;

    .line 156
    .line 157
    iget-object v14, v0, La/mzw;->v:Landroid/util/Rational;

    .line 158
    .line 159
    invoke-virtual {v14}, Landroid/util/Rational;->getDenominator()I

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    iget-object v15, v0, La/mzw;->v:Landroid/util/Rational;

    .line 164
    .line 165
    invoke-virtual {v15}, Landroid/util/Rational;->getNumerator()I

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    invoke-direct {v12, v14, v15}, Landroid/util/Rational;-><init>(II)V

    .line 170
    .line 171
    .line 172
    invoke-static {v4}, La/jls0;->c(I)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    iget-object v12, v0, La/mzw;->v:Landroid/util/Rational;

    .line 180
    .line 181
    :goto_2
    if-eqz v12, :cond_8

    .line 182
    .line 183
    invoke-virtual {v12}, Landroid/util/Rational;->floatValue()F

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    cmpl-float v4, v4, v13

    .line 188
    .line 189
    if-lez v4, :cond_8

    .line 190
    .line 191
    invoke-virtual {v12}, Landroid/util/Rational;->isNaN()Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_8

    .line 196
    .line 197
    invoke-virtual {v9}, Landroid/util/Size;->getWidth()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    int-to-float v9, v3

    .line 206
    int-to-float v13, v4

    .line 207
    div-float v14, v9, v13

    .line 208
    .line 209
    invoke-virtual {v12}, Landroid/util/Rational;->getNumerator()I

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    const/16 v16, 0x2

    .line 214
    .line 215
    invoke-virtual {v12}, Landroid/util/Rational;->getDenominator()I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    invoke-virtual {v12}, Landroid/util/Rational;->floatValue()F

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    cmpl-float v12, v12, v14

    .line 224
    .line 225
    if-lez v12, :cond_7

    .line 226
    .line 227
    int-to-float v12, v15

    .line 228
    div-float/2addr v9, v12

    .line 229
    int-to-float v11, v11

    .line 230
    mul-float/2addr v9, v11

    .line 231
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    sub-int/2addr v4, v9

    .line 236
    div-int/lit8 v4, v4, 0x2

    .line 237
    .line 238
    move v11, v9

    .line 239
    move v9, v3

    .line 240
    move v3, v7

    .line 241
    goto :goto_3

    .line 242
    :cond_7
    int-to-float v9, v11

    .line 243
    div-float/2addr v13, v9

    .line 244
    int-to-float v9, v15

    .line 245
    mul-float/2addr v13, v9

    .line 246
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    sub-int/2addr v3, v9

    .line 251
    div-int/lit8 v3, v3, 0x2

    .line 252
    .line 253
    move v11, v4

    .line 254
    move v4, v7

    .line 255
    :goto_3
    new-instance v12, Landroid/graphics/Rect;

    .line 256
    .line 257
    add-int/2addr v9, v3

    .line 258
    add-int/2addr v11, v4

    .line 259
    invoke-direct {v12, v3, v4, v9, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 260
    .line 261
    .line 262
    move-object v3, v12

    .line 263
    goto :goto_4

    .line 264
    :cond_8
    const/16 v16, 0x2

    .line 265
    .line 266
    const-string v4, "ImageUtil"

    .line 267
    .line 268
    const-string v9, "Invalid view ratio."

    .line 269
    .line 270
    invoke-static {v4, v9}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :goto_4
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_9
    const/16 v16, 0x2

    .line 278
    .line 279
    new-instance v4, Landroid/graphics/Rect;

    .line 280
    .line 281
    invoke-virtual {v9}, Landroid/util/Size;->getWidth()I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    invoke-direct {v4, v7, v7, v3, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 290
    .line 291
    .line 292
    move-object v3, v4

    .line 293
    :goto_5
    iget-object v4, v0, La/fot0;->m:Landroid/graphics/Matrix;

    .line 294
    .line 295
    invoke-virtual {v0, v1, v7}, La/fot0;->i(La/s0a;Z)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    iget-object v9, v0, La/fot0;->i:La/fpt0;

    .line 300
    .line 301
    check-cast v9, La/nzw;

    .line 302
    .line 303
    sget-object v11, La/nzw;->j:La/u15;

    .line 304
    .line 305
    invoke-interface {v9, v11}, La/qae0;->f(La/u15;)Z

    .line 306
    .line 307
    .line 308
    move-result v12

    .line 309
    if-eqz v12, :cond_a

    .line 310
    .line 311
    invoke-interface {v9, v11}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    check-cast v9, Ljava/lang/Integer;

    .line 316
    .line 317
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    goto :goto_7

    .line 322
    :cond_a
    iget v9, v0, La/mzw;->r:I

    .line 323
    .line 324
    if-eqz v9, :cond_d

    .line 325
    .line 326
    if-eq v9, v6, :cond_c

    .line 327
    .line 328
    move/from16 v11, v16

    .line 329
    .line 330
    if-ne v9, v11, :cond_b

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_b
    const-string v0, "CaptureMode "

    .line 334
    .line 335
    const-string v1, " is invalid"

    .line 336
    .line 337
    invoke-static {v9, v0, v1}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :cond_c
    :goto_6
    const/16 v9, 0x5f

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_d
    const/16 v9, 0x64

    .line 349
    .line 350
    :goto_7
    iget-object v11, v0, La/mzw;->x:La/tii0;

    .line 351
    .line 352
    iget-object v11, v11, La/sii0;->e:Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    if-nez v2, :cond_e

    .line 359
    .line 360
    move v7, v6

    .line 361
    :cond_e
    xor-int/2addr v6, v7

    .line 362
    const-string v7, "One and only one on-disk or in-memory callback should be present."

    .line 363
    .line 364
    invoke-static {v7, v6}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 365
    .line 366
    .line 367
    new-instance v6, La/o55;

    .line 368
    .line 369
    iget v7, v0, La/mzw;->r:I

    .line 370
    .line 371
    move-object v0, v5

    .line 372
    move v5, v1

    .line 373
    move-object v1, v0

    .line 374
    move-object v0, v6

    .line 375
    move v6, v9

    .line 376
    move-object v9, v11

    .line 377
    invoke-direct/range {v0 .. v9}, La/o55;-><init>(Ljava/util/concurrent/Executor;La/mz9;Landroid/graphics/Rect;Landroid/graphics/Matrix;IIIZLjava/util/List;)V

    .line 378
    .line 379
    .line 380
    if-eqz v8, :cond_f

    .line 381
    .line 382
    const/16 v1, 0x20

    .line 383
    .line 384
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 389
    .line 390
    iget-object v3, v0, La/o55;->b:Ljava/util/HashMap;

    .line 391
    .line 392
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    const/16 v1, 0x100

    .line 396
    .line 397
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    :cond_f
    invoke-static {}, La/ofm0;->m()V

    .line 405
    .line 406
    .line 407
    iget-object v1, v10, La/ito0;->a:Ljava/util/ArrayDeque;

    .line 408
    .line 409
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    invoke-virtual {v10}, La/ito0;->c()V

    .line 413
    .line 414
    .line 415
    return-void

    .line 416
    :cond_10
    :goto_8
    new-instance v1, La/ozw;

    .line 417
    .line 418
    new-instance v4, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v5, "Not bound to a valid Camera ["

    .line 421
    .line 422
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    const-string v0, "]"

    .line 429
    .line 430
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    const/4 v4, 0x4

    .line 438
    invoke-direct {v1, v4, v0, v3}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 439
    .line 440
    .line 441
    if-eqz v2, :cond_11

    .line 442
    .line 443
    iget-object v0, v2, La/mz9;->a:La/qz9;

    .line 444
    .line 445
    sget-object v1, La/qz9;->t2:La/kl5;

    .line 446
    .line 447
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    sget-object v1, La/t0k0;->a:La/t0k0;

    .line 452
    .line 453
    invoke-virtual {v0, v1}, La/d4a;->C(La/a1k0;)V

    .line 454
    .line 455
    .line 456
    return-void

    .line 457
    :cond_11
    const-string v0, "Must have either in-memory or on-disk callback."

    .line 458
    .line 459
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, La/fot0;->e()La/ry9;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, La/mzw;->I()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-interface {v1, p0}, La/ry9;->e(I)V

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p0
.end method

.method public final g(ZLa/ipt0;)La/fpt0;
    .locals 3

    .line 1
    sget-object v0, La/mzw;->C:La/jzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/jzw;->a:La/nzw;

    .line 7
    .line 8
    invoke-interface {v0}, La/fpt0;->v()La/hpt0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v2, p0, La/mzw;->r:I

    .line 13
    .line 14
    invoke-interface {p2, v1, v2}, La/ipt0;->a(La/hpt0;I)La/drd;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {p2, v0}, La/drd;->r(La/drd;La/drd;)La/b780;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :cond_0
    if-nez p2, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-virtual {p0, p2}, La/mzw;->n(La/drd;)La/ept0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, La/gyw;

    .line 33
    .line 34
    new-instance p1, La/nzw;

    .line 35
    .line 36
    iget-object p0, p0, La/gyw;->b:La/wy40;

    .line 37
    .line 38
    invoke-static {p0}, La/b780;->j(La/drd;)La/b780;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {p1, p0}, La/nzw;-><init>(La/b780;)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final n(La/drd;)La/ept0;
    .locals 1

    .line 1
    new-instance p0, La/gyw;

    .line 2
    .line 3
    invoke-static {p1}, La/wy40;->p(La/drd;)La/wy40;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, p1, v0}, La/gyw;-><init>(La/wy40;B)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final o()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final t()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Attached camera cannot be null"

    .line 6
    .line 7
    invoke-static {v0, v1}, La/z1x;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/mzw;->I()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x3

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, La/lx9;->a()La/j0a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, La/j0a;->h()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, -0x1

    .line 33
    :goto_0
    if-nez p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const-string p0, "Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture"

    .line 37
    .line 38
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/fot0;->h()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "ImageCapture:"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final u()V
    .locals 2

    .line 1
    const-string v0, "ImageCapture"

    .line 2
    .line 3
    const-string v1, "onCameraControlReady"

    .line 4
    .line 5
    invoke-static {v0, v1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/mzw;->L()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/mzw;->w:La/r7h0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/fot0;->e()La/ry9;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0, v0}, La/ry9;->k(La/kzw;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final v(La/n0a;La/ept0;)La/fpt0;
    .locals 12

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x23

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x100

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, p0, La/fot0;->h:Ljava/util/HashSet;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v5, :cond_2

    .line 23
    .line 24
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    move v7, v6

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, La/giv;

    .line 40
    .line 41
    instance-of v9, v8, La/zzw;

    .line 42
    .line 43
    if-eqz v9, :cond_0

    .line 44
    .line 45
    check-cast v8, La/zzw;

    .line 46
    .line 47
    iget-boolean v7, v8, La/zzw;->a:Z

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    sget-object v8, La/nzw;->f:La/u15;

    .line 55
    .line 56
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v5, v8, v7}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-interface {p1}, La/n0a;->o()La/kpd0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-class v5, Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;

    .line 68
    .line 69
    invoke-virtual {p1, v5}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const-string v5, "ImageCapture"

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    sget-object v8, La/nzw;->h:La/u15;

    .line 84
    .line 85
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v7, v8, v9}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {p1, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_3

    .line 96
    .line 97
    const-string p1, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."

    .line 98
    .line 99
    invoke-static {v5, p1}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    const-string p1, "Requesting software JPEG due to device quirk."

    .line 104
    .line 105
    invoke-static {v5, p1}, La/l8x;->e0(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1, v8, v9}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_1
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 120
    .line 121
    sget-object v8, La/nzw;->h:La/u15;

    .line 122
    .line 123
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {p1, v8, v9}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v7, v10}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    const/4 v10, 0x1

    .line 134
    const/4 v11, 0x0

    .line 135
    if-eqz v7, :cond_7

    .line 136
    .line 137
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    if-nez v7, :cond_5

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-interface {v7}, La/s0a;->e()La/hy9;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-interface {v7}, La/hy9;->o()V

    .line 153
    .line 154
    .line 155
    :goto_2
    sget-object v7, La/nzw;->e:La/u15;

    .line 156
    .line 157
    invoke-virtual {p1, v7, v11}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    check-cast v7, Ljava/lang/Integer;

    .line 162
    .line 163
    if-eqz v7, :cond_6

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-eq v7, v3, :cond_6

    .line 170
    .line 171
    const-string v7, "Software JPEG cannot be used with non-JPEG output buffer format."

    .line 172
    .line 173
    invoke-static {v5, v7}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_6
    move v6, v10

    .line 178
    :goto_3
    if-nez v6, :cond_7

    .line 179
    .line 180
    const-string v7, "Unable to support software JPEG. Disabling."

    .line 181
    .line 182
    invoke-static {v5, v7}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v8, v9}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_7
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    sget-object v5, La/nzw;->e:La/u15;

    .line 193
    .line 194
    invoke-virtual {p1, v5, v11}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Ljava/lang/Integer;

    .line 199
    .line 200
    if-eqz p1, :cond_a

    .line 201
    .line 202
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-nez v0, :cond_8

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_8
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-interface {p0}, La/s0a;->e()La/hy9;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-interface {p0}, La/hy9;->o()V

    .line 218
    .line 219
    .line 220
    :goto_4
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    sget-object v0, La/h0x;->h0:La/u15;

    .line 225
    .line 226
    if-eqz v6, :cond_9

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    :goto_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p0, v0, p1}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_6

    .line 241
    .line 242
    :cond_a
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    sget-object p1, La/nzw;->f:La/u15;

    .line 247
    .line 248
    invoke-virtual {p0, p1, v11}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    const/4 v5, 0x2

    .line 253
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-static {p0, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    if-eqz p0, :cond_b

    .line 262
    .line 263
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    sget-object p1, La/h0x;->h0:La/u15;

    .line 268
    .line 269
    invoke-virtual {p0, p1, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_6

    .line 273
    .line 274
    :cond_b
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-virtual {p0, p1, v11}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    const/4 v5, 0x3

    .line 283
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-static {p0, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    if-eqz p0, :cond_c

    .line 292
    .line 293
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    sget-object p1, La/h0x;->h0:La/u15;

    .line 298
    .line 299
    invoke-virtual {p0, p1, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    sget-object p1, La/h0x;->i0:La/u15;

    .line 307
    .line 308
    invoke-virtual {p0, p1, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto/16 :goto_6

    .line 312
    .line 313
    :cond_c
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    invoke-virtual {p0, p1, v11}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p0

    .line 329
    if-eqz p0, :cond_d

    .line 330
    .line 331
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    sget-object p1, La/h0x;->h0:La/u15;

    .line 336
    .line 337
    const/16 v0, 0x1005

    .line 338
    .line 339
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {p0, p1, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    sget-object p1, La/h0x;->j0:La/u15;

    .line 351
    .line 352
    sget-object v0, La/agn;->c:La/agn;

    .line 353
    .line 354
    invoke-virtual {p0, p1, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_d
    if-eqz v6, :cond_e

    .line 359
    .line 360
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    sget-object p1, La/h0x;->h0:La/u15;

    .line 365
    .line 366
    invoke-virtual {p0, p1, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_e
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    sget-object p1, La/w0x;->r0:La/u15;

    .line 375
    .line 376
    invoke-virtual {p0, p1, v11}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    check-cast p0, Ljava/util/List;

    .line 381
    .line 382
    if-nez p0, :cond_f

    .line 383
    .line 384
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    sget-object p1, La/h0x;->h0:La/u15;

    .line 389
    .line 390
    invoke-virtual {p0, p1, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto :goto_6

    .line 394
    :cond_f
    invoke-static {v3, p0}, La/mzw;->J(ILjava/util/List;)Z

    .line 395
    .line 396
    .line 397
    move-result p1

    .line 398
    if-eqz p1, :cond_10

    .line 399
    .line 400
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    sget-object p1, La/h0x;->h0:La/u15;

    .line 405
    .line 406
    invoke-virtual {p0, p1, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_10
    invoke-static {v1, p0}, La/mzw;->J(ILjava/util/List;)Z

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    if-eqz p0, :cond_11

    .line 415
    .line 416
    invoke-interface {p2}, La/xro;->b()La/wy40;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    sget-object p1, La/h0x;->h0:La/u15;

    .line 421
    .line 422
    invoke-virtual {p0, p1, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :cond_11
    :goto_6
    invoke-interface {p2}, La/ept0;->e()La/fpt0;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    return-object p0
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-object v0, p0, La/mzw;->w:La/r7h0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/r7h0;->c()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, La/r7h0;->b()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/mzw;->z:La/ito0;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/ito0;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final y(La/drd;)La/h55;
    .locals 3

    .line 1
    iget-object v0, p0, La/mzw;->x:La/tii0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/tii0;->a(La/drd;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/mzw;->x:La/tii0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/tii0;->c()La/xii0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, La/fot0;->E(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/fot0;->j:La/h55;

    .line 39
    .line 40
    invoke-virtual {p0}, La/h55;->b()La/qgd;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p1, p0, La/qgd;->g:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, La/qgd;->i()La/h55;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final z(La/h55;La/h55;)La/h55;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", secondaryStreamSpec "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v0, "ImageCapture"

    .line 24
    .line 25
    invoke-static {v0, p2}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/fot0;->f()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object v0, p0, La/fot0;->i:La/fpt0;

    .line 33
    .line 34
    check-cast v0, La/nzw;

    .line 35
    .line 36
    invoke-virtual {p0, p2, v0, p1}, La/mzw;->H(Ljava/lang/String;La/nzw;La/h55;)La/tii0;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iput-object p2, p0, La/mzw;->x:La/tii0;

    .line 41
    .line 42
    invoke-virtual {p2}, La/tii0;->c()La/xii0;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    aget-object p2, p2, v2

    .line 58
    .line 59
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p0, p2}, La/fot0;->E(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    iput v1, p0, La/fot0;->e:I

    .line 73
    .line 74
    invoke-virtual {p0}, La/fot0;->s()V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method
