.class public final synthetic La/sk40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wk40;


# direct methods
.method public synthetic constructor <init>(La/wk40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sk40;->a:B

    iput-object p1, p0, La/sk40;->b:La/wk40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/sk40;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sk40;->b:La/wk40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, La/wk40;->x:La/ol60;

    .line 15
    .line 16
    new-instance v0, La/tk40;

    .line 17
    .line 18
    invoke-direct {v0, p1}, La/tk40;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/wk40;->w:La/p7m0;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-object v2, v1

    .line 39
    check-cast v2, La/qk40;

    .line 40
    .line 41
    iget-object v2, p0, La/wk40;->z:La/p7m0;

    .line 42
    .line 43
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/da10;

    .line 48
    .line 49
    invoke-virtual {p0, v2}, La/wk40;->w(La/da10;)La/ok40;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    iget-object p0, p0, La/wk40;->c:La/duj;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
