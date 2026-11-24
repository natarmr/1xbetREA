.class public final synthetic La/svn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vvn0;


# direct methods
.method public synthetic constructor <init>(La/vvn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/svn0;->a:B

    iput-object p1, p0, La/svn0;->b:La/vvn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/svn0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/svn0;->b:La/vvn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 17
    .line 18
    and-int/lit8 v0, p2, 0x3

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v3

    .line 28
    :goto_0
    and-int/2addr p2, v2

    .line 29
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, La/i3t0;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, La/wxn0;

    .line 50
    .line 51
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez p0, :cond_1

    .line 64
    .line 65
    sget-object p0, La/ukd;->a:La/cl5;

    .line 66
    .line 67
    if-ne v0, p0, :cond_2

    .line 68
    .line 69
    :cond_1
    new-instance v4, La/ndn0;

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    const/16 v11, 0x17

    .line 73
    .line 74
    const/4 v5, 0x1

    .line 75
    const-class v7, La/k3t0;

    .line 76
    .line 77
    const-string v8, "onAction"

    .line 78
    .line 79
    const-string v9, "onAction(Ljava/lang/Object;)V"

    .line 80
    .line 81
    invoke-direct/range {v4 .. v11}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v4

    .line 88
    :cond_2
    check-cast v0, La/jhy;

    .line 89
    .line 90
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    invoke-static {p2, v0, p1, v3}, La/ihm0;->a(La/wxn0;Lkotlin/jvm/functions/Function1;La/fet;I)V

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
    check-cast p1, La/mxl;

    .line 103
    .line 104
    check-cast p2, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    new-instance p1, La/esn0;

    .line 120
    .line 121
    invoke-direct {p1, p2}, La/esn0;-><init>(I)V

    .line 122
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
