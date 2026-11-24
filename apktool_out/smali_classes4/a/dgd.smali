.class public interface abstract La/dgd;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, La/jkd0;->a(Ljava/lang/Class;)La/jkd0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public e(La/jkd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, La/dgd;->l(La/jkd0;)La/p5d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, La/p5d0;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public j(Ljava/lang/Class;)La/p5d0;
    .locals 0

    .line 1
    invoke-static {p1}, La/jkd0;->a(Ljava/lang/Class;)La/jkd0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, La/dgd;->l(La/jkd0;)La/p5d0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public abstract l(La/jkd0;)La/p5d0;
.end method

.method public m(La/jkd0;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, La/dgd;->o(La/jkd0;)La/p5d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/p5d0;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/Set;

    .line 10
    .line 11
    return-object p0
.end method

.method public abstract o(La/jkd0;)La/p5d0;
.end method

.method public abstract q(La/jkd0;)La/y680;
.end method
