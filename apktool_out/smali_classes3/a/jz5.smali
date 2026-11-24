.class public final La/jz5;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final serializer(La/jiy;La/jiy;)La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            ">(",
            "La/jiy;",
            "La/jiy;",
            ")",
            "La/jiy;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, La/iz5;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, La/iz5;-><init>(La/jiy;La/jiy;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
