.class public final synthetic La/j7q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r8q;


# direct methods
.method public synthetic constructor <init>(La/r8q;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j7q;->a:B

    iput-object p1, p0, La/j7q;->b:La/r8q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/j7q;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/j7q;->b:La/r8q;

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
    new-instance v0, La/k7q;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p0, v1}, La/k7q;-><init>(La/r8q;B)V

    .line 17
    .line 18
    .line 19
    new-instance p0, La/a1w0;

    .line 20
    .line 21
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/c8d;

    .line 31
    .line 32
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 33
    .line 34
    new-instance v0, La/v7d;

    .line 35
    .line 36
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/r8q;->F:La/duj;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, La/r8q;->F:La/duj;

    .line 63
    .line 64
    new-instance v1, La/f5o;

    .line 65
    .line 66
    const/16 v2, 0x18

    .line 67
    .line 68
    invoke-direct {v1, p0, v2}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
