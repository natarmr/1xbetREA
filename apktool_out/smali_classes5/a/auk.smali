.class public final synthetic La/auk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cuk;


# direct methods
.method public synthetic constructor <init>(La/cuk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/auk;->a:B

    iput-object p1, p0, La/auk;->b:La/cuk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/auk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/auk;->b:La/cuk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/cuk;->l2:La/bek;

    .line 9
    .line 10
    new-instance v0, La/qd7;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, v1}, La/qd7;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    sget-object v0, La/cuk;->l2:La/bek;

    .line 18
    .line 19
    new-instance v0, La/qnk;

    .line 20
    .line 21
    new-instance v1, La/yfg;

    .line 22
    .line 23
    const/16 v2, 0x1d

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/svj;

    .line 32
    .line 33
    const/16 v2, 0x18

    .line 34
    .line 35
    invoke-direct {p0, v2}, La/svj;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/e3j;

    .line 39
    .line 40
    const/16 v3, 0x12

    .line 41
    .line 42
    invoke-direct {v2, v1, v3}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    new-instance v1, La/e9k;

    .line 46
    .line 47
    const/4 v3, 0x3

    .line 48
    const/4 v4, 0x6

    .line 49
    invoke-direct {v1, v3, v4}, La/e9k;-><init>(IB)V

    .line 50
    .line 51
    .line 52
    sget-object v3, La/zdh;->s:La/zdh;

    .line 53
    .line 54
    new-instance v4, La/gbn;

    .line 55
    .line 56
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 60
    .line 61
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_1
    new-instance v0, La/q0h0;

    .line 66
    .line 67
    iget-object p0, p0, La/cuk;->e2:La/kfi;

    .line 68
    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_0
    const-string p0, "viewModelFactory"

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    throw p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
