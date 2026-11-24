.class public final synthetic La/pyo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wpq;


# direct methods
.method public synthetic constructor <init>(La/wpq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pyo;->a:B

    iput-object p1, p0, La/pyo;->b:La/wpq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pyo;->a:B

    .line 2
    .line 3
    check-cast p1, La/jly;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/pyo;->b:La/wpq;

    .line 12
    .line 13
    invoke-static {p0}, La/wpq;->a(La/wpq;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object p0, p0, La/pyo;->b:La/wpq;

    .line 20
    .line 21
    check-cast p0, La/ypq;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    const/4 v0, 0x6

    .line 25
    invoke-virtual {p0, v0, p1}, La/ypq;->i(IZ)Z

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_1
    iget-object p0, p0, La/pyo;->b:La/wpq;

    .line 32
    .line 33
    check-cast p0, La/ypq;

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    const/4 v0, 0x6

    .line 37
    invoke-virtual {p0, v0, p1}, La/ypq;->i(IZ)Z

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
