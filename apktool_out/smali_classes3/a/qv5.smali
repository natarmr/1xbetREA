.class public abstract La/qv5;
.super La/zz3;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 38
    sget-object v0, La/ek5;->h:La/ek5;

    .line 39
    invoke-direct {p0, v0}, La/qv5;-><init>(La/dtb;)V

    return-void
.end method

.method public constructor <init>(La/dtb;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, La/zz3;-><init>(La/dtb;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 5
    .line 6
    new-instance p1, La/x6o;

    .line 7
    .line 8
    const/16 v0, 0x11

    .line 9
    .line 10
    invoke-direct {p1, v0}, La/x6o;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v0, La/mmn;

    .line 14
    .line 15
    const/16 v1, 0x18

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/mmn;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/e9k;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    const/16 v3, 0x14

    .line 24
    .line 25
    invoke-direct {v1, v2, v3}, La/e9k;-><init>(IB)V

    .line 26
    .line 27
    .line 28
    sget-object v2, La/gzn;->n:La/gzn;

    .line 29
    .line 30
    new-instance v3, La/gbn;

    .line 31
    .line 32
    invoke-direct {v3, p1, v1, v0, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, La/dp;->b:La/gbn;

    .line 36
    .line 37
    return-void
.end method
