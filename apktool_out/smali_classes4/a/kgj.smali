.class public final synthetic La/kgj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ngj;


# direct methods
.method public synthetic constructor <init>(La/ngj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kgj;->a:B

    iput-object p1, p0, La/kgj;->b:La/ngj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-byte p1, p0, La/kgj;->a:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x18

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object p0, p0, La/kgj;->b:La/ngj;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p1, La/ngj;->n2:La/usd;

    .line 13
    .line 14
    invoke-virtual {p0}, La/ngj;->W0()La/xgj;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, La/xgj;->i:Z

    .line 20
    .line 21
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v3, p0, La/xgj;->e:La/mne;

    .line 26
    .line 27
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 28
    .line 29
    new-instance v4, La/ya;

    .line 30
    .line 31
    invoke-direct {v4, p0, v2, v1}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v3, v2, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    sget-object p1, La/ngj;->n2:La/usd;

    .line 39
    .line 40
    invoke-virtual {p0}, La/ngj;->W0()La/xgj;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 p1, 0x0

    .line 45
    iput-boolean p1, p0, La/xgj;->i:Z

    .line 46
    .line 47
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object v3, p0, La/xgj;->e:La/mne;

    .line 52
    .line 53
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 54
    .line 55
    new-instance v4, La/ya;

    .line 56
    .line 57
    invoke-direct {v4, p0, v2, v1}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v3, v2, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
