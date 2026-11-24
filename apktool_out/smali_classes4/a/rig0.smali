.class public final synthetic La/rig0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mig0;

.field public final synthetic c:La/nkg0;


# direct methods
.method public synthetic constructor <init>(La/mig0;La/nkg0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rig0;->a:B

    iput-object p1, p0, La/rig0;->b:La/mig0;

    iput-object p2, p0, La/rig0;->c:La/nkg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mig0;La/nkg0;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/rig0;->a:B

    iput-object p1, p0, La/rig0;->b:La/mig0;

    iput-object p2, p0, La/rig0;->c:La/nkg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/rig0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/rig0;->c:La/nkg0;

    .line 7
    .line 8
    iget-object p0, p0, La/rig0;->b:La/mig0;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, v4, p1, p2}, La/pkg0;->a(La/mig0;La/nkg0;La/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p0, v4, p1, p2}, La/gfx;->n(La/mig0;La/nkg0;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    and-int/lit8 v0, p2, 0x3

    .line 48
    .line 49
    if-eq v0, v1, :cond_0

    .line 50
    .line 51
    move v0, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v0, v2

    .line 54
    :goto_0
    and-int/2addr p2, v3

    .line 55
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    iget-object p0, p0, La/mig0;->c:La/mjg0;

    .line 62
    .line 63
    iget p2, v4, La/nkg0;->f:F

    .line 64
    .line 65
    invoke-static {p0, p2, p1, v2}, La/ljg0;->a(La/mjg0;FLa/fet;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 70
    .line 71
    .line 72
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    and-int/lit8 v0, p2, 0x3

    .line 80
    .line 81
    if-eq v0, v1, :cond_2

    .line 82
    .line 83
    move v0, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    move v0, v2

    .line 86
    :goto_2
    and-int/2addr p2, v3

    .line 87
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_3

    .line 92
    .line 93
    iget-object p0, p0, La/mig0;->b:La/mjg0;

    .line 94
    .line 95
    iget p2, v4, La/nkg0;->f:F

    .line 96
    .line 97
    invoke-static {p0, p2, p1, v2}, La/ljg0;->a(La/mjg0;FLa/fet;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 102
    .line 103
    .line 104
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    and-int/lit8 v0, p2, 0x3

    .line 112
    .line 113
    if-eq v0, v1, :cond_4

    .line 114
    .line 115
    move v0, v3

    .line 116
    goto :goto_4

    .line 117
    :cond_4
    move v0, v2

    .line 118
    :goto_4
    and-int/2addr p2, v3

    .line 119
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_5

    .line 124
    .line 125
    iget-object p0, p0, La/mig0;->a:La/mjg0;

    .line 126
    .line 127
    iget p2, v4, La/nkg0;->f:F

    .line 128
    .line 129
    invoke-static {p0, p2, p1, v2}, La/ljg0;->a(La/mjg0;FLa/fet;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 134
    .line 135
    .line 136
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
