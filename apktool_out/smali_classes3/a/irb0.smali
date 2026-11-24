.class public final synthetic La/irb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/orb0;


# direct methods
.method public synthetic constructor <init>(La/orb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/irb0;->a:B

    iput-object p1, p0, La/irb0;->b:La/orb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/irb0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/irb0;->b:La/orb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/orb0;->c:La/duj;

    .line 14
    .line 15
    new-instance v1, La/r7a0;

    .line 16
    .line 17
    const/16 v2, 0xe

    .line 18
    .line 19
    invoke-direct {v1, p0, p1, v2}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, Lorg/xplatform/bet_history/history/presentation/BetHistoryScreen;

    .line 34
    .line 35
    new-instance v1, La/p57;

    .line 36
    .line 37
    iget-object v2, p0, La/orb0;->k:La/hpc;

    .line 38
    .line 39
    iget-object v2, v2, La/hpc;->a:La/rrd;

    .line 40
    .line 41
    iget-object v2, v2, La/rrd;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, La/m0w;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-wide v3, p0, La/orb0;->i:J

    .line 49
    .line 50
    const-wide/16 v5, 0x0

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct/range {v1 .. v6}, La/p57;-><init>(IJJ)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/orb0;->l:La/pru;

    .line 57
    .line 58
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 63
    .line 64
    iget-object p0, p0, La/mum0;->u:La/k77;

    .line 65
    .line 66
    invoke-direct {v0, v1, p0}, Lorg/xplatform/bet_history/history/presentation/BetHistoryScreen;-><init>(La/p57;La/k77;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, La/k0w0;->c(La/m7h0;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, La/orb0;->c:La/duj;

    .line 81
    .line 82
    new-instance v0, La/j3b0;

    .line 83
    .line 84
    const/16 v1, 0x11

    .line 85
    .line 86
    invoke-direct {v0, v1}, La/j3b0;-><init>(B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
