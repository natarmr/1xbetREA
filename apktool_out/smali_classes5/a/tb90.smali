.class public final synthetic La/tb90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/ugd;

.field public final synthetic d:F


# direct methods
.method public synthetic constructor <init>(La/pz40;La/ugd;FB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tb90;->a:B

    iput-object p1, p0, La/tb90;->b:La/pz40;

    iput-object p2, p0, La/tb90;->c:La/ugd;

    iput p3, p0, La/tb90;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/tb90;->a:B

    .line 2
    .line 3
    const v1, 0x799532c4

    .line 4
    .line 5
    .line 6
    iget v2, p0, La/tb90;->d:F

    .line 7
    .line 8
    iget-object v3, p0, La/tb90;->c:La/ugd;

    .line 9
    .line 10
    iget-object p0, p0, La/tb90;->b:La/pz40;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    check-cast p1, La/hcz;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/List;

    .line 26
    .line 27
    new-instance v0, La/efr0;

    .line 28
    .line 29
    const/16 v5, 0x1d

    .line 30
    .line 31
    invoke-direct {v0, v5}, La/efr0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    new-instance v6, La/xlr0;

    .line 39
    .line 40
    const/16 v7, 0x9

    .line 41
    .line 42
    invoke-direct {v6, v0, p0, v7}, La/xlr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    new-instance v0, La/vdr0;

    .line 46
    .line 47
    const/16 v7, 0xe

    .line 48
    .line 49
    invoke-direct {v0, p0, v7}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 50
    .line 51
    .line 52
    new-instance v7, La/ub90;

    .line 53
    .line 54
    invoke-direct {v7, p0, v3, v2, v4}, La/ub90;-><init>(Ljava/util/List;La/ugd;FB)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/ugd;

    .line 58
    .line 59
    invoke-direct {p0, v1, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v5, v6, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Ljava/util/List;

    .line 76
    .line 77
    new-instance v0, La/ht80;

    .line 78
    .line 79
    const/16 v5, 0x15

    .line 80
    .line 81
    invoke-direct {v0, v5}, La/ht80;-><init>(B)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    new-instance v6, La/m160;

    .line 89
    .line 90
    const/16 v7, 0x16

    .line 91
    .line 92
    invoke-direct {v6, v0, p0, v7}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    new-instance v0, La/a580;

    .line 96
    .line 97
    const/16 v7, 0x8

    .line 98
    .line 99
    invoke-direct {v0, p0, v7}, La/a580;-><init>(Ljava/util/List;B)V

    .line 100
    .line 101
    .line 102
    new-instance v7, La/ub90;

    .line 103
    .line 104
    const/4 v8, 0x0

    .line 105
    invoke-direct {v7, p0, v3, v2, v8}, La/ub90;-><init>(Ljava/util/List;La/ugd;FB)V

    .line 106
    .line 107
    .line 108
    new-instance p0, La/ugd;

    .line 109
    .line 110
    invoke-direct {p0, v1, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v5, v6, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
