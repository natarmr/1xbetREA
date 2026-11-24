.class public final synthetic La/y31;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z31;


# direct methods
.method public synthetic constructor <init>(La/z31;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y31;->a:B

    iput-object p1, p0, La/y31;->b:La/z31;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/y31;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y31;->b:La/z31;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/z31;->n2:La/jdk0;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, La/z31;->n2:La/jdk0;

    .line 18
    .line 19
    iget-object v0, p0, La/z31;->m2:La/a8z;

    .line 20
    .line 21
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/k3t0;

    .line 26
    .line 27
    sget-object v1, La/v31;->a:La/v31;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    sget-object v0, La/z31;->n2:La/jdk0;

    .line 39
    .line 40
    iget-object p0, p0, La/z31;->m2:La/a8z;

    .line 41
    .line 42
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/k3t0;

    .line 47
    .line 48
    sget-object v0, La/w31;->a:La/w31;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    sget-object v0, La/z31;->n2:La/jdk0;

    .line 57
    .line 58
    iget-object p0, p0, La/z31;->l2:La/fiu0;

    .line 59
    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_1
    const-string p0, "viewModelFactory"

    .line 64
    .line 65
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    throw p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
