.class public interface abstract La/mm40;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
.end method

.method public abstract b(Lkotlin/jvm/functions/Function1;)Z
.end method

.method public e(La/mm40;)La/mm40;
    .locals 1

    .line 1
    sget-object v0, La/jm40;->b:La/jm40;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, La/i7d;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, La/i7d;-><init>(La/mm40;La/mm40;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
