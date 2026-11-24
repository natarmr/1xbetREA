.class public final synthetic La/eu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hu0;


# direct methods
.method public synthetic constructor <init>(La/hu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eu0;->a:B

    iput-object p1, p0, La/eu0;->b:La/hu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/eu0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/eu0;->b:La/hu0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/hu0;->Y1:La/rek0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/hu0;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/os0;->a:La/os0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object v0, La/hu0;->Y1:La/rek0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/hu0;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/ps0;->a:La/ps0;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    sget-object v0, La/hu0;->Y1:La/rek0;

    .line 38
    .line 39
    iget-object p0, p0, La/hu0;->U1:La/fiu0;

    .line 40
    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    const-string p0, "viewModelFactory"

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :pswitch_2
    sget-object v0, La/hu0;->Y1:La/rek0;

    .line 51
    .line 52
    invoke-static {}, La/j120;->V()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v2, 0x0

    .line 57
    new-array v2, v2, [Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p0, v0, v2}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, La/khf0;->d()La/qog0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_1
    return-object v1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
