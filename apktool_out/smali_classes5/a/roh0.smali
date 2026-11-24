.class public final synthetic La/roh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iph0;


# direct methods
.method public synthetic constructor <init>(La/iph0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/roh0;->a:B

    iput-object p1, p0, La/roh0;->b:La/iph0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/roh0;->a:B

    .line 2
    .line 3
    const-wide v1, 0x7fffffffffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/roh0;->b:La/iph0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/iph0;->w()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object v0, p0, La/iph0;->D:La/p7m0;

    .line 20
    .line 21
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v3, La/o6m0;

    .line 26
    .line 27
    invoke-direct {v3, v1, v2}, La/o6m0;-><init>(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, p0, v3, v1}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_1
    iget-object v0, p0, La/iph0;->K:La/p7m0;

    .line 40
    .line 41
    new-instance v3, La/tmg0;

    .line 42
    .line 43
    const/4 v4, 0x4

    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-direct {v3, p0, v5, v4}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/s6n0;

    .line 49
    .line 50
    invoke-direct {v4, v0, v3}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 51
    .line 52
    .line 53
    new-instance v3, La/sye0;

    .line 54
    .line 55
    const/4 v6, 0x3

    .line 56
    invoke-direct {v3, p0, v5, v6}, La/sye0;-><init>(La/diu0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    new-instance v5, La/dnq;

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    invoke-direct {v5, v4, v3, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 63
    .line 64
    .line 65
    new-instance v3, La/m430;

    .line 66
    .line 67
    const/16 v4, 0x1b

    .line 68
    .line 69
    invoke-direct {v3, v5, p0, v4}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance v4, La/o6m0;

    .line 77
    .line 78
    invoke-direct {v4, v1, v2}, La/o6m0;-><init>(J)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v3, p0, v4, v0}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
