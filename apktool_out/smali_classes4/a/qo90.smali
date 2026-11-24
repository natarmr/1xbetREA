.class public final La/qo90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qo90;->a:B

    iput-object p1, p0, La/qo90;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/qo90;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/qo90;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v3, La/elk0;

    .line 10
    .line 11
    const/16 v0, 0xb

    .line 12
    .line 13
    invoke-direct {v3, p0, v0}, La/elk0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/uck0;

    .line 17
    .line 18
    const/16 v0, 0x10

    .line 19
    .line 20
    invoke-direct {v4, p0, v0}, La/uck0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 21
    .line 22
    .line 23
    new-instance v5, La/uck0;

    .line 24
    .line 25
    const/16 v0, 0x11

    .line 26
    .line 27
    invoke-direct {v5, p0, v0}, La/uck0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 28
    .line 29
    .line 30
    new-instance v6, La/ru80;

    .line 31
    .line 32
    const/16 v0, 0xd

    .line 33
    .line 34
    invoke-direct {v6, p0, v0}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 35
    .line 36
    .line 37
    move-object v2, p1

    .line 38
    move-object v7, p2

    .line 39
    invoke-static/range {v2 .. v7}, La/bel;->e(La/hpa0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, La/wne;->a:La/wne;

    .line 44
    .line 45
    if-ne p0, p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    :goto_0
    return-object p0

    .line 51
    :pswitch_0
    move-object v2, p1

    .line 52
    move-object v7, p2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance p1, La/po90;

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    invoke-direct {p1, p0, v1, p2}, La/po90;-><init>(Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 60
    .line 61
    .line 62
    move-object p0, v2

    .line 63
    check-cast p0, La/jnn0;

    .line 64
    .line 65
    invoke-virtual {p0, v7, p1}, La/jnn0;->Z0(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, La/wne;->a:La/wne;

    .line 70
    .line 71
    if-ne p0, p1, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_1
    return-object p0

    .line 77
    :pswitch_1
    move-object v2, p1

    .line 78
    move-object v7, p2

    .line 79
    new-instance p1, La/po90;

    .line 80
    .line 81
    const/4 p2, 0x0

    .line 82
    invoke-direct {p1, p0, v1, p2}, La/po90;-><init>(Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 83
    .line 84
    .line 85
    move-object p0, v2

    .line 86
    check-cast p0, La/jnn0;

    .line 87
    .line 88
    invoke-virtual {p0, v7, p1}, La/jnn0;->Z0(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    sget-object p1, La/wne;->a:La/wne;

    .line 93
    .line 94
    if-ne p0, p1, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_2
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
