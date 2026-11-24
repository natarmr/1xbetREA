.class public final La/k7d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/iag0;

.field public final b:La/ex9;

.field public final c:La/gx9;

.field public final d:La/vne;

.field public final e:La/pzu;

.field public final f:Ljava/util/LinkedHashSet;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La/yg90;La/iag0;La/ex9;La/gx9;La/qcq0;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/k7d0;->a:La/iag0;

    .line 20
    .line 21
    iput-object p3, p0, La/k7d0;->b:La/ex9;

    .line 22
    .line 23
    iput-object p4, p0, La/k7d0;->c:La/gx9;

    .line 24
    .line 25
    iget-object p1, p5, La/qcq0;->a:La/vne;

    .line 26
    .line 27
    iput-object p1, p0, La/k7d0;->d:La/vne;

    .line 28
    .line 29
    new-instance p2, La/pzu;

    .line 30
    .line 31
    new-instance v0, La/prc0;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x6

    .line 35
    const/4 v1, 0x1

    .line 36
    const-class v3, La/k7d0;

    .line 37
    .line 38
    const-string v4, "prune"

    .line 39
    .line 40
    const-string v5, "prune$camera_camera2_pipe(Ljava/util/List;)V"

    .line 41
    .line 42
    move-object v2, p0

    .line 43
    invoke-direct/range {v0 .. v7}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    new-instance p0, La/k6d0;

    .line 47
    .line 48
    const/4 p3, 0x1

    .line 49
    const/4 p4, 0x0

    .line 50
    invoke-direct {p0, v2, p4, p3}, La/k6d0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p2, v0, p0}, La/pzu;-><init>(La/prc0;La/k6d0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p0, p2, La/pzu;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/x04;

    .line 62
    .line 63
    invoke-virtual {p0}, La/x04;->a()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_1

    .line 68
    .line 69
    new-instance p0, La/coc0;

    .line 70
    .line 71
    const/4 p3, 0x2

    .line 72
    invoke-direct {p0, p2, p4, p3}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    const/4 p3, 0x3

    .line 76
    invoke-static {p1, p4, p4, p0, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, La/pby;->isCancelled()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_0

    .line 85
    .line 86
    invoke-virtual {p2, p4}, La/pzu;->z(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :cond_0
    iput-object p2, v2, La/k7d0;->e:La/pzu;

    .line 90
    .line 91
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 92
    .line 93
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p0, v2, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 97
    .line 98
    new-instance p0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p0, v2, La/k7d0;->g:Ljava/util/ArrayList;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_1
    const-string p0, "PruningProcessingQueue cannot be re-started!"

    .line 107
    .line 108
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p4
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/hmf0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/hmf0;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/k7d0;->e:La/pzu;

    .line 10
    .line 11
    iget-object p0, p0, La/pzu;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/q99;

    .line 14
    .line 15
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    instance-of p0, p0, La/ytb;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    new-instance p0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, "Camera close by ID request failed for "

    .line 26
    .line 27
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 p1, 0x21

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p1, "CXCP"

    .line 47
    .line 48
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    iget-object p1, v0, La/hmf0;->b:La/odd;

    .line 54
    .line 55
    invoke-virtual {p1, p0}, La/pby;->N(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method public final b(Ljava/util/Set;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/d7d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/d7d0;

    .line 7
    .line 8
    iget v1, v0, La/d7d0;->m:I

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
    iput v1, v0, La/d7d0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d7d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/d7d0;-><init>(La/k7d0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/d7d0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d7d0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, La/d7d0;->j:La/z6d0;

    .line 40
    .line 41
    iget-object v2, v0, La/d7d0;->i:Ljava/util/Iterator;

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {p2}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    move-object v7, v6

    .line 73
    check-cast v7, La/z6d0;

    .line 74
    .line 75
    iget-object v7, v7, La/z6d0;->a:La/jnf0;

    .line 76
    .line 77
    iget-object v7, v7, La/jnf0;->a:La/jnu0;

    .line 78
    .line 79
    iget-object v7, v7, La/jnu0;->a:Ljava/lang/String;

    .line 80
    .line 81
    new-instance v8, La/g0a;

    .line 82
    .line 83
    invoke-direct {v8, v7}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_3

    .line 91
    .line 92
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    move-object v2, p1

    .line 101
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_b

    .line 106
    .line 107
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, La/z6d0;

    .line 112
    .line 113
    iget-object p2, p1, La/z6d0;->a:La/jnf0;

    .line 114
    .line 115
    iget-object v6, p2, La/jnf0;->a:La/jnu0;

    .line 116
    .line 117
    iget-object v7, v6, La/jnu0;->a:Ljava/lang/String;

    .line 118
    .line 119
    new-instance v8, La/g0a;

    .line 120
    .line 121
    invoke-direct {v8, v7}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    iget-object p2, p2, La/jnf0;->b:Ljava/util/List;

    .line 129
    .line 130
    invoke-static {v7, p2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_5

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-eqz v7, :cond_9

    .line 150
    .line 151
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, La/g0a;

    .line 156
    .line 157
    iget-object v7, v7, La/g0a;->a:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v8, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 160
    .line 161
    if-eqz v8, :cond_6

    .line 162
    .line 163
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-nez v9, :cond_8

    .line 168
    .line 169
    :cond_6
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    :cond_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-eqz v9, :cond_8

    .line 178
    .line 179
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    check-cast v9, La/rl;

    .line 184
    .line 185
    iget-object v9, v9, La/rl;->a:La/tw2;

    .line 186
    .line 187
    iget-object v9, v9, La/tw2;->a:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    if-eqz v9, :cond_7

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_8
    const-string p0, "Check failed."

    .line 197
    .line 198
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-object v3

    .line 202
    :cond_9
    :goto_4
    iget-object p2, p1, La/z6d0;->b:La/rl;

    .line 203
    .line 204
    iget-object v7, p1, La/z6d0;->c:La/m050;

    .line 205
    .line 206
    iput-object v2, v0, La/d7d0;->i:Ljava/util/Iterator;

    .line 207
    .line 208
    iput-object p1, v0, La/d7d0;->j:La/z6d0;

    .line 209
    .line 210
    iput v5, v0, La/d7d0;->m:I

    .line 211
    .line 212
    invoke-virtual {p2, v6, v7}, La/rl;->d(La/jnu0;La/m050;)Lkotlin/Unit;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    if-ne p2, v1, :cond_a

    .line 217
    .line 218
    return-object v1

    .line 219
    :cond_a
    :goto_5
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0
.end method

.method public final c(Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/z6d0;

    .line 16
    .line 17
    iget-object v1, v0, La/z6d0;->c:La/m050;

    .line 18
    .line 19
    invoke-virtual {v1}, La/m050;->b()Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method

.method public final d(Ljava/lang/String;Ljava/util/List;La/ew9;La/vne;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, La/e7d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/e7d0;

    .line 7
    .line 8
    iget v1, v0, La/e7d0;->n:I

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
    iput v1, v0, La/e7d0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/e7d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/e7d0;-><init>(La/k7d0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/e7d0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/e7d0;->n:I

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
    iget-object p4, v0, La/e7d0;->k:La/vne;

    .line 37
    .line 38
    iget-object p2, v0, La/e7d0;->j:Ljava/util/List;

    .line 39
    .line 40
    iget-object p1, v0, La/e7d0;->i:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p5, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v2, "Opening "

    .line 59
    .line 60
    invoke-direct {p5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, " with retries..."

    .line 71
    .line 72
    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p5

    .line 79
    const-string v2, "CXCP"

    .line 80
    .line 81
    invoke-static {v2, p5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    iput-object p1, v0, La/e7d0;->i:Ljava/lang/String;

    .line 85
    .line 86
    iput-object p2, v0, La/e7d0;->j:Ljava/util/List;

    .line 87
    .line 88
    iput-object p4, v0, La/e7d0;->k:La/vne;

    .line 89
    .line 90
    iput v3, v0, La/e7d0;->n:I

    .line 91
    .line 92
    iget-object p5, p0, La/k7d0;->a:La/iag0;

    .line 93
    .line 94
    iget-object v2, p0, La/k7d0;->b:La/ex9;

    .line 95
    .line 96
    invoke-virtual {p5, p1, v2, p3, v0}, La/iag0;->b(Ljava/lang/String;La/ex9;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p5

    .line 100
    if-ne p5, v1, :cond_3

    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_3
    :goto_1
    check-cast p5, La/hw70;

    .line 104
    .line 105
    iget-object p3, p5, La/hw70;->a:La/tw2;

    .line 106
    .line 107
    if-nez p3, :cond_4

    .line 108
    .line 109
    new-instance p0, La/w6d0;

    .line 110
    .line 111
    iget-object p1, p5, La/hw70;->b:La/az9;

    .line 112
    .line 113
    invoke-direct {p0, p1}, La/w6d0;-><init>(La/az9;)V

    .line 114
    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_4
    new-instance p5, La/x6d0;

    .line 118
    .line 119
    new-instance v0, La/rl;

    .line 120
    .line 121
    new-instance v1, La/g0a;

    .line 122
    .line 123
    invoke-direct {v1, p1}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance p2, La/v6d0;

    .line 135
    .line 136
    const/4 v1, 0x0

    .line 137
    invoke-direct {p2, p0, v1}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, p3, p1, p4, p2}, La/rl;-><init>(La/tw2;Ljava/util/Set;La/vne;La/v6d0;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {p5, v0}, La/x6d0;-><init>(La/rl;)V

    .line 144
    .line 145
    .line 146
    return-object p5
.end method

.method public final e(La/fmf0;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/f7d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/f7d0;

    .line 7
    .line 8
    iget v1, v0, La/f7d0;->l:I

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
    iput v1, v0, La/f7d0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f7d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/f7d0;-><init>(La/k7d0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/f7d0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f7d0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    iget-object p1, v0, La/f7d0;->i:La/fmf0;

    .line 52
    .line 53
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p1, La/fmf0;->a:La/rl;

    .line 61
    .line 62
    iget-object v2, p2, La/rl;->a:La/tw2;

    .line 63
    .line 64
    iget-object v2, v2, La/tw2;->a:Ljava/lang/String;

    .line 65
    .line 66
    new-instance v6, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v7, "PruningCamera2DeviceManager#processRequestClose("

    .line 69
    .line 70
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const/16 v2, 0x29

    .line 81
    .line 82
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-string v6, "CXCP"

    .line 90
    .line 91
    invoke-static {v6, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 95
    .line 96
    invoke-interface {v2, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    invoke-interface {v2, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v6, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_6

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    move-object v8, v7

    .line 127
    check-cast v8, La/z6d0;

    .line 128
    .line 129
    iget-object v8, v8, La/z6d0;->b:La/rl;

    .line 130
    .line 131
    if-eq v8, p2, :cond_5

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_6
    iput-object p1, v0, La/f7d0;->i:La/fmf0;

    .line 139
    .line 140
    iput v5, v0, La/f7d0;->l:I

    .line 141
    .line 142
    invoke-virtual {p0, v2}, La/k7d0;->c(Ljava/util/ArrayList;)Lkotlin/Unit;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-ne p0, v1, :cond_7

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    :goto_2
    iget-object p0, p1, La/fmf0;->a:La/rl;

    .line 150
    .line 151
    invoke-virtual {p0}, La/rl;->c()V

    .line 152
    .line 153
    .line 154
    iget-object p0, p1, La/fmf0;->a:La/rl;

    .line 155
    .line 156
    iput-object v3, v0, La/f7d0;->i:La/fmf0;

    .line 157
    .line 158
    iput v4, v0, La/f7d0;->l:I

    .line 159
    .line 160
    invoke-virtual {p0, v0}, La/rl;->b(La/zje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-ne p0, v1, :cond_8

    .line 165
    .line 166
    :goto_3
    return-object v1

    .line 167
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0
.end method

.method public final f(La/gmf0;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/g7d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/g7d0;

    .line 7
    .line 8
    iget v1, v0, La/g7d0;->m:I

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
    iput v1, v0, La/g7d0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/g7d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/g7d0;-><init>(La/k7d0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/g7d0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/g7d0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    iget-object v5, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, La/g7d0;->j:Ljava/util/Iterator;

    .line 42
    .line 43
    iget-object p1, v0, La/g7d0;->i:La/gmf0;

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    iget-object p1, v0, La/g7d0;->i:La/gmf0;

    .line 57
    .line 58
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const-string p2, "CXCP"

    .line 66
    .line 67
    const-string v2, "PruningCamera2DeviceManager#processRequestCloseAll()"

    .line 68
    .line 69
    invoke-static {p2, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    iput-object p1, v0, La/g7d0;->i:La/gmf0;

    .line 73
    .line 74
    iput v4, v0, La/g7d0;->m:I

    .line 75
    .line 76
    iget-object p2, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p0, p2}, La/k7d0;->c(Ljava/util/ArrayList;)Lkotlin/Unit;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, v1, :cond_4

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_4
    :goto_1
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_5

    .line 94
    .line 95
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, La/rl;

    .line 100
    .line 101
    invoke-virtual {p2}, La/rl;->c()V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_7

    .line 114
    .line 115
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, La/rl;

    .line 120
    .line 121
    iput-object p1, v0, La/g7d0;->i:La/gmf0;

    .line 122
    .line 123
    iput-object p0, v0, La/g7d0;->j:Ljava/util/Iterator;

    .line 124
    .line 125
    iput v3, v0, La/g7d0;->m:I

    .line 126
    .line 127
    invoke-virtual {p2, v0}, La/rl;->b(La/zje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-ne p2, v1, :cond_6

    .line 132
    .line 133
    :goto_4
    return-object v1

    .line 134
    :cond_7
    invoke-interface {v5}, Ljava/util/Set;->clear()V

    .line 135
    .line 136
    .line 137
    iget-object p0, p1, La/gmf0;->a:La/odd;

    .line 138
    .line 139
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    invoke-virtual {p0, p1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    return-object p1
.end method

.method public final g(La/hmf0;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/h7d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/h7d0;

    .line 7
    .line 8
    iget v1, v0, La/h7d0;->m:I

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
    iput v1, v0, La/h7d0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/h7d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/h7d0;-><init>(La/k7d0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/h7d0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/h7d0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, La/h7d0;->i:La/hmf0;

    .line 41
    .line 42
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    iget-object p1, v0, La/h7d0;->j:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v2, v0, La/h7d0;->i:La/hmf0;

    .line 56
    .line 57
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p1, La/hmf0;->a:Ljava/lang/String;

    .line 65
    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v6, "PruningCamera2DeviceManager#processRequestCloseById("

    .line 69
    .line 70
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v6, p1, La/hmf0;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v6}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v6, 0x29

    .line 83
    .line 84
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const-string v6, "CXCP"

    .line 92
    .line 93
    invoke-static {v6, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    new-instance v2, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-object v6, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :cond_4
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_5

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    move-object v8, v7

    .line 118
    check-cast v8, La/z6d0;

    .line 119
    .line 120
    iget-object v8, v8, La/z6d0;->a:La/jnf0;

    .line 121
    .line 122
    iget-object v8, v8, La/jnf0;->a:La/jnu0;

    .line 123
    .line 124
    iget-object v8, v8, La/jnu0;->a:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v8, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-eqz v8, :cond_4

    .line 131
    .line 132
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    iput-object p1, v0, La/h7d0;->i:La/hmf0;

    .line 137
    .line 138
    iput-object p2, v0, La/h7d0;->j:Ljava/lang/String;

    .line 139
    .line 140
    iput v5, v0, La/h7d0;->m:I

    .line 141
    .line 142
    invoke-virtual {p0, v2}, La/k7d0;->c(Ljava/util/ArrayList;)Lkotlin/Unit;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    if-ne v2, v1, :cond_6

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_6
    move-object v2, p1

    .line 150
    move-object p1, p2

    .line 151
    :goto_2
    iget-object p0, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 152
    .line 153
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_8

    .line 162
    .line 163
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    move-object v6, v5

    .line 168
    check-cast v6, La/rl;

    .line 169
    .line 170
    iget-object v6, v6, La/rl;->a:La/tw2;

    .line 171
    .line 172
    iget-object v6, v6, La/tw2;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-eqz v6, :cond_7

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    move-object v5, v3

    .line 182
    :goto_3
    check-cast v5, La/rl;

    .line 183
    .line 184
    if-eqz v5, :cond_a

    .line 185
    .line 186
    invoke-interface {p0, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, La/rl;->c()V

    .line 190
    .line 191
    .line 192
    iput-object v2, v0, La/h7d0;->i:La/hmf0;

    .line 193
    .line 194
    iput-object v3, v0, La/h7d0;->j:Ljava/lang/String;

    .line 195
    .line 196
    iput v4, v0, La/h7d0;->m:I

    .line 197
    .line 198
    invoke-virtual {v5, v0}, La/rl;->b(La/zje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    if-ne p0, v1, :cond_9

    .line 203
    .line 204
    :goto_4
    return-object v1

    .line 205
    :cond_9
    move-object p0, v2

    .line 206
    :goto_5
    move-object v2, p0

    .line 207
    :cond_a
    iget-object p0, v2, La/hmf0;->b:La/odd;

    .line 208
    .line 209
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    invoke-virtual {p0, p1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    return-object p1
.end method

.method public final h(La/jnf0;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/i7d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/i7d0;

    .line 7
    .line 8
    iget v1, v0, La/i7d0;->n:I

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
    iput v1, v0, La/i7d0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/i7d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/i7d0;-><init>(La/k7d0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/i7d0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/i7d0;->n:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v3

    .line 41
    :pswitch_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_11

    .line 45
    .line 46
    :pswitch_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_f

    .line 50
    .line 51
    :pswitch_2
    iget-object p1, v0, La/i7d0;->i:La/jnf0;

    .line 52
    .line 53
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_e

    .line 57
    .line 58
    :pswitch_3
    iget-object p1, v0, La/i7d0;->j:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v2, v0, La/i7d0;->i:La/jnf0;

    .line 61
    .line 62
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v8, p2

    .line 66
    move-object p2, p1

    .line 67
    move-object p1, v2

    .line 68
    move-object v2, v0

    .line 69
    move-object v0, v8

    .line 70
    goto/16 :goto_9

    .line 71
    .line 72
    :pswitch_4
    iget-object p1, v0, La/i7d0;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Ljava/util/Iterator;

    .line 75
    .line 76
    iget-object v2, v0, La/i7d0;->j:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v4, v0, La/i7d0;->i:La/jnf0;

    .line 79
    .line 80
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :pswitch_5
    iget-object p1, v0, La/i7d0;->k:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Ljava/util/List;

    .line 88
    .line 89
    iget-object v2, v0, La/i7d0;->j:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v4, v0, La/i7d0;->i:La/jnf0;

    .line 92
    .line 93
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :pswitch_6
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p1, La/jnf0;->a:La/jnu0;

    .line 102
    .line 103
    iget-object v2, p2, La/jnu0;->a:Ljava/lang/String;

    .line 104
    .line 105
    const-string p2, "CXCP"

    .line 106
    .line 107
    new-instance v4, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v5, "PruningCamera2DeviceManager#processRequestOpen("

    .line 110
    .line 111
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v2}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const/16 v5, 0x29

    .line 122
    .line 123
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-static {p2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    iget-object p2, p1, La/jnf0;->b:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    if-eqz p2, :cond_2

    .line 140
    .line 141
    iget-object p2, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 142
    .line 143
    new-instance v4, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_5

    .line 157
    .line 158
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    move-object v6, v5

    .line 163
    check-cast v6, La/rl;

    .line 164
    .line 165
    iget-object v6, v6, La/rl;->a:La/tw2;

    .line 166
    .line 167
    iget-object v6, v6, La/tw2;->a:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-nez v6, :cond_1

    .line 174
    .line 175
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_2
    iget-object p2, p1, La/jnf0;->b:Ljava/util/List;

    .line 180
    .line 181
    iget-object v4, p1, La/jnf0;->a:La/jnu0;

    .line 182
    .line 183
    iget-object v4, v4, La/jnu0;->a:Ljava/lang/String;

    .line 184
    .line 185
    new-instance v5, La/g0a;

    .line 186
    .line 187
    invoke-direct {v5, v4}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-static {p2, v5}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    iget-object v4, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 199
    .line 200
    new-instance v5, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_4

    .line 214
    .line 215
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    move-object v7, v6

    .line 220
    check-cast v7, La/rl;

    .line 221
    .line 222
    iget-object v7, v7, La/rl;->b:Ljava/util/Set;

    .line 223
    .line 224
    invoke-static {v7, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-nez v7, :cond_3

    .line 229
    .line 230
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_4
    move-object v4, v5

    .line 235
    :cond_5
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    if-nez p2, :cond_c

    .line 240
    .line 241
    iget-object p2, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 242
    .line 243
    invoke-interface {p2, v4}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 244
    .line 245
    .line 246
    iget-object p2, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 247
    .line 248
    new-instance v5, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    :cond_6
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    if-eqz v6, :cond_7

    .line 262
    .line 263
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    move-object v7, v6

    .line 268
    check-cast v7, La/z6d0;

    .line 269
    .line 270
    iget-object v7, v7, La/z6d0;->b:La/rl;

    .line 271
    .line 272
    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    if-eqz v7, :cond_6

    .line 277
    .line 278
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_7
    iput-object p1, v0, La/i7d0;->i:La/jnf0;

    .line 283
    .line 284
    iput-object v2, v0, La/i7d0;->j:Ljava/lang/String;

    .line 285
    .line 286
    iput-object v4, v0, La/i7d0;->k:Ljava/lang/Object;

    .line 287
    .line 288
    const/4 p2, 0x1

    .line 289
    iput p2, v0, La/i7d0;->n:I

    .line 290
    .line 291
    invoke-virtual {p0, v5}, La/k7d0;->c(Ljava/util/ArrayList;)Lkotlin/Unit;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    if-ne p2, v1, :cond_8

    .line 296
    .line 297
    goto/16 :goto_10

    .line 298
    .line 299
    :cond_8
    move-object v8, v4

    .line 300
    move-object v4, p1

    .line 301
    move-object p1, v8

    .line 302
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_9

    .line 311
    .line 312
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    check-cast v5, La/rl;

    .line 317
    .line 318
    invoke-virtual {v5}, La/rl;->c()V

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    :cond_a
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    if-eqz p2, :cond_b

    .line 331
    .line 332
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    check-cast p2, La/rl;

    .line 337
    .line 338
    iput-object v4, v0, La/i7d0;->i:La/jnf0;

    .line 339
    .line 340
    iput-object v2, v0, La/i7d0;->j:Ljava/lang/String;

    .line 341
    .line 342
    iput-object p1, v0, La/i7d0;->k:Ljava/lang/Object;

    .line 343
    .line 344
    const/4 v5, 0x2

    .line 345
    iput v5, v0, La/i7d0;->n:I

    .line 346
    .line 347
    invoke-virtual {p2, v0}, La/rl;->b(La/zje;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    if-ne p2, v1, :cond_a

    .line 352
    .line 353
    goto/16 :goto_10

    .line 354
    .line 355
    :cond_b
    :goto_7
    move-object p1, v2

    .line 356
    goto :goto_8

    .line 357
    :cond_c
    move-object v4, p1

    .line 358
    goto :goto_7

    .line 359
    :goto_8
    iget-object p2, p0, La/k7d0;->c:La/gx9;

    .line 360
    .line 361
    iget-object v2, v4, La/jnf0;->a:La/jnu0;

    .line 362
    .line 363
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v5, p2, La/gx9;->a:Ljava/lang/Object;

    .line 370
    .line 371
    monitor-enter v5

    .line 372
    :try_start_0
    iget-object p2, p2, La/gx9;->b:Ljava/util/LinkedHashMap;

    .line 373
    .line 374
    new-instance v6, La/g0a;

    .line 375
    .line 376
    invoke-direct {v6, p1}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-interface {p2, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 380
    .line 381
    .line 382
    monitor-exit v5

    .line 383
    iput-object v4, v0, La/i7d0;->i:La/jnf0;

    .line 384
    .line 385
    iput-object p1, v0, La/i7d0;->j:Ljava/lang/String;

    .line 386
    .line 387
    iput-object v3, v0, La/i7d0;->k:Ljava/lang/Object;

    .line 388
    .line 389
    const/4 p2, 0x3

    .line 390
    iput p2, v0, La/i7d0;->n:I

    .line 391
    .line 392
    invoke-virtual {p0, p1, v4, v0}, La/k7d0;->i(Ljava/lang/String;La/jnf0;La/zje;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    if-ne p2, v1, :cond_d

    .line 397
    .line 398
    goto/16 :goto_10

    .line 399
    .line 400
    :cond_d
    move-object v2, v0

    .line 401
    move-object v0, p2

    .line 402
    move-object p2, p1

    .line 403
    move-object p1, v4

    .line 404
    :goto_9
    check-cast v0, La/c7d0;

    .line 405
    .line 406
    instance-of v4, v0, La/a7d0;

    .line 407
    .line 408
    if-eqz v4, :cond_f

    .line 409
    .line 410
    check-cast v0, La/a7d0;

    .line 411
    .line 412
    iget-object p0, v0, La/a7d0;->a:La/az9;

    .line 413
    .line 414
    if-eqz p0, :cond_e

    .line 415
    .line 416
    const-string p0, "CXCP"

    .line 417
    .line 418
    new-instance p1, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v1, "Failed to retrieve active camera for "

    .line 421
    .line 422
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-static {p2}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p2

    .line 429
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    const-string p2, ". Last camera error was "

    .line 433
    .line 434
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    iget-object p2, v0, La/a7d0;->a:La/az9;

    .line 438
    .line 439
    iget p2, p2, La/az9;->a:I

    .line 440
    .line 441
    invoke-static {p2}, La/az9;->a(I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object p2

    .line 445
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    goto :goto_a

    .line 456
    :cond_e
    const-string p0, "CXCP"

    .line 457
    .line 458
    new-instance p1, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    const-string v0, "Failed to retrieve active camera for "

    .line 461
    .line 462
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    invoke-static {p2}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p2

    .line 469
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-string p2, ". Camera might have been closed during opening."

    .line 473
    .line 474
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 482
    .line 483
    .line 484
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object p0

    .line 487
    :cond_f
    instance-of p2, v0, La/b7d0;

    .line 488
    .line 489
    if-eqz p2, :cond_19

    .line 490
    .line 491
    check-cast v0, La/b7d0;

    .line 492
    .line 493
    iget-object p2, v0, La/b7d0;->a:La/rl;

    .line 494
    .line 495
    iget-object v0, v0, La/b7d0;->b:La/m050;

    .line 496
    .line 497
    iget-object v4, p1, La/jnf0;->b:Ljava/util/List;

    .line 498
    .line 499
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    if-nez v4, :cond_17

    .line 504
    .line 505
    iget-object v4, p1, La/jnf0;->b:Ljava/util/List;

    .line 506
    .line 507
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-eqz v5, :cond_10

    .line 512
    .line 513
    goto :goto_d

    .line 514
    :cond_10
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    if-eqz v5, :cond_14

    .line 523
    .line 524
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    check-cast v5, La/g0a;

    .line 529
    .line 530
    iget-object v5, v5, La/g0a;->a:Ljava/lang/String;

    .line 531
    .line 532
    iget-object v6, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 533
    .line 534
    if-eqz v6, :cond_11

    .line 535
    .line 536
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    if-eqz v7, :cond_11

    .line 541
    .line 542
    goto :goto_c

    .line 543
    :cond_11
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    :cond_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    if-eqz v7, :cond_13

    .line 552
    .line 553
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v7

    .line 557
    check-cast v7, La/z6d0;

    .line 558
    .line 559
    iget-object v7, v7, La/z6d0;->b:La/rl;

    .line 560
    .line 561
    iget-object v7, v7, La/rl;->a:La/tw2;

    .line 562
    .line 563
    iget-object v7, v7, La/tw2;->a:Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    if-eqz v7, :cond_12

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_13
    :goto_c
    iget-object p0, p0, La/k7d0;->g:Ljava/util/ArrayList;

    .line 573
    .line 574
    new-instance v1, La/z6d0;

    .line 575
    .line 576
    invoke-direct {v1, p1, p2, v0}, La/z6d0;-><init>(La/jnf0;La/rl;La/m050;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object p0

    .line 585
    :cond_14
    :goto_d
    iget-object v4, p1, La/jnf0;->a:La/jnu0;

    .line 586
    .line 587
    iput-object p1, v2, La/i7d0;->i:La/jnf0;

    .line 588
    .line 589
    iput-object v3, v2, La/i7d0;->j:Ljava/lang/String;

    .line 590
    .line 591
    const/4 v5, 0x4

    .line 592
    iput v5, v2, La/i7d0;->n:I

    .line 593
    .line 594
    invoke-virtual {p2, v4, v0}, La/rl;->d(La/jnu0;La/m050;)Lkotlin/Unit;

    .line 595
    .line 596
    .line 597
    move-result-object p2

    .line 598
    if-ne p2, v1, :cond_15

    .line 599
    .line 600
    goto :goto_10

    .line 601
    :cond_15
    move-object v0, v2

    .line 602
    :goto_e
    iget-object p1, p1, La/jnf0;->b:Ljava/util/List;

    .line 603
    .line 604
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    iput-object v3, v0, La/i7d0;->i:La/jnf0;

    .line 609
    .line 610
    const/4 p2, 0x5

    .line 611
    iput p2, v0, La/i7d0;->n:I

    .line 612
    .line 613
    invoke-virtual {p0, p1, v0}, La/k7d0;->b(Ljava/util/Set;La/zje;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object p0

    .line 617
    if-ne p0, v1, :cond_16

    .line 618
    .line 619
    goto :goto_10

    .line 620
    :cond_16
    :goto_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    return-object p0

    .line 623
    :cond_17
    iget-object p0, p1, La/jnf0;->a:La/jnu0;

    .line 624
    .line 625
    iput-object v3, v2, La/i7d0;->i:La/jnf0;

    .line 626
    .line 627
    iput-object v3, v2, La/i7d0;->j:Ljava/lang/String;

    .line 628
    .line 629
    const/4 p1, 0x6

    .line 630
    iput p1, v2, La/i7d0;->n:I

    .line 631
    .line 632
    invoke-virtual {p2, p0, v0}, La/rl;->d(La/jnu0;La/m050;)Lkotlin/Unit;

    .line 633
    .line 634
    .line 635
    move-result-object p0

    .line 636
    if-ne p0, v1, :cond_18

    .line 637
    .line 638
    :goto_10
    return-object v1

    .line 639
    :cond_18
    :goto_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    return-object p0

    .line 642
    :cond_19
    const-string p0, "Check failed."

    .line 643
    .line 644
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    return-object v3

    .line 648
    :catchall_0
    move-exception p0

    .line 649
    monitor-exit v5

    .line 650
    throw p0

    .line 651
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/String;La/jnf0;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    instance-of v2, v1, La/j7d0;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/j7d0;

    .line 9
    .line 10
    iget v3, v2, La/j7d0;->o:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, La/j7d0;->o:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v2, La/j7d0;

    .line 23
    .line 24
    invoke-direct {v2, p0, v1}, La/j7d0;-><init>(La/k7d0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v1, v2, La/j7d0;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v6, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v2, La/j7d0;->o:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    iget-object v7, p0, La/k7d0;->f:Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    if-eq v3, v5, :cond_2

    .line 41
    .line 42
    if-ne v3, v4, :cond_1

    .line 43
    .line 44
    iget-object v0, v2, La/j7d0;->j:La/jnf0;

    .line 45
    .line 46
    iget-object v2, v2, La/j7d0;->i:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v8

    .line 59
    :cond_2
    iget-object v3, v2, La/j7d0;->l:La/rl;

    .line 60
    .line 61
    iget-object v9, v2, La/j7d0;->k:Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v10, v2, La/j7d0;->j:La/jnf0;

    .line 64
    .line 65
    iget-object v11, v2, La/j7d0;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v1, v11

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v9, p2

    .line 80
    move-object v3, v1

    .line 81
    move-object v1, p1

    .line 82
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_7

    .line 87
    .line 88
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    check-cast v10, La/rl;

    .line 93
    .line 94
    iget-object v11, v10, La/rl;->a:La/tw2;

    .line 95
    .line 96
    iget-object v11, v11, La/tw2;->a:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    if-eqz v11, :cond_4

    .line 103
    .line 104
    invoke-virtual {v10}, La/rl;->a()La/m050;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    if-eqz v11, :cond_5

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    invoke-virtual {v10}, La/rl;->c()V

    .line 112
    .line 113
    .line 114
    iput-object v1, v2, La/j7d0;->i:Ljava/lang/String;

    .line 115
    .line 116
    iput-object v9, v2, La/j7d0;->j:La/jnf0;

    .line 117
    .line 118
    iput-object v3, v2, La/j7d0;->k:Ljava/util/Iterator;

    .line 119
    .line 120
    iput-object v10, v2, La/j7d0;->l:La/rl;

    .line 121
    .line 122
    iput v5, v2, La/j7d0;->o:I

    .line 123
    .line 124
    invoke-virtual {v10, v2}, La/rl;->b(La/zje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    if-ne v11, v6, :cond_6

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    move-object v12, v9

    .line 132
    move-object v9, v3

    .line 133
    move-object v3, v10

    .line 134
    move-object v10, v12

    .line 135
    :goto_2
    invoke-interface {v7, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-object v3, v9

    .line 139
    move-object v9, v10

    .line 140
    goto :goto_1

    .line 141
    :cond_7
    move-object v10, v8

    .line 142
    move-object v11, v10

    .line 143
    :goto_3
    if-nez v10, :cond_c

    .line 144
    .line 145
    iget-object v3, v9, La/jnf0;->b:Ljava/util/List;

    .line 146
    .line 147
    move-object v5, v3

    .line 148
    iget-object v3, v9, La/jnf0;->d:La/ew9;

    .line 149
    .line 150
    iput-object v1, v2, La/j7d0;->i:Ljava/lang/String;

    .line 151
    .line 152
    iput-object v9, v2, La/j7d0;->j:La/jnf0;

    .line 153
    .line 154
    iput-object v8, v2, La/j7d0;->k:Ljava/util/Iterator;

    .line 155
    .line 156
    iput-object v8, v2, La/j7d0;->l:La/rl;

    .line 157
    .line 158
    iput v4, v2, La/j7d0;->o:I

    .line 159
    .line 160
    iget-object v4, p0, La/k7d0;->d:La/vne;

    .line 161
    .line 162
    move-object v0, v5

    .line 163
    move-object v5, v2

    .line 164
    move-object v2, v0

    .line 165
    move-object v0, p0

    .line 166
    invoke-virtual/range {v0 .. v5}, La/k7d0;->d(Ljava/lang/String;Ljava/util/List;La/ew9;La/vne;La/zje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    if-ne v0, v6, :cond_8

    .line 171
    .line 172
    :goto_4
    return-object v6

    .line 173
    :cond_8
    move-object v2, v1

    .line 174
    move-object v1, v0

    .line 175
    move-object v0, v9

    .line 176
    :goto_5
    check-cast v1, La/y6d0;

    .line 177
    .line 178
    instance-of v3, v1, La/x6d0;

    .line 179
    .line 180
    const-string v4, "PruningCameraDeviceManager: Failed to open "

    .line 181
    .line 182
    const-string v5, "CXCP"

    .line 183
    .line 184
    if-eqz v3, :cond_a

    .line 185
    .line 186
    check-cast v1, La/x6d0;

    .line 187
    .line 188
    iget-object v10, v1, La/x6d0;->a:La/rl;

    .line 189
    .line 190
    invoke-virtual {v10}, La/rl;->a()La/m050;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    if-eqz v11, :cond_9

    .line 195
    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v1, "PruningCameraDeviceManager: "

    .line 199
    .line 200
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v2}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v1, " opened successfully"

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    invoke-interface {v7, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v2}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v2, ": Camera may have been closed (possibly due to an error) immediately after opening"

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-static {v5, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    iget-object v0, v0, La/jnf0;->a:La/jnu0;

    .line 251
    .line 252
    invoke-virtual {v0, v8}, La/jnu0;->a(La/az9;)V

    .line 253
    .line 254
    .line 255
    new-instance v0, La/a7d0;

    .line 256
    .line 257
    invoke-direct {v0, v8}, La/a7d0;-><init>(La/az9;)V

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :cond_a
    instance-of v3, v1, La/w6d0;

    .line 262
    .line 263
    if-eqz v3, :cond_b

    .line 264
    .line 265
    new-instance v3, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v2}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-static {v5, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    iget-object v0, v0, La/jnf0;->a:La/jnu0;

    .line 285
    .line 286
    check-cast v1, La/w6d0;

    .line 287
    .line 288
    iget-object v1, v1, La/w6d0;->a:La/az9;

    .line 289
    .line 290
    invoke-virtual {v0, v1}, La/jnu0;->a(La/az9;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, La/a7d0;

    .line 294
    .line 295
    invoke-direct {v0, v1}, La/a7d0;-><init>(La/az9;)V

    .line 296
    .line 297
    .line 298
    return-object v0

    .line 299
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 300
    .line 301
    .line 302
    return-object v8

    .line 303
    :cond_c
    :goto_6
    new-instance v0, La/b7d0;

    .line 304
    .line 305
    if-eqz v11, :cond_d

    .line 306
    .line 307
    invoke-direct {v0, v10, v11}, La/b7d0;-><init>(La/rl;La/m050;)V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :cond_d
    const-string v0, "Required value was null."

    .line 312
    .line 313
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    return-object v8
.end method
