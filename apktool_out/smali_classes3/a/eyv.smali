.class public final La/eyv;
.super La/i26;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, La/i26;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/i26;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/dp;

    .line 7
    .line 8
    new-instance v0, La/s3t;

    .line 9
    .line 10
    const/16 v1, 0x1b

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/s3t;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/dht;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-direct {v1, p1, v2}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 20
    .line 21
    .line 22
    new-instance p1, La/pkv;

    .line 23
    .line 24
    const/4 v3, 0x3

    .line 25
    invoke-direct {p1, v3, v2}, La/pkv;-><init>(IB)V

    .line 26
    .line 27
    .line 28
    sget-object v2, La/btv;->f:La/btv;

    .line 29
    .line 30
    new-instance v3, La/gbn;

    .line 31
    .line 32
    invoke-direct {v3, v0, p1, v1, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v3}, La/dp;->b(La/gbn;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
