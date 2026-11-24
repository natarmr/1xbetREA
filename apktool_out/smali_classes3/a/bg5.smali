.class public final La/bg5;
.super La/qv5;
.source "SourceFile"


# static fields
.field public static final f:La/ek5;

.field public static final g:La/pn20;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/bg5;->f:La/ek5;

    .line 9
    .line 10
    new-instance v0, La/pn20;

    .line 11
    .line 12
    const/16 v1, 0x14

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/pn20;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/bg5;->g:La/pn20;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/z6e;La/z6e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, La/qv5;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 5
    .line 6
    new-instance v0, La/sfc;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {v0, v1}, La/sfc;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/h6c;

    .line 14
    .line 15
    const/16 v2, 0xb

    .line 16
    .line 17
    invoke-direct {v1, p1, p2, v2}, La/h6c;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance p1, La/lq4;

    .line 21
    .line 22
    const/4 p2, 0x3

    .line 23
    const/16 v2, 0x1d

    .line 24
    .line 25
    invoke-direct {p1, p2, v2}, La/lq4;-><init>(IB)V

    .line 26
    .line 27
    .line 28
    sget-object p2, La/qja;->i:La/qja;

    .line 29
    .line 30
    new-instance v2, La/gbn;

    .line 31
    .line 32
    invoke-direct {v2, v0, p1, v1, p2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2}, La/dp;->b(La/gbn;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
