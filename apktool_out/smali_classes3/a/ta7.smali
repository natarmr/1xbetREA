.class public final synthetic La/ta7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wa7;


# direct methods
.method public synthetic constructor <init>(La/wa7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ta7;->a:B

    iput-object p1, p0, La/ta7;->b:La/wa7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ta7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ta7;->b:La/wa7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 9
    .line 10
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/o97;->a:La/o97;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 23
    .line 24
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/ja7;->a:La/ja7;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 37
    .line 38
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, La/ca7;->a:La/ca7;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 51
    .line 52
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v1, La/da7;->a:La/da7;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, La/wa7;->R1:La/ywq;

    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_3
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 70
    .line 71
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object v0, La/u97;->a:La/u97;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_4
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 84
    .line 85
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    sget-object v0, La/q97;->a:La/q97;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_5
    new-instance v0, La/q0h0;

    .line 98
    .line 99
    iget-object p0, p0, La/wa7;->N1:La/x9i;

    .line 100
    .line 101
    if-eqz p0, :cond_0

    .line 102
    .line 103
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_0
    const-string p0, "viewModelFactory"

    .line 108
    .line 109
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    throw p0

    .line 114
    :pswitch_6
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 115
    .line 116
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    sget-object v0, La/x97;->a:La/x97;

    .line 121
    .line 122
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_7
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 129
    .line 130
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    sget-object v0, La/p97;->a:La/p97;

    .line 135
    .line 136
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
