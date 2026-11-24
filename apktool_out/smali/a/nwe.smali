.class public final La/nwe;
.super La/syx;
.source "SourceFile"


# instance fields
.field public final e:La/tre;


# direct methods
.method public constructor <init>(La/tre;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, La/syx;-><init>(B)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/nwe;->e:La/tre;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Landroidx/recyclerview/widget/RecyclerView;La/xhe0;La/xhe0;)Z
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, La/xhe0;->d()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, La/nwe;->e:La/tre;

    .line 15
    .line 16
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 17
    .line 18
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/p6t0;

    .line 32
    .line 33
    instance-of p0, p0, La/xpc;

    .line 34
    .line 35
    xor-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    return p0
.end method

.method public final n(Landroidx/recyclerview/widget/RecyclerView;La/xhe0;)I
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
    invoke-virtual {p2}, La/xhe0;->d()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object p0, p0, La/nwe;->e:La/tre;

    .line 12
    .line 13
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 14
    .line 15
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/p6t0;

    .line 29
    .line 30
    instance-of p0, p0, La/xpc;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    invoke-static {p0}, La/syx;->q(I)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_0
    const/4 p0, 0x3

    .line 41
    invoke-static {p0}, La/syx;->q(I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final s(Landroidx/recyclerview/widget/RecyclerView;La/xhe0;La/xhe0;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, La/xhe0;->d()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p3}, La/xhe0;->d()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object p0, p0, La/nwe;->e:La/tre;

    .line 16
    .line 17
    iget-object v1, p0, La/zz3;->e:La/yz3;

    .line 18
    .line 19
    iget-object v1, v1, La/yz3;->f:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/p6t0;

    .line 33
    .line 34
    iget-object v1, p0, La/zz3;->e:La/yz3;

    .line 35
    .line 36
    iget-object v1, v1, La/yz3;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/p6t0;

    .line 50
    .line 51
    instance-of p1, p1, La/xpc;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    instance-of p1, v0, La/xpc;

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p2}, La/xhe0;->d()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {p3}, La/xhe0;->d()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    iget-boolean p3, p0, La/tre;->j:Z

    .line 70
    .line 71
    if-eqz p3, :cond_1

    .line 72
    .line 73
    iput p1, p0, La/tre;->h:I

    .line 74
    .line 75
    iput-boolean v1, p0, La/tre;->j:Z

    .line 76
    .line 77
    :cond_1
    iput p2, p0, La/tre;->i:I

    .line 78
    .line 79
    invoke-virtual {p0, p1, p2}, La/yge0;->i(II)V

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, La/tre;->f:La/pw4;

    .line 83
    .line 84
    invoke-virtual {p0}, La/pw4;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :cond_2
    :goto_0
    return v1
.end method

.method public final t(La/xhe0;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, La/nwe;->e:La/tre;

    .line 4
    .line 5
    iget-object p1, p0, La/tre;->g:La/cnc;

    .line 6
    .line 7
    iget p2, p0, La/tre;->h:I

    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget v0, p0, La/tre;->i:I

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, p2, v0}, La/cnc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, La/tre;->h:I

    .line 24
    .line 25
    iput p1, p0, La/tre;->i:I

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, La/tre;->j:Z

    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final u(La/xhe0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
