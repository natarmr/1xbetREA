.class public final synthetic La/uj5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dk5;


# direct methods
.method public synthetic constructor <init>(La/dk5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uj5;->a:B

    iput-object p1, p0, La/uj5;->b:La/dk5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/uj5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/uj5;->b:La/dk5;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, La/dk5;->M(Z)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    invoke-virtual {p0}, La/dk5;->B()V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_1
    invoke-virtual {p0, v1}, La/dk5;->M(Z)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_2
    invoke-virtual {p0}, La/dk5;->a()V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_3
    invoke-virtual {p0}, La/dk5;->a()V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_4
    invoke-virtual {p0, v1}, La/dk5;->M(Z)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_5
    invoke-virtual {p0, v2}, La/dk5;->M(Z)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_6
    invoke-virtual {p0}, La/dk5;->B()V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_7
    invoke-virtual {p0}, La/dk5;->B()V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_8
    invoke-virtual {p0, v1}, La/dk5;->M(Z)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_9
    invoke-virtual {p0, v2}, La/dk5;->M(Z)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_a
    invoke-virtual {p0}, La/dk5;->a()V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_b
    invoke-virtual {p0}, La/dk5;->a()V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_c
    new-instance v0, La/ffs0;

    .line 89
    .line 90
    iget-object v1, p0, La/dk5;->s:La/h7k;

    .line 91
    .line 92
    iget-object v2, p0, La/dk5;->U:La/p7m0;

    .line 93
    .line 94
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {p0}, La/dk5;->S()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    iget-boolean v4, p0, La/dk5;->e:Z

    .line 105
    .line 106
    iget-object v5, p0, La/dk5;->c:La/l4b;

    .line 107
    .line 108
    invoke-static {v5}, La/f1t0;->e0(La/l4b;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-direct/range {v0 .. v5}, La/ffs0;-><init>(La/h7k;Ljava/util/List;ZZLjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, La/dk5;->O:La/ffs0;

    .line 116
    .line 117
    return-object v0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
