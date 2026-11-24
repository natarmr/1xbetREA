.class public final synthetic La/nh10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ph10;


# direct methods
.method public synthetic constructor <init>(La/ph10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nh10;->a:B

    iput-object p1, p0, La/nh10;->b:La/ph10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/nh10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/nh10;->b:La/ph10;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/ph10;->u:La/gle0;

    .line 15
    .line 16
    new-instance v3, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 17
    .line 18
    const-string v2, "rule_vip_cash_back"

    .line 19
    .line 20
    const/16 v4, 0xe

    .line 21
    .line 22
    invoke-direct {v3, v2, v4, v1, v1}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/gh10;

    .line 30
    .line 31
    iget-boolean v7, p0, La/gh10;->e:Z

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 37
    .line 38
    const v4, 0x7f1311a1

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/Throwable;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, La/i3t0;->i:La/ocj;

    .line 60
    .line 61
    iget-object v3, v2, La/ocj;->a:La/p7m0;

    .line 62
    .line 63
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-object v5, v4

    .line 71
    check-cast v5, La/gh10;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const/16 v6, 0x7f

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-static {v5, v1, v7, v6}, La/gh10;->a(La/gh10;La/jg10;ZI)La/gh10;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v3, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_0

    .line 88
    .line 89
    iget-object p0, p0, La/ph10;->x:La/duj;

    .line 90
    .line 91
    new-instance v1, La/kyz;

    .line 92
    .line 93
    const/16 v3, 0x1b

    .line 94
    .line 95
    invoke-direct {v1, v3}, La/kyz;-><init>(B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    iget-object v4, v2, La/ocj;->a:La/p7m0;

    .line 102
    .line 103
    :cond_1
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-object p1, p0

    .line 111
    check-cast p1, La/gh10;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object v1, La/gg10;->a:La/gg10;

    .line 117
    .line 118
    const/16 v2, 0xef

    .line 119
    .line 120
    invoke-static {p1, v1, v7, v2}, La/gh10;->a(La/gh10;La/jg10;ZI)La/gh10;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_1

    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
