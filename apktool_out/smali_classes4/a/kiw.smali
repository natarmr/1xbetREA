.class public final synthetic La/kiw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/piw;


# direct methods
.method public synthetic constructor <init>(La/piw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kiw;->a:B

    iput-object p1, p0, La/kiw;->b:La/piw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kiw;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/kiw;->b:La/piw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/bem;

    .line 9
    .line 10
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/piw;->H0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/ehw;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/ehw;-><init>(La/bem;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/yhw;

    .line 31
    .line 32
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/piw;->H0()La/k3t0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    check-cast p1, La/bjw;

    .line 48
    .line 49
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/piw;->X1:La/bjw;

    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_2
    check-cast p1, La/uid;

    .line 60
    .line 61
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, La/piw;->H0()La/k3t0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance v0, La/chw;

    .line 71
    .line 72
    invoke-direct {v0, p1}, La/chw;-><init>(La/uid;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
