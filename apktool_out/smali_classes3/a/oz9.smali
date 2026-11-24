.class public final La/oz9;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/qz9;


# direct methods
.method public constructor <init>(La/qz9;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/oz9;->a:La/qz9;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onOrientationChanged(I)V
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 5
    .line 6
    iget-object p0, p0, La/oz9;->a:La/qz9;

    .line 7
    .line 8
    invoke-virtual {p0}, La/qz9;->S0()La/d4a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, La/qz9;->R0()La/rz9;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, La/rz9;->k:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v0, La/d4a;->b:La/mne;

    .line 27
    .line 28
    iget-object v4, v2, La/mne;->b:La/dvj;

    .line 29
    .line 30
    new-instance v2, La/d69;

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    invoke-direct {v2, v3}, La/d69;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v5, La/c4a;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v5, p1, v0, p0, v3}, La/c4a;-><init>(ILa/d4a;FLa/yje;)V

    .line 40
    .line 41
    .line 42
    const/16 v6, 0xa

    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method
