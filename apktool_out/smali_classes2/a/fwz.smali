.class public final synthetic La/fwz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hwz;


# direct methods
.method public synthetic constructor <init>(La/hwz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fwz;->a:B

    iput-object p1, p0, La/fwz;->b:La/hwz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/fwz;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/fwz;->b:La/hwz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/hwz;->L1:La/a8z;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    sget-object v0, La/hwz;->N1:La/wsz;

    .line 19
    .line 20
    and-int/lit8 v0, p2, 0x3

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    move v0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v2

    .line 30
    :goto_0
    and-int/2addr p2, v3

    .line 31
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, La/k3t0;

    .line 42
    .line 43
    check-cast p2, La/i3t0;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    move-object v5, p0

    .line 54
    check-cast v5, La/k3t0;

    .line 55
    .line 56
    invoke-virtual {p1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez p0, :cond_1

    .line 65
    .line 66
    sget-object p0, La/ukd;->a:La/cl5;

    .line 67
    .line 68
    if-ne v0, p0, :cond_2

    .line 69
    .line 70
    :cond_1
    new-instance v3, La/svz;

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x1

    .line 74
    const/4 v4, 0x1

    .line 75
    const-class v6, La/k3t0;

    .line 76
    .line 77
    const-string v7, "onAction"

    .line 78
    .line 79
    const-string v8, "onAction(Ljava/lang/Object;)V"

    .line 80
    .line 81
    invoke-direct/range {v3 .. v10}, La/svz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v3

    .line 88
    :cond_2
    check-cast v0, La/jhy;

    .line 89
    .line 90
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    invoke-static {p2, v0, p1, v2}, La/ro4;->I(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 103
    .line 104
    check-cast p2, Landroid/os/Bundle;

    .line 105
    .line 106
    sget-object v0, La/hwz;->N1:La/wsz;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, La/hwz;->L1:La/a8z;

    .line 115
    .line 116
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, La/k3t0;

    .line 121
    .line 122
    sget-object p1, La/zvz;->a:La/zvz;

    .line 123
    .line 124
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
