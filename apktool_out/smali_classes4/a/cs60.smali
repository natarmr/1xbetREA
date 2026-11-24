.class public final synthetic La/cs60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gs60;


# direct methods
.method public synthetic constructor <init>(La/gs60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cs60;->a:B

    iput-object p1, p0, La/cs60;->b:La/gs60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/cs60;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/cs60;->b:La/gs60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/dn60;

    .line 9
    .line 10
    sget-object v0, La/gs60;->R1:La/uuz;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/up60;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/up60;-><init>(La/dn60;)V

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
    check-cast p1, Ljava/lang/Long;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    sget-object p1, La/gs60;->R1:La/uuz;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v2, p0, La/gs60;->K1:La/phf0;

    .line 43
    .line 44
    sget-object v3, La/gs60;->S1:[La/iiy;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    aget-object v3, v3, v4

    .line 48
    .line 49
    invoke-virtual {v2, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {p1, v0, v1, v2}, La/o2t;->b(Landroidx/fragment/app/e;JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance p1, La/hp60;

    .line 61
    .line 62
    invoke-direct {p1, v0, v1}, La/hp60;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_1
    check-cast p1, La/dn60;

    .line 72
    .line 73
    sget-object v0, La/gs60;->R1:La/uuz;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance v0, La/up60;

    .line 83
    .line 84
    invoke-direct {v0, p1}, La/up60;-><init>(La/dn60;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_2
    check-cast p1, La/on60;

    .line 94
    .line 95
    sget-object v0, La/gs60;->R1:La/uuz;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    new-instance v0, La/kp60;

    .line 105
    .line 106
    invoke-direct {v0, p1}, La/kp60;-><init>(La/on60;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_3
    check-cast p1, La/dn60;

    .line 116
    .line 117
    sget-object v0, La/gs60;->R1:La/uuz;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    new-instance v0, La/up60;

    .line 127
    .line 128
    invoke-direct {v0, p1}, La/up60;-><init>(La/dn60;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
