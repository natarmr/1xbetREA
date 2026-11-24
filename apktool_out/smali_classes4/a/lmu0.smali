.class public final synthetic La/lmu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nmu0;


# direct methods
.method public synthetic constructor <init>(La/nmu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lmu0;->a:B

    iput-object p1, p0, La/lmu0;->b:La/nmu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/lmu0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/lmu0;->b:La/nmu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    sget-object v0, La/nmu0;->O1:La/svs0;

    .line 15
    .line 16
    invoke-virtual {v1}, La/nmu0;->H0()La/k3t0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/dm2;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, La/dm2;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/uid;

    .line 32
    .line 33
    sget-object p0, La/nmu0;->O1:La/svs0;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, La/nmu0;->H0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v0, La/jm2;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/jm2;-><init>(La/uid;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object p0, La/nmu0;->O1:La/svs0;

    .line 59
    .line 60
    invoke-virtual {v1}, La/nmu0;->H0()La/k3t0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    sget-object p1, La/nm2;->a:La/nm2;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_2
    check-cast p1, La/lwk;

    .line 73
    .line 74
    sget-object v0, La/nmu0;->O1:La/svs0;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, La/lmu0;->b:La/nmu0;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v3, La/lmu0;

    .line 86
    .line 87
    const/4 p0, 0x3

    .line 88
    invoke-direct {v3, v2, p0}, La/lmu0;-><init>(La/nmu0;B)V

    .line 89
    .line 90
    .line 91
    new-instance v4, La/kmu0;

    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    invoke-direct {v4, v2, p0}, La/kmu0;-><init>(La/nmu0;B)V

    .line 95
    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    const/16 v6, 0x12

    .line 99
    .line 100
    invoke-static/range {v1 .. v6}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/ty2;

    .line 104
    .line 105
    const/16 p1, 0x1a

    .line 106
    .line 107
    invoke-direct {p0, v2, p1}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
