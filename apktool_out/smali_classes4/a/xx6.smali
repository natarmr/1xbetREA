.class public final La/xx6;
.super La/syx;
.source "SourceFile"


# instance fields
.field public final e:La/u530;

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(La/u530;)V
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
    iput-object p1, p0, La/xx6;->e:La/u530;

    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    iput p1, p0, La/xx6;->f:I

    .line 12
    .line 13
    iput p1, p0, La/xx6;->g:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
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
    instance-of p0, p2, La/cp;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p2, La/cp;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p2, p1

    .line 16
    :goto_0
    if-eqz p2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    instance-of p2, p0, La/hw20;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    move-object p1, p0

    .line 27
    check-cast p1, La/hw20;

    .line 28
    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p0, p1, La/hw20;->c:La/dw20;

    .line 32
    .line 33
    sget-object p1, La/dw20;->a:La/dw20;

    .line 34
    .line 35
    if-ne p0, p1, :cond_2

    .line 36
    .line 37
    const/4 p0, 0x3

    .line 38
    invoke-static {p0}, La/syx;->q(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_2
    const/4 p0, 0x0

    .line 44
    invoke-static {p0}, La/syx;->q(I)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
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
    .locals 6

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
    iget-object v1, p0, La/xx6;->e:La/u530;

    .line 16
    .line 17
    iget-object v2, v1, La/zz3;->e:La/yz3;

    .line 18
    .line 19
    iget-object v3, v2, La/yz3;->f:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    instance-of v4, v3, La/hw20;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    check-cast v3, La/hw20;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v3, v5

    .line 34
    :goto_0
    iget-object v2, v2, La/yz3;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    instance-of v4, v2, La/hw20;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    check-cast v2, La/hw20;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v2, v5

    .line 48
    :goto_1
    if-eqz v3, :cond_2

    .line 49
    .line 50
    iget-object v3, v3, La/hw20;->c:La/dw20;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v3, v5

    .line 54
    :goto_2
    sget-object v4, La/dw20;->a:La/dw20;

    .line 55
    .line 56
    if-ne v3, v4, :cond_4

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iget-object v5, v2, La/hw20;->c:La/dw20;

    .line 61
    .line 62
    :cond_3
    if-ne v5, v4, :cond_4

    .line 63
    .line 64
    iget-object v2, v1, La/u530;->f:La/e000;

    .line 65
    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v2, v3, v4}, La/e000;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1, v0}, La/yge0;->i(II)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget p1, p0, La/xx6;->f:I

    .line 81
    .line 82
    const/4 v0, -0x1

    .line 83
    if-ne p1, v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p3}, La/xhe0;->d()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iput p1, p0, La/xx6;->f:I

    .line 90
    .line 91
    :cond_5
    invoke-virtual {p2}, La/xhe0;->c()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iput p1, p0, La/xx6;->g:I

    .line 96
    .line 97
    const/4 p0, 0x1

    .line 98
    return p0
.end method

.method public final t(La/xhe0;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget p1, p0, La/xx6;->f:I

    .line 4
    .line 5
    const/4 p2, -0x1

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    iget v0, p0, La/xx6;->g:I

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, La/xx6;->e:La/u530;

    .line 13
    .line 14
    iget-object p1, p1, La/u530;->g:La/o0t;

    .line 15
    .line 16
    invoke-virtual {p1}, La/o0t;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput p2, p0, La/xx6;->f:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final u(La/xhe0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
