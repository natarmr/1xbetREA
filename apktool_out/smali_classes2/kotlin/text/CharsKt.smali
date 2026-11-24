.class public final Lkotlin/text/CharsKt;
.super Lkotlin/text/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "kotlin/text/CharsKt__CharJVMKt",
        "kotlin/text/a"
    }
    d2 = {}
    k = 0x4
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x31
.end annotation


# direct methods
.method public static c(C)La/pub;
    .locals 2

    .line 1
    sget-object v0, La/pub;->a:La/oub;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Character;->getType(C)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    if-ltz p0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x11

    .line 13
    .line 14
    if-ge p0, v0, :cond_0

    .line 15
    .line 16
    sget-object v0, La/pub;->c:La/c0o;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, La/c0o;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/pub;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    const/16 v0, 0x12

    .line 26
    .line 27
    if-gt v0, p0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x1f

    .line 30
    .line 31
    if-ge p0, v0, :cond_1

    .line 32
    .line 33
    sget-object v0, La/pub;->c:La/c0o;

    .line 34
    .line 35
    add-int/lit8 p0, p0, -0x1

    .line 36
    .line 37
    invoke-virtual {v0, p0}, La/c0o;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/pub;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    const-string v0, "Category #"

    .line 45
    .line 46
    const-string v1, " is not defined."

    .line 47
    .line 48
    invoke-static {p0, v0, v1}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static d(C)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method
