.class public final synthetic La/eqm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hqm0;


# direct methods
.method public synthetic constructor <init>(La/hqm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eqm0;->a:B

    iput-object p1, p0, La/eqm0;->b:La/hqm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/eqm0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/eqm0;->b:La/hqm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bqm0;

    .line 9
    .line 10
    iget-object p0, p0, La/hqm0;->S1:La/b0l0;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v1, La/bqm0;->f:La/pn20;

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/zz3;-><init>(La/dtb;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/acm0;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v2}, La/acm0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/iok;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v2, p0, v3}, La/iok;-><init>(La/wyg;B)V

    .line 30
    .line 31
    .line 32
    new-instance p0, La/asj0;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    const/16 v4, 0xb

    .line 36
    .line 37
    invoke-direct {p0, v3, v4}, La/asj0;-><init>(IB)V

    .line 38
    .line 39
    .line 40
    sget-object v3, La/wjj0;->r:La/wjj0;

    .line 41
    .line 42
    new-instance v4, La/gbn;

    .line 43
    .line 44
    invoke-direct {v4, v1, p0, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 48
    .line 49
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_0
    iget-object p0, p0, La/hqm0;->M1:La/fiu0;

    .line 54
    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_0
    const-string p0, "viewModelFactory"

    .line 59
    .line 60
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    throw p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
