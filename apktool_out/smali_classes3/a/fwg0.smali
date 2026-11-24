.class public final synthetic La/fwg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dxg0;


# direct methods
.method public synthetic constructor <init>(La/dxg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fwg0;->a:B

    iput-object p1, p0, La/fwg0;->b:La/dxg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/fwg0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/fwg0;->b:La/dxg0;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v3, p2

    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of p2, p1, La/alx;

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of p1, p1, La/zhi0;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    :goto_0
    new-instance p1, La/pvg0;

    .line 29
    .line 30
    sget-object v1, La/rek0;->b:La/rek0;

    .line 31
    .line 32
    new-instance v0, La/xdk0;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/16 v7, 0x78

    .line 36
    .line 37
    const-string v2, ""

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v0}, La/pvg0;-><init>(La/xdk0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    move-object v2, p2

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p1, La/pvg0;

    .line 63
    .line 64
    sget-object v1, La/rek0;->b:La/rek0;

    .line 65
    .line 66
    new-instance v0, La/xdk0;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    const/16 v7, 0x7c

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v5, 0x0

    .line 74
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v0}, La/pvg0;-><init>(La/xdk0;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
