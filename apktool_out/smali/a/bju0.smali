.class public final La/bju0;
.super La/eju0;
.source "SourceFile"


# instance fields
.field public g:[F

.field public h:La/x2e;


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/x2e;

    .line 2
    .line 3
    iput-object p1, p0, La/bju0;->h:La/x2e;

    .line 4
    .line 5
    return-void
.end method

.method public final f(Landroid/view/View;F)V
    .locals 2

    .line 1
    iget-object v0, p0, La/bju0;->g:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p2}, La/cky;->a(F)F

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    aput p2, v0, v1

    .line 9
    .line 10
    iget-object p0, p0, La/bju0;->h:La/x2e;

    .line 11
    .line 12
    invoke-static {p0, p1, v0}, La/dyb;->k0(La/x2e;Landroid/view/View;[F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
