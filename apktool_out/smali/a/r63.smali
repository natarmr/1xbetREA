.class public final La/r63;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;


# direct methods
.method public synthetic constructor <init>(La/pu90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r63;->a:B

    iput-object p1, p0, La/r63;->b:La/pu90;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r63;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/r63;->b:La/pu90;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/ou90;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, p0, v1, v1, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, La/ou90;

    .line 22
    .line 23
    invoke-static {p1, p0, v1, v1}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    check-cast p1, La/ou90;

    .line 30
    .line 31
    invoke-static {p1, p0, v1, v1}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_2
    check-cast p1, La/ou90;

    .line 38
    .line 39
    invoke-static {p1, p0, v1, v1}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
