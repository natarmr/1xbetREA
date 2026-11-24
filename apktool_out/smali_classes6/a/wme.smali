.class public final La/wme;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wme;->a:B

    iput-object p1, p0, La/wme;->b:Ljava/lang/Object;

    iput-object p2, p0, La/wme;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/wme;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    iget-object v2, p0, La/wme;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, La/wme;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    check-cast v2, La/elg0;

    .line 14
    .line 15
    new-instance v0, La/dff0;

    .line 16
    .line 17
    const/16 v3, 0x12

    .line 18
    .line 19
    invoke-direct {v0, p0, v2, v3}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0, p2, v1}, La/tto0;->d(La/hpa0;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, La/wne;->a:La/wne;

    .line 27
    .line 28
    if-ne p0, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    :goto_0
    return-object p0

    .line 34
    :pswitch_0
    check-cast p0, La/pz40;

    .line 35
    .line 36
    check-cast v2, La/pz40;

    .line 37
    .line 38
    new-instance v0, La/cw7;

    .line 39
    .line 40
    const/4 v3, 0x6

    .line 41
    invoke-direct {v0, p0, v2, v3}, La/cw7;-><init>(La/pz40;La/pz40;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0, p2, v1}, La/tto0;->d(La/hpa0;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    sget-object p1, La/wne;->a:La/wne;

    .line 49
    .line 50
    if-ne p0, p1, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object p0

    .line 56
    :pswitch_1
    new-instance v0, La/ah0;

    .line 57
    .line 58
    check-cast p0, La/p5q0;

    .line 59
    .line 60
    move-object v3, v2

    .line 61
    check-cast v3, La/k7q0;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x7

    .line 65
    move-object v2, p0

    .line 66
    move-object v1, p1

    .line 67
    invoke-direct/range {v0 .. v5}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, La/wne;->a:La/wne;

    .line 75
    .line 76
    if-ne p0, p1, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_2
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
