.class public final La/msj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/media3/common/b;Landroidx/media3/common/b;IILa/k34;La/p34;La/bmq0;Ljava/lang/Object;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/msj;->c:Ljava/lang/Object;

    .line 37
    iput-object p2, p0, La/msj;->d:Ljava/lang/Object;

    .line 38
    iput p3, p0, La/msj;->a:I

    .line 39
    iput p4, p0, La/msj;->b:I

    .line 40
    iput-object p5, p0, La/msj;->e:Ljava/lang/Object;

    .line 41
    iput-object p6, p0, La/msj;->f:Ljava/lang/Object;

    .line 42
    iput-object p7, p0, La/msj;->g:Ljava/lang/Object;

    .line 43
    iput-object p8, p0, La/msj;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/msj;->h:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/msj;->c:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, La/msj;->d:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/msj;->e:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/msj;->f:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, La/msj;->a:I

    .line 31
    .line 32
    iput p1, p0, La/msj;->b:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a(La/xhe0;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->q(La/xhe0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, La/msj;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->O1:La/zhe0;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, v2, La/zhe0;->e:La/yhe0;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-object v2, v2, La/yhe0;->e:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, La/p6;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v3

    .line 29
    :goto_0
    invoke-static {v0, v2}, La/rgu0;->o(Landroid/view/View;La/p6;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz p2, :cond_5

    .line 33
    .line 34
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-gtz v2, :cond_4

    .line 41
    .line 42
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2, p1}, La/yge0;->u(La/xhe0;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->H1:La/the0;

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->g:La/trm0;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, La/trm0;->p(La/xhe0;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->e2:Z

    .line 59
    .line 60
    if-eqz p2, :cond_5

    .line 61
    .line 62
    new-instance p2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, "dispatchViewRecycled: "

    .line 65
    .line 66
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const-string v1, "RecyclerView"

    .line 77
    .line 78
    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    const/4 p0, 0x0

    .line 83
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {}, La/hny;->b()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    :goto_1
    iput-object v3, p1, La/xhe0;->s:La/yge0;

    .line 95
    .line 96
    iput-object v3, p1, La/xhe0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 97
    .line 98
    invoke-virtual {p0}, La/msj;->d()La/nhe0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget p2, p1, La/xhe0;->f:I

    .line 106
    .line 107
    invoke-virtual {p0, p2}, La/nhe0;->b(I)La/mhe0;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, La/mhe0;->a:Ljava/util/ArrayList;

    .line 112
    .line 113
    iget-object p0, p0, La/nhe0;->a:Landroid/util/SparseArray;

    .line 114
    .line 115
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/mhe0;

    .line 120
    .line 121
    iget-byte p0, p0, La/mhe0;->b:B

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-gt p0, p2, :cond_6

    .line 128
    .line 129
    invoke-static {v0}, La/b8k0;->y(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->d2:Z

    .line 134
    .line 135
    if-eqz p0, :cond_8

    .line 136
    .line 137
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-nez p0, :cond_7

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    const-string p0, "this scrap item already exists"

    .line 145
    .line 146
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_8
    :goto_2
    invoke-virtual {p1}, La/xhe0;->p()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public b(I)I
    .locals 4

    .line 1
    iget-object p0, p0, La/msj;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H1:La/the0;

    .line 6
    .line 7
    if-ltz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, La/the0;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge p1, v1, :cond_1

    .line 14
    .line 15
    iget-boolean v0, v0, La/the0;->g:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:La/fp;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, p1, v0}, La/fp;->u(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    const-string v2, "invalid position "

    .line 31
    .line 32
    const-string v3, ". State item count is "

    .line 33
    .line 34
    invoke-static {p1, v2, v3}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0}, La/the0;->b()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1
.end method

.method public c(La/k34;)La/msj;
    .locals 9

    .line 1
    new-instance v0, La/msj;

    .line 2
    .line 3
    iget-object v1, p0, La/msj;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroidx/media3/common/b;

    .line 6
    .line 7
    iget-object v2, p0, La/msj;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroidx/media3/common/b;

    .line 10
    .line 11
    iget v3, p0, La/msj;->a:I

    .line 12
    .line 13
    iget v4, p0, La/msj;->b:I

    .line 14
    .line 15
    iget-object v5, p0, La/msj;->f:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    check-cast v6, La/p34;

    .line 19
    .line 20
    iget-object v5, p0, La/msj;->g:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v7, v5

    .line 23
    check-cast v7, La/bmq0;

    .line 24
    .line 25
    iget-object v8, p0, La/msj;->h:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v5, p1

    .line 28
    invoke-direct/range {v0 .. v8}, La/msj;-><init>(Landroidx/media3/common/b;Landroidx/media3/common/b;IILa/k34;La/p34;La/bmq0;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public d()La/nhe0;
    .locals 1

    .line 1
    iget-object v0, p0, La/msj;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/nhe0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, La/nhe0;

    .line 8
    .line 9
    invoke-direct {v0}, La/nhe0;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/msj;->g:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p0}, La/msj;->g()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, La/msj;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/nhe0;

    .line 20
    .line 21
    return-object p0
.end method

.method public e(I)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, La/msj;->o(IJ)La/xhe0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, La/xhe0;->a:Landroid/view/View;

    .line 11
    .line 12
    return-object p0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/msj;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/media3/common/b;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 6
    .line 7
    const-string v0, "audio/raw"

    .line 8
    .line 9
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, La/msj;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/nhe0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/msj;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p0, v0, La/nhe0;->c:Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public h(La/yge0;Z)V
    .locals 3

    .line 1
    iget-object p0, p0, La/msj;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nhe0;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, La/nhe0;->a:Landroid/util/SparseArray;

    .line 8
    .line 9
    iget-object p0, p0, La/nhe0;->c:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    move p1, p0

    .line 24
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-ge p1, p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, La/mhe0;

    .line 39
    .line 40
    iget-object p2, p2, La/mhe0;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    move v1, p0

    .line 43
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-ge v1, v2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, La/xhe0;

    .line 54
    .line 55
    iget-object v2, v2, La/xhe0;->a:Landroid/view/View;

    .line 56
    .line 57
    invoke-static {v2}, La/b8k0;->y(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, La/msj;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1}, La/msj;->j(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, -0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 20
    .line 21
    .line 22
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->i2:Z

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, La/msj;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 29
    .line 30
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->G1:La/yjc;

    .line 31
    .line 32
    iget-object v0, p0, La/yjc;->c:[I

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    iput v0, p0, La/yjc;->d:I

    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public j(I)V
    .locals 5

    .line 1
    iget-object v0, p0, La/msj;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->e2:Z

    .line 6
    .line 7
    const-string v2, "RecyclerView"

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Recycling cached view at index "

    .line 14
    .line 15
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/xhe0;

    .line 33
    .line 34
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->e2:Z

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "CachedViewHolder to be recycled: "

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_1
    const/4 v2, 0x1

    .line 56
    invoke-virtual {p0, v1, v2}, La/msj;->a(La/xhe0;Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public k(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/msj;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, La/xhe0;->m()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, La/xhe0;->l()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, v1, La/xhe0;->n:La/msj;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, La/msj;->p(La/xhe0;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v1}, La/xhe0;->s()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget p1, v1, La/xhe0;->j:I

    .line 38
    .line 39
    and-int/lit8 p1, p1, -0x21

    .line 40
    .line 41
    iput p1, v1, La/xhe0;->j:I

    .line 42
    .line 43
    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, La/msj;->l(La/xhe0;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->p1:La/ehe0;

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1}, La/xhe0;->j()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->p1:La/ehe0;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, La/ehe0;->d(La/xhe0;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public l(La/xhe0;)V
    .locals 12

    .line 1
    iget-object v0, p0, La/msj;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, La/msj;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->G1:La/yjc;

    .line 10
    .line 11
    invoke-virtual {p1}, La/xhe0;->l()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    iget-object v4, p1, La/xhe0;->a:Landroid/view/View;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x1

    .line 19
    if-nez v3, :cond_14

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_c

    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, La/xhe0;->m()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_13

    .line 34
    .line 35
    invoke-virtual {p1}, La/xhe0;->r()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_12

    .line 40
    .line 41
    iget v3, p1, La/xhe0;->j:I

    .line 42
    .line 43
    and-int/lit8 v3, v3, 0x10

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    sget-object v3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/view/View;->hasTransientState()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    move v3, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v3, v5

    .line 58
    :goto_0
    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 59
    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-virtual {v7, p1}, La/yge0;->r(La/xhe0;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_2

    .line 69
    .line 70
    move v7, v6

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v7, v5

    .line 73
    :goto_1
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->d2:Z

    .line 74
    .line 75
    if-eqz v8, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-nez v8, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v0, "cached view received recycle internal? "

    .line 87
    .line 88
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p0, p1}, La/c99;->q(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    :goto_2
    if-nez v7, :cond_7

    .line 103
    .line 104
    invoke-virtual {p1}, La/xhe0;->j()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_5

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->e2:Z

    .line 112
    .line 113
    if-eqz p0, :cond_6

    .line 114
    .line 115
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v0, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string v0, "RecyclerView"

    .line 126
    .line 127
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_6
    move v6, v5

    .line 131
    goto/16 :goto_b

    .line 132
    .line 133
    :cond_7
    :goto_3
    iget v7, p0, La/msj;->b:I

    .line 134
    .line 135
    if-lez v7, :cond_f

    .line 136
    .line 137
    iget v7, p1, La/xhe0;->j:I

    .line 138
    .line 139
    and-int/lit16 v7, v7, 0x20e

    .line 140
    .line 141
    if-eqz v7, :cond_8

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    iget v8, p0, La/msj;->b:I

    .line 149
    .line 150
    if-lt v7, v8, :cond_9

    .line 151
    .line 152
    if-lez v7, :cond_9

    .line 153
    .line 154
    invoke-virtual {p0, v5}, La/msj;->j(I)V

    .line 155
    .line 156
    .line 157
    add-int/lit8 v7, v7, -0x1

    .line 158
    .line 159
    :cond_9
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->i2:Z

    .line 160
    .line 161
    if-eqz v8, :cond_e

    .line 162
    .line 163
    if-lez v7, :cond_e

    .line 164
    .line 165
    iget v8, p1, La/xhe0;->c:I

    .line 166
    .line 167
    iget-object v9, v2, La/yjc;->c:[I

    .line 168
    .line 169
    if-eqz v9, :cond_b

    .line 170
    .line 171
    iget v9, v2, La/yjc;->d:I

    .line 172
    .line 173
    mul-int/lit8 v9, v9, 0x2

    .line 174
    .line 175
    move v10, v5

    .line 176
    :goto_4
    if-ge v10, v9, :cond_b

    .line 177
    .line 178
    iget-object v11, v2, La/yjc;->c:[I

    .line 179
    .line 180
    aget v11, v11, v10

    .line 181
    .line 182
    if-ne v11, v8, :cond_a

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_a
    add-int/lit8 v10, v10, 0x2

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_b
    add-int/lit8 v7, v7, -0x1

    .line 189
    .line 190
    :goto_5
    if-ltz v7, :cond_d

    .line 191
    .line 192
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    check-cast v8, La/xhe0;

    .line 197
    .line 198
    iget v8, v8, La/xhe0;->c:I

    .line 199
    .line 200
    iget-object v9, v2, La/yjc;->c:[I

    .line 201
    .line 202
    if-eqz v9, :cond_d

    .line 203
    .line 204
    iget v9, v2, La/yjc;->d:I

    .line 205
    .line 206
    mul-int/lit8 v9, v9, 0x2

    .line 207
    .line 208
    move v10, v5

    .line 209
    :goto_6
    if-ge v10, v9, :cond_d

    .line 210
    .line 211
    iget-object v11, v2, La/yjc;->c:[I

    .line 212
    .line 213
    aget v11, v11, v10

    .line 214
    .line 215
    if-ne v11, v8, :cond_c

    .line 216
    .line 217
    add-int/lit8 v7, v7, -0x1

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_c
    add-int/lit8 v10, v10, 0x2

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_d
    add-int/2addr v7, v6

    .line 224
    :cond_e
    :goto_7
    invoke-virtual {v0, v7, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    move v0, v6

    .line 228
    goto :goto_9

    .line 229
    :cond_f
    :goto_8
    move v0, v5

    .line 230
    :goto_9
    if-nez v0, :cond_10

    .line 231
    .line 232
    invoke-virtual {p0, p1, v6}, La/msj;->a(La/xhe0;Z)V

    .line 233
    .line 234
    .line 235
    :goto_a
    move v5, v0

    .line 236
    goto :goto_b

    .line 237
    :cond_10
    move v6, v5

    .line 238
    goto :goto_a

    .line 239
    :goto_b
    iget-object p0, v1, Landroidx/recyclerview/widget/RecyclerView;->g:La/trm0;

    .line 240
    .line 241
    invoke-virtual {p0, p1}, La/trm0;->p(La/xhe0;)V

    .line 242
    .line 243
    .line 244
    if-nez v5, :cond_11

    .line 245
    .line 246
    if-nez v6, :cond_11

    .line 247
    .line 248
    if-eqz v3, :cond_11

    .line 249
    .line 250
    invoke-static {v4}, La/b8k0;->y(Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    const/4 p0, 0x0

    .line 254
    iput-object p0, p1, La/xhe0;->s:La/yge0;

    .line 255
    .line 256
    iput-object p0, p1, La/xhe0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 257
    .line 258
    :cond_11
    return-void

    .line 259
    :cond_12
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    const-string p1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 264
    .line 265
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string v0, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 276
    .line 277
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-static {p0, p1}, La/c99;->q(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_14
    :goto_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 292
    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    .line 296
    .line 297
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1}, La/xhe0;->l()Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string p1, " isAttached:"

    .line 308
    .line 309
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    if-eqz p1, :cond_15

    .line 317
    .line 318
    move v5, v6

    .line 319
    :cond_15
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw p0
.end method

.method public m(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/msj;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p1, La/xhe0;->j:I

    .line 10
    .line 11
    and-int/lit8 v1, v1, 0xc

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, La/xhe0;->n()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->p1:La/ehe0;

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-virtual {p1}, La/xhe0;->f()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v1, La/kvj;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-boolean v1, v1, La/kvj;->g:Z

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, La/xhe0;->i()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, La/msj;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, La/msj;->d:Ljava/lang/Object;

    .line 61
    .line 62
    :cond_2
    iput-object p0, p1, La/xhe0;->n:La/msj;

    .line 63
    .line 64
    const/4 p0, 0x1

    .line 65
    iput-boolean p0, p1, La/xhe0;->o:Z

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    :goto_0
    invoke-virtual {p1}, La/xhe0;->i()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-virtual {p1}, La/xhe0;->k()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_5

    .line 82
    .line 83
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 84
    .line 85
    iget-boolean v1, v1, La/yge0;->b:Z

    .line 86
    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string p1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    :goto_1
    iput-object p0, p1, La/xhe0;->n:La/msj;

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    iput-boolean v0, p1, La/xhe0;->o:Z

    .line 108
    .line 109
    iget-object p0, p0, La/msj;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public n(La/xhe0;IIJ)Z
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p1, La/xhe0;->s:La/yge0;

    .line 3
    .line 4
    iget-object v1, p1, La/xhe0;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v2, p0, La/msj;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iput-object v2, p1, La/xhe0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    iget v3, p1, La/xhe0;->f:I

    .line 13
    .line 14
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    const-wide v6, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v6, p4, v6

    .line 24
    .line 25
    const-wide/16 v7, 0x0

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    iget-object v6, p0, La/msj;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, La/nhe0;

    .line 33
    .line 34
    invoke-virtual {v6, v3}, La/nhe0;->b(I)La/mhe0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-wide v10, v3, La/mhe0;->d:J

    .line 39
    .line 40
    cmp-long v3, v10, v7

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    add-long/2addr v10, v4

    .line 45
    cmp-long v3, v10, p4

    .line 46
    .line 47
    if-gez v3, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return v9

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {p1}, La/xhe0;->m()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v6, 0x1

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-static {v2, v1, v3, v9}, Landroidx/recyclerview/widget/RecyclerView;->i(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    move v9, v6

    .line 70
    :cond_2
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 71
    .line 72
    move v10, p2

    .line 73
    invoke-virtual {v3, p1, p2}, La/yge0;->a(La/xhe0;I)V

    .line 74
    .line 75
    .line 76
    if-eqz v9, :cond_3

    .line 77
    .line 78
    invoke-static {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 82
    .line 83
    .line 84
    move-result-wide v9

    .line 85
    iget-object p0, p0, La/msj;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p0, La/nhe0;

    .line 88
    .line 89
    iget v3, p1, La/xhe0;->f:I

    .line 90
    .line 91
    sub-long/2addr v9, v4

    .line 92
    invoke-virtual {p0, v3}, La/nhe0;->b(I)La/mhe0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iget-wide v3, p0, La/mhe0;->d:J

    .line 97
    .line 98
    cmp-long v5, v3, v7

    .line 99
    .line 100
    if-nez v5, :cond_4

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    const-wide/16 v7, 0x4

    .line 104
    .line 105
    div-long/2addr v3, v7

    .line 106
    const-wide/16 v11, 0x3

    .line 107
    .line 108
    mul-long/2addr v3, v11

    .line 109
    div-long/2addr v9, v7

    .line 110
    add-long/2addr v9, v3

    .line 111
    :goto_1
    iput-wide v9, p0, La/mhe0;->d:J

    .line 112
    .line 113
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->B:Landroid/view/accessibility/AccessibilityManager;

    .line 114
    .line 115
    if-eqz p0, :cond_a

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_a

    .line 122
    .line 123
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_5

    .line 128
    .line 129
    invoke-virtual {v1, v6}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 130
    .line 131
    .line 132
    :cond_5
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->O1:La/zhe0;

    .line 133
    .line 134
    if-nez p0, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    iget-object p0, p0, La/zhe0;->e:La/yhe0;

    .line 138
    .line 139
    if-eqz p0, :cond_9

    .line 140
    .line 141
    invoke-static {v1}, La/rgu0;->e(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-nez v3, :cond_7

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_7
    instance-of v0, v3, La/o6;

    .line 149
    .line 150
    if-eqz v0, :cond_8

    .line 151
    .line 152
    check-cast v3, La/o6;

    .line 153
    .line 154
    iget-object v0, v3, La/o6;->a:La/p6;

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    new-instance v0, La/p6;

    .line 158
    .line 159
    invoke-direct {v0, v3}, La/p6;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    if-eqz v0, :cond_9

    .line 163
    .line 164
    if-eq v0, p0, :cond_9

    .line 165
    .line 166
    iget-object v3, p0, La/yhe0;->e:Ljava/util/WeakHashMap;

    .line 167
    .line 168
    invoke-virtual {v3, v1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    :cond_9
    invoke-static {v1, p0}, La/rgu0;->o(Landroid/view/View;La/p6;)V

    .line 172
    .line 173
    .line 174
    :cond_a
    :goto_3
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->H1:La/the0;

    .line 175
    .line 176
    iget-boolean p0, p0, La/the0;->g:Z

    .line 177
    .line 178
    if-eqz p0, :cond_b

    .line 179
    .line 180
    move/from16 p0, p3

    .line 181
    .line 182
    iput p0, p1, La/xhe0;->g:I

    .line 183
    .line 184
    :cond_b
    return v6
.end method

.method public o(IJ)La/xhe0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v3, p1

    .line 4
    .line 5
    iget-object v1, v0, La/msj;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, v0, La/msj;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v4, v0, La/msj;->h:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v6, v4

    .line 16
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->H1:La/the0;

    .line 19
    .line 20
    if-ltz v3, :cond_3e

    .line 21
    .line 22
    invoke-virtual {v4}, La/the0;->b()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-ge v3, v5, :cond_3e

    .line 27
    .line 28
    iget-boolean v5, v4, La/the0;->g:Z

    .line 29
    .line 30
    const/16 v7, 0x20

    .line 31
    .line 32
    const/4 v10, 0x0

    .line 33
    if-eqz v5, :cond_7

    .line 34
    .line 35
    iget-object v5, v0, La/msj;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ljava/util/ArrayList;

    .line 38
    .line 39
    if-eqz v5, :cond_5

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_0

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_0
    move v11, v10

    .line 50
    :goto_0
    if-ge v11, v5, :cond_2

    .line 51
    .line 52
    iget-object v12, v0, La/msj;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v12, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    check-cast v12, La/xhe0;

    .line 61
    .line 62
    invoke-virtual {v12}, La/xhe0;->s()Z

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    if-nez v13, :cond_1

    .line 67
    .line 68
    invoke-virtual {v12}, La/xhe0;->e()I

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    if-ne v13, v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {v12, v7}, La/xhe0;->b(I)V

    .line 75
    .line 76
    .line 77
    const/4 v15, 0x0

    .line 78
    const/16 v16, 0x1

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 85
    .line 86
    iget-boolean v11, v11, La/yge0;->b:Z

    .line 87
    .line 88
    if-eqz v11, :cond_5

    .line 89
    .line 90
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->e:La/fp;

    .line 91
    .line 92
    invoke-virtual {v11, v3, v10}, La/fp;->u(II)I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    if-lez v11, :cond_5

    .line 97
    .line 98
    iget-object v12, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 99
    .line 100
    invoke-virtual {v12}, La/yge0;->d()I

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    if-ge v11, v12, :cond_5

    .line 105
    .line 106
    iget-object v12, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 107
    .line 108
    invoke-virtual {v12, v11}, La/yge0;->e(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v11

    .line 112
    move v13, v10

    .line 113
    :goto_1
    if-ge v13, v5, :cond_5

    .line 114
    .line 115
    iget-object v14, v0, La/msj;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v14, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    check-cast v14, La/xhe0;

    .line 124
    .line 125
    invoke-virtual {v14}, La/xhe0;->s()Z

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-nez v15, :cond_3

    .line 130
    .line 131
    const/4 v15, 0x0

    .line 132
    const/16 v16, 0x1

    .line 133
    .line 134
    iget-wide v8, v14, La/xhe0;->e:J

    .line 135
    .line 136
    cmp-long v8, v8, v11

    .line 137
    .line 138
    if-nez v8, :cond_4

    .line 139
    .line 140
    invoke-virtual {v14, v7}, La/xhe0;->b(I)V

    .line 141
    .line 142
    .line 143
    move-object v12, v14

    .line 144
    goto :goto_3

    .line 145
    :cond_3
    const/4 v15, 0x0

    .line 146
    const/16 v16, 0x1

    .line 147
    .line 148
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    :goto_2
    const/4 v15, 0x0

    .line 152
    const/16 v16, 0x1

    .line 153
    .line 154
    move-object v12, v15

    .line 155
    :goto_3
    if-eqz v12, :cond_6

    .line 156
    .line 157
    move/from16 v5, v16

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    move v5, v10

    .line 161
    goto :goto_4

    .line 162
    :cond_7
    const/4 v15, 0x0

    .line 163
    const/16 v16, 0x1

    .line 164
    .line 165
    move v5, v10

    .line 166
    move-object v12, v15

    .line 167
    :goto_4
    const-string v8, "RecyclerView"

    .line 168
    .line 169
    if-nez v12, :cond_1f

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    move v11, v10

    .line 176
    :goto_5
    if-ge v11, v9, :cond_a

    .line 177
    .line 178
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    check-cast v12, La/xhe0;

    .line 183
    .line 184
    invoke-virtual {v12}, La/xhe0;->s()Z

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    if-nez v13, :cond_9

    .line 189
    .line 190
    invoke-virtual {v12}, La/xhe0;->e()I

    .line 191
    .line 192
    .line 193
    move-result v13

    .line 194
    if-ne v13, v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v12}, La/xhe0;->i()Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-nez v13, :cond_9

    .line 201
    .line 202
    iget-boolean v13, v4, La/the0;->g:Z

    .line 203
    .line 204
    if-nez v13, :cond_8

    .line 205
    .line 206
    invoke-virtual {v12}, La/xhe0;->k()Z

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    if-nez v13, :cond_9

    .line 211
    .line 212
    :cond_8
    invoke-virtual {v12, v7}, La/xhe0;->b(I)V

    .line 213
    .line 214
    .line 215
    move-object/from16 v17, v15

    .line 216
    .line 217
    move-object v15, v12

    .line 218
    goto/16 :goto_9

    .line 219
    .line 220
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_a
    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->f:La/iac;

    .line 224
    .line 225
    iget-object v9, v9, La/iac;->c:Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    move v12, v10

    .line 232
    :goto_6
    if-ge v12, v11, :cond_c

    .line 233
    .line 234
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    check-cast v13, Landroid/view/View;

    .line 239
    .line 240
    invoke-static {v13}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    move-object/from16 v17, v15

    .line 245
    .line 246
    invoke-virtual {v14}, La/xhe0;->e()I

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    if-ne v15, v3, :cond_b

    .line 251
    .line 252
    invoke-virtual {v14}, La/xhe0;->i()Z

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    if-nez v15, :cond_b

    .line 257
    .line 258
    invoke-virtual {v14}, La/xhe0;->k()Z

    .line 259
    .line 260
    .line 261
    move-result v14

    .line 262
    if-nez v14, :cond_b

    .line 263
    .line 264
    move-object v15, v13

    .line 265
    goto :goto_7

    .line 266
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 267
    .line 268
    move-object/from16 v15, v17

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_c
    move-object/from16 v17, v15

    .line 272
    .line 273
    :goto_7
    if-eqz v15, :cond_10

    .line 274
    .line 275
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->f:La/iac;

    .line 280
    .line 281
    iget-object v12, v11, La/iac;->b:La/hac;

    .line 282
    .line 283
    iget-object v13, v11, La/iac;->a:La/jw20;

    .line 284
    .line 285
    iget-object v13, v13, La/jw20;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v13, Landroidx/recyclerview/widget/RecyclerView;

    .line 288
    .line 289
    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    if-ltz v13, :cond_f

    .line 294
    .line 295
    invoke-virtual {v12, v13}, La/hac;->t(I)Z

    .line 296
    .line 297
    .line 298
    move-result v14

    .line 299
    if-eqz v14, :cond_e

    .line 300
    .line 301
    invoke-virtual {v12, v13}, La/hac;->p(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v11, v15}, La/iac;->l(Landroid/view/View;)V

    .line 305
    .line 306
    .line 307
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->f:La/iac;

    .line 308
    .line 309
    invoke-virtual {v11, v15}, La/iac;->j(Landroid/view/View;)I

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    const/4 v12, -0x1

    .line 314
    if-eq v11, v12, :cond_d

    .line 315
    .line 316
    iget-object v12, v6, Landroidx/recyclerview/widget/RecyclerView;->f:La/iac;

    .line 317
    .line 318
    invoke-virtual {v12, v11}, La/iac;->c(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v15}, La/msj;->m(Landroid/view/View;)V

    .line 322
    .line 323
    .line 324
    const/16 v11, 0x2020

    .line 325
    .line 326
    invoke-virtual {v9, v11}, La/xhe0;->b(I)V

    .line 327
    .line 328
    .line 329
    move-object v15, v9

    .line 330
    goto :goto_9

    .line 331
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    const-string v1, "layout index should not be -1 after unhiding a view:"

    .line 334
    .line 335
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-static {v0, v1}, La/itt0;->n(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    return-object v17

    .line 349
    :cond_e
    const-string v0, "trying to unhide a view that was not hidden"

    .line 350
    .line 351
    invoke-static {v15, v0}, La/e9d0;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-object v17

    .line 355
    :cond_f
    const-string v0, "view is not a child, cannot hide "

    .line 356
    .line 357
    invoke-static {v15, v0}, La/e9d0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    return-object v17

    .line 361
    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    move v11, v10

    .line 366
    :goto_8
    if-ge v11, v9, :cond_12

    .line 367
    .line 368
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    move-object v15, v12

    .line 373
    check-cast v15, La/xhe0;

    .line 374
    .line 375
    invoke-virtual {v15}, La/xhe0;->i()Z

    .line 376
    .line 377
    .line 378
    move-result v12

    .line 379
    if-nez v12, :cond_11

    .line 380
    .line 381
    invoke-virtual {v15}, La/xhe0;->e()I

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    if-ne v12, v3, :cond_11

    .line 386
    .line 387
    invoke-virtual {v15}, La/xhe0;->g()Z

    .line 388
    .line 389
    .line 390
    move-result v12

    .line 391
    if-nez v12, :cond_11

    .line 392
    .line 393
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->e2:Z

    .line 397
    .line 398
    if-eqz v9, :cond_13

    .line 399
    .line 400
    new-instance v9, Ljava/lang/StringBuilder;

    .line 401
    .line 402
    const-string v11, "getScrapOrHiddenOrCachedHolderForPosition("

    .line 403
    .line 404
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v11, ") found match in cache: "

    .line 411
    .line 412
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 423
    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_11
    add-int/lit8 v11, v11, 0x1

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_12
    move-object/from16 v15, v17

    .line 430
    .line 431
    :cond_13
    :goto_9
    if-eqz v15, :cond_1e

    .line 432
    .line 433
    invoke-virtual {v15}, La/xhe0;->k()Z

    .line 434
    .line 435
    .line 436
    move-result v9

    .line 437
    if-eqz v9, :cond_16

    .line 438
    .line 439
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->d2:Z

    .line 440
    .line 441
    if-eqz v9, :cond_15

    .line 442
    .line 443
    iget-boolean v9, v4, La/the0;->g:Z

    .line 444
    .line 445
    if-eqz v9, :cond_14

    .line 446
    .line 447
    goto :goto_a

    .line 448
    :cond_14
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    const-string v1, "should not receive a removed view unless it is pre layout"

    .line 453
    .line 454
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    return-object v17

    .line 462
    :cond_15
    :goto_a
    iget-boolean v9, v4, La/the0;->g:Z

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_16
    iget v9, v15, La/xhe0;->c:I

    .line 466
    .line 467
    if-ltz v9, :cond_1d

    .line 468
    .line 469
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 470
    .line 471
    invoke-virtual {v11}, La/yge0;->d()I

    .line 472
    .line 473
    .line 474
    move-result v11

    .line 475
    if-ge v9, v11, :cond_1d

    .line 476
    .line 477
    iget-boolean v9, v4, La/the0;->g:Z

    .line 478
    .line 479
    if-nez v9, :cond_18

    .line 480
    .line 481
    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 482
    .line 483
    iget v11, v15, La/xhe0;->c:I

    .line 484
    .line 485
    invoke-virtual {v9, v11}, La/yge0;->f(I)I

    .line 486
    .line 487
    .line 488
    move-result v9

    .line 489
    iget v11, v15, La/xhe0;->f:I

    .line 490
    .line 491
    if-eq v9, v11, :cond_18

    .line 492
    .line 493
    :cond_17
    move v9, v10

    .line 494
    goto :goto_b

    .line 495
    :cond_18
    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 496
    .line 497
    iget-boolean v11, v9, La/yge0;->b:Z

    .line 498
    .line 499
    if-eqz v11, :cond_19

    .line 500
    .line 501
    iget-wide v11, v15, La/xhe0;->e:J

    .line 502
    .line 503
    iget v13, v15, La/xhe0;->c:I

    .line 504
    .line 505
    invoke-virtual {v9, v13}, La/yge0;->e(I)J

    .line 506
    .line 507
    .line 508
    move-result-wide v13

    .line 509
    cmp-long v9, v11, v13

    .line 510
    .line 511
    if-nez v9, :cond_17

    .line 512
    .line 513
    :cond_19
    move/from16 v9, v16

    .line 514
    .line 515
    :goto_b
    if-nez v9, :cond_1c

    .line 516
    .line 517
    const/4 v9, 0x4

    .line 518
    invoke-virtual {v15, v9}, La/xhe0;->b(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v15}, La/xhe0;->l()Z

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    if-eqz v9, :cond_1a

    .line 526
    .line 527
    iget-object v9, v15, La/xhe0;->a:Landroid/view/View;

    .line 528
    .line 529
    invoke-virtual {v6, v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 530
    .line 531
    .line 532
    iget-object v9, v15, La/xhe0;->n:La/msj;

    .line 533
    .line 534
    invoke-virtual {v9, v15}, La/msj;->p(La/xhe0;)V

    .line 535
    .line 536
    .line 537
    goto :goto_c

    .line 538
    :cond_1a
    invoke-virtual {v15}, La/xhe0;->s()Z

    .line 539
    .line 540
    .line 541
    move-result v9

    .line 542
    if-eqz v9, :cond_1b

    .line 543
    .line 544
    iget v9, v15, La/xhe0;->j:I

    .line 545
    .line 546
    and-int/lit8 v9, v9, -0x21

    .line 547
    .line 548
    iput v9, v15, La/xhe0;->j:I

    .line 549
    .line 550
    :cond_1b
    :goto_c
    invoke-virtual {v0, v15}, La/msj;->l(La/xhe0;)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v12, v17

    .line 554
    .line 555
    goto :goto_d

    .line 556
    :cond_1c
    move-object v12, v15

    .line 557
    move/from16 v5, v16

    .line 558
    .line 559
    goto :goto_d

    .line 560
    :cond_1d
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 561
    .line 562
    new-instance v1, Ljava/lang/StringBuilder;

    .line 563
    .line 564
    const-string v2, "Inconsistency detected. Invalid view holder adapter position"

    .line 565
    .line 566
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v0

    .line 587
    :cond_1e
    move-object v12, v15

    .line 588
    goto :goto_d

    .line 589
    :cond_1f
    move-object/from16 v17, v15

    .line 590
    .line 591
    :goto_d
    if-nez v12, :cond_32

    .line 592
    .line 593
    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->e:La/fp;

    .line 594
    .line 595
    invoke-virtual {v9, v3, v10}, La/fp;->u(II)I

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    if-ltz v9, :cond_33

    .line 600
    .line 601
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 602
    .line 603
    invoke-virtual {v11}, La/yge0;->d()I

    .line 604
    .line 605
    .line 606
    move-result v11

    .line 607
    if-ge v9, v11, :cond_33

    .line 608
    .line 609
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 610
    .line 611
    invoke-virtual {v11, v9}, La/yge0;->f(I)I

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    iget-object v13, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 616
    .line 617
    iget-boolean v14, v13, La/yge0;->b:Z

    .line 618
    .line 619
    if-eqz v14, :cond_28

    .line 620
    .line 621
    invoke-virtual {v13, v9}, La/yge0;->e(I)J

    .line 622
    .line 623
    .line 624
    move-result-wide v12

    .line 625
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 626
    .line 627
    .line 628
    move-result v14

    .line 629
    add-int/lit8 v14, v14, -0x1

    .line 630
    .line 631
    :goto_e
    if-ltz v14, :cond_23

    .line 632
    .line 633
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v15

    .line 637
    check-cast v15, La/xhe0;

    .line 638
    .line 639
    move-object/from16 v19, v8

    .line 640
    .line 641
    iget-wide v7, v15, La/xhe0;->e:J

    .line 642
    .line 643
    iget-object v10, v15, La/xhe0;->a:Landroid/view/View;

    .line 644
    .line 645
    cmp-long v7, v7, v12

    .line 646
    .line 647
    if-nez v7, :cond_22

    .line 648
    .line 649
    invoke-virtual {v15}, La/xhe0;->s()Z

    .line 650
    .line 651
    .line 652
    move-result v7

    .line 653
    if-nez v7, :cond_22

    .line 654
    .line 655
    iget v7, v15, La/xhe0;->f:I

    .line 656
    .line 657
    if-ne v11, v7, :cond_21

    .line 658
    .line 659
    const/16 v7, 0x20

    .line 660
    .line 661
    invoke-virtual {v15, v7}, La/xhe0;->b(I)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v15}, La/xhe0;->k()Z

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    if-eqz v1, :cond_20

    .line 669
    .line 670
    iget-boolean v1, v4, La/the0;->g:Z

    .line 671
    .line 672
    if-nez v1, :cond_20

    .line 673
    .line 674
    iget v1, v15, La/xhe0;->j:I

    .line 675
    .line 676
    and-int/lit8 v1, v1, -0xf

    .line 677
    .line 678
    or-int/lit8 v1, v1, 0x2

    .line 679
    .line 680
    iput v1, v15, La/xhe0;->j:I

    .line 681
    .line 682
    :cond_20
    move-object v7, v15

    .line 683
    goto :goto_11

    .line 684
    :cond_21
    const/16 v7, 0x20

    .line 685
    .line 686
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    const/4 v8, 0x0

    .line 690
    invoke-virtual {v6, v10, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 691
    .line 692
    .line 693
    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 694
    .line 695
    .line 696
    move-result-object v10

    .line 697
    move-object/from16 v15, v17

    .line 698
    .line 699
    iput-object v15, v10, La/xhe0;->n:La/msj;

    .line 700
    .line 701
    iput-boolean v8, v10, La/xhe0;->o:Z

    .line 702
    .line 703
    iget v8, v10, La/xhe0;->j:I

    .line 704
    .line 705
    and-int/lit8 v8, v8, -0x21

    .line 706
    .line 707
    iput v8, v10, La/xhe0;->j:I

    .line 708
    .line 709
    invoke-virtual {v0, v10}, La/msj;->l(La/xhe0;)V

    .line 710
    .line 711
    .line 712
    goto :goto_f

    .line 713
    :cond_22
    const/16 v7, 0x20

    .line 714
    .line 715
    :goto_f
    add-int/lit8 v14, v14, -0x1

    .line 716
    .line 717
    move-object/from16 v8, v19

    .line 718
    .line 719
    const/4 v10, 0x0

    .line 720
    const/16 v17, 0x0

    .line 721
    .line 722
    goto :goto_e

    .line 723
    :cond_23
    move-object/from16 v19, v8

    .line 724
    .line 725
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    add-int/lit8 v1, v1, -0x1

    .line 730
    .line 731
    :goto_10
    if-ltz v1, :cond_25

    .line 732
    .line 733
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v7

    .line 737
    check-cast v7, La/xhe0;

    .line 738
    .line 739
    move-wide/from16 v17, v12

    .line 740
    .line 741
    iget-wide v12, v7, La/xhe0;->e:J

    .line 742
    .line 743
    cmp-long v8, v12, v17

    .line 744
    .line 745
    if-nez v8, :cond_26

    .line 746
    .line 747
    invoke-virtual {v7}, La/xhe0;->g()Z

    .line 748
    .line 749
    .line 750
    move-result v8

    .line 751
    if-nez v8, :cond_26

    .line 752
    .line 753
    iget v8, v7, La/xhe0;->f:I

    .line 754
    .line 755
    if-ne v11, v8, :cond_24

    .line 756
    .line 757
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    goto :goto_11

    .line 761
    :cond_24
    invoke-virtual {v0, v1}, La/msj;->j(I)V

    .line 762
    .line 763
    .line 764
    :cond_25
    const/4 v7, 0x0

    .line 765
    goto :goto_11

    .line 766
    :cond_26
    add-int/lit8 v1, v1, -0x1

    .line 767
    .line 768
    move-wide/from16 v12, v17

    .line 769
    .line 770
    goto :goto_10

    .line 771
    :goto_11
    if-eqz v7, :cond_27

    .line 772
    .line 773
    iput v9, v7, La/xhe0;->c:I

    .line 774
    .line 775
    move-object v12, v7

    .line 776
    move/from16 v5, v16

    .line 777
    .line 778
    goto :goto_12

    .line 779
    :cond_27
    move-object v12, v7

    .line 780
    goto :goto_12

    .line 781
    :cond_28
    move-object/from16 v19, v8

    .line 782
    .line 783
    :goto_12
    if-nez v12, :cond_2d

    .line 784
    .line 785
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->e2:Z

    .line 786
    .line 787
    if-eqz v1, :cond_29

    .line 788
    .line 789
    new-instance v1, Ljava/lang/StringBuilder;

    .line 790
    .line 791
    const-string v2, "tryGetViewHolderForPositionByDeadline("

    .line 792
    .line 793
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    const-string v2, ") fetching from shared pool"

    .line 800
    .line 801
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    move-object/from16 v2, v19

    .line 809
    .line 810
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 811
    .line 812
    .line 813
    goto :goto_13

    .line 814
    :cond_29
    move-object/from16 v2, v19

    .line 815
    .line 816
    :goto_13
    invoke-virtual {v0}, La/msj;->d()La/nhe0;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    iget-object v1, v1, La/nhe0;->a:Landroid/util/SparseArray;

    .line 821
    .line 822
    invoke-virtual {v1, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    check-cast v1, La/mhe0;

    .line 827
    .line 828
    if-eqz v1, :cond_2b

    .line 829
    .line 830
    iget-object v1, v1, La/mhe0;->a:Ljava/util/ArrayList;

    .line 831
    .line 832
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 833
    .line 834
    .line 835
    move-result v7

    .line 836
    if-nez v7, :cond_2b

    .line 837
    .line 838
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 839
    .line 840
    .line 841
    move-result v7

    .line 842
    add-int/lit8 v7, v7, -0x1

    .line 843
    .line 844
    :goto_14
    if-ltz v7, :cond_2b

    .line 845
    .line 846
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v8

    .line 850
    check-cast v8, La/xhe0;

    .line 851
    .line 852
    invoke-virtual {v8}, La/xhe0;->g()Z

    .line 853
    .line 854
    .line 855
    move-result v8

    .line 856
    if-nez v8, :cond_2a

    .line 857
    .line 858
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    check-cast v1, La/xhe0;

    .line 863
    .line 864
    goto :goto_15

    .line 865
    :cond_2a
    add-int/lit8 v7, v7, -0x1

    .line 866
    .line 867
    goto :goto_14

    .line 868
    :cond_2b
    const/4 v1, 0x0

    .line 869
    :goto_15
    if-eqz v1, :cond_2c

    .line 870
    .line 871
    invoke-virtual {v1}, La/xhe0;->p()V

    .line 872
    .line 873
    .line 874
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->d2:Z

    .line 875
    .line 876
    :cond_2c
    move-object v12, v1

    .line 877
    goto :goto_16

    .line 878
    :cond_2d
    move-object/from16 v2, v19

    .line 879
    .line 880
    :goto_16
    if-nez v12, :cond_32

    .line 881
    .line 882
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 883
    .line 884
    .line 885
    move-result-wide v7

    .line 886
    const-wide v9, 0x7fffffffffffffffL

    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    cmp-long v1, p2, v9

    .line 892
    .line 893
    const-wide/16 v9, 0x0

    .line 894
    .line 895
    if-eqz v1, :cond_2f

    .line 896
    .line 897
    iget-object v1, v0, La/msj;->g:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v1, La/nhe0;

    .line 900
    .line 901
    invoke-virtual {v1, v11}, La/nhe0;->b(I)La/mhe0;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    iget-wide v12, v1, La/mhe0;->c:J

    .line 906
    .line 907
    cmp-long v1, v12, v9

    .line 908
    .line 909
    if-eqz v1, :cond_2f

    .line 910
    .line 911
    add-long/2addr v12, v7

    .line 912
    cmp-long v1, v12, p2

    .line 913
    .line 914
    if-gez v1, :cond_2e

    .line 915
    .line 916
    goto :goto_17

    .line 917
    :cond_2e
    const/4 v15, 0x0

    .line 918
    return-object v15

    .line 919
    :cond_2f
    :goto_17
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 920
    .line 921
    invoke-virtual {v1, v6, v11}, La/yge0;->b(Landroid/view/ViewGroup;I)La/xhe0;

    .line 922
    .line 923
    .line 924
    move-result-object v12

    .line 925
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->i2:Z

    .line 926
    .line 927
    if-eqz v1, :cond_30

    .line 928
    .line 929
    iget-object v1, v12, La/xhe0;->a:Landroid/view/View;

    .line 930
    .line 931
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    if-eqz v1, :cond_30

    .line 936
    .line 937
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 938
    .line 939
    invoke-direct {v13, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 940
    .line 941
    .line 942
    iput-object v13, v12, La/xhe0;->b:Ljava/lang/ref/WeakReference;

    .line 943
    .line 944
    :cond_30
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 945
    .line 946
    .line 947
    move-result-wide v13

    .line 948
    iget-object v1, v0, La/msj;->g:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v1, La/nhe0;

    .line 951
    .line 952
    sub-long/2addr v13, v7

    .line 953
    invoke-virtual {v1, v11}, La/nhe0;->b(I)La/mhe0;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    iget-wide v7, v1, La/mhe0;->c:J

    .line 958
    .line 959
    cmp-long v9, v7, v9

    .line 960
    .line 961
    if-nez v9, :cond_31

    .line 962
    .line 963
    goto :goto_18

    .line 964
    :cond_31
    const-wide/16 v9, 0x4

    .line 965
    .line 966
    div-long/2addr v7, v9

    .line 967
    const-wide/16 v17, 0x3

    .line 968
    .line 969
    mul-long v7, v7, v17

    .line 970
    .line 971
    div-long/2addr v13, v9

    .line 972
    add-long/2addr v13, v7

    .line 973
    :goto_18
    iput-wide v13, v1, La/mhe0;->c:J

    .line 974
    .line 975
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->e2:Z

    .line 976
    .line 977
    if-eqz v1, :cond_32

    .line 978
    .line 979
    const-string v1, "tryGetViewHolderForPositionByDeadline created new ViewHolder"

    .line 980
    .line 981
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 982
    .line 983
    .line 984
    :cond_32
    move v7, v5

    .line 985
    move-object v1, v12

    .line 986
    goto :goto_19

    .line 987
    :cond_33
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 988
    .line 989
    const-string v1, "(offset:"

    .line 990
    .line 991
    const-string v2, ").state:"

    .line 992
    .line 993
    const-string v5, "Inconsistency detected. Invalid item position "

    .line 994
    .line 995
    invoke-static {v5, v3, v1, v2, v9}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    invoke-virtual {v4}, La/the0;->b()I

    .line 1000
    .line 1001
    .line 1002
    move-result v2

    .line 1003
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v2

    .line 1010
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    throw v0

    .line 1021
    :goto_19
    iget-object v8, v1, La/xhe0;->a:Landroid/view/View;

    .line 1022
    .line 1023
    if-eqz v7, :cond_34

    .line 1024
    .line 1025
    iget-boolean v2, v4, La/the0;->g:Z

    .line 1026
    .line 1027
    if-nez v2, :cond_34

    .line 1028
    .line 1029
    iget v2, v1, La/xhe0;->j:I

    .line 1030
    .line 1031
    and-int/lit16 v5, v2, 0x2000

    .line 1032
    .line 1033
    if-eqz v5, :cond_34

    .line 1034
    .line 1035
    and-int/lit16 v2, v2, -0x2001

    .line 1036
    .line 1037
    iput v2, v1, La/xhe0;->j:I

    .line 1038
    .line 1039
    iget-boolean v2, v4, La/the0;->j:Z

    .line 1040
    .line 1041
    if-eqz v2, :cond_34

    .line 1042
    .line 1043
    invoke-static {v1}, La/ehe0;->b(La/xhe0;)V

    .line 1044
    .line 1045
    .line 1046
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->p1:La/ehe0;

    .line 1047
    .line 1048
    invoke-virtual {v1}, La/xhe0;->f()Ljava/util/List;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    new-instance v2, La/eld0;

    .line 1055
    .line 1056
    const/16 v5, 0xa

    .line 1057
    .line 1058
    invoke-direct {v2, v5}, La/eld0;-><init>(B)V

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v2, v1}, La/eld0;->b(La/xhe0;)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v6, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->o0(La/xhe0;La/eld0;)V

    .line 1065
    .line 1066
    .line 1067
    :cond_34
    iget-boolean v2, v4, La/the0;->g:Z

    .line 1068
    .line 1069
    if-eqz v2, :cond_35

    .line 1070
    .line 1071
    invoke-virtual {v1}, La/xhe0;->h()Z

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    if-eqz v2, :cond_35

    .line 1076
    .line 1077
    iput v3, v1, La/xhe0;->g:I

    .line 1078
    .line 1079
    goto :goto_1a

    .line 1080
    :cond_35
    invoke-virtual {v1}, La/xhe0;->h()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v2

    .line 1084
    if-eqz v2, :cond_38

    .line 1085
    .line 1086
    iget v2, v1, La/xhe0;->j:I

    .line 1087
    .line 1088
    and-int/lit8 v2, v2, 0x2

    .line 1089
    .line 1090
    if-eqz v2, :cond_36

    .line 1091
    .line 1092
    goto :goto_1b

    .line 1093
    :cond_36
    invoke-virtual {v1}, La/xhe0;->i()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v2

    .line 1097
    if-eqz v2, :cond_37

    .line 1098
    .line 1099
    goto :goto_1b

    .line 1100
    :cond_37
    :goto_1a
    const/4 v0, 0x0

    .line 1101
    const/4 v9, 0x0

    .line 1102
    goto :goto_1d

    .line 1103
    :cond_38
    :goto_1b
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->d2:Z

    .line 1104
    .line 1105
    if-eqz v2, :cond_3a

    .line 1106
    .line 1107
    invoke-virtual {v1}, La/xhe0;->k()Z

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    if-nez v2, :cond_39

    .line 1112
    .line 1113
    goto :goto_1c

    .line 1114
    :cond_39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1115
    .line 1116
    const-string v2, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    .line 1117
    .line 1118
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    invoke-static {v0, v1}, La/itt0;->n(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 1129
    .line 1130
    .line 1131
    const/4 v15, 0x0

    .line 1132
    return-object v15

    .line 1133
    :cond_3a
    :goto_1c
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->e:La/fp;

    .line 1134
    .line 1135
    const/4 v9, 0x0

    .line 1136
    invoke-virtual {v2, v3, v9}, La/fp;->u(II)I

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    move-wide/from16 v4, p2

    .line 1141
    .line 1142
    invoke-virtual/range {v0 .. v5}, La/msj;->n(La/xhe0;IIJ)Z

    .line 1143
    .line 1144
    .line 1145
    move-result v0

    .line 1146
    :goto_1d
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v2

    .line 1150
    if-nez v2, :cond_3b

    .line 1151
    .line 1152
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    check-cast v2, La/hhe0;

    .line 1157
    .line 1158
    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1159
    .line 1160
    .line 1161
    goto :goto_1e

    .line 1162
    :cond_3b
    invoke-virtual {v6, v2}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v3

    .line 1166
    if-nez v3, :cond_3c

    .line 1167
    .line 1168
    invoke-virtual {v6, v2}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v2

    .line 1172
    check-cast v2, La/hhe0;

    .line 1173
    .line 1174
    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1175
    .line 1176
    .line 1177
    goto :goto_1e

    .line 1178
    :cond_3c
    check-cast v2, La/hhe0;

    .line 1179
    .line 1180
    :goto_1e
    iput-object v1, v2, La/hhe0;->a:La/xhe0;

    .line 1181
    .line 1182
    if-eqz v7, :cond_3d

    .line 1183
    .line 1184
    if-eqz v0, :cond_3d

    .line 1185
    .line 1186
    move/from16 v9, v16

    .line 1187
    .line 1188
    :cond_3d
    iput-boolean v9, v2, La/hhe0;->d:Z

    .line 1189
    .line 1190
    return-object v1

    .line 1191
    :cond_3e
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1192
    .line 1193
    const-string v1, "("

    .line 1194
    .line 1195
    const-string v2, "). Item count:"

    .line 1196
    .line 1197
    const-string v5, "Invalid item position "

    .line 1198
    .line 1199
    invoke-static {v5, v3, v1, v2, v3}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v1

    .line 1203
    invoke-virtual {v4}, La/the0;->b()I

    .line 1204
    .line 1205
    .line 1206
    move-result v2

    .line 1207
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v2

    .line 1214
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    throw v0
.end method

.method public p(La/xhe0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, La/xhe0;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/msj;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p0, p0, La/msj;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 p0, 0x0

    .line 21
    iput-object p0, p1, La/xhe0;->n:La/msj;

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    iput-boolean p0, p1, La/xhe0;->o:Z

    .line 25
    .line 26
    iget p0, p1, La/xhe0;->j:I

    .line 27
    .line 28
    and-int/lit8 p0, p0, -0x21

    .line 29
    .line 30
    iput p0, p1, La/xhe0;->j:I

    .line 31
    .line 32
    return-void
.end method

.method public q()V
    .locals 4

    .line 1
    iget-object v0, p0, La/msj;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, La/msj;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v1, v1, Landroidx/recyclerview/widget/b;->j:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    iget v2, p0, La/msj;->a:I

    .line 18
    .line 19
    add-int/2addr v2, v1

    .line 20
    iput v2, p0, La/msj;->b:I

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    :goto_1
    if-ltz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, p0, La/msj;->b:I

    .line 35
    .line 36
    if-le v2, v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, v1}, La/msj;->j(I)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, -0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    return-void
.end method
