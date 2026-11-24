.class public final synthetic La/kax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tax;

.field public final synthetic c:La/y9x;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/tax;La/y9x;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/kax;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kax;->b:La/tax;

    iput-object p2, p0, La/kax;->c:La/y9x;

    iput-object p3, p0, La/kax;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(La/tax;Ljava/lang/String;La/y9x;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/kax;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kax;->b:La/tax;

    iput-object p2, p0, La/kax;->d:Ljava/lang/String;

    iput-object p3, p0, La/kax;->c:La/y9x;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/kax;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/kax;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/kax;->c:La/y9x;

    .line 6
    .line 7
    iget-object p0, p0, La/kax;->b:La/tax;

    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/tax;->s:La/bzs0;

    .line 18
    .line 19
    invoke-static {v2}, La/x9x;->T(La/y9x;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, La/bzs0;->d(ILjava/lang/String;)Lorg/xplatform/web_rules/impl/presentation/navigation/Screens$WebRulesScreen;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/tax;->r:La/gle0;

    .line 40
    .line 41
    new-instance v4, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    const/16 v3, 0xe

    .line 45
    .line 46
    invoke-direct {v4, v1, v3, v0, v0}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, La/x9x;->T(La/y9x;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v3, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
