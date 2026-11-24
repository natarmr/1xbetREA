.class public final synthetic La/z970;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:La/ca70;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;La/ca70;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z970;->a:B

    iput-object p1, p0, La/z970;->b:Landroid/app/Activity;

    iput-object p2, p0, La/z970;->c:La/ca70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/z970;->a:B

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    iget-object v2, p0, La/z970;->c:La/ca70;

    .line 6
    .line 7
    iget-object p0, p0, La/z970;->b:Landroid/app/Activity;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/ca70;->U1:La/htz;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v2}, La/ca70;->H0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/u670;->a:La/u670;

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
    :pswitch_0
    sget-object v0, La/ca70;->U1:La/htz;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v2}, La/ca70;->H0()La/k3t0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    sget-object v0, La/v670;->a:La/v670;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 57
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
