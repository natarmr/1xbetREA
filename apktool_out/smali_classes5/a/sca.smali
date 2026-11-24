.class public final synthetic La/sca;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/pda;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/pda;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/sca;->a:B

    iput-object p1, p0, La/sca;->b:La/mm40;

    iput-object p2, p0, La/sca;->c:La/pda;

    iput-object p3, p0, La/sca;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/pda;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    iput-byte p4, p0, La/sca;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sca;->b:La/mm40;

    iput-object p2, p0, La/sca;->c:La/pda;

    iput-object p3, p0, La/sca;->d:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/sca;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, La/sca;->b:La/mm40;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/sca;->c:La/pda;

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
    if-eq p2, v2, :cond_0

    .line 25
    .line 26
    move v1, v4

    .line 27
    :cond_0
    and-int/2addr p1, v4

    .line 28
    invoke-virtual {v9, p1, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    sget-object p1, La/qmk;->a:La/zcl;

    .line 35
    .line 36
    const/high16 p1, 0x42900000    # 72.0f

    .line 37
    .line 38
    invoke-static {v3, p1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v7, v5, La/pda;->c:La/udp0;

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    iget-object v8, p0, La/sca;->d:Lkotlin/jvm/functions/Function2;

    .line 47
    .line 48
    invoke-static/range {v6 .. v11}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v9}, La/fet;->X()V

    .line 53
    .line 54
    .line 55
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    move-object v3, p1

    .line 59
    check-cast v3, La/fet;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    and-int/lit8 p2, p1, 0x3

    .line 68
    .line 69
    if-eq p2, v2, :cond_2

    .line 70
    .line 71
    move v1, v4

    .line 72
    :cond_2
    and-int/2addr p1, v4

    .line 73
    invoke-virtual {v3, p1, v1}, La/fet;->U(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget-object v1, v5, La/pda;->b:La/udp0;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    iget-object v0, p0, La/sca;->b:La/mm40;

    .line 84
    .line 85
    iget-object v2, p0, La/sca;->d:Lkotlin/jvm/functions/Function2;

    .line 86
    .line 87
    invoke-static/range {v0 .. v5}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v3}, La/fet;->X()V

    .line 92
    .line 93
    .line 94
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_1
    check-cast p1, La/fet;

    .line 98
    .line 99
    check-cast p2, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v4}, La/x8x;->L(I)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    iget-object p0, p0, La/sca;->d:Lkotlin/jvm/functions/Function2;

    .line 109
    .line 110
    invoke-static {v3, v5, p0, p1, p2}, La/o050;->h(La/mm40;La/pda;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
