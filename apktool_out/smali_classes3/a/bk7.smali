.class public final synthetic La/bk7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gk7;


# direct methods
.method public synthetic constructor <init>(La/gk7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bk7;->a:B

    iput-object p1, p0, La/bk7;->b:La/gk7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bk7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bk7;->b:La/gk7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/gk7;->U1:La/kl5;

    .line 9
    .line 10
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/aj7;->a:La/aj7;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/gk7;->U1:La/kl5;

    .line 23
    .line 24
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, La/bj7;->a:La/bj7;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/gk7;->S1:La/ywq;

    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_1
    sget-object v0, La/gk7;->U1:La/kl5;

    .line 42
    .line 43
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    sget-object v0, La/ni7;->a:La/ni7;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_2
    sget-object v0, La/gk7;->U1:La/kl5;

    .line 56
    .line 57
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object v0, La/hi7;->a:La/hi7;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_3
    sget-object v0, La/gk7;->U1:La/kl5;

    .line 70
    .line 71
    iget-object p0, p0, La/gk7;->M1:La/fiu0;

    .line 72
    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_0
    const-string p0, "viewModelFactory"

    .line 77
    .line 78
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    throw p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
