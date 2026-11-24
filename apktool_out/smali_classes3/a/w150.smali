.class public final La/w150;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/k250;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/k250;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w150;->a:B

    iput-object p1, p0, La/w150;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/w150;->c:La/k250;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/w150;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/w150;->c:La/k250;

    .line 4
    .line 5
    iget-object p0, p0, La/w150;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    check-cast p2, Ljava/lang/String;

    .line 17
    .line 18
    new-instance p2, La/w050;

    .line 19
    .line 20
    check-cast v1, La/e250;

    .line 21
    .line 22
    iget-object v0, v1, La/e250;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {p2, p1, v0}, La/w050;-><init>(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    check-cast p2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance p1, La/p150;

    .line 45
    .line 46
    check-cast v1, La/i250;

    .line 47
    .line 48
    iget-object p2, v1, La/i250;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p1, v2, v3, p2}, La/p150;-><init>(JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
