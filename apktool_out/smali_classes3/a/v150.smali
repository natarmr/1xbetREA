.class public final La/v150;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/k250;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/k250;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v150;->a:B

    iput-object p1, p0, La/v150;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/v150;->c:La/k250;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/v150;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/v150;->c:La/k250;

    .line 4
    .line 5
    iget-object p0, p0, La/v150;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    new-instance p1, La/g150;

    .line 17
    .line 18
    check-cast v1, La/j250;

    .line 19
    .line 20
    iget-object v0, v1, La/j250;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {p1, v2, v3, v0}, La/g150;-><init>(JLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    new-instance p1, La/p150;

    .line 38
    .line 39
    check-cast v1, La/h250;

    .line 40
    .line 41
    iget-object v0, v1, La/h250;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p1, v2, v3, v0}, La/p150;-><init>(JLjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    new-instance p1, La/g150;

    .line 59
    .line 60
    check-cast v1, La/g250;

    .line 61
    .line 62
    iget-object v0, v1, La/g250;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {p1, v2, v3, v0}, La/g150;-><init>(JLjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_2
    check-cast p1, La/st0;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v0, La/g150;

    .line 79
    .line 80
    iget-wide v2, p1, La/st0;->a:J

    .line 81
    .line 82
    check-cast v1, La/a250;

    .line 83
    .line 84
    iget-object p1, v1, La/a250;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {v0, v2, v3, p1}, La/g150;-><init>(JLjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_3
    check-cast p1, La/st0;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v0, La/f150;

    .line 101
    .line 102
    iget-wide v2, p1, La/st0;->a:J

    .line 103
    .line 104
    check-cast v1, La/a250;

    .line 105
    .line 106
    iget-object p1, v1, La/a250;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-direct {v0, v2, v3, p1}, La/f150;-><init>(JLjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
