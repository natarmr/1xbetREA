.class public final La/jp80;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/hps0;
.implements La/qai0;


# instance fields
.field public o:La/on;

.field public p:Z


# virtual methods
.method public final J0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, La/rv00;->y:La/rv00;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x0(La/abi0;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/jp80;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/jp80;->o:La/on;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/on;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
