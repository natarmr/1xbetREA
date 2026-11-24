.class public interface abstract La/xkb0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a()La/sh60;
    .locals 4

    .line 1
    sget-object v0, La/sh60;->d:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/sh60;

    .line 18
    .line 19
    iget-object v2, v1, La/sh60;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p0}, La/xkb0;->b()La/skb0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const-string p0, "Collection contains no element matching the predicate."

    .line 33
    .line 34
    invoke-static {p0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method public abstract b()La/skb0;
.end method
