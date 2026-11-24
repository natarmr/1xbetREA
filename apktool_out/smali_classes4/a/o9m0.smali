.class public final La/o9m0;
.super La/qv5;
.source "SourceFile"


# instance fields
.field public final f:La/nfj0;

.field public final g:La/lph0;


# direct methods
.method public constructor <init>(La/nfj0;La/lph0;La/nfj0;La/kcl0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, La/qv5;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o9m0;->f:La/nfj0;

    .line 5
    .line 6
    iput-object p2, p0, La/o9m0;->g:La/lph0;

    .line 7
    .line 8
    iget-object p1, p0, La/zz3;->d:La/dp;

    .line 9
    .line 10
    new-instance p2, La/s3t;

    .line 11
    .line 12
    const/16 v0, 0x12

    .line 13
    .line 14
    invoke-direct {p2, v0}, La/s3t;-><init>(B)V

    .line 15
    .line 16
    .line 17
    new-instance v0, La/umu;

    .line 18
    .line 19
    const/16 v1, 0x11

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/umu;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/pkv;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    const/4 v3, 0x3

    .line 28
    invoke-direct {v1, v3, v2}, La/pkv;-><init>(IB)V

    .line 29
    .line 30
    .line 31
    sget-object v2, La/fvr;->Z:La/fvr;

    .line 32
    .line 33
    new-instance v4, La/gbn;

    .line 34
    .line 35
    invoke-direct {v4, p2, v1, v0, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    invoke-virtual {p1, p2, v4}, La/dp;->a(ILa/gbn;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 43
    .line 44
    new-instance p1, La/gcl0;

    .line 45
    .line 46
    const/16 p2, 0x1d

    .line 47
    .line 48
    invoke-direct {p1, p2}, La/gcl0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    new-instance p2, La/u5l0;

    .line 52
    .line 53
    const/16 v0, 0x13

    .line 54
    .line 55
    invoke-direct {p2, p3, p4, v0}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance p3, La/asj0;

    .line 59
    .line 60
    const/16 p4, 0xa

    .line 61
    .line 62
    invoke-direct {p3, v3, p4}, La/asj0;-><init>(IB)V

    .line 63
    .line 64
    .line 65
    sget-object p4, La/wjj0;->q:La/wjj0;

    .line 66
    .line 67
    new-instance v0, La/gbn;

    .line 68
    .line 69
    invoke-direct {v0, p1, p3, p2, p4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x2

    .line 73
    invoke-virtual {p0, p1, v0}, La/dp;->a(ILa/gbn;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
