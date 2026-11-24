.class public final La/p340;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fmo;


# instance fields
.field public final a:La/fmo;

.field public final b:La/ccs0;


# direct methods
.method public constructor <init>(La/fmo;La/ccs0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p340;->a:La/fmo;

    .line 5
    .line 6
    iput-object p2, p0, La/p340;->b:La/ccs0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(IJ)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, La/fmo;->c(IJ)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d()I
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->d()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e()V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/p340;->v(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, La/p340;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    check-cast p1, La/p340;

    .line 13
    .line 14
    iget-object p0, p0, La/p340;->b:La/ccs0;

    .line 15
    .line 16
    iget-object p1, p1, La/p340;->b:La/ccs0;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ccs0;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final f(I)Landroidx/media3/common/b;
    .locals 1

    .line 1
    iget-object v0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La/fmo;->g(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, La/p340;->b:La/ccs0;

    .line 8
    .line 9
    iget-object p0, p0, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 10
    .line 11
    aget-object p0, p0, p1

    .line 12
    .line 13
    return-object p0
.end method

.method public final g(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/fmo;->g(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final h(IJ)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, La/fmo;->h(IJ)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/p340;->b:La/ccs0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/ccs0;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final i(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/fmo;->i(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->j()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final k()V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->k()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/fmo;->l(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final length()I
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final m(JJJLjava/util/List;[La/am30;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p8}, La/fmo;->m(JJJLjava/util/List;[La/am30;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n()La/ccs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->b:La/ccs0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/fmo;->o(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p(JLjava/util/List;)I
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, La/fmo;->p(JLjava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final q()I
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->q()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final r()Landroidx/media3/common/b;
    .locals 1

    .line 1
    iget-object v0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {v0}, La/fmo;->q()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, La/p340;->b:La/ccs0;

    .line 8
    .line 9
    iget-object p0, p0, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 10
    .line 11
    aget-object p0, p0, v0

    .line 12
    .line 13
    return-object p0
.end method

.method public final s()I
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->s()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final t(JLa/yic;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, p4}, La/fmo;->t(JLa/yic;Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final u()V
    .locals 0

    .line 1
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 2
    .line 3
    invoke-interface {p0}, La/fmo;->u()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, La/p340;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, La/p340;

    .line 12
    .line 13
    iget-object p0, p0, La/p340;->a:La/fmo;

    .line 14
    .line 15
    iget-object p1, p1, La/p340;->a:La/fmo;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method
