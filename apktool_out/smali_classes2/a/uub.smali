.class public abstract La/uub;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lsb0;


# virtual methods
.method public a(C)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Character;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, La/uub;->a(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
