.class public final synthetic La/vjb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xjb;


# direct methods
.method public synthetic constructor <init>(La/xjb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vjb;->a:B

    iput-object p1, p0, La/vjb;->b:La/xjb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vjb;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vjb;->b:La/xjb;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ojb;

    .line 9
    .line 10
    sget-object v0, La/xjb;->U1:La/kj5;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/xjb;->P1:La/a8z;

    .line 16
    .line 17
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/k3t0;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, La/uid;

    .line 30
    .line 31
    sget-object v0, La/xjb;->U1:La/kj5;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/xjb;->P1:La/a8z;

    .line 37
    .line 38
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/k3t0;

    .line 43
    .line 44
    new-instance v0, La/gjb;

    .line 45
    .line 46
    invoke-direct {v0, p1}, La/gjb;-><init>(La/uid;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
