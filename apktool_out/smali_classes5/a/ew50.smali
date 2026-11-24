.class public final synthetic La/ew50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kw50;


# direct methods
.method public synthetic constructor <init>(La/kw50;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ew50;->a:B

    iput-object p1, p0, La/ew50;->b:La/kw50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ew50;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ew50;->b:La/kw50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/kw50;->E:La/gle0;

    .line 14
    .line 15
    new-instance v2, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 16
    .line 17
    iget-object p0, p0, La/kw50;->F:La/o24;

    .line 18
    .line 19
    iget-object p0, p0, La/o24;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/16 v3, 0xe

    .line 25
    .line 26
    invoke-direct {v2, p0, v3, v1, v1}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v1, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 33
    .line 34
    const v3, 0x7f1311a1

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    instance-of v0, p1, La/j7t0;

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    iget-object p1, p0, La/kw50;->C:La/i1w0;

    .line 59
    .line 60
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object p0, p0, La/kw50;->u:La/rek0;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance p0, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-direct {p0, v1}, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;-><init>(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 76
    .line 77
    .line 78
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-static {p1, p0, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :goto_0
    move-object v0, p0

    .line 86
    check-cast v0, La/paw;

    .line 87
    .line 88
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, La/oe50;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p0, p1}, La/kw50;->R(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
