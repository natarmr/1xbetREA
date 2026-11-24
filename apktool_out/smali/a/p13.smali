.class public final La/p13;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/vld;
.implements La/ehl;
.implements La/g6z;


# instance fields
.field public final o:La/gy40;

.field public final p:Z

.field public final q:F

.field public final r:La/u3k;

.field public final s:La/t3k;

.field public t:La/td9;

.field public u:F

.field public v:J

.field public w:Z

.field public final x:La/vy40;

.field public y:La/jcg0;

.field public z:La/kcg0;


# direct methods
.method public constructor <init>(La/gy40;ZFLa/u3k;La/t3k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p13;->o:La/gy40;

    .line 5
    .line 6
    iput-boolean p2, p0, La/p13;->p:Z

    .line 7
    .line 8
    iput p3, p0, La/p13;->q:F

    .line 9
    .line 10
    iput-object p4, p0, La/p13;->r:La/u3k;

    .line 11
    .line 12
    iput-object p5, p0, La/p13;->s:La/t3k;

    .line 13
    .line 14
    const-wide/16 p1, 0x0

    .line 15
    .line 16
    iput-wide p1, p0, La/p13;->v:J

    .line 17
    .line 18
    new-instance p1, La/vy40;

    .line 19
    .line 20
    invoke-direct {p1}, La/vy40;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/p13;->x:La/vy40;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final O0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final R0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/k6d0;

    .line 6
    .line 7
    const/16 v2, 0x12

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, v3, v2}, La/k6d0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final S0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/p13;->y:La/jcg0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, La/p13;->z:La/kcg0;

    .line 7
    .line 8
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/jcg0;->d:La/g090;

    .line 12
    .line 13
    iget-object v2, v1, La/g090;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La/kcg0;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, La/kcg0;->c()V

    .line 26
    .line 27
    .line 28
    iget-object v3, v1, La/g090;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, La/kcg0;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iget-object v1, v1, La/g090;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, La/p13;

    .line 49
    .line 50
    :cond_0
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object p0, v0, La/jcg0;->c:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final Z0(La/lub0;)V
    .locals 12

    .line 1
    instance-of v0, p1, La/jub0;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    check-cast v2, La/jub0;

    .line 7
    .line 8
    iget-wide v4, p0, La/p13;->v:J

    .line 9
    .line 10
    iget p1, p0, La/p13;->u:F

    .line 11
    .line 12
    iget-object v0, p0, La/p13;->y:La/jcg0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    sget-object v0, La/dy2;->f:La/zfn;

    .line 19
    .line 20
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/view/View;

    .line 25
    .line 26
    :goto_0
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    move-object v3, v0

    .line 31
    check-cast v3, Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    instance-of v6, v3, Landroid/view/View;

    .line 38
    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    move-object v0, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string p0, "Couldn\'t find a valid parent for "

    .line 44
    .line 45
    const-string p1, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    .line 46
    .line 47
    invoke-static {v0, p0, p1}, La/f140;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    check-cast v0, Landroid/view/ViewGroup;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    move v6, v1

    .line 62
    :goto_1
    if-ge v6, v3, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    instance-of v8, v7, La/jcg0;

    .line 69
    .line 70
    if-eqz v8, :cond_3

    .line 71
    .line 72
    check-cast v7, La/jcg0;

    .line 73
    .line 74
    move-object v0, v7

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    new-instance v3, La/jcg0;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-direct {v3, v6}, La/jcg0;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v3

    .line 92
    :goto_2
    iput-object v0, p0, La/p13;->y:La/jcg0;

    .line 93
    .line 94
    :goto_3
    iget-object v3, v0, La/jcg0;->b:Ljava/util/ArrayList;

    .line 95
    .line 96
    iget-object v6, v0, La/jcg0;->d:La/g090;

    .line 97
    .line 98
    iget-object v7, v6, La/g090;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    iget-object v8, v6, La/g090;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v8, Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    iget-object v6, v6, La/g090;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-virtual {v7, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, La/kcg0;

    .line 115
    .line 116
    const/4 v9, 0x1

    .line 117
    if-eqz v7, :cond_5

    .line 118
    .line 119
    :goto_4
    move-object v1, v7

    .line 120
    goto :goto_8

    .line 121
    :cond_5
    iget-object v7, v0, La/jcg0;->c:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    const/4 v11, 0x0

    .line 131
    if-eqz v10, :cond_6

    .line 132
    .line 133
    move-object v7, v11

    .line 134
    goto :goto_5

    .line 135
    :cond_6
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    :goto_5
    check-cast v7, La/kcg0;

    .line 140
    .line 141
    if-nez v7, :cond_b

    .line 142
    .line 143
    iget v7, v0, La/jcg0;->e:I

    .line 144
    .line 145
    invoke-static {v3}, La/q3d;->i(Ljava/util/List;)I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-le v7, v10, :cond_7

    .line 150
    .line 151
    new-instance v7, La/kcg0;

    .line 152
    .line 153
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-direct {v7, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_7
    iget v7, v0, La/jcg0;->e:I

    .line 168
    .line 169
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    move-object v7, v3

    .line 174
    check-cast v7, La/kcg0;

    .line 175
    .line 176
    invoke-virtual {v6, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, La/p13;

    .line 181
    .line 182
    if-eqz v3, :cond_9

    .line 183
    .line 184
    iput-object v11, v3, La/p13;->z:La/kcg0;

    .line 185
    .line 186
    invoke-static {v3}, La/vfc;->J(La/ehl;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    check-cast v10, La/kcg0;

    .line 194
    .line 195
    if-eqz v10, :cond_8

    .line 196
    .line 197
    invoke-interface {v6, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    check-cast v10, La/p13;

    .line 202
    .line 203
    :cond_8
    invoke-interface {v8, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, La/kcg0;->c()V

    .line 207
    .line 208
    .line 209
    :cond_9
    :goto_6
    iget v3, v0, La/jcg0;->e:I

    .line 210
    .line 211
    iget-byte v10, v0, La/jcg0;->a:B

    .line 212
    .line 213
    sub-int/2addr v10, v9

    .line 214
    if-ge v3, v10, :cond_a

    .line 215
    .line 216
    add-int/2addr v3, v9

    .line 217
    iput v3, v0, La/jcg0;->e:I

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_a
    iput v1, v0, La/jcg0;->e:I

    .line 221
    .line 222
    :cond_b
    :goto_7
    invoke-interface {v8, p0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    invoke-interface {v6, v7, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :goto_8
    invoke-static {p1}, La/si30;->b(F)I

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    iget-object p1, p0, La/p13;->r:La/u3k;

    .line 234
    .line 235
    invoke-virtual {p1}, La/u3k;->a()J

    .line 236
    .line 237
    .line 238
    move-result-wide v7

    .line 239
    iget-object p1, p0, La/p13;->s:La/t3k;

    .line 240
    .line 241
    invoke-virtual {p1}, La/t3k;->invoke()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, La/hcg0;

    .line 246
    .line 247
    iget p1, p1, La/hcg0;->d:F

    .line 248
    .line 249
    new-instance v10, La/a13;

    .line 250
    .line 251
    invoke-direct {v10, p0, v9}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 252
    .line 253
    .line 254
    iget-boolean v3, p0, La/p13;->p:Z

    .line 255
    .line 256
    move v9, p1

    .line 257
    invoke-virtual/range {v1 .. v10}, La/kcg0;->b(La/jub0;ZJIJFLa/a13;)V

    .line 258
    .line 259
    .line 260
    iput-object v1, p0, La/p13;->z:La/kcg0;

    .line 261
    .line 262
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_c
    instance-of v0, p1, La/kub0;

    .line 267
    .line 268
    if-eqz v0, :cond_d

    .line 269
    .line 270
    iget-object p0, p0, La/p13;->z:La/kcg0;

    .line 271
    .line 272
    if-eqz p0, :cond_e

    .line 273
    .line 274
    invoke-virtual {p0}, La/kcg0;->d()V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :cond_d
    instance-of p1, p1, La/iub0;

    .line 279
    .line 280
    if-eqz p1, :cond_e

    .line 281
    .line 282
    iget-object p0, p0, La/p13;->z:La/kcg0;

    .line 283
    .line 284
    if-eqz p0, :cond_e

    .line 285
    .line 286
    invoke-virtual {p0}, La/kcg0;->d()V

    .line 287
    .line 288
    .line 289
    :cond_e
    return-void
.end method

.method public final a(J)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/p13;->w:Z

    .line 3
    .line 4
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/e7z;->z:La/w6k;

    .line 9
    .line 10
    invoke-static {p1, p2}, La/n2x;->Q(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, La/p13;->v:J

    .line 15
    .line 16
    iget p1, p0, La/p13;->q:F

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    iget-wide p1, p0, La/p13;->v:J

    .line 25
    .line 26
    invoke-static {p1, p2}, La/h7k0;->e(J)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {p1, p2}, La/h7k0;->c(J)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {v1, p1}, La/k9x;->i(FF)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    invoke-static {p1, p2}, La/ne60;->d(J)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/high16 p2, 0x40000000    # 2.0f

    .line 43
    .line 44
    div-float/2addr p1, p2

    .line 45
    iget-boolean p2, p0, La/p13;->p:Z

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    const/high16 p2, 0x41200000    # 10.0f

    .line 50
    .line 51
    invoke-interface {v0, p2}, La/w6k;->w0(F)F

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    add-float/2addr p1, p2

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-interface {v0, p1}, La/w6k;->w0(F)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    :cond_1
    :goto_0
    iput p1, p0, La/p13;->u:F

    .line 62
    .line 63
    iget-object p1, p0, La/p13;->x:La/vy40;

    .line 64
    .line 65
    iget-object p2, p1, La/vy40;->a:[Ljava/lang/Object;

    .line 66
    .line 67
    iget v0, p1, La/vy40;->b:I

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    :goto_1
    if-ge v1, v0, :cond_2

    .line 71
    .line 72
    aget-object v2, p2, v1

    .line 73
    .line 74
    check-cast v2, La/lub0;

    .line 75
    .line 76
    invoke-virtual {p0, v2}, La/p13;->Z0(La/lub0;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p1}, La/vy40;->d()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final u0(La/g7z;)V
    .locals 14

    .line 1
    iget-object v0, p1, La/g7z;->a:La/a6a;

    .line 2
    .line 3
    invoke-virtual {p1}, La/g7z;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/p13;->t:La/td9;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget v5, p0, La/p13;->u:F

    .line 11
    .line 12
    iget-object v2, p0, La/p13;->r:La/u3k;

    .line 13
    .line 14
    invoke-virtual {v2}, La/u3k;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget-object v4, v1, La/td9;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, La/t33;

    .line 21
    .line 22
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v6, 0x0

    .line 33
    cmpl-float v6, v4, v6

    .line 34
    .line 35
    if-lez v6, :cond_1

    .line 36
    .line 37
    invoke-static {v4, v2, v3}, La/y3d;->c(FJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    iget-boolean v1, v1, La/td9;->a:Z

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, La/fhl;->d()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-static {v1, v2}, La/h7k0;->e(J)F

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-interface {v0}, La/fhl;->d()J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    invoke-static {v1, v2}, La/h7k0;->c(J)F

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    iget-object v1, v0, La/a6a;->b:La/nr;

    .line 62
    .line 63
    invoke-virtual {v1}, La/nr;->p()J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v2}, La/x5a;->l()V

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget-object v2, v1, La/nr;->b:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v6, v2

    .line 77
    check-cast v6, La/fvt0;

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v11, 0x1

    .line 82
    invoke-virtual/range {v6 .. v11}, La/fvt0;->k(FFFFI)V

    .line 83
    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    const/16 v10, 0x7c

    .line 87
    .line 88
    const-wide/16 v6, 0x0

    .line 89
    .line 90
    const/4 v8, 0x0

    .line 91
    move-object v2, p1

    .line 92
    invoke-static/range {v2 .. v10}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v12, v13}, Lc;->g(La/nr;J)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    invoke-static {v1, v12, v13}, Lc;->g(La/nr;J)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_0
    move-object v2, p1

    .line 106
    const/4 v9, 0x0

    .line 107
    const/16 v10, 0x7c

    .line 108
    .line 109
    const-wide/16 v6, 0x0

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    invoke-static/range {v2 .. v10}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 113
    .line 114
    .line 115
    :cond_1
    :goto_0
    iget-object p1, v0, La/a6a;->b:La/nr;

    .line 116
    .line 117
    invoke-virtual {p1}, La/nr;->i()La/x5a;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v0, p0, La/p13;->z:La/kcg0;

    .line 122
    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    iget-wide v3, p0, La/p13;->v:J

    .line 126
    .line 127
    iget v1, p0, La/p13;->u:F

    .line 128
    .line 129
    invoke-static {v1}, La/si30;->b(F)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    iget-object v1, p0, La/p13;->r:La/u3k;

    .line 134
    .line 135
    invoke-virtual {v1}, La/u3k;->a()J

    .line 136
    .line 137
    .line 138
    move-result-wide v5

    .line 139
    iget-object p0, p0, La/p13;->s:La/t3k;

    .line 140
    .line 141
    invoke-virtual {p0}, La/t3k;->invoke()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, La/hcg0;

    .line 146
    .line 147
    iget v1, p0, La/hcg0;->d:F

    .line 148
    .line 149
    invoke-virtual/range {v0 .. v6}, La/kcg0;->e(FIJJ)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {v0, p0}, La/kcg0;->draw(Landroid/graphics/Canvas;)V

    .line 157
    .line 158
    .line 159
    :cond_2
    return-void
.end method
