.class public final synthetic La/wsb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zsb;


# direct methods
.method public synthetic constructor <init>(La/zsb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wsb;->a:B

    iput-object p1, p0, La/wsb;->b:La/zsb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wsb;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wsb;->b:La/zsb;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/x5q0;

    .line 9
    .line 10
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/w5q0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, La/rsb;

    .line 24
    .line 25
    check-cast p1, La/w5q0;

    .line 26
    .line 27
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v0, p1}, La/rsb;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, La/atb;

    .line 39
    .line 40
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string p1, "CHANGE_VALUE_BS_DIALOG_REQUEST_KEY"

    .line 46
    .line 47
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, La/qcc;->Q(Landroidx/fragment/app/Fragment;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
