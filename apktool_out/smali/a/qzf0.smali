.class public final La/qzf0;
.super Landroidx/fragment/app/g;
.source "SourceFile"


# instance fields
.field public final h:Landroid/util/SparseArray;

.field public final i:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/e;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/e;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/qzf0;->h:Landroid/util/SparseArray;

    .line 19
    .line 20
    iput-object p2, p0, La/qzf0;->i:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Landroidx/viewpager/widget/ViewPager;ILjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/qzf0;->h:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->remove(I)V

    .line 7
    .line 8
    .line 9
    check-cast p3, Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/fragment/app/g;->c:La/zb5;

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/fragment/app/g;->b:Landroidx/fragment/app/e;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance p1, La/zb5;

    .line 21
    .line 22
    invoke-direct {p1, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/fragment/app/g;->c:La/zb5;

    .line 26
    .line 27
    :cond_0
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/g;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    if-gt v1, p2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->N()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, p3}, Landroidx/fragment/app/e;->q0(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment$SavedState;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v0, v2

    .line 52
    :goto_1
    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Landroidx/fragment/app/g;->e:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {p1, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Landroidx/fragment/app/g;->c:La/zb5;

    .line 61
    .line 62
    invoke-virtual {p1, p3}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Landroidx/fragment/app/g;->f:Landroidx/fragment/app/Fragment;

    .line 66
    .line 67
    if-eq p3, p1, :cond_3

    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    iput-object v2, p0, Landroidx/fragment/app/g;->f:Landroidx/fragment/app/Fragment;

    .line 71
    .line 72
    return-void
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, La/qzf0;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d(Landroidx/viewpager/widget/ViewPager;I)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/g;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-le v1, p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/g;->c:La/zb5;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/fragment/app/g;->b:Landroidx/fragment/app/e;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v2, La/zb5;

    .line 28
    .line 29
    invoke-direct {v2, v1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, Landroidx/fragment/app/g;->c:La/zb5;

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/fragment/app/g;->j(I)La/yx5;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Landroidx/fragment/app/g;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-le v3, p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroidx/fragment/app/Fragment$SavedState;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->t0(Landroidx/fragment/app/Fragment$SavedState;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v3, 0x0

    .line 62
    if-gt v2, p2, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/4 v2, 0x0

    .line 69
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->u0(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Landroidx/fragment/app/g;->c:La/zb5;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    const/4 v2, 0x1

    .line 82
    invoke-virtual {v0, p1, v1, v3, v2}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Landroidx/fragment/app/g;->c:La/zb5;

    .line 86
    .line 87
    sget-object v0, La/lkz;->d:La/lkz;

    .line 88
    .line 89
    invoke-virtual {p1, v1, v0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    iget-object p0, p0, La/qzf0;->h:Landroid/util/SparseArray;

    .line 93
    .line 94
    invoke-virtual {p0, p2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object v1
.end method

.method public final j(I)La/yx5;
    .locals 2

    .line 1
    iget-object v0, p0, La/qzf0;->h:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    check-cast v0, La/yx5;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object p0, p0, La/qzf0;->i:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, La/wzf0;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    instance-of p1, p0, La/vzf0;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget-object p0, La/ayf0;->S1:La/eke0;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance p0, La/ayf0;

    .line 34
    .line 35
    invoke-direct {p0}, La/ayf0;-><init>()V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    instance-of p0, p0, La/uzf0;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    sget-object p0, La/hxf0;->V1:La/zie0;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p0, La/hxf0;

    .line 49
    .line 50
    invoke-direct {p0}, La/hxf0;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object p1, La/hxf0;->W1:[La/iiy;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    aget-object p1, p1, v0

    .line 57
    .line 58
    iget-object v0, p0, La/hxf0;->L1:La/phf0;

    .line 59
    .line 60
    const-string v1, ""

    .line 61
    .line 62
    invoke-virtual {v0, p0, p1, v1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method
