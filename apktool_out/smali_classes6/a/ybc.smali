.class public final La/ybc;
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
    new-instance v0, La/pua;

    .line 9
    .line 10
    const/16 v1, 0x1a

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/pua;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/trb;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v2, p1, v3}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/lq4;

    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    invoke-direct {p1, v3, v1}, La/lq4;-><init>(IB)V

    .line 25
    .line 26
    .line 27
    sget-object v1, La/qja;->f:La/qja;

    .line 28
    .line 29
    new-instance v3, La/gbn;

    .line 30
    .line 31
    invoke-direct {v3, v0, p1, v2, v1}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, La/dp;->b(La/gbn;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
