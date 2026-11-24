.class public final synthetic La/k1l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m1l0;


# direct methods
.method public synthetic constructor <init>(La/m1l0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k1l0;->a:B

    iput-object p1, p0, La/k1l0;->b:La/m1l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/k1l0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/k1l0;->b:La/m1l0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/c1l0;

    .line 18
    .line 19
    invoke-static {v0}, La/b8k0;->Q(La/c1l0;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/c1l0;

    .line 30
    .line 31
    iget-boolean v0, v0, La/c1l0;->e:Z

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0, p1}, La/m1l0;->M(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    iget-object v0, p0, La/m1l0;->q:La/duj;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 46
    .line 47
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 57
    .line 58
    move-object v2, p1

    .line 59
    check-cast v2, La/c1l0;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    const/16 v10, 0x18f

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    invoke-static/range {v2 .. v10}, La/c1l0;->a(La/c1l0;Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;ZZZI)La/c1l0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, La/m1l0;->M(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, La/m1l0;->w:La/gle0;

    .line 103
    .line 104
    new-instance v1, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    const/16 v2, 0xe

    .line 108
    .line 109
    const-string v3, "sport_cashback_288"

    .line 110
    .line 111
    invoke-direct {v1, v3, v2, v0, v0}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 118
    .line 119
    const v2, 0x7f1311a1

    .line 120
    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
