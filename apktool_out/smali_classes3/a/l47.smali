.class public final synthetic La/l47;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q47;


# direct methods
.method public synthetic constructor <init>(La/q47;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l47;->a:B

    iput-object p1, p0, La/l47;->b:La/q47;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l47;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l47;->b:La/q47;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q0h0;

    .line 9
    .line 10
    iget-object p0, p0, La/q47;->L1:La/pii;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string p0, "viewModelFactory"

    .line 19
    .line 20
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0

    .line 25
    :pswitch_0
    sget-object v0, La/q47;->U1:La/gl5;

    .line 26
    .line 27
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object v0, La/p27;->a:La/p27;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_1
    sget-object v0, La/q47;->U1:La/gl5;

    .line 40
    .line 41
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v0, La/v17;->a:La/v17;

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
    :pswitch_2
    sget-object v0, La/q47;->U1:La/gl5;

    .line 54
    .line 55
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object v0, La/u17;->a:La/u17;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_3
    sget-object v0, La/q47;->U1:La/gl5;

    .line 68
    .line 69
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object v0, La/u27;->a:La/u27;

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
    :pswitch_4
    sget-object v0, La/q47;->U1:La/gl5;

    .line 82
    .line 83
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget-object v1, La/v27;->a:La/v27;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, La/q47;->R1:La/ywq;

    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
