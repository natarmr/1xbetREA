.class public final synthetic La/vip0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xip0;


# direct methods
.method public synthetic constructor <init>(La/xip0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vip0;->a:B

    iput-object p1, p0, La/vip0;->b:La/xip0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/vip0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vip0;->b:La/xip0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/xip0;->n2:La/g9m0;

    .line 9
    .line 10
    new-instance v0, La/uip0;

    .line 11
    .line 12
    new-instance v1, La/ttn0;

    .line 13
    .line 14
    const/16 v2, 0x1a

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, La/i26;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object p0, v0, La/i26;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/dp;

    .line 25
    .line 26
    new-instance v2, La/hhd;

    .line 27
    .line 28
    const/16 v3, 0x1b

    .line 29
    .line 30
    invoke-direct {v2, v3}, La/hhd;-><init>(B)V

    .line 31
    .line 32
    .line 33
    new-instance v3, La/wt;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v3, v1, v4}, La/wt;-><init>(La/ttn0;B)V

    .line 37
    .line 38
    .line 39
    new-instance v4, La/l9;

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    const/16 v6, 0x10

    .line 43
    .line 44
    invoke-direct {v4, v5, v6}, La/l9;-><init>(IB)V

    .line 45
    .line 46
    .line 47
    sget-object v7, La/m9;->r:La/m9;

    .line 48
    .line 49
    new-instance v8, La/gbn;

    .line 50
    .line 51
    invoke-direct {v8, v2, v4, v3, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v8}, La/dp;->b(La/gbn;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, La/k8e0;

    .line 58
    .line 59
    const/16 v3, 0x18

    .line 60
    .line 61
    invoke-direct {v2, v3}, La/k8e0;-><init>(B)V

    .line 62
    .line 63
    .line 64
    new-instance v3, La/wt;

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    invoke-direct {v3, v1, v4}, La/wt;-><init>(La/ttn0;B)V

    .line 68
    .line 69
    .line 70
    new-instance v1, La/o5c0;

    .line 71
    .line 72
    invoke-direct {v1, v5, v6}, La/o5c0;-><init>(IB)V

    .line 73
    .line 74
    .line 75
    sget-object v4, La/x4c0;->s:La/x4c0;

    .line 76
    .line 77
    new-instance v5, La/gbn;

    .line 78
    .line 79
    invoke-direct {v5, v2, v1, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_0
    iget-object p0, p0, La/xip0;->e2:La/fiu0;

    .line 87
    .line 88
    if-eqz p0, :cond_0

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_0
    const-string p0, "viewModelFactory"

    .line 92
    .line 93
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x0

    .line 97
    throw p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
