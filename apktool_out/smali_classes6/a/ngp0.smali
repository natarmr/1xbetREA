.class public final La/ngp0;
.super La/i26;
.source "SourceFile"


# instance fields
.field public final g:La/yj5;


# direct methods
.method public constructor <init>(La/yj5;)V
    .locals 4

    .line 1
    invoke-direct {p0}, La/i26;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ngp0;->g:La/yj5;

    .line 5
    .line 6
    iget-object p1, p0, La/i26;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, La/dp;

    .line 9
    .line 10
    new-instance v0, La/ofo0;

    .line 11
    .line 12
    const/16 v1, 0x1d

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/ofo0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/ttn0;

    .line 18
    .line 19
    const/16 v2, 0x18

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance p0, La/asj0;

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    const/16 v3, 0x19

    .line 28
    .line 29
    invoke-direct {p0, v2, v3}, La/asj0;-><init>(IB)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/pfo0;->d:La/pfo0;

    .line 33
    .line 34
    new-instance v3, La/gbn;

    .line 35
    .line 36
    invoke-direct {v3, v0, p0, v1, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v3}, La/dp;->b(La/gbn;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
