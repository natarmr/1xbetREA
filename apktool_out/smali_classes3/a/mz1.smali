.class public final synthetic La/mz1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wz1;

.field public final synthetic c:La/myr0;


# direct methods
.method public synthetic constructor <init>(La/wz1;La/myr0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mz1;->a:B

    iput-object p1, p0, La/mz1;->b:La/wz1;

    iput-object p2, p0, La/mz1;->c:La/myr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/mz1;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mz1;->c:La/myr0;

    .line 4
    .line 5
    iget-object p0, p0, La/mz1;->b:La/wz1;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, La/nz1;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1, v2}, La/nz1;-><init>(La/wz1;La/myr0;B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p0, La/a1w0;

    .line 22
    .line 23
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/c8d;

    .line 33
    .line 34
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 35
    .line 36
    new-instance v0, La/v7d;

    .line 37
    .line 38
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    new-instance v0, La/nz1;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v0, p0, v1, v3}, La/nz1;-><init>(La/wz1;La/myr0;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance p0, La/a1w0;

    .line 56
    .line 57
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, La/c8d;

    .line 67
    .line 68
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 69
    .line 70
    new-instance v0, La/v7d;

    .line 71
    .line 72
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
