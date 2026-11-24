.class public interface abstract La/vrc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public abstract A()Ljava/lang/String;
.end method

.method public abstract B()J
.end method

.method public abstract C()Ljava/lang/String;
.end method

.method public g0(Ljava/lang/String;)La/vrc0;
    .locals 3

    .line 1
    instance-of v0, p0, La/urc0;

    .line 2
    .line 3
    const/16 v1, 0xfbf

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, La/urc0;

    .line 9
    .line 10
    invoke-static {p0, p1, v2, v1}, La/urc0;->a(La/urc0;Ljava/lang/String;La/hds;I)La/urc0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    instance-of v0, p0, La/trc0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, La/trc0;

    .line 20
    .line 21
    invoke-static {p0, p1, v2, v2, v1}, La/trc0;->a(La/trc0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)La/trc0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public abstract getId()J
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getType()La/xg8;
.end method

.method public abstract h0()I
.end method

.method public abstract m0()I
.end method

.method public abstract t0()Ljava/lang/String;
.end method
