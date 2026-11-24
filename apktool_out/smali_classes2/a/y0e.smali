.class public final synthetic La/y0e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g1e;


# direct methods
.method public synthetic constructor <init>(La/g1e;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y0e;->a:B

    iput-object p1, p0, La/y0e;->b:La/g1e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/y0e;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y0e;->b:La/g1e;

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
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/g1e;->C:La/ol60;

    .line 16
    .line 17
    new-instance p1, La/l0e;

    .line 18
    .line 19
    invoke-direct {p1, p2}, La/l0e;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/g1e;->C:La/ol60;

    .line 32
    .line 33
    new-instance p1, La/l0e;

    .line 34
    .line 35
    invoke-direct {p1, p2}, La/l0e;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
