.class public final synthetic La/qj7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tj7;


# direct methods
.method public synthetic constructor <init>(La/tj7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qj7;->a:B

    iput-object p1, p0, La/qj7;->b:La/tj7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/qj7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qj7;->b:La/tj7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/tj7;->m2:La/phf0;

    .line 9
    .line 10
    sget-object v1, La/tj7;->u2:[La/iiy;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget-object v2, v1, v2

    .line 14
    .line 15
    invoke-virtual {v0, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, La/tj7;->n2:La/phf0;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    aget-object v1, v1, v3

    .line 23
    .line 24
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lkotlin/Pair;

    .line 29
    .line 30
    const-string v3, "BET_SALE_CONFIRM_REQUEST"

    .line 31
    .line 32
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, La/qcc;->Q(Landroidx/fragment/app/Fragment;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    sget-object v0, La/tj7;->t2:La/gl5;

    .line 53
    .line 54
    iget-object p0, p0, La/tj7;->k2:La/fiu0;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_0
    const-string p0, "viewModelFactory"

    .line 60
    .line 61
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
