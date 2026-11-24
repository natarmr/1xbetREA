.class public final synthetic La/jpd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/kpd;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/kpd;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jpd;->a:B

    iput-object p1, p0, La/jpd;->b:La/mm40;

    iput-object p2, p0, La/jpd;->c:La/kpd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/jpd;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/jpd;->c:La/kpd;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v9, p1

    .line 14
    check-cast v9, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    and-int/lit8 p2, p1, 0x3

    .line 23
    .line 24
    if-eq p2, v3, :cond_0

    .line 25
    .line 26
    move v2, v4

    .line 27
    :cond_0
    and-int/2addr p1, v4

    .line 28
    invoke-virtual {v9, p1, v2}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object v7, v5, La/kpd;->a:La/udp0;

    .line 35
    .line 36
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v1, :cond_1

    .line 41
    .line 42
    new-instance p1, La/shd;

    .line 43
    .line 44
    const/16 p2, 0x18

    .line 45
    .line 46
    invoke-direct {p1, p2}, La/shd;-><init>(B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v9, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    move-object v8, p1

    .line 53
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    const/16 v10, 0x180

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    iget-object v6, p0, La/jpd;->b:La/mm40;

    .line 59
    .line 60
    invoke-static/range {v6 .. v11}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {v9}, La/fet;->X()V

    .line 65
    .line 66
    .line 67
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_0
    check-cast p1, La/fet;

    .line 71
    .line 72
    check-cast p2, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    and-int/lit8 v0, p2, 0x3

    .line 79
    .line 80
    if-eq v0, v3, :cond_3

    .line 81
    .line 82
    move v2, v4

    .line 83
    :cond_3
    and-int/2addr p2, v4

    .line 84
    invoke-virtual {p1, p2, v2}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_5

    .line 89
    .line 90
    iget-object p2, v5, La/kpd;->b:La/udp0;

    .line 91
    .line 92
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-ne v0, v1, :cond_4

    .line 97
    .line 98
    new-instance v0, La/shd;

    .line 99
    .line 100
    const/16 v1, 0x19

    .line 101
    .line 102
    invoke-direct {v0, v1}, La/shd;-><init>(B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    move-object v2, v0

    .line 109
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 110
    .line 111
    const/16 v4, 0x180

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    iget-object v0, p0, La/jpd;->b:La/mm40;

    .line 115
    .line 116
    move-object v3, p1

    .line 117
    move-object v1, p2

    .line 118
    invoke-static/range {v0 .. v5}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    move-object v3, p1

    .line 123
    invoke-virtual {v3}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
