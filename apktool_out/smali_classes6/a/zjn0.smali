.class public final synthetic La/zjn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mkn0;


# direct methods
.method public synthetic constructor <init>(La/mkn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zjn0;->a:B

    iput-object p1, p0, La/zjn0;->b:La/mkn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/zjn0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zjn0;->b:La/mkn0;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/mkn0;->l:La/ys70;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, Lorg/xplatform/feature/online_call/impl/navigation/OnlineCallScreenFactoryImpl$getScreen$1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lorg/xplatform/feature/online_call/impl/navigation/OnlineCallScreenFactoryImpl$getScreen$1;-><init>(La/ys70;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/c8d;

    .line 30
    .line 31
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 32
    .line 33
    new-instance v0, La/v7d;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/mkn0;->r:La/gle0;

    .line 48
    .line 49
    new-instance v1, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    const/16 v2, 0xe

    .line 53
    .line 54
    const-string v3, "info_contact_1"

    .line 55
    .line 56
    invoke-direct {v1, v3, v2, v0, v0}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 63
    .line 64
    const v2, 0x7f130a4f

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
