.class public final synthetic La/q270;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cyu;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/cyu;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q270;->a:B

    iput-object p1, p0, La/q270;->b:La/cyu;

    iput p2, p0, La/q270;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/q270;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/q270;->b:La/cyu;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, La/cyu;->a:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, La/oct;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/16 v8, 0x1b

    .line 20
    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    iget v5, p0, La/q270;->c:I

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-static/range {v1 .. v8}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, La/q270;

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iget p0, p0, La/q270;->c:I

    .line 46
    .line 47
    invoke-direct {v0, v1, p0, v2}, La/q270;-><init>(La/cyu;IB)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
