.class public final La/j3g;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public o:La/c4m0;

.field public p:La/c4m0;

.field public q:La/c4m0;


# virtual methods
.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, La/j3g;->o:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, La/j3g;->p:La/c4m0;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object p0, p0, La/j3g;->q:La/c4m0;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/u2g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/jyf;

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    invoke-direct {p1, v0}, La/jyf;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
