.class public final synthetic La/rj2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fk2;


# direct methods
.method public synthetic constructor <init>(La/fk2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rj2;->a:B

    iput-object p1, p0, La/rj2;->b:La/fk2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/rj2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/rj2;->b:La/fk2;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    check-cast p1, La/k0w0;

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
    new-instance v0, La/ak2;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1, v2}, La/ak2;-><init>(La/fk2;La/yje;B)V

    .line 18
    .line 19
    .line 20
    new-instance p0, La/b1w0;

    .line 21
    .line 22
    invoke-direct {p0, v0}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/c8d;

    .line 32
    .line 33
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 34
    .line 35
    new-instance v0, La/v7d;

    .line 36
    .line 37
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v3, p0, La/fk2;->r:La/vjp;

    .line 49
    .line 50
    sget-object v4, La/j700;->b:La/j700;

    .line 51
    .line 52
    new-instance v5, La/d8h0;

    .line 53
    .line 54
    invoke-direct {v5, v2, v1}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 55
    .line 56
    .line 57
    sget-object v6, La/xun;->a:La/xun;

    .line 58
    .line 59
    const-string v9, ""

    .line 60
    .line 61
    const-wide/16 v7, -0x1

    .line 62
    .line 63
    invoke-virtual/range {v3 .. v9}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
