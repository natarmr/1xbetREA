.class public final synthetic La/qm60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qm60;->a:B

    iput-object p1, p0, La/qm60;->b:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    iput-boolean p2, p0, La/qm60;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qm60;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/qm60;->c:Z

    .line 4
    .line 5
    iget-object p0, p0, La/qm60;->b:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 6
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
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/c8d;

    .line 22
    .line 23
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 24
    .line 25
    xor-int/lit8 v0, v1, 0x1

    .line 26
    .line 27
    new-instance v1, La/v7d;

    .line 28
    .line 29
    invoke-direct {v1, v0, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, La/c8d;

    .line 47
    .line 48
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 49
    .line 50
    xor-int/lit8 v0, v1, 0x1

    .line 51
    .line 52
    new-instance v1, La/v7d;

    .line 53
    .line 54
    invoke-direct {v1, v0, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
