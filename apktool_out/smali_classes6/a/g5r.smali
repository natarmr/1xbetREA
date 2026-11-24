.class public abstract La/g5r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/fet;)La/d5r;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    new-instance v1, La/nuq;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-direct {v1, v2}, La/nuq;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/rnp;

    .line 11
    .line 12
    const/16 v3, 0x17

    .line 13
    .line 14
    invoke-direct {v2, v3}, La/rnp;-><init>(B)V

    .line 15
    .line 16
    .line 17
    new-instance v3, La/v0h0;

    .line 18
    .line 19
    invoke-direct {v3, v2, v1}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/fet;->P()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, La/ukd;->a:La/cl5;

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    new-instance v1, La/v9q;

    .line 31
    .line 32
    const/16 v2, 0x19

    .line 33
    .line 34
    invoke-direct {v1, v2}, La/v9q;-><init>(B)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 41
    .line 42
    const/16 v2, 0x180

    .line 43
    .line 44
    invoke-static {v0, v3, v1, p0, v2}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/d5r;

    .line 49
    .line 50
    return-object p0
.end method
