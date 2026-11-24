.class public final La/oqd;
.super La/yge0;
.source "SourceFile"


# instance fields
.field public final d:La/xzp;


# direct methods
.method public constructor <init>(La/nqd;Ljava/util/List;)V
    .locals 8

    .line 1
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/xzp;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, La/xzp;-><init>(La/oqd;La/nqd;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/oqd;->d:La/xzp;

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p2, :cond_9

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, La/yge0;

    .line 27
    .line 28
    iget-object v1, p0, La/oqd;->d:La/xzp;

    .line 29
    .line 30
    iget-object v2, v1, La/xzp;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    if-ltz v3, :cond_8

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-gt v3, v5, :cond_8

    .line 46
    .line 47
    iget-boolean v5, p2, La/yge0;->b:Z

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    const-string v5, "ConcatAdapter"

    .line 52
    .line 53
    const-string v6, "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids"

    .line 54
    .line 55
    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    :goto_1
    const/4 v6, -0x1

    .line 63
    if-ge v0, v5, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, La/nj50;

    .line 70
    .line 71
    iget-object v7, v7, La/nj50;->c:La/yge0;

    .line 72
    .line 73
    if-ne v7, p2, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move v0, v6

    .line 80
    :goto_2
    if-ne v0, v6, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object v4, v0

    .line 88
    check-cast v4, La/nj50;

    .line 89
    .line 90
    :goto_3
    if-eqz v4, :cond_4

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    new-instance v0, La/nj50;

    .line 94
    .line 95
    iget-object v4, v1, La/xzp;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, La/zlu0;

    .line 98
    .line 99
    iget-object v5, v1, La/xzp;->g:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v5, La/dpi0;

    .line 102
    .line 103
    iget-object v5, v5, La/dpi0;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, La/gle0;

    .line 106
    .line 107
    invoke-direct {v0, p2, v1, v4, v5}, La/nj50;-><init>(La/yge0;La/xzp;La/zlu0;La/gle0;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v1, La/xzp;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    :cond_5
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_6

    .line 126
    .line 127
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 138
    .line 139
    if-eqz v3, :cond_5

    .line 140
    .line 141
    invoke-virtual {p2, v3}, La/yge0;->m(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    iget p2, v0, La/nj50;->e:I

    .line 146
    .line 147
    if-lez p2, :cond_7

    .line 148
    .line 149
    iget-object p2, v1, La/xzp;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p2, La/oqd;

    .line 152
    .line 153
    invoke-virtual {v1, v0}, La/xzp;->m(La/nj50;)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    iget v0, v0, La/nj50;->e:I

    .line 158
    .line 159
    invoke-virtual {p2, v2, v0}, La/yge0;->k(II)V

    .line 160
    .line 161
    .line 162
    :cond_7
    invoke-virtual {v1}, La/xzp;->f()V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    const-string p1, ". Given:"

    .line 172
    .line 173
    const-string p2, "Index must be between 0 and "

    .line 174
    .line 175
    invoke-static {p0, v3, p1, p2}, La/ohq;->g(IILjava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v4

    .line 179
    :cond_9
    iget-object p1, p0, La/oqd;->d:La/xzp;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v0}, La/yge0;->w(Z)V

    .line 185
    .line 186
    .line 187
    return-void
.end method


# virtual methods
.method public final c(La/yge0;La/xhe0;I)I
    .locals 4

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    iget-object v0, p0, La/xzp;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/nj50;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object v1, v0, La/nj50;->c:La/yge0;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/xzp;->m(La/nj50;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    sub-int/2addr p3, p0

    .line 24
    invoke-virtual {v1}, La/yge0;->d()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-ltz p3, :cond_1

    .line 29
    .line 30
    if-ge p3, p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1, p1, p2, p3}, La/yge0;->c(La/yge0;La/xhe0;I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, " which is out of bounds for the adapter with size "

    .line 40
    .line 41
    const-string v2, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"

    .line 42
    .line 43
    const-string v3, "Detected inconsistent adapter updates. The local position of the view holder maps to "

    .line 44
    .line 45
    invoke-static {v3, p3, v1, v2, p0}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p2, "adapter:"

    .line 53
    .line 54
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
.end method

.method public final d()I
    .locals 2

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    iget-object p0, p0, La/xzp;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La/nj50;

    .line 23
    .line 24
    iget v1, v1, La/nj50;->e:I

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v0
.end method

.method public final e(I)J
    .locals 3

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xzp;->p(I)La/u3u0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, La/u3u0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/nj50;

    .line 10
    .line 11
    iget v1, p1, La/u3u0;->a:I

    .line 12
    .line 13
    iget-object v2, v0, La/nj50;->c:La/yge0;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, La/yge0;->e(I)J

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/nj50;->b:La/gle0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p1, La/u3u0;->b:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p1, La/u3u0;->c:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    iput v0, p1, La/u3u0;->a:I

    .line 31
    .line 32
    iput-object p1, p0, La/xzp;->f:Ljava/lang/Object;

    .line 33
    .line 34
    const-wide/16 p0, -0x1

    .line 35
    .line 36
    return-wide p0
.end method

.method public final f(I)I
    .locals 3

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xzp;->p(I)La/u3u0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, La/u3u0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/nj50;

    .line 10
    .line 11
    iget v1, p1, La/u3u0;->a:I

    .line 12
    .line 13
    iget-object v2, v0, La/nj50;->a:La/ylu0;

    .line 14
    .line 15
    iget-object v0, v0, La/nj50;->c:La/yge0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/yge0;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-interface {v2, v0}, La/ylu0;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, p1, La/u3u0;->b:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, p1, La/u3u0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    iput v1, p1, La/u3u0;->a:I

    .line 33
    .line 34
    iput-object p1, p0, La/xzp;->f:Ljava/lang/Object;

    .line 35
    .line 36
    return v0
.end method

.method public final m(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    iget-object v0, p0, La/xzp;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-ne v2, p1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/xzp;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/nj50;

    .line 57
    .line 58
    iget-object v0, v0, La/nj50;->c:La/yge0;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, La/yge0;->m(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    return-void
.end method

.method public final n(La/xhe0;I)V
    .locals 2

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/xzp;->p(I)La/u3u0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, La/xzp;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 10
    .line 11
    iget-object v1, p2, La/u3u0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/nj50;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v0, p2, La/u3u0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/nj50;

    .line 21
    .line 22
    iget v1, p2, La/u3u0;->a:I

    .line 23
    .line 24
    iget-object v0, v0, La/nj50;->c:La/yge0;

    .line 25
    .line 26
    invoke-virtual {v0, p1, v1}, La/yge0;->a(La/xhe0;I)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p2, La/u3u0;->b:Z

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-object p1, p2, La/u3u0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 p1, -0x1

    .line 36
    iput p1, p2, La/u3u0;->a:I

    .line 37
    .line 38
    iput-object p2, p0, La/xzp;->f:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 1

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    iget-object p0, p0, La/xzp;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/zlu0;

    .line 6
    .line 7
    invoke-interface {p0, p2}, La/zlu0;->b(I)La/nj50;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object v0, p0, La/nj50;->a:La/ylu0;

    .line 12
    .line 13
    invoke-interface {v0, p2}, La/ylu0;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget-object p0, p0, La/nj50;->c:La/yge0;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, La/yge0;->p(Landroid/view/ViewGroup;I)La/xhe0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final q(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    iget-object v0, p0, La/xzp;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-ne v2, p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_2
    iget-object p0, p0, La/xzp;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/nj50;

    .line 63
    .line 64
    iget-object v0, v0, La/nj50;->c:La/yge0;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, La/yge0;->q(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    return-void
.end method

.method public final r(La/xhe0;)Z
    .locals 2

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    iget-object v0, p0, La/xzp;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/nj50;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p0, v1, La/nj50;->c:La/yge0;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/yge0;->r(La/xhe0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return p0

    .line 25
    :cond_0
    const-string v0, "Cannot find wrapper for "

    .line 26
    .line 27
    const-string v1, ", seems like it is not bound by this adapter: "

    .line 28
    .line 29
    invoke-static {v0, p1, v1, p0}, La/c99;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final s(La/xhe0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xzp;->K(La/xhe0;)La/nj50;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/nj50;->c:La/yge0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/yge0;->s(La/xhe0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final t(La/xhe0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xzp;->K(La/xhe0;)La/nj50;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/nj50;->c:La/yge0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/yge0;->t(La/xhe0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final u(La/xhe0;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/oqd;->d:La/xzp;

    .line 2
    .line 3
    iget-object v0, p0, La/xzp;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/nj50;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p0, v1, La/nj50;->c:La/yge0;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/yge0;->u(La/xhe0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v0, "Cannot find wrapper for "

    .line 25
    .line 26
    const-string v1, ", seems like it is not bound by this adapter: "

    .line 27
    .line 28
    invoke-static {v0, p1, v1, p0}, La/c99;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final x(I)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final z(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/yge0;->x(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
