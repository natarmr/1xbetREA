.class public final synthetic La/mk60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pk60;


# direct methods
.method public synthetic constructor <init>(La/pk60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mk60;->a:B

    iput-object p1, p0, La/mk60;->b:La/pk60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/mk60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/mk60;->b:La/pk60;

    .line 5
    .line 6
    check-cast p1, La/k0w0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, La/pk60;->f:La/peg0;

    .line 15
    .line 16
    iget-object p0, p0, La/pk60;->k:La/ctf0;

    .line 17
    .line 18
    new-array v0, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const v1, 0x7f130b3c

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v6, 0x0

    .line 28
    const/16 v7, 0x3a

    .line 29
    .line 30
    const-wide/16 v4, 0x25

    .line 31
    .line 32
    invoke-static/range {v2 .. v7}, La/peg0;->n(La/peg0;Ljava/lang/String;JLa/hm1;I)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, La/pk60;->f:La/peg0;

    .line 46
    .line 47
    new-instance v0, La/jr1;

    .line 48
    .line 49
    new-instance v2, La/evc0;

    .line 50
    .line 51
    const-wide/16 v3, 0x0

    .line 52
    .line 53
    invoke-direct {v2, v1, v3, v4}, La/evc0;-><init>(ZJ)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, La/pk60;->e:La/kj5;

    .line 73
    .line 74
    iget-object p0, p0, La/pk60;->n:La/epi0;

    .line 75
    .line 76
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, La/xzp;

    .line 79
    .line 80
    invoke-virtual {p0}, La/xzp;->C()La/r9u;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget-object v1, La/ygp;->k1:La/ygp;

    .line 85
    .line 86
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, La/kj5;->g(Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, La/pk60;->f:La/peg0;

    .line 114
    .line 115
    iget-object p0, p0, La/pk60;->k:La/ctf0;

    .line 116
    .line 117
    new-array v0, v1, [Ljava/lang/Object;

    .line 118
    .line 119
    const v1, 0x7f13015a

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const/4 v6, 0x0

    .line 127
    const/16 v7, 0x3a

    .line 128
    .line 129
    const-wide/16 v4, 0x1

    .line 130
    .line 131
    invoke-static/range {v2 .. v7}, La/peg0;->n(La/peg0;Ljava/lang/String;JLa/hm1;I)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
