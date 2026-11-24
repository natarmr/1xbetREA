.class public final La/u3m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u3m;->a:B

    iput-boolean p1, p0, La/u3m;->b:Z

    iput-object p2, p0, La/u3m;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/u3m;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/u3m;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean p0, p0, La/u3m;->b:Z

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    new-instance v3, La/abh0;

    .line 18
    .line 19
    const/16 p0, 0xb

    .line 20
    .line 21
    invoke-direct {v3, v1, p0}, La/abh0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 22
    .line 23
    .line 24
    new-instance v4, La/w7i0;

    .line 25
    .line 26
    const/4 p0, 0x6

    .line 27
    invoke-direct {v4, v1, p0}, La/w7i0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 28
    .line 29
    .line 30
    new-instance v5, La/w7i0;

    .line 31
    .line 32
    const/4 p0, 0x7

    .line 33
    invoke-direct {v5, v1, p0}, La/w7i0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 34
    .line 35
    .line 36
    new-instance v6, La/ru80;

    .line 37
    .line 38
    const/16 p0, 0xc

    .line 39
    .line 40
    invoke-direct {v6, v1, p0}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 41
    .line 42
    .line 43
    move-object v2, p1

    .line 44
    move-object v7, p2

    .line 45
    invoke-static/range {v2 .. v7}, La/bel;->e(La/hpa0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object p1, La/wne;->a:La/wne;

    .line 50
    .line 51
    if-ne p0, p1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_0
    return-object p0

    .line 57
    :pswitch_0
    move-object v2, p1

    .line 58
    move-object v7, p2

    .line 59
    new-instance p1, La/t3m;

    .line 60
    .line 61
    check-cast v1, La/pz40;

    .line 62
    .line 63
    const/4 p2, 0x0

    .line 64
    invoke-direct {p1, p0, v1, p2}, La/t3m;-><init>(ZLa/pz40;La/yje;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2, p1, v7}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    sget-object p1, La/wne;->a:La/wne;

    .line 72
    .line 73
    if-ne p0, p1, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_1
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
