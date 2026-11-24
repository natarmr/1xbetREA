.class public final La/jev0;
.super La/qv5;
.source "SourceFile"


# instance fields
.field public final f:La/yn90;

.field public final g:La/b0c0;


# direct methods
.method public constructor <init>(La/yn90;La/b0c0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, La/qv5;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jev0;->f:La/yn90;

    .line 5
    .line 6
    iput-object p2, p0, La/jev0;->g:La/b0c0;

    .line 7
    .line 8
    iget-object p1, p0, La/zz3;->d:La/dp;

    .line 9
    .line 10
    new-instance p2, La/i9v0;

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-direct {p2, v0}, La/i9v0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v1, La/d4u0;

    .line 17
    .line 18
    const/16 v2, 0x1a

    .line 19
    .line 20
    invoke-direct {v1, v2}, La/d4u0;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/d8q0;

    .line 24
    .line 25
    const/16 v3, 0x1c

    .line 26
    .line 27
    invoke-direct {v2, v0, v3}, La/d8q0;-><init>(IB)V

    .line 28
    .line 29
    .line 30
    sget-object v3, La/mnu0;->g:La/mnu0;

    .line 31
    .line 32
    new-instance v4, La/gbn;

    .line 33
    .line 34
    invoke-direct {v4, p2, v2, v1, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v4}, La/dp;->b(La/gbn;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 41
    .line 42
    new-instance p1, La/i9v0;

    .line 43
    .line 44
    const/4 p2, 0x2

    .line 45
    invoke-direct {p1, p2}, La/i9v0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    new-instance p2, La/d4u0;

    .line 49
    .line 50
    const/16 v1, 0x19

    .line 51
    .line 52
    invoke-direct {p2, v1}, La/d4u0;-><init>(B)V

    .line 53
    .line 54
    .line 55
    new-instance v1, La/d8q0;

    .line 56
    .line 57
    const/16 v2, 0x1b

    .line 58
    .line 59
    invoke-direct {v1, v0, v2}, La/d8q0;-><init>(IB)V

    .line 60
    .line 61
    .line 62
    sget-object v0, La/mnu0;->f:La/mnu0;

    .line 63
    .line 64
    new-instance v2, La/gbn;

    .line 65
    .line 66
    invoke-direct {v2, p1, v1, p2, v0}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v2}, La/dp;->b(La/gbn;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
