.class public final synthetic La/i3i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u3i;


# direct methods
.method public synthetic constructor <init>(La/u3i;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i3i;->a:B

    iput-object p1, p0, La/i3i;->b:La/u3i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/i3i;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object p0, p0, La/i3i;->b:La/u3i;

    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    and-int/lit8 v0, p2, 0x3

    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    move v0, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v3

    .line 27
    :goto_0
    and-int/2addr p2, v4

    .line 28
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    instance-of p2, p0, La/v3i;

    .line 35
    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    const p2, -0x75841dd9

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 42
    .line 43
    .line 44
    check-cast p0, La/v3i;

    .line 45
    .line 46
    iget-object p0, p0, La/v3i;->a:La/f2i;

    .line 47
    .line 48
    invoke-static {v1, p0, p1, v3}, La/n4c;->d(La/mm40;La/f2i;La/fet;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const p0, -0x758284ac

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {p1}, La/fet;->X()V

    .line 66
    .line 67
    .line 68
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 72
    .line 73
    if-eq v0, v2, :cond_3

    .line 74
    .line 75
    move v0, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move v0, v3

    .line 78
    :goto_2
    and-int/2addr p2, v4

    .line 79
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    instance-of p2, p0, La/v3i;

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    const p2, -0x6a47a61

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 93
    .line 94
    .line 95
    check-cast p0, La/v3i;

    .line 96
    .line 97
    iget-object p0, p0, La/v3i;->a:La/f2i;

    .line 98
    .line 99
    invoke-static {v1, p0, p1, v3}, La/n4c;->d(La/mm40;La/f2i;La/fet;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    const p0, -0x6a2e134

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 117
    .line 118
    .line 119
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
