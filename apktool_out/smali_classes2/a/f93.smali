.class public final La/f93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g93;


# virtual methods
.method public final O0(La/swq;)La/t83;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/hun;->a:La/hun;

    .line 7
    .line 8
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "EMPTY"

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge z0(La/swq;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/jar0;->U(La/g93;La/swq;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
