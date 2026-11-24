.class public final synthetic La/mop;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a8z;


# direct methods
.method public synthetic constructor <init>(La/a8z;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mop;->a:B

    iput-object p1, p0, La/mop;->b:La/a8z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mop;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mop;->b:La/a8z;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 9
    .line 10
    sget-object v0, La/lmc0;->Q1:La/mi70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/k3t0;

    .line 20
    .line 21
    sget-object p1, La/zlc0;->a:La/zlc0;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, La/uid;

    .line 30
    .line 31
    sget-object v0, La/rop;->a2:La/nek;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/k3t0;

    .line 41
    .line 42
    new-instance v0, La/ei00;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/ei00;-><init>(La/uid;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    check-cast p1, La/uid;

    .line 54
    .line 55
    sget-object v0, La/rop;->a2:La/nek;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/k3t0;

    .line 65
    .line 66
    new-instance v0, La/ihs;

    .line 67
    .line 68
    invoke-direct {v0, p1}, La/ihs;-><init>(La/uid;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_2
    check-cast p1, La/uid;

    .line 78
    .line 79
    sget-object v0, La/rop;->a2:La/nek;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/k3t0;

    .line 89
    .line 90
    new-instance v0, La/dmp;

    .line 91
    .line 92
    invoke-direct {v0, p1}, La/dmp;-><init>(La/uid;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
