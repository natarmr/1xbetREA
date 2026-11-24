.class public final synthetic La/tra;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xra;


# direct methods
.method public synthetic constructor <init>(La/xra;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tra;->a:B

    iput-object p1, p0, La/tra;->b:La/xra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tra;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/tra;->b:La/xra;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-object p1, La/xra;->X1:La/cl5;

    .line 15
    .line 16
    invoke-virtual {p0}, La/xra;->S0()La/k3t0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, La/dm2;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, La/dm2;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/uid;

    .line 32
    .line 33
    sget-object v0, La/xra;->X1:La/cl5;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/xra;->S0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, La/jm2;

    .line 43
    .line 44
    invoke-direct {v1, p1}, La/jm2;-><init>(La/uid;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/xra;->P0()La/k3t0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, La/sf2;

    .line 55
    .line 56
    invoke-direct {v1, p1}, La/sf2;-><init>(La/uid;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/xra;->O0()La/k3t0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance v0, La/hra;

    .line 67
    .line 68
    invoke-direct {v0, p1}, La/hra;-><init>(La/uid;)V

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
