.class public final La/egx;
.super La/oyc;
.source "SourceFile"

# interfaces
.implements La/zf60;


# instance fields
.field public c:Z

.field public d:Landroid/view/View;

.field public e:La/xiv0;


# virtual methods
.method public final f(La/div0;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/egx;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 6
    .line 7
    invoke-virtual {p1}, La/civ0;->d()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    and-int/lit8 p1, p1, 0x8

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, La/egx;->c:Z

    .line 17
    .line 18
    iget-object p1, p0, La/egx;->d:Landroid/view/View;

    .line 19
    .line 20
    iget-object p0, p0, La/egx;->e:La/xiv0;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-static {p1, p0}, La/rgu0;->b(Landroid/view/View;La/xiv0;)La/xiv0;

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final g(La/div0;)V
    .locals 0

    .line 1
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 2
    .line 3
    invoke-virtual {p1}, La/civ0;->d()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    and-int/lit8 p1, p1, 0x8

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, La/egx;->c:Z

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 2

    .line 1
    iget-object v0, p2, La/xiv0;->a:La/uiv0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/egx;->d:Landroid/view/View;

    .line 7
    .line 8
    iput-object p2, p0, La/egx;->e:La/xiv0;

    .line 9
    .line 10
    iget-boolean p0, p0, La/egx;->c:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/16 p0, 0x207

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 p0, 0x20f

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p0}, La/uiv0;->i(I)La/pfx;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget p2, p0, La/pfx;->d:I

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-virtual {v0, v1}, La/uiv0;->i(I)La/pfx;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v0, v0, La/pfx;->d:I

    .line 34
    .line 35
    sub-int/2addr p2, v0

    .line 36
    iget v0, p0, La/pfx;->a:I

    .line 37
    .line 38
    iget v1, p0, La/pfx;->b:I

    .line 39
    .line 40
    iget p0, p0, La/pfx;->c:I

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1, p0, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 43
    .line 44
    .line 45
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-object p0
.end method
