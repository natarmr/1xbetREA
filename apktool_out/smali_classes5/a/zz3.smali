.class public abstract La/zz3;
.super La/yge0;
.source "SourceFile"


# instance fields
.field public final d:La/dp;

.field public final e:La/yz3;


# direct methods
.method public constructor <init>(La/dtb;)V
    .locals 2

    .line 1
    new-instance v0, La/dp;

    .line 2
    .line 3
    invoke-direct {v0}, La/dp;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v1, La/yz3;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1}, La/yz3;-><init>(La/yge0;La/dtb;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, La/zz3;->e:La/yz3;

    .line 17
    .line 18
    iput-object v0, p0, La/zz3;->d:La/dp;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "ItemCallback is null"

    .line 22
    .line 23
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method


# virtual methods
.method public A(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final B(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()I
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 2
    .line 3
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, La/zz3;->e:La/yz3;

    .line 2
    .line 3
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, La/dp;->d(ILjava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public n(La/xhe0;I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/zz3;->e:La/yz3;

    .line 2
    .line 3
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p2, p1, v1}, La/dp;->e(Ljava/lang/Object;ILa/xhe0;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public o(La/xhe0;ILjava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/zz3;->e:La/yz3;

    .line 2
    .line 3
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p2, p1, p3}, La/dp;->e(Ljava/lang/Object;ILa/xhe0;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/dp;->f(Landroid/view/ViewGroup;I)La/cp;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final r(La/xhe0;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/dp;->g(La/xhe0;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final s(La/xhe0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/dp;->h(La/xhe0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(La/xhe0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/dp;->i(La/xhe0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(La/xhe0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/dp;->j(La/xhe0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 2
    .line 3
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 4
    .line 5
    return-object p0
.end method
