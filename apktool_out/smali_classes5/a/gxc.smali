.class public final La/gxc;
.super La/i26;
.source "SourceFile"


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:La/lya;

.field public final j:Ljava/util/LinkedHashMap;

.field public k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLa/lya;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-direct {p0, v1, v0}, La/i26;-><init>(ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/gxc;->g:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p2, p0, La/gxc;->h:Z

    .line 12
    .line 13
    iput-object p3, p0, La/gxc;->i:La/lya;

    .line 14
    .line 15
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/gxc;->j:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, La/yge0;->w(Z)V

    .line 24
    .line 25
    .line 26
    const-string p1, ""

    .line 27
    .line 28
    iput-object p1, p0, La/gxc;->k:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final B(La/v46;I)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, La/i26;->B(La/v46;I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i26;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, La/uvc;

    .line 13
    .line 14
    iget p2, p2, La/uvc;->a:I

    .line 15
    .line 16
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object p0, p0, La/gxc;->j:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/Integer;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move p0, p2

    .line 37
    :goto_0
    check-cast p1, La/axc;

    .line 38
    .line 39
    iget-object p1, p1, La/axc;->y:La/uk5;

    .line 40
    .line 41
    if-lez p0, :cond_1

    .line 42
    .line 43
    iget-object v0, p1, La/uk5;->c:Landroid/view/View;

    .line 44
    .line 45
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, p2, p2, v1}, Lcom/google/android/material/appbar/AppBarLayout;->g(ZZZ)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p1, p1, La/uk5;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Landroid/view/View;->setScrollY(I)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final G(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i26;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sput-object v0, La/fxc;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    sput-object p1, La/fxc;->c:Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    sget-object v2, La/fxc;->a:La/fxc;

    .line 17
    .line 18
    invoke-static {v2, v1}, La/cy2;->w(La/kpb;Z)La/amk;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    new-instance p1, La/fvt0;

    .line 29
    .line 30
    invoke-direct {p1, p0}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, La/amk;->b(La/pf00;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final e(I)J
    .locals 0

    .line 1
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uvc;

    .line 10
    .line 11
    iget p0, p0, La/uvc;->a:I

    .line 12
    .line 13
    int-to-long p0, p0

    .line 14
    return-wide p0
.end method

.method public final bridge synthetic n(La/xhe0;I)V
    .locals 0

    .line 1
    check-cast p1, La/v46;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/gxc;->B(La/v46;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(La/xhe0;)V
    .locals 2

    .line 1
    check-cast p1, La/v46;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, La/xhe0;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, La/i26;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/uvc;

    .line 19
    .line 20
    check-cast p1, La/axc;

    .line 21
    .line 22
    iget-object p1, p1, La/axc;->y:La/uk5;

    .line 23
    .line 24
    iget-object p1, p1, La/uk5;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget v0, v0, La/uvc;->a:I

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p0, p0, La/gxc;->j:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final z(Landroid/view/View;)La/v46;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/axc;

    .line 5
    .line 6
    iget-object v1, p0, La/gxc;->k:Ljava/lang/String;

    .line 7
    .line 8
    iget-boolean v3, p0, La/gxc;->h:Z

    .line 9
    .line 10
    iget-object v4, p0, La/gxc;->i:La/lya;

    .line 11
    .line 12
    iget-object v2, p0, La/gxc;->g:Ljava/lang/String;

    .line 13
    .line 14
    move-object v5, p1

    .line 15
    invoke-direct/range {v0 .. v5}, La/axc;-><init>(Ljava/lang/String;Ljava/lang/String;ZLa/lya;Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
