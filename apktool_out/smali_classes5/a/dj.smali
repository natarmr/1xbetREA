.class public final synthetic La/dj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wj;


# direct methods
.method public synthetic constructor <init>(La/wj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dj;->a:B

    iput-object p1, p0, La/dj;->b:La/wj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/dj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/dj;->b:La/wj;

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
    iget-object p0, p0, La/wj;->x:La/qoj0;

    .line 15
    .line 16
    new-instance v0, La/fj;

    .line 17
    .line 18
    invoke-direct {v0, p1}, La/fj;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/wj;->m:La/ivn;

    .line 33
    .line 34
    new-instance v1, La/dj;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v1, p0, v2}, La/dj;-><init>(La/wj;B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1, v1}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, La/nc;

    .line 52
    .line 53
    const/4 v1, 0x3

    .line 54
    invoke-direct {v0, p0, v1}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/a1w0;

    .line 58
    .line 59
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/c8d;

    .line 69
    .line 70
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 71
    .line 72
    new-instance v0, La/v7d;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
