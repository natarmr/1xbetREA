.class public final synthetic La/q6v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d7v0;


# direct methods
.method public synthetic constructor <init>(La/d7v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q6v0;->a:B

    iput-object p1, p0, La/q6v0;->b:La/d7v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/q6v0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/q6v0;->b:La/d7v0;

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
    iget-object p0, p0, La/d7v0;->f:La/duj;

    .line 14
    .line 15
    new-instance v0, La/b4u0;

    .line 16
    .line 17
    const/16 v1, 0x1b

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/b4u0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/d7v0;->h:La/uyn;

    .line 34
    .line 35
    iget-object p0, p0, La/uyn;->a:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance v1, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    const/16 v0, 0xe

    .line 41
    .line 42
    const-string v2, "banner_week_tournament_games"

    .line 43
    .line 44
    invoke-direct {v1, v2, v0, p0, p0}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 48
    .line 49
    const v2, 0x7f1311a1

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
