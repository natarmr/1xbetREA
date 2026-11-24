.class public final La/h98;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jr20;


# virtual methods
.method public final a(La/k810;La/y78;La/mr20;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p3, La/mr20;->a:La/v9d;

    .line 5
    .line 6
    iget-object p3, p3, La/mr20;->b:La/v9d;

    .line 7
    .line 8
    iget v0, p1, La/k810;->b:I

    .line 9
    .line 10
    iget-object p1, p1, La/k810;->d:Ljava/lang/CharSequence;

    .line 11
    .line 12
    invoke-static {p0, p1}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    sget-object p0, La/iun;->a:La/iun;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    iget-object p0, p3, La/v9d;->b:[C

    .line 28
    .line 29
    invoke-static {p0}, La/tx3;->Q([C)Ljava/lang/Character;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/16 p1, 0x3e

    .line 41
    .line 42
    if-ne p0, p1, :cond_2

    .line 43
    .line 44
    new-instance p0, La/e98;

    .line 45
    .line 46
    new-instance p1, La/y78;

    .line 47
    .line 48
    invoke-direct {p1, p2}, La/y78;-><init>(La/y78;)V

    .line 49
    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-direct {p0, p3, p1, p2}, La/e98;-><init>(La/v9d;La/y78;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_2
    :goto_0
    sget-object p0, La/iun;->a:La/iun;

    .line 61
    .line 62
    return-object p0
.end method

.method public final b(La/v9d;La/k810;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
