.class public final La/t470;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ZJ)La/a570;
    .locals 1

    .line 1
    sget-object v0, La/s470;->Companion:La/r470;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, La/r470;->a(J)La/s470;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    sget-object p0, La/s470;->b:La/s470;

    .line 13
    .line 14
    if-ne v0, p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p0, La/w470;

    .line 18
    .line 19
    invoke-direct {p0, v0}, La/w470;-><init>(La/s470;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    :goto_0
    new-instance p0, La/z470;

    .line 24
    .line 25
    invoke-direct {p0, p1, p2}, La/z470;-><init>(J)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method


# virtual methods
.method public final serializer()La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, La/b570;->a:La/b570;

    .line 2
    .line 3
    return-object p0
.end method
