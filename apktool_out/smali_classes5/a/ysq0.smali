.class public final synthetic La/ysq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xtq0;


# direct methods
.method public synthetic constructor <init>(La/xtq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ysq0;->a:B

    iput-object p1, p0, La/ysq0;->b:La/xtq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ysq0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ysq0;->b:La/xtq0;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/xtq0;->C0:La/ol60;

    .line 19
    .line 20
    new-instance v0, La/ftq0;

    .line 21
    .line 22
    sget-object v1, La/rek0;->b:La/rek0;

    .line 23
    .line 24
    invoke-direct {v0, v1, p2}, La/ftq0;-><init>(La/sek0;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/xtq0;->C0:La/ol60;

    .line 43
    .line 44
    new-instance p1, La/ftq0;

    .line 45
    .line 46
    sget-object v0, La/pek0;->a:La/pek0;

    .line 47
    .line 48
    invoke-direct {p1, v0, p2}, La/ftq0;-><init>(La/sek0;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
