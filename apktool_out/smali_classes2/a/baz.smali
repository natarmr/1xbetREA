.class public abstract La/baz;
.super La/dr30;
.source "SourceFile"


# static fields
.field public static final synthetic m:[La/iiy;


# instance fields
.field public final b:La/f7u;

.field public final c:La/baz;

.field public final d:La/xt00;

.field public final e:La/cu00;

.field public final f:La/zt00;

.field public final g:La/xg;

.field public final h:La/zt00;

.field public final i:La/cu00;

.field public final j:La/cu00;

.field public final k:La/cu00;

.field public final l:La/zt00;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/baz;

    .line 4
    .line 5
    const-string v2, "functionNamesLazy"

    .line 6
    .line 7
    const-string v3, "getFunctionNamesLazy()Ljava/util/Set;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "propertyNamesLazy"

    .line 16
    .line 17
    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "classNamesLazy"

    .line 25
    .line 26
    const-string v6, "getClassNamesLazy()Ljava/util/Set;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/baz;->m:[La/iiy;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(La/f7u;La/p9z;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/baz;->b:La/f7u;

    .line 8
    .line 9
    iput-object p2, p0, La/baz;->c:La/baz;

    .line 10
    .line 11
    iget-object p1, p1, La/f7u;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, La/v7i;

    .line 14
    .line 15
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, La/eu00;

    .line 18
    .line 19
    new-instance v0, La/y9z;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/y9z;-><init>(La/baz;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/iun;->a:La/iun;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance v3, La/xt00;

    .line 30
    .line 31
    invoke-direct {v3, p2, v0, v2}, La/xt00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, La/baz;->d:La/xt00;

    .line 35
    .line 36
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, La/eu00;

    .line 39
    .line 40
    new-instance v0, La/y9z;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v0, p0, v2}, La/y9z;-><init>(La/baz;B)V

    .line 44
    .line 45
    .line 46
    new-instance v3, La/cu00;

    .line 47
    .line 48
    invoke-direct {v3, p2, v0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 49
    .line 50
    .line 51
    iput-object v3, p0, La/baz;->e:La/cu00;

    .line 52
    .line 53
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, La/eu00;

    .line 56
    .line 57
    new-instance v0, La/z9z;

    .line 58
    .line 59
    invoke-direct {v0, p0, v1}, La/z9z;-><init>(La/baz;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v0}, La/eu00;->c(Lkotlin/jvm/functions/Function1;)La/zt00;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iput-object p2, p0, La/baz;->f:La/zt00;

    .line 67
    .line 68
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, La/eu00;

    .line 71
    .line 72
    new-instance v0, La/z9z;

    .line 73
    .line 74
    invoke-direct {v0, p0, v2}, La/z9z;-><init>(La/baz;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v0}, La/eu00;->d(Lkotlin/jvm/functions/Function1;)La/xg;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iput-object p2, p0, La/baz;->g:La/xg;

    .line 82
    .line 83
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p2, La/eu00;

    .line 86
    .line 87
    new-instance v0, La/z9z;

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    invoke-direct {v0, p0, v1}, La/z9z;-><init>(La/baz;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v0}, La/eu00;->c(Lkotlin/jvm/functions/Function1;)La/zt00;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iput-object p2, p0, La/baz;->h:La/zt00;

    .line 98
    .line 99
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p2, La/eu00;

    .line 102
    .line 103
    new-instance v0, La/y9z;

    .line 104
    .line 105
    invoke-direct {v0, p0, v1}, La/y9z;-><init>(La/baz;B)V

    .line 106
    .line 107
    .line 108
    new-instance v1, La/cu00;

    .line 109
    .line 110
    invoke-direct {v1, p2, v0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    .line 113
    iput-object v1, p0, La/baz;->i:La/cu00;

    .line 114
    .line 115
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p2, La/eu00;

    .line 118
    .line 119
    new-instance v0, La/y9z;

    .line 120
    .line 121
    const/4 v1, 0x3

    .line 122
    invoke-direct {v0, p0, v1}, La/y9z;-><init>(La/baz;B)V

    .line 123
    .line 124
    .line 125
    new-instance v2, La/cu00;

    .line 126
    .line 127
    invoke-direct {v2, p2, v0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 128
    .line 129
    .line 130
    iput-object v2, p0, La/baz;->j:La/cu00;

    .line 131
    .line 132
    iget-object p2, p1, La/v7i;->i:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p2, La/eu00;

    .line 135
    .line 136
    new-instance v0, La/y9z;

    .line 137
    .line 138
    const/4 v2, 0x4

    .line 139
    invoke-direct {v0, p0, v2}, La/y9z;-><init>(La/baz;B)V

    .line 140
    .line 141
    .line 142
    new-instance v2, La/cu00;

    .line 143
    .line 144
    invoke-direct {v2, p2, v0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 145
    .line 146
    .line 147
    iput-object v2, p0, La/baz;->k:La/cu00;

    .line 148
    .line 149
    iget-object p1, p1, La/v7i;->i:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p1, La/eu00;

    .line 152
    .line 153
    new-instance p2, La/z9z;

    .line 154
    .line 155
    invoke-direct {p2, p0, v1}, La/z9z;-><init>(La/baz;B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, La/eu00;->c(Lkotlin/jvm/functions/Function1;)La/zt00;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iput-object p1, p0, La/baz;->l:La/zt00;

    .line 163
    .line 164
    return-void

    .line 165
    :cond_0
    const/16 p0, 0x1b

    .line 166
    .line 167
    invoke-static {p0}, La/eu00;->a(I)V

    .line 168
    .line 169
    .line 170
    const/4 p0, 0x0

    .line 171
    throw p0
.end method

.method public static l(La/vqe0;La/f7u;)La/wsy;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/vqe0;->b()Ljava/lang/reflect/Member;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/reflect/Method;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sget-object v1, La/b0t0;->b:La/b0t0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x6

    .line 25
    invoke-static {v1, v0, v2, v3}, La/xvw;->Y(La/b0t0;ZLa/gaz;I)La/fay;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object p1, p1, La/f7u;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, La/nvu;

    .line 32
    .line 33
    invoke-virtual {p0}, La/vqe0;->f()La/zqe0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0, v0}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static u(La/f7u;La/oer;Ljava/util/List;)La/rsq;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static/range {p2 .. p2}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)La/rx3;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, La/rx3;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    :goto_0
    move-object v5, v1

    .line 28
    check-cast v5, La/iil;

    .line 29
    .line 30
    iget-object v6, v5, La/iil;->b:Ljava/util/Iterator;

    .line 31
    .line 32
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_7

    .line 37
    .line 38
    invoke-virtual {v5}, La/iil;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lkotlin/collections/IndexedValue;

    .line 43
    .line 44
    iget v9, v5, Lkotlin/collections/IndexedValue;->a:I

    .line 45
    .line 46
    iget-object v5, v5, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v5, La/bre0;

    .line 49
    .line 50
    invoke-static {v0, v5}, La/r8x;->W(La/f7u;La/m8y;)La/j9z;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    iget-object v6, v0, La/f7u;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, La/nvu;

    .line 57
    .line 58
    iget-object v7, v0, La/f7u;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v7, La/v7i;

    .line 61
    .line 62
    iget-object v7, v7, La/v7i;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v7, La/zm40;

    .line 65
    .line 66
    sget-object v8, La/b0t0;->b:La/b0t0;

    .line 67
    .line 68
    const/4 v11, 0x7

    .line 69
    const/4 v12, 0x0

    .line 70
    invoke-static {v8, v3, v12, v11}, La/xvw;->Y(La/b0t0;ZLa/gaz;I)La/fay;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    iget-boolean v11, v5, La/bre0;->d:Z

    .line 75
    .line 76
    iget-object v13, v5, La/bre0;->a:La/zqe0;

    .line 77
    .line 78
    const/4 v14, 0x1

    .line 79
    if-eqz v11, :cond_2

    .line 80
    .line 81
    instance-of v11, v13, La/gqe0;

    .line 82
    .line 83
    if-eqz v11, :cond_0

    .line 84
    .line 85
    check-cast v13, La/gqe0;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_0
    move-object v13, v12

    .line 89
    :goto_1
    if-eqz v13, :cond_1

    .line 90
    .line 91
    invoke-virtual {v6, v13, v8, v14}, La/nvu;->U(La/gqe0;La/fay;Z)La/tft0;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    iget-object v8, v7, La/zm40;->e:La/ary;

    .line 96
    .line 97
    invoke-virtual {v8, v6}, La/ary;->f(La/wsy;)La/wsy;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    new-instance v11, Lkotlin/Pair;

    .line 102
    .line 103
    invoke-direct {v11, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_1
    const-string v0, "Vararg parameter should be an array: "

    .line 108
    .line 109
    invoke-static {v5, v0}, La/hny;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v12

    .line 113
    :cond_2
    invoke-virtual {v6, v13, v8}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    new-instance v11, Lkotlin/Pair;

    .line 118
    .line 119
    invoke-direct {v11, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :goto_2
    iget-object v6, v11, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v6, La/wsy;

    .line 125
    .line 126
    iget-object v8, v11, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 127
    .line 128
    move-object/from16 v16, v8

    .line 129
    .line 130
    check-cast v16, La/wsy;

    .line 131
    .line 132
    invoke-virtual/range {p1 .. p1}, La/wjj;->getName()La/g950;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v8}, La/g950;->b()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    const-string v11, "equals"

    .line 141
    .line 142
    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_3

    .line 147
    .line 148
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-ne v8, v14, :cond_3

    .line 153
    .line 154
    iget-object v7, v7, La/zm40;->e:La/ary;

    .line 155
    .line 156
    invoke-virtual {v7}, La/ary;->p()La/kzj0;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v7, v6}, La/wsy;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_3

    .line 165
    .line 166
    const-string v7, "other"

    .line 167
    .line 168
    invoke-static {v7}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    :goto_3
    move-object v12, v6

    .line 173
    move-object v11, v7

    .line 174
    goto :goto_4

    .line 175
    :cond_3
    iget-object v7, v5, La/bre0;->c:Ljava/lang/String;

    .line 176
    .line 177
    if-eqz v7, :cond_4

    .line 178
    .line 179
    invoke-static {v7}, La/g950;->d(Ljava/lang/String;)La/g950;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    :cond_4
    if-nez v12, :cond_5

    .line 184
    .line 185
    move v4, v14

    .line 186
    :cond_5
    if-nez v12, :cond_6

    .line 187
    .line 188
    new-instance v7, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v8, "p"

    .line 191
    .line 192
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-static {v7}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    goto :goto_3

    .line 207
    :cond_6
    move-object v11, v12

    .line 208
    move-object v12, v6

    .line 209
    :goto_4
    new-instance v6, La/k3u0;

    .line 210
    .line 211
    const/4 v15, 0x0

    .line 212
    invoke-static {v5}, La/m2a;->v(La/x8y;)La/rog0;

    .line 213
    .line 214
    .line 215
    move-result-object v17

    .line 216
    const/4 v8, 0x0

    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    move-object/from16 v7, p1

    .line 220
    .line 221
    invoke-direct/range {v6 .. v17}, La/k3u0;-><init>(La/kp9;La/k3u0;ILa/g93;La/g950;La/wsy;ZZZLa/wsy;La/gmk0;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_7
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-instance v1, La/rsq;

    .line 234
    .line 235
    invoke-direct {v1, v0, v4}, La/rsq;-><init>(Ljava/util/List;Z)V

    .line 236
    .line 237
    .line 238
    return-object v1
.end method


# virtual methods
.method public a(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/baz;->c()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    sget-object p0, La/iun;->a:La/iun;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-object p0, p0, La/baz;->h:La/zt00;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/zt00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/util/Collection;

    .line 27
    .line 28
    return-object p0
.end method

.method public b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/baz;->d:La/xt00;

    .line 5
    .line 6
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method

.method public final c()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, La/baz;->m:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/baz;->i:La/cu00;

    .line 7
    .line 8
    invoke-static {p0, v0}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
.end method

.method public final e()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, La/baz;->m:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/baz;->k:La/cu00;

    .line 7
    .line 8
    invoke-static {p0, v0}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
.end method

.method public f(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/baz;->g()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    sget-object p0, La/iun;->a:La/iun;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    iget-object p0, p0, La/baz;->l:La/zt00;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/zt00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/util/Collection;

    .line 24
    .line 25
    return-object p0
.end method

.method public final g()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, La/baz;->m:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/baz;->j:La/cu00;

    .line 7
    .line 8
    invoke-static {p0, v0}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
.end method

.method public h(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/xun;->a:La/xun;

    .line 5
    .line 6
    return-object p0
.end method

.method public i(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/xun;->a:La/xun;

    .line 5
    .line 6
    return-object p0
.end method

.method public j(La/g950;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k()La/ckj;
    .locals 0

    .line 1
    sget-object p0, La/bkj;->a:La/bkj;

    .line 2
    .line 3
    return-object p0
.end method

.method public m(Ljava/util/LinkedHashSet;La/g950;)V
    .locals 0

    .line 1
    return-void
.end method

.method public n(La/g950;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(La/cek;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/xun;->a:La/xun;

    .line 5
    .line 6
    return-object p0
.end method

.method public p()La/c8z;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public abstract q()La/vjj;
.end method

.method public r(La/u9y;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public s(La/vqe0;Ljava/util/ArrayList;La/wsy;Ljava/util/List;)La/aaz;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, La/aaz;

    .line 11
    .line 12
    sget-object p1, La/iun;->a:La/iun;

    .line 13
    .line 14
    invoke-direct {p0, p3, p4, p2, p1}, La/aaz;-><init>(La/wsy;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public final t(La/vqe0;)La/u9y;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, La/baz;->b:La/f7u;

    .line 9
    .line 10
    invoke-static {v2, v1}, La/r8x;->W(La/f7u;La/m8y;)La/j9z;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v0}, La/baz;->q()La/vjj;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v1}, La/uqe0;->c()La/g950;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v1}, La/m2a;->v(La/x8y;)La/rog0;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    iget-object v7, v0, La/baz;->e:La/cu00;

    .line 27
    .line 28
    invoke-virtual {v7}, La/cu00;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    check-cast v7, La/ckj;

    .line 33
    .line 34
    invoke-virtual {v1}, La/uqe0;->c()La/g950;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-interface {v7, v8}, La/ckj;->a(La/g950;)La/yqe0;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const/4 v8, 0x0

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, La/vqe0;->g()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v7, v8

    .line 60
    :goto_0
    invoke-static {v4, v3, v5, v6, v7}, La/u9y;->D1(La/vjj;La/j9z;La/g950;La/rog0;Z)La/u9y;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v3, v2, La/f7u;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, La/a8z;

    .line 70
    .line 71
    iget-object v4, v2, La/f7u;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v4, La/v7i;

    .line 74
    .line 75
    new-instance v5, La/ucs0;

    .line 76
    .line 77
    invoke-direct {v5, v2, v9, v1, v8}, La/ucs0;-><init>(La/f7u;La/vjj;La/hay;I)V

    .line 78
    .line 79
    .line 80
    new-instance v2, La/f7u;

    .line 81
    .line 82
    invoke-direct {v2, v4, v5, v3}, La/f7u;-><init>(La/v7i;La/mzs0;La/a8z;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, La/vqe0;->getTypeParameters()Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v4, Ljava/util/ArrayList;

    .line 90
    .line 91
    const/16 v5, 0xa

    .line 92
    .line 93
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_1

    .line 109
    .line 110
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, La/are0;

    .line 115
    .line 116
    iget-object v6, v2, La/f7u;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v6, La/mzs0;

    .line 119
    .line 120
    invoke-interface {v6, v5}, La/mzs0;->c(La/are0;)La/hzs0;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_1
    invoke-virtual {v1}, La/vqe0;->g()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-static {v2, v9, v3}, La/baz;->u(La/f7u;La/oer;Ljava/util/List;)La/rsq;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v1, v2}, La/baz;->l(La/vqe0;La/f7u;)La/wsy;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget-object v5, v3, La/rsq;->a:Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {v0, v1, v4, v2, v5}, La/baz;->s(La/vqe0;Ljava/util/ArrayList;La/wsy;Ljava/util/List;)La/aaz;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    iget-object v4, v2, La/aaz;->d:Ljava/util/List;

    .line 150
    .line 151
    invoke-virtual {v0}, La/baz;->p()La/c8z;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    sget-object v12, La/iun;->a:La/iun;

    .line 156
    .line 157
    iget-object v13, v2, La/aaz;->c:Ljava/util/ArrayList;

    .line 158
    .line 159
    iget-object v14, v2, La/aaz;->b:Ljava/util/List;

    .line 160
    .line 161
    iget-object v15, v2, La/aaz;->a:La/wsy;

    .line 162
    .line 163
    sget-object v0, La/gm40;->a:La/evz;

    .line 164
    .line 165
    invoke-virtual {v1}, La/vqe0;->b()Ljava/lang/reflect/Member;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    check-cast v2, Ljava/lang/reflect/Method;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-virtual {v1}, La/vqe0;->b()Ljava/lang/reflect/Member;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    if-eqz v2, :cond_2

    .line 197
    .line 198
    sget-object v0, La/gm40;->e:La/gm40;

    .line 199
    .line 200
    :goto_2
    move-object/from16 v16, v0

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_2
    if-nez v5, :cond_3

    .line 204
    .line 205
    sget-object v0, La/gm40;->d:La/gm40;

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_3
    sget-object v0, La/gm40;->b:La/gm40;

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :goto_3
    invoke-virtual {v1}, La/uqe0;->e()La/xj;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, La/u4n0;->u(La/xj;)La/tek;

    .line 216
    .line 217
    .line 218
    move-result-object v17

    .line 219
    sget-object v18, La/lun;->a:La/lun;

    .line 220
    .line 221
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    const/4 v10, 0x0

    .line 225
    invoke-virtual/range {v9 .. v18}, La/u9y;->C1(La/c8z;La/c8z;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wsy;La/gm40;La/tek;Ljava/util/Map;)La/fyj0;

    .line 226
    .line 227
    .line 228
    iget-object v0, v1, La/vqe0;->a:Ljava/lang/reflect/Method;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    iput-boolean v0, v9, La/oer;->p:Z

    .line 239
    .line 240
    iget-boolean v0, v3, La/rsq;->b:Z

    .line 241
    .line 242
    invoke-virtual {v9, v8, v0}, La/u9y;->E1(ZZ)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_4

    .line 250
    .line 251
    return-object v9

    .line 252
    :cond_4
    const-string v0, "Should not be called"

    .line 253
    .line 254
    invoke-static {v0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const/4 v0, 0x0

    .line 258
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy scope for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/baz;->q()La/vjj;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
