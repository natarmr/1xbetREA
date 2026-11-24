.class public final La/c5n;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bk30;


# direct methods
.method public synthetic constructor <init>(La/bk30;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c5n;->a:B

    iput-object p1, p0, La/c5n;->b:La/bk30;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/c5n;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/abi0;

    .line 7
    .line 8
    iget-object p0, p0, La/c5n;->b:La/bk30;

    .line 9
    .line 10
    invoke-static {p1, p0}, La/swq0;->a(La/abi0;La/bk30;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    check-cast p1, La/abi0;

    .line 17
    .line 18
    iget-object p0, p0, La/c5n;->b:La/bk30;

    .line 19
    .line 20
    invoke-static {p1, p0}, La/swq0;->a(La/abi0;La/bk30;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast p1, La/abi0;

    .line 27
    .line 28
    iget-object p0, p0, La/c5n;->b:La/bk30;

    .line 29
    .line 30
    invoke-static {p1, p0}, La/swq0;->a(La/abi0;La/bk30;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_2
    check-cast p1, La/abi0;

    .line 37
    .line 38
    iget-object p0, p0, La/c5n;->b:La/bk30;

    .line 39
    .line 40
    invoke-static {p1, p0}, La/swq0;->a(La/abi0;La/bk30;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
