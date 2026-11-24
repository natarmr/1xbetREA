.class public final synthetic La/rts0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tts0;


# direct methods
.method public synthetic constructor <init>(La/tts0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rts0;->a:B

    iput-object p1, p0, La/rts0;->b:La/tts0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/rts0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rts0;->b:La/tts0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    iget-object v0, p0, La/tts0;->t:La/gle0;

    .line 11
    .line 12
    new-instance v2, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 13
    .line 14
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, La/fts0;

    .line 19
    .line 20
    iget-object p0, p0, La/fts0;->g:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/16 v3, 0xe

    .line 24
    .line 25
    invoke-direct {v2, p0, v3, v1, v1}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v1, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 32
    .line 33
    const v3, 0x7f1311a1

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 57
    .line 58
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 68
    .line 69
    move-object v2, v0

    .line 70
    check-cast v2, La/fts0;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    const/16 v8, 0xf7

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    const-wide/16 v4, 0x0

    .line 80
    .line 81
    const/4 v6, 0x1

    .line 82
    invoke-static/range {v2 .. v8}, La/fts0;->a(La/fts0;La/its0;JZLjava/lang/String;I)La/fts0;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
