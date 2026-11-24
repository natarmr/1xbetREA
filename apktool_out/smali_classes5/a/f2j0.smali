.class public final synthetic La/f2j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w5j0;


# direct methods
.method public synthetic constructor <init>(La/w5j0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f2j0;->a:B

    iput-object p1, p0, La/f2j0;->b:La/w5j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/f2j0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/f2j0;->b:La/w5j0;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, La/w5j0;->E(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    new-instance p1, La/u2j0;

    .line 16
    .line 17
    invoke-direct {p1, p2}, La/u2j0;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/w5j0;->J(La/a3j0;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/w5j0;->r:La/eyg0;

    .line 24
    .line 25
    iget-object p0, p0, La/eyg0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/ost0;

    .line 28
    .line 29
    iget-object p0, p0, La/ost0;->a:La/ulk;

    .line 30
    .line 31
    iget-object p0, p0, La/ulk;->a:La/vwb0;

    .line 32
    .line 33
    const-string p1, "fromLineToLive"

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    new-instance p1, La/v2j0;

    .line 40
    .line 41
    invoke-direct {p1, p2}, La/v2j0;-><init>(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/w5j0;->J(La/a3j0;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/w5j0;->s:La/env;

    .line 48
    .line 49
    iget-object p0, p0, La/env;->a:La/ost0;

    .line 50
    .line 51
    iget-object p0, p0, La/ost0;->a:La/ulk;

    .line 52
    .line 53
    iget-object p0, p0, La/ulk;->a:La/vwb0;

    .line 54
    .line 55
    const-string p1, "dropOnScoreChange"

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_2
    new-instance p1, La/q2j0;

    .line 62
    .line 63
    invoke-direct {p1, p2}, La/q2j0;-><init>(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, La/w5j0;->J(La/a3j0;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, La/w5j0;->q:La/ani0;

    .line 70
    .line 71
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, La/ost0;

    .line 74
    .line 75
    iget-object p0, p0, La/ost0;->a:La/ulk;

    .line 76
    .line 77
    iget-object p0, p0, La/ulk;->a:La/vwb0;

    .line 78
    .line 79
    const-string p1, "AUTO_CLEAR_COUPON_AFTER_BET"

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_3
    new-instance p1, La/s2j0;

    .line 86
    .line 87
    invoke-direct {p1, p2}, La/s2j0;-><init>(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, La/w5j0;->J(La/a3j0;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, La/w5j0;->m:La/lpc;

    .line 94
    .line 95
    iget-object p0, p0, La/lpc;->a:La/hm7;

    .line 96
    .line 97
    iget-object p0, p0, La/hm7;->a:La/h03;

    .line 98
    .line 99
    iget-object p0, p0, La/h03;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, La/vwb0;

    .line 102
    .line 103
    const-string p1, "CLEAR_COUPON_AFTER_BET"

    .line 104
    .line 105
    invoke-virtual {p0, p1, p2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_4
    invoke-virtual {p0, p2}, La/w5j0;->D(Z)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_5
    invoke-virtual {p0, p2}, La/w5j0;->C(Z)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
