.class public final synthetic La/aag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hbg;


# direct methods
.method public synthetic constructor <init>(La/hbg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aag;->a:B

    iput-object p1, p0, La/aag;->b:La/hbg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/aag;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/aag;->b:La/hbg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/hbg;->l:La/duj;

    .line 14
    .line 15
    new-instance v0, La/jyf;

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/jyf;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La/hbg;->l:La/duj;

    .line 34
    .line 35
    new-instance v1, La/zag;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, p0, v2}, La/zag;-><init>(La/hbg;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/4 v0, 0x1

    .line 54
    if-ne p1, v0, :cond_0

    .line 55
    .line 56
    new-instance p1, La/e8g;

    .line 57
    .line 58
    const/4 v0, 0x4

    .line 59
    invoke-direct {p1, p0, v0}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 63
    .line 64
    .line 65
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
