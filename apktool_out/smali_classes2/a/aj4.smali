.class public final synthetic La/aj4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cj4;


# direct methods
.method public synthetic constructor <init>(La/cj4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aj4;->a:B

    iput-object p1, p0, La/aj4;->b:La/cj4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/aj4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/aj4;->b:La/cj4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ghk0;

    .line 9
    .line 10
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, La/hi4;

    .line 17
    .line 18
    invoke-direct {v0, p1}, La/hi4;-><init>(La/ghk0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;

    .line 28
    .line 29
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v0, La/bi4;

    .line 39
    .line 40
    invoke-direct {v0, p1}, La/bi4;-><init>(Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 50
    .line 51
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v0, La/ki4;

    .line 61
    .line 62
    invoke-direct {v0, p1}, La/ki4;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_2
    check-cast p1, La/x5q0;

    .line 72
    .line 73
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    instance-of v0, p1, La/w5q0;

    .line 79
    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p1, La/w5q0;

    .line 87
    .line 88
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v0, La/ii4;

    .line 94
    .line 95
    invoke-direct {v0, p1}, La/ii4;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_3
    check-cast p1, La/x5q0;

    .line 105
    .line 106
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    instance-of v0, p1, La/w5q0;

    .line 112
    .line 113
    if-eqz v0, :cond_1

    .line 114
    .line 115
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p1, La/w5q0;

    .line 120
    .line 121
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v0, La/ji4;

    .line 127
    .line 128
    invoke-direct {v0, p1}, La/ji4;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_4
    check-cast p1, La/iqt0;

    .line 138
    .line 139
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    new-instance v0, La/zh4;

    .line 149
    .line 150
    invoke-direct {v0, p1}, La/zh4;-><init>(La/iqt0;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
