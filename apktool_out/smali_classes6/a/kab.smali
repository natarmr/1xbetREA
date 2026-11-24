.class public final La/kab;
.super La/q4;
.source "SourceFile"


# instance fields
.field public final f:La/k5;

.field public final g:Z

.field public h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;La/k5;Z)V
    .locals 1

    .line 1
    sget-object v0, La/iun;->a:La/iun;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, La/q4;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, La/kab;->f:La/k5;

    .line 7
    .line 8
    iput-boolean p3, p0, La/kab;->g:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, La/kab;->f:La/k5;

    .line 2
    .line 3
    iget p0, p0, La/kab;->h:I

    .line 4
    .line 5
    invoke-virtual {v0, p1, p0}, La/k5;->b(II)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final n(La/xhe0;I)V
    .locals 1

    .line 1
    check-cast p1, La/w5;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, La/y8b;

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, La/kab;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, La/kab;->h:I

    .line 16
    .line 17
    invoke-static {v0, p1}, La/q4;->z(ILa/w5;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, La/kab;->f:La/k5;

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, La/k5;->j(La/w5;La/y8b;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kab;->f:La/k5;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/k5;->m(Landroid/view/ViewGroup;I)La/w5;

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
    check-cast p1, La/w5;

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0
.end method

.method public final u(La/xhe0;)V
    .locals 0

    .line 1
    check-cast p1, La/w5;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, La/w5;->t()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
